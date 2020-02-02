//Christopher Taylor
//Programming Assignment Problem 1 - Decrypter.java
//January 31, 2020
package taylor_p1;

public class Decrypter 
	{
	
		public static int decrypt(int encryptedInt) 
			{
			
			int first,second,third,fourth, decryptedInt;

			first = encryptedInt / 1000;
			second = (encryptedInt % 1000) / 100;
			third = (encryptedInt % 100) / 10;
			fourth = encryptedInt % 10;
		 
			first = (first + 3) % 10;
			second = (second + 3) % 10;
			third = (third + 3) % 10;
			fourth = (fourth + 3) % 10;
			
			decryptedInt = third * 1000 + fourth * 100 + first * 10 + second;
			
			return decryptedInt;
					
			}

	}
