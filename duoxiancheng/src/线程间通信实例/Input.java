package 线程间通信实例;

public class Input implements Runnable {
    Resource r;
    public Input(Resource r) {
        this.r = r;
    }
    public void run()
    {
        int x = 0;
        while (true)
        {
            synchronized (r) {
                if (x == 0) {
                    r.name = "陈强盛";
                    r.sex = " man";
                } else {
                    r.name = "何星";
                    r.sex = "woman";
                }
            }
            x = (x + 1) % 2;
        }
    }
}