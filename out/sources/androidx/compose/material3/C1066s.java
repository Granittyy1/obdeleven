package androidx.compose.material3;

import androidx.compose.foundation.lazy.LazyListState;
import kotlinx.coroutines.flow.InterfaceC2687d;

/* JADX INFO: renamed from: androidx.compose.material3.s, reason: case insensitive filesystem */
/* JADX INFO: compiled from: DatePicker.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C1066s<T> implements InterfaceC2687d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LazyListState f12706b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Ia.l<Long, p293xa.r> f12707c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.material3.internal.k f12708d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Na.i f12709e;

    /* JADX WARN: Multi-variable type inference failed */
    public C1066s(LazyListState lazyListState, Ia.l<? super Long, p293xa.r> lVar, androidx.compose.material3.internal.k kVar, Na.i iVar) {
        this.f12706b = lazyListState;
        this.f12707c = lVar;
        this.f12708d = kVar;
        this.f12709e = iVar;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC2687d
    public final Object emit(Object obj, kotlin.coroutines.c cVar) {
        ((Number) obj).intValue();
        LazyListState lazyListState = this.f12706b;
        int iH = lazyListState.h() / 12;
        int iH2 = (lazyListState.h() % 12) + 1;
        this.f12707c.invoke(new Long(this.f12708d.d(this.f12709e.f4687b + iH, iH2).f12554e));
        return p293xa.r.f47939a;
    }
}
