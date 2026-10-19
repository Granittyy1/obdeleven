package p313z6;

import D6.f;
import N6.d;
import android.util.Log;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: MetaDataStore.java */
/* JADX INFO: loaded from: classes3.dex */
public final class g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Charset f48864b = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f48865a;

    public g(f fVar) {
        this.f48865a = fVar;
    }

    public static HashMap a(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            String strOptString = null;
            if (!jSONObject.isNull(next)) {
                strOptString = jSONObject.optString(next, null);
            }
            map.put(next, strOptString);
        }
        return map;
    }

    public static ArrayList b(String str) throws JSONException {
        JSONArray jSONArray = new JSONObject(str).getJSONArray("rolloutsState");
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            String string = jSONArray.getString(i10);
            try {
                d dVar = k.f48888a;
                JSONObject jSONObject = new JSONObject(string);
                String string2 = jSONObject.getString("rolloutId");
                String string3 = jSONObject.getString("parameterKey");
                String string4 = jSONObject.getString("parameterValue");
                String string5 = jSONObject.getString("variantId");
                long j = jSONObject.getLong("templateVersion");
                if (string4.length() > 256) {
                    string4 = string4.substring(0, 256);
                }
                arrayList.add(new b(string2, string3, string4, string5, j));
            } catch (Exception unused) {
            }
        }
        return arrayList;
    }

    public static String e(List<k> list) {
        HashMap map = new HashMap();
        JSONArray jSONArray = new JSONArray();
        for (int i10 = 0; i10 < list.size(); i10++) {
            try {
                jSONArray.put(new JSONObject(k.f48888a.a(list.get(i10))));
            } catch (JSONException unused) {
            }
        }
        map.put("rolloutsState", jSONArray);
        return new JSONObject(map).toString();
    }

    public static void f(File file) {
        if (file.exists() && file.delete()) {
            file.getAbsolutePath();
        }
    }

    public final Map<String, String> c(String str, boolean z10) throws Throwable {
        f fVar = this.f48865a;
        File fileB = z10 ? fVar.b(str, "internal-keys") : fVar.b(str, "keys");
        if (!fileB.exists() || fileB.length() == 0) {
            f(fileB);
            return Collections.emptyMap();
        }
        FileInputStream fileInputStream = null;
        try {
            try {
                FileInputStream fileInputStream2 = new FileInputStream(fileB);
                try {
                    HashMap mapA = a(CommonUtils.i(fileInputStream2));
                    CommonUtils.b(fileInputStream2, "Failed to close user metadata file.");
                    return mapA;
                } catch (Exception unused) {
                    fileInputStream = fileInputStream2;
                    f(fileB);
                    CommonUtils.b(fileInputStream, "Failed to close user metadata file.");
                    return Collections.emptyMap();
                } catch (Throwable th) {
                    th = th;
                    fileInputStream = fileInputStream2;
                    CommonUtils.b(fileInputStream, "Failed to close user metadata file.");
                    throw th;
                }
            } catch (Exception unused2) {
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final String d(String str) {
        FileInputStream fileInputStream;
        File fileB = this.f48865a.b(str, "user-data");
        FileInputStream fileInputStream2 = null;
        if (!fileB.exists() || fileB.length() == 0) {
            Log.isLoggable("FirebaseCrashlytics", 3);
            f(fileB);
            return null;
        }
        try {
            fileInputStream = new FileInputStream(fileB);
            try {
                try {
                    JSONObject jSONObject = new JSONObject(CommonUtils.i(fileInputStream));
                    String strOptString = !jSONObject.isNull("userId") ? jSONObject.optString("userId", null) : null;
                    Log.isLoggable("FirebaseCrashlytics", 3);
                    CommonUtils.b(fileInputStream, "Failed to close user metadata file.");
                    return strOptString;
                } catch (Exception unused) {
                    f(fileB);
                    CommonUtils.b(fileInputStream, "Failed to close user metadata file.");
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                fileInputStream2 = fileInputStream;
                CommonUtils.b(fileInputStream2, "Failed to close user metadata file.");
                throw th;
            }
        } catch (Exception unused2) {
            fileInputStream = null;
        } catch (Throwable th2) {
            th = th2;
            CommonUtils.b(fileInputStream2, "Failed to close user metadata file.");
            throw th;
        }
    }

    public final void g(String str, Map<String, String> map, boolean z10) throws Throwable {
        f fVar = this.f48865a;
        File fileB = z10 ? fVar.b(str, "internal-keys") : fVar.b(str, "keys");
        BufferedWriter bufferedWriter = null;
        try {
            try {
                String string = new JSONObject(map).toString();
                BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileB), f48864b));
                try {
                    bufferedWriter2.write(string);
                    bufferedWriter2.flush();
                    CommonUtils.b(bufferedWriter2, "Failed to close key/value metadata file.");
                } catch (Exception unused) {
                    bufferedWriter = bufferedWriter2;
                    f(fileB);
                    CommonUtils.b(bufferedWriter, "Failed to close key/value metadata file.");
                } catch (Throwable th) {
                    th = th;
                    bufferedWriter = bufferedWriter2;
                    CommonUtils.b(bufferedWriter, "Failed to close key/value metadata file.");
                    throw th;
                }
            } catch (Exception unused2) {
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final void h(String str, List<k> list) throws Throwable {
        File fileB = this.f48865a.b(str, "rollouts-state");
        if (list.isEmpty()) {
            f(fileB);
            return;
        }
        BufferedWriter bufferedWriter = null;
        try {
            try {
                String strE = e(list);
                BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileB), f48864b));
                try {
                    bufferedWriter2.write(strE);
                    bufferedWriter2.flush();
                    CommonUtils.b(bufferedWriter2, "Failed to close rollouts state file.");
                } catch (Exception unused) {
                    bufferedWriter = bufferedWriter2;
                    f(fileB);
                    CommonUtils.b(bufferedWriter, "Failed to close rollouts state file.");
                } catch (Throwable th) {
                    th = th;
                    bufferedWriter = bufferedWriter2;
                    CommonUtils.b(bufferedWriter, "Failed to close rollouts state file.");
                    throw th;
                }
            } catch (Exception unused2) {
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final void i(String str, String str2) throws Throwable {
        File fileB = this.f48865a.b(str, "user-data");
        BufferedWriter bufferedWriter = null;
        try {
            f fVar = new f();
            fVar.put("userId", str2);
            String string = fVar.toString();
            BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileB), f48864b));
            try {
                bufferedWriter2.write(string);
                bufferedWriter2.flush();
                CommonUtils.b(bufferedWriter2, "Failed to close user metadata file.");
            } catch (Exception unused) {
                bufferedWriter = bufferedWriter2;
                CommonUtils.b(bufferedWriter, "Failed to close user metadata file.");
            } catch (Throwable th) {
                th = th;
                bufferedWriter = bufferedWriter2;
                CommonUtils.b(bufferedWriter, "Failed to close user metadata file.");
                throw th;
            }
        } catch (Exception unused2) {
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
