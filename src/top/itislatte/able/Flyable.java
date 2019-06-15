package top.itislatte.able;

/**
 * FileName: Flyable.java
 * 飞行为接口
 * @author  吕建雄
 * @Date    2019.6.15
 * @version 1.00
 */
public interface Flyable {

    /**
     * 飞的方法
     * */
    void fly();

    /**
     * 面临的问题：
     * 虽然使用Flyable，Quackable接口能解决一部分问题（不再会有会飞的橡皮鸭）,
     * 接口不具有实现代码，却造成代码无法复用，这只能是从一个噩梦跳入到另一个噩梦
     * */

}
