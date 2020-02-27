## 内容

​	主要内容如下：有一家披萨制作公司，有很多种口味的披萨，比如cheese pizza, clam pizza，等等等。pizzastore里当收到一个披萨订单时，需要先new一个披萨，然后再进行相应的烘培，切块，装箱等工作。当我们想要new一个披萨时，有很多种pizza供我们选，所以最好的方式就像把这些pizza的具体实现的new的过程封装起来，像下面这样。当然这个封装可以用一个factory类来实现，当然也可以直接用一个方法来实现，当然工厂可以用一个静态工厂来实现，（即create函数设成factory类的一个静态方法）。

静态工厂与工厂模式比较：静态工厂的优点是生产物品不需要实例化该工厂，但缺点是静态工厂不能被继承。而工厂模式就可以被继承，这样带来的结果是可以符合开闭原则（对修改关闭，对扩展开放），当我们能制造出新的东西，只需要再继承一个，这样就不用去修改这头疼的if else了。

```java
	public Pizza createPizza(String type) {
		// TODO Auto-generated method stub
		if (PizzaKind.cheesePizza.equals(type)) {
			return new BJCheesePizza();
		}
		else if(PizzaKind.clamPizza.equals(type)) {
			return new BJClamPizza();
		}
		return null;
	}
```

​	

现在这个pizzastore要获得加盟店，不同加盟店的new pizza的过程、烘培、切块过程可能都有所不同，那我们就得多一些种类的pizza，如store1cheesepizza，store2cheesepizza, store1clampizza, store2clampizza，然后用store1 和store2来继承这个虚类pizzastore，如下图：

补充：工厂模式只是将new的过程给封装了，如果是烘培、切块、包装等有了很多种，可以将这些步骤封装，当然比较好的模式是用策略模式了。

![image-20200222170121331](C:\Users\haimiao\AppData\Roaming\Typora\typora-user-images\image-20200222170121331.png)

​	

​	接下来将问题简化一些，如果我们的加盟店在new pizza过程中只有原料是不同的，而bake、cut、box以及加原料的顺序都是一样的，这样我们可以建一个原料工厂，然后不同加盟店采用不同地区的原料，这样我们可以用一个接口来代码原料工厂，这就是抽象工厂。显然这样一来我们的pizza种类与上面比就减少了很多。

![image-20200222171013067](C:\Users\haimiao\AppData\Roaming\Typora\typora-user-images\image-20200222171013067.png)

**依赖倒置原则：**

**要依赖抽象，不要依赖具体类。**

**如何符合这个原则：**

- **变量不可以持有具体类的引用**
- **不要让类派生自具体类**
- **不要覆盖基类中已实现的方法**

