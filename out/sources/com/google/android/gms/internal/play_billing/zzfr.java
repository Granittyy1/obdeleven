package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public enum zzfr {
    VOID(Void.class),
    INT(Integer.class),
    LONG(Long.class),
    FLOAT(Float.class),
    DOUBLE(Double.class),
    BOOLEAN(Boolean.class),
    STRING(String.class),
    BYTE_STRING(zzei.class),
    ENUM(Integer.class),
    MESSAGE(Object.class);

    private final Class zzl;

    static {
        zzei zzeiVar = zzei.f26345b;
    }

    zzfr(Class cls) {
        this.zzl = cls;
    }
}
