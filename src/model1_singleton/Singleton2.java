package model1_singleton;

/**
 * 第二种懒汉式（延时加载，线程安全)
 */
public class Singleton2 {
    // ps：因为是全局变量所以不用显示赋空值，局部变量的话则需要显示赋初始值
    private static Singleton2 singleton2;

    private Singleton2(){}

    //加了关键字synchronized,因为是静态方法，所以是类锁
    public static synchronized Singleton2 getInstance(){
        if(singleton2 == null){
            singleton2 = new Singleton2();
        }
        return singleton2;
    }


}
