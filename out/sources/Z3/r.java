package Z3;

import android.database.Cursor;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.braze.Constants;
import com.facebook.FacebookException;
import com.facebook.HttpMethod;
import com.facebook.LoggingBehavior;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import io.intercom.android.sdk.models.carousel.AppearanceType;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: GraphRequest.kt */
/* JADX INFO: loaded from: classes.dex */
public final class r {
    public static final String j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Pattern f7871k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static volatile String f7872l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0835a f7873a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f7874b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public JSONObject f7875c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Bundle f7876d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f7877e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f7878f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public b f7879g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public HttpMethod f7880h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f7881i;

    /* JADX INFO: compiled from: GraphRequest.kt */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final r f7882a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Object f7883b;

        public a(r rVar, Object obj) {
            this.f7882a = rVar;
            this.f7883b = obj;
        }
    }

    /* JADX INFO: compiled from: GraphRequest.kt */
    public interface b {
        void b(x xVar);
    }

    /* JADX INFO: compiled from: GraphRequest.kt */
    public static final class c {
        public static final String a(Object obj) {
            String str = r.j;
            if (obj instanceof String) {
                return (String) obj;
            }
            if ((obj instanceof Boolean) || (obj instanceof Number)) {
                return obj.toString();
            }
            if (!(obj instanceof Date)) {
                throw new IllegalArgumentException("Unsupported parameter type.");
            }
            String str2 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.US).format((Date) obj);
            kotlin.jvm.internal.i.d(str2, "iso8601DateFormat.format(value)");
            return str2;
        }

        public static HttpURLConnection b(URL url) throws IOException {
            URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection());
            if (uRLConnection == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.net.HttpURLConnection");
            }
            HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnection;
            if (r.f7872l == null) {
                r.f7872l = String.format("%s.%s", Arrays.copyOf(new Object[]{"FBAndroidSDK", "16.2.0"}, 2));
            }
            httpURLConnection.setRequestProperty("User-Agent", r.f7872l);
            httpURLConnection.setRequestProperty("Accept-Language", Locale.getDefault().toString());
            httpURLConnection.setChunkedStreamingMode(0);
            return httpURLConnection;
        }

        public static ArrayList c(w requests) throws Throwable {
            Exception exc;
            HttpURLConnection httpURLConnectionP;
            ArrayList arrayListD;
            kotlin.jvm.internal.i.e(requests, "requests");
            p165n4.t.c(requests);
            HttpURLConnection httpURLConnection = null;
            try {
                httpURLConnectionP = p(requests);
                exc = null;
            } catch (Exception e10) {
                exc = e10;
                httpURLConnectionP = null;
            } catch (Throwable th) {
                th = th;
                p165n4.s.k(httpURLConnection);
                throw th;
            }
            try {
                if (httpURLConnectionP != null) {
                    arrayListD = d(requests, httpURLConnectionP);
                } else {
                    ArrayList arrayListA = x.a.a(requests.f7900d, null, new FacebookException(exc));
                    m(requests, arrayListA);
                    arrayListD = arrayListA;
                }
                p165n4.s.k(httpURLConnectionP);
                return arrayListD;
            } catch (Throwable th2) {
                th = th2;
                httpURLConnection = httpURLConnectionP;
                p165n4.s.k(httpURLConnection);
                throw th;
            }
        }

        public static ArrayList d(w requests, HttpURLConnection connection) {
            ArrayList arrayListA;
            kotlin.jvm.internal.i.e(connection, "connection");
            kotlin.jvm.internal.i.e(requests, "requests");
            LoggingBehavior loggingBehavior = LoggingBehavior.f24774b;
            InputStream errorStream = null;
            try {
                try {
                    try {
                        if (!q.g()) {
                            Log.e("Z3.x", "GraphRequest can't be used when Facebook SDK isn't fully initialized");
                            throw new FacebookException("GraphRequest can't be used when Facebook SDK isn't fully initialized");
                        }
                        errorStream = connection.getResponseCode() >= 400 ? connection.getErrorStream() : connection.getInputStream();
                        arrayListA = x.a.c(errorStream, connection, requests);
                        p165n4.s.e(errorStream);
                        p165n4.s.k(connection);
                        int size = requests.f7900d.size();
                        if (size != arrayListA.size()) {
                            throw new FacebookException(String.format(Locale.US, "Received %d responses while expecting %d", Arrays.copyOf(new Object[]{Integer.valueOf(arrayListA.size()), Integer.valueOf(size)}, 2)));
                        }
                        m(requests, arrayListA);
                        C0841g c0841gA = C0841g.f7810f.a();
                        C0835a c0835a = c0841gA.f7814c;
                        if (c0835a != null) {
                            long time = new Date().getTime();
                            if (c0835a.f7790g.a() && time - c0841gA.f7816e.getTime() > 3600000 && time - c0835a.f7791h.getTime() > 86400000) {
                                if (kotlin.jvm.internal.i.a(Looper.getMainLooper(), Looper.myLooper())) {
                                    c0841gA.a();
                                } else {
                                    new Handler(Looper.getMainLooper()).post(new RunnableC0837c(0, c0841gA));
                                }
                            }
                        }
                        return arrayListA;
                    } catch (Exception e10) {
                        n4.l.a aVar = p165n4.l.f44910c;
                        n4.l.a.b(loggingBehavior, "Response", "Response <Error>: %s", e10);
                        arrayListA = x.a.a(requests, connection, new FacebookException(e10));
                    }
                } catch (FacebookException e11) {
                    n4.l.a aVar2 = p165n4.l.f44910c;
                    n4.l.a.b(loggingBehavior, "Response", "Response <Error>: %s", e11);
                    arrayListA = x.a.a(requests, connection, e11);
                }
            } catch (Throwable th) {
                p165n4.s.e(null);
                throw th;
            }
        }

        public static boolean e(Object obj) {
            return (obj instanceof Bitmap) || (obj instanceof byte[]) || (obj instanceof Uri) || (obj instanceof ParcelFileDescriptor) || (obj instanceof g);
        }

        public static boolean f(Object obj) {
            return (obj instanceof String) || (obj instanceof Boolean) || (obj instanceof Number) || (obj instanceof Date);
        }

        public static r g(C0835a c0835a, String str, b bVar) {
            return new r(c0835a, str, null, null, bVar, 32);
        }

        public static r h(C0835a c0835a, final d dVar) {
            return new r(c0835a, "me", null, null, new b() { // from class: Z3.s
                @Override // Z3.r.b
                public final void b(x xVar) {
                    r.d dVar2 = dVar;
                    if (dVar2 == null) {
                        return;
                    }
                    dVar2.a(xVar.f7904b);
                }
            }, 32);
        }

        public static r i(C0835a c0835a, String str, JSONObject jSONObject, b bVar) {
            r rVar = new r(c0835a, str, null, HttpMethod.f24772c, bVar, 32);
            rVar.f7875c = jSONObject;
            return rVar;
        }

        /* JADX WARN: Code duplicated, block: B:11:0x002a  */
        public static void j(JSONObject jSONObject, String str, e eVar) {
            String strGroup;
            boolean z10;
            Matcher matcher = r.f7871k.matcher(str);
            if (matcher.matches()) {
                strGroup = matcher.group(1);
                kotlin.jvm.internal.i.d(strGroup, "matcher.group(1)");
            } else {
                strGroup = str;
            }
            if (kotlin.text.m.I(strGroup, "me/", false) || kotlin.text.m.I(strGroup, "/me/", false)) {
                int iQ = kotlin.text.n.Q(str, ":", 0, false, 6);
                int iQ2 = kotlin.text.n.Q(str, "?", 0, false, 6);
                if (iQ <= 3 || (iQ2 != -1 && iQ >= iQ2)) {
                    z10 = false;
                } else {
                    z10 = true;
                }
            } else {
                z10 = false;
            }
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String key = itKeys.next();
                Object value = jSONObject.opt(key);
                boolean z11 = z10 && kotlin.text.m.D(key, AppearanceType.IMAGE, true);
                kotlin.jvm.internal.i.d(key, "key");
                kotlin.jvm.internal.i.d(value, "value");
                k(key, value, eVar, z11);
            }
        }

        public static void k(String str, Object obj, e eVar, boolean z10) {
            Class<?> cls = obj.getClass();
            if (JSONObject.class.isAssignableFrom(cls)) {
                JSONObject jSONObject = (JSONObject) obj;
                if (z10) {
                    Iterator<String> itKeys = jSONObject.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        String str2 = String.format("%s[%s]", Arrays.copyOf(new Object[]{str, next}, 2));
                        Object objOpt = jSONObject.opt(next);
                        kotlin.jvm.internal.i.d(objOpt, "jsonObject.opt(propertyName)");
                        k(str2, objOpt, eVar, z10);
                    }
                    return;
                }
                if (jSONObject.has("id")) {
                    String strOptString = jSONObject.optString("id");
                    kotlin.jvm.internal.i.d(strOptString, "jsonObject.optString(\"id\")");
                    k(str, strOptString, eVar, z10);
                    return;
                } else if (jSONObject.has(Constants.BRAZE_WEBVIEW_URL_EXTRA)) {
                    String strOptString2 = jSONObject.optString(Constants.BRAZE_WEBVIEW_URL_EXTRA);
                    kotlin.jvm.internal.i.d(strOptString2, "jsonObject.optString(\"url\")");
                    k(str, strOptString2, eVar, z10);
                    return;
                } else {
                    if (jSONObject.has("fbsdk:create_object")) {
                        String string = jSONObject.toString();
                        kotlin.jvm.internal.i.d(string, "jsonObject.toString()");
                        k(str, string, eVar, z10);
                        return;
                    }
                    return;
                }
            }
            if (!JSONArray.class.isAssignableFrom(cls)) {
                if (String.class.isAssignableFrom(cls) || Number.class.isAssignableFrom(cls) || Boolean.class.isAssignableFrom(cls)) {
                    eVar.a(str, obj.toString());
                    return;
                }
                if (!Date.class.isAssignableFrom(cls)) {
                    String str3 = r.j;
                    q qVar = q.f7852a;
                    return;
                } else {
                    String str4 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.US).format((Date) obj);
                    kotlin.jvm.internal.i.d(str4, "iso8601DateFormat.format(date)");
                    eVar.a(str, str4);
                    return;
                }
            }
            JSONArray jSONArray = (JSONArray) obj;
            int length = jSONArray.length();
            if (length <= 0) {
                return;
            }
            int i10 = 0;
            while (true) {
                int i11 = i10 + 1;
                String str5 = String.format(Locale.ROOT, "%s[%d]", Arrays.copyOf(new Object[]{str, Integer.valueOf(i10)}, 2));
                Object objOpt2 = jSONArray.opt(i10);
                kotlin.jvm.internal.i.d(objOpt2, "jsonArray.opt(i)");
                k(str5, objOpt2, eVar, z10);
                if (i11 >= length) {
                    return;
                } else {
                    i10 = i11;
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v1 */
        /* JADX WARN: Type inference failed for: r3v12 */
        /* JADX WARN: Type inference failed for: r3v2, types: [boolean, int] */
        public static void l(w wVar, p165n4.l lVar, int i10, URL url, OutputStream outputStream, boolean z10) throws Throwable {
            String strB;
            h hVar = new h(outputStream, lVar, z10);
            ?? r10 = 1;
            if (i10 == 1) {
                r rVar = (r) wVar.f7900d.get(0);
                HashMap map = new HashMap();
                for (String key : rVar.f7876d.keySet()) {
                    Object obj = rVar.f7876d.get(key);
                    if (e(obj)) {
                        kotlin.jvm.internal.i.d(key, "key");
                        map.put(key, new a(rVar, obj));
                    }
                }
                if (lVar != null) {
                    lVar.b();
                }
                Bundle bundle = rVar.f7876d;
                for (String key2 : bundle.keySet()) {
                    Object obj2 = bundle.get(key2);
                    if (f(obj2)) {
                        kotlin.jvm.internal.i.d(key2, "key");
                        hVar.g(key2, obj2, rVar);
                    }
                }
                if (lVar != null) {
                    lVar.b();
                }
                n(map, hVar);
                JSONObject jSONObject = rVar.f7875c;
                if (jSONObject != null) {
                    String path = url.getPath();
                    kotlin.jvm.internal.i.d(path, "url.path");
                    j(jSONObject, path, hVar);
                    return;
                }
                return;
            }
            wVar.getClass();
            Iterator<r> it = wVar.iterator();
            while (true) {
                if (it.hasNext()) {
                    C0835a c0835a = it.next().f7873a;
                    if (c0835a != null) {
                        strB = c0835a.f7792i;
                        break;
                    }
                } else {
                    String str = r.j;
                    strB = q.b();
                    break;
                }
            }
            if (strB.length() == 0) {
                throw new FacebookException("App ID was not specified at the request or Settings.");
            }
            hVar.a("batch_app_id", strB);
            HashMap map2 = new HashMap();
            JSONArray jSONArray = new JSONArray();
            for (r rVar2 : wVar) {
                rVar2.getClass();
                JSONObject jSONObject2 = new JSONObject();
                int i11 = p165n4.p.f44923a;
                String strH = rVar2.h(String.format("https://graph.%s", Arrays.copyOf(new Object[]{q.e()}, (int) r10)));
                rVar2.a();
                Uri uri = Uri.parse(rVar2.b(strH, r10));
                String str2 = String.format("%s?%s", Arrays.copyOf(new Object[]{uri.getPath(), uri.getQuery()}, 2));
                jSONObject2.put("relative_url", str2);
                jSONObject2.put("method", rVar2.f7880h);
                C0835a c0835a2 = rVar2.f7873a;
                if (c0835a2 != null) {
                    p165n4.l.f44910c.d(c0835a2.f7789f);
                }
                ArrayList arrayList = new ArrayList();
                Iterator<String> it2 = rVar2.f7876d.keySet().iterator();
                while (true) {
                    boolean zHasNext = it2.hasNext();
                    String str3 = r.j;
                    if (!zHasNext) {
                        break;
                    }
                    Object obj3 = rVar2.f7876d.get(it2.next());
                    if (e(obj3)) {
                        String str4 = String.format(Locale.ROOT, "%s%d", Arrays.copyOf(new Object[]{"file", Integer.valueOf(map2.size())}, 2));
                        arrayList.add(str4);
                        map2.put(str4, new a(rVar2, obj3));
                    }
                }
                if (!arrayList.isEmpty()) {
                    jSONObject2.put("attached_files", TextUtils.join(",", arrayList));
                }
                JSONObject jSONObject3 = rVar2.f7875c;
                if (jSONObject3 != null) {
                    ArrayList arrayList2 = new ArrayList();
                    j(jSONObject3, str2, new u(arrayList2));
                    jSONObject2.put("body", TextUtils.join("&", arrayList2));
                }
                jSONArray.put(jSONObject2);
                r10 = 1;
            }
            Closeable closeable = hVar.f7886a;
            if (closeable instanceof E) {
                E e10 = (E) closeable;
                hVar.c("batch", null, null);
                hVar.b("[", new Object[0]);
                int i12 = 0;
                for (r rVar3 : wVar) {
                    int i13 = i12 + 1;
                    JSONObject jSONObject4 = jSONArray.getJSONObject(i12);
                    e10.b(rVar3);
                    if (i12 > 0) {
                        hVar.b(",%s", jSONObject4.toString());
                    } else {
                        hVar.b("%s", jSONObject4.toString());
                    }
                    i12 = i13;
                }
                hVar.b("]", new Object[0]);
                p165n4.l lVar2 = hVar.f7887b;
                if (lVar2 != null) {
                    String strK = kotlin.jvm.internal.i.k("batch", "    ");
                    String string = jSONArray.toString();
                    kotlin.jvm.internal.i.d(string, "requestJsonArray.toString()");
                    lVar2.a(string, strK);
                }
            } else {
                String string2 = jSONArray.toString();
                kotlin.jvm.internal.i.d(string2, "requestJsonArray.toString()");
                hVar.a("batch", string2);
            }
            if (lVar != null) {
                lVar.b();
            }
            n(map2, hVar);
        }

        public static void m(w requests, ArrayList arrayList) {
            kotlin.jvm.internal.i.e(requests, "requests");
            int size = requests.f7900d.size();
            ArrayList arrayList2 = new ArrayList();
            if (size > 0) {
                int i10 = 0;
                while (true) {
                    int i11 = i10 + 1;
                    r rVar = (r) requests.f7900d.get(i10);
                    if (rVar.f7879g != null) {
                        arrayList2.add(new Pair(rVar.f7879g, arrayList.get(i10)));
                    }
                    if (i11 >= size) {
                        break;
                    } else {
                        i10 = i11;
                    }
                }
            }
            if (arrayList2.size() > 0) {
                t tVar = new t(arrayList2, 0, requests);
                Handler handler = requests.f7898b;
                if ((handler == null ? null : Boolean.valueOf(handler.post(tVar))) == null) {
                    tVar.run();
                }
            }
        }

        public static void n(HashMap map, h hVar) throws Throwable {
            for (Map.Entry entry : map.entrySet()) {
                String str = r.j;
                if (e(((a) entry.getValue()).f7883b)) {
                    hVar.g((String) entry.getKey(), ((a) entry.getValue()).f7883b, ((a) entry.getValue()).f7882a);
                }
            }
        }

        /* JADX WARN: Code duplicated, block: B:54:0x0169  */
        public static void o(w requests, HttpURLConnection httpURLConnection) throws Throwable {
            boolean z10;
            FilterOutputStream gZIPOutputStream;
            kotlin.jvm.internal.i.e(requests, "requests");
            p165n4.l lVar = new p165n4.l();
            int size = requests.f7900d.size();
            Iterator<r> it = requests.iterator();
            loop0: while (true) {
                if (!it.hasNext()) {
                    z10 = true;
                    break;
                }
                r next = it.next();
                Iterator<String> it2 = next.f7876d.keySet().iterator();
                while (it2.hasNext()) {
                    if (e(next.f7876d.get(it2.next()))) {
                        z10 = false;
                        break loop0;
                    }
                }
            }
            FilterOutputStream filterOutputStream = null;
            HttpMethod httpMethod = size == 1 ? ((r) requests.f7900d.get(0)).f7880h : null;
            HttpMethod httpMethod2 = HttpMethod.f24772c;
            if (httpMethod == null) {
                httpMethod = httpMethod2;
            }
            httpURLConnection.setRequestMethod(httpMethod.name());
            if (z10) {
                httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
                httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
            } else {
                httpURLConnection.setRequestProperty("Content-Type", String.format("multipart/form-data; boundary=%s", Arrays.copyOf(new Object[]{r.j}, 1)));
            }
            URL url = httpURLConnection.getURL();
            lVar.b();
            lVar.a(requests.f7899c, "Id");
            kotlin.jvm.internal.i.d(url, "url");
            lVar.a(url, "URL");
            String requestMethod = httpURLConnection.getRequestMethod();
            kotlin.jvm.internal.i.d(requestMethod, "connection.requestMethod");
            lVar.a(requestMethod, "Method");
            String requestProperty = httpURLConnection.getRequestProperty("User-Agent");
            kotlin.jvm.internal.i.d(requestProperty, "connection.getRequestProperty(\"User-Agent\")");
            lVar.a(requestProperty, "User-Agent");
            String requestProperty2 = httpURLConnection.getRequestProperty("Content-Type");
            kotlin.jvm.internal.i.d(requestProperty2, "connection.getRequestProperty(\"Content-Type\")");
            lVar.a(requestProperty2, "Content-Type");
            httpURLConnection.setConnectTimeout(0);
            httpURLConnection.setReadTimeout(0);
            LoggingBehavior loggingBehavior = LoggingBehavior.f24774b;
            String str = lVar.f44912a;
            if (httpMethod != httpMethod2) {
                String string = lVar.f44913b.toString();
                kotlin.jvm.internal.i.d(string, "contents.toString()");
                n4.l.a.c(loggingBehavior, str, string);
                lVar.f44913b = new StringBuilder();
                return;
            }
            httpURLConnection.setDoOutput(true);
            try {
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
                if (z10) {
                    try {
                        gZIPOutputStream = new GZIPOutputStream(bufferedOutputStream);
                    } catch (Throwable th) {
                        th = th;
                        filterOutputStream = bufferedOutputStream;
                        if (filterOutputStream != null) {
                            filterOutputStream.close();
                        }
                        throw th;
                    }
                } else {
                    gZIPOutputStream = bufferedOutputStream;
                }
                try {
                    Iterator it3 = requests.f7901e.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            Iterator<r> it4 = requests.iterator();
                            while (it4.hasNext()) {
                                if (it4.next().f7879g instanceof f) {
                                }
                            }
                            break;
                        }
                        if (((w.a) it3.next()) instanceof w.b) {
                        }
                        B b10 = new B(requests.f7898b);
                        l(requests, null, size, url, b10, z10);
                        gZIPOutputStream = new D(gZIPOutputStream, requests, b10.f7747c, b10.f7750f);
                        break;
                    }
                    l(requests, lVar, size, url, gZIPOutputStream, z10);
                    gZIPOutputStream.close();
                    String string2 = lVar.f44913b.toString();
                    kotlin.jvm.internal.i.d(string2, "contents.toString()");
                    n4.l.a.c(loggingBehavior, str, string2);
                    lVar.f44913b = new StringBuilder();
                } catch (Throwable th2) {
                    th = th2;
                    filterOutputStream = gZIPOutputStream;
                    if (filterOutputStream != null) {
                        filterOutputStream.close();
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }

        public static HttpURLConnection p(w requests) throws Throwable {
            URL url;
            kotlin.jvm.internal.i.e(requests, "requests");
            for (r rVar : requests) {
                if (HttpMethod.f24771b == rVar.f7880h && p165n4.s.y(rVar.f7876d.getString("fields"))) {
                    n4.l.a aVar = p165n4.l.f44910c;
                    LoggingBehavior loggingBehavior = LoggingBehavior.f24777e;
                    StringBuilder sb2 = new StringBuilder("GET requests for /");
                    String str = rVar.f7874b;
                    if (str == null) {
                        str = "";
                    }
                    sb2.append(str);
                    sb2.append(" should contain an explicit \"fields\" parameter.");
                    n4.l.a.c(loggingBehavior, "Request", sb2.toString());
                }
            }
            try {
                if (requests.f7900d.size() == 1) {
                    url = new URL(((r) requests.f7900d.get(0)).g());
                } else {
                    int i10 = p165n4.p.f44923a;
                    url = new URL(String.format("https://graph.%s", Arrays.copyOf(new Object[]{q.e()}, 1)));
                }
                HttpURLConnection httpURLConnectionB = null;
                try {
                    httpURLConnectionB = b(url);
                    o(requests, httpURLConnectionB);
                    return httpURLConnectionB;
                } catch (IOException e10) {
                    p165n4.s.k(httpURLConnectionB);
                    throw new FacebookException("could not construct request body", e10);
                } catch (JSONException e11) {
                    p165n4.s.k(httpURLConnectionB);
                    throw new FacebookException("could not construct request body", e11);
                }
            } catch (MalformedURLException e12) {
                throw new FacebookException("could not construct URL for request", e12);
            }
        }
    }

    /* JADX INFO: compiled from: GraphRequest.kt */
    public interface d {
        void a(JSONObject jSONObject);
    }

    /* JADX INFO: compiled from: GraphRequest.kt */
    public interface e {
        void a(String str, String str2);
    }

    /* JADX INFO: compiled from: GraphRequest.kt */
    public interface f extends b {
        void a();
    }

    /* JADX INFO: compiled from: GraphRequest.kt */
    public static final class h implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final OutputStream f7886a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final p165n4.l f7887b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f7888c = true;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f7889d;

        public h(OutputStream outputStream, p165n4.l lVar, boolean z10) {
            this.f7886a = outputStream;
            this.f7887b = lVar;
            this.f7889d = z10;
        }

        @Override // Z3.r.e
        public final void a(String key, String value) throws IOException {
            kotlin.jvm.internal.i.e(key, "key");
            kotlin.jvm.internal.i.e(value, "value");
            c(key, null, null);
            f("%s", value);
            h();
            p165n4.l lVar = this.f7887b;
            if (lVar == null) {
                return;
            }
            lVar.a(value, kotlin.jvm.internal.i.k(key, "    "));
        }

        public final void b(String str, Object... args) throws IOException {
            kotlin.jvm.internal.i.e(args, "args");
            OutputStream outputStream = this.f7886a;
            if (this.f7889d) {
                Locale locale = Locale.US;
                Object[] objArrCopyOf = Arrays.copyOf(args, args.length);
                String strEncode = URLEncoder.encode(String.format(locale, str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length)), "UTF-8");
                kotlin.jvm.internal.i.d(strEncode, "encode(String.format(Locale.US, format, *args), \"UTF-8\")");
                byte[] bytes = strEncode.getBytes(kotlin.text.a.f43120b);
                kotlin.jvm.internal.i.d(bytes, "(this as java.lang.String).getBytes(charset)");
                outputStream.write(bytes);
                return;
            }
            if (this.f7888c) {
                Charset charset = kotlin.text.a.f43120b;
                byte[] bytes2 = "--".getBytes(charset);
                kotlin.jvm.internal.i.d(bytes2, "(this as java.lang.String).getBytes(charset)");
                outputStream.write(bytes2);
                String str2 = r.j;
                if (str2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
                byte[] bytes3 = str2.getBytes(charset);
                kotlin.jvm.internal.i.d(bytes3, "(this as java.lang.String).getBytes(charset)");
                outputStream.write(bytes3);
                byte[] bytes4 = "\r\n".getBytes(charset);
                kotlin.jvm.internal.i.d(bytes4, "(this as java.lang.String).getBytes(charset)");
                outputStream.write(bytes4);
                this.f7888c = false;
            }
            Object[] objArrCopyOf2 = Arrays.copyOf(args, args.length);
            byte[] bytes5 = String.format(str, Arrays.copyOf(objArrCopyOf2, objArrCopyOf2.length)).getBytes(kotlin.text.a.f43120b);
            kotlin.jvm.internal.i.d(bytes5, "(this as java.lang.String).getBytes(charset)");
            outputStream.write(bytes5);
        }

        public final void c(String str, String str2, String str3) throws IOException {
            if (this.f7889d) {
                byte[] bytes = String.format("%s=", Arrays.copyOf(new Object[]{str}, 1)).getBytes(kotlin.text.a.f43120b);
                kotlin.jvm.internal.i.d(bytes, "(this as java.lang.String).getBytes(charset)");
                this.f7886a.write(bytes);
                return;
            }
            b("Content-Disposition: form-data; name=\"%s\"", str);
            if (str2 != null) {
                b("; filename=\"%s\"", str2);
            }
            f("", new Object[0]);
            if (str3 != null) {
                f("%s: %s", "Content-Type", str3);
            }
            f("", new Object[0]);
        }

        public final void d(String key, String str, Uri contentUri) throws Throwable {
            int iJ;
            long j;
            kotlin.jvm.internal.i.e(key, "key");
            kotlin.jvm.internal.i.e(contentUri, "contentUri");
            if (str == null) {
                str = "content/unknown";
            }
            c(key, key, str);
            OutputStream outputStream = this.f7886a;
            if (outputStream instanceof B) {
                Cursor cursorQuery = null;
                try {
                    cursorQuery = q.a().getContentResolver().query(contentUri, null, null, null, null);
                    if (cursorQuery == null) {
                        j = 0;
                    } else {
                        int columnIndex = cursorQuery.getColumnIndex("_size");
                        cursorQuery.moveToFirst();
                        j = cursorQuery.getLong(columnIndex);
                        cursorQuery.close();
                    }
                    ((B) outputStream).c(j);
                    iJ = 0;
                } catch (Throwable th) {
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    throw th;
                }
            } else {
                iJ = p165n4.s.j(q.a().getContentResolver().openInputStream(contentUri), outputStream);
            }
            f("", new Object[0]);
            h();
            p165n4.l lVar = this.f7887b;
            if (lVar == null) {
                return;
            }
            lVar.a(String.format(Locale.ROOT, "<Data: %d>", Arrays.copyOf(new Object[]{Integer.valueOf(iJ)}, 1)), kotlin.jvm.internal.i.k(key, "    "));
        }

        public final void e(String key, ParcelFileDescriptor descriptor, String str) throws Throwable {
            int iJ;
            kotlin.jvm.internal.i.e(key, "key");
            kotlin.jvm.internal.i.e(descriptor, "descriptor");
            if (str == null) {
                str = "content/unknown";
            }
            c(key, key, str);
            OutputStream outputStream = this.f7886a;
            if (outputStream instanceof B) {
                ((B) outputStream).c(descriptor.getStatSize());
                iJ = 0;
            } else {
                iJ = p165n4.s.j(new ParcelFileDescriptor.AutoCloseInputStream(descriptor), outputStream);
            }
            f("", new Object[0]);
            h();
            p165n4.l lVar = this.f7887b;
            if (lVar == null) {
                return;
            }
            lVar.a(String.format(Locale.ROOT, "<Data: %d>", Arrays.copyOf(new Object[]{Integer.valueOf(iJ)}, 1)), kotlin.jvm.internal.i.k(key, "    "));
        }

        public final void f(String str, Object... objArr) throws IOException {
            b(str, Arrays.copyOf(objArr, objArr.length));
            if (this.f7889d) {
                return;
            }
            b("\r\n", new Object[0]);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void g(String key, Object obj, r rVar) throws Throwable {
            kotlin.jvm.internal.i.e(key, "key");
            OutputStream outputStream = this.f7886a;
            if (outputStream instanceof E) {
                ((E) outputStream).b(rVar);
            }
            String str = r.j;
            if (c.f(obj)) {
                a(key, c.a(obj));
                return;
            }
            boolean z10 = obj instanceof Bitmap;
            p165n4.l lVar = this.f7887b;
            if (z10) {
                Bitmap bitmap = (Bitmap) obj;
                kotlin.jvm.internal.i.e(bitmap, "bitmap");
                c(key, key, "image/png");
                bitmap.compress(Bitmap.CompressFormat.PNG, 100, outputStream);
                f("", new Object[0]);
                h();
                if (lVar == null) {
                    return;
                }
                lVar.a("<Image>", kotlin.jvm.internal.i.k(key, "    "));
                return;
            }
            if (obj instanceof byte[]) {
                byte[] bytes = (byte[]) obj;
                kotlin.jvm.internal.i.e(bytes, "bytes");
                c(key, key, "content/unknown");
                outputStream.write(bytes);
                f("", new Object[0]);
                h();
                if (lVar == null) {
                    return;
                }
                lVar.a(String.format(Locale.ROOT, "<Data: %d>", Arrays.copyOf(new Object[]{Integer.valueOf(bytes.length)}, 1)), kotlin.jvm.internal.i.k(key, "    "));
                return;
            }
            if (obj instanceof Uri) {
                d(key, null, (Uri) obj);
                return;
            }
            if (obj instanceof ParcelFileDescriptor) {
                e(key, (ParcelFileDescriptor) obj, null);
                return;
            }
            if (!(obj instanceof g)) {
                throw new IllegalArgumentException("value is not a supported type.");
            }
            g gVar = (g) obj;
            RESOURCE resource = gVar.f7885c;
            boolean z11 = resource instanceof ParcelFileDescriptor;
            String str2 = gVar.f7884b;
            if (z11) {
                e(key, (ParcelFileDescriptor) resource, str2);
            } else {
                if (!(resource instanceof Uri)) {
                    throw new IllegalArgumentException("value is not a supported type.");
                }
                d(key, str2, (Uri) resource);
            }
        }

        public final void h() throws IOException {
            if (!this.f7889d) {
                f("--%s", r.j);
                return;
            }
            byte[] bytes = "&".getBytes(kotlin.text.a.f43120b);
            kotlin.jvm.internal.i.d(bytes, "(this as java.lang.String).getBytes(charset)");
            this.f7886a.write(bytes);
        }
    }

    static {
        char[] charArray = "-_1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        kotlin.jvm.internal.i.d(charArray, "(this as java.lang.String).toCharArray()");
        StringBuilder sb2 = new StringBuilder();
        SecureRandom secureRandom = new SecureRandom();
        int iNextInt = secureRandom.nextInt(11) + 30;
        if (iNextInt > 0) {
            int i10 = 0;
            do {
                i10++;
                sb2.append(charArray[secureRandom.nextInt(charArray.length)]);
            } while (i10 < iNextInt);
        }
        String string = sb2.toString();
        kotlin.jvm.internal.i.d(string, "buffer.toString()");
        j = string;
        f7871k = Pattern.compile("^/?v\\d+\\.\\d+/(.*)");
    }

    public r() {
        this(null, null, null, null, null, 63);
    }

    public static String f() {
        String strB = q.b();
        p165n4.t.e();
        String str = q.f7857f;
        if (str == null) {
            throw new FacebookException("A valid Facebook client token must be set in the AndroidManifest.xml or set by calling FacebookSdk.setClientToken before initializing the sdk. Visit https://developers.facebook.com/docs/android/getting-started#add-app_id for more information.");
        }
        if (strB.length() <= 0 || str.length() <= 0) {
            return null;
        }
        return strB + '|' + str;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x003d  */
    public final void a() {
        Bundle bundle = this.f7876d;
        String strE = e();
        boolean zJ = strE == null ? false : kotlin.text.n.J(strE, "|", false);
        if (strE == null || !kotlin.text.m.I(strE, "IG", false) || zJ || !i()) {
            if ((kotlin.jvm.internal.i.a(q.e(), "instagram.com") ? true ^ i() : true) || zJ) {
                String strE2 = e();
                if (strE2 != null) {
                    bundle.putString("access_token", strE2);
                }
            } else {
                bundle.putString("access_token", f());
            }
        } else {
            bundle.putString("access_token", f());
        }
        if (!bundle.containsKey("access_token")) {
            q qVar = q.f7852a;
            p165n4.t.e();
            if (q.f7857f == null) {
                throw new FacebookException("A valid Facebook client token must be set in the AndroidManifest.xml or set by calling FacebookSdk.setClientToken before initializing the sdk. Visit https://developers.facebook.com/docs/android/getting-started#add-app_id for more information.");
            }
        }
        bundle.putString("sdk", "android");
        bundle.putString("format", "json");
        q qVar2 = q.f7852a;
        HashSet<LoggingBehavior> hashSet = q.f7853b;
        synchronized (hashSet) {
        }
        synchronized (hashSet) {
        }
    }

    public final String b(String str, boolean z10) {
        if (!z10 && this.f7880h == HttpMethod.f24772c) {
            return str;
        }
        Uri.Builder builderBuildUpon = Uri.parse(str).buildUpon();
        for (String str2 : this.f7876d.keySet()) {
            Object obj = this.f7876d.get(str2);
            if (obj == null) {
                obj = "";
            }
            if (c.f(obj)) {
                builderBuildUpon.appendQueryParameter(str2, c.a(obj).toString());
            } else if (this.f7880h != HttpMethod.f24771b) {
                throw new IllegalArgumentException(String.format(Locale.US, "Unsupported parameter type for GET request: %s", Arrays.copyOf(new Object[]{obj.getClass().getSimpleName()}, 1)));
            }
        }
        String string = builderBuildUpon.toString();
        kotlin.jvm.internal.i.d(string, "uriBuilder.toString()");
        return string;
    }

    public final x c() {
        List requests = kotlin.collections.k.d0(new r[]{this});
        kotlin.jvm.internal.i.e(requests, "requests");
        ArrayList arrayListC = c.c(new w(requests));
        if (arrayListC.size() == 1) {
            return (x) arrayListC.get(0);
        }
        throw new FacebookException("invalid state: expected a single response");
    }

    public final v d() {
        List requests = kotlin.collections.k.d0(new r[]{this});
        kotlin.jvm.internal.i.e(requests, "requests");
        w wVar = new w(requests);
        p165n4.t.c(wVar);
        v vVar = new v(wVar);
        vVar.executeOnExecutor(q.c(), new Void[0]);
        return vVar;
    }

    public final String e() {
        C0835a c0835a = this.f7873a;
        if (c0835a != null) {
            if (!this.f7876d.containsKey("access_token")) {
                n4.l.a aVar = p165n4.l.f44910c;
                String str = c0835a.f7789f;
                aVar.d(str);
                return str;
            }
        } else if (!this.f7876d.containsKey("access_token")) {
            return f();
        }
        return this.f7876d.getString("access_token");
    }

    public final String g() {
        String str;
        String str2;
        if (this.f7880h == HttpMethod.f24772c && (str2 = this.f7874b) != null && kotlin.text.m.C(str2, "/videos", false)) {
            int i10 = p165n4.p.f44923a;
            str = String.format("https://graph-video.%s", Arrays.copyOf(new Object[]{q.e()}, 1));
        } else {
            int i11 = p165n4.p.f44923a;
            String subdomain = q.e();
            kotlin.jvm.internal.i.e(subdomain, "subdomain");
            str = String.format("https://graph.%s", Arrays.copyOf(new Object[]{subdomain}, 1));
        }
        String strH = h(str);
        a();
        return b(strH, false);
    }

    public final String h(String str) {
        if (!(!kotlin.jvm.internal.i.a(q.e(), "instagram.com") ? true : !i())) {
            int i10 = p165n4.p.f44923a;
            str = String.format("https://graph.%s", Arrays.copyOf(new Object[]{q.f7868r}, 1));
        }
        String str2 = this.f7874b;
        if (!f7871k.matcher(str2).matches()) {
            str2 = String.format("%s/%s", Arrays.copyOf(new Object[]{this.f7878f, str2}, 2));
        }
        return String.format("%s/%s", Arrays.copyOf(new Object[]{str, str2}, 2));
    }

    public final boolean i() {
        String str = this.f7874b;
        if (str == null) {
            return false;
        }
        StringBuilder sb2 = new StringBuilder("^/?");
        sb2.append(q.b());
        sb2.append("/?.*");
        return this.f7881i || Pattern.matches(sb2.toString(), str) || Pattern.matches("^/?app/?.*", str);
    }

    public final void j(b bVar) {
        q qVar = q.f7852a;
        HashSet<LoggingBehavior> hashSet = q.f7853b;
        synchronized (hashSet) {
        }
        synchronized (hashSet) {
        }
        this.f7879g = bVar;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("{Request:  accessToken: ");
        Object obj = this.f7873a;
        if (obj == null) {
            obj = "null";
        }
        sb2.append(obj);
        sb2.append(", graphPath: ");
        sb2.append(this.f7874b);
        sb2.append(", graphObject: ");
        sb2.append(this.f7875c);
        sb2.append(", httpMethod: ");
        sb2.append(this.f7880h);
        sb2.append(", parameters: ");
        sb2.append(this.f7876d);
        sb2.append("}");
        String string = sb2.toString();
        kotlin.jvm.internal.i.d(string, "StringBuilder()\n        .append(\"{Request: \")\n        .append(\" accessToken: \")\n        .append(if (accessToken == null) \"null\" else accessToken)\n        .append(\", graphPath: \")\n        .append(graphPath)\n        .append(\", graphObject: \")\n        .append(graphObject)\n        .append(\", httpMethod: \")\n        .append(httpMethod)\n        .append(\", parameters: \")\n        .append(parameters)\n        .append(\"}\")\n        .toString()");
        return string;
    }

    public r(C0835a c0835a, String str, Bundle bundle, HttpMethod httpMethod, b bVar, int i10) {
        c0835a = (i10 & 1) != 0 ? null : c0835a;
        str = (i10 & 2) != 0 ? null : str;
        bundle = (i10 & 4) != 0 ? null : bundle;
        httpMethod = (i10 & 8) != 0 ? null : httpMethod;
        bVar = (i10 & 16) != 0 ? null : bVar;
        this.f7873a = c0835a;
        this.f7874b = str;
        this.f7878f = null;
        j(bVar);
        this.f7880h = httpMethod == null ? HttpMethod.f24771b : httpMethod;
        if (bundle != null) {
            this.f7876d = new Bundle(bundle);
        } else {
            this.f7876d = new Bundle();
        }
        this.f7878f = q.d();
    }

    /* JADX INFO: compiled from: GraphRequest.kt */
    public static final class g<RESOURCE extends Parcelable> implements Parcelable {
        public static final Parcelable.Creator<g<?>> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f7884b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final RESOURCE f7885c;

        /* JADX INFO: compiled from: GraphRequest.kt */
        public static final class a implements Parcelable.Creator<g<?>> {
            @Override // android.os.Parcelable.Creator
            public final g<?> createFromParcel(Parcel source) {
                kotlin.jvm.internal.i.e(source, "source");
                return new g<>(source);
            }

            @Override // android.os.Parcelable.Creator
            public final g<?>[] newArray(int i10) {
                return new g[i10];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public g(Parcelable parcelable) {
            this.f7884b = "image/png";
            this.f7885c = parcelable;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 1;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel out, int i10) {
            kotlin.jvm.internal.i.e(out, "out");
            out.writeString(this.f7884b);
            out.writeParcelable(this.f7885c, i10);
        }

        public g(Parcel parcel) {
            this.f7884b = parcel.readString();
            this.f7885c = (RESOURCE) parcel.readParcelable(q.a().getClassLoader());
        }
    }
}
