package 创建线程方式一;

public class Demo1 extends Thread{
    private String name;
    public Demo1(String name) {
        this.name = name;
    }
    public void run(){
        for (int i = 0; i <10 ; i++) {
            //for (int j = 0; j <10 ; j++) {
                System.out.println(name + ".....i=" + i + "...."+Thread.currentThread().getName());
            }
        }
}

