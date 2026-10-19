package androidx.activity.compose;

import Ia.p;
import androidx.activity.C0845b;
import androidx.activity.y;
import kotlinx.coroutines.A;
import kotlinx.coroutines.flow.InterfaceC2686c;
import p293xa.r;

/* JADX INFO: compiled from: PredictiveBackHandler.kt */
/* JADX INFO: loaded from: classes.dex */
public final class g extends y {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public A f8220d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public p<? super InterfaceC2686c<C0845b>, ? super kotlin.coroutines.c<? super r>, ? extends Object> f8221e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public f f8222f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f8223g;

    public g() {
        throw null;
    }

    @Override // androidx.activity.y
    public final void a() {
        f fVar = this.f8222f;
        if (fVar != null) {
            fVar.a();
        }
        f fVar2 = this.f8222f;
        if (fVar2 != null) {
            fVar2.f8217a = false;
        }
        this.f8223g = false;
    }

    @Override // androidx.activity.y
    public final void b() {
        f fVar = this.f8222f;
        if (fVar != null && !fVar.f8217a) {
            fVar.a();
            this.f8222f = null;
        }
        if (this.f8222f == null) {
            this.f8222f = new f(this.f8220d, false, this.f8221e, this);
        }
        f fVar2 = this.f8222f;
        if (fVar2 != null) {
            fVar2.f8218b.a(null);
        }
        f fVar3 = this.f8222f;
        if (fVar3 != null) {
            fVar3.f8217a = false;
        }
        this.f8223g = false;
    }

    @Override // androidx.activity.y
    public final void c(C0845b c0845b) {
        super.c(c0845b);
        f fVar = this.f8222f;
        if (fVar != null) {
            fVar.f8218b.n(c0845b);
        }
    }

    @Override // androidx.activity.y
    public final void d(C0845b c0845b) {
        super.d(c0845b);
        f fVar = this.f8222f;
        if (fVar != null) {
            fVar.a();
        }
        if (this.f8270a) {
            this.f8222f = new f(this.f8220d, true, this.f8221e, this);
        }
        this.f8223g = true;
    }
}
