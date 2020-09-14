package 线程间通信之等待唤醒机制;

public class Output implements  Runnable {
    Resource r ;
    public Output(Resource r) {
        this.r = r;
    }
    public void run()
    {
            while (true) {
                synchronized (r)
                {
                    if(!r.flag)
                        try {
                        r.wait();
                        }catch (InterruptedException e){
                        }
                    System.out.println(r.name + " ......." + r.sex);
                        r.flag = false;
                        r.notify();
                }
            }
    }
}
