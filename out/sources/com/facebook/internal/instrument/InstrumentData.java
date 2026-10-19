package com.facebook.internal.instrument;

import D2.V;
import android.os.Build;
import java.io.File;
import java.util.Arrays;
import kotlin.jvm.internal.i;
import kotlin.text.m;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: InstrumentData.kt */
/* JADX INFO: loaded from: classes.dex */
public final class InstrumentData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f25024a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Type f25025b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public JSONArray f25026c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f25027d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f25028e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f25029f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Long f25030g;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: InstrumentData.kt */
    public static final class Type {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Type f25031b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final Type f25032c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final Type f25033d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final Type f25034e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final Type f25035f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final Type f25036g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final /* synthetic */ Type[] f25037h;

        static {
            Type type = new Type("Unknown", 0);
            f25031b = type;
            Type type2 = new Type("Analysis", 1);
            f25032c = type2;
            Type type3 = new Type("AnrReport", 2);
            f25033d = type3;
            Type type4 = new Type("CrashReport", 3);
            f25034e = type4;
            Type type5 = new Type("CrashShield", 4);
            f25035f = type5;
            Type type6 = new Type("ThreadCheck", 5);
            f25036g = type6;
            f25037h = new Type[]{type, type2, type3, type4, type5, type6};
        }

        public Type() {
            throw null;
        }

        public static Type valueOf(String value) {
            i.e(value, "value");
            return (Type) Enum.valueOf(Type.class, value);
        }

        public static Type[] values() {
            return (Type[]) Arrays.copyOf(f25037h, 6);
        }

        @Override // java.lang.Enum
        public final String toString() {
            int iOrdinal = ordinal();
            if (iOrdinal == 1) {
                return "Analysis";
            }
            if (iOrdinal == 2) {
                return "AnrReport";
            }
            if (iOrdinal == 3) {
                return "CrashReport";
            }
            if (iOrdinal != 4) {
                return iOrdinal != 5 ? "Unknown" : "ThreadCheck";
            }
            return "CrashShield";
        }
    }

    /* JADX INFO: compiled from: InstrumentData.kt */
    public static final class a {
        public static final InstrumentData a(File file) {
            Type type;
            i.e(file, "file");
            InstrumentData instrumentData = new InstrumentData();
            String name = file.getName();
            i.d(name, "file.name");
            instrumentData.f25024a = name;
            if (m.I(name, "crash_log_", false)) {
                type = Type.f25034e;
            } else if (m.I(name, "shield_log_", false)) {
                type = Type.f25035f;
            } else if (m.I(name, "thread_check_log_", false)) {
                type = Type.f25036g;
            } else if (m.I(name, "analysis_log_", false)) {
                type = Type.f25032c;
            } else {
                type = m.I(name, "anr_log_", false) ? Type.f25033d : Type.f25031b;
            }
            instrumentData.f25025b = type;
            JSONObject jSONObjectO = V.o(name);
            if (jSONObjectO != null) {
                instrumentData.f25030g = Long.valueOf(jSONObjectO.optLong("timestamp", 0L));
                instrumentData.f25027d = jSONObjectO.optString("app_version", null);
                instrumentData.f25028e = jSONObjectO.optString("reason", null);
                instrumentData.f25029f = jSONObjectO.optString("callstack", null);
                instrumentData.f25026c = jSONObjectO.optJSONArray("feature_names");
            }
            return instrumentData;
        }
    }

    /* JADX INFO: compiled from: InstrumentData.kt */
    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f25038a;

        static {
            int[] iArr = new int[Type.values().length];
            iArr[1] = 1;
            iArr[2] = 2;
            iArr[3] = 3;
            iArr[4] = 4;
            iArr[5] = 5;
            f25038a = iArr;
        }
    }

    public final boolean a() {
        Type type = this.f25025b;
        int i10 = type == null ? -1 : b.f25038a[type.ordinal()];
        Long l10 = this.f25030g;
        if (i10 != 1) {
            String str = this.f25029f;
            if (i10 != 2) {
                if ((i10 != 3 && i10 != 4 && i10 != 5) || str == null || l10 == null) {
                    return false;
                }
            } else if (str == null || this.f25028e == null || l10 == null) {
                return false;
            }
        } else if (this.f25026c == null || l10 == null) {
            return false;
        }
        return true;
    }

    public final String toString() {
        Type type = this.f25025b;
        int i10 = type == null ? -1 : b.f25038a[type.ordinal()];
        Long l10 = this.f25030g;
        JSONObject jSONObject = null;
        try {
            if (i10 == 1) {
                JSONObject jSONObject2 = new JSONObject();
                JSONArray jSONArray = this.f25026c;
                if (jSONArray != null) {
                    jSONObject2.put("feature_names", jSONArray);
                }
                if (l10 != null) {
                    jSONObject2.put("timestamp", l10);
                }
                jSONObject = jSONObject2;
            } else if (i10 == 2 || i10 == 3 || i10 == 4 || i10 == 5) {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("device_os_version", Build.VERSION.RELEASE);
                jSONObject3.put("device_model", Build.MODEL);
                String str = this.f25027d;
                if (str != null) {
                    jSONObject3.put("app_version", str);
                }
                if (l10 != null) {
                    jSONObject3.put("timestamp", l10);
                }
                String str2 = this.f25028e;
                if (str2 != null) {
                    jSONObject3.put("reason", str2);
                }
                String str3 = this.f25029f;
                if (str3 != null) {
                    jSONObject3.put("callstack", str3);
                }
                if (type != null) {
                    jSONObject3.put("type", type);
                }
                jSONObject = jSONObject3;
            }
        } catch (JSONException unused) {
        }
        if (jSONObject == null) {
            String string = new JSONObject().toString();
            i.d(string, "JSONObject().toString()");
            return string;
        }
        String string2 = jSONObject.toString();
        i.d(string2, "params.toString()");
        return string2;
    }
}
