public class Overloading {
   public void display(int a){
     System.out.println(a);
    }
   public void display(int a,int b){
     int res=a+b;
     System.out.println(res);
    }
    public void display(double a,double b){
     double res1=a*b;
     System.err.println(res1);
}
public static void main(String[] args) {
    Overloading o=new Overloading();
    o.display(10.0,4.6);
    o.display(10,20);
    o.display(4);

}
}
