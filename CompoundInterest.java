public class CompoundInterest {
    public static void main(String[] args) {
        double P = 1000;  
        double R = 10;    
        int T = 2;        

        double A = P * Math.pow((1 + R / 100), T); 
        double CI = A - P; 

        System.out.println("Compound Interest = " + CI);
    }
}
