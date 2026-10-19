package P3;

import D3.o;
import Ia.l;
import android.content.Context;
import android.content.res.Resources;
import android.util.Patterns;
import android.view.View;
import androidx.collection.A;
import androidx.collection.AbstractC0881i;
import androidx.compose.foundation.lazy.layout.X;
import androidx.compose.foundation.lazy.layout.z;
import androidx.compose.material.Q;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.ui.draw.ShadowGraphicsLayerElement;
import androidx.compose.ui.graphics.C;
import androidx.compose.ui.graphics.E;
import androidx.compose.ui.graphics.V;
import androidx.compose.ui.graphics.k0;
import androidx.compose.ui.graphics.l0;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.C1268i;
import androidx.compose.ui.text.C1274j;
import androidx.compose.ui.text.style.h;
import androidx.lifecycle.InterfaceC1376t;
import com.voltasit.obdeleven.R;
import io.intercom.android.sdk.NotificationStatuses;
import io.intercom.android.sdk.models.AttributeType;
import io.ktor.utils.io.ExceptionUtilsJvmKt;
import io.ktor.utils.io.core.InsufficientSpaceException;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.collections.q;
import kotlin.collections.y;
import kotlin.jvm.internal.i;
import kotlin.text.n;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.v;
import kotlinx.coroutines.flow.w;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p293xa.r;

