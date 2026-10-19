package bo.app;

import android.content.Context;
import android.content.SharedPreferences;
import com.braze.support.DateTimeUtils;

/* JADX INFO: loaded from: classes.dex */
public final class z0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f22259b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SharedPreferences f22260a;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.e eVar) {
            this();
        }

        private a() {
        }
    }

    public z0(Context context) {
        kotlin.jvm.internal.i.e(context, "context");
        SharedPreferences sharedPreferences = context.getSharedPreferences("persistent.com.braze.requests.metadata.last_req_at", 0);
        kotlin.jvm.internal.i.d(sharedPreferences, "context.getSharedPrefere…LE, Context.MODE_PRIVATE)");
        this.f22260a = sharedPreferences;
    }

    private final long a(boolean z10) {
        return z10 ? 2L : 1L;
    }

    public final void b(g5 target, boolean z10) {
        kotlin.jvm.internal.i.e(target, "target");
        this.f22260a.edit().putLong(a(target.c()), a(z10)).apply();
    }

    public final long a(g5 target) {
        kotlin.jvm.internal.i.e(target, "target");
        String str = "uri-" + target.c().hashCode();
        long j = this.f22260a.getLong(str, 0L);
        long jNowInMilliseconds = DateTimeUtils.nowInMilliseconds();
        this.f22260a.edit().putLong(str, jNowInMilliseconds).apply();
        return Math.min(jNowInMilliseconds - j, 7200000L);
    }

    public final long a(g5 target, boolean z10) {
        kotlin.jvm.internal.i.e(target, "target");
        String strA = a(target.c());
        long j = this.f22260a.getLong(strA, a(z10));
        this.f22260a.edit().putLong(strA, 1 + j).apply();
        return j;
    }

    private final String a(String str) {
        return "uri-at-" + str.hashCode();
    }
}
