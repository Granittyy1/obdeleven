package F6;

import T4.InterfaceC0777j;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import com.google.android.gms.internal.location.q;
import java.util.HashMap;
import kotlinx.coroutines.C2693i;
import kotlinx.coroutines.G;
import org.json.JSONObject;
import p019b6.o;
import p019b6.t;
import p302y6.C2807c;

/* JADX INFO: compiled from: DefaultSettingsSpiCall.java */
/* JADX INFO: loaded from: classes3.dex */
public final class c implements p191p5.c, com.google.android.play.integrity.internal.j, coil.request.d, InterfaceC0777j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f3260b;

    public /* synthetic */ c(Object obj) {
        this.f3260b = obj;
    }

    public static void c(C6.a aVar, i iVar) {
        d(aVar, "X-CRASHLYTICS-GOOGLE-APP-ID", iVar.f3273a);
        d(aVar, "X-CRASHLYTICS-API-CLIENT-TYPE", "android");
        d(aVar, "X-CRASHLYTICS-API-CLIENT-VERSION", "18.6.3");
        d(aVar, "Accept", "application/json");
        d(aVar, "X-CRASHLYTICS-DEVICE-MODEL", iVar.f3274b);
        d(aVar, "X-CRASHLYTICS-OS-BUILD-VERSION", iVar.f3275c);
        d(aVar, "X-CRASHLYTICS-OS-DISPLAY-VERSION", iVar.f3276d);
        d(aVar, "X-CRASHLYTICS-INSTALLATION-ID", ((C2807c) iVar.f3277e.b()).f48364a);
    }

    public static void d(C6.a aVar, String str, String str2) {
        if (str2 != null) {
            aVar.f2424c.put(str, str2);
        }
    }

    public static HashMap f(i iVar) {
        HashMap map = new HashMap();
        map.put("build_version", iVar.f3280h);
        map.put("display_version", iVar.f3279g);
        map.put("source", Integer.toString(iVar.f3281i));
        String str = iVar.f3278f;
        if (!TextUtils.isEmpty(str)) {
            map.put("instance", str);
        }
        return map;
    }

    @Override // com.google.android.play.integrity.internal.m
    public /* bridge */ /* synthetic */ Object a() {
        return new t((o) ((com.google.android.play.integrity.internal.i) this.f3260b).a());
    }

    @Override // T4.InterfaceC0777j
    public /* synthetic */ void b(Object obj, Object obj2) throws RemoteException {
        ((q) ((com.google.android.gms.internal.location.i) obj).A()).o((p106i5.a) this.f3260b, new com.google.android.gms.internal.location.h((p191p5.h) obj2));
    }

    @Override // p191p5.c
    public void e(p191p5.g gVar) {
        Exception excJ = gVar.j();
        C2693i c2693i = (C2693i) this.f3260b;
        if (excJ != null) {
            c2693i.resumeWith(kotlin.b.a(excJ));
        } else if (gVar.m()) {
            c2693i.o(null);
        } else {
            c2693i.resumeWith(gVar.k());
        }
    }

    public JSONObject g(A0.d dVar) {
        p264v6.f fVar = p264v6.f.f47659a;
        fVar.a(2);
        int i10 = dVar.f381a;
        if (i10 == 200 || i10 == 201 || i10 == 202 || i10 == 203) {
            try {
                return new JSONObject((String) dVar.f382b);
            } catch (Exception unused) {
                fVar.a(5);
                fVar.a(5);
                return null;
            }
        }
        StringBuilder sbE = A8.f.e(i10, "Settings request failed; (status: ", ") from ");
        sbE.append((String) this.f3260b);
        String string = sbE.toString();
        if (!fVar.a(6)) {
            return null;
        }
        Log.e("FirebaseCrashlytics", string, null);
        return null;
    }

    public c(View view, G g10) {
        this.f3260b = view;
    }

    public c(String str, C6.b bVar) {
        if (str != null) {
            this.f3260b = str;
            return;
        }
        throw new IllegalArgumentException("url must not be null.");
    }
}
