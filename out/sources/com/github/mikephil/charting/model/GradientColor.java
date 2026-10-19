package com.github.mikephil.charting.model;

/* JADX INFO: loaded from: classes.dex */
public class GradientColor {
    private int endColor;
    private int startColor;

    public GradientColor(int i10, int i11) {
        this.startColor = i10;
        this.endColor = i11;
    }

    public int getEndColor() {
        return this.endColor;
    }

    public int getStartColor() {
        return this.startColor;
    }

    public void setEndColor(int i10) {
        this.endColor = i10;
    }

    public void setStartColor(int i10) {
        this.startColor = i10;
    }
}
