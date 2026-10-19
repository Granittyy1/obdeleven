package p283x0;

import p211r0.f;
import p222s0.e;

/* JADX INFO: compiled from: CallbackWithHandler.java */
/* JADX INFO: loaded from: classes.dex */
public final class b implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e.a f47841b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f47842c;

    public b(e.a aVar, int i10) {
        this.f47841b = aVar;
        this.f47842c = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        f.e eVar = this.f47841b.f46860f;
        if (eVar != null) {
            eVar.b(this.f47842c);
        }
    }
}
