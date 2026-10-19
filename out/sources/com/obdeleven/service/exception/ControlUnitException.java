package com.obdeleven.service.exception;

/* JADX INFO: loaded from: classes3.dex */
public class ControlUnitException extends Exception {
    private final int mCode;

    public ControlUnitException(int i10) {
        this.mCode = i10;
    }

    public final int a() {
        return this.mCode;
    }
}
