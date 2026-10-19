package X6;

import W6.n;
import X6.d.a;
import Z6.q;
import android.view.LayoutInflater;

/* JADX INFO: compiled from: CardBindingWrapper_Factory.java */
/* JADX INFO: loaded from: classes3.dex */
public final class e implements p268va.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p268va.a<n> f7348a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p268va.a<LayoutInflater> f7349b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q f7350c;

    public e(p268va.a aVar, p268va.a aVar2, q qVar) {
        this.f7348a = aVar;
        this.f7349b = aVar2;
        this.f7350c = qVar;
    }

    @Override // p268va.a
    public final Object get() {
        d dVar = new d(this.f7348a.get(), this.f7349b.get(), (p083g7.h) this.f7350c.get());
        dVar.f7346n = dVar.new a();
        return dVar;
    }
}
