package local.design.singleton;

/**
 * @PACKAGE_NAME: local.design.singleton
 * @Author: djh
 * @Date: Created in 16:22 2020/12/19
 * @Description: 内部静态类实现单例，推荐，由jvm保证线程安全和性能
 */
public class Singletondemo8 {

    private Singletondemo8() {
    }

   /*
   内部静态类，实现单例
   优点：
    */
    static class getInstance {
       //由JVM保证只初始化一次
        private static Singletondemo8 instance = new Singletondemo8();
    }

    /**
     *@desc: 返回单例对象
     *@params: []
     *@return: local.design.singleton.Singletondemo8
     *@Author: djh
     *@date: 2020/12/19
     */
    public static Singletondemo8 getInstance() {
        return getInstance.instance;
    }
}
