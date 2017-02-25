package cn.oneblogs.pattern.strategy.duck;

import cn.oneblogs.pattern.strategy.behaviorImpl.FlyNoWay;
import cn.oneblogs.pattern.strategy.behaviorImpl.Quack;

/**
 * Created by laijie.zhang on 2017/2/26.
 */
public class MallardDuck extends Duck{

    public MallardDuck(){
        quackBehavor = new Quack();
        flyBehavior = new FlyNoWay();
    }

    public void Display() {
        System.out.println("I'm a real Mallard duck");
    }
}
