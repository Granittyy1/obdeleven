package com.obdeleven.service.odx.model;

import org.simpleframework.xml.Root;
import org.simpleframework.xml.Text;

/* JADX INFO: loaded from: classes3.dex */
@Root(name = "V")
public class V {

    @Text
    protected double value;

    public double getValue() {
        return this.value;
    }

    public void setValue(double d10) {
        this.value = d10;
    }
}
