package bo.app;

import com.braze.support.BrazeLogger;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class d7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d7 f20875a = new d7();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static f6 f20876b;

    public static final class a extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f20877b = new a();

        public a() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Exception initializing static TLS socket factory.";
        }
    }

    public static final class b extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f20878b = new b();

        public b() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Exception setting TLS socket factory on url connection.";
        }
    }

    static {
        try {
            f20876b = new f6();
        } catch (Exception e10) {
            BrazeLogger.INSTANCE.brazelog(f20875a, BrazeLogger.Priority.E, e10, a.f20877b);
        }
    }

    private d7() {
    }

    public final HttpURLConnection a(URL url) {
        kotlin.jvm.internal.i.e(url, "url");
        URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection());
        if (kotlin.jvm.internal.i.a(url.getProtocol(), "https")) {
            try {
                kotlin.jvm.internal.i.c(uRLConnection, "null cannot be cast to non-null type javax.net.ssl.HttpsURLConnection");
                HttpsURLConnection httpsURLConnection = (HttpsURLConnection) uRLConnection;
                f6 f6Var = f20876b;
                if (f6Var == null) {
                    kotlin.jvm.internal.i.m("socketFactory");
                    throw null;
                }
                httpsURLConnection.setSSLSocketFactory(f6Var);
            } catch (Exception e10) {
                BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e10, b.f20878b);
            }
        }
        kotlin.jvm.internal.i.c(uRLConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
        return (HttpURLConnection) uRLConnection;
    }
}
