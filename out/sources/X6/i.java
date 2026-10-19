package X6;

import W6.n;
import X6.h.a;
import Z6.q;
import android.view.LayoutInflater;

/* JADX INFO: compiled from: ModalBindingWrapper_Factory.java */
/* JADX INFO: loaded from: classes3.dex */
public final class i implements p268va.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p268va.a<n> f7368a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p268va.a<LayoutInflater> f7369b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q f7370c;

    public i(p268va.a aVar, p268va.a aVar2, q qVar) {
        this.f7368a = aVar;
        this.f7369b = aVar2;
        this.f7370c = qVar;
    }

    @Override // p268va.a
    public final Object get() {
        h hVar = new h(this.f7368a.get(), this.f7369b.get(), (p083g7.h) this.f7370c.get());
        hVar.f7366m = hVar.new a();
        return hVar;
    }
}
