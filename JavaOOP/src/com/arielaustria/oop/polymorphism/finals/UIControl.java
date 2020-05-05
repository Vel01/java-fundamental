package com.arielaustria.oop.polymorphism.finals;

public abstract class UIControl {

    private boolean isEnable = true;

//    public UIControl(boolean isEnable) {
//        this.isEnable = isEnable;
//    }

    public abstract void render();

    public final void enable() {
        isEnable = true;
    }

    public void disable() {
        isEnable = false;
    }

    public boolean isEnabled() {
        return isEnable;
    }

}
