public class Interface {
    public static void main(String[] args) {
        Horse h=new Horse();
        h.walk();
        
    }
    
}
interface Animal1
{
public void walk();  
}
class Horse implements Animal1{                     
    @Override
   public void walk(){
        System.out.println("Horse can walk");
    }

}
