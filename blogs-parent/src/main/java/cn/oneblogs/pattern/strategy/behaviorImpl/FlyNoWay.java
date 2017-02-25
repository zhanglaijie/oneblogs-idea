package cn.oneblogs.pattern.strategy.behaviorImpl;

import cn.oneblogs.pattern.strategy.behavior.FlyBehavior;

/**
 * Created by laiji on 2017/2/26.
 */
public class FlyNoWay implements FlyBehavior{
    public void fly() {
        System.out.println("I can't fly");
    }
}
