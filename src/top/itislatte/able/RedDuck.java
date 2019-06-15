package top.itislatte.able;

/**
 * FileName: RedDuck.java
 * 红色鸭子会飞也会叫，所以实现 Flyable,Quackable 接口
 * @author  吕建雄
 * @Date    2019.6.15
 * @version 1.00
 */
public class RedDuck extends Duck implements Flyable,Quackable{

    @Override
    protected void display() {
        System.out.println("红色鸭子");
    }

    @Override
    public void fly() {
        System.out.println("红色鸭子会飞");
    }

    @Override
    public void quack() {
        System.out.println("红色鸭子会叫：呱呱，呱呱呱");
    }
}
