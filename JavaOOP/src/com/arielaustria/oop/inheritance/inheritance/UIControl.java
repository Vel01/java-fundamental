package com.arielaustria.oop.inheritance.inheritance;

public class UIControl {

    private boolean isEnable = true;

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
