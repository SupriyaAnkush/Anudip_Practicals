import java.util.Scanner;

public class ArmStrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=num1;
        int sum=0;
        while(num1>0){
            int digit=num1 % 10;
            sum=sum+(digit*digit*digit);
            num1=num1/=10;
        }
        if (sum==num2) {
            System.out.println("Number is Armstrong");
        }
        else{
            System.out.println("Number is not Armstrong");
        }

    }
}
