package top.itislatte.strategy;

/**
 * 这里实现了所有有翅膀的鸭子飞行动作
 * */

/**
 * FileName: FlyWithWings.java
 * 飞的具体行为类，飞
 * @author  吕建雄
 * @Date    2019.6.15
 * @version 1.00
 */
public class FlyWithWings implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("会飞的鸭子");
    }
}
