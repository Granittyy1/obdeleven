package p131k5;

import U4.C0804l;
import com.google.android.gms.internal.measurement.C1787c0;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class I0 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final URL f41823b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f41824c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final H0 f41825d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f41826e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Map<String, String> f41827f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ E0 f41828g;

    public I0(E0 e10, String str, URL url, byte[] bArr, Map<String, String> map, H0 h8) {
        this.f41828g = e10;
        C0804l.e(str);
        this.f41823b = url;
        this.f41824c = bArr;
        this.f41825d = h8;
        this.f41826e = str;
        this.f41827f = map;
    }

    /* JADX WARN: Code duplicated, block: B:64:0x0118  */
    /* JADX WARN: Code duplicated, block: B:73:0x0145  */
    /* JADX WARN: Code duplicated, block: B:76:0x0131 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:0x0104 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        HttpURLConnection httpURLConnection;
        Map<String, List<String>> map;
        Map<String, List<String>> map2;
        int i10;
        Throwable th;
        int i11;
        IOException iOException;
        int responseCode;
        Map<String, List<String>> headerFields;
        String str = this.f41826e;
        E0 e10 = this.f41828g;
        C2493c1 c2493c1 = ((C2523i1) e10.f3968a).j;
        C2523i1.g(c2493c1);
        c2493c1.C();
        OutputStream outputStream = null;
        try {
            URL url = this.f41823b;
            try {
                synchronized (C1787c0.class) {
                }
                URLConnection uRLConnectionOpenConnection = url.openConnection();
                if (!(uRLConnectionOpenConnection instanceof HttpURLConnection)) {
                    throw new IOException("Failed to obtain HTTP connection");
                }
                httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
                httpURLConnection.setDefaultUseCaches(false);
                httpURLConnection.setConnectTimeout(60000);
                httpURLConnection.setReadTimeout(61000);
                httpURLConnection.setInstanceFollowRedirects(false);
                httpURLConnection.setDoInput(true);
                try {
                    Map<String, String> map3 = this.f41827f;
                    if (map3 != null) {
                        for (Map.Entry<String, String> entry : map3.entrySet()) {
                            httpURLConnection.addRequestProperty(entry.getKey(), entry.getValue());
                        }
                    }
                    byte[] bArr = this.f41824c;
                    if (bArr == null) {
                        responseCode = httpURLConnection.getResponseCode();
                        headerFields = httpURLConnection.getHeaderFields();
                        byte[] bArrW = E0.w(httpURLConnection);
                        httpURLConnection.disconnect();
                        e10.i().z(new G0(this.f41826e, this.f41825d, responseCode, null, bArrW, headerFields));
                        return;
                    }
                    byte[] bArrD0 = e10.q().d0(bArr);
                    e10.d().f41719n.b(Integer.valueOf(bArrD0.length), "Uploading data. size");
                    httpURLConnection.setDoOutput(true);
                    httpURLConnection.addRequestProperty("Content-Encoding", "gzip");
                    httpURLConnection.setFixedLengthStreamingMode(bArrD0.length);
                    httpURLConnection.connect();
                    OutputStream outputStream2 = httpURLConnection.getOutputStream();
                    try {
                        outputStream2.write(bArrD0);
                        outputStream2.close();
                        responseCode = httpURLConnection.getResponseCode();
                        try {
                            headerFields = httpURLConnection.getHeaderFields();
                            try {
                                byte[] bArrW2 = E0.w(httpURLConnection);
                                httpURLConnection.disconnect();
                                e10.i().z(new G0(this.f41826e, this.f41825d, responseCode, null, bArrW2, headerFields));
                                return;
                            } catch (IOException e11) {
                                e = e11;
                                i11 = responseCode;
                                map2 = headerFields;
                                iOException = e;
                                if (outputStream != null) {
                                    try {
                                        outputStream.close();
                                    } catch (IOException e12) {
                                        e10.d().f41712f.a(B0.v(str), e12, "Error closing HTTP compressed POST connection output stream. appId");
                                    }
                                }
                                if (httpURLConnection != null) {
                                    httpURLConnection.disconnect();
                                }
                                e10.i().z(new G0(this.f41826e, this.f41825d, i11, iOException, null, map2));
                            } catch (Throwable th2) {
                                th = th2;
                                i10 = responseCode;
                                map = headerFields;
                                if (outputStream != null) {
                                    try {
                                        outputStream.close();
                                    } catch (IOException e13) {
                                        e10.d().f41712f.a(B0.v(str), e13, "Error closing HTTP compressed POST connection output stream. appId");
                                    }
                                }
                                if (httpURLConnection != null) {
                                    httpURLConnection.disconnect();
                                }
                                e10.i().z(new G0(this.f41826e, this.f41825d, i10, null, null, map));
                                throw th;
                            }
                        } catch (IOException e14) {
                            e = e14;
                            map2 = null;
                            i11 = responseCode;
                        } catch (Throwable th3) {
                            map = null;
                            th = th3;
                            i10 = responseCode;
                        }
                    } catch (IOException e15) {
                        map2 = null;
                        i11 = 0;
                        outputStream = outputStream2;
                        iOException = e15;
                    } catch (Throwable th4) {
                        map = null;
                        i10 = 0;
                        outputStream = outputStream2;
                        th = th4;
                        if (outputStream != null) {
                            outputStream.close();
                        }
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        e10.i().z(new G0(this.f41826e, this.f41825d, i10, null, null, map));
                        throw th;
                    }
                } catch (IOException e16) {
                    e = e16;
                    map2 = null;
                    i11 = 0;
                    iOException = e;
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    e10.i().z(new G0(this.f41826e, this.f41825d, i11, iOException, null, map2));
                } catch (Throwable th5) {
                    th = th5;
                    map = null;
                    i10 = 0;
                    th = th;
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    e10.i().z(new G0(this.f41826e, this.f41825d, i10, null, null, map));
                    throw th;
                }
                if (outputStream != null) {
                    outputStream.close();
                }
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
                e10.i().z(new G0(this.f41826e, this.f41825d, i11, iOException, null, map2));
            } catch (IOException e17) {
                e = e17;
                httpURLConnection = null;
                map2 = null;
                i11 = 0;
                iOException = e;
                if (outputStream != null) {
                    outputStream.close();
                }
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
                e10.i().z(new G0(this.f41826e, this.f41825d, i11, iOException, null, map2));
            } catch (Throwable th6) {
                th = th6;
                httpURLConnection = null;
                map = null;
                i10 = 0;
                th = th;
                if (outputStream != null) {
                    outputStream.close();
                }
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
                e10.i().z(new G0(this.f41826e, this.f41825d, i10, null, null, map));
                throw th;
            }
        } catch (IOException e18) {
            e = e18;
        } catch (Throwable th7) {
            th = th7;
        }
    }
}
