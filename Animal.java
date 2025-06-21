public class Animal {
    public void sound(){
        System.out.println("Animal makes sound");
    }
    public static void main(String[] args) {
        Dog d=new Dog();
        d.sound();
        
    }
        
    }

class Dog extends Animal
{
    @Override
    public void sound(){
        System.out.println("Dog is barking");
    }


}