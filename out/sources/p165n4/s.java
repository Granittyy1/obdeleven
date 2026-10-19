package p165n4;

import Z3.C0835a;
import Z3.q;
import Z3.r;
import Z3.x;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.hardware.display.DisplayManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.Parcel;
import android.os.StatFs;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import android.view.Display;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import androidx.fragment.app.ActivityC1347l;
import com.facebook.FacebookException;
import com.facebook.FacebookRequestError;
import com.facebook.HttpMethod;
import io.intercom.android.sdk.models.AttributeType;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.URLDecoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.i;
import kotlin.text.Regex;
import kotlin.text.n;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/* JADX INFO: compiled from: Utility.kt */
/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f44926a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static long f44927b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static long f44928c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static long f44929d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static String f44930e = "";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static String f44931f = "";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static String f44932g = "NoCarrier";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static String f44933h = "";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static Locale f44934i;

    /* JADX INFO: compiled from: Utility.kt */
    public interface a {
        void a(JSONObject jSONObject);

        void c(FacebookException facebookException);
    }

    public static final HashMap A(String str) {
        if (str.length() == 0) {
            return new HashMap();
        }
        try {
            HashMap map = new HashMap();
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String key = itKeys.next();
                i.d(key, "key");
                String string = jSONObject.getString(key);
                i.d(string, "jsonObject.getString(key)");
                map.put(key, string);
            }
            return map;
        } catch (JSONException unused) {
            return new HashMap();
        }
    }

    public static final String B(Map<String, String> map) {
        i.e(map, "map");
        String string = "";
        if (!map.isEmpty()) {
            try {
                JSONObject jSONObject = new JSONObject();
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    jSONObject.put(entry.getKey(), entry.getValue());
                }
                string = jSONObject.toString();
            } catch (JSONException unused) {
            }
            i.d(string, "{\n      try {\n        val jsonObject = JSONObject()\n        for ((key, value) in map) {\n          jsonObject.put(key, value)\n        }\n        jsonObject.toString()\n      } catch (_e: JSONException) {\n        \"\"\n      }\n    }");
        }
        return string;
    }

    public static final Bundle C(String str) {
        Bundle bundle = new Bundle();
        if (!y(str)) {
            if (str == null) {
                throw new IllegalStateException("Required value was null.");
            }
            Object[] array = n.e0(str, new String[]{"&"}, 0, 6).toArray(new String[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            String[] strArr = (String[]) array;
            int length = strArr.length;
            int i10 = 0;
            while (i10 < length) {
                String str2 = strArr[i10];
                i10++;
                Object[] array2 = n.e0(str2, new String[]{"="}, 0, 6).toArray(new String[0]);
                if (array2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
                String[] strArr2 = (String[]) array2;
                try {
                    if (strArr2.length == 2) {
                        bundle.putString(URLDecoder.decode(strArr2[0], "UTF-8"), URLDecoder.decode(strArr2[1], "UTF-8"));
                    } else if (strArr2.length == 1) {
                        bundle.putString(URLDecoder.decode(strArr2[0], "UTF-8"), "");
                    }
                } catch (UnsupportedEncodingException unused) {
                    q qVar = q.f7852a;
                }
            }
        }
        return bundle;
    }

    public static final HashMap D(Parcel parcel) {
        i.e(parcel, "parcel");
        int i10 = parcel.readInt();
        if (i10 < 0) {
            return null;
        }
        HashMap map = new HashMap();
        if (i10 > 0) {
            int i11 = 0;
            do {
                i11++;
                String string = parcel.readString();
                String string2 = parcel.readString();
                if (string != null && string2 != null) {
                    map.put(string, string2);
                }
            } while (i11 < i10);
        }
        return map;
    }

    public static final String E(InputStream inputStream) throws Throwable {
        BufferedInputStream bufferedInputStream;
        Throwable th;
        InputStreamReader inputStreamReader;
        try {
            bufferedInputStream = new BufferedInputStream(inputStream);
            try {
                inputStreamReader = new InputStreamReader(bufferedInputStream);
                try {
                    StringBuilder sb2 = new StringBuilder();
                    char[] cArr = new char[2048];
                    while (true) {
                        int i10 = inputStreamReader.read(cArr);
                        if (i10 == -1) {
                            String string = sb2.toString();
                            i.d(string, "{\n      bufferedInputStream = BufferedInputStream(inputStream)\n      reader = InputStreamReader(bufferedInputStream)\n      val stringBuilder = StringBuilder()\n      val bufferSize = 1024 * 2\n      val buffer = CharArray(bufferSize)\n      var n = 0\n      while (reader.read(buffer).also { n = it } != -1) {\n        stringBuilder.append(buffer, 0, n)\n      }\n      stringBuilder.toString()\n    }");
                            e(bufferedInputStream);
                            e(inputStreamReader);
                            return string;
                        }
                        sb2.append(cArr, 0, i10);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    e(bufferedInputStream);
                    e(inputStreamReader);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                inputStreamReader = null;
            }
        } catch (Throwable th4) {
            bufferedInputStream = null;
            th = th4;
            inputStreamReader = null;
        }
    }

    public static final void F(Runnable runnable) {
        try {
            q.c().execute(runnable);
        } catch (Exception unused) {
        }
    }

    public static final void G(Context context, JSONObject jSONObject) throws JSONException {
        Locale locale;
        String language;
        int i10;
        int i11;
        String country;
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("a2");
        int i12 = 0;
        if (f44927b == -1 || System.currentTimeMillis() - f44927b >= 1800000) {
            f44927b = System.currentTimeMillis();
            try {
                TimeZone timeZone = TimeZone.getDefault();
                String displayName = timeZone.getDisplayName(timeZone.inDaylightTime(new Date()), 0);
                i.d(displayName, "tz.getDisplayName(tz.inDaylightTime(Date()), TimeZone.SHORT)");
                f44930e = displayName;
                String id = timeZone.getID();
                i.d(id, "tz.id");
                f44931f = id;
            } catch (AssertionError | Exception unused) {
            }
            if (f44932g.equals("NoCarrier")) {
                try {
                    Object systemService = context.getSystemService(AttributeType.PHONE);
                    if (systemService == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.telephony.TelephonyManager");
                    }
                    String networkOperatorName = ((TelephonyManager) systemService).getNetworkOperatorName();
                    i.d(networkOperatorName, "telephonyManager.networkOperatorName");
                    f44932g = networkOperatorName;
                } catch (Exception unused2) {
                }
            }
            try {
                if ("mounted".equals(Environment.getExternalStorageState())) {
                    StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
                    f44928c = ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize());
                }
                f44928c = Math.round(f44928c / 1.073741824E9d);
            } catch (Exception unused3) {
            }
            try {
                if ("mounted".equals(Environment.getExternalStorageState())) {
                    StatFs statFs2 = new StatFs(Environment.getExternalStorageDirectory().getPath());
                    f44929d = ((long) statFs2.getAvailableBlocks()) * ((long) statFs2.getBlockSize());
                }
                f44929d = Math.round(f44929d / 1.073741824E9d);
            } catch (Exception unused4) {
            }
        }
        String packageName = context.getPackageName();
        int i13 = -1;
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            if (packageInfo == null) {
                return;
            }
            i13 = packageInfo.versionCode;
            f44933h = packageInfo.versionName;
        } catch (PackageManager.NameNotFoundException unused5) {
        }
        jSONArray.put(packageName);
        jSONArray.put(i13);
        jSONArray.put(f44933h);
        jSONArray.put(Build.VERSION.RELEASE);
        jSONArray.put(Build.MODEL);
        try {
            locale = context.getResources().getConfiguration().locale;
        } catch (Exception unused6) {
            locale = Locale.getDefault();
        }
        f44934i = locale;
        StringBuilder sb2 = new StringBuilder();
        Locale locale2 = f44934i;
        String str = "";
        if (locale2 == null || (language = locale2.getLanguage()) == null) {
            language = "";
        }
        sb2.append(language);
        sb2.append('_');
        Locale locale3 = f44934i;
        if (locale3 != null && (country = locale3.getCountry()) != null) {
            str = country;
        }
        sb2.append(str);
        jSONArray.put(sb2.toString());
        jSONArray.put(f44930e);
        jSONArray.put(f44932g);
        double d10 = 0.0d;
        try {
            Object systemService2 = context.getSystemService("display");
            Display display = null;
            DisplayManager displayManager = systemService2 instanceof DisplayManager ? (DisplayManager) systemService2 : null;
            if (displayManager != null) {
                display = displayManager.getDisplay(0);
            }
            if (display != null) {
                DisplayMetrics displayMetrics = new DisplayMetrics();
                display.getMetrics(displayMetrics);
                i10 = displayMetrics.widthPixels;
                try {
                    i12 = displayMetrics.heightPixels;
                    d10 = displayMetrics.density;
                } catch (Exception unused7) {
                }
                i11 = i12;
                i12 = i10;
            } else {
                i11 = 0;
            }
        } catch (Exception unused8) {
            i10 = 0;
        }
        jSONArray.put(i12);
        jSONArray.put(i11);
        jSONArray.put(new DecimalFormat("#.##").format(d10));
        int i14 = f44926a;
        if (i14 <= 0) {
            try {
                File[] fileArrListFiles = new File("/sys/devices/system/cpu/").listFiles(new r());
                if (fileArrListFiles != null) {
                    f44926a = fileArrListFiles.length;
                }
            } catch (Exception unused9) {
            }
            if (f44926a <= 0) {
                f44926a = Math.max(Runtime.getRuntime().availableProcessors(), 1);
            }
            i14 = f44926a;
        }
        jSONArray.put(i14);
        jSONArray.put(f44928c);
        jSONArray.put(f44929d);
        jSONArray.put(f44931f);
        jSONObject.put("extinfo", jSONArray.toString());
    }

    public static final String H(String str) {
        if (str == null) {
            return null;
        }
        byte[] bytes = str.getBytes(kotlin.text.a.f43120b);
        i.d(bytes, "(this as java.lang.String).getBytes(charset)");
        return s("SHA-256", bytes);
    }

    public static final void I(Parcel parcel, Map<String, String> map) {
        i.e(parcel, "parcel");
        if (map == null) {
            parcel.writeInt(-1);
            return;
        }
        parcel.writeInt(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            parcel.writeString(key);
            parcel.writeString(value);
        }
    }

    public static final <T> boolean a(T t8, T t10) {
        if (t8 == null) {
            return t10 == null;
        }
        return t8.equals(t10);
    }

    public static final Uri b(Bundle bundle, String str, String str2) {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("https");
        builder.authority(str);
        builder.path(str2);
        if (bundle != null) {
            for (String str3 : bundle.keySet()) {
                Object obj = bundle.get(str3);
                if (obj instanceof String) {
                    builder.appendQueryParameter(str3, (String) obj);
                }
            }
        }
        Uri uriBuild = builder.build();
        i.d(uriBuild, "builder.build()");
        return uriBuild;
    }

    public static void c(Context context, String str) {
        CookieSyncManager.createInstance(context).sync();
        CookieManager cookieManager = CookieManager.getInstance();
        String cookie = cookieManager.getCookie(str);
        if (cookie == null) {
            return;
        }
        Object[] array = n.e0(cookie, new String[]{";"}, 0, 6).toArray(new String[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        String[] strArr = (String[]) array;
        int length = strArr.length;
        int i10 = 0;
        while (i10 < length) {
            String str2 = strArr[i10];
            i10++;
            Object[] array2 = n.e0(str2, new String[]{"="}, 0, 6).toArray(new String[0]);
            if (array2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            String[] strArr2 = (String[]) array2;
            if (strArr2.length > 0) {
                String str3 = strArr2[0];
                int length2 = str3.length() - 1;
                int i11 = 0;
                boolean z10 = false;
                while (i11 <= length2) {
                    boolean z11 = i.g(str3.charAt(!z10 ? i11 : length2), 32) <= 0;
                    if (z10) {
                        if (!z11) {
                            break;
                        } else {
                            length2--;
                        }
                    } else if (z11) {
                        i11++;
                    } else {
                        z10 = true;
                    }
                }
                cookieManager.setCookie(str, i.k("=;expires=Sat, 1 Jan 2000 00:00:01 UTC;", str3.subSequence(i11, length2 + 1).toString()));
            }
        }
        cookieManager.removeExpiredCookie();
    }

    public static final void d(Context context) {
        try {
            c(context, "facebook.com");
            c(context, ".facebook.com");
            c(context, "https://facebook.com");
            c(context, "https://.facebook.com");
        } catch (Exception unused) {
        }
    }

    public static final void e(Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (IOException unused) {
        }
    }

    public static final String f(String str) {
        return y(str) ? "" : str;
    }

    public static final ArrayList g(JSONArray jSONArray) {
        try {
            ArrayList arrayList = new ArrayList();
            int length = jSONArray.length();
            if (length <= 0) {
                return arrayList;
            }
            int i10 = 0;
            while (true) {
                int i11 = i10 + 1;
                String string = jSONArray.getString(i10);
                i.d(string, "jsonArray.getString(i)");
                arrayList.add(string);
                if (i11 >= length) {
                    return arrayList;
                }
                i10 = i11;
            }
        } catch (JSONException unused) {
            return new ArrayList();
        }
    }

    public static final HashMap h(JSONObject jsonObject) {
        int length;
        i.e(jsonObject, "jsonObject");
        HashMap map = new HashMap();
        JSONArray jSONArrayNames = jsonObject.names();
        if (jSONArrayNames != null && (length = jSONArrayNames.length()) > 0) {
            int i10 = 0;
            while (true) {
                int i11 = i10 + 1;
                try {
                    String string = jSONArrayNames.getString(i10);
                    i.d(string, "keys.getString(i)");
                    Object value = jsonObject.get(string);
                    if (value instanceof JSONObject) {
                        value = h((JSONObject) value);
                    }
                    i.d(value, "value");
                    map.put(string, value);
                } catch (JSONException unused) {
                }
                if (i11 >= length) {
                    break;
                }
                i10 = i11;
            }
        }
        return map;
    }

    public static final HashMap i(JSONObject jSONObject) {
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String key = itKeys.next();
            String strOptString = jSONObject.optString(key);
            if (strOptString != null) {
                i.d(key, "key");
                map.put(key, strOptString);
            }
        }
        return map;
    }

    public static final int j(InputStream inputStream, OutputStream outputStream) throws Throwable {
        BufferedInputStream bufferedInputStream = null;
        try {
            BufferedInputStream bufferedInputStream2 = new BufferedInputStream(inputStream);
            try {
                byte[] bArr = new byte[8192];
                int i10 = 0;
                while (true) {
                    int i11 = bufferedInputStream2.read(bArr);
                    if (i11 == -1) {
                        break;
                    }
                    outputStream.write(bArr, 0, i11);
                    i10 += i11;
                }
                bufferedInputStream2.close();
                if (inputStream != null) {
                    inputStream.close();
                }
                return i10;
            } catch (Throwable th) {
                th = th;
                bufferedInputStream = bufferedInputStream2;
                if (bufferedInputStream != null) {
                    bufferedInputStream.close();
                }
                if (inputStream != null) {
                    inputStream.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static final void k(HttpURLConnection httpURLConnection) {
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
    }

    public static final String l(Context context) {
        if (context == null) {
            return "null";
        }
        return context == context.getApplicationContext() ? "unknown" : context.getClass().getSimpleName();
    }

    public static final Date m(Bundle bundle, String str, Date date) {
        long jLongValue;
        if (bundle == null) {
            return null;
        }
        Object obj = bundle.get(str);
        if (!(obj instanceof Long)) {
            if (obj instanceof String) {
                try {
                    jLongValue = Long.parseLong((String) obj);
                } catch (NumberFormatException unused) {
                }
            }
            return null;
        }
        jLongValue = ((Number) obj).longValue();
        if (jLongValue == 0) {
            return new Date(Long.MAX_VALUE);
        }
        return new Date((jLongValue * 1000) + date.getTime());
    }

    public static final JSONObject n() {
        String string = q.a().getSharedPreferences("com.facebook.sdk.DataProcessingOptions", 0).getString("data_processing_options", null);
        if (string != null) {
            try {
                return new JSONObject(string);
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    public static final void o(final String accessToken, final a aVar) {
        String str;
        i.e(accessToken, "accessToken");
        ConcurrentHashMap<String, JSONObject> concurrentHashMap = o.f44922a;
        JSONObject jSONObject = o.f44922a.get(accessToken);
        if (jSONObject != null) {
            aVar.a(jSONObject);
            return;
        }
        r.b bVar = new r.b() { // from class: n4.q
            @Override // Z3.r.b
            public final void b(x xVar) {
                s.a aVar2 = aVar;
                String accessToken2 = accessToken;
                i.e(accessToken2, "$accessToken");
                FacebookRequestError facebookRequestError = xVar.f7905c;
                if (facebookRequestError != null) {
                    aVar2.c(facebookRequestError.j);
                    return;
                }
                ConcurrentHashMap<String, JSONObject> concurrentHashMap2 = o.f44922a;
                JSONObject jSONObject2 = xVar.f7906d;
                if (jSONObject2 == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                o.f44922a.put(accessToken2, jSONObject2);
                aVar2.a(jSONObject2);
            }
        };
        HttpMethod httpMethod = HttpMethod.f24771b;
        Bundle bundle = new Bundle();
        Date date = C0835a.f7782m;
        C0835a c0835aB = C0835a.b.b();
        if (c0835aB == null || (str = c0835aB.f7794l) == null) {
            str = "facebook";
        }
        bundle.putString("fields", str.equals("instagram") ? "id,name,profile_picture" : "id,name,first_name,middle_name,last_name");
        bundle.putString("access_token", accessToken);
        String str2 = r.j;
        r rVarH = r.c.h(null, null);
        rVarH.f7876d = bundle;
        rVarH.f7880h = httpMethod;
        rVarH.j(bVar);
        rVarH.d();
    }

    public static final Method p(Class<?> cls, String str, Class<?>... parameterTypes) {
        i.e(parameterTypes, "parameterTypes");
        try {
            return cls.getMethod(str, (Class[]) Arrays.copyOf(parameterTypes, parameterTypes.length));
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    public static final Method q(String str, String str2, Class<?>... clsArr) {
        try {
            return p(Class.forName(str), str2, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public static final Object r(String str, JSONObject jSONObject, String str2) throws JSONException {
        Object objOpt = jSONObject.opt(str);
        if (objOpt != null && (objOpt instanceof String)) {
            objOpt = new JSONTokener((String) objOpt).nextValue();
        }
        if (objOpt == null || (objOpt instanceof JSONObject) || (objOpt instanceof JSONArray)) {
            return objOpt;
        }
        if (str2 == null) {
            throw new FacebookException("Got an unexpected non-JSON object.");
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.putOpt(str2, objOpt);
        return jSONObject2;
    }

    public static String s(String str, byte[] bArr) {
        try {
            MessageDigest hash = MessageDigest.getInstance(str);
            i.d(hash, "hash");
            hash.update(bArr);
            byte[] digest = hash.digest();
            StringBuilder sb2 = new StringBuilder();
            i.d(digest, "digest");
            int length = digest.length;
            int i10 = 0;
            while (i10 < length) {
                byte b10 = digest[i10];
                i10++;
                sb2.append(Integer.toHexString((b10 >> 4) & 15));
                sb2.append(Integer.toHexString(b10 & 15));
            }
            String string = sb2.toString();
            i.d(string, "builder.toString()");
            return string;
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    public static final Object t(Object obj, Method method, Object... objArr) {
        try {
            return method.invoke(obj, Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public static final boolean u() {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse(String.format("fb%s://applinks", Arrays.copyOf(new Object[]{q.b()}, 1))));
            Context contextA = q.a();
            PackageManager packageManager = contextA.getPackageManager();
            String packageName = contextA.getPackageName();
            List<ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
            i.d(listQueryIntentActivities, "packageManager.queryIntentActivities(intent, PackageManager.MATCH_DEFAULT_ONLY)");
            Iterator<ResolveInfo> it = listQueryIntentActivities.iterator();
            while (it.hasNext()) {
                if (i.a(packageName, it.next().activityInfo.packageName)) {
                    return true;
                }
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    public static final boolean v(ActivityC1347l context) {
        i.e(context, "context");
        if (Build.VERSION.SDK_INT >= 27) {
            return context.getPackageManager().hasSystemFeature("android.hardware.type.pc");
        }
        String str = Build.DEVICE;
        return str != null && new Regex(".+_cheets|cheets_.+").e(str);
    }

    public static final boolean w() {
        JSONObject jSONObjectN = n();
        if (jSONObjectN == null) {
            return false;
        }
        try {
            JSONArray jSONArray = jSONObjectN.getJSONArray("data_processing_options");
            int length = jSONArray.length();
            if (length > 0) {
                int i10 = 0;
                while (true) {
                    int i11 = i10 + 1;
                    String string = jSONArray.getString(i10);
                    i.d(string, "options.getString(i)");
                    String lowerCase = string.toLowerCase();
                    i.d(lowerCase, "(this as java.lang.String).toLowerCase()");
                    if (lowerCase.equals("ldu")) {
                        return true;
                    }
                    if (i11 < length) {
                        i10 = i11;
                    }
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public static boolean x(Context context) {
        Method methodQ = q("com.google.android.gms.common.GooglePlayServicesUtil", "isGooglePlayServicesAvailable", Context.class);
        if (methodQ == null) {
            return false;
        }
        Object objT = t(null, methodQ, context);
        return (objT instanceof Integer) && i.a(objT, 0);
    }

    public static final boolean y(String str) {
        return str == null || str.length() == 0;
    }

    public static final ArrayList z(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        if (length > 0) {
            int i10 = 0;
            while (true) {
                int i11 = i10 + 1;
                arrayList.add(jSONArray.getString(i10));
                if (i11 >= length) {
                    break;
                }
                i10 = i11;
            }
        }
        return arrayList;
    }
}
