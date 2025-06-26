public class ThreadImplementation {
    public static void main(String[] args) {
        MyThread t1=new MyThread();
        t1.start();
        MyRunnable m1=new MyRunnable();
        Thread t2=new Thread(m1) ;
        t2.start();       

        
    }
    
}
class MyThread extends Thread{
    public void run(){
        System.out.println("Thread is running using thread class");

    }
}


class MyRunnable implements Runnable{
    public void run(){
        System.out.println("Thrad is running using runnable interface");
    }

}
