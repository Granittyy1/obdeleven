package com.google.firebase.remoteconfig.internal;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import androidx.annotation.Keep;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class ConfigFetchHttpClient {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Pattern f28566h = Pattern.compile("^[^:]+:([0-9]+):(android|ios|web):([0-9a-f]+)");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f28567a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f28568b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f28569c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f28570d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f28571e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f28572f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f28573g;

    public ConfigFetchHttpClient(Context context, String str, String str2, String str3, long j, long j10) {
        this.f28567a = context;
        this.f28568b = str;
        this.f28569c = str2;
        Matcher matcher = f28566h.matcher(str);
        this.f28570d = matcher.matches() ? matcher.group(1) : null;
        this.f28571e = str3;
        this.f28572f = j;
        this.f28573g = j10;
    }

    public static JSONObject c(HttpURLConnection httpURLConnection) throws JSONException, IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream(), "utf-8"));
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            int i10 = bufferedReader.read();
            if (i10 == -1) {
                return new JSONObject(sb2.toString());
            }
            sb2.append((char) i10);
        }
    }

    public static void d(HttpURLConnection httpURLConnection, byte[] bArr) throws IOException {
        httpURLConnection.setFixedLengthStreamingMode(bArr.length);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
        bufferedOutputStream.write(bArr);
        bufferedOutputStream.flush();
        bufferedOutputStream.close();
    }

    public final JSONObject a(String str, String str2, Map<String, String> map, Long l10) throws FirebaseRemoteConfigClientException {
        HashMap map2 = new HashMap();
        if (str == null) {
            throw new FirebaseRemoteConfigClientException("Fetch failed: Firebase installation id is null.");
        }
        map2.put("appInstanceId", str);
        map2.put("appInstanceIdToken", str2);
        map2.put("appId", this.f28568b);
        Context context = this.f28567a;
        Locale locale = context.getResources().getConfiguration().locale;
        map2.put("countryCode", locale.getCountry());
        int i10 = Build.VERSION.SDK_INT;
        map2.put("languageCode", locale.toLanguageTag());
        map2.put("platformVersion", Integer.toString(i10));
        map2.put("timeZone", TimeZone.getDefault().getID());
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            if (packageInfo != null) {
                map2.put("appVersion", packageInfo.versionName);
                map2.put("appBuild", Long.toString(i10 >= 28 ? p199q0.a.b(packageInfo) : packageInfo.versionCode));
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        map2.put("packageName", context.getPackageName());
        map2.put("sdkVersion", "21.6.3");
        map2.put("analyticsUserProperties", new JSONObject(map));
        if (l10 != null) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            map2.put("firstOpenTime", simpleDateFormat.format(l10));
        }
        return new JSONObject(map2);
    }

    public final HttpURLConnection b() throws FirebaseRemoteConfigException {
        try {
            return (HttpURLConnection) new URL("https://firebaseremoteconfig.googleapis.com/v1/projects/" + this.f28570d + "/namespaces/" + this.f28571e + ":fetch").openConnection();
        } catch (IOException e10) {
            throw new FirebaseRemoteConfigException(e10.getMessage());
        }
    }

    @Keep
    public ConfigFetchHandler.a fetch(HttpURLConnection httpURLConnection, String str, String str2, Map<String, String> map, String str3, Map<String, String> map2, Long l10, Date date) throws FirebaseRemoteConfigException {
        String strA;
        JSONObject jSONObject;
        JSONArray jSONArray;
        JSONObject jSONObject2;
        JSONArray jSONArray2;
        boolean z10;
        httpURLConnection.setDoOutput(true);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        httpURLConnection.setConnectTimeout((int) timeUnit.toMillis(this.f28572f));
        httpURLConnection.setReadTimeout((int) timeUnit.toMillis(this.f28573g));
        httpURLConnection.setRequestProperty("If-None-Match", str3);
        httpURLConnection.setRequestProperty("X-Goog-Api-Key", this.f28569c);
        Context context = this.f28567a;
        httpURLConnection.setRequestProperty("X-Android-Package", context.getPackageName());
        try {
            byte[] bArrA = Y4.a.a(context, context.getPackageName());
            if (bArrA == null) {
                Log.e("FirebaseRemoteConfig", "Could not get fingerprint hash for package: " + context.getPackageName());
                strA = null;
            } else {
                strA = Y4.d.a(bArrA);
            }
        } catch (PackageManager.NameNotFoundException e10) {
            Log.e("FirebaseRemoteConfig", "No such package: " + context.getPackageName(), e10);
        }
        httpURLConnection.setRequestProperty("X-Android-Cert", strA);
        httpURLConnection.setRequestProperty("X-Google-GFE-Can-Retry", "yes");
        httpURLConnection.setRequestProperty("X-Goog-Firebase-Installations-Auth", str2);
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept", "application/json");
        for (Map.Entry<String, String> entry : map2.entrySet()) {
            try {
                httpURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
            } catch (Throwable th) {
                httpURLConnection.disconnect();
                try {
                    httpURLConnection.getInputStream().close();
                } catch (IOException unused) {
                }
                throw th;
            }
        }
        try {
            d(httpURLConnection, a(str, str2, map, l10).toString().getBytes("utf-8"));
            httpURLConnection.connect();
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode != 200) {
                throw new FirebaseRemoteConfigServerException(responseCode, httpURLConnection.getResponseMessage());
            }
            String headerField = httpURLConnection.getHeaderField("ETag");
            JSONObject jSONObjectC = c(httpURLConnection);
            httpURLConnection.disconnect();
            try {
                httpURLConnection.getInputStream().close();
            } catch (IOException unused2) {
            }
            try {
                b.a aVarC = b.c();
                aVarC.f28593b = date;
                try {
                    jSONObject = jSONObjectC.getJSONObject("entries");
                } catch (JSONException unused3) {
                    jSONObject = null;
                }
                if (jSONObject != null) {
                    try {
                        aVarC.f28592a = new JSONObject(jSONObject.toString());
                    } catch (JSONException unused4) {
                    }
                }
                try {
                    jSONArray = jSONObjectC.getJSONArray("experimentDescriptions");
                } catch (JSONException unused5) {
                    jSONArray = null;
                }
                if (jSONArray != null) {
                    try {
                        aVarC.f28594c = new JSONArray(jSONArray.toString());
                    } catch (JSONException unused6) {
                    }
                }
                try {
                    jSONObject2 = jSONObjectC.getJSONObject("personalizationMetadata");
                } catch (JSONException unused7) {
                    jSONObject2 = null;
                }
                if (jSONObject2 != null) {
                    try {
                        aVarC.f28595d = new JSONObject(jSONObject2.toString());
                    } catch (JSONException unused8) {
                    }
                }
                String string = jSONObjectC.has("templateVersion") ? jSONObjectC.getString("templateVersion") : null;
                if (string != null) {
                    aVarC.f28596e = Long.parseLong(string);
                }
                try {
                    jSONArray2 = jSONObjectC.getJSONArray("rolloutMetadata");
                } catch (JSONException unused9) {
                    jSONArray2 = null;
                }
                if (jSONArray2 != null) {
                    try {
                        aVarC.f28597f = new JSONArray(jSONArray2.toString());
                    } catch (JSONException unused10) {
                    }
                }
                b bVarA = aVarC.a();
                try {
                    z10 = !jSONObjectC.get("state").equals("NO_CHANGE");
                } catch (JSONException unused11) {
                    z10 = true;
                }
                return !z10 ? new ConfigFetchHandler.a(1, bVarA, null) : new ConfigFetchHandler.a(0, bVarA, headerField);
            } catch (JSONException e11) {
                throw new FirebaseRemoteConfigClientException("Fetch failed: fetch response could not be parsed.", e11);
            }
        } catch (IOException | JSONException e12) {
            throw new FirebaseRemoteConfigClientException("The client had an error while calling the backend!", e12);
        }
    }
}
