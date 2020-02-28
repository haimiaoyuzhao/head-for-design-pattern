## 内容

模板模式：这一模式主要是来封装算法。

现在我们有tea和coffee两种饮料，每种饮料都有一个prepareRecipe方法来制作相应饮料，prepareRecipe包括先boilWater，然后brew，然后pourInCup，然后addCondiments。我们将这些公共部分提取出来，全部放到一个虚类CaffineBeverage。对于prepareRecipe这个制作算法，这个类中方法有以下三种。

1. 如果每个类在prepareRecipe中都有一个相同的方法，然后这个方法的流程都是一样的，比如下边的pourInCup，这样只需要在父类中实现即可，显然。
2. 如果每个类在prepareRecipe这个算法中，对于某一个方法的实现都不一样，比如addCondiments，那么只需要在父类中有一个虚函数，然后子类去实现即可。
3. 钩子函数，即在prepareRecipe这个算法中调用一个空函数，如果某一个具体子类中该函数有些用，就直接覆盖了实现就可以，比如下边的ifCustomerWantCondiment，在父类中直接返回true，在Coffee类中覆盖了这个方法，根据用户的输入决定是否加入condiment。

## 类图



<img src="C:\Users\haimiao\AppData\Roaming\Typora\typora-user-images\image-20200228202611607.png" alt="image-20200228202611607" style="zoom:50%;" />