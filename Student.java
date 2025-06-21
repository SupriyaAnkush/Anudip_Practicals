public class Student {
    String name;
    int age;
    public void printInfo(String name){
        System.out.println("Name is:"+name);

    }
    public void printInfo(int age){
        System.out.println("Age is:"+age);
    }
    public void printInfo(String name,int age){
        System.out.println("Name:"+name+"  "+"Age:"+age);
        

    }
    public static void main(String[] args) {
        Student s= new Student();
        s.printInfo("Supriya");
        s.printInfo(19);
        s.printInfo("Supriya", 19);
    }
    
}
