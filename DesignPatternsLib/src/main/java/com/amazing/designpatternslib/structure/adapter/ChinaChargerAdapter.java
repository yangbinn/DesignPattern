package com.amazing.designpatternslib.structure.adapter;

/**
 * 中国充电适配器
 */
public class ChinaChargerAdapter implements ICharger{

    //美国充电器
    private USACharger mUSACharger;

    public ChinaChargerAdapter(){
        mUSACharger = new USACharger();
    }

    @Override
    public void charging() {
        mUSACharger.charging110();
        System.out.println("充电器适配充电");
    }
}
