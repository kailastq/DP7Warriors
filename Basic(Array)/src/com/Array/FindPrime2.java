package com.Array;

public class FindPrime2 {

	static void findprime(int ar[]) {
		int count;
		// boolean status=true;

		for (int i = 0; i < ar.length; i++) {
			boolean status = true;

			// System.out.println(ar[i]);

			for (int j = 2; j < ar[i]; j++) {

				if (ar[i] % j == 0) {
					status = false;

				}

			}
			if (status == true)
			{
				System.out.println(ar[i]);
			}
		}
	}

	public static void main(String[] args) {

		int arr[] = { 2, 3, 4, 5, 6, 7 };
		findprime(arr);

	}

}