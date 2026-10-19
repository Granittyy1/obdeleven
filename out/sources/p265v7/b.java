package p265v7;

import com.google.firebase.perf.v1.f;

/* JADX INFO: compiled from: FirebasePerfGaugeMetricValidator.java */
/* JADX INFO: loaded from: classes3.dex */
public final class b extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f47663a;

    public b(f fVar) {
        this.f47663a = fVar;
    }

    @Override // p265v7.e
    public final boolean a() {
        f fVar = this.f47663a;
        return fVar.Q() && (fVar.M() > 0 || fVar.L() > 0 || (fVar.P() && fVar.O().L()));
    }
}
