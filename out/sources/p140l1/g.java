package p140l1;

import J4.n;
import android.net.Uri;
import android.text.TextUtils;
import androidx.media3.datasource.DataSourceException;
import androidx.media3.datasource.HttpDataSource$HttpDataSourceException;
import androidx.media3.datasource.HttpDataSource$InvalidResponseCodeException;
import com.google.android.gms.internal.measurement.C1775a2;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.e;
import com.google.common.collect.k;
import com.google.common.collect.p;
import com.google.common.collect.q;
import com.google.common.collect.z;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.GZIPInputStream;
import p114j1.A;

/* JADX INFO: compiled from: DefaultHttpDataSource.java */
/* JADX INFO: loaded from: classes.dex */
public final class g extends p140l1.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f44187e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f44188f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C1775a2 f44189g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C1775a2 f44190h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public e f44191i;
    public HttpURLConnection j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public InputStream f44192k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f44193l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f44194m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f44195n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f44196o;

    /* JADX INFO: compiled from: DefaultHttpDataSource.java */
    public static final class a implements d.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final C1775a2 f44197a = new C1775a2();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f44198b = 8000;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f44199c = 8000;
    }

    /* JADX INFO: compiled from: DefaultHttpDataSource.java */
    public static class b extends k<String, List<String>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Map<String, List<String>> f44200b;

        public b(Map<String, List<String>> map) {
            this.f44200b = map;
        }

        @Override // com.google.common.collect.l
        public final Object a() {
            return this.f44200b;
        }

        @Override // com.google.common.collect.k
        public final Map<String, List<String>> b() {
            return this.f44200b;
        }

        @Override // com.google.common.collect.k, java.util.Map
        public final boolean containsKey(Object obj) {
            return obj != null && super.containsKey(obj);
        }

        @Override // com.google.common.collect.k, java.util.Map
        public final boolean containsValue(Object obj) {
            p pVar = new p(((e) entrySet()).iterator());
            if (obj == null) {
                while (pVar.hasNext()) {
                    if (pVar.next() == null) {
                        return true;
                    }
                }
            } else {
                while (pVar.hasNext()) {
                    if (obj.equals(pVar.next())) {
                        return true;
                    }
                }
            }
            return false;
        }

        @Override // com.google.common.collect.k, java.util.Map
        public final Set<Map.Entry<String, List<String>>> entrySet() {
            return z.b(super.entrySet(), new h());
        }

        @Override // com.google.common.collect.k, java.util.Map
        public final boolean equals(Object obj) {
            return obj != null && q.a(obj, this);
        }

        @Override // com.google.common.collect.k, java.util.Map
        public final Object get(Object obj) {
            if (obj == null) {
                return null;
            }
            return (List) super.get(obj);
        }

        @Override // com.google.common.collect.k, java.util.Map
        public final int hashCode() {
            return z.c(entrySet());
        }

        @Override // com.google.common.collect.k, java.util.Map
        public final boolean isEmpty() {
            if (super.isEmpty()) {
                return true;
            }
            return super.size() == 1 && super.containsKey(null);
        }

        @Override // com.google.common.collect.k, java.util.Map
        public final Set<String> keySet() {
            return z.b(super.keySet(), new i());
        }

        @Override // com.google.common.collect.k, java.util.Map
        public final int size() {
            return super.size() - (super.containsKey(null) ? 1 : 0);
        }
    }

    public g(int i10, int i11, C1775a2 c1775a2) {
        super(true);
        this.f44187e = i10;
        this.f44188f = i11;
        this.f44189g = c1775a2;
        this.f44190h = new C1775a2();
    }

    @Override // p140l1.d
    public final void close() throws HttpDataSource$HttpDataSourceException {
        try {
            InputStream inputStream = this.f44192k;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e10) {
                    e eVar = this.f44191i;
                    int i10 = A.f40996a;
                    throw new HttpDataSource$HttpDataSourceException(e10, eVar, 2000, 3);
                }
            }
            this.f44192k = null;
            o();
            if (this.f44193l) {
                this.f44193l = false;
                l();
            }
            this.j = null;
            this.f44191i = null;
        } catch (Throwable th) {
            this.f44192k = null;
            o();
            if (this.f44193l) {
                this.f44193l = false;
                l();
            }
            this.j = null;
            this.f44191i = null;
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0126  */
    /* JADX WARN: Code duplicated, block: B:79:0x018f  */
    @Override // p140l1.d
    public final long f(e eVar) throws HttpDataSource$HttpDataSourceException {
        int i10;
        byte[] bArrB;
        long j;
        boolean z10;
        long jMax;
        this.f44191i = eVar;
        this.f44196o = 0L;
        this.f44195n = 0L;
        m(eVar);
        try {
            try {
                HttpURLConnection httpURLConnectionP = p(new URL(eVar.f44168a.toString()), eVar.f44169b, eVar.f44170c, eVar.f44172e, eVar.f44173f, (eVar.f44174g & 1) == 1, true, eVar.f44171d);
                this.j = httpURLConnectionP;
                this.f44194m = httpURLConnectionP.getResponseCode();
                String responseMessage = httpURLConnectionP.getResponseMessage();
                int i11 = this.f44194m;
                long j10 = eVar.f44172e;
                long j11 = eVar.f44173f;
                if (i11 < 200 || i11 > 299) {
                    Map<String, List<String>> headerFields = httpURLConnectionP.getHeaderFields();
                    if (this.f44194m == 416) {
                        String headerField = httpURLConnectionP.getHeaderField("Content-Range");
                        Pattern pattern = j.f44201a;
                        if (TextUtils.isEmpty(headerField)) {
                            j = -1;
                        } else {
                            Matcher matcher = j.f44202b.matcher(headerField);
                            if (matcher.matches()) {
                                String strGroup = matcher.group(1);
                                strGroup.getClass();
                                j = Long.parseLong(strGroup);
                            } else {
                                j = -1;
                            }
                        }
                        if (j10 == j) {
                            this.f44193l = true;
                            n(eVar);
                            if (j11 != -1) {
                                return j11;
                            }
                            return 0L;
                        }
                    }
                    InputStream errorStream = httpURLConnectionP.getErrorStream();
                    try {
                        bArrB = errorStream != null ? p082g6.a.b(errorStream) : A.f40998c;
                    } catch (IOException unused) {
                        bArrB = A.f40998c;
                    }
                    byte[] bArr = bArrB;
                    o();
                    throw new HttpDataSource$InvalidResponseCodeException(this.f44194m, responseMessage, this.f44194m == 416 ? new DataSourceException(2008) : null, headerFields, eVar, bArr);
                }
                httpURLConnectionP.getContentType();
                if (this.f44194m != 200 || j10 == 0) {
                    j10 = 0;
                }
                boolean zEqualsIgnoreCase = "gzip".equalsIgnoreCase(httpURLConnectionP.getHeaderField("Content-Encoding"));
                if (zEqualsIgnoreCase) {
                    z10 = true;
                    this.f44195n = j11;
                } else if (j11 != -1) {
                    this.f44195n = j11;
                    z10 = true;
                } else {
                    String headerField2 = httpURLConnectionP.getHeaderField("Content-Length");
                    String headerField3 = httpURLConnectionP.getHeaderField("Content-Range");
                    Pattern pattern2 = j.f44201a;
                    if (TextUtils.isEmpty(headerField2)) {
                        jMax = -1;
                    } else {
                        try {
                            jMax = Long.parseLong(headerField2);
                        } catch (NumberFormatException unused2) {
                            p114j1.k.c("HttpUtil", "Unexpected Content-Length [" + headerField2 + "]");
                            jMax = -1;
                        }
                    }
                    if (TextUtils.isEmpty(headerField3)) {
                        z10 = true;
                    } else {
                        Matcher matcher2 = j.f44201a.matcher(headerField3);
                        if (matcher2.matches()) {
                            try {
                                String strGroup2 = matcher2.group(2);
                                strGroup2.getClass();
                                long j12 = Long.parseLong(strGroup2);
                                z10 = true;
                                try {
                                    String strGroup3 = matcher2.group(1);
                                    strGroup3.getClass();
                                    long j13 = (j12 - Long.parseLong(strGroup3)) + 1;
                                    if (jMax < 0) {
                                        jMax = j13;
                                    } else if (jMax != j13) {
                                        p114j1.k.f("Inconsistent headers [" + headerField2 + "] [" + headerField3 + "]");
                                        jMax = Math.max(jMax, j13);
                                    }
                                } catch (NumberFormatException unused3) {
                                    p114j1.k.c("HttpUtil", "Unexpected Content-Range [" + headerField3 + "]");
                                }
                            } catch (NumberFormatException unused4) {
                                z10 = true;
                            }
                        } else {
                            z10 = true;
                        }
                    }
                    this.f44195n = jMax != -1 ? jMax - j10 : -1L;
                }
                try {
                    this.f44192k = httpURLConnectionP.getInputStream();
                    if (zEqualsIgnoreCase) {
                        this.f44192k = new GZIPInputStream(this.f44192k);
                    }
                    this.f44193l = z10;
                    n(eVar);
                    boolean z11 = z10;
                    try {
                        q(j10, eVar);
                        return this.f44195n;
                    } catch (IOException e10) {
                        o();
                        if (e10 instanceof HttpDataSource$HttpDataSourceException) {
                            throw ((HttpDataSource$HttpDataSourceException) e10);
                        }
                        throw new HttpDataSource$HttpDataSourceException(e10, eVar, 2000, z11 ? 1 : 0);
                    }
                } catch (IOException e11) {
                    boolean z12 = z10;
                    o();
                    throw new HttpDataSource$HttpDataSourceException(e11, eVar, 2000, z12 ? 1 : 0);
                }
            } catch (IOException e12) {
                e = e12;
                i10 = 1;
                o();
                throw HttpDataSource$HttpDataSourceException.b(e, eVar, i10);
            }
        } catch (IOException e13) {
            e = e13;
            i10 = 1;
        }
    }

    @Override // p140l1.d
    public final Map<String, List<String>> g() {
        HttpURLConnection httpURLConnection = this.j;
        return httpURLConnection == null ? ImmutableMap.h() : new b(httpURLConnection.getHeaderFields());
    }

    @Override // p140l1.d
    public final Uri getUri() {
        HttpURLConnection httpURLConnection = this.j;
        if (httpURLConnection != null) {
            return Uri.parse(httpURLConnection.getURL().toString());
        }
        e eVar = this.f44191i;
        if (eVar != null) {
            return eVar.f44168a;
        }
        return null;
    }

    public final void o() {
        HttpURLConnection httpURLConnection = this.j;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e10) {
                p114j1.k.d("DefaultHttpDataSource", "Unexpected error while disconnecting", e10);
            }
        }
    }

    public final HttpURLConnection p(URL url, int i10, byte[] bArr, long j, long j10, boolean z10, boolean z11, Map<String, String> map) throws IOException {
        String string;
        String str;
        HttpURLConnection httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection()));
        httpURLConnection.setConnectTimeout(this.f44187e);
        httpURLConnection.setReadTimeout(this.f44188f);
        HashMap map2 = new HashMap();
        C1775a2 c1775a2 = this.f44189g;
        if (c1775a2 != null) {
            map2.putAll(c1775a2.a());
        }
        map2.putAll(this.f44190h.a());
        map2.putAll(map);
        for (Map.Entry entry : map2.entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        Pattern pattern = j.f44201a;
        if (j == 0 && j10 == -1) {
            string = null;
        } else {
            StringBuilder sbF = n.f("bytes=", "-", j);
            if (j10 != -1) {
                sbF.append((j + j10) - 1);
            }
            string = sbF.toString();
        }
        if (string != null) {
            httpURLConnection.setRequestProperty("Range", string);
        }
        httpURLConnection.setRequestProperty("Accept-Encoding", z10 ? "gzip" : "identity");
        httpURLConnection.setInstanceFollowRedirects(z11);
        httpURLConnection.setDoOutput(bArr != null);
        int i11 = e.f44167h;
        if (i10 == 1) {
            str = "GET";
        } else if (i10 == 2) {
            str = "POST";
        } else {
            if (i10 != 3) {
                throw new IllegalStateException();
            }
            str = "HEAD";
        }
        httpURLConnection.setRequestMethod(str);
        if (bArr != null) {
            httpURLConnection.setFixedLengthStreamingMode(bArr.length);
            httpURLConnection.connect();
            OutputStream outputStream = httpURLConnection.getOutputStream();
            outputStream.write(bArr);
            outputStream.close();
        } else {
            httpURLConnection.connect();
        }
        return httpURLConnection;
    }

    public final void q(long j, e eVar) throws IOException {
        if (j == 0) {
            return;
        }
        byte[] bArr = new byte[4096];
        while (j > 0) {
            int iMin = (int) Math.min(j, 4096);
            InputStream inputStream = this.f44192k;
            int i10 = A.f40996a;
            int i11 = inputStream.read(bArr, 0, iMin);
            if (Thread.currentThread().isInterrupted()) {
                throw new HttpDataSource$HttpDataSourceException(new InterruptedIOException(), eVar, 2000, 1);
            }
            if (i11 == -1) {
                throw new HttpDataSource$HttpDataSourceException(eVar);
            }
            j -= (long) i11;
            k(i11);
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0028  */
    /* JADX WARN: Code duplicated, block: B:13:0x0029 A[Catch: IOException -> 0x0033, TRY_LEAVE, TryCatch #0 {IOException -> 0x0033, blocks: (B:4:0x0004, B:6:0x000d, B:9:0x0018, B:10:0x001e, B:13:0x0029), top: B:18:0x0004 }] */
    @Override // p078g1.i
    public final int read(byte[] bArr, int i10, int i11) throws HttpDataSource$HttpDataSourceException {
        int i12;
        if (i11 == 0) {
            return 0;
        }
        try {
            long j = this.f44195n;
            if (j != -1) {
                long j10 = j - this.f44196o;
                if (j10 != 0) {
                    i11 = (int) Math.min(i11, j10);
                    InputStream inputStream = this.f44192k;
                    int i13 = A.f40996a;
                    i12 = inputStream.read(bArr, i10, i11);
                    if (i12 == -1) {
                        this.f44196o += (long) i12;
                        k(i12);
                        return i12;
                    }
                }
            } else {
                InputStream inputStream2 = this.f44192k;
                int i14 = A.f40996a;
                i12 = inputStream2.read(bArr, i10, i11);
                if (i12 == -1) {
                    this.f44196o += (long) i12;
                    k(i12);
                    return i12;
                }
            }
            return -1;
        } catch (IOException e10) {
            e eVar = this.f44191i;
            int i15 = A.f40996a;
            throw HttpDataSource$HttpDataSourceException.b(e10, eVar, 2);
        }
    }
}
