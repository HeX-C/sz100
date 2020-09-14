package 等待唤醒机制代码优化;

public class Input implements Runnable {
    Resource r ;
    public Input(Resource r) {
        this.r = r;
    }
    public void run()
    {
        int x = 0;
        while (true)
        {
            if (x == 0) {
                r.set ("陈强盛","man") ;
            }
            else
                {
                r.set ("何星","woman") ;
                }
            x = (x + 1) % 2;
            }

        }
    }
