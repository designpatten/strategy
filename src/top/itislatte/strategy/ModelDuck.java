package top.itislatte.strategy;

/**
 * 模型鸭，不会飞也不会叫
 * */

/**
 * FileName: ModelDuck.java
 * 模型鸭子
 * @author  吕建雄
 * @Date    2019.6.15
 * @version 1.00
 */
public class ModelDuck extends Duck {

    /**
     * 此处针对具体的实现编程（不建议这种方式）
     * */
    public ModelDuck(){
        flyBehavior = new FlyNoWay();
        quackBehavior = new MuteQuack();
    }

    @Override
    protected void display() {
        System.out.println("我是模型鸭");
    }
}
