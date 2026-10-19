package I;

import D3.l;
import U1.o;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import androidx.compose.ui.input.pointer.y;
import com.facebook.appevents.AppEvent;
import com.facebook.appevents.ondeviceprocessing.RemoteServiceWrapper;
import com.facebook.internal.FetchedAppSettingsManager;
import com.google.android.gms.internal.play_billing.v2;
import com.obdeleven.service.exception.CommandException;
import com.obdeleven.service.util.Texttabe;
import com.voltasit.obdeleven.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.collections.q;
import kotlin.jvm.internal.i;
import kotlinx.coroutines.C2674b;
import kotlinx.coroutines.C2693i;
import kotlinx.coroutines.r;
import org.json.JSONArray;
import p078g1.t;
import p165n4.j;

/* JADX INFO: compiled from: GeometryUtils.kt */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f3749a = 12345;

    public static void a(SpannableStringBuilder spannableStringBuilder, Object obj, int i10, int i11) {
        for (Object obj2 : spannableStringBuilder.getSpans(i10, i11, obj.getClass())) {
            if (spannableStringBuilder.getSpanStart(obj2) == i10 && spannableStringBuilder.getSpanEnd(obj2) == i11 && spannableStringBuilder.getSpanFlags(obj2) == 33) {
                spannableStringBuilder.removeSpan(obj2);
            }
        }
        spannableStringBuilder.setSpan(obj, i10, i11, 33);
    }

    public static final Bundle b(RemoteServiceWrapper.EventType eventType, String str, List appEvents) {
        i.e(appEvents, "appEvents");
        Bundle bundle = new Bundle();
        bundle.putString("event", eventType.toString());
        bundle.putString("app_id", str);
        if (RemoteServiceWrapper.EventType.CUSTOM_APP_EVENTS == eventType) {
            JSONArray jSONArray = new JSONArray();
            ArrayList<AppEvent> arrayListP0 = q.p0(appEvents);
            p056e4.a.a(arrayListP0);
            j jVarF = FetchedAppSettingsManager.f(str, false);
            boolean z10 = jVarF != null ? jVarF.f44895a : false;
            for (AppEvent appEvent : arrayListP0) {
                if (!appEvent.d()) {
                    i.k(appEvent, "Event with invalid checksum: ");
                    Z3.q qVar = Z3.q.f7852a;
                } else if (!appEvent.e() || (appEvent.e() && z10)) {
                    jSONArray.put(appEvent.b());
                }
            }
            if (jSONArray.length() == 0) {
                return null;
            }
            bundle.putString("custom_events", jSONArray.toString());
        }
        return bundle;
    }

    public static final boolean c(androidx.compose.ui.input.pointer.q qVar) {
        return !qVar.f14107h && qVar.f14103d;
    }

    public static final boolean d(androidx.compose.ui.input.pointer.q qVar) {
        return (qVar.b() || !qVar.f14107h || qVar.f14103d) ? false : true;
    }

    public static final boolean e(androidx.compose.ui.input.pointer.q qVar) {
        return qVar.f14107h && !qVar.f14103d;
    }

    public static final long f() {
        return Thread.currentThread().getId();
    }

    public static String g(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        boolean z10 = false;
        String str = null;
        while (it.hasNext()) {
            String str2 = ((o) it.next()).f6289a.f6263g.f35302n;
            if (t.l(str2)) {
                return "video/mp4";
            }
            if (t.i(str2)) {
                z10 = true;
            } else if (t.j(str2)) {
                if (Objects.equals(str2, "image/heic")) {
                    str = "image/heif";
                } else if (Objects.equals(str2, "image/avif")) {
                    str = "image/avif";
                }
            }
        }
        if (z10) {
            return "audio/mp4";
        }
        return str != null ? str : "application/mp4";
    }

    public static String h(CommandException commandException, Context context) {
        return commandException.a() != -1 ? String.format("(%02X) %s", Integer.valueOf(commandException.a()), Texttabe.a(commandException.a())) : context.getString(R.string.common_request_timeout);
    }

    public static final C2693i i(kotlin.coroutines.c cVar) {
        C2693i c2693i;
        C2693i c2693i2;
        if (!(cVar instanceof kotlinx.coroutines.internal.h)) {
            return new C2693i(1, cVar);
        }
        kotlinx.coroutines.internal.h hVar = (kotlinx.coroutines.internal.h) cVar;
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = kotlinx.coroutines.internal.h.f43475i;
            Object obj = atomicReferenceFieldUpdater.get(hVar);
            l lVar = kotlinx.coroutines.internal.i.f43481b;
            c2693i = null;
            if (obj == null) {
                atomicReferenceFieldUpdater.set(hVar, lVar);
                c2693i2 = null;
                break;
            }
            if (obj instanceof C2693i) {
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(hVar, obj, lVar)) {
                        c2693i2 = (C2693i) obj;
                        break loop0;
                    }
                } while (atomicReferenceFieldUpdater.get(hVar) == obj);
            } else if (obj != lVar && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
        if (c2693i2 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = C2693i.f43445h;
            Object obj2 = atomicReferenceFieldUpdater2.get(c2693i2);
            if (!(obj2 instanceof r) || ((r) obj2).f43528d == null) {
                C2693i.f43444g.set(c2693i2, 536870911);
                atomicReferenceFieldUpdater2.set(c2693i2, C2674b.f43233b);
                c2693i = c2693i2;
            } else {
                c2693i2.l();
            }
            if (c2693i != null) {
                return c2693i;
            }
        }
        return new C2693i(2, cVar);
    }

    public static String j() {
        return String.format("%04X", Integer.valueOf(f3749a));
    }

    public static final void k() {
        throw new IllegalStateException("Invalid applier");
    }

    public static final boolean l(androidx.compose.ui.input.pointer.q qVar, long j, long j10) {
        boolean zA = y.a(qVar.f14108i, 1);
        long j11 = qVar.f14102c;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j11 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j11 & 4294967295L));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j10 >> 32));
        float f10 = zA ? 1.0f : 0.0f;
        float f11 = fIntBitsToFloat3 * f10;
        float f12 = ((int) (j >> 32)) + f11;
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j10 & 4294967295L)) * f10;
        return (fIntBitsToFloat > f12) | (fIntBitsToFloat < (-f11)) | (fIntBitsToFloat2 < (-fIntBitsToFloat4)) | (fIntBitsToFloat2 > ((int) (j & 4294967295L)) + fIntBitsToFloat4);
    }

    public static final boolean m(io.ktor.http.q qVar) {
        i.e(qVar, "<this>");
        int i10 = qVar.f40511b;
        return 200 <= i10 && i10 < 300;
    }

    public static ArrayList n(List list) {
        if (list == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String string = (String) it.next();
            if (string == null) {
                string = "";
            } else if (string.length() < 5) {
                StringBuilder sb2 = new StringBuilder();
                while (sb2.length() < 5 - string.length()) {
                    sb2.append('0');
                }
                sb2.append(string);
                string = sb2.toString();
            }
            arrayList.add(string);
        }
        return arrayList;
    }

    public static final long o(androidx.compose.ui.input.pointer.q qVar, boolean z10) {
        long jF = d.f(qVar.f14102c, qVar.f14106g);
        if (z10 || !qVar.b()) {
            return jF;
        }
        return 0L;
    }

    public static final String p(float f10) {
        if (Float.isNaN(f10)) {
            return "NaN";
        }
        if (Float.isInfinite(f10)) {
            return f10 < 0.0f ? "-Infinity" : "Infinity";
        }
        int iMax = Math.max(1, 0);
        float fPow = (float) Math.pow(10.0f, iMax);
        float f11 = f10 * fPow;
        int i10 = (int) f11;
        if (f11 - i10 >= 0.5f) {
            i10++;
        }
        float f12 = i10 / fPow;
        return iMax > 0 ? String.valueOf(f12) : String.valueOf((int) f12);
    }

    public static /* synthetic */ boolean q(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, v2 v2Var, Object obj, Object obj2) {
        while (!atomicReferenceFieldUpdater.compareAndSet(v2Var, obj, obj2)) {
            if (atomicReferenceFieldUpdater.get(v2Var) != obj && atomicReferenceFieldUpdater.get(v2Var) != obj) {
                return false;
            }
        }
        return true;
    }
}
