package top.itislatte.extentds;


/**
 * FileName: MallardDuct.java
 * 鸭子类
 * @author  吕建雄
 * @Date    2019.6.15
 * @version 1.00
 */
public class MallardDuct extends Duck {

    /**
     * 每个鸭子子类型（subtype）负责实现自己的display()行为
     * */
    @Override
    protected void display() {
        System.out.println("外观是绿色");
    }

}
