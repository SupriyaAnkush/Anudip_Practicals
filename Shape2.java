 class Shape2 {
    public void Area(){
        System.out.println("Display Area");
    }
}



class Traingle extends Shape2
{

}
class Equilateral extends Shape2
{
    public static void main(String[] args) {
        Equilateral e=new Equilateral();
        e.Area();
    }
}

