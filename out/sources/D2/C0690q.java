package D2;

import java.util.ArrayList;

/* JADX INFO: renamed from: D2.q, reason: case insensitive filesystem */
/* JADX INFO: compiled from: FragmentTransitionSupport.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0690q extends J {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2683b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArrayList f2684c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f2685d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ArrayList f2686e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0689p f2687f;

    public C0690q(C0689p c0689p, Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2) {
        this.f2687f = c0689p;
        this.f2683b = obj;
        this.f2684c = arrayList;
        this.f2685d = obj2;
        this.f2686e = arrayList2;
    }

    @Override // D2.J, D2.F.e
    public final void d(F f10) {
        C0689p c0689p = this.f2687f;
        Object obj = this.f2683b;
        if (obj != null) {
            c0689p.t(obj, this.f2684c, null);
        }
        Object obj2 = this.f2685d;
        if (obj2 != null) {
            c0689p.t(obj2, this.f2686e, null);
        }
    }

    @Override // D2.F.e
    public final void e(F f10) {
        f10.B(this);
    }
}
