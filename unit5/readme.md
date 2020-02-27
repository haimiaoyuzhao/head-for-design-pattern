## 内容

这一张讲的是单件模式，即某一个类只能有一个实例化的对象，不能多。如下图，有一个私有的构造函数，同时提供一个静态的方法允许从外边获得一个实例，显然只会有一个实例。

但这段代码在多线程会出问题。

```java
public class Singleton {
	private static Singleton singleton;
	private Singleton() {
		System.out.println("new singleton");
	}
	public static Singleton getInstance() {
		if (singleton == null) {
			singleton = new Singleton();
			return singleton;
		}
		else {
			return singleton;
		}
	}
}

```

有以下三种方式改进多线程：

1. 急切模式，即事先就把这个对象new好，这样只需要调用即可。

   ```java
   package indi.zht.unit5.singleton;
   /*
    * 第三版本的单件模式，
    * 采取急切地方式，提前就new好，这样就不会出现互斥问题。
    */
   
   public class Singleton3 {
   	private static Singleton3 singleton = new Singleton3();
   	private Singleton3() {
   		System.out.println("new singleton");
   	}
   	public static Singleton3 getInstance() {
   		return singleton;
   	}
   }
   ```

   

2. 对静态方法加锁，显然这样做最耗费性能。

   ```java
   	private static Singleton2 singleton;
   	private Singleton2() {
   		System.out.println("new singleton");
   	}
   	public static synchronized Singleton2 getInstance() {
   		if (singleton == null) {
   			singleton = new Singleton2();
   			return singleton;
   		}
   		else {
   			return singleton;
   		}
   	}
   }
   ```

3. 双重检查，在上一种情况进行改进，让同步来的更晚一些；只有开始的一群线程会在判空时出现问题，而很长时间之后的线程就不会把singleton当成null了，所以我们只需要进行两个判空，并在内层判空时加锁即可。

   ```java
   public class Singleton4 {
   	private volatile static Singleton4 singleton;//加volatile，防止将singleton读入cache。
   	private Singleton4() {
   		System.out.println("new singleton");
   	}
   	public static Singleton4 getInstance() {
   		if (singleton == null) {
   			synchronized (Singleton4.class) {
   				if (singleton == null) {
   					singleton = new Singleton4();
   				}
   			}
   		}
   		return singleton;
   	}
   }
   ```

   

