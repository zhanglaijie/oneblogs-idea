package cn.oneblogs.pattern.strategy.behaviorImpl;

import cn.oneblogs.pattern.strategy.behavior.QuackBehavor;

/**
 * Created by laijie.zhang on 2017/2/26.
 */
public class Quack implements QuackBehavor{

    public void quack() {
        System.out.println("quack");
    }
}
