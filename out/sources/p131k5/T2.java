package p131k5;

import O4.a;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.SystemClock;
import android.util.Pair;
import com.google.android.gms.measurement.internal.h;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Locale;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class T2 extends m3 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f41995d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final P0 f41996e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final P0 f41997f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final P0 f41998g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final P0 f41999h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final P0 f42000i;

    public T2(h hVar) {
        super(hVar);
        this.f41995d = new HashMap();
        this.f41996e = new P0(n(), "last_delete_stale", 0L);
        this.f41997f = new P0(n(), "backoff", 0L);
        this.f41998g = new P0(n(), "last_upload", 0L);
        this.f41999h = new P0(n(), "last_upload_attempt", 0L);
        this.f42000i = new P0(n(), "midnight_offset", 0L);
    }

    @Override // p131k5.m3
    public final boolean v() {
        return false;
    }

    @Deprecated
    public final String w(String str, boolean z10) {
        p();
        String str2 = z10 ? (String) y(str).first : "00000000-0000-0000-0000-000000000000";
        MessageDigest messageDigestD0 = z3.D0();
        if (messageDigestD0 == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new BigInteger(1, messageDigestD0.digest(str2.getBytes())));
    }

    @Deprecated
    public final Pair<String, Boolean> y(String str) {
        S2 s10;
        a.C0072a c0072aA;
        p();
        C2523i1 c2523i1 = (C2523i1) this.f3968a;
        c2523i1.f42224n.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        HashMap map = this.f41995d;
        S2 s11 = (S2) map.get(str);
        if (s11 != null && jElapsedRealtime < s11.f41985c) {
            return new Pair<>(s11.f41983a, Boolean.valueOf(s11.f41984b));
        }
        C2501e c2501e = c2523i1.f42218g;
        c2501e.getClass();
        long jV = c2501e.v(str, B.f41663c) + jElapsedRealtime;
        try {
            long jV2 = c2501e.v(str, B.f41665d);
            Context context = c2523i1.f42212a;
            if (jV2 > 0) {
                try {
                    c0072aA = a.a(context);
                } catch (PackageManager.NameNotFoundException unused) {
                    if (s11 != null && jElapsedRealtime < s11.f41985c + jV2) {
                        return new Pair<>(s11.f41983a, Boolean.valueOf(s11.f41984b));
                    }
                    c0072aA = null;
                }
            } else {
                c0072aA = a.a(context);
            }
            if (c0072aA == null) {
                return new Pair<>("00000000-0000-0000-0000-000000000000", Boolean.FALSE);
            }
            String str2 = c0072aA.f4852a;
            boolean z10 = c0072aA.f4853b;
            s10 = str2 != null ? new S2(jV, str2, z10) : new S2(jV, "", z10);
            map.put(str, s10);
            return new Pair<>(s10.f41983a, Boolean.valueOf(s10.f41984b));
        } catch (Exception e10) {
            d().f41718m.b(e10, "Unable to get advertising id");
            s10 = new S2(jV, "", false);
        }
    }
}
