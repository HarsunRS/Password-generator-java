import java.util.Scanner;
class UI {
     public static void main(String [] args) {
        int choice;
        Scanner in = new Scanner(System.in);
        System.out.println("\n");
        System.out.println("******************************* WELCOME TO PASSWORD GENERATION PROGRAM *******************************\n");
        System.out.println("What kinda passwords are u lookin for ? \n");
        System.out.println("1 - Weak password");
        System.out.println("2 - Moderately strong password");
        System.out.println("3 - Strong password\n");
        System.out.print("Enter your choice: ");
        choice = in.nextInt();
        System.out.println("\n");
        switch(choice){
            case 1:
                Weak_password w = new Weak_password();
                w.Weak();
                break;
            case 2:
                Moderately_strong_password m = new Moderately_strong_password();
                m.Moderate();
                break;
            case 3:
                Strong_Password s = new Strong_Password();
                s.Strong();
                break;
            default:
                System.out.println("Wong Input");
        }
        System.out.println("************************************************* END **************************************************");
        in.close();
    }
}