package 多线程同步函数;

public class Test {
    public static void main(String[] args) {
        Customs c = new Customs();
        Thread t1 = new Thread(c);
        Thread t2 = new Thread(c);
        t1.start();
        t2.start();
    }
}
