package model1_singleton;

/**
 * 饿汉式(非延时，线程安全）   线程安全的原因是因为刚开始就加载了 所以也不存在初始化多个的线程问题
 * 基于classloader机制，避免了多线程的同步问题
 * classloader:{link http://blog.itpub.net/31561269/viewspace-2222522/}
 */
public class Singleton3 {
    private static Singleton3 singleton3 = new Singleton3();

    private Singleton3(){}

    private static Singleton3 getInstance(){
        return singleton3;
    }
}
