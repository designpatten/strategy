package top.itislatte.able;

/**
 * FileName: RubberDuck.java
 * 橡皮鸭不会飞也不会叫，所以不实现 Flyable,Quackable 接口
 * @author  吕建雄
 * @Date    2019.6.15
 * @version 1.00
 */
public class RubbleDuck extends Duck {
    @Override
    protected void display() {
        System.out.println("橡皮鸭");
    }


}

