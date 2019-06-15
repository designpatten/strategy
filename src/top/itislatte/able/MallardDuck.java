package top.itislatte.able;
/**
 * FileName: MallardDuck.java
 * 绿色鸭子会飞也会叫，所以实现 Flyable,Quackable 接口
 * @author  吕建雄
 * @Date    2019.6.15
 * @version 1.00
 */
public class MallardDuck extends Duck implements Flyable,Quackable {
    @Override
    protected void display() {
        System.out.println("绿色鸭子");
    }

    @Override
    public void fly() {
        System.out.println("绿色鸭子飞起来啦~");
    }

    @Override
    public void quack() {
        System.out.println("绿色鸭子会叫：呱呱，呱呱呱");
    }
}
