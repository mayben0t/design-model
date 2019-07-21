package model1_singleton;

/**
 * double check锁（懒加载，线程安全)
 */
public class Singleton5 {
    //volatile保证该对象在多线程情况下的可见性，对应下面的注释
    private static volatile Singleton5 singleton5;

    private Singleton5(){}

    private static Singleton5 getInstance(){
        if(singleton5 == null) {
            synchronized (Singleton5.class) {
                //这里再校验一遍的原因是 A线程 B线程同时进来做了第一步判断，A、B都发现singleton5为null，然后A线程拿到类锁，进去实例化出了一个对象，这时B线程拿到类锁，
                //如果不加校验，则会生成一个新的对象，将A线程创建的对象给覆盖了，显然会出现线程问题
                if(singleton5 == null){
                    singleton5 = new Singleton5();
                }
            }
        }
        return singleton5;
    }

}
