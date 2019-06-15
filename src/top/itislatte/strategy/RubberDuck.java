package top.itislatte.strategy;

/**
 * FileName: RubberDuck.java
 * 橡皮鸭，不会飞，但是会吱吱叫
 * @author  吕建雄
 * @Date    2019.6.15
 * @version 1.00
 */
public class RubberDuck extends Duck {

    /**
     * 此处针对具体的实现编程（不建议这种方式）
     * */
    public RubberDuck(){
        flyBehavior = new FlyNoWay();
        quackBehavior = new Squeak();
    }

    @Override
    protected void display() {
        System.out.println("我是橡皮鸭");
    }

}
