import local.design.singleton.*;

public class Client {
    public static void main(String[] args) {

        Singletondemo1 singletondemo11 = Singletondemo1.getInstance();
        Singletondemo1 singletondemo12 = Singletondemo1.getInstance();
        System.out.println(singletondemo11 == singletondemo12);
        System.out.println("-----------------------------------");
        //方式二
        Singletondemo2 singletondemo21 = Singletondemo2.getInstance();
        Singletondemo2 singletondemo22 = Singletondemo2.getInstance();
        System.out.println(singletondemo21 == singletondemo22);
        System.out.println("-----------------------------------");
        //方式三
        Singletondemo3 singletondemo31 = Singletondemo3.getInstance();
        Singletondemo3 singletondemo32 = Singletondemo3.getInstance();
        System.out.println(singletondemo31 == singletondemo32);
        System.out.println("-----------------------------------");
        //方式四
        Singletondemo4 singletondemo41 = Singletondemo4.getInstance();
        Singletondemo4 singletondemo42 = Singletondemo4.getInstance();
        System.out.println(singletondemo41 == singletondemo42);
        System.out.println("-----------------------------------");
        //方式五
        Singletondemo5 singletondemo51 = Singletondemo5.getInstance();
        Singletondemo5 singletondemo52 = Singletondemo5.getInstance();
        System.out.println(singletondemo51 == singletondemo52);
        System.out.println("-----------------------------------");
        //方式六
        //方式七
        Singletondemo7 singletondemo71 = Singletondemo7.INSTANCE;
        Singletondemo7 singletondemo72 = Singletondemo7.INSTANCE;
        System.out.println(singletondemo71 == singletondemo72);
        System.out.println("--------------------------------");
        Singletondemo8 singletondemo81 = Singletondemo8.getInstance();
        Singletondemo8 singletondemo82 = Singletondemo8.getInstance();
        System.out.println(singletondemo81 == singletondemo82);
    }
}
