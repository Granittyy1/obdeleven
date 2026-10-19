package p143l4;

import P3.d;
import Z3.q;
import Z3.r;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Bundle;
import android.view.View;
import com.facebook.appevents.ml.ModelManager;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.i;
import kotlin.text.m;
import org.json.JSONException;
import org.json.JSONObject;
import p005a4.n;
import p043d4.c;
import p093h4.e;
import p114j1.p;
import p165n4.s;
import p165n4.t;

/* JADX INFO: compiled from: ViewOnClickListener.kt */
/* JADX INFO: loaded from: classes.dex */
public final class f implements View.OnClickListener {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final HashSet f44371f = new HashSet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View.OnClickListener f44372b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WeakReference<View> f44373c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final WeakReference<View> f44374d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f44375e;

    /* JADX INFO: compiled from: ViewOnClickListener.kt */
    public static final class a {
        public static void a(View view, View view2, String str) {
            Field declaredField;
            Field declaredField2;
            int iHashCode = view.hashCode();
            if (f.f44371f.contains(Integer.valueOf(iHashCode))) {
                return;
            }
            c cVar = c.f34562a;
            f fVar = new f(view, view2, str);
            Object obj = null;
            try {
                try {
                    declaredField = Class.forName("android.view.View").getDeclaredField("mListenerInfo");
                    try {
                        declaredField2 = Class.forName("android.view.View$ListenerInfo").getDeclaredField("mOnClickListener");
                    } catch (ClassNotFoundException | NoSuchFieldException unused) {
                        declaredField2 = null;
                    }
                } catch (ClassNotFoundException | NoSuchFieldException unused2) {
                    declaredField = null;
                }
                if (declaredField == null || declaredField2 == null) {
                    view.setOnClickListener(fVar);
                } else {
                    declaredField.setAccessible(true);
                    declaredField2.setAccessible(true);
                    try {
                        declaredField.setAccessible(true);
                        obj = declaredField.get(view);
                    } catch (IllegalAccessException unused3) {
                    }
                    if (obj == null) {
                        view.setOnClickListener(fVar);
                    } else {
                        declaredField2.set(obj, fVar);
                    }
                }
            } catch (Exception unused4) {
            }
            f.f44371f.add(Integer.valueOf(iHashCode));
        }

        public static void b(String str, String str2, float[] fArr) {
            if (c.f44361b.contains(str)) {
                n nVar = new n(q.a(), (String) null);
                Bundle bundle = new Bundle();
                bundle.putString("_is_suggested_event", "1");
                bundle.putString("_button_text", str2);
                nVar.a(str, null, bundle, false, e.b());
                return;
            }
            if (c.f44362c.contains(str)) {
                Bundle bundle2 = new Bundle();
                try {
                    bundle2.putString("event_name", str);
                    JSONObject jSONObject = new JSONObject();
                    StringBuilder sb2 = new StringBuilder();
                    int length = fArr.length;
                    int i10 = 0;
                    while (i10 < length) {
                        float f10 = fArr[i10];
                        i10++;
                        sb2.append(f10);
                        sb2.append(",");
                    }
                    jSONObject.put("dense", sb2.toString());
                    jSONObject.put("button_text", str2);
                    bundle2.putString("metadata", jSONObject.toString());
                    String str3 = r.j;
                    r rVarI = r.c.i(null, String.format(Locale.US, "%s/suggested_events", Arrays.copyOf(new Object[]{q.b()}, 1)), null, null);
                    rVarI.f7876d = bundle2;
                    rVarI.c();
                } catch (JSONException unused) {
                }
            }
        }
    }

    public f(View view, View view2, String str) {
        this.f44372b = c.e(view);
        this.f44373c = new WeakReference<>(view2);
        this.f44374d = new WeakReference<>(view);
        String lowerCase = str.toLowerCase();
        i.d(lowerCase, "(this as java.lang.String).toLowerCase()");
        this.f44375e = m.G(lowerCase, "activity", "");
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        i.e(view, "view");
        View.OnClickListener onClickListener = this.f44372b;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
        View view2 = this.f44373c.get();
        View view3 = this.f44374d.get();
        if (view2 == null || view3 == null) {
            return;
        }
        try {
            final String strD = b.d(view3);
            final String strB = p143l4.a.b(view3, strD);
            if (strB == null) {
                return;
            }
            LinkedHashMap linkedHashMap = p143l4.a.f44356a;
            String str = linkedHashMap.containsKey(strB) ? (String) linkedHashMap.get(strB) : null;
            if (str != null) {
                if (str.equals("other")) {
                    return;
                }
                s.F(new p(str, 1, strD));
            } else {
                final JSONObject jSONObject = new JSONObject();
                jSONObject.put("view", b.b(view2, view3));
                jSONObject.put("screenname", this.f44375e);
                s.F(new Runnable() { // from class: l4.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        String string;
                        String str2;
                        JSONObject jSONObject2 = jSONObject;
                        String str3 = strD;
                        f this$0 = this;
                        String str4 = strB;
                        i.e(this$0, "this$0");
                        try {
                            Context contextA = q.a();
                            try {
                                t.e();
                                str2 = q.f7856e;
                                if (str2 == null) {
                                    ApplicationInfo applicationInfo = contextA.getApplicationInfo();
                                    int i10 = applicationInfo.labelRes;
                                    if (i10 == 0) {
                                        string = applicationInfo.nonLocalizedLabel.toString();
                                    } else {
                                        string = contextA.getString(i10);
                                        i.d(string, "context.getString(stringId)");
                                    }
                                    str2 = string;
                                }
                            } catch (Exception unused) {
                                string = "";
                            }
                            if (str2 == null) {
                                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                            }
                            String lowerCase = str2.toLowerCase();
                            i.d(lowerCase, "(this as java.lang.String).toLowerCase()");
                            float[] fArrH = d.h(lowerCase, jSONObject2);
                            String strL = d.l(str3, this$0.f44375e, lowerCase);
                            if (fArrH == null) {
                                return;
                            }
                            ConcurrentHashMap concurrentHashMap = ModelManager.f24945a;
                            String[] strArrC = ModelManager.c(ModelManager.Task.f24949c, new float[][]{fArrH}, new String[]{strL});
                            if (strArrC == null) {
                                return;
                            }
                            String str5 = strArrC[0];
                            a.a(str4, str5);
                            if (str5.equals("other")) {
                                return;
                            }
                            HashSet hashSet = f.f44371f;
                            f.a.b(str5, str3, fArrH);
                        } catch (Exception unused2) {
                        }
                    }
                });
            }
        } catch (Exception unused) {
        }
    }
}
