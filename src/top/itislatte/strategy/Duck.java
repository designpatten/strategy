package top.itislatte.strategy;
/**
 * FileName: Duck.java
 * 鸭子基类
 * @author  吕建雄
 * @Date    2019.6.15
 * @version 1.00
 */
public abstract class Duck {

    /**
     *  Duck类仍然是所有类的超类，但是飞行和叫的行为已被取出，放在别的类结构中
     */



    protected void swim(){
        System.out.println("鸭子都会游泳");
    }

    protected abstract void display();


    /**
     * 整合鸭子的行为
     * 关键在于，鸭子现在会将飞行和呱呱叫的动作"委托"别人处理，而不是定义在Duck类或子类内
     * */


    protected FlyBehavior flyBehavior;
    protected QuackBehavior quackBehavior;//每只鸭子都会引用实现QuackBehavior接口的对象

    protected void performQuack(){
        quackBehavior.quack();//委托给行为类
    }

    protected void performFly(){
        //鸭子对象不亲自处理呱呱叫的行为，而是委托给quackBehavior引用的对象
        flyBehavior.fly();;
    }


    /**
     * 动态设定行为
     * 在鸭子里建立一堆动态的功能没有用，就太可惜了！
     * 假设我们在鸭子子类中，通过设定（setter）方法来设置鸭子的行为，而不是在鸭子的构造器内实例化
     * */
    //在Duck类中增加两个新方法
    protected void setFlyBehavior(FlyBehavior flyBehavior){
        this.flyBehavior =flyBehavior;
    }

    protected void  setQuackBehavior(QuackBehavior quackBehavior){
        this.quackBehavior = quackBehavior;
    }

    /**
     * 设计原则：多用组合，少用继承
     * has-a 比 is-a 更好
     * 每个鸭子都有一个FlyBehavior和一个QuackBehavior，好将飞行和呱呱叫委托给它们代为处理
     * */

    /**
     * 此即为策略模式的实现 Strategy Pattern
     * 策略模式：定义了算法族，分别封装起来，让它们之间可以互相替换
     * */

}
