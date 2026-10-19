package com.obdeleven.service.odx;

/* JADX INFO: loaded from: classes3.dex */
public class OdxFactory$Exception extends Exception {
    private final int code;

    public OdxFactory$Exception(int i10) {
        this.code = i10;
    }

    public final int a() {
        return this.code;
    }

    public OdxFactory$Exception(int i10, Exception exc) {
        super(exc);
        this.code = i10;
    }
}
