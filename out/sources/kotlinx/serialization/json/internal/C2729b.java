package kotlinx.serialization.json.internal;

import kotlin.Result;

/* JADX INFO: renamed from: kotlinx.serialization.json.internal.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: ArrayPools.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class C2729b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f43977a;

    static {
        Object objA;
        try {
            String property = System.getProperty("kotlinx.serialization.json.pool.size");
            kotlin.jvm.internal.i.d(property, "getProperty(...)");
            objA = kotlin.text.l.A(property);
        } catch (Throwable th) {
            objA = kotlin.b.a(th);
        }
        if (objA instanceof Result.Failure) {
            objA = null;
        }
        Integer num = (Integer) objA;
        f43977a = num != null ? num.intValue() : 2097152;
    }
}
