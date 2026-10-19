package p265v7;

import com.google.firebase.perf.v1.c;

/* JADX INFO: compiled from: FirebasePerfApplicationInfoValidator.java */
/* JADX INFO: loaded from: classes3.dex */
public final class a extends e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p241t7.a f47661b = p241t7.a.d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f47662a;

    public a(c cVar) {
        this.f47662a = cVar;
    }

    @Override // p265v7.e
    public final boolean a() {
        p241t7.a aVar = f47661b;
        c cVar = this.f47662a;
        if (cVar == null || !cVar.R() || !cVar.P() || !cVar.Q()) {
            aVar.f();
        } else {
            if (!cVar.O()) {
                return true;
            }
            if (cVar.M().L() && cVar.M().M()) {
                return true;
            }
            aVar.f();
        }
        aVar.f();
        return false;
    }
}
