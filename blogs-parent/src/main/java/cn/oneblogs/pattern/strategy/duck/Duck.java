package cn.oneblogs.pattern.strategy.duck;

import cn.oneblogs.pattern.strategy.behavior.FlyBehavior;
import cn.oneblogs.pattern.strategy.behavior.QuackBehavor;

/**
 * Created by laijie.zhang on 2017/2/26.
 */
public abstract class Duck{
    FlyBehavior flyBehavior;
    QuackBehavor quackBehavor;
    public Duck(){

    }
    public void setFly(FlyBehavior fly ){
        flyBehavior = fly;
    }
    public abstract void Display();

    public void performQuck(){
        quackBehavor.quack();
    }

    public void performFly(){
        flyBehavior.fly();
    }

    public void swim(){
        System.out.println("All duck float,even fecoys!");
    }
}
