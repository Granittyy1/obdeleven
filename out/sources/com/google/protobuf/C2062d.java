package com.google.protobuf;

/* JADX INFO: renamed from: com.google.protobuf.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: Android.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C2062d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Class<?> f29135a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final boolean f29136b;

    static {
        Class<?> cls;
        Class<?> cls2 = null;
        try {
            cls = Class.forName("libcore.io.Memory");
        } catch (Throwable unused) {
            cls = null;
        }
        f29135a = cls;
        try {
            cls2 = Class.forName("org.robolectric.Robolectric");
        } catch (Throwable unused2) {
        }
        f29136b = cls2 != null;
    }

    public static boolean a() {
        return (f29135a == null || f29136b) ? false : true;
    }
}
