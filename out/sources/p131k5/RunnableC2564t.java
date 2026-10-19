package p131k5;

import U4.C0804l;
import androidx.collection.C0873a;

/* JADX INFO: renamed from: k5.t, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC2564t implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f42458b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f42459c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C2481a f42460d;

    public RunnableC2564t(C2481a c2481a, String str, long j) {
        this.f42458b = str;
        this.f42459c = j;
        this.f42460d = c2481a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        C2481a c2481a = this.f42460d;
        c2481a.p();
        String str = this.f42458b;
        C0804l.e(str);
        C0873a c0873a = c2481a.f42072c;
        Integer num = (Integer) c0873a.get(str);
        if (num == null) {
            c2481a.d().f41712f.b(str, "Call to endAdUnitExposure for unknown ad unit id");
            return;
        }
        C2559r2 c2559r2Y = c2481a.r().y(false);
        int iIntValue = num.intValue() - 1;
        if (iIntValue != 0) {
            c0873a.put(str, Integer.valueOf(iIntValue));
            return;
        }
        c0873a.remove(str);
        C0873a c0873a2 = c2481a.f42071b;
        Long l10 = (Long) c0873a2.get(str);
        long j = this.f42459c;
        if (l10 == null) {
            c2481a.d().f41712f.c("First ad unit exposure time was never set");
        } else {
            long jLongValue = j - l10.longValue();
            c0873a2.remove(str);
            c2481a.w(str, jLongValue, c2559r2Y);
        }
        if (c0873a.isEmpty()) {
            long j10 = c2481a.f42073d;
            if (j10 == 0) {
                c2481a.d().f41712f.c("First ad exposure time was never set");
            } else {
                c2481a.v(j - j10, c2559r2Y);
                c2481a.f42073d = 0L;
            }
        }
    }
}
