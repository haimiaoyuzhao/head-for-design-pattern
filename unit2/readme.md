## 内容

主要讲的是观察者模式。代码内容为：有一个weatherdata的气象数据，然后这个气象数据里包括了temperature、humidity、pressure，然后有一些公告板（board)，这些公告板获得气象数据，然后根据这些气象数据进行相应的输出。显然，每次气象数据发生一些变化，公告板都要更新自己的数据。

显然最好的方式是将公告板进行封装一下，为了能满足“对修改关闭，对添加开放”，这样我们就得把气象数据当作一个subject，然后公告板当作一个observer，subject中有一个arraylist来装所有的observer，这样每当气象数据改变时，能通知该列表中的所有对象都进行更新。

## 类图

![image-20200217213304311](C:\Users\haimiao\AppData\Roaming\Typora\typora-user-images\image-20200217213304311.png)

