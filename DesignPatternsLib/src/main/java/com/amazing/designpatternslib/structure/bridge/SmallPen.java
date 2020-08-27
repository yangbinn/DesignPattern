package com.amazing.designpatternslib.structure.bridge;

public class SmallPen extends Pen {

    @Override
    public void draw(String name) {
        String penType = "小号毛笔绘制";
        mIColor.bepaint(penType, name);
    }

}
