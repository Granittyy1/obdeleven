package coil.compose;

import p141l2.C;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class x implements Ia.l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f22837b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f22838c;

    public /* synthetic */ x(int i10, Object obj) {
        this.f22837b = i10;
        this.f22838c = obj;
    }

    @Override // Ia.l
    public final Object invoke(Object obj) {
        switch (this.f22837b) {
            case 0:
                androidx.compose.ui.semantics.w wVar = (androidx.compose.ui.semantics.w) obj;
                androidx.compose.ui.semantics.t.g((String) this.f22838c, wVar);
                androidx.compose.ui.semantics.t.k(wVar, 5);
                return p293xa.r.f47939a;
            default:
                C destination = (C) obj;
                kotlin.jvm.internal.i.e(destination, "destination");
                return Boolean.valueOf(!((p163n2.j) this.f22838c).f44795l.containsKey(Integer.valueOf(destination.f44219c.f44813d)));
        }
    }
}
