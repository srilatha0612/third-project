public class GetSet extends Thread {

}
class ThreadDem{
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        Thread.currentThread().setName("mokshashreyanshi");
        System.out.println(Thread.currentThread().getName());
    }
}
