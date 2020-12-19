package local.design.singleton;

/**
 * @PACKAGE_NAME: local.design.singleton
 * @Author: djh
 * @Date: Created in 16:00 2020/12/19
 * @Description: 防止单例被序列化破坏
 */
public class Singletondemo6 {
    /*
    定义私有无参构造
   */
    private Singletondemo6() {
    }

    /*
    私有静态属性
     */
    private static Singletondemo6 instance;

    public static Singletondemo6 getInstance() {
        if (instance == null) {
            /*
            多线程情况下，如果第一个进程进入null区间，则对Singletondemo5的class字节文件加上同步锁，保证唯一性
             */
            synchronized (Singletondemo6.class) {
                instance = new Singletondemo6();
            }
        }
        return instance;
    }

    private Object readResolve()
    {
        return instance;
    }

}
