package top.itislatte.strategy;

/**
 * FileName: Squeak.java
 * 名为呱呱叫，其实是吱吱叫
 * @author  吕建雄
 * @Date    2019.6.15
 * @version 1.00
 */
public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("橡皮鸭子吱吱叫");
    }
}
