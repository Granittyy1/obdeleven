package com.google.protobuf;

/* JADX INFO: compiled from: NewInstanceSchemas.java */
/* JADX INFO: loaded from: classes3.dex */
public final class Q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final O f29085a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final P f29086b;

    static {
        O o10 = null;
        try {
            o10 = (O) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f29085a = o10;
        f29086b = new P();
    }
}
