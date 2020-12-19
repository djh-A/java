package local.design.singleton;

public class Singletondemo3 {

    /*
    定义私有无参构造
     */
    private Singletondemo3() {
    }

    /*
    私有静态属性
     */
    private static Singletondemo3 instance;

    public static Singletondemo3 getInstance() {
        if (instance == null) {
            /**
             * todo:多线程资源抢占时，会导致null判断失效，第一个线程进入null值区间，但还未来得及实例化对象，另一个线程也进入null值区间
             * 导致null判断无效
             */
            instance = new Singletondemo3();
        }
        return instance;
    }

}
