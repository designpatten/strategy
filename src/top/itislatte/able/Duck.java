package top.itislatte.able;


/**
 * FileName: Duck.java
 * 鸭子基类
 * @author  吕建雄
 * @Date    2019.6.15
 * @version 1.00
 */
public abstract class Duck {

    /**
     * 游泳方法
     * */
    protected void swim(){
        System.out.println("游泳～～～");
    }

    protected abstract void display();

    /**
     * 由于继承并不能很好的解决问题，因为鸭子的行为在子类中不断的改变，并且让所有的子类都有这些行为是不恰当的
     * 而接口不具有代码的实现，所以继承接口无法达到代码的复用
     * */

    /**
     * 幸运的是，有一个设计原则，恰好适用于此状况
     * 设计原则：
     * "把应用中可能变化之处，把它们独立出来，不和那些不变化的代码混在一起"
     *
     * 把会变化的部分取出并'封装起来'，好让其他部分不会受到影响（进入到strategy包中看答案）
     * */

}
