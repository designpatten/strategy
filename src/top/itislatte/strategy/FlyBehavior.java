package top.itislatte.strategy;

/**
 * 设计原则：针对接口编程，而不是针对实现编程
 * 让具体的专门类实现FlyBehavior中的方法
 * 这样的做法不用与以往，一起的做法是：行为来子Duck超类的实现或者是继承某个接口并有子类实现
 *
 * 敲黑板，画重点：
 * 使用这种设计，可以让飞行和呱呱叫的动作被其他的对象复用，因为这些行为已经与鸭子类无关啦
 * 而我们可以增加一些行为，不会影响到既有的行为类，也不会影响"使用"到飞行行为的鸭子类
 *
 * 飞的行为(取出易变化的部分)
 * */

/**
 * FileName: FlyBehavior.java
 * 飞行为基类
 * @author  吕建雄
 * @Date    2019.6.15
 * @version 1.00
 */
public interface FlyBehavior {

    /**
     *
     * */
    void fly();

}
