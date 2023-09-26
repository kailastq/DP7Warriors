package com.looplogic;

public class ArmstrongFrom1to1700 {

	static void ArmStrongNumber(int num) {

		int num1 = num;
		int num2 = num;
		int count = 0;
		while (num != 0)
		{
			num /= 10;
			count++;
		}

		int sum = 0;
		while (num1 != 0)
		{
			int value = 1;
			int rem = num1 % 10;
			for (int i = 1; i <= count; i++)
			{
				value *= rem;
			}
			sum += value;
			num1 /= 10;
		}
		if (sum == num2) {
			System.out.print(sum+"  ");
		}
	}

	public static void main(String[] args) {
		for (int i = 1; i <= 1700; i++) {
			ArmStrongNumber(i);
		}
	}
}
