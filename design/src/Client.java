import local.design.singleton.Singletondemo1;
import local.design.singleton.Singletondemo2;
import local.design.singleton.Singletondemo3;

public class Client {
    public static void main(String[] args) {

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
