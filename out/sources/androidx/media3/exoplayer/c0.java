package androidx.media3.exoplayer;

import android.util.Pair;
import com.google.firebase.perf.v1.ApplicationProcessState;
import com.obdeleven.service.model.ControlUnit;
import java.util.List;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c0 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f18326b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f18327c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f18328d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f18329e;

    public /* synthetic */ c0(Object obj, Object obj2, Object obj3, int i10) {
        this.f18326b = i10;
        this.f18327c = obj;
        this.f18328d = obj2;
        this.f18329e = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f18326b) {
            case 0:
                p162n1.a aVar = g0.this.f18385h;
                Pair pair = (Pair) this.f18328d;
                aVar.k(((Integer) pair.first).intValue(), (androidx.media3.exoplayer.source.h.b) pair.second, (p235t1.k) this.f18329e);
                break;
            case 1:
                if (((ControlUnit.g) this.f18327c) != null) {
                    int[] iArr = (int[]) this.f18328d;
                    iArr[0] = iArr[0] + 1;
                    ((List) this.f18329e).size();
                }
                break;
            default:
                p314z7.f fVar = (p314z7.f) this.f18327c;
                fVar.getClass();
                com.google.firebase.perf.v1.g.a aVarN = com.google.firebase.perf.v1.g.N();
                aVarN.r();
                com.google.firebase.perf.v1.g.J((com.google.firebase.perf.v1.g) aVarN.f29047c, (com.google.firebase.perf.v1.i) this.f18328d);
                fVar.d(aVarN, (ApplicationProcessState) this.f18329e);
                break;
        }
    }
}
