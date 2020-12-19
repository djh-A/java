package local.design.singleton;

public class Singletondemo1 {

    /*
    定义私有的无参构造方法
     */
    private Singletondemo1() {
    }

    /*
    私有静态属性
     */
    private static Singletondemo1 instance = new Singletondemo1();

    public static Singletondemo1 getInstance() {
        return instance;
    }
}
