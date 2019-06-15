package top.itislatte.strategy;

public class Test {

    public static void main(String[] argv){
        RedDuck redDuck = new RedDuck();
        redDuck.display();
        redDuck.performFly();
        redDuck.performQuack();
        redDuck.swim();
        System.out.println("***********************");
        RubberDuck rubberDuck = new RubberDuck();
        rubberDuck.display();
        rubberDuck.performFly();
        rubberDuck.performQuack();
        rubberDuck.swim();
        System.out.println("***********************");
        //一开始模型鸭是不会飞的
        ModelDuck modelDuck = new ModelDuck();
        modelDuck.display();
        modelDuck.performFly();//第一次调用performFly会被委托给FlyBehavior对象(即FlyNoWay实例)
        modelDuck.performQuack();
        modelDuck.swim();
        //运行是改变行为，只需要调用setter方法就可以
        //调用继承来的setter方法，把火箭动力飞行的行为设定到模型鸭中。哇，模型鸭突然具有了火箭动力飞行能力
        modelDuck.setFlyBehavior(new FlyRocketPowered());
        modelDuck.performFly();
    }
}
