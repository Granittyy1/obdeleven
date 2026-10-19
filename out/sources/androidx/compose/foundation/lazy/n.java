package androidx.compose.foundation.lazy;

import androidx.compose.foundation.lazy.layout.C;
import androidx.compose.foundation.lazy.layout.InterfaceC0988x;
import androidx.compose.foundation.lazy.layout.z;
import androidx.compose.ui.layout.Y;
import com.braze.support.BrazeLogger;
import java.util.List;

/* JADX INFO: compiled from: LazyListMeasuredItemProvider.kt */
/* JADX INFO: loaded from: classes.dex */
public abstract class n implements C<m> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f10770a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC0988x f10771b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f10772c;

    public n(long j, boolean z10, h hVar, InterfaceC0988x interfaceC0988x) {
        this.f10770a = hVar;
        this.f10771b = interfaceC0988x;
        this.f10772c = p013b0.b.b(z10 ? p013b0.a.h(j) : Integer.MAX_VALUE, z10 ? BrazeLogger.SUPPRESS : p013b0.a.g(j), 5);
    }

    public static m c(n nVar, int i10) {
        long j = nVar.f10772c;
        h hVar = nVar.f10770a;
        return nVar.b(i10, hVar.c(i10), hVar.f(i10), nVar.f10771b.I0(i10, j), j);
    }

    @Override // androidx.compose.foundation.lazy.layout.C
    public final z a(int i10, int i11, int i12, long j) {
        h hVar = this.f10770a;
        return b(i10, hVar.c(i10), hVar.f(i10), this.f10771b.I0(i10, j), j);
    }

    public abstract m b(int i10, Object obj, Object obj2, List<? extends Y> list, long j);
}
