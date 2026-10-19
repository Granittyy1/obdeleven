package com.facebook.appevents.ml;

import I2.e;
import Na.h;
import Z3.q;
import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.internal.FeatureManager;
import com.facebook.login.r;
import java.io.File;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.l;
import kotlin.jvm.internal.i;
import kotlin.text.Regex;
import kotlin.text.m;
import kotlin.text.n;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p093h4.g;
import p105i4.b;
import p105i4.c;
import p105i4.d;

/* JADX INFO: compiled from: ModelManager.kt */
/* JADX INFO: loaded from: classes.dex */
public final class ModelManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ConcurrentHashMap f24945a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List<String> f24946b = l.s("other", "fb_mobile_complete_registration", "fb_mobile_add_to_cart", "fb_mobile_purchase", "fb_mobile_initiated_checkout");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final List<String> f24947c = l.s("none", "address", "health");

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: ModelManager.kt */
    public static final class Task {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Task f24948b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final Task f24949c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ Task[] f24950d;

        static {
            Task task = new Task("MTML_INTEGRITY_DETECT", 0);
            f24948b = task;
            Task task2 = new Task("MTML_APP_EVENT_PREDICTION", 1);
            f24949c = task2;
            f24950d = new Task[]{task, task2};
        }

        public Task() {
            throw null;
        }

        public static Task valueOf(String value) {
            i.e(value, "value");
            return (Task) Enum.valueOf(Task.class, value);
        }

        public static Task[] values() {
            return (Task[]) Arrays.copyOf(f24950d, 2);
        }

        public final String a() {
            int iOrdinal = ordinal();
            if (iOrdinal == 0) {
                return "integrity_detect";
            }
            if (iOrdinal == 1) {
                return "app_event_pred";
            }
            throw new NoWhenBranchMatchedException();
        }

        public final String b() {
            int iOrdinal = ordinal();
            if (iOrdinal == 0) {
                return "MTML_INTEGRITY_DETECT";
            }
            if (iOrdinal == 1) {
                return "MTML_APP_EVENT_PRED";
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: compiled from: ModelManager.kt */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f24951a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f24952b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f24953c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f24954d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public float[] f24955e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public File f24956f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public b f24957g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public Runnable f24958h;

        /* JADX INFO: renamed from: com.facebook.appevents.ml.ModelManager$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: ModelManager.kt */
        public static final class C0262a {
            public static a a(JSONObject jSONObject) {
                float[] fArr;
                if (jSONObject == null) {
                    return null;
                }
                try {
                    String useCase = jSONObject.getString("use_case");
                    String assetUri = jSONObject.getString("asset_uri");
                    String strOptString = jSONObject.optString("rules_uri", null);
                    int i10 = jSONObject.getInt("version_id");
                    ConcurrentHashMap concurrentHashMap = ModelManager.f24945a;
                    JSONArray jSONArray = jSONObject.getJSONArray("thresholds");
                    if (jSONArray == null) {
                        fArr = null;
                    } else {
                        fArr = new float[jSONArray.length()];
                        int length = jSONArray.length();
                        if (length > 0) {
                            int i11 = 0;
                            while (true) {
                                int i12 = i11 + 1;
                                try {
                                    String string = jSONArray.getString(i11);
                                    i.d(string, "jsonArray.getString(i)");
                                    fArr[i11] = Float.parseFloat(string);
                                } catch (JSONException unused) {
                                }
                                if (i12 >= length) {
                                    break;
                                }
                                i11 = i12;
                            }
                        }
                    }
                    i.d(useCase, "useCase");
                    i.d(assetUri, "assetUri");
                    a aVar = new a();
                    aVar.f24951a = useCase;
                    aVar.f24952b = assetUri;
                    aVar.f24953c = strOptString;
                    aVar.f24954d = i10;
                    aVar.f24955e = fArr;
                    return aVar;
                } catch (Exception unused2) {
                    return null;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x006c  */
    public static void a() {
        File[] fileArrListFiles;
        Locale locale;
        ArrayList arrayList = new ArrayList();
        String str = null;
        int iMax = 0;
        for (Map.Entry entry : f24945a.entrySet()) {
            String str2 = (String) entry.getKey();
            a aVar = (a) entry.getValue();
            if (i.a(str2, Task.f24949c.b())) {
                str = aVar.f24952b;
                iMax = Math.max(iMax, aVar.f24954d);
                FeatureManager featureManager = FeatureManager.f24975a;
                if (FeatureManager.b(FeatureManager.Feature.SuggestedEvents)) {
                    try {
                        locale = q.a().getResources().getConfiguration().locale;
                    } catch (Exception unused) {
                        locale = null;
                    }
                    if (locale != null) {
                        String language = locale.getLanguage();
                        i.d(language, "locale.language");
                        if (n.J(language, "en", false)) {
                            aVar.f24958h = new c();
                            arrayList.add(aVar);
                        }
                    } else {
                        aVar.f24958h = new c();
                        arrayList.add(aVar);
                    }
                }
            }
            if (i.a(str2, Task.f24948b.b())) {
                str = aVar.f24952b;
                iMax = Math.max(iMax, aVar.f24954d);
                FeatureManager featureManager2 = FeatureManager.f24975a;
                if (FeatureManager.b(FeatureManager.Feature.IntelligentIntegrity)) {
                    aVar.f24958h = new d();
                    arrayList.add(aVar);
                }
            }
        }
        if (str == null || iMax <= 0 || arrayList.isEmpty()) {
            return;
        }
        File fileJ = P3.d.j();
        if (fileJ != null && (fileArrListFiles = fileJ.listFiles()) != null && fileArrListFiles.length != 0) {
            String strB = J4.i.b(iMax, "MTML_");
            int length = fileArrListFiles.length;
            int i10 = 0;
            while (i10 < length) {
                File file = fileArrListFiles[i10];
                i10++;
                String name = file.getName();
                i.d(name, "name");
                if (m.I(name, "MTML", false) && !m.I(name, strB, false)) {
                    file.delete();
                }
            }
        }
        String strB2 = J4.i.b(iMax, "MTML_");
        r rVar = new r(arrayList);
        File file2 = new File(P3.d.j(), strB2);
        if (file2.exists()) {
            rVar.a(file2);
        } else {
            new g(str, file2, rVar).execute(new String[0]);
        }
    }

    public static JSONObject b() {
        Bundle bundle = new Bundle();
        bundle.putString("fields", TextUtils.join(",", new String[]{"use_case", "version_id", "asset_uri", "rules_uri", "thresholds"}));
        String str = Z3.r.j;
        Z3.r rVarG = Z3.r.c.g(null, "app/model_asset", null);
        rVarG.f7876d = bundle;
        JSONObject jSONObject = rVarG.c().f7904b;
        if (jSONObject == null) {
            return null;
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            JSONArray jSONArray = jSONObject.getJSONArray("data");
            int length = jSONArray.length();
            if (length <= 0) {
                return jSONObject2;
            }
            int i10 = 0;
            while (true) {
                int i11 = i10 + 1;
                JSONObject jSONObject3 = jSONArray.getJSONObject(i10);
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put("version_id", jSONObject3.getString("version_id"));
                jSONObject4.put("use_case", jSONObject3.getString("use_case"));
                jSONObject4.put("thresholds", jSONObject3.getJSONArray("thresholds"));
                jSONObject4.put("asset_uri", jSONObject3.getString("asset_uri"));
                if (jSONObject3.has("rules_uri")) {
                    jSONObject4.put("rules_uri", jSONObject3.getString("rules_uri"));
                }
                jSONObject2.put(jSONObject3.getString("use_case"), jSONObject4);
                if (i11 >= length) {
                    return jSONObject2;
                }
                i10 = i11;
            }
        } catch (JSONException unused) {
            return new JSONObject();
        }
    }

    public static final String[] c(Task task, float[][] fArr, String[] strArr) {
        float[] fArr2;
        String str;
        p105i4.a aVarE;
        String[] strArr2 = strArr;
        a aVar = (a) f24945a.get(task.b());
        b bVar = aVar == null ? null : aVar.f24957g;
        if (bVar == null) {
            return null;
        }
        float[] fArr3 = aVar.f24955e;
        int length = strArr2.length;
        int length2 = fArr[0].length;
        p105i4.a aVar2 = new p105i4.a(new int[]{length, length2});
        if (length > 0) {
            int i10 = 0;
            while (true) {
                int i11 = i10 + 1;
                System.arraycopy(fArr[i10], 0, aVar2.f36725c, i10 * length2, length2);
                if (i11 >= length) {
                    break;
                }
                i10 = i11;
            }
        }
        String strA = task.a();
        p105i4.a w3 = bVar.f36727a;
        i.e(w3, "w");
        int length3 = strArr2.length;
        int i12 = w3.f36723a[1];
        int i13 = 128;
        p105i4.a aVar3 = new p105i4.a(new int[]{length3, 128, i12});
        float[] fArr4 = aVar3.f36725c;
        float[] fArr5 = w3.f36725c;
        if (length3 > 0) {
            int i14 = 0;
            while (true) {
                int i15 = i14 + 1;
                String texts = strArr2[i14];
                i.e(texts, "texts");
                int[] iArr = new int[i13];
                int length4 = texts.length() - 1;
                int i16 = 0;
                boolean z10 = false;
                while (true) {
                    fArr2 = fArr3;
                    if (i16 > length4) {
                        str = strA;
                        break;
                    }
                    str = strA;
                    boolean z11 = i.g(texts.charAt(!z10 ? i16 : length4), 32) <= 0;
                    if (z10) {
                        if (!z11) {
                            break;
                        }
                        length4--;
                    } else if (z11) {
                        i16++;
                    } else {
                        z10 = true;
                    }
                    fArr3 = fArr2;
                    strA = str;
                }
                Object[] array = new Regex("\\s+").h(texts.subSequence(i16, length4 + 1).toString(), 0).toArray(new String[0]);
                if (array == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
                String strJoin = TextUtils.join(" ", (String[]) array);
                i.d(strJoin, "join(\" \", strArray)");
                Charset charsetForName = Charset.forName("UTF-8");
                i.d(charsetForName, "forName(\"UTF-8\")");
                byte[] bytes = strJoin.getBytes(charsetForName);
                i.d(bytes, "(this as java.lang.String).getBytes(charset)");
                int i17 = 0;
                while (true) {
                    int i18 = i17 + 1;
                    if (i17 < bytes.length) {
                        iArr[i17] = bytes[i17] & 255;
                    } else {
                        iArr[i17] = 0;
                    }
                    if (i18 >= 128) {
                        break;
                    }
                    i17 = i18;
                }
                int i19 = 0;
                while (true) {
                    int i20 = i19 + 1;
                    System.arraycopy(fArr5, iArr[i19] * i12, fArr4, (i19 * i12) + (i12 * 128 * i14), i12);
                    if (i20 >= 128) {
                        break;
                    }
                    i19 = i20;
                }
                if (i15 >= length3) {
                    break;
                }
                strArr2 = strArr;
                i14 = i15;
                i13 = 128;
                fArr3 = fArr2;
                strA = str;
            }
        } else {
            fArr2 = fArr3;
            str = strA;
        }
        p105i4.a aVarD = e.d(aVar3, bVar.f36728b);
        e.c(aVarD, bVar.f36731e);
        e.o(aVarD);
        p105i4.a aVarD2 = e.d(aVarD, bVar.f36729c);
        e.c(aVarD2, bVar.f36732f);
        e.o(aVarD2);
        p105i4.a aVarN = e.n(aVarD2, 2);
        p105i4.a aVarD3 = e.d(aVarN, bVar.f36730d);
        e.c(aVarD3, bVar.f36733g);
        e.o(aVarD3);
        p105i4.a aVarN2 = e.n(aVarD, aVarD.f36723a[1]);
        p105i4.a aVarN3 = e.n(aVarN, aVarN.f36723a[1]);
        p105i4.a aVarN4 = e.n(aVarD3, aVarD3.f36723a[1]);
        e.g(aVarN2);
        e.g(aVarN3);
        e.g(aVarN4);
        p105i4.a[] aVarArr = {aVarN2, aVarN3, aVarN4, aVar2};
        int i21 = aVarArr[0].f36723a[0];
        int i22 = 0;
        int i23 = 0;
        while (true) {
            int i24 = i22 + 1;
            i23 += aVarArr[i22].f36723a[1];
            if (i24 > 3) {
                break;
            }
            i22 = i24;
        }
        p105i4.a aVar4 = new p105i4.a(new int[]{i21, i23});
        float[] fArr6 = aVar4.f36725c;
        if (i21 > 0) {
            int i25 = 0;
            while (true) {
                int i26 = i25 + 1;
                int i27 = i25 * i23;
                int i28 = 0;
                while (true) {
                    int i29 = i28 + 1;
                    p105i4.a aVar5 = aVarArr[i28];
                    float[] fArr7 = aVar5.f36725c;
                    int i30 = aVar5.f36723a[1];
                    System.arraycopy(fArr7, i25 * i30, fArr6, i27, i30);
                    i27 += i30;
                    if (i29 > 3) {
                        break;
                    }
                    i28 = i29;
                }
                if (i26 >= i21) {
                    break;
                }
                i25 = i26;
            }
        }
        p105i4.a aVarE2 = e.e(aVar4, bVar.f36734h, bVar.j);
        e.o(aVarE2);
        p105i4.a aVarE3 = e.e(aVarE2, bVar.f36735i, bVar.f36736k);
        e.o(aVarE3);
        HashMap map = bVar.f36737l;
        String str2 = str;
        p105i4.a aVar6 = (p105i4.a) map.get(i.k(".weight", str2));
        p105i4.a aVar7 = (p105i4.a) map.get(i.k(".bias", str2));
        if (aVar6 == null || aVar7 == null) {
            aVarE = null;
        } else {
            aVarE = e.e(aVarE3, aVar6, aVar7);
            int[] iArr2 = aVarE.f36723a;
            int i31 = iArr2[0];
            int i32 = iArr2[1];
            float[] fArr8 = aVarE.f36725c;
            if (i31 > 0) {
                int i33 = 0;
                while (true) {
                    int i34 = i33 + 1;
                    int i35 = i33 * i32;
                    int i36 = i35 + i32;
                    float f10 = Float.MIN_VALUE;
                    if (i35 < i36) {
                        int i37 = i35;
                        while (true) {
                            int i38 = i37 + 1;
                            float f11 = fArr8[i37];
                            if (f11 > f10) {
                                f10 = f11;
                            }
                            if (i38 >= i36) {
                                break;
                            }
                            i37 = i38;
                        }
                    }
                    float f12 = 0.0f;
                    if (i35 < i36) {
                        int i39 = i35;
                        while (true) {
                            int i40 = i39 + 1;
                            float fExp = (float) Math.exp(fArr8[i39] - f10);
                            fArr8[i39] = fExp;
                            f12 += fExp;
                            if (i40 >= i36) {
                                break;
                            }
                            i39 = i40;
                        }
                    }
                    if (i35 < i36) {
                        while (true) {
                            int i41 = i35 + 1;
                            fArr8[i35] = fArr8[i35] / f12;
                            if (i41 >= i36) {
                                break;
                            }
                            i35 = i41;
                        }
                    }
                    if (i34 >= i31) {
                        break;
                    }
                    i33 = i34;
                }
            }
        }
        if (aVarE != null && fArr2 != null && aVarE.f36725c.length != 0) {
            float[] fArr9 = fArr2;
            if (fArr9.length != 0) {
                int iOrdinal = task.ordinal();
                if (iOrdinal == 0) {
                    int[] iArr3 = aVarE.f36723a;
                    int i42 = iArr3[0];
                    int i43 = iArr3[1];
                    float[] fArr10 = aVarE.f36725c;
                    if (i43 == fArr9.length) {
                        Na.i iVarJ = Na.l.J(0, i42);
                        ArrayList arrayList = new ArrayList(kotlin.collections.m.y(iVarJ, 10));
                        h it = iVarJ.iterator();
                        while (it.f4692d) {
                            int iA = it.a();
                            int length5 = fArr9.length;
                            String str3 = "none";
                            int i44 = 0;
                            int i45 = 0;
                            while (i44 < length5) {
                                int i46 = i45 + 1;
                                if (fArr10[(iA * i43) + i45] >= fArr9[i44]) {
                                    str3 = f24947c.get(i45);
                                }
                                i44++;
                                i45 = i46;
                            }
                            arrayList.add(str3);
                        }
                        Object[] array2 = arrayList.toArray(new String[0]);
                        if (array2 != null) {
                            return (String[]) array2;
                        }
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                    }
                } else {
                    if (iOrdinal != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    int[] iArr4 = aVarE.f36723a;
                    int i47 = iArr4[0];
                    int i48 = iArr4[1];
                    float[] fArr11 = aVarE.f36725c;
                    if (i48 == fArr9.length) {
                        Na.i iVarJ2 = Na.l.J(0, i47);
                        ArrayList arrayList2 = new ArrayList(kotlin.collections.m.y(iVarJ2, 10));
                        h it2 = iVarJ2.iterator();
                        while (it2.f4692d) {
                            int iA2 = it2.a();
                            int length6 = fArr9.length;
                            String str4 = "other";
                            int i49 = 0;
                            int i50 = 0;
                            while (i49 < length6) {
                                int i51 = i50 + 1;
                                if (fArr11[(iA2 * i48) + i50] >= fArr9[i49]) {
                                    str4 = f24946b.get(i50);
                                }
                                i49++;
                                i50 = i51;
                            }
                            arrayList2.add(str4);
                        }
                        Object[] array3 = arrayList2.toArray(new String[0]);
                        if (array3 != null) {
                            return (String[]) array3;
                        }
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                    }
                }
            }
        }
        return null;
    }
}
