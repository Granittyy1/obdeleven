package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class Z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f25648a = 0;

    static {
        byte b10 = (byte) (((byte) 1) | 2);
        if (b10 == 3) {
            new X();
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        if ((b10 & 1) == 0) {
            sb2.append(" hasDifferentDmaOwner");
        }
        if ((b10 & 2) == 0) {
            sb2.append(" skipChecks");
        }
        throw new IllegalStateException("Missing required properties:".concat(String.valueOf(sb2)));
    }

    public abstract zzcl a();

    public abstract String b();

    public abstract boolean c();

    public abstract boolean d();
}
