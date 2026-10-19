package com.google.protobuf;

/* JADX INFO: renamed from: com.google.protobuf.l, reason: case insensitive filesystem */
/* JADX INFO: compiled from: ExtensionRegistryFactory.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C2070l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Class<?> f29182a;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            cls = null;
        }
        f29182a = cls;
    }
}
