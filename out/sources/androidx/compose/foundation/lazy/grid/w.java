package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.lazy.layout.D;
import androidx.compose.runtime.C1081d0;

/* JADX INFO: compiled from: LazyGridScrollPosition.kt */
/* JADX INFO: loaded from: classes.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1081d0 f10530a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1081d0 f10531b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f10532c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f10533d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final D f10534e;

    public w(int i10, int i11) {
        this.f10530a = new C1081d0(i10);
        this.f10531b = new C1081d0(i11);
        this.f10534e = new D(i10, 90, androidx.recyclerview.widget.t.d.DEFAULT_DRAG_ANIMATION_DURATION);
    }

    public final void a(int i10, int i11) {
        if (i10 < 0.0f) {
            p245u.c.a("Index should be non-negative");
        }
        this.f10530a.m(i10);
        this.f10534e.e(i10);
        this.f10531b.m(i11);
    }
}
