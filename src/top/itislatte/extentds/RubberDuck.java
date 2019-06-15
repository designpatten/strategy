package top.itislatte.extentds;


/**
 * FileName: RubberDuck.java
 * 橡皮鸭
 * @author  吕建雄
 * @Date    2019.6.15
 * @version 1.00
 */
public class RubberDuck extends Duck {
    @Override
    protected void display() {
        System.out.println("橡皮鸭");
    }

    /**
     * 由于橡皮鸭不会叫，所以在此类中实现此方法，不做任何实现
     * */
    protected void quack(){

    }

    /**
     * 同理由于橡皮鸭不会飞，所以也可以在此类中实现fly方法，不做任何实现
     * 可是如果随着鸭子的赠多，对于程序来说将会带来更多的维护成本
     * */



}
