# 迭代器模式

## 内容

现在有三个菜单，一个pancakehousemenu，一个dinnermenu，一个cafemenu。每个菜单里都有很多个菜品，菜品的类是menuItem。现在有一个waitress，这个waitress有这三个菜单的对象，并希望有一个方法能输出每个菜单的菜品。

现在主要问题是这个菜单中菜品存储的数据结构不一样，pancakehousemenu中用的是arraylist，dinnermenu用的是数组，cafemenu用的是hashmap。为了能让外界看来这三种遍历起来都是一样的，这样我们对外用一个迭代器来遍历整个菜单。

## 类图

![SharedScreenshot](C:\Users\haimiao\Desktop\SharedScreenshot.jpg)



# 组合模式

## 内容

现在问题变了，对于每一个菜单都可能有子菜单，子菜单也可能有子子菜单，比如dinnerMenu有一个dessertmenu的子菜单。这样的话就形成了一棵树。

所在我们可以采用组合模式，将这颗树的中间节点和叶子节点统一为一个接口(MenuComponenet)，然后这个MenuComponent有一个属性是menuComponenetList的列表，这样这个列表可以存中间节点，也可以存叶子节点。这样只需要遍历这个列表，然后根据接口的多态就可以达到中间节点或叶子节点的输出。

虽然组合模式违背了单一原则（每一个类只能有一个修改的理由，只能承担一种责任），但只是一个tradeoff。

## 类图

<img src="C:\Users\haimiao\Desktop\SharedScreenshot.jpg" alt="SharedScreenshot" style="zoom:80%;" />