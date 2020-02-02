package taylor_p1;

public class Encrypter 
{
	/*Encrypter seperates the userInt,Adds 7 to each digit,divides each digit by 10 then 
	 * obtains the remainder, then swaps the (first,third) and the (second,fourth)*/
	public static int encrypt(int userInt)
		{
		 
		int first,second,third,fourth;
		int encryptedInt;
		
			first	=	userInt/1000;
			second	=	(userInt%1000)/100;
			third	=	(userInt%100)/10;
			fourth	=	userInt%10;		
	
			first	=	(first + 7)%10;
			second	=	(second + 7)%10;
			third	=	(third + 7)%10;
			fourth	=	(fourth + 7)%10;
			
			encryptedInt = ((third*1000) + (fourth*100) + (first*10) + second);
			return encryptedInt;
		}
}
