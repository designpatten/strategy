package top.itislatte.extentds;


/**
 * FileName: Duck.java
 * 鸭子基类，模拟鸭子，游戏中各种鸭子一边游泳一边呱呱叫
 * @author  吕建雄
 * @Date    2019.6.15
 * @version 1.00
 */
public abstract class Duck {

    /**
     * 因为所有的鸭子都会游泳/会呱呱叫，所有由超类来负责处理这部分的实现
     * */

    protected void quack(){
        System.out.println("呱呱，呱呱呱...");
    }

    protected void swim(){
        System.out.println("游泳～～～");
    }

    /**
     * 由于每个鸭子的外观不同，所以display()方法是抽象的
     * */
    protected abstract void display();

    /**
     * 接下来需求发生了变化，现在需要让鸭子能飞（最简单的方法，在超类中添加fly方法）
     * */
    protected void fly(){
        System.out.println("鸭子飞起来啦...");
    }

    /**
     *  由于在超类中添加了fly方法，接下来可怕的事情发生啦
     *  ---橡皮鸭尽然也能飞---
     *  并非所有的鸭子都会飞，在Duck超类中加上新的行为，会使某些并不适合该行为的子类也具有了该方法
     * */

    /**
     * 敲黑板画重点啦
     * 对代码局部的修改，影响层面可不是是局部(会飞的橡皮鸭)
     * 重点：为了复用而使用继承并不完美
     * */


    /**
     * 至此总结：
     * 受用继承带阿里的缺点
     * 1：运行时行为不容易改变
     * 2：改变会牵一发动全身，造成其他鸭子不想要的改变
     * 3：很难知道鸭子的所有行为
     * */

    //进入到下一个引导阶段，利用接口如何？？？（进入到able包中，看答案）

}
