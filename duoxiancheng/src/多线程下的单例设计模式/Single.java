package 多线程下的单例设计模式;

public class Single {
    private static final Single s = new Single();
    private Single(){}
    public static Single getInstance(){
        return s ;
    }

}
