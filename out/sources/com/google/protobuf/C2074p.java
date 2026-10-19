package com.google.protobuf;

/* JADX INFO: renamed from: com.google.protobuf.p, reason: case insensitive filesystem */
/* JADX INFO: compiled from: ExtensionSchemas.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C2074p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C2073o f29188a = new C2073o();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AbstractC2072n<?> f29189b;

    static {
        AbstractC2072n<?> abstractC2072n = null;
        try {
            abstractC2072n = (AbstractC2072n) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f29189b = abstractC2072n;
    }
}
