package X1;

import A1.F;
import A1.K;
import A1.r;
import android.util.SparseArray;

/* JADX INFO: compiled from: SubtitleTranscodingExtractorOutput.java */
/* JADX INFO: loaded from: classes.dex */
public final class m implements r {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f7155b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l.a f7156c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SparseArray<o> f7157d = new SparseArray<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f7158e;

    public m(r rVar, l.a aVar) {
        this.f7155b = rVar;
        this.f7156c = aVar;
    }

    @Override // A1.r
    public final void g(F f10) {
        this.f7155b.g(f10);
    }

    @Override // A1.r
    public final void j() {
        this.f7155b.j();
        if (!this.f7158e) {
            return;
        }
        int i10 = 0;
        while (true) {
            SparseArray<o> sparseArray = this.f7157d;
            if (i10 >= sparseArray.size()) {
                return;
            }
            sparseArray.valueAt(i10).f7170i = true;
            i10++;
        }
    }

    @Override // A1.r
    public final K p(int i10, int i11) {
        r rVar = this.f7155b;
        if (i11 != 3) {
            this.f7158e = true;
            return rVar.p(i10, i11);
        }
        SparseArray<o> sparseArray = this.f7157d;
        o oVar = sparseArray.get(i10);
        if (oVar != null) {
            return oVar;
        }
        o oVar2 = new o(rVar.p(i10, i11), this.f7156c);
        sparseArray.put(i10, oVar2);
        return oVar2;
    }
}
