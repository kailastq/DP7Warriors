package com.AdvanceArray;

public class FindMaxFrequency {
	static void Maxfreq(int arr[]) {
		int max = 0;
		boolean flag;
		int element = 0;
		for (int i = 0; i < arr.length; i++) {
			int count = 1;
			flag = false;
			for (int j = i - 1; j >= 0; j--) {
				if (arr[i] == arr[j]) {
					flag = true;
					break;
				}
			}

			if (flag == false) {
				for (int k = i+1; k < arr.length; k++) {
					if (arr[i] == arr[k]) {
						count++;
					}
				}
				System.out.println(arr[i] + "------->" + count);
			}
			if (count > max) {
				max = count;
				element=arr[i];
			}

		}
		System.out.println("Maximum Frequency "+ element+"----->"+max);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 2, 3, 3, 4, 5, 6, 2, 6, 2, 6, 6, 2,2 };
		Maxfreq(arr);

	}

}
