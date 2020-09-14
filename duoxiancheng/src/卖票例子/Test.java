package 卖票例子;

public class Test {
    public static void main(String[] args) {
        Ticket t = new Ticket();//创建一个线程任务对象
//        Ticket tt = new Ticket();//创建另一个线程任务对象
        Thread t1=new Thread(t);
        Thread t2=new Thread(t);
        Thread t3=new Thread(t);
        Thread t4=new Thread(t);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
