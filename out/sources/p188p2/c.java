package p188p2;

import A8.p;
import android.adservices.measurement.MeasurementManager;
import android.content.Context;
import android.net.Uri;
import android.view.InputEvent;
import androidx.compose.foundation.text.input.internal.C;
import androidx.compose.foundation.text.input.internal.D;
import androidx.compose.foundation.text.input.internal.G;
import androidx.compose.foundation.text.input.internal.H;
import androidx.compose.foundation.text.input.internal.I;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.i;
import kotlinx.coroutines.C2693i;
import p293xa.r;

/* JADX INFO: compiled from: MeasurementManager.kt */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: compiled from: MeasurementManager.kt */
    public static final class a extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MeasurementManager f45798a;

        public a(Context context) {
            i.e(context, "context");
            Object systemService = context.getSystemService((Class<Object>) C.b());
            i.d(systemService, "context.getSystemService…:class.java\n            )");
            this.f45798a = D.a(systemService);
        }

        public Object a(p188p2.a aVar, kotlin.coroutines.c<? super r> cVar) {
            new C2693i(1, p.y(cVar)).s();
            G.b();
            throw null;
        }

        public Object b(kotlin.coroutines.c<? super Integer> cVar) {
            C2693i c2693i = new C2693i(1, p.y(cVar));
            c2693i.s();
            this.f45798a.getMeasurementApiStatus(new b(), androidx.core.os.a.a(c2693i));
            Object objP = c2693i.p();
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            return objP;
        }

        public Object c(Uri uri, InputEvent inputEvent, kotlin.coroutines.c<? super r> cVar) {
            C2693i c2693i = new C2693i(1, p.y(cVar));
            c2693i.s();
            this.f45798a.registerSource(uri, inputEvent, new b(), androidx.core.os.a.a(c2693i));
            Object objP = c2693i.p();
            return objP == CoroutineSingletons.f43038b ? objP : r.f47939a;
        }

        public Object d(Uri uri, kotlin.coroutines.c<? super r> cVar) {
            C2693i c2693i = new C2693i(1, p.y(cVar));
            c2693i.s();
            this.f45798a.registerTrigger(uri, new b(), androidx.core.os.a.a(c2693i));
            Object objP = c2693i.p();
            return objP == CoroutineSingletons.f43038b ? objP : r.f47939a;
        }

        public Object e(d dVar, kotlin.coroutines.c<? super r> cVar) {
            new C2693i(1, p.y(cVar)).s();
            H.b();
            throw null;
        }

        public Object f(e eVar, kotlin.coroutines.c<? super r> cVar) {
            new C2693i(1, p.y(cVar)).s();
            I.b();
            throw null;
        }
    }
}
