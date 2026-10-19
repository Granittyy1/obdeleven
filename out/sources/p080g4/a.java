package p080g4;

import Z3.q;
import android.os.Build;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;
import kotlin.jvm.internal.i;
import kotlin.text.Regex;
import kotlin.text.m;
import kotlin.text.n;
import me.zhanghai.android.materialprogressbar.R;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p165n4.s;

/* JADX INFO: compiled from: MACARuleMatchingManager.kt */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f35599a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static JSONArray f35600b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String[] f35601c = {"event", "_locale", "_appVersion", "_deviceOS", "_platform", "_deviceModel", "_nativeAppID", "_nativeAppShortVersion", "_timezone", "_carrier", "_deviceOSTypeName", "_deviceOSVersion", "_remainingDiskGB"};

    public static final void a(Bundle params, String event) {
        String language;
        String country;
        i.e(params, "params");
        i.e(event, "event");
        params.putString("event", event);
        StringBuilder sb2 = new StringBuilder();
        Locale locale = s.f44934i;
        if (locale == null || (language = locale.getLanguage()) == null) {
            language = "";
        }
        sb2.append(language);
        sb2.append('_');
        Locale locale2 = s.f44934i;
        if (locale2 == null || (country = locale2.getCountry()) == null) {
            country = "";
        }
        sb2.append(country);
        params.putString("_locale", sb2.toString());
        String str = s.f44933h;
        if (str == null) {
            str = "";
        }
        params.putString("_appVersion", str);
        params.putString("_deviceOS", "ANDROID");
        params.putString("_platform", "mobile");
        String str2 = Build.MODEL;
        if (str2 == null) {
            str2 = "";
        }
        params.putString("_deviceModel", str2);
        params.putString("_nativeAppID", q.b());
        String str3 = s.f44933h;
        params.putString("_nativeAppShortVersion", str3 != null ? str3 : "");
        params.putString("_timezone", s.f44931f);
        params.putString("_carrier", s.f44932g);
        params.putString("_deviceOSTypeName", "ANDROID");
        params.putString("_deviceOSVersion", Build.VERSION.RELEASE);
        params.putLong("_remainingDiskGB", s.f44929d);
    }

    public static final String b(Bundle bundle) {
        String strOptString;
        JSONArray jSONArray = f35600b;
        if (jSONArray == null) {
            return "[]";
        }
        Integer numValueOf = jSONArray == null ? null : Integer.valueOf(jSONArray.length());
        if (numValueOf != null && numValueOf.intValue() == 0) {
            return "[]";
        }
        JSONArray jSONArray2 = f35600b;
        if (jSONArray2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type org.json.JSONArray");
        }
        ArrayList arrayList = new ArrayList();
        int length = jSONArray2.length();
        if (length > 0) {
            int i10 = 0;
            while (true) {
                int i11 = i10 + 1;
                String strOptString2 = jSONArray2.optString(i10);
                if (strOptString2 != null) {
                    JSONObject jSONObject = new JSONObject(strOptString2);
                    long jOptLong = jSONObject.optLong("id");
                    if (jOptLong != 0 && (strOptString = jSONObject.optString("rule")) != null && c(bundle, strOptString)) {
                        arrayList.add(Long.valueOf(jOptLong));
                    }
                }
                if (i11 >= length) {
                    break;
                }
                i10 = i11;
            }
        }
        String string = new JSONArray((Collection) arrayList).toString();
        i.d(string, "JSONArray(res).toString()");
        return string;
    }

    /* JADX WARN: Code duplicated, block: B:192:0x02e2  */
    /* JADX WARN: Code duplicated, block: B:195:0x02ea  */
    /* JADX WARN: Code duplicated, block: B:198:0x02f4  */
    /* JADX WARN: Code duplicated, block: B:200:0x02fc  */
    /* JADX WARN: Code duplicated, block: B:202:0x030b  */
    /* JADX WARN: Code duplicated, block: B:220:0x0346  */
    /* JADX WARN: Code duplicated, block: B:222:0x034e  */
    /* JADX WARN: Code duplicated, block: B:224:0x035d  */
    /* JADX WARN: Code duplicated, block: B:265:0x0401  */
    /* JADX WARN: Code duplicated, block: B:271:0x0416  */
    /* JADX WARN: Code duplicated, block: B:302:0x0320 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:303:0x031a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:304:0x0446 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:305:? A[LOOP:1: B:196:0x02ee->B:305:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:306:0x0151 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:308:0x0372 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:309:0x036c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:310:? A[LOOP:2: B:218:0x0340->B:310:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:320:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:321:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:322:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:323:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:325:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:360:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:370:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:372:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final boolean c(Bundle bundle, String str) throws JSONException {
        int length;
        Locale locale;
        String lowerCase;
        String string;
        String lowerCase2;
        Locale locale2;
        String lowerCase3;
        String string2;
        String lowerCase4;
        if (str != null && bundle != null) {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> itKeys = jSONObject.keys();
            ArrayList<String> arrayList = null;
            String next = itKeys.hasNext() ? itKeys.next() : null;
            if (next == null) {
                return false;
            }
            Object obj = jSONObject.get(next);
            int iHashCode = next.hashCode();
            if (iHashCode != 3555) {
                if (iHashCode != 96727) {
                    if (iHashCode == 109267 && next.equals("not")) {
                        return !c(bundle, obj.toString());
                    }
                } else if (next.equals("and")) {
                    JSONArray jSONArray = (JSONArray) obj;
                    if (jSONArray == null) {
                        return false;
                    }
                    int length2 = jSONArray.length();
                    if (length2 > 0) {
                        int i10 = 0;
                        while (true) {
                            int i11 = i10 + 1;
                            if (!c(bundle, jSONArray.get(i10).toString())) {
                                return false;
                            }
                            if (i11 < length2) {
                                i10 = i11;
                            }
                        }
                    }
                    return true;
                }
            } else if (next.equals("or")) {
                JSONArray jSONArray2 = (JSONArray) obj;
                if (jSONArray2 != null && (length = jSONArray2.length()) > 0) {
                    int i12 = 0;
                    while (true) {
                        int i13 = i12 + 1;
                        if (c(bundle, jSONArray2.get(i12).toString())) {
                            return true;
                        }
                        if (i13 < length) {
                            i12 = i13;
                        }
                    }
                }
            }
            JSONObject jSONObject2 = (JSONObject) obj;
            if (jSONObject2 == null) {
                return false;
            }
            Iterator<String> itKeys2 = jSONObject2.keys();
            String next2 = itKeys2.hasNext() ? itKeys2.next() : null;
            if (next2 == null) {
                return false;
            }
            String string3 = jSONObject2.get(next2).toString();
            JSONArray jSONArrayOptJSONArray = jSONObject2.optJSONArray(next2);
            if (jSONArrayOptJSONArray != null) {
                arrayList = new ArrayList();
                int length3 = jSONArrayOptJSONArray.length();
                if (length3 > 0) {
                    int i14 = 0;
                    while (true) {
                        int i15 = i14 + 1;
                        arrayList.add(jSONArrayOptJSONArray.get(i14).toString());
                        if (i15 >= length3) {
                            break;
                        }
                        i14 = i15;
                    }
                }
            }
            if (next2.equals("exists")) {
                return Boolean.valueOf(bundle.containsKey(next)).equals(Boolean.valueOf(Boolean.parseBoolean(string3)));
            }
            Locale locale3 = Locale.ROOT;
            String lowerCase5 = next.toLowerCase(locale3);
            i.d(lowerCase5, "(this as java.lang.Strin….toLowerCase(Locale.ROOT)");
            Object obj2 = bundle.get(lowerCase5);
            if (obj2 == null && (obj2 = bundle.get(next)) == null) {
                return false;
            }
            switch (next2.hashCode()) {
                case -1729128927:
                    if (!next2.equals("i_not_contains")) {
                        return false;
                    }
                    String string4 = obj2.toString();
                    if (string4 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                    }
                    String lowerCase6 = string4.toLowerCase(locale3);
                    i.d(lowerCase6, "(this as java.lang.Strin….toLowerCase(Locale.ROOT)");
                    if (string3 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                    }
                    String lowerCase7 = string3.toLowerCase(locale3);
                    i.d(lowerCase7, "(this as java.lang.Strin….toLowerCase(Locale.ROOT)");
                    if (n.J(lowerCase6, lowerCase7, false)) {
                        return false;
                    }
                    return true;
                case -1179774633:
                    if (!next2.equals("is_any")) {
                        return false;
                    }
                    if (arrayList == null) {
                        return false;
                    }
                    return arrayList.contains(obj2.toString());
                case -1039699439:
                    if (!next2.equals("not_in")) {
                        return false;
                    }
                    if (arrayList == null) {
                        return false;
                    }
                    return arrayList.contains(obj2.toString());
                case -969266188:
                    if (next2.equals("starts_with")) {
                        return m.I(obj2.toString(), string3, false);
                    }
                    return false;
                case -966353971:
                    if (next2.equals("regex_match")) {
                        return new Regex(string3).e(obj2.toString());
                    }
                    return false;
                case -665609109:
                    if (!next2.equals("is_not_any")) {
                        return false;
                    }
                    if (arrayList == null) {
                        return false;
                    }
                    return arrayList.contains(obj2.toString());
                case -567445985:
                    if (next2.equals("contains")) {
                        return n.J(obj2.toString(), string3, false);
                    }
                    return false;
                case -327990090:
                    if (!next2.equals("i_str_neq")) {
                        return false;
                    }
                    String string5 = obj2.toString();
                    if (string5 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                    }
                    String lowerCase8 = string5.toLowerCase(locale3);
                    i.d(lowerCase8, "(this as java.lang.Strin….toLowerCase(Locale.ROOT)");
                    if (string3 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                    }
                    String lowerCase9 = string3.toLowerCase(locale3);
                    i.d(lowerCase9, "(this as java.lang.Strin….toLowerCase(Locale.ROOT)");
                    if (lowerCase8.equals(lowerCase9)) {
                        return false;
                    }
                    return true;
                case -159812115:
                    if (!next2.equals("i_is_any")) {
                        return false;
                    }
                    if (arrayList != null || arrayList.isEmpty()) {
                        return false;
                    }
                    for (String str2 : arrayList) {
                        if (str2 != null) {
                            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                        }
                        locale = Locale.ROOT;
                        lowerCase = str2.toLowerCase(locale);
                        i.d(lowerCase, "(this as java.lang.Strin….toLowerCase(Locale.ROOT)");
                        string = obj2.toString();
                        if (string != null) {
                            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                        }
                        lowerCase2 = string.toLowerCase(locale);
                        i.d(lowerCase2, "(this as java.lang.Strin….toLowerCase(Locale.ROOT)");
                        if (lowerCase.equals(lowerCase2)) {
                            return true;
                        }
                    }
                    return false;
                case -92753547:
                    if (!next2.equals("i_str_not_in")) {
                        return false;
                    }
                    if (arrayList == null) {
                        return false;
                    }
                    if (!arrayList.isEmpty()) {
                        for (String str3 : arrayList) {
                            if (str3 != null) {
                                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                            }
                            locale2 = Locale.ROOT;
                            lowerCase3 = str3.toLowerCase(locale2);
                            i.d(lowerCase3, "(this as java.lang.Strin….toLowerCase(Locale.ROOT)");
                            string2 = obj2.toString();
                            if (string2 != null) {
                                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                            }
                            lowerCase4 = string2.toLowerCase(locale2);
                            i.d(lowerCase4, "(this as java.lang.Strin….toLowerCase(Locale.ROOT)");
                            if (lowerCase3.equals(lowerCase4)) {
                                return false;
                            }
                        }
                    }
                    return true;
                case R.styleable.AppCompatTheme_controlBackground /* 60 */:
                    if (!next2.equals("<")) {
                        return false;
                    }
                    if (Double.parseDouble(obj2.toString()) >= Double.parseDouble(string3)) {
                        return false;
                    }
                    return true;
                case R.styleable.AppCompatTheme_dialogCornerRadius /* 61 */:
                    if (!next2.equals("=")) {
                        return false;
                    }
                    return i.a(obj2.toString(), string3);
                case R.styleable.AppCompatTheme_dialogPreferredPadding /* 62 */:
                    if (!next2.equals(">")) {
                        return false;
                    }
                    if (Double.parseDouble(obj2.toString()) <= Double.parseDouble(string3)) {
                        return false;
                    }
                    return true;
                case 1084:
                    if (!next2.equals("!=")) {
                        return false;
                    }
                    if (i.a(obj2.toString(), string3)) {
                        return false;
                    }
                    return true;
                case 1921:
                    if (!next2.equals("<=")) {
                        return false;
                    }
                    if (Double.parseDouble(obj2.toString()) > Double.parseDouble(string3)) {
                        return false;
                    }
                    return true;
                case 1952:
                    if (!next2.equals("==")) {
                        return false;
                    }
                    return i.a(obj2.toString(), string3);
                case 1983:
                    if (!next2.equals(">=")) {
                        return false;
                    }
                    if (Double.parseDouble(obj2.toString()) < Double.parseDouble(string3)) {
                        return false;
                    }
                    return true;
                case 3244:
                    if (!next2.equals("eq")) {
                        return false;
                    }
                    return i.a(obj2.toString(), string3);
                case 3294:
                    if (!next2.equals("ge")) {
                        return false;
                    }
                    if (Double.parseDouble(obj2.toString()) < Double.parseDouble(string3)) {
                        return false;
                    }
                    return true;
                case 3309:
                    if (!next2.equals("gt")) {
                        return false;
                    }
                    if (Double.parseDouble(obj2.toString()) <= Double.parseDouble(string3)) {
                        return false;
                    }
                    return true;
                case 3365:
                    if (!next2.equals("in")) {
                        return false;
                    }
                    if (arrayList == null) {
                        return false;
                    }
                    return arrayList.contains(obj2.toString());
                case 3449:
                    if (!next2.equals("le")) {
                        return false;
                    }
                    if (Double.parseDouble(obj2.toString()) > Double.parseDouble(string3)) {
                        return false;
                    }
                    return true;
                case 3464:
                    if (!next2.equals("lt")) {
                        return false;
                    }
                    if (Double.parseDouble(obj2.toString()) >= Double.parseDouble(string3)) {
                        return false;
                    }
                    return true;
                case 3511:
                    if (!next2.equals("ne")) {
                        return false;
                    }
                    if (i.a(obj2.toString(), string3)) {
                        return false;
                    }
                    return true;
                case 102680:
                    if (!next2.equals("gte")) {
                        return false;
                    }
                    if (Double.parseDouble(obj2.toString()) < Double.parseDouble(string3)) {
                        return false;
                    }
                    return true;
                case 107485:
                    if (!next2.equals("lte")) {
                        return false;
                    }
                    if (Double.parseDouble(obj2.toString()) > Double.parseDouble(string3)) {
                        return false;
                    }
                    return true;
                case 108954:
                    if (!next2.equals("neq")) {
                        return false;
                    }
                    if (i.a(obj2.toString(), string3)) {
                        return false;
                    }
                    return true;
                case 127966736:
                    if (!next2.equals("i_str_eq")) {
                        return false;
                    }
                    String string6 = obj2.toString();
                    if (string6 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                    }
                    String lowerCase10 = string6.toLowerCase(locale3);
                    i.d(lowerCase10, "(this as java.lang.Strin….toLowerCase(Locale.ROOT)");
                    if (string3 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                    }
                    String lowerCase11 = string3.toLowerCase(locale3);
                    i.d(lowerCase11, "(this as java.lang.Strin….toLowerCase(Locale.ROOT)");
                    return lowerCase10.equals(lowerCase11);
                case 127966857:
                    if (!next2.equals("i_str_in")) {
                        return false;
                    }
                    if (arrayList != null) {
                        return false;
                    }
                    while (r9.hasNext()) {
                        if (str2 != null) {
                            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                        }
                        locale = Locale.ROOT;
                        lowerCase = str2.toLowerCase(locale);
                        i.d(lowerCase, "(this as java.lang.Strin….toLowerCase(Locale.ROOT)");
                        string = obj2.toString();
                        if (string != null) {
                            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                        }
                        lowerCase2 = string.toLowerCase(locale);
                        i.d(lowerCase2, "(this as java.lang.Strin….toLowerCase(Locale.ROOT)");
                        if (lowerCase.equals(lowerCase2)) {
                            return true;
                        }
                    }
                    return false;
                case 363990325:
                    if (!next2.equals("i_contains")) {
                        return false;
                    }
                    String string7 = obj2.toString();
                    if (string7 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                    }
                    String lowerCase12 = string7.toLowerCase(locale3);
                    i.d(lowerCase12, "(this as java.lang.Strin….toLowerCase(Locale.ROOT)");
                    if (string3 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                    }
                    String lowerCase13 = string3.toLowerCase(locale3);
                    i.d(lowerCase13, "(this as java.lang.Strin….toLowerCase(Locale.ROOT)");
                    return n.J(lowerCase12, lowerCase13, false);
                case 1091487233:
                    if (!next2.equals("i_is_not_any")) {
                        return false;
                    }
                    if (arrayList == null) {
                        return false;
                    }
                    if (!arrayList.isEmpty()) {
                        while (r9.hasNext()) {
                            if (str3 != null) {
                                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                            }
                            locale2 = Locale.ROOT;
                            lowerCase3 = str3.toLowerCase(locale2);
                            i.d(lowerCase3, "(this as java.lang.Strin….toLowerCase(Locale.ROOT)");
                            string2 = obj2.toString();
                            if (string2 != null) {
                                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                            }
                            lowerCase4 = string2.toLowerCase(locale2);
                            i.d(lowerCase4, "(this as java.lang.Strin….toLowerCase(Locale.ROOT)");
                            if (lowerCase3.equals(lowerCase4)) {
                                return false;
                            }
                        }
                    }
                    return true;
                case 1918401035:
                    if (!next2.equals("not_contains") || n.J(obj2.toString(), string3, false)) {
                        return false;
                    }
                    return true;
                case 1961112862:
                    if (!next2.equals("i_starts_with")) {
                        return false;
                    }
                    String string8 = obj2.toString();
                    if (string8 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                    }
                    String lowerCase14 = string8.toLowerCase(locale3);
                    i.d(lowerCase14, "(this as java.lang.Strin….toLowerCase(Locale.ROOT)");
                    if (string3 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                    }
                    String lowerCase15 = string3.toLowerCase(locale3);
                    i.d(lowerCase15, "(this as java.lang.Strin….toLowerCase(Locale.ROOT)");
                    return m.I(lowerCase14, lowerCase15, false);
                default:
                    return false;
            }
        }
        return false;
    }

    public static final void d(Bundle bundle, String event) {
        i.e(event, "event");
        if (!f35599a || bundle == null) {
            return;
        }
        try {
            a(bundle, event);
            bundle.putString("_audiencePropertyIds", b(bundle));
            bundle.putString("cs_maca", "1");
            String[] strArr = f35601c;
            int i10 = 0;
            while (i10 < 13) {
                String str = strArr[i10];
                i10++;
                bundle.remove(str);
            }
        } catch (Exception unused) {
        }
    }
}
