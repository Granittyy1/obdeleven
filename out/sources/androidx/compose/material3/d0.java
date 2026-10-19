package androidx.compose.material3;

import androidx.compose.foundation.gestures.Orientation;

/* JADX INFO: compiled from: SheetDefaults.kt */
/* JADX INFO: loaded from: classes.dex */
public final class d0 implements androidx.compose.ui.input.nestedscroll.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SheetState f12436b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Ia.l<Float, p293xa.r> f12437c;

    public d0(SheetState sheetState, Ia.l lVar) {
        Orientation orientation = Orientation.f9957b;
        this.f12436b = sheetState;
        this.f12437c = lVar;
    }

    @Override // androidx.compose.ui.input.nestedscroll.a
    public final long C0(int i10, long j) {
        Orientation orientation = Orientation.f9957b;
        float fE = I.d.e(j);
        if (fE >= 0.0f || !androidx.compose.ui.input.nestedscroll.c.a(i10, 1)) {
            return 0L;
        }
        return I.e.c(0.0f, this.f12436b.f12302c.d(fE));
    }

    @Override // androidx.compose.ui.input.nestedscroll.a
    public final Object U(long j, long j10, kotlin.coroutines.c<? super p013b0.p> cVar) {
        Orientation orientation = Orientation.f9957b;
        this.f12437c.invoke(new Float(p013b0.p.c(j10)));
        return new p013b0.p(j10);
    }

    @Override // androidx.compose.ui.input.nestedscroll.a
    public final Object X0(long j, kotlin.coroutines.c<? super p013b0.p> cVar) {
        Orientation orientation = Orientation.f9957b;
        float fC = p013b0.p.c(j);
        SheetState sheetState = this.f12436b;
        float fG = sheetState.f12302c.g();
        float fB = sheetState.f12302c.e().b();
        if (fC >= 0.0f || fG <= fB) {
            j = 0;
        } else {
            this.f12437c.invoke(new Float(fC));
        }
        return new p013b0.p(j);
    }

    @Override // androidx.compose.ui.input.nestedscroll.a
    public final long c1(int i10, long j, long j10) {
        if (!androidx.compose.ui.input.nestedscroll.c.a(i10, 1)) {
            return 0L;
        }
        androidx.compose.material3.internal.i<SheetValue> iVar = this.f12436b.f12302c;
        Orientation orientation = Orientation.f9957b;
        return I.e.c(0.0f, iVar.d(I.d.e(j10)));
    }
}
