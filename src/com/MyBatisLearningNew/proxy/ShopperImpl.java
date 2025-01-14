package com.MyBatisLearningNew.proxy;

public class ShopperImpl implements Shopper {
    @Override
    public void saleWatermelon(String customer) {
        System.out.println("成功出售西瓜给 =====>"+customer);
    }
}
