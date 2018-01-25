package edu.gatech.oad.antlab.person;

import java.util.Random;

/**
 *  A simple class for person 2
 *  returns their name and a
 *  modified string 
 *
 * @author Jihwan Kim
 * @version 1.1
 */
public class Person2 {
    /** Holds the persons real name */
    private String name;
	 	/**
	 * The constructor, takes in the persons
	 * name
	 * @param pname the person's real name
	 */
	 public Person2(String pname) {
	   name = pname;
	 }
	/**
	 * This method should take the string
	 * input and return its characters in
	 * random order.
	 * given "gtg123b" it should return
	 * something like "g3tb1g2".
	 *
	 * @param input the string to be modified
	 * @return the modified string
	 */
	private String calc(String input) {
	    if (input == null) {
		throw new IllegalArgumentException("The input is null string and cannot be put in random order.");
	    } else {
		char charArrayInput[] = input.toCharArray();
		
		for (int i = 0; i < charArrayInput.length; i++) {
		    int j = random.nextInt(a.length);

		    char temp = charArrayInput[i];
		    charArrayInput[i] = charArrayInput[j];
		    charArrayInput[j] = temp;
		}

		String randomOrderName = "";
		for (int i = 0; i < a.length; i++) {
		    randomOrderName += a[i];
		}
		return randomOrderName;
	    }
	}
	/**
	 * Return a string rep of this object
	 * that varies with an input string
	 *
	 * @param input the varying string
	 * @return the string representing the 
	 *         object
	 */
	public String toString(String input) {
	  return name + calc(input);
	}
}
