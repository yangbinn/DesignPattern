package com.amazing.designpatternslib.structure.bridge;

public class MiddlePen extends Pen {

    @Override
    public void draw(String name) {
        String penType = "中号毛笔绘制";
        mIColor.bepaint(penType, name);
    }

}
