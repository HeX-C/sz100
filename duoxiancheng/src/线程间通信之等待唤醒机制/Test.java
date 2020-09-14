package 线程间通信之等待唤醒机制;

public class Test {
    public static void main(String[] args) {
        //创建资源
        Resource r = new Resource();
        //创建任务
        Input in = new Input(r);
        Output out = new Output(r);
        //创建线程
        Thread t1 = new Thread(in);
        Thread t2 = new Thread(out);
        //开启线程
        t1.start();
        t2.start();

    }
}
