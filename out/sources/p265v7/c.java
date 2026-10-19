package p265v7;

import D9.o;
import android.content.Context;
import android.content.res.Resources;
import com.google.firebase.perf.v1.NetworkRequestMetric;
import java.net.URI;
import p241t7.a;

/* JADX INFO: compiled from: FirebasePerfNetworkValidator.java */
/* JADX INFO: loaded from: classes3.dex */
public final class c extends e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f47664c = a.d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NetworkRequestMetric f47665a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f47666b;

    public c(NetworkRequestMetric networkRequestMetric, Context context) {
        this.f47666b = context;
        this.f47665a = networkRequestMetric;
    }

    @Override // p265v7.e
    public final boolean a() {
        URI uriCreate;
        NetworkRequestMetric networkRequestMetric = this.f47665a;
        String strE0 = networkRequestMetric.e0();
        boolean zIsEmpty = strE0 == null ? true : strE0.trim().isEmpty();
        a aVar = f47664c;
        if (zIsEmpty) {
            aVar.f();
            return false;
        }
        String strE1 = networkRequestMetric.e0();
        if (strE1 == null) {
            uriCreate = null;
        } else {
            try {
                uriCreate = URI.create(strE1);
            } catch (IllegalArgumentException | IllegalStateException e10) {
                aVar.g("getResultUrl throws exception %s", e10.getMessage());
                uriCreate = null;
            }
        }
        if (uriCreate == null) {
            aVar.f();
            return false;
        }
        Context context = this.f47666b;
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("firebase_performance_whitelisted_domains", "array", context.getPackageName());
        if (identifier != 0) {
            a.d().a();
            if (o.f2901a == null) {
                o.f2901a = resources.getStringArray(identifier);
            }
            String host = uriCreate.getHost();
            if (host != null) {
                String[] strArr = o.f2901a;
                int length = strArr.length;
                int i10 = 0;
                while (true) {
                    if (i10 >= length) {
                        uriCreate.toString();
                        aVar.f();
                        return false;
                    }
                    if (host.contains(strArr[i10])) {
                        break;
                    }
                    i10++;
                }
            }
        }
        String host2 = uriCreate.getHost();
        if (host2 == null || host2.trim().isEmpty() || host2.length() > 255) {
            aVar.f();
            return false;
        }
        String scheme = uriCreate.getScheme();
        if (scheme == null || (!"http".equalsIgnoreCase(scheme) && !"https".equalsIgnoreCase(scheme))) {
            aVar.f();
            return false;
        }
        if (uriCreate.getUserInfo() != null) {
            aVar.f();
            return false;
        }
        int port = uriCreate.getPort();
        if (port != -1 && port <= 0) {
            aVar.f();
            return false;
        }
        NetworkRequestMetric.HttpMethod httpMethodW = networkRequestMetric.g0() ? networkRequestMetric.W() : null;
        if (httpMethodW == null || httpMethodW == NetworkRequestMetric.HttpMethod.HTTP_METHOD_UNKNOWN) {
            networkRequestMetric.W().toString();
            aVar.f();
            return false;
        }
        if (networkRequestMetric.h0() && networkRequestMetric.X() <= 0) {
            aVar.f();
            return false;
        }
        if (networkRequestMetric.i0() && networkRequestMetric.Z() < 0) {
            aVar.f();
            return false;
        }
        if (networkRequestMetric.j0() && networkRequestMetric.a0() < 0) {
            aVar.f();
            return false;
        }
        if (!networkRequestMetric.f0() || networkRequestMetric.U() <= 0) {
            aVar.f();
            return false;
        }
        if (networkRequestMetric.k0() && networkRequestMetric.b0() < 0) {
            aVar.f();
            return false;
        }
        if (networkRequestMetric.m0() && networkRequestMetric.d0() < 0) {
            aVar.f();
            return false;
        }
        if (!networkRequestMetric.l0() || networkRequestMetric.c0() <= 0) {
            aVar.f();
            return false;
        }
        if (networkRequestMetric.h0()) {
            return true;
        }
        aVar.f();
        return false;
    }
}
