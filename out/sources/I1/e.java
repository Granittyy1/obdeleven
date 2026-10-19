package I1;

import A1.F;
import A1.G;
import A1.K;
import A1.r;
import A1.y;
import androidx.media3.exoplayer.source.k;

/* JADX INFO: compiled from: StartOffsetExtractorOutput.java */
/* JADX INFO: loaded from: classes.dex */
public final class e implements r {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f3799b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k f3800c;

    /* JADX INFO: compiled from: StartOffsetExtractorOutput.java */
    public class a extends y {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ F f3801b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(F f10, F f11) {
            super(f10);
            this.f3801b = f11;
        }

        @Override // A1.y, A1.F
        public final F.a i(long j) {
            F.a aVarI = this.f3801b.i(j);
            G g10 = aVarI.f415a;
            long j10 = g10.f420a;
            long j11 = e.this.f3799b;
            G g11 = new G(j10, g10.f421b + j11);
            G g12 = aVarI.f416b;
            return new F.a(g11, new G(g12.f420a, g12.f421b + j11));
        }
    }

    public e(long j, k kVar) {
        this.f3799b = j;
        this.f3800c = kVar;
    }

    @Override // A1.r
    public final void g(F f10) {
        this.f3800c.g(new a(f10, f10));
    }

    @Override // A1.r
    public final void j() {
        this.f3800c.j();
    }

    @Override // A1.r
    public final K p(int i10, int i11) {
        return this.f3800c.p(i10, i11);
    }
}
