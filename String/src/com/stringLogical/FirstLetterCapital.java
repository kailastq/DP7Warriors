package com.stringLogical;

public class FirstLetterCapital {
	static void makefirstCapital(String str) {
		String st[] = str.split("\\s");
		System.out.println(st.length);
		for (int i = 0; i < st.length; i++) {
			char ch[] = st[i].toCharArray();

			{
				for (int j = 0; j < ch.length; j++) 
				{
					if (ch[0] >='a' && ch[0] <='z') 
					{
						ch[0] = (char) (ch[0]- 32);
					} 
					System.out.print(ch[j]+"");
					}
				System.out.print(" ");
			}
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "india is beautiful country";
		makefirstCapital(s);

	}

}
