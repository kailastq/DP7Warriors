package com.ArrayAssignment;
import java.util.Arrays;

public class StringtoArray {

	public static class Stringtoarray {
		static void toarray(char ch[]) {

			System.out.println(ch);
			for (int i = 0; i < ch.length; i++) {
				System.out.print(ch[i] + ",");
			}

		}

		static void voweltodollar(char ch[]) {
			for (int i = 0; i < ch.length; i++) {
				if (ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u') {
					ch[i] = '$';
				}
			}
			System.out.println(Arrays.toString(ch));
		}

		static void voweltocapital(String s) {
			char ch[] = s.toCharArray();
			for (int i = 0; i < ch.length; i++) {
				if (ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u') {
					ch[i] = Character.toUpperCase(ch[i]);
				}
			}
			System.out.println(Arrays.toString(ch));
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub

			String s = "hello";
			char ch[] = s.toCharArray();

			toarray(ch);
			voweltodollar(ch);
			voweltocapital(s);

		}

	}

}
