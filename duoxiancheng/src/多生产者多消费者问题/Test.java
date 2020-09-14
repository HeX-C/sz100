package 多生产者多消费者问题;

public class Test {
    public static void main(String[] args) {
        //建立资源
        Resource r = new Resource();
        //建立任务
        Producer p = new Producer(r);
        Consumer c = new Consumer(r);
        //建立线程
        Thread t1 = new Thread(p);
        Thread t2 = new Thread(p);
        Thread t3 = new Thread(c);
        Thread t4 = new Thread(c);
        //开启线程
        t1.start();
        t2.start();
        t3.start();
        t4.start();


    }
}
