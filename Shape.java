public class Shape {
    public void Area(){
        System.out.println("Display Area");

    }
}
    class Traingle extends Shape
    {
        public void Calculate(int l,int b)
        {
            int result=l*b;
            System.out.println("Area of Rectangle:"+result);
        }
    
    public static void main(String[] args) {
        Traingle t = new Traingle();
        t.Area();
        t.Calculate(2,3);
    }
    
}

