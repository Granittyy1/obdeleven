package D2;

import android.content.Context;
import android.view.View;
import androidx.compose.animation.core.C0908h;
import androidx.compose.animation.core.C0909i;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper;
import com.facebook.appevents.ml.ModelManager;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: ViewUtilsApi19.java */
/* JADX INFO: loaded from: classes.dex */
public class V implements Q3.e, p285x2.c.InterfaceC0549c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Field f2574b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f2575c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static boolean f2576d = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static boolean f2577e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static boolean f2578f;

    public static C0908h d(float f10, float f11, int i10) {
        if ((i10 & 2) != 0) {
            f11 = 0.0f;
        }
        return new C0908h(VectorConvertersKt.f9477a, Float.valueOf(f10), new C0909i(f11), Long.MIN_VALUE, Long.MIN_VALUE, false);
    }

    public static void e(Throwable th, Throwable exception) {
        kotlin.jvm.internal.i.e(th, "<this>");
        kotlin.jvm.internal.i.e(exception, "exception");
        if (th != exception) {
            Ca.b.f2468a.a(th, exception);
        }
    }

    public static void f(StringBuilder sb2, Object obj, Ia.l lVar) {
        if (lVar != null) {
            sb2.append((CharSequence) lVar.invoke(obj));
            return;
        }
        if (obj == null ? true : obj instanceof CharSequence) {
            sb2.append((CharSequence) obj);
        } else if (obj instanceof Character) {
            sb2.append(((Character) obj).charValue());
        } else {
            sb2.append((CharSequence) String.valueOf(obj));
        }
    }

    public static long g(Date date) {
        return (date.getTime() / 1000) + 2082844800;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static C0908h h(C0908h c0908h, float f10, float f11, int i10) {
        if ((i10 & 1) != 0) {
            f10 = ((Number) c0908h.f9544c.getValue()).floatValue();
        }
        if ((i10 & 2) != 0) {
            f11 = ((C0909i) c0908h.f9545d).f9552a;
        }
        return new C0908h(c0908h.f9543b, Float.valueOf(f10), new C0909i(f11), c0908h.f9546e, c0908h.f9547f, c0908h.f9548g);
    }

    public static final void i(String str) {
        File fileL = l();
        if (fileL == null || str == null) {
            return;
        }
        new File(fileL, str).delete();
    }

    public static final int j(androidx.compose.ui.text.font.l lVar, int i10) {
        boolean z10 = kotlin.jvm.internal.i.g(lVar.f15447b, androidx.compose.ui.text.font.l.f15439d.f15447b) >= 0;
        boolean zA = androidx.compose.ui.text.font.j.a(i10, 1);
        if (zA && z10) {
            return 3;
        }
        if (z10) {
            return 1;
        }
        return zA ? 2 : 0;
    }

    public static String k(Context context) {
        if (p005a4.n.f8036e == null) {
            synchronized (p005a4.n.f8035d) {
                try {
                    if (p005a4.n.f8036e == null) {
                        String string = context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getString("anonymousAppDeviceGUID", null);
                        p005a4.n.f8036e = string;
                        if (string == null) {
                            UUID uuidRandomUUID = UUID.randomUUID();
                            kotlin.jvm.internal.i.d(uuidRandomUUID, "randomUUID()");
                            p005a4.n.f8036e = kotlin.jvm.internal.i.k(uuidRandomUUID, "XZ");
                            context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).edit().putString("anonymousAppDeviceGUID", p005a4.n.f8036e).apply();
                        }
                    }
                    p293xa.r rVar = p293xa.r.f47939a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        String str = p005a4.n.f8036e;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public static final File l() {
        File file = new File(Z3.q.a().getCacheDir(), "instrument");
        if (file.exists() || file.mkdirs()) {
            return file;
        }
        return null;
    }

    public static final boolean n(StackTraceElement stackTraceElement) {
        String className = stackTraceElement.getClassName();
        kotlin.jvm.internal.i.d(className, "element.className");
        if (!kotlin.text.m.I(className, "com.facebook", false)) {
            String className2 = stackTraceElement.getClassName();
            kotlin.jvm.internal.i.d(className2, "element.className");
            if (!kotlin.text.m.I(className2, "com.meta", false)) {
                return false;
            }
        }
        return true;
    }

    public static final JSONObject o(String str) {
        File fileL = l();
        if (fileL != null) {
            try {
                return new JSONObject(p165n4.s.E(new FileInputStream(new File(fileL, str))));
            } catch (Exception unused) {
                i(str);
            }
        }
        return null;
    }

    public static final void p(String str, JSONArray jSONArray, Z3.r.b bVar) {
        if (jSONArray.length() == 0) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(str, jSONArray.toString());
            JSONObject jSONObjectN = p165n4.s.n();
            if (jSONObjectN != null) {
                Iterator<String> itKeys = jSONObjectN.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    jSONObject.put(next, jSONObjectN.get(next));
                }
            }
            String str2 = Z3.r.j;
            Z3.r.c.i(null, String.format("%s/instruments", Arrays.copyOf(new Object[]{Z3.q.b()}, 1)), jSONObject, bVar).d();
        } catch (JSONException unused) {
        }
    }

    public static boolean s(String str) {
        String str2;
        float[] fArr = new float[30];
        for (int i10 = 0; i10 < 30; i10++) {
            fArr[i10] = 0.0f;
        }
        ConcurrentHashMap concurrentHashMap = ModelManager.f24945a;
        String[] strArrC = ModelManager.c(ModelManager.Task.f24948b, new float[][]{fArr}, new String[]{str});
        if (strArrC == null || (str2 = strArrC[0]) == null) {
            str2 = "none";
        }
        return !"none".equals(str2);
    }

    public static String t(Exception exc) {
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        exc.printStackTrace(printWriter);
        printWriter.flush();
        String string = stringWriter.toString();
        kotlin.jvm.internal.i.d(string, "toString(...)");
        return string;
    }

    public static final void u(String str, String str2) {
        File fileL = l();
        if (fileL == null || str == null || str2 == null) {
            return;
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(fileL, str));
            byte[] bytes = str2.getBytes(kotlin.text.a.f43120b);
            kotlin.jvm.internal.i.d(bytes, "(this as java.lang.String).getBytes(charset)");
            fileOutputStream.write(bytes);
            fileOutputStream.close();
        } catch (Exception unused) {
        }
    }

    @Override // p285x2.c.InterfaceC0549c
    public p285x2.c a(x2.c.b bVar) {
        return new FrameworkSQLiteOpenHelper(bVar.f47885a, bVar.f47886b, bVar.f47887c, bVar.f47888d, bVar.f47889e);
    }

    @Override // Q3.e
    public void c(Q3.f fVar) {
        fVar.k();
    }

    public float m(View view) {
        if (f2576d) {
            try {
                return view.getTransitionAlpha();
            } catch (NoSuchMethodError unused) {
                f2576d = false;
            }
        }
        return view.getAlpha();
    }

    public void q(View view, float f10) {
        if (f2576d) {
            try {
                view.setTransitionAlpha(f10);
                return;
            } catch (NoSuchMethodError unused) {
                f2576d = false;
            }
        }
        view.setAlpha(f10);
    }

    public void r(int i10, View view) {
        if (!f2575c) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                f2574b = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f2575c = true;
        }
        Field field = f2574b;
        if (field != null) {
            try {
                f2574b.setInt(view, i10 | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    @Override // Q3.e
    public void b(Q3.f fVar) {
    }
}
