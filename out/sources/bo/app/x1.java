package bo.app;

import android.net.TrafficStats;
import com.braze.Constants;
import com.braze.support.BrazeLogger;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.zip.GZIPInputStream;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class x1 implements l2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f22169b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f22170c = (int) TimeUnit.SECONDS.toMillis(15);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f22171a;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.e eVar) {
            this();
        }

        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final InputStream a(HttpURLConnection httpURLConnection) throws r3, IOException {
            httpURLConnection.connect();
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode / 100 == 2) {
                return "gzip".equalsIgnoreCase(httpURLConnection.getContentEncoding()) ? new GZIPInputStream(httpURLConnection.getInputStream()) : new BufferedInputStream(httpURLConnection.getInputStream());
            }
            StringBuilder sbE = A8.f.e(responseCode, "Bad HTTP response code from Braze: [", "] to url: ");
            sbE.append(httpURLConnection.getURL());
            throw new r3(sbE.toString());
        }
    }

    public static final class b extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ g5 f22172b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(g5 g5Var) {
            super(0);
            this.f22172b = g5Var;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed request to [" + this.f22172b + ']';
        }
    }

    public x1(int i10) {
        this.f22171a = i10;
    }

    @Override // bo.app.l2
    public l2.a a(g5 requestTarget, Map requestHeaders, JSONObject payload) {
        kotlin.jvm.internal.i.e(requestTarget, "requestTarget");
        kotlin.jvm.internal.i.e(requestHeaders, "requestHeaders");
        kotlin.jvm.internal.i.e(payload, "payload");
        TrafficStats.setThreadStatsTag(Constants.TRAFFIC_STATS_THREAD_TAG);
        URL urlB = requestTarget.b();
        Map mapP = kotlin.collections.y.p();
        int responseCode = -1;
        try {
            HttpURLConnection httpURLConnectionA = a(urlB, payload, requestHeaders);
            responseCode = httpURLConnectionA.getResponseCode();
            Map<String, List<String>> headerFields = httpURLConnectionA.getHeaderFields();
            kotlin.jvm.internal.i.d(headerFields, "connection.headerFields");
            mapP = com.braze.support.g.a(headerFields);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(f22169b.a(httpURLConnectionA), kotlin.text.a.f43120b), 8192);
            try {
                String strE = p006a5.a.e(bufferedReader);
                p241t7.b.n(bufferedReader, null);
                return new l2.a(responseCode, mapP, new JSONObject(strE));
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    p241t7.b.n(bufferedReader, th);
                    throw th2;
                }
            }
        } catch (Exception e10) {
            int i10 = responseCode;
            Map map = mapP;
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e10, new b(requestTarget));
            return new l2.a(i10, map, null, 4, null);
        }
    }

    private final HttpURLConnection a(URL url, JSONObject jSONObject, Map map) throws IOException {
        String string = jSONObject.toString();
        kotlin.jvm.internal.i.d(string, "payload.toString()");
        Charset charsetForName = Charset.forName("UTF-8");
        kotlin.jvm.internal.i.d(charsetForName, "forName(charsetName)");
        byte[] bytes = string.getBytes(charsetForName);
        kotlin.jvm.internal.i.d(bytes, "this as java.lang.String).getBytes(charset)");
        HttpURLConnection httpURLConnectionA = d7.f20875a.a(url);
        for (Map.Entry entry : map.entrySet()) {
            httpURLConnectionA.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        httpURLConnectionA.setConnectTimeout(f22170c);
        httpURLConnectionA.setReadTimeout(this.f22171a);
        httpURLConnectionA.setUseCaches(false);
        httpURLConnectionA.setInstanceFollowRedirects(false);
        httpURLConnectionA.setRequestMethod("POST");
        httpURLConnectionA.setDoOutput(true);
        httpURLConnectionA.setFixedLengthStreamingMode(bytes.length);
        OutputStream outputStream = httpURLConnectionA.getOutputStream();
        try {
            outputStream.write(bytes);
            p293xa.r rVar = p293xa.r.f47939a;
            p241t7.b.n(outputStream, null);
            return httpURLConnectionA;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                p241t7.b.n(outputStream, th);
                throw th2;
            }
        }
    }
}
