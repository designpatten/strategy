package top.itislatte.strategy;

/**
 * 这里实现了所有不会飞的鸭子的动作
 * */

/**
 * FileName: FlyNoWay.java
 * 飞的具体行为类，不会飞
 * @author  吕建雄
 * @Date    2019.6.15
 * @version 1.00
 */
public class FlyNoWay implements FlyBehavior {


    @Override
    public void fly() {
        //什么都不做，不会飞
    }
}