/* JADX INFO: compiled from: GifDrawableBytesTranscoder.java */
/* JADX INFO: loaded from: classes.dex */
public class d implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Object f4919a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Object f4920b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Object f4921c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static JSONObject f4922d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static boolean f4923e;

    public static final v a() {
        return w.b(0, 1, BufferOverflow.f43244c, 1);
    }

    public static final void c(Throwable th) throws Throwable {
        Throwable thB;
        try {
            thB = ExceptionUtilsJvmKt.b(th, th);
        } catch (Throwable unused) {
            thB = null;
        }
        if (thB != null) {
            throw thB;
        }
    }

    public static final List d(X x10, ArrayList arrayList, AbstractC0881i abstractC0881i, int i10, int i11, int i12, int i13, l lVar) {
        int i14;
        if (x10 == null || arrayList.isEmpty() || abstractC0881i.f9184b == 0) {
            return EmptyList.f42983b;
        }
        A a10 = x10.a(((z) q.O(arrayList)).getIndex(), ((z) q.V(arrayList)).getIndex(), abstractC0881i);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i15 = 0; i15 < size; i15++) {
            Object obj = arrayList.get(i15);
            int index = ((z) obj).getIndex();
            int[] iArr = abstractC0881i.f9183a;
            int i16 = abstractC0881i.f9184b;
            for (int i17 = 0; i17 < i16; i17++) {
                if (iArr[i17] == index) {
                    arrayList3.add(obj);
                    break;
                }
            }
        }
        int[] iArr2 = a10.f9183a;
        int i18 = a10.f9184b;
        for (int i19 = 0; i19 < i18; i19++) {
            int i20 = iArr2[i19];
            Iterator it = arrayList.iterator();
            int i21 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i21 = -1;
                    break;
                }
                if (((z) it.next()).getIndex() == i20) {
                    break;
                }
                i21++;
            }
            z zVar = i21 == -1 ? (z) lVar.invoke(Integer.valueOf(i20)) : (z) arrayList.remove(i21);
            int iG = zVar.g();
            if (i21 == -1) {
                i14 = Integer.MIN_VALUE;
            } else {
                long jN = zVar.n(0);
                i14 = (int) (zVar.l() ? jN & 4294967295L : jN >> 32);
            }
            int iB = x10.b(arrayList3, i20, iG, i14, i10);
            zVar.m();
            zVar.f(iB, 0, i12, i13);
            arrayList2.add(zVar);
        }
        return arrayList2;
    }

    public static void e(int i10, String str) {
        if (i10 >= 0) {
            return;
        }
        throw new IllegalArgumentException(str + " cannot be negative but was: " + i10);
    }

    public static final void f(C1268i c1268i, E e10, C c10, float f10, k0 k0Var, h hVar, J.f fVar, int i10) {
        ArrayList arrayList = c1268i.f15477h;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            C1274j c1274j = (C1274j) arrayList.get(i11);
            c1274j.f15582a.l(e10, c10, f10, k0Var, hVar, fVar, i10);
            e10.m(0.0f, c1274j.f15582a.d());
        }
    }

    public static final InterfaceC1376t g(View view) {
        i.e(view, "<this>");
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_lifecycle_owner);
            InterfaceC1376t interfaceC1376t = tag instanceof InterfaceC1376t ? (InterfaceC1376t) tag : null;
            if (interfaceC1376t != null) {
                return interfaceC1376t;
            }
            Object objE = G0.a.e(view);
            view = objE instanceof View ? (View) objE : null;
        }
        return null;
    }

    public static final float[] h(String str, JSONObject jSONObject) {
        if (!f4923e) {
            return null;
        }
        float[] fArr = new float[30];
        for (int i10 = 0; i10 < 30; i10++) {
            fArr[i10] = 0.0f;
        }
        try {
            String lowerCase = str.toLowerCase();
            i.d(lowerCase, "(this as java.lang.String).toLowerCase()");
            JSONObject jSONObject2 = new JSONObject(jSONObject.optJSONObject("view").toString());
            String screenName = jSONObject.optString("screenname");
            JSONArray jSONArray = new JSONArray();
            q(jSONObject2, jSONArray);
            w(fArr, p(jSONObject2));
            JSONObject jSONObjectI = i(jSONObject2);
            if (jSONObjectI == null) {
                return null;
            }
            i.d(screenName, "screenName");
            String string = jSONObject2.toString();
            i.d(string, "viewTree.toString()");
            w(fArr, o(jSONObjectI, jSONArray, screenName, string, lowerCase));
        } catch (JSONException unused) {
        }
        return fArr;
    }

    public static JSONObject i(JSONObject jSONObject) {
        int length;
        try {
            if (jSONObject.optBoolean("is_interacted")) {
                return jSONObject;
            }
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("childviews");
            if (jSONArrayOptJSONArray != null && (length = jSONArrayOptJSONArray.length()) > 0) {
                int i10 = 0;
                while (true) {
                    int i11 = i10 + 1;
                    JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i10);
                    i.d(jSONObject2, "children.getJSONObject(i)");
                    JSONObject jSONObjectI = i(jSONObject2);
                    if (jSONObjectI != null) {
                        return jSONObjectI;
                    }
                    if (i11 < length) {
                        i10 = i11;
                    }
                }
            }
        } catch (JSONException unused) {
        }
        return null;
    }

    public static final File j() {
        File file = new File(Z3.q.a().getFilesDir(), "facebook_ml/");
        if (file.exists() || file.mkdirs()) {
            return file;
        }
        return null;
    }

    public static final String k(InterfaceC1084f interfaceC1084f, int i10) {
        interfaceC1084f.x(AndroidCompositionLocals_androidKt.f14792a);
        Resources resources = ((Context) interfaceC1084f.x(AndroidCompositionLocals_androidKt.f14793b)).getResources();
        if (Q.a(i10, 0)) {
            return resources.getString(R.string.navigation_menu);
        }
        if (Q.a(i10, 1)) {
            return resources.getString(R.string.close_drawer);
        }
        if (Q.a(i10, 2)) {
            return resources.getString(R.string.close_sheet);
        }
        if (Q.a(i10, 3)) {
            return resources.getString(R.string.default_error_message);
        }
        if (Q.a(i10, 4)) {
            return resources.getString(R.string.dropdown_menu);
        }
        if (Q.a(i10, 5)) {
            return resources.getString(R.string.range_start);
        }
        if (Q.a(i10, 6)) {
            return resources.getString(R.string.range_end);
        }
        return Q.a(i10, 7) ? resources.getString(R.string.mc2_snackbar_pane_title) : "";
    }

    public static final String l(String str, String activityName, String str2) {
        i.e(activityName, "activityName");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str2);
        sb2.append(" | ");
        sb2.append(activityName);
        String strA = Q8.d.a(sb2, ", ", str);
        if (strA == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        String lowerCase = strA.toLowerCase();
        i.d(lowerCase, "(this as java.lang.String).toLowerCase()");
        return lowerCase;
    }

    public static final void m(File file) {
        try {
            f4922d = new JSONObject();
            FileInputStream fileInputStream = new FileInputStream(file);
            byte[] bArr = new byte[fileInputStream.available()];
            fileInputStream.read(bArr);
            fileInputStream.close();
            f4922d = new JSONObject(new String(bArr, kotlin.text.a.f43120b));
            f4919a = y.s(new Pair("ENGLISH", "1"), new Pair("GERMAN", "2"), new Pair("SPANISH", "3"), new Pair("JAPANESE", "4"));
            f4920b = y.s(new Pair("VIEW_CONTENT", "0"), new Pair("SEARCH", "1"), new Pair("ADD_TO_CART", "2"), new Pair("ADD_TO_WISHLIST", "3"), new Pair("INITIATE_CHECKOUT", "4"), new Pair("ADD_PAYMENT_INFO", "5"), new Pair("PURCHASE", "6"), new Pair("LEAD", "7"), new Pair("COMPLETE_REGISTRATION", "8"));
            f4921c = y.s(new Pair("BUTTON_TEXT", "1"), new Pair("PAGE_TITLE", "2"), new Pair("RESOLVED_DOCUMENT_LINK", "3"), new Pair("BUTTON_ID", "4"));
            f4923e = true;
        } catch (Exception unused) {
        }
    }

    public static boolean n(String[] strArr, String[] strArr2) {
        int length = strArr.length;
        int i10 = 0;
        while (i10 < length) {
            String str = strArr[i10];
            i10++;
            int length2 = strArr2.length;
            int i11 = 0;
            while (i11 < length2) {
                String str2 = strArr2[i11];
                i11++;
                if (n.J(str2, str, false)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static float[] o(JSONObject jSONObject, JSONArray jSONArray, String str, String str2, String str3) {
        float[] fArr = new float[30];
        int i10 = 0;
        while (true) {
            if (i10 >= 30) {
                break;
            }
            fArr[i10] = 0.0f;
            i10++;
        }
        int length = jSONArray.length();
        fArr[3] = length > 1 ? length - 1.0f : 0.0f;
        try {
            int length2 = jSONArray.length();
            if (length2 > 0) {
                int i11 = 0;
                while (true) {
                    int i12 = i11 + 1;
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i11);
                    i.d(jSONObject2, "siblings.getJSONObject(i)");
                    if (((jSONObject2.optInt("classtypebitmask") & 1) << 5) > 0) {
                        fArr[9] = fArr[9] + 1.0f;
                    }
                    if (i12 >= length2) {
                        break;
                    }
                    i11 = i12;
                }
            }
        } catch (JSONException unused) {
        }
        fArr[13] = -1.0f;
        fArr[14] = -1.0f;
        String str4 = str + '|' + str3;
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder();
        x(jSONObject, sb3, sb2);
        String string = sb2.toString();
        i.d(string, "hintSB.toString()");
        String string2 = sb3.toString();
        i.d(string2, "textSB.toString()");
        fArr[15] = t("COMPLETE_REGISTRATION", "BUTTON_TEXT", string2) ? 1.0f : 0.0f;
        fArr[16] = t("COMPLETE_REGISTRATION", "PAGE_TITLE", str4) ? 1.0f : 0.0f;
        fArr[17] = t("COMPLETE_REGISTRATION", "BUTTON_ID", string) ? 1.0f : 0.0f;
        fArr[18] = n.J(str2, "password", false) ? 1.0f : 0.0f;
        fArr[19] = s("(?i)(confirm.*password)|(password.*(confirmation|confirm)|confirmation)", str2) ? 1.0f : 0.0f;
        fArr[20] = s("(?i)(sign in)|login|signIn", str2) ? 1.0f : 0.0f;
        fArr[21] = s("(?i)(sign.*(up|now)|registration|register|(create|apply).*(profile|account)|open.*account|account.*(open|creation|application)|enroll|join.*now)", str2) ? 1.0f : 0.0f;
        fArr[22] = t("PURCHASE", "BUTTON_TEXT", string2) ? 1.0f : 0.0f;
        fArr[24] = t("PURCHASE", "PAGE_TITLE", str4) ? 1.0f : 0.0f;
        fArr[25] = s("(?i)add to(\\s|\\Z)|update(\\s|\\Z)|cart", string2) ? 1.0f : 0.0f;
        fArr[27] = s("(?i)add to(\\s|\\Z)|update(\\s|\\Z)|cart|shop|buy", str4) ? 1.0f : 0.0f;
        fArr[28] = t("LEAD", "BUTTON_TEXT", string2) ? 1.0f : 0.0f;
        fArr[29] = t("LEAD", "PAGE_TITLE", str4) ? 1.0f : 0.0f;
        return fArr;
    }

    public static float[] p(JSONObject jSONObject) {
        float[] fArr = new float[30];
        int i10 = 0;
        for (int i11 = 0; i11 < 30; i11++) {
            fArr[i11] = 0.0f;
        }
        String strOptString = jSONObject.optString(AttributeType.TEXT);
        i.d(strOptString, "node.optString(TEXT_KEY)");
        String lowerCase = strOptString.toLowerCase();
        i.d(lowerCase, "(this as java.lang.String).toLowerCase()");
        String strOptString2 = jSONObject.optString("hint");
        i.d(strOptString2, "node.optString(HINT_KEY)");
        String lowerCase2 = strOptString2.toLowerCase();
        i.d(lowerCase2, "(this as java.lang.String).toLowerCase()");
        String strOptString3 = jSONObject.optString("classname");
        i.d(strOptString3, "node.optString(CLASS_NAME_KEY)");
        String lowerCase3 = strOptString3.toLowerCase();
        i.d(lowerCase3, "(this as java.lang.String).toLowerCase()");
        int iOptInt = jSONObject.optInt("inputtype", -1);
        String[] strArr = {lowerCase, lowerCase2};
        if (n(new String[]{"$", "amount", "price", "total"}, strArr)) {
            fArr[0] = fArr[0] + 1.0f;
        }
        if (n(new String[]{"password", "pwd"}, strArr)) {
            fArr[1] = fArr[1] + 1.0f;
        }
        if (n(new String[]{"tel", AttributeType.PHONE}, strArr)) {
            fArr[2] = fArr[2] + 1.0f;
        }
        if (n(new String[]{"search"}, strArr)) {
            fArr[4] = fArr[4] + 1.0f;
        }
        if (iOptInt >= 0) {
            fArr[5] = fArr[5] + 1.0f;
        }
        if (iOptInt == 3 || iOptInt == 2) {
            fArr[6] = fArr[6] + 1.0f;
        }
        if (iOptInt == 32 || Patterns.EMAIL_ADDRESS.matcher(lowerCase).matches()) {
            fArr[7] = fArr[7] + 1.0f;
        }
        if (n.J(lowerCase3, "checkbox", false)) {
            fArr[8] = fArr[8] + 1.0f;
        }
        if (n(new String[]{NotificationStatuses.COMPLETE_STATUS, "confirm", "done", "submit"}, new String[]{lowerCase})) {
            fArr[10] = fArr[10] + 1.0f;
        }
        if (n.J(lowerCase3, "radio", false) && n.J(lowerCase3, "button", false)) {
            fArr[12] = fArr[12] + 1.0f;
        }
        try {
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("childviews");
            int length = jSONArrayOptJSONArray.length();
            if (length > 0) {
                while (true) {
                    int i12 = i10 + 1;
                    JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i10);
                    i.d(jSONObject2, "childViews.getJSONObject(i)");
                    w(fArr, p(jSONObject2));
                    if (i12 >= length) {
                        break;
                    }
                    i10 = i12;
                }
            }
        } catch (JSONException unused) {
        }
        return fArr;
    }

    public static boolean q(JSONObject jSONObject, JSONArray jSONArray) {
        boolean z10;
        try {
            if (jSONObject.optBoolean("is_interacted")) {
                return true;
            }
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("childviews");
            int length = jSONArrayOptJSONArray.length();
            if (length <= 0) {
                z10 = false;
                break;
            }
            int i10 = 0;
            while (true) {
                int i11 = i10 + 1;
                if (jSONArrayOptJSONArray.getJSONObject(i10).optBoolean("is_interacted")) {
                    z10 = true;
                    break;
                }
                if (i11 >= length) {
                    z10 = false;
                    break;
                }
                i10 = i11;
            }
            boolean z11 = z10;
            JSONArray jSONArray2 = new JSONArray();
            if (z10) {
                int length2 = jSONArrayOptJSONArray.length();
                if (length2 > 0) {
                    int i12 = 0;
                    while (true) {
                        int i13 = i12 + 1;
                        jSONArray.put(jSONArrayOptJSONArray.getJSONObject(i12));
                        if (i13 >= length2) {
                            break;
                        }
                        i12 = i13;
                    }
                }
            } else {
                int length3 = jSONArrayOptJSONArray.length();
                if (length3 > 0) {
                    int i14 = 0;
                    while (true) {
                        int i15 = i14 + 1;
                        JSONObject child = jSONArrayOptJSONArray.getJSONObject(i14);
                        i.d(child, "child");
                        if (q(child, jSONArray)) {
                            jSONArray2.put(child);
                            z11 = true;
                        }
                        if (i15 >= length3) {
                            break;
                        }
                        i14 = i15;
                    }
                }
                jSONObject.put("childviews", jSONArray2);
            }
            return z11;
        } catch (JSONException unused) {
            return false;
        }
    }

    public static final void r(p074fa.a aVar, byte[] bArr, int i10, int i11) throws EOFException {
        int i12 = aVar.f34856b;
        if (aVar.f34857c - i12 < i11) {
            throw new EOFException("Not enough bytes to read a byte array of size " + i11 + '.');
        }
        ByteBuffer copyTo = aVar.f34855a;
        i.e(copyTo, "$this$copyTo");
        if (!copyTo.hasArray() || copyTo.isReadOnly()) {
            copyTo.duplicate().get(bArr, i10, i11);
        } else {
            System.arraycopy(copyTo.array(), copyTo.arrayOffset() + i12, bArr, i10, i11);
        }
        r rVar = r.f47939a;
        aVar.c(i11);
    }

    public static boolean s(String str, String str2) {
        return Pattern.compile(str).matcher(str2).find();
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, java.util.Map] */
    public static boolean t(String str, String str2, String str3) {
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectOptJSONObject2;
        JSONObject jSONObjectOptJSONObject3;
        JSONObject jSONObjectOptJSONObject4;
        JSONObject jSONObject = f4922d;
        String strOptString = null;
        if (jSONObject == null) {
            i.m("rules");
            throw null;
        }
        JSONObject jSONObjectOptJSONObject5 = jSONObject.optJSONObject("rulesForLanguage");
        if (jSONObjectOptJSONObject5 == null) {
            jSONObjectOptJSONObject = null;
        } else {
            ?? r10 = f4919a;
            if (r10 == 0) {
                i.m("languageInfo");
                throw null;
            }
            jSONObjectOptJSONObject = jSONObjectOptJSONObject5.optJSONObject((String) r10.get("ENGLISH"));
        }
        if (jSONObjectOptJSONObject == null || (jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("rulesForEvent")) == null) {
            jSONObjectOptJSONObject3 = null;
        } else {
            ?? r11 = f4920b;
            if (r11 == 0) {
                i.m("eventInfo");
                throw null;
            }
            jSONObjectOptJSONObject3 = jSONObjectOptJSONObject2.optJSONObject((String) r11.get(str));
        }
        if (jSONObjectOptJSONObject3 != null && (jSONObjectOptJSONObject4 = jSONObjectOptJSONObject3.optJSONObject("positiveRules")) != null) {
            ?? r12 = f4921c;
            if (r12 == 0) {
                i.m("textTypeInfo");
                throw null;
            }
            strOptString = jSONObjectOptJSONObject4.optString((String) r12.get(str2));
        }
        if (strOptString == null) {
            return false;
        }
        return s(strOptString, str3);
    }

    public static final void u(View view, InterfaceC1376t interfaceC1376t) {
        i.e(view, "<this>");
        view.setTag(R.id.view_tree_lifecycle_owner, interfaceC1376t);
    }

    public static androidx.compose.ui.h v(androidx.compose.ui.h hVar, float f10, l0 l0Var, long j, long j10, int i10) {
        boolean z10;
        if ((i10 & 4) != 0) {
            z10 = Float.compare(f10, (float) 0) > 0;
        } else {
            z10 = false;
        }
        return (Float.compare(f10, (float) 0) > 0 || z10) ? hVar.i(new ShadowGraphicsLayerElement(f10, l0Var, z10, (i10 & 8) != 0 ? V.f13531a : j, (i10 & 16) != 0 ? V.f13531a : j10)) : hVar;
    }

    public static void w(float[] fArr, float[] fArr2) {
        int length = fArr.length - 1;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            int i11 = i10 + 1;
            fArr[i10] = fArr[i10] + fArr2[i10];
            if (i11 > length) {
                return;
            } else {
                i10 = i11;
            }
        }
    }

    public static void x(JSONObject jSONObject, StringBuilder sb2, StringBuilder sb3) {
        int length;
        String strOptString = jSONObject.optString(AttributeType.TEXT, "");
        i.d(strOptString, "view.optString(TEXT_KEY, \"\")");
        String lowerCase = strOptString.toLowerCase();
        i.d(lowerCase, "(this as java.lang.String).toLowerCase()");
        String strOptString2 = jSONObject.optString("hint", "");
        i.d(strOptString2, "view.optString(HINT_KEY, \"\")");
        String lowerCase2 = strOptString2.toLowerCase();
        i.d(lowerCase2, "(this as java.lang.String).toLowerCase()");
        if (lowerCase.length() > 0) {
            sb2.append(lowerCase);
            sb2.append(" ");
        }
        if (lowerCase2.length() > 0) {
            sb3.append(lowerCase2);
            sb3.append(" ");
        }
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("childviews");
        if (jSONArrayOptJSONArray == null || (length = jSONArrayOptJSONArray.length()) <= 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            int i11 = i10 + 1;
            try {
                JSONObject currentChildView = jSONArrayOptJSONArray.getJSONObject(i10);
                i.d(currentChildView, "currentChildView");
                x(currentChildView, sb2, sb3);
            } catch (JSONException unused) {
            }
            if (i11 >= length) {
                return;
            } else {
                i10 = i11;
            }
        }
    }

    public static final void y(p074fa.a aVar, byte[] source, int i10, int i11) throws InsufficientSpaceException {
        i.e(source, "source");
        int i12 = aVar.f34857c;
        int i13 = aVar.f34859e - i12;
        if (i13 < i11) {
            throw new InsufficientSpaceException("byte array", i11, i13);
        }
        ByteBuffer byteBufferOrder = ByteBuffer.wrap(source, i10, i11).slice().order(ByteOrder.BIG_ENDIAN);
        i.d(byteBufferOrder, "wrap(this, offset, lengt…der(ByteOrder.BIG_ENDIAN)");
        ByteBuffer byteBuffer = p036ca.b.f22529a;
        p036ca.b.a(byteBufferOrder, aVar.f34855a, 0, i11, i12);
        aVar.a(i11);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0047  */
    @Override // P3.e
    public o b(o oVar, A3.d dVar) {
        byte[] bArrArray;
        ByteBuffer byteBufferAsReadOnlyBuffer = ((O3.c) oVar.get()).f4804b.f4813a.f4818a.f48811d.asReadOnlyBuffer();
        int i10 = X3.a.f7191a;
        X3.a.b bVar = (byteBufferAsReadOnlyBuffer.isReadOnly() || !byteBufferAsReadOnlyBuffer.hasArray()) ? null : new X3.a.b(byteBufferAsReadOnlyBuffer.array(), byteBufferAsReadOnlyBuffer.arrayOffset(), byteBufferAsReadOnlyBuffer.limit());
        if (bVar == null || bVar.f7194a != 0) {
            ByteBuffer byteBufferAsReadOnlyBuffer2 = byteBufferAsReadOnlyBuffer.asReadOnlyBuffer();
            byte[] bArr = new byte[byteBufferAsReadOnlyBuffer2.limit()];
            byteBufferAsReadOnlyBuffer2.position(0);
            byteBufferAsReadOnlyBuffer2.get(bArr);
            bArrArray = bArr;
        } else {
            if (bVar.f7195b == bVar.f7196c.length) {
                bArrArray = byteBufferAsReadOnlyBuffer.array();
            } else {
                ByteBuffer byteBufferAsReadOnlyBuffer3 = byteBufferAsReadOnlyBuffer.asReadOnlyBuffer();
                byte[] bArr2 = new byte[byteBufferAsReadOnlyBuffer3.limit()];
                byteBufferAsReadOnlyBuffer3.position(0);
                byteBufferAsReadOnlyBuffer3.get(bArr2);
                bArrArray = bArr2;
            }
        }
        return new L3.b(bArrArray);
    }
}
