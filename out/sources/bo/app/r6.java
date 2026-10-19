package bo.app;

import android.util.Base64;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import com.braze.support.StringUtils;

/* JADX INFO: loaded from: classes.dex */
public abstract class r6 implements x2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f21858d = BrazeLogger.getBrazeLogTag((Class<?>) r6.class);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f21859a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f21860b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private a2 f21861c;

    public r6() {
        long jNowInMilliseconds = DateTimeUtils.nowInMilliseconds();
        this.f21860b = jNowInMilliseconds;
        this.f21859a = jNowInMilliseconds / 1000;
    }

    @Override // bo.app.x2
    public a2 a() {
        return this.f21861c;
    }

    @Override // bo.app.x2
    public long b() {
        return this.f21859a;
    }

    @Override // bo.app.x2
    public long e() {
        return this.f21860b;
    }

    public String a(String str) {
        if (StringUtils.isNullOrBlank(str)) {
            return null;
        }
        try {
            return new String(Base64.decode(str, 0)).split("_")[0];
        } catch (Exception e10) {
            BrazeLogger.e(f21858d, "Unexpected error decoding Base64 encoded campaign Id " + str, e10);
            return null;
        }
    }

    public r6(a2 a2Var) {
        this();
        this.f21861c = a2Var;
    }
}
