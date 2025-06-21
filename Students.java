public class Students {
    String name;
    int age;
    static String clg="DYP";
    Students(String name,int age){
        this.name=name;
        this.age=age;
    

    }
    public static void main(String[] args) {
        Students s1= new Students("supriya",19);
        Students s2=new Students("Prachi",19);
        System.out.println(s1.name+"  "+s1.clg+"  "+s1.age);
        System.out.println(s2.name+"  "+s2.clg+"  "+s2.age);
    }
    
}
