//	WEEK 6 ASSIGNMENT 3 - ARRAYLISTS

package week6_A3_ARRAYLISTS;

import java.util.ArrayList;
import java.util.Arrays;

public class assignment3_1to12 {

	public static void main(String[] args) {

		// 1.STARTING SMALL

		// INITIALIZING THE ARRAYLIST & REGULAR ARAY
		ArrayList<String> colors = new ArrayList<String>();
		ArrayList<String> colors2 = new ArrayList<String>();
		ArrayList<String> blankArr = new ArrayList<String>();
		String[] regArr = {"These","elements","came","from","a","regular","array"};

		// ADDING ELEMENTS (COLORS)
		colors.addAll(Arrays.asList("Red", "Green", "Orange", "White", "Black"));
		colors2.addAll(Arrays.asList("Yellow", "Blue", "Pink"));
//		blankArr.addAll(Arrays.asList("Yellow", "Blue", "Pink"))
		
		// PRINTING ARRAYLIST
		System.out.println("\nQUESTION 1 -----------------------");
		System.out.println(colors);
		System.out.println("(Printed all elements in the ArrayList)");

		// CALLING METHODS
		iterating(colors);
		updating(colors);
		removing(colors);
		searching(colors, "Red");
		sorting(colors);
		reversing(colors);
		copying(colors2,colors2Copy);
		comparing(colors);
		appending(colors, colors2);
		looping(colors);
		converting(regArr);

	}

	// 2.ITERATING : WRITE A JAVA METHOD TO ITERATE THROUGH ALL ELEMENTS IN THE
	// PREVIOUS ARRAYLIST.
	// PRINT EACH COLOR OUT IN THE FORMAT OF: "Today's Color is [color]!"
	private static void iterating(ArrayList<String> list) {
		System.out.println("\nQUESTION 2 -----------------------");
		for (String elements : list) {
			System.out.println("Today's Color is " + elements + "!");
		}
		System.out.println("(Printed all elements as a sentence)");
	}

	// 3.UPDATING : WRITE A METHOD TO CHANGE THE 5TH ELEMENT OF ARRAYLIST TO "Magenta"
	private static void updating(ArrayList<String> list) {
		System.out.println("\nQUESTION 3 -----------------------");
		list.set(4, "Magenta");
		System.out.println(list);
		System.out.println("(5th element was changed to \"Magenta\")");
	}

	// 4.REMOVING : WRITE A METHOD TO REMOVE THE THIRD ELEMENT OF YOUR ARRAYLIST
	private static void removing(ArrayList<String> list) {
		System.out.println("\nQUESTION 4 -----------------------");
		list.remove(2);
		System.out.println(list);
		System.out.println("(3rd element \"Orange\" was removed)");

	}

	// 5.SEARCHING : WRITE A METHOD TO SEARCH YOUR ARRAYLIST FOR A SPECIFIED COLOR.
	private static void searching(ArrayList<String> list, String colorToFind) {
		System.out.println("\nQUESTION 5 -----------------------");
		Boolean exists = false;
		for (String colors : list) {
			if (colorToFind.equalsIgnoreCase(colors)) {
				System.out.println(colorToFind + " was searched and found!");
				exists = true;
				break;
			}
		}
		if (exists == false) {
			System.out.println(colorToFind + " was not found in the ArrayList");
		}
		System.out.println("(Searched \"" + colorToFind + "\" in the colors ArrayList)");
	}

	// 6.SORTING : WRITE A METHOD TO SORT YOUR ARRAYLIST FROM A-Z
	private static void sorting(ArrayList<String> list) {
		System.out.println("\nQUESTION 6 -----------------------");

	}

	// 7.REVERSING : WRITE A METHOD TO REVERSE YOUR ARRAYLIST
	private static void reversing(ArrayList<String> list) {
		System.out.println("\nQUESTION 7 -----------------------");

	}

	// 8.COPYING : WRITE A METHOD THAT WILL COPY THE CONTENTS OF ONE ARRAYLIST TO
	// ANOTHER.
	private static void copying(ArrayList<String> list, ArrayList<String> blankList) {
		System.out.println("\nQUESTION 8 -----------------------");
		list.
		

	}

	// 9.COMPARING : WRITE A METHOD THAT WILL COMPARE TWO ARRAYLISTS, PRINTING OUT
	// WHICH ELEMENTS THEY HAVE IN COMMON.
	private static void comparing(ArrayList<String> list) {
		System.out.println("\nQUESTION 9 -----------------------");

	}

	// 10.APPENDING : WRITE A METHOD THAT WILL APPEND THE CONTENTS OF ONE ARRAYLIST
	// TO ANOTHER.
	private static void appending(ArrayList<String> list, ArrayList<String> list2) {
		System.out.println("\nQUESTION 10 -----------------------");
		list.addAll(list2);
		System.out.println(list);
		System.out.println("(Appended both arrays)");
	}

	// 11.LOOPING : WRITE A METHOD THAT WILL PRINT OUT EACH ELEMENT OF YOUR
	// ARRAYLIST USING A FOR-EACH LOOP.
	private static void looping(ArrayList<String> list) {
		System.out.println("\nQUESTION 11 -----------------------");
		for (String element : list) {
			System.out.println(element);
		}
		System.out.println("(Printed out all the elements in the ArrayList)");
	}

	// 12.CONVERTING : WRITE A METHOD THAT WILL CONVERT A REGULAR ARRAY TO AN
	// ARRAYLIST.
	private static void converting(String[] regularArray) {
		System.out.println("\nQUESTION 12 -----------------------");
		ArrayList<String> newArrList = new ArrayList<String>(Arrays.asList(regularArray));
		System.out.println(newArrList);
		System.out.println("(Converted a regular Array to an ArrayList)");		
	}
}
