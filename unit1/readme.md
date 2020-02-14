# 第一单元策略模式

## 内容

主要是针对鸭子的问题。鸭子有很多种，mallard duck, model duck，rubber duck，然后有些鸭子会飞，有的鸭子不会飞，有的鸭子会叫，有的鸭子不会叫，会叫的鸭子也会不同叫，但这些鸭子都会display。所以对于飞行和叫这两个行为我们需要额外封装两个接口，然后将这两个接口组合到鸭子类中。

## 类图

![image-20200214120035746](C:\Users\haimiao\AppData\Roaming\Typora\typora-user-images\image-20200214120035746.png)