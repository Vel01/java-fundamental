package com.arielaustria.oop.inheritance.casting;

public class UIControl {

    private boolean isEnable = true;

    public UIControl(boolean isEnable) {
        this.isEnable = isEnable;
    }

    public void enable() {
        isEnable = true;
    }

    public void disable() {
        isEnable = false;
    }

    public boolean isEnabled() {
        return isEnable;
    }

}
