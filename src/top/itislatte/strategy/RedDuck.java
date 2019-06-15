package top.itislatte.strategy;

/**
 * FileName: RedDuck.java
 * 红色鸭子，会飞，会呱呱叫
 * @author  吕建雄
 * @Date    2019.6.15
 * @version 1.00
 */
public class RedDuck extends Duck{

    /**
     * 此处针对具体的实现编程（不建议这种方式）
     * */
    public RedDuck(){
        //红鸭子使用FlyWithWings处理飞的行为，所以当performFly被调用时，委托给了FlyWithWings对象，实现了真正的飞行为
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    @Override
    protected void display() {
        System.out.println("红色鸭子");
    }
}
