package top.itislatte.strategy;

/**
 * 设计原则：针对接口编程，而不是针对实现编程
 * 让具体的专门类实现QuackBehavior中的方法
 * 叫的行为(取出易变化的行为)
 * */

/**
 * FileName: QuackBehavior.java
 * 叫行为基类
 * @author  吕建雄
 * @Date    2019.6.15
 * @version 1.00
 */
public interface QuackBehavior {

    void quack();

}
