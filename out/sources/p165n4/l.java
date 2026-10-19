package p165n4;

import Z3.q;
import com.facebook.LoggingBehavior;
import java.util.HashMap;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: Logger.kt */
/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f44910c = new a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final HashMap<String, String> f44911d = new HashMap<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f44912a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public StringBuilder f44913b;

    /* JADX INFO: compiled from: Logger.kt */
    public static final class a {
        public static void a(LoggingBehavior loggingBehavior, String tag, String string) {
            i.e(tag, "tag");
            i.e(string, "string");
            c(loggingBehavior, tag, string);
        }

        public static void b(LoggingBehavior loggingBehavior, String tag, String str, Object... objArr) {
            i.e(tag, "tag");
            synchronized (q.f7853b) {
            }
        }

        public static void c(LoggingBehavior loggingBehavior, String tag, String string) {
            i.e(tag, "tag");
            i.e(string, "string");
            synchronized (q.f7853b) {
            }
        }

        public final synchronized void d(String accessToken) {
            i.e(accessToken, "accessToken");
            q qVar = q.f7852a;
            synchronized (q.f7853b) {
            }
            synchronized (this) {
                l.f44911d.put(accessToken, "ACCESS_TOKEN_REMOVED");
            }
        }
    }

    public l() {
        t.d("Request", "tag");
        this.f44912a = i.k("Request", "FacebookSDK.");
        this.f44913b = new StringBuilder();
    }

    public final void a(Object value, String key) {
        i.e(key, "key");
        i.e(value, "value");
        b();
    }

    public final void b() {
        q qVar = q.f7852a;
        synchronized (q.f7853b) {
        }
    }
}
