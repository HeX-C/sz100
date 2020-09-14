package 多线程下的单例设计模式;

public class Single2 {
    private static  Single2 s = null;
    private Single2(){}
    public static Single2 getInstance() {
        if (s == null)//增加效率
        {
            synchronized (Single2.class)//增加安全性
            {
                if (s == null)
                    s = new Single2();
            }
        }
        return s;
    }
}





