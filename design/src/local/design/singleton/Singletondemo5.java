package local.design.singleton;

public class Singletondemo5 {
    /*
  定义私有无参构造
   */
    private Singletondemo5() {
    }

    /*
    私有静态属性,volatile:保证变量的可见性，被volatile关键字修饰的变量，如果值发生了变更，其他线程立马可见，避免出现脏读的现象。
     */
    private volatile static Singletondemo5 instance;


    public static Singletondemo5 getInstance() {
        if (instance == null) {
            /*
            多线程情况下，如果第一个进程进入null区间，则对Singletondemo5的class字节文件加上同步锁，保证唯一性,
            双重校验
             */
            synchronized (Singletondemo5.class) {
                if (instance == null) {
                    instance = new Singletondemo5();
                }
            }
        }
        return instance;
    }

}
