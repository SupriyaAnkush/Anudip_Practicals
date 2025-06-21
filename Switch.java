import java.util.Scanner;
public class Switch {
    public static void main(String[] args) {
        System.out.println("Enter a any Number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        switch (n) {
            case 1:
                 System.out.println("Good Morning!");
                 break;
            case 2:
                 System.out.println("Namaste!");     
                 break;
            case 3:
                 System.out.println("Bonjour");      
                 break;
            default:
                 System.out.println("Invalid");
        }
    }
    
}
