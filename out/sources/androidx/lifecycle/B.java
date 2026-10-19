package androidx.lifecycle;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: MediatorLiveData.java */
/* JADX INFO: loaded from: classes.dex */
public class B<T> extends C<T> {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public p173o.b<AbstractC1382z<?>, a<?>> f17721l = new p173o.b<>();

    /* JADX INFO: compiled from: MediatorLiveData.java */
    public static class a<V> implements D<V> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final C f17722b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Object f17723c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f17724d = -1;

        public a(C c10, D d10) {
            this.f17722b = c10;
            this.f17723c = d10;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.D, java.lang.Object] */
        @Override // androidx.lifecycle.D
        public final void d(V v10) {
            int i10 = this.f17724d;
            int i11 = this.f17722b.f17846g;
            if (i10 != i11) {
                this.f17724d = i11;
                this.f17723c.d(v10);
            }
        }
    }

    @Override // androidx.lifecycle.AbstractC1382z
    public void g() {
        Iterator<Map.Entry<AbstractC1382z<?>, a<?>>> it = this.f17721l.iterator();
        while (true) {
            o.b.e eVar = (o.b.e) it;
            if (!eVar.hasNext()) {
                return;
            }
            a aVar = (a) ((Map.Entry) eVar.next()).getValue();
            aVar.f17722b.f(aVar);
        }
    }

    @Override // androidx.lifecycle.AbstractC1382z
    public void h() {
        Iterator<Map.Entry<AbstractC1382z<?>, a<?>>> it = this.f17721l.iterator();
        while (true) {
            o.b.e eVar = (o.b.e) it;
            if (!eVar.hasNext()) {
                return;
            }
            a aVar = (a) ((Map.Entry) eVar.next()).getValue();
            aVar.f17722b.i(aVar);
        }
    }

    public final void l(C c10, D d10) {
        a<?> aVar;
        a aVar2 = new a(c10, d10);
        p173o.b<AbstractC1382z<?>, a<?>> bVar = this.f17721l;
        o.b.c<AbstractC1382z<?>, a<?>> cVarD = bVar.d(c10);
        if (cVarD != null) {
            aVar = cVarD.f45039c;
        } else {
            o.b.c<K, V> cVar = new o.b.c<>(c10, aVar2);
            bVar.f45037e++;
            o.b.c cVar2 = bVar.f45035c;
            if (cVar2 == null) {
                bVar.f45034b = cVar;
                bVar.f45035c = cVar;
            } else {
                cVar2.f45040d = cVar;
                cVar.f45041e = cVar2;
                bVar.f45035c = cVar;
            }
            aVar = null;
        }
        a<?> aVar3 = aVar;
        if (aVar3 != null && aVar3.f17723c != d10) {
            throw new IllegalArgumentException("This source was already added with the different observer");
        }
        if (aVar3 == null && this.f17842c > 0) {
            c10.f(aVar2);
        }
    }
}
