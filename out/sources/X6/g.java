package X6;

import W6.n;
import Z6.q;
import android.view.LayoutInflater;

/* JADX INFO: compiled from: ImageBindingWrapper_Factory.java */
/* JADX INFO: loaded from: classes3.dex */
public final class g implements p268va.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p268va.a<n> f7355a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p268va.a<LayoutInflater> f7356b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q f7357c;

    public g(p268va.a aVar, p268va.a aVar2, q qVar) {
        this.f7355a = aVar;
        this.f7356b = aVar2;
        this.f7357c = qVar;
    }

    @Override // p268va.a
    public final Object get() {
        return new f(this.f7355a.get(), this.f7356b.get(), (p083g7.h) this.f7357c.get());
    }
}
