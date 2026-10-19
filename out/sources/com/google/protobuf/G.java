package com.google.protobuf;

/* JADX INFO: compiled from: MapFieldSchemas.java */
/* JADX INFO: loaded from: classes3.dex */
public final class G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final E f29036a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final F f29037b;

    static {
        E e10 = null;
        try {
            e10 = (E) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f29036a = e10;
        f29037b = new F();
    }
}
