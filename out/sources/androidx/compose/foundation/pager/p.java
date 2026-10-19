package androidx.compose.foundation.pager;

import androidx.compose.foundation.lazy.layout.D;
import androidx.compose.runtime.C1079c0;
import androidx.compose.runtime.C1081d0;

/* JADX INFO: compiled from: PagerScrollPosition.kt */
/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PagerState f11004a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1081d0 f11005b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C1079c0 f11006c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f11007d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f11008e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final D f11009f;

    public p(int i10, float f10, PagerState pagerState) {
        this.f11004a = pagerState;
        this.f11005b = new C1081d0(i10);
        this.f11006c = new C1079c0(f10);
        this.f11009f = new D(i10, 30, 100);
    }
}
