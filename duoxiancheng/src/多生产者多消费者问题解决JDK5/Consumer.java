package 多生产者多消费者问题解决JDK5;

public class Consumer implements Runnable {
    Resource r;
    public Consumer(Resource r) {
        this.r = r;
    }
    public void run(){
        while (true)
        {
            r.out();
        }

    }
}
