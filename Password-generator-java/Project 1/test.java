import java.util.Random;
import java.util.Scanner;
public class test {
    public static void main(String [] args){
        int n; 
        Scanner in = new Scanner(System.in);
        System.out.println("NOTE: PASSWORDS THAT ARE 11 CHARACTERS LONG ARE USUALLY BEST FIT FOR PROTECTION AND DAILY USE");
        System.out.print("How many character long you want your password to be ?: ");
        n = in.nextInt();
        char[] password={};
        System.out.println("\n");
        System.out.print("Your strong password is: ");
        for (int i = 0; i < n; i++) {
            String alphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*()_+-=<>?/.{}|[]";
            Random r = new Random();
            char c = alphabet.charAt(r.nextInt(alphabet.length()));
            String first = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
            Random r1 = new Random();
            char f = alphabet.charAt(r.nextInt(alphabet.length()));
            String str1 = Integer.toString(f);
            String str2 = Integer.toString(c);
            System.out.print(str1+str2);
        }
    }
}
