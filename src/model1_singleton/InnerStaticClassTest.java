package model1_singleton;

public class InnerStaticClassTest {

    public InnerStaticClassTest() {
        System.out.println("外部类构造函数已执行");
    }

    static class Inner{
        public Inner(){
            System.out.println("内部类构造函数已执行");
        }

        public static void staticMethodTest(){
            System.out.println("内部类静态方法已执行");
        }

        static{
            System.out.println("内部类静态代码块已执行");
        }
    }

    public static void main(String[] args) {
        InnerStaticClassTest innerStaticClassTest = new InnerStaticClassTest();
        System.out.println("===============分割线============");
        InnerStaticClassTest.Inner.staticMethodTest();
    }

}
