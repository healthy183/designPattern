http://www.cnblogs.com/zuoxiaolong/category/509144.html

原则:
1,找出应用中可能需要变化之外，把它独立出来，不要和那些不需要变化的代码混在一起;
2,多用组合，针对接口编程，而不是实现编程；
3,单service单方法,抽象类仅有一个抽象方法;(自己附加)
4,为交互对象之间的松耦合设计而努力

01,strategy 策略模式
解释:javabean原则,将原类接口方法抽出成单独接口，并改成原类的全局变量

02,observer观察者模式
在对象间定义一对多依赖，一个对象更新，然后通知多对象更新;
因为对象跨方法值修改可行,基本类型则不可;

03,decorator装饰模式(javaIo类都使用此模式)
类嵌套同接口子类

04 factory工厂模式
factorymethod 工厂方法
abstractFatory 抽象工厂方法(控制翻转)

05,singleton单例模式
分懒汉，饿汉，这里只写饿汉，volatile保证可见性

06,command命令模式
将请求封装成对象，达至客户端和执行者解耦;

07,adapter适配器模式(迭代器模式为其子模式)
适配器类实现适配接口，然后适配器再接口方法中调用目标类的具体方法
最简单原则:不要通过getObject().getObject().invodeMethod()调用；


08,template模板模式
抽象模板父类定义包含final模板方法,子类包含实现方法;
荷里活原则:父类允许调用子类方法,子类严禁调用父类方法，防止高度耦合,,依赖腐败

09state模式
将状态生成单独的类，状态更改改成状态类内部实现

10动态代理proxy
静态代理，代理类实现目标接口，然后依赖调用被代理类具体方法
动态代理，InvocationHandlerImpl依赖被代理接口,实现代理调用;
然后通过Proxy.newProxyInstance反射出被代理对象

10Adapter适配器
适配类，实现适配接口，然后嵌套被适配类，达至多态效果;


11template模板模式
模板方法final，然后调用子类强制实现的抽象方法

12外观模式Facade详解（Service第三者插足，让action与dao分手）(无码)

13bridge桥接模式(和策略分不清)
桥接类属性为接口，通过set或者构造方法,初始化属性

14builder建造者模式
Soul组合方法类
DoppelgangerBuilder定义各类构建方法

memento备忘录模式
Soul保存人与记忆键值对，以此达至记忆更新和备份

flyweight享元模式
Role角色类依赖抽象hero
通过*manager类实现单例对象hero复用

composite组合模式
1,组合模式，单方法内包含N个方法调用(这样也叫设计模式?)
2,Folder嵌套File实现组合属性递归操作


Mediator中介者模式
对象间通过中介方法实现交互

chainofResponsibility职责链模式
McSubbranch责任对象定义一个全局属性为下个责任对象
OrderManager组装和实现职责对接

visitor访问者模式（伪动态双分派）
Client
不同bill类型，根据不同访问者作出对应操作，
ConsumeBill消费订单，boss只想看总额，CPA只看工资，CF0财务主管只看明细

prototype原形模式
Cloneable.clone()浅拷贝，即全局变量都为同一内存地址