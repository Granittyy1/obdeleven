package p277w7;

import com.google.firebase.perf.v1.NetworkRequestMetric;
import java.util.regex.Pattern;
import org.apache.http.Header;
import org.apache.http.HttpMessage;
import org.apache.http.HttpResponse;
import p241t7.a;
import p253u7.c;

/* JADX INFO: compiled from: NetworkRequestMetricBuilderUtil.java */
/* JADX INFO: loaded from: classes3.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f47792a = Pattern.compile("(^|.*\\s)datatransport/\\S+ android/($|\\s.*)");

    public static Long a(HttpMessage httpMessage) {
        try {
            Header firstHeader = httpMessage.getFirstHeader("content-length");
            if (firstHeader != null) {
                return Long.valueOf(Long.parseLong(firstHeader.getValue()));
            }
            return null;
        } catch (NumberFormatException unused) {
            a.d().a();
            return null;
        }
    }

    public static String b(HttpResponse httpResponse) {
        String value;
        Header firstHeader = httpResponse.getFirstHeader("content-type");
        if (firstHeader == null || (value = firstHeader.getValue()) == null) {
            return null;
        }
        return value;
    }

    public static void c(c cVar) {
        if (!((NetworkRequestMetric) cVar.f47446e.f29047c).h0()) {
            NetworkRequestMetric.a aVar = cVar.f47446e;
            aVar.r();
            NetworkRequestMetric.I((NetworkRequestMetric) aVar.f29047c);
        }
        cVar.b();
    }
}
