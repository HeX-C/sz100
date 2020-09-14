package 停止线程方式之定义标记;

public class Test {
    public static void main(String[] args) {
        StopThread st = new StopThread();
        Thread t1 = new Thread(st);
        Thread t2 = new Thread(st);
        t1.start();
        t2.start();
        int num = 1;
        for(;;){
            if(++num == 50){
                st.setFlag();
                break;
            }
            System.out.println("main..." + num);
        }
        System.out.println("over");

    }
}
