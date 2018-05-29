package com.cts.strinng;

public class StringPrograms {
	public boolean isEquals(String a, String b) {
		int i;
	for (i = a.length()-1; i >= 0; i--) {
				if (a.charAt(i) == b.charAt(i)) {
					return true;
				}
			}
				return false;
	}

	public String toReverseString(String s) {
		String reverse = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			reverse = reverse + s.charAt(i);
		}
		return reverse;
	}

	public boolean palindromeOrNot(String s) {
		int Word = (s.length() / 2) - 1;
		for (int i = 0, j = s.length() - 1; i < Word; i++, j--) {
			if (s.charAt(i) != s.charAt(j)) {
				return false;
			}
		}
		return true;
	}

	public int countNumberberInStrings(String s) {
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (Character.isDigit(s.charAt(i))) {
				count++;
			}
		}
		return count;
	}

	public int countLowerCase(String s) {
		int count = 0;
		for (int i = 0; i < s.length(); i++) {

			if (Character.isLowerCase(s.charAt(i))) {
				count++;
			}
		}
		return count;
	}


	public int noOfSpaceInString(String s) {
		int count = 0;
		for (int i = 0; i < s.length(); i++) {

			if (Character.isWhitespace(s.charAt(i))) {
				count++;
			}

		}
		return count;
	}

	public int noOfWords(String s) {
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ' ') {
				count += 1;
			}
			/*
			 * if (Character.isWhitespace(s.charAt(i))) { count++; }
			 */
		}
		// count += 1;
		return count;
	}

	public char[] removeSpace(char A[],int pos) {
		
		for(int i=pos;i<A.length-1;i++) {
			A[i]=A[i+1];
			
		}
		A[A.length-1]='\n';
		return A;
	}
	public String removeExtraSpace(String s) {
		/*
		 * String Word = ""; Word = Word + s.replaceAll("  ", " "); return Word;
		 *///String Word = "";
		 char f[]=s.toCharArray();
		for (int i = 0; i < f.length; i++) {
			
			if (f[i]== ' ' && f[i+1] == ' ') {
				f=removeSpace(f,i+1);
				i--;
					
			}
			//Word = 
		}
		return new String(f);
	}
}

