package top.itislatte.strategy;

/**
 * FileName: MuteQuack.java
 * 名为呱呱叫，其实不出声
 * @author  吕建雄
 * @Date    2019.6.15
 * @version 1.00
 */
public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        //什么都不做，不会叫
    }
}
