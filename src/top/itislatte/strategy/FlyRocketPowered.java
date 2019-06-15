package top.itislatte.strategy;

/**
 * 火箭助推，帮助不会飞的鸭子实现飞的行为
 * */

/**
 * FileName: FlyRocketPowered.java
 * 火箭助推行为类
 * @author  吕建雄
 * @Date    2019.6.15
 * @version 1.00
 */
public class FlyRocketPowered implements  FlyBehavior{

    @Override
    public void fly() {
        System.out.println("利用火箭动力的飞行行为");
    }

}
