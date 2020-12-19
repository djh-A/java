package local.design.singleton;

public class Singletondemo4 {

    /*
      定义私有无参构造
       */
    private Singletondemo4() {
    }

    /*
    私有静态属性
     */
    private static Singletondemo4 instance;

    /**
     * 加上 synchronized同步锁，防止线程抢占导致的null判断失效
     * todo:这样做效率不好，多线程下会导致排队情况
     *
     * @return
     */
    public static synchronized Singletondemo4 getInstance() {
        if (instance == null) {
            instance = new Singletondemo4();
        }
        return instance;
    }

}
