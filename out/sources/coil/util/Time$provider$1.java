package coil.util;

import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: compiled from: Time.kt */
/* JADX INFO: loaded from: classes.dex */
public /* synthetic */ class Time$provider$1 extends FunctionReferenceImpl implements Ia.a<Long> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Time$provider$1 f23151b = new Time$provider$1();

    public Time$provider$1() {
        super(0, System.class, "currentTimeMillis", "currentTimeMillis()J", 0);
    }

    @Override // Ia.a
    public final Long invoke() {
        return Long.valueOf(System.currentTimeMillis());
    }
}
