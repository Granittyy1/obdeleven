package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzcj$zzc {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final zzcj$zzc f26340b = new zzcj$zzc(new AnonymousClass1("Failure occurred while trying to finish a future."));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final zzcj$zzc f26341c = new zzcj$zzc(new AnonymousClass2("Failure.exception is unexpectedly null."));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f26342a;

    public zzcj$zzc(Throwable th) {
        th.getClass();
        this.f26342a = th;
    }

    /* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.zzcj$zzc$1, reason: invalid class name */
    /* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
    public class AnonymousClass1 extends Throwable {
        @Override // java.lang.Throwable
        public final Throwable fillInStackTrace() {
            return this;
        }
    }

    /* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.zzcj$zzc$2, reason: invalid class name */
    /* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
    public class AnonymousClass2 extends Throwable {
        @Override // java.lang.Throwable
        public final Throwable fillInStackTrace() {
            return this;
        }
    }
}
