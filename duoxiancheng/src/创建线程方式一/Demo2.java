package 创建线程方式一;

public class Demo2 extends Thread{
    private String name;
    public Demo2(String name) {
        this.name = name;
    }
    public void run(){
        show();
    }
    public void show(){
        for (int i = 0; i <10 ; i++) {
            //for (int j = 0; j <10 ; j++) {
                System.out.println(name + ".....i=" + i + "...."+Thread.currentThread().getName());
            }
        }
}

