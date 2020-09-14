package 线程间通信实例;

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
                    System.out.println(r.name + " ......." + r.sex);
                }
            }
    }
}
