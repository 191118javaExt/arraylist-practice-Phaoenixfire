package com.revature.list;

public class MyArrayList {

	private int[] myArray = new int[5];
	private int counter = 0;

	public void add(int val) {
		/*
		 * Needs to check if the array is big enough to hold the new val. If it isn't
		 * big enough to hold the new val then it needs to make a new array that is
		 * bigger. Once the bigger array is made it needs to copy over the already
		 * filled cells to the new array
		 */
		if (myArray.length - 2 == counter) {
			int[] newArray = new int[myArray.length * 2];
			for (int i = 0; i < myArray.length; i++) {
				newArray[i] = myArray[i];
			}

			newArray[counter] = val;
			myArray = newArray;
			counter++;
		} else {
			myArray[counter] = val;
			counter++;
		}
	}

	public void set(int index, int val) {
		myArray[index] = val;

	}

	public void remove(int index) {
		int[] newArray = new int[myArray.length];
		for (int i = 0; i < index; i++) {
			newArray[i] = myArray[i];
		}
		for (int i = index + 1; i < (myArray.length); i++) {
			newArray[i] = myArray[i];
		}
		myArray = newArray;
	}

	public int get(int index) {

		return myArray[index];
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < myArray.length; i++) {
			sb.append(myArray[i] + ", ");
		}
		String newString = new String(sb);
		return newString;

	}
}
