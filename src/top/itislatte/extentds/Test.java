package top.itislatte.extentds;

public class Test {

    public static void main(String[] argv){
        Duck mallardDuck = new MallardDuct();
        mallardDuck.display();
        mallardDuck.quack();
        mallardDuck.swim();
        mallardDuck.fly();

        Duck redDuct = new RedHeadDuck();
        redDuct.display();
        redDuct.quack();
        redDuct.swim();
        redDuct.fly();

        RubberDuck rubberDuck = new RubberDuck();
        rubberDuck.display();
        rubberDuck.quack();
        rubberDuck.swim();
        //由于在超类中实现了fly方法，导致了可怕的事情，橡皮鸭尽然飞起来啦...
        rubberDuck.fly();
    }

}
