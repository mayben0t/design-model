package model1_singleton;

/**
 * 枚举实现的单例模式，因为枚举的构造方法是且只是private的，所以一定线程安全（而且支持序列化）
 */
public enum  Singleton6 {
    INSTANCE;
    Singleton6(){
    }
}
