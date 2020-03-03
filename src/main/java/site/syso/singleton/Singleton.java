package site.syso.singleton;

/**
 * 懒汉式
 */
public class Singleton {

    /**
     * volatile关键字确保：
     * 当instance变量被初始化成Singleton实例时，
     * 多个线程能正确的处理instance变量。
     */
    private volatile static Singleton instance;

    private Singleton() {
    }

    /**
     * 双重检查锁
     */
    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

}
