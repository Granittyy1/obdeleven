package p145l7;

import com.google.android.gms.internal.measurement.M1;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import p108i7.i;

/* JADX INFO: compiled from: RequestLimiter.java */
/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long f44407d = TimeUnit.HOURS.toMillis(24);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long f44408e = TimeUnit.MINUTES.toMillis(30);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f44409a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f44410b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f44411c;

    public a() {
        if (M1.f25512b == null) {
            Pattern pattern = i.f36769c;
            M1.f25512b = new M1();
        }
        M1 m7 = M1.f25512b;
        if (i.f36770d == null) {
            i.f36770d = new i(m7);
        }
        this.f44409a = i.f36770d;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x001b  */
    public final synchronized boolean a() {
        boolean z10;
        if (this.f44411c != 0) {
            this.f44409a.f36771a.getClass();
            if (System.currentTimeMillis() > this.f44410b) {
                z10 = true;
            } else {
                z10 = false;
            }
        } else {
            z10 = true;
        }
        return z10;
    }

    public final synchronized void b(int i10) {
        long jMin;
        if ((i10 >= 200 && i10 < 300) || i10 == 401 || i10 == 404) {
            synchronized (this) {
                this.f44411c = 0;
            }
            return;
        }
        this.f44411c++;
        synchronized (this) {
            try {
                if (i10 == 429 || (i10 >= 500 && i10 < 600)) {
                    double dPow = Math.pow(2.0d, this.f44411c);
                    this.f44409a.getClass();
                    jMin = (long) Math.min(dPow + ((long) (Math.random() * 1000.0d)), f44408e);
                } else {
                    jMin = f44407d;
                }
                this.f44409a.f36771a.getClass();
                this.f44410b = System.currentTimeMillis() + jMin;
            } catch (Throwable th) {
                throw th;
            }
        }
        return;
        throw th;
    }
}
