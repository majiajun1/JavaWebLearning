package com.MyBatisLearningNew.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.security.spec.RSAOtherPrimeInfo;

//public class ShopperProxy implements Shopper {
//    private final Shopper impl;
//
//    public ShopperProxy(Shopper impl) {
//        this.impl = impl;
//    }
//
//    @Override
//    public void saleWatermelon(String customer) {
//        System.out.println("讨价还价环节 模拟事务");
//
//        impl.saleWatermelon(customer);
//    }
//
//}
public class ShopperProxy implements InvocationHandler {
//    Object target;
//    public ShopperProxy(Object target) {
//        this.target = target;
//    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        String customer = (String) args[0];
        System.out.println("讨价还价环节 模拟");
//        System.out.println(method.getName()); //saleWatermelon
//        return method.invoke(target, args);
        return null;
    }
}