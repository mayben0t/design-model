package model1_singleton;

/**
 * 静态内部类的特性  详细见
 * @see model1_singleton.InnerStaticClassTest
 *
 * 懒加载，线程安全
 */
public class Singleton4 {

    private Singleton4(){}

    public static class Inner{
        private static volatile Singleton4 singleton4;
        static {
            singleton4 = new Singleton4();
        }
        public static Singleton4 getInstance(){
            return Inner.singleton4;
        }
    }
}
