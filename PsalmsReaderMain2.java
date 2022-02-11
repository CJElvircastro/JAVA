//Carlos Elvir
package Assignment3;


import java.io.*;
import java.util.Scanner;



/**
 * PsalmsReaderMain class - Template for Assignment-3
 * @author Carlos Elvir
 *
 */
public class PsalmsReaderMain2 {
	
	/**
	 * getReference - Parse and return only the Psalms reference
	 * @param inLine
	 * @return
	 */
	static String getReference(String inLine) {
		String ref = "";
		String[] returnBibleRef = inLine.split("\t"); //Parsing the inLine for real
		// Write some code to parse inLine for real
		// This only returns characters from position 0 to 5
		ref = returnBibleRef[0];
		return ref;
	}
	
	/**
	 * getVerse - Parse and return only the Psalms verse
	 * @param inLine
	 * @return
	 */
	static String getVerse(String inLine) {
		String ver = "";
		// Write some code to parse inLine for real
		String[] returnBibleVerse = inLine.split("\t");
		// This only returns characters from position 6 to the end
		ver = returnBibleVerse[1];
		return ver;
	}

	/**
	 * PsalmsReaderMain main() - Template for Assignment-3
	 * @param args
	 */
	public static void main(String[] args) {
		boolean end = false;
		do {
		try {
			
			int chapter = 0;
			int verse = 0;
			boolean notInt = false;
			
			
			do {
				Scanner scannedInfo = new Scanner(System.in);
				System.out.print("What Book of Psalms chapter? ");
				String obj = scannedInfo.nextLine();
				if (!obj.equals("")) {
						chapter = Integer.parseInt(obj);
						if (chapter > 0) {
							System.out.println();
							notInt = false;
							} else {
							System.out.println("Error: Chapter must be a positive integer, please start again.");
							System.out.println();
							notInt = true;
							scannedInfo.next();
					}
			}else {
					end = true;	
			}
			
			if(!end && !notInt) {
				System.out.print("What book of Psalms verse within the chapter? ");
			}
			
			if(!end && !notInt) {
				if(scannedInfo.hasNextInt()) {
					verse = scannedInfo.nextInt();
					if(verse > 0) {
						System.out.println();
						notInt = false;
						} else {
						System.out.println("Error: Verse must be a positive integer, please start again.");
						System.out.println();
						notInt = true;
						scannedInfo.next();
						}
				}else {
					System.out.println("Error: verse must be a positive Integer, please start again.");
					notInt = true;
					scannedInfo.next();
				}	
			}
		}while (notInt);
		
		if(!end) {	
				String reference = "Psalms " +chapter + ":" + verse;
			
			// Open the required text file for sequential read
			Scanner inputFile =
					new Scanner (new File("C:\\Users\\elvir\\bible-psalms.txt"));
			// Check for EOF, read the next line, and display it
			String ref = "";
			String ver = "";
			
			
			
			while (inputFile.hasNextLine() && !reference.equals(ref)) {
				String inLine = inputFile.nextLine();
				ref = getReference(inLine);
				ver = getVerse(inLine);
			}
			
			if(reference.equals(ref)) {
			System.out.println(ver);
			} else {
				System.out.println("\tERROR: This verse and chapter combination does not exist in the Book of Psalms.");
			}
			// Close the required file when EOF is reached
			inputFile.close();
		}
	}
		catch (Exception e) {
			// All Exceptions come here for graceful termination
			System.out.println("Error: Chapter must be a positive integer, please start again.");
			end = true;
		} // END try/catch
	}while (!end);
	
		System.out.println("Thank you for reading the book of Psalms!");
	} // END main
} // END class

