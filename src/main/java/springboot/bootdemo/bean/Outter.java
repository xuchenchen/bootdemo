package springboot.bootdemo.bean;

public class Outter {
    static class  Inner{
        static int params1=5;
        static final int params2=5;
        static int params3= new Integer(5);
    }

    public static void main(String[] args) {
//        System.out.println(Inner.params1);
//        System.out.println(Inner.params2);
//        System.out.println(Inner.params3);
        
        int j=0;
//        for(int i=0;i<100;i++){
            int a=-1+ ((j++));
//            int b= (j++);
            System.out.println("a=="+a);
//            j=a;
//        }
//        System.out.println(j);
        
    }
}
