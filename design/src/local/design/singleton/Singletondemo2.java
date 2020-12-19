package local.design.singleton;

public class Singletondemo2 {

    /*
    定义私有的无参构造方法
     */
    private Singletondemo2() {
    }
    /*
    私有静态属性
     */
    private static Singletondemo2 instance;

    //静态代码块实现
    static {
        instance = new Singletondemo2();
    }

    public static Singletondemo2 getInstance() {
        return instance;
    }
}
