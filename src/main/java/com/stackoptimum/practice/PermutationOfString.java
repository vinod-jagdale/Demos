package com.stackoptimum.practice;

public class PermutationOfString {

	static void permuteString(Character[] chrArray, int i) {
		if (i == (chrArray.length - 1)) {
			printCharacters(chrArray);
			return;
		}

		for (int j = i; j < chrArray.length; j++) {
			swap(chrArray, i, j);
			permuteString(chrArray, i + 1);
			swap(chrArray, i, j);
		}
	}

	private static void swap(Character[] chrArray, int i, int j) {
		char temp = chrArray[i];
		chrArray[i] = chrArray[j];
		chrArray[j] = temp;

	}

	private static void printCharacters(Character[] chr) {

		for (int i = 0; i < chr.length; i++) {
			System.out.print(chr[i]);
		}
		System.out.println();
	}

	public static void main(String[] args) {

		Character[] chrArray = { 'A', 'B', 'C', 'D' };
		permuteString(chrArray, 0);
	}

}
