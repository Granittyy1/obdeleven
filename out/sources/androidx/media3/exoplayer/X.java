package androidx.media3.exoplayer;

import com.google.common.collect.ImmutableList;
import com.google.firebase.perf.session.gauges.GaugeManager;
import com.google.firebase.perf.v1.ApplicationProcessState;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class X implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f18172b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f18173c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f18174d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f18175e;

    public /* synthetic */ X(Object obj, Object obj2, Object obj3, int i10) {
        this.f18172b = i10;
        this.f18173c = obj;
        this.f18174d = obj2;
        this.f18175e = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f18172b) {
            case 0:
                Y y10 = (Y) this.f18173c;
                y10.getClass();
                y10.f18178c.h(((ImmutableList.a) this.f18174d).h(), (androidx.media3.exoplayer.source.h.b) this.f18175e);
                break;
            default:
                ((GaugeManager) this.f18173c).lambda$startCollectingGauges$2((String) this.f18174d, (ApplicationProcessState) this.f18175e);
                break;
        }
    }
}
