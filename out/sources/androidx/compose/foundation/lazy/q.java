package androidx.compose.foundation.lazy;

import androidx.compose.foundation.lazy.layout.D;
import androidx.compose.runtime.C1081d0;

/* JADX INFO: compiled from: LazyListScrollPosition.kt */
/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f10773a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f10774b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f10775c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f10776d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f10777e;

    public void a(int i10, int i11) {
        if (i10 < 0.0f) {
            p245u.c.a("Index should be non-negative (" + i10 + ')');
        }
        ((C1081d0) this.f10774b).m(i10);
        ((D) this.f10777e).e(i10);
        ((C1081d0) this.f10775c).m(i11);
    }
}
