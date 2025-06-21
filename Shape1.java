import java.util.Scanner;
public class Shape1 {
    public void Area(){
        System.out.println("Display Area");

    }
}
    class Traingle1 extends Shape1{
        public void Calculate(){
            System.out.println("Eneter length and breadth");
             Scanner sc=new Scanner(System.in);
             int l=sc.nextInt();
             int b=sc.nextInt();
              int result=l*b;
        System.out.println("Area of Traingle:"+result);
        }
    public static void main(String[] args) {
        Traingle1 t=new Traingle1();
        t.Area();
        t.Calculate();

    }

        }
        
        
            
    
    
    




