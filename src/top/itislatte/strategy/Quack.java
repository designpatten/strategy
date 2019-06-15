package top.itislatte.strategy;


/**
 * FileName: MuteQuack.java
 * 真的呱呱叫
 * @author  吕建雄
 * @Date    2019.6.15
 * @version 1.00
 */
public class Quack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("鸭子呱呱叫");
    }

}
