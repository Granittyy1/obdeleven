package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.C1085f0;
import androidx.compose.runtime.J0;

/* JADX INFO: compiled from: LazyLayoutPinnableItem.kt */
/* JADX INFO: loaded from: classes.dex */
public final class E implements androidx.compose.ui.layout.X, androidx.compose.ui.layout.X.a, G.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f10575a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final G f10576b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f10578d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public androidx.compose.ui.layout.X.a f10579e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f10580f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f10577c = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C1085f0 f10581g = J0.f(null);

    public E(Object obj, G g10) {
        this.f10575a = obj;
        this.f10576b = g10;
    }

    @Override // androidx.compose.ui.layout.X.a
    public final void a() {
        if (this.f10580f) {
            return;
        }
        if (this.f10578d <= 0) {
            p245u.c.c("Release should only be called once");
        }
        int i10 = this.f10578d - 1;
        this.f10578d = i10;
        if (i10 == 0) {
            this.f10576b.f10583b.remove(this);
            androidx.compose.ui.layout.X.a aVar = this.f10579e;
            if (aVar != null) {
                aVar.a();
            }
            this.f10579e = null;
        }
    }

    @Override // androidx.compose.ui.layout.X
    public final E b() {
        if (this.f10580f) {
            p245u.c.c("Pin should not be called on an already disposed item ");
        }
        if (this.f10578d == 0) {
            this.f10576b.f10583b.add(this);
            androidx.compose.ui.layout.X x10 = (androidx.compose.ui.layout.X) this.f10581g.getValue();
            this.f10579e = x10 != null ? x10.b() : null;
        }
        this.f10578d++;
        return this;
    }

    @Override // androidx.compose.foundation.lazy.layout.G.a
    public final int getIndex() {
        return this.f10577c;
    }

    @Override // androidx.compose.foundation.lazy.layout.G.a
    public final Object getKey() {
        return this.f10575a;
    }
}
