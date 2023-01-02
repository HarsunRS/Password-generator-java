import java.util.Random;
import java.util.Scanner;

public class Strong_Password {
	public void Strong(){
      int n; 
      Scanner in = new Scanner(System.in);
      System.out.println("NOTE: PASSWORDS THAT ARE 11 CHARACTERS LONG ARE USUALLY BEST FIT FOR PROTECTION AND DAILY USE");
      System.out.print("How many character long you want your password to be ?: ");
      n = in.nextInt();
      String[] password={};
      System.out.println("\n");
      System.out.print("Your strong password is: ");
      for (int i = 0; i < n; i++) {
         String alphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*()_+-=<>?/.{}|[]";
         Random r = new Random();
         char c = alphabet.charAt(r.nextInt(alphabet.length()));
         System.out.println(c);
      }
      System.out.println("\n");
      if (n<=4){
         System.out.println("Your password can be craked instantly :o");
      }
      else if (n==5){
         System.out.println("It will take 10 secs to crack your password :o");
      }
      else if (n==6){
         System.out.println("It will take 13 mins to crack your password :(");
      }
      else if (n==7){
         System.out.println("It will take 17 hrs to crack your password :(");
      }
      else if (n==8){
         System.out.println("It will take 57 days to crack your password :|");
      }
      else if (n==9){
         System.out.println("It will take 12 years to crack your password :)");
      }
      else if (n==10){
         System.out.println("It will take 928 years to crack your password :)");
      }
      else if (n==11){
         System.out.println("It will take 17,000 years to crack your password :D");
      }
      else if (n==12){
         System.out.println("It will take 5,000,000 years to crack your password :D");
      }
      else if (n==13){
         System.out.println("It will take 423,000,000 years to crack your password :D");
      }
      else if (n==14){
         System.out.println("It will take 5,000,000,000 years to crack your password :D");
      }
      else if (n==15){
         System.out.println("It will take 2,000,000,000,000 years to crack your password :D");
      }
      else{
         System.out.println("Y do u need a password this long bro ? What are u trying to hide :|");
      }
      System.out.println(password);
      in.close();
	}
}
