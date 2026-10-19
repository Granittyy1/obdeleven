package androidx.compose.material.ripple;

import Z3.q;
import Z3.r;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.compose.ui.platform.AndroidComposeView;
import com.facebook.HttpMethod;
import com.google.firebase.messaging.J;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f12005b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f12006c;

    public /* synthetic */ k(int i10, Object obj) {
        this.f12005b = i10;
        this.f12006c = obj;
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:47:0x00f6  */
    @Override // java.lang.Runnable
    public final void run() {
        String str;
        Locale locale;
        switch (this.f12005b) {
            case 0:
                l.setRippleState$lambda$2((l) this.f12006c);
                return;
            case 1:
                AndroidComposeView androidComposeView = (AndroidComposeView) this.f12006c;
                androidComposeView.f14677P0 = false;
                MotionEvent motionEvent = androidComposeView.f14665J0;
                kotlin.jvm.internal.i.b(motionEvent);
                if (motionEvent.getActionMasked() != 10) {
                    throw new IllegalStateException("The ACTION_HOVER_EXIT event was not cleared.");
                }
                androidComposeView.T(motionEvent);
                return;
            case 2:
                View view = (View) this.f12006c;
                ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 0);
                return;
            case 3:
                String str2 = (String) this.f12006c;
                Bundle bundle = new Bundle();
                p165n4.a aVarA = p165n4.a.C0509a.a(q.a());
                JSONArray jSONArray = new JSONArray();
                String MODEL = Build.MODEL;
                jSONArray.put(MODEL != null ? MODEL : "");
                if ((aVarA == null ? null : aVarA.a()) != null) {
                    jSONArray.put(aVarA.a());
                } else {
                    jSONArray.put("");
                }
                jSONArray.put("0");
                String FINGERPRINT = Build.FINGERPRINT;
                kotlin.jvm.internal.i.d(FINGERPRINT, "FINGERPRINT");
                if (!kotlin.text.m.I(FINGERPRINT, "generic", false) && !kotlin.text.m.I(FINGERPRINT, "unknown", false)) {
                    kotlin.jvm.internal.i.d(MODEL, "MODEL");
                    if (!kotlin.text.n.J(MODEL, "google_sdk", false) && !kotlin.text.n.J(MODEL, "Emulator", false) && !kotlin.text.n.J(MODEL, "Android SDK built for x86", false)) {
                        String MANUFACTURER = Build.MANUFACTURER;
                        kotlin.jvm.internal.i.d(MANUFACTURER, "MANUFACTURER");
                        if (!kotlin.text.n.J(MANUFACTURER, "Genymotion", false)) {
                            String BRAND = Build.BRAND;
                            kotlin.jvm.internal.i.d(BRAND, "BRAND");
                            if (kotlin.text.m.I(BRAND, "generic", false)) {
                                String DEVICE = Build.DEVICE;
                                kotlin.jvm.internal.i.d(DEVICE, "DEVICE");
                                if (!kotlin.text.m.I(DEVICE, "generic", false)) {
                                    str = "google_sdk".equals(Build.PRODUCT) ? "1" : "0";
                                }
                            } else if ("google_sdk".equals(Build.PRODUCT)) {
                            }
                        }
                    }
                }
                jSONArray.put(str);
                try {
                    locale = q.a().getResources().getConfiguration().locale;
                    break;
                } catch (Exception unused) {
                    locale = null;
                }
                if (locale == null) {
                    locale = Locale.getDefault();
                    kotlin.jvm.internal.i.d(locale, "getDefault()");
                }
                jSONArray.put(locale.getLanguage() + '_' + ((Object) locale.getCountry()));
                String string = jSONArray.toString();
                kotlin.jvm.internal.i.d(string, "extInfoArray.toString()");
                if (p030c4.b.f22303d == null) {
                    p030c4.b.f22303d = UUID.randomUUID().toString();
                }
                String str3 = p030c4.b.f22303d;
                if (str3 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
                bundle.putString("device_session_id", str3);
                bundle.putString("extinfo", string);
                String str4 = r.j;
                JSONObject jSONObject = new r(null, String.format(Locale.US, "%s/app_indexing_session", Arrays.copyOf(new Object[]{str2}, 1)), bundle, HttpMethod.f24772c, null, 32).c().f7904b;
                AtomicBoolean atomicBoolean = p030c4.b.f22305f;
                atomicBoolean.set(jSONObject != null && jSONObject.optBoolean("is_app_indexing_enabled", false));
                if (atomicBoolean.get()) {
                    p030c4.f fVar = p030c4.b.f22302c;
                    if (fVar != null) {
                        fVar.a();
                    }
                } else {
                    p030c4.b.f22303d = null;
                }
                p030c4.b.f22306g = false;
                return;
            case 4:
                J j = (J) this.f12006c;
                synchronized (j.f28288d) {
                    SharedPreferences.Editor editorEdit = j.f28285a.edit();
                    String str5 = j.f28286b;
                    StringBuilder sb2 = new StringBuilder();
                    Iterator<String> it = j.f28288d.iterator();
                    while (it.hasNext()) {
                        sb2.append(it.next());
                        sb2.append(j.f28287c);
                    }
                    editorEdit.putString(str5, sb2.toString()).commit();
                    break;
                }
                return;
            default:
                androidx.profileinstaller.c.b((Context) this.f12006c, new p188p2.b(), androidx.profileinstaller.c.f19471a, false);
                return;
        }
    }
}
