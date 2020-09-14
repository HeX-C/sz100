package 创建线程方式二;

public class Demo1 implements Runnable{
    private String name;
    public Demo1(String name) {
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

