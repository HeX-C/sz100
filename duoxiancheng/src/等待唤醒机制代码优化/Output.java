package 等待唤醒机制代码优化;

public class Output implements  Runnable {
    Resource r ;
    public Output(Resource r) {
        this.r = r;
    }
    public void run()
    {
            while (true)
            {
                r.out();
            }
    }
}

