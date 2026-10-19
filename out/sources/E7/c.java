package E7;

import G7.f;
import android.media.metrics.TrackChangeEvent;
import p162n1.t;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3116b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f3117c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f3118d;

    public /* synthetic */ c(Object obj, int i10, Object obj2) {
        this.f3116b = i10;
        this.f3117c = obj;
        this.f3118d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3116b) {
            case 0:
                ((f) this.f3117c).a((G7.c) this.f3118d);
                break;
            default:
                ((t) this.f3117c).f44720d.reportTrackChangeEvent((TrackChangeEvent) this.f3118d);
                break;
        }
    }
}
