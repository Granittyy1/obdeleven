package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class H2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final E2 f25464a = new E2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final F2<?> f25465b;

    static {
        F2<?> f10 = null;
        try {
            f10 = (F2) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f25465b = f10;
    }
}
