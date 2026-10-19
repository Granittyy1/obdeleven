package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.lazy.layout.C;
import androidx.compose.foundation.lazy.layout.InterfaceC0988x;
import androidx.compose.ui.layout.Y;
import java.util.List;

/* JADX INFO: compiled from: LazyGridMeasuredItemProvider.kt */
/* JADX INFO: loaded from: classes.dex */
public abstract class r implements C<q> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f10513a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC0988x f10514b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f10515c;

    public r(h hVar, InterfaceC0988x interfaceC0988x, int i10) {
        this.f10513a = hVar;
        this.f10514b = interfaceC0988x;
        this.f10515c = i10;
    }

    @Override // androidx.compose.foundation.lazy.layout.C
    public final androidx.compose.foundation.lazy.layout.z a(int i10, int i11, int i12, long j) {
        return c(i10, i11, i12, this.f10515c, j);
    }

    public abstract q b(int i10, Object obj, Object obj2, int i11, int i12, List<? extends Y> list, long j, int i13, int i14);

    public final q c(int i10, int i11, int i12, int i13, long j) {
        int i14;
        h hVar = this.f10513a;
        Object objC = hVar.c(i10);
        Object objF = hVar.f(i10);
        List<Y> listI0 = this.f10514b.I0(i10, j);
        if (p013b0.a.f(j)) {
            i14 = p013b0.a.j(j);
        } else {
            if (!p013b0.a.e(j)) {
                p245u.c.a("does not have fixed height");
            }
            i14 = p013b0.a.i(j);
        }
        return b(i10, objC, objF, i14, i13, listI0, j, i11, i12);
    }
}
