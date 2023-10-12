package com.Words;

public class StringArrayComparison {

	static void uniqueString(String str1[], String str2[]) {
		boolean found;
		for (String s : str2) 
		{
			found = false;

			for (String si : str1) 
			{
				if (s.equals(si)) 
				{
					found = true;
					break;
				}
			}
			if (!found)
				System.out.println(s);

		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1[] = { "Kailash", "Shivam", "Pawan", "Anuj", "Aniket" };
		String str2[] = {  "Kailash", "Shivam", "Anil", "Anuj", "Aniket","Hrishi","Vishal" };

		uniqueString(str1, str2);
	}

}