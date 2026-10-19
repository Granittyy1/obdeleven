package C6;

import A0.d;
import android.util.Log;
import androidx.compose.ui.text.font.s;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;

/* JADX INFO: compiled from: HttpGetRequest.java */
/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2422a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f2423b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f2424c = new HashMap();

    public a(String str, HashMap map) {
        this.f2422a = str;
        this.f2423b = map;
    }

    public static String a(String str, HashMap map) throws UnsupportedEncodingException {
        StringBuilder sb2 = new StringBuilder();
        Iterator it = map.entrySet().iterator();
        Map.Entry entry = (Map.Entry) it.next();
        sb2.append((String) entry.getKey());
        sb2.append("=");
        sb2.append(entry.getValue() != null ? URLEncoder.encode((String) entry.getValue(), "UTF-8") : "");
        while (it.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it.next();
            sb2.append("&");
            sb2.append((String) entry2.getKey());
            sb2.append("=");
            sb2.append(entry2.getValue() != null ? URLEncoder.encode((String) entry2.getValue(), "UTF-8") : "");
        }
        String string = sb2.toString();
        if (string.isEmpty()) {
            return str;
        }
        if (!str.contains("?")) {
            return O.a.f(str, "?", string);
        }
        if (!str.endsWith("&")) {
            string = "&".concat(string);
        }
        return s.b(str, string);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x009e  */
    /* JADX WARN: Code duplicated, block: B:36:0x00a3  */
    public final d b() throws Throwable {
        HttpsURLConnection httpsURLConnection;
        InputStream inputStream = null;
        String string = null;
        inputStream = null;
        try {
            String strA = a(this.f2422a, this.f2423b);
            try {
                Log.isLoggable("FirebaseCrashlytics", 2);
                httpsURLConnection = (HttpsURLConnection) new URL(strA).openConnection();
                try {
                    httpsURLConnection.setReadTimeout(10000);
                    httpsURLConnection.setConnectTimeout(10000);
                    httpsURLConnection.setRequestMethod("GET");
                    for (Map.Entry entry : this.f2424c.entrySet()) {
                        httpsURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                    }
                    httpsURLConnection.connect();
                    int responseCode = httpsURLConnection.getResponseCode();
                    InputStream inputStream2 = httpsURLConnection.getInputStream();
                    if (inputStream2 != null) {
                        try {
                            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream2, "UTF-8"));
                            char[] cArr = new char[8192];
                            StringBuilder sb2 = new StringBuilder();
                            while (true) {
                                int i10 = bufferedReader.read(cArr);
                                if (i10 == -1) {
                                    break;
                                }
                                sb2.append(cArr, 0, i10);
                            }
                            string = sb2.toString();
                        } catch (Throwable th) {
                            th = th;
                            inputStream = inputStream2;
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            if (httpsURLConnection != null) {
                                httpsURLConnection.disconnect();
                            }
                            throw th;
                        }
                    }
                    if (inputStream2 != null) {
                        inputStream2.close();
                    }
                    httpsURLConnection.disconnect();
                    return new d(responseCode, string);
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
                httpsURLConnection = null;
                if (inputStream != null) {
                    inputStream.close();
                }
                if (httpsURLConnection != null) {
                    httpsURLConnection.disconnect();
                }
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }
}
