package com.customException;

public class BalanceException extends RuntimeException{
	
		public BalanceException()
		{
			super();
		}
		
		public BalanceException(String message)
		{
			super(message);
		}

}

