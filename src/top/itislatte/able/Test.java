package top.itislatte.able;


public class Test {

    public static void main(String[] argv){
        RedDuck redDuct = new RedDuck();
        redDuct.display();
        redDuct.quack();
        redDuct.swim();
        redDuct.fly();

        RubbleDuck rubbleDuck = new RubbleDuck();
        rubbleDuck.display();
        rubbleDuck.swim();

        MallardDuck mallardDuck = new MallardDuck();
        mallardDuck.display();
        mallardDuck.quack();
        mallardDuck.fly();
        mallardDuck.swim();
    }

}
