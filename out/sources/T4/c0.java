package T4;

import S4.C0760b;
import U4.AbstractC0794b;
import U4.C0796d;
import U4.C0802j;
import U4.C0805m;
import U4.C0806n;
import android.os.SystemClock;
import com.braze.models.inappmessage.InAppMessageBase;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class c0 implements p191p5.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0771d f5921b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f5922c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0768a f5923d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f5924e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f5925f;

    public c0(C0771d c0771d, int i10, C0768a c0768a, long j, long j10) {
        this.f5921b = c0771d;
        this.f5922c = i10;
        this.f5923d = c0768a;
        this.f5924e = j;
        this.f5925f = j10;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0031 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:27:0x0032 A[RETURN] */
    public static C0796d a(T t8, AbstractC0794b abstractC0794b, int i10) {
        U4.U u10 = abstractC0794b.f6391B;
        C0796d c0796d = u10 == null ? null : u10.f6376e;
        if (c0796d != null && c0796d.f6437c) {
            int[] iArr = c0796d.f6439e;
            int i11 = 0;
            if (iArr == null) {
                int[] iArr2 = c0796d.f6441g;
                if (iArr2 != null) {
                    while (i11 < iArr2.length) {
                        if (iArr2[i11] != i10) {
                            i11++;
                        }
                    }
                }
                if (t8.f5898n < c0796d.f6440f) {
                    return c0796d;
                }
                return null;
            }
            while (i11 < iArr.length) {
                if (iArr[i11] == i10) {
                    if (t8.f5898n < c0796d.f6440f) {
                        return c0796d;
                    }
                    return null;
                }
                i11++;
            }
        }
        return null;
    }

    @Override // p191p5.c
    public final void e(p191p5.g gVar) {
        int i10;
        int i11;
        int i12;
        int i13;
        int iElapsedRealtime;
        long j;
        long j10;
        C0771d c0771d = this.f5921b;
        if (c0771d.a()) {
            C0806n c0806n = C0805m.a().f6477a;
            if (c0806n == null || c0806n.f6479c) {
                T t8 = (T) c0771d.f5938k.get(this.f5923d);
                if (t8 != null) {
                    Object obj = t8.f5889d;
                    if (obj instanceof AbstractC0794b) {
                        AbstractC0794b abstractC0794b = (AbstractC0794b) obj;
                        long j11 = this.f5924e;
                        int i14 = 0;
                        boolean z10 = j11 > 0;
                        int i15 = abstractC0794b.f6413w;
                        if (c0806n != null) {
                            z10 &= c0806n.f6480d;
                            boolean z11 = abstractC0794b.f6391B != null;
                            i10 = c0806n.f6481e;
                            i11 = c0806n.f6478b;
                            if (!z11 || abstractC0794b.f()) {
                                i12 = c0806n.f6482f;
                            } else {
                                C0796d c0796dA = a(t8, abstractC0794b, this.f5922c);
                                if (c0796dA == null) {
                                    return;
                                }
                                boolean z12 = c0796dA.f6438d && j11 > 0;
                                i12 = c0796dA.f6440f;
                                z10 = z12;
                            }
                        } else {
                            i10 = InAppMessageBase.INAPP_MESSAGE_DURATION_DEFAULT_MILLIS;
                            i11 = 0;
                            i12 = 100;
                        }
                        if (gVar.o()) {
                            i13 = 0;
                        } else if (gVar.m()) {
                            i13 = -1;
                            i14 = 100;
                        } else {
                            Exception excJ = gVar.j();
                            if (excJ instanceof ApiException) {
                                Status statusA = ((ApiException) excJ).a();
                                i14 = statusA.f25308b;
                                C0760b c0760b = statusA.f25311e;
                                if (c0760b != null) {
                                    i13 = c0760b.f5527c;
                                }
                            } else {
                                i14 = R.styleable.AppCompatTheme_switchStyle;
                            }
                            i13 = -1;
                        }
                        if (z10) {
                            long jCurrentTimeMillis = System.currentTimeMillis();
                            iElapsedRealtime = (int) (SystemClock.elapsedRealtime() - this.f5925f);
                            j = j11;
                            j10 = jCurrentTimeMillis;
                        } else {
                            iElapsedRealtime = -1;
                            j = 0;
                            j10 = 0;
                        }
                        d0 d0Var = new d0(new C0802j(this.f5922c, i14, i13, j, j10, null, null, i15, iElapsedRealtime), i11, i10, i12);
                        e5.h hVar = c0771d.f5941n;
                        hVar.sendMessage(hVar.obtainMessage(18, d0Var));
                    }
                }
            }
        }
    }
}
