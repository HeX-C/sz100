package 线程间通信之等待唤醒机制;

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
                if(r.flag )
                  try {
                      r.wait();
                  }catch (InterruptedException e){
                  }
                if (x == 0) {
                    r.name = "陈强盛";
                    r.sex = " man";
                } else {
                    r.name = "何星";
                    r.sex = "woman";
                }
                r.flag = true;
                r.notify();
            }
            x = (x + 1) % 2;
        }
    }
}