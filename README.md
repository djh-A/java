# java
java相关
# 设计模式-java
## 1.原则：SOLID
> 1.开闭原则：修改关闭、扩展开放
> 2.里氏替换原则：子类实现父类的方法后仍可使用
> 3.依赖倒置：依赖上层
> 4.迪米特法则：不和陌生人说话，类似代理模式
> 5.接口隔离：不需要的接口不去实现
> 6.复用原则：提高复用

### 1.饿汉式（一开始就有对象）
```java
// 方式一
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

```
```java
// 方式二
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

```
### 2.懒汉式(调用获取对象的方法时才赋值对象)
```java
// 方式三 （这种方式有缺陷，多线程抢占时，会导致instance == null 判断失效，给出方式四的解决方案）
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


```

```java
// 客户端调用
package local;

import local.design.singleton.Singletondemo1;

public class Client {
    public static void main(String[] args) {
              //方式一
        Singletondemo1 singletondemo11 = Singletondemo1.getInstance();
        Singletondemo1 singletondemo12 = Singletondemo1.getInstance();
        System.out.println(singletondemo11 == singletondemo12);
        //方式二
        Singletondemo2 singletondemo21 = Singletondemo2.getInstance();
        Singletondemo2 singletondemo22 = Singletondemo2.getInstance();
        System.out.println(singletondemo21 == singletondemo22);
        //方式三
        Singletondemo3 singletondemo31 = Singletondemo3.getInstance();
        Singletondemo3 singletondemo32 = Singletondemo3.getInstance();
        System.out.println(singletondemo31 == singletondemo32);
    }
}
```
