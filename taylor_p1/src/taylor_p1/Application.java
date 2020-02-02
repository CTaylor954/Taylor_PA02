//Christopher Taylor
//Programming Assignment Problem 1 - Application.java
//January 31, 2020

package taylor_p1;

import java.util.Scanner;
public class Application 
{

	public static void main(String[] args) 
		{	
			Scanner Choice = new Scanner(System.in);
			System.out.println("Enter '0' to Encrypt, '1' to Decrypt, or '2' to EXIT:");
			
			int userChoice = Choice.nextInt();
			
			if(userChoice == 0)
				{
					Scanner userInput = new Scanner(System.in);
					System.out.println("Please enter a 4-digit number for Encryption:");
					
					int userInt = userInput.nextInt();
					userInput.close();

					if(Encrypter.encrypt(userInt)<1000 && Encrypter.encrypt(userInt) >= 100)
						{
							System.out.printf("Your number has been Encrypted.\nThe new number is: 0%d",
									Encrypter.encrypt(userInt));
						}
					else if(Encrypter.encrypt(userInt)<100 && Encrypter.encrypt(userInt) >= 10)
						{
							System.out.printf("Your number has been Encrypted.\nThe new number is: 00%d",
									Encrypter.encrypt(userInt));
						}
					else if(Encrypter.encrypt(userInt)<10 && Encrypter.encrypt(userInt) >= 1)
						{
							System.out.printf("Your number has been Encrypted.\nThe new number is: 000%d",
									Encrypter.encrypt(userInt));
						}
					else
						{
							System.out.printf("Your number has been Encrypted.\nThe new number is: %d",
									Encrypter.encrypt(userInt));
						}
				}
			else if(userChoice == 1) 
				{
					Scanner userInput = new Scanner(System.in);
					System.out.println("Please enter a 4-digit number for Decryption:");
					
					int userInt = userInput.nextInt();
					userInput.close();

					if(Decrypter.decrypt(userInt)<1000 && Decrypter.decrypt(userInt) >= 100)
						{
							System.out.printf("Your number has been Decrypted.\nThe new number is: 0%d",
									Decrypter.decrypt(userInt));
						}
					else if(Decrypter.decrypt(userInt)<100 && Decrypter.decrypt(userInt) >= 10)
						{
							System.out.printf("Your number has been Decrypted.\nThe new number is: 00%d",
									Decrypter.decrypt(userInt));
						}
					else if(Decrypter.decrypt(userInt)<10 && Decrypter.decrypt(userInt) >= 1)
						{
							System.out.printf("Your number has been Decrypted.\nThe new number is: 000%d",
									Decrypter.decrypt(userInt));
						}
					else
						{
							System.out.printf("Your number has been Decrypted.\nThe new number is: %d",
									Decrypter.decrypt(userInt));
						}
				}
			else
			{
				System.out.println("Exiting program Goodbye!");
				Choice.close();
				System.exit(0);
			}
			
		}


	
}