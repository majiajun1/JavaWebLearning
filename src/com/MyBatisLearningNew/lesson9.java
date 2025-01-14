package com.MyBatisLearningNew;

import com.MyBatisLearningNew.proxy.Shopper;
import com.MyBatisLearningNew.proxy.ShopperImpl;
import com.MyBatisLearningNew.proxy.ShopperProxy;

import java.lang.reflect.Proxy;

public class lesson9 {
    public static void main(String[] args) {
//        Shopper impl = new ShopperImpl();
//        Shopper proxy = new ShopperProxy(impl);
//        proxy.saleWatermelon("小强");

//        Shopper impl = new ShopperImpl();
//    Shopper shopper = (Shopper) Proxy.newProxyInstance
//            (Shopper.getClass().getClassLoader(),
//            impl.getClass().getInterfaces(),
//                    new ShopperProxy(impl));.
        Shopper shopper = (Shopper)  Proxy.newProxyInstance(Shopper.class.getClassLoader(),new Class[]{Shopper.class},new ShopperProxy());
    shopper.saleWatermelon("小强");
  	System.out.println(shopper.getClass());
    }
}
