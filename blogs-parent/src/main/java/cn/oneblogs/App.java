package cn.oneblogs;

import cn.oneblogs.pattern.strategy.behaviorImpl.FlyWithWings;
import cn.oneblogs.pattern.strategy.duck.Duck;
import cn.oneblogs.pattern.strategy.duck.MallardDuck;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Duck mallarDuck =  new MallardDuck();
        mallarDuck.performFly();
        mallarDuck.setFly(new FlyWithWings());
        mallarDuck.performFly();
    }
}
