package p314z7;

import com.google.firebase.perf.v1.ApplicationProcessState;
import com.google.firebase.perf.v1.f;
import com.google.firebase.perf.v1.g;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class d implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f48923b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f48924c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ApplicationProcessState f48925d;

    public /* synthetic */ d(f fVar, f fVar2, ApplicationProcessState applicationProcessState) {
        this.f48923b = fVar;
        this.f48924c = fVar2;
        this.f48925d = applicationProcessState;
    }

    @Override // java.lang.Runnable
    public final void run() {
        f fVar = this.f48923b;
        fVar.getClass();
        g.a aVarN = g.N();
        aVarN.r();
        g.I((g) aVarN.f29047c, this.f48924c);
        fVar.d(aVarN, this.f48925d);
    }
}
