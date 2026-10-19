package com.voltasit.obdeleven.presentation.history.child;

import android.view.View;
import androidx.media3.exoplayer.C1390h;
import androidx.media3.exoplayer.K;
import com.voltasit.obdeleven.ui.activity.MainActivity;
import io.intercom.android.sdk.overlay.OverlayPresenter;
import java.util.Map;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.i;
import p078g1.F;
import p114j1.A;
import p175o1.j;
import p220r9.J;
import p220r9.P;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f32431b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f32432c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f32433d;

    public /* synthetic */ b(Object obj, int i10, Object obj2) {
        this.f32431b = i10;
        this.f32432c = obj;
        this.f32433d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f32431b) {
            case 0:
                VehicleHistoryChildrenFragment this$0 = (VehicleHistoryChildrenFragment) this.f32432c;
                i.e(this$0, "this$0");
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.f32433d;
                if (!this$0.y() && atomicBoolean.compareAndSet(false, true)) {
                    this$0.w();
                    MainActivity mainActivityQ = this$0.q();
                    P.a(mainActivityQ, mainActivityQ.getString(J.i(new TimeoutException())));
                    break;
                }
                break;
            case 1:
                ((OverlayPresenter) this.f32432c).lambda$removeOverlaysIfPresent$6((View) this.f32433d);
                break;
            case 2:
                j jVar = (j) this.f32432c;
                C1390h c1390h = (C1390h) this.f32433d;
                jVar.getClass();
                synchronized (c1390h) {
                }
                K.a aVar = jVar.f45100b;
                int i10 = A.f40996a;
                K.this.f18039s.f0(c1390h);
                break;
            case 3:
                ((P6.b) ((Map.Entry) this.f32432c).getKey()).a((P6.a) this.f32433d);
                break;
            default:
                p297y1.d.this.f48033h.b((F) this.f32433d);
                break;
        }
    }
}
