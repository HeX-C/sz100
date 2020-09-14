package 多生产者多消费者问题;

public class Producer implements Runnable {
    Resource r;
    public Producer(Resource r) {
        this.r = r;
    }

    public void run(){
        while (true)
        {
            r.set("烤鸭");
        }

    }
}
