package com.amazing.designpatternslib.structure.bridge;

public abstract class Pen {

    protected IColor mIColor;

    public IColor getIColor() {
        return mIColor;
    }

    public void setIColor(IColor iColor) {
        this.mIColor = iColor;
    }

    public abstract void draw(String name);

}
