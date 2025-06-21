public class Oops {
    public static void main(String[] args) {
        Animal d= new Dog1();
        d.eat();
        d.sound();
        
        
    }
}
    

abstract class Animal{
    public abstract void sound();
    void eat(){
        System.out.println("Animals eats");
    }
}

 class Dog1 extends Animal{
    @Override
   public void sound(){
    System.out.println("Animal makes sound");
   }
 }
 


    



    


    

