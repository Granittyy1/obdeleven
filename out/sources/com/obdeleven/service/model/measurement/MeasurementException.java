package com.obdeleven.service.model.measurement;

/* JADX INFO: loaded from: classes3.dex */
public class MeasurementException extends Exception {
    private final int code;

    public MeasurementException(int i10) {
        this.code = i10;
    }

    public final int a() {
        return this.code;
    }
}
