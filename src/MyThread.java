public class MyThread extends Thread {
    public void run(){
        System.out.println("no arg method");
    }
public void run(int i){
    System.out.println("int arg method");
    }
}
class Demo{
    public static void main(String[] args) {
        MyThread t=new MyThread();
        t.start();

    }
}