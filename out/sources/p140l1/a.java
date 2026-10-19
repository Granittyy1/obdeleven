package p140l1;

import java.util.ArrayList;
import p114j1.A;

/* JADX INFO: compiled from: BaseDataSource.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class a implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f44159a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList<l> f44160b = new ArrayList<>(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f44161c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public e f44162d;

    public a(boolean z10) {
        this.f44159a = z10;
    }

    @Override // p140l1.d
    public final void b(l lVar) {
        lVar.getClass();
        ArrayList<l> arrayList = this.f44160b;
        if (arrayList.contains(lVar)) {
            return;
        }
        arrayList.add(lVar);
        this.f44161c++;
    }

    public final void k(int i10) {
        e eVar = this.f44162d;
        int i11 = A.f40996a;
        for (int i12 = 0; i12 < this.f44161c; i12++) {
            this.f44160b.get(i12).f(eVar, this.f44159a, i10);
        }
    }

    public final void l() {
        e eVar = this.f44162d;
        int i10 = A.f40996a;
        for (int i11 = 0; i11 < this.f44161c; i11++) {
            this.f44160b.get(i11).b(eVar, this.f44159a);
        }
        this.f44162d = null;
    }

    public final void m(e eVar) {
        for (int i10 = 0; i10 < this.f44161c; i10++) {
            this.f44160b.get(i10).getClass();
        }
    }

    public final void n(e eVar) {
        this.f44162d = eVar;
        for (int i10 = 0; i10 < this.f44161c; i10++) {
            this.f44160b.get(i10).c(eVar, this.f44159a);
        }
    }
}
