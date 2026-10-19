package com.obdeleven.service.exception;

/* JADX INFO: loaded from: classes3.dex */
public class VehicleException extends Exception {
    private final int code;

    public VehicleException(int i10) {
        this.code = i10;
    }

    public final int a() {
        return this.code;
    }
}
