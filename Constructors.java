public class Constructors { 
    int age;
    String name;

     public Constructors() {
        System.out.println("This is Default Constructor");
     }
    
    public Constructors (int age,String name) 
    {
        this.age=age;
        this.name=name;
    }

    public void print(){
        System.out.println("Using Parametrized Constructor");
        System.out.println(this.name);
        System.out.println(this.age);
    }
     public Constructors(Constructors c3){

        this.name=c3.name;
        this.age=c3.age;
        System.out.println("Using Copy Constructor");
        System.out.println(this.name);
        System.out.println(this.age);
     }
    
   
    public static void main(String[] args) {
        Constructors c1=new Constructors();
        Constructors c2=new Constructors (19, "Supriya");
        c2.print();
        Constructors c3=new Constructors(c2);
    }
}

        
    
    

