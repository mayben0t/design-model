package model1_singleton;

/**
 * 第一种懒汉式(延时加载，非线程安全)
 */
public class Singleton1 {
    //①自己对象的引用,得设置为static，因为返回对象的方法是静态方法
    private static Singleton1 singleton1;
    //②私有的构造函数
    private Singleton1(){}
    //③对外暴露的获取单例的方法，静态方法，因为外部new不了对象
    public static Singleton1 getInstance(){
        if(singleton1 == null){
            singleton1 = new Singleton1();
        }
        return singleton1;
    }

}
