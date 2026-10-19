package androidx.privacysandbox.ads.adservices.java.measurement;

import android.net.Uri;
import android.view.InputEvent;
import androidx.privacysandbox.ads.adservices.java.internal.a;
import kotlin.jvm.internal.i;
import kotlinx.coroutines.B;
import kotlinx.coroutines.C2680e;
import kotlinx.coroutines.N;
import p107i6.f;
import p188p2.c;
import p188p2.d;
import p188p2.e;
import p293xa.r;

/* JADX INFO: compiled from: MeasurementManagerFutures.kt */
/* JADX INFO: loaded from: classes.dex */
public abstract class MeasurementManagerFutures {

    /* JADX INFO: compiled from: MeasurementManagerFutures.kt */
    public static final class Api33Ext5JavaImpl extends MeasurementManagerFutures {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c.a f19457a;

        public Api33Ext5JavaImpl(c.a aVar) {
            this.f19457a = aVar;
        }

        @Override // androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures
        public f<Integer> a() {
            return a.a(C2680e.a(B.a(N.f43198a), null, new MeasurementManagerFutures$Api33Ext5JavaImpl$getMeasurementApiStatusAsync$1(this, null), 3));
        }

        @Override // androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures
        public f<r> b(Uri trigger) {
            i.e(trigger, "trigger");
            return a.a(C2680e.a(B.a(N.f43198a), null, new MeasurementManagerFutures$Api33Ext5JavaImpl$registerTriggerAsync$1(this, trigger, null), 3));
        }

        public f<r> c(p188p2.a deletionRequest) {
            i.e(deletionRequest, "deletionRequest");
            throw null;
        }

        public f<r> d(Uri attributionSource, InputEvent inputEvent) {
            i.e(attributionSource, "attributionSource");
            return a.a(C2680e.a(B.a(N.f43198a), null, new MeasurementManagerFutures$Api33Ext5JavaImpl$registerSourceAsync$1(this, attributionSource, inputEvent, null), 3));
        }

        public f<r> e(d request) {
            i.e(request, "request");
            throw null;
        }

        public f<r> f(e request) {
            i.e(request, "request");
            throw null;
        }
    }

    public abstract f<Integer> a();

    public abstract f<r> b(Uri uri);
}
