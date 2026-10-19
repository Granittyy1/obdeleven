package U7;

import androidx.collection.C0874b;
import androidx.lifecycle.B;
import androidx.lifecycle.D;
import androidx.lifecycle.InterfaceC1376t;
import java.util.Iterator;
import kotlin.TypeCastException;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;

/* JADX INFO: compiled from: LiveEvent.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class a<T> extends B<T> {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final C0874b<C0088a<? super T>> f6556m = new C0874b<>(0);

    /* JADX INFO: renamed from: U7.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: LiveEvent.kt */
    public static final class C0088a<T> implements D<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f6557b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final D<T> f6558c;

        public C0088a(D<T> observer) {
            i.f(observer, "observer");
            this.f6558c = observer;
        }

        @Override // androidx.lifecycle.D
        public final void d(T t8) {
            if (this.f6557b) {
                this.f6557b = false;
                this.f6558c.d(t8);
            }
        }
    }

    @Override // androidx.lifecycle.AbstractC1382z
    public final void e(InterfaceC1376t owner, D<? super T> d10) {
        i.f(owner, "owner");
        C0088a<? super T> c0088a = new C0088a<>(d10);
        this.f6556m.add(c0088a);
        super.e(owner, c0088a);
    }

    @Override // androidx.lifecycle.AbstractC1382z
    public final void f(D<? super T> observer) {
        i.f(observer, "observer");
        C0088a<? super T> c0088a = new C0088a<>(observer);
        this.f6556m.add(c0088a);
        super.f(c0088a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.lifecycle.AbstractC1382z
    public final void i(D<? super T> observer) {
        i.f(observer, "observer");
        C0874b<C0088a<? super T>> c0874b = this.f6556m;
        if (c0874b == null) {
            throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.MutableCollection<T>");
        }
        if (o.a(c0874b).remove(observer)) {
            super.i(observer);
            return;
        }
        c0874b.getClass();
        C0874b.a aVar = new C0874b.a();
        while (aVar.hasNext()) {
            C0088a c0088a = (C0088a) aVar.next();
            if (i.a(c0088a.f6558c, observer)) {
                aVar.remove();
                super.i(c0088a);
                return;
            }
        }
    }

    @Override // androidx.lifecycle.AbstractC1382z
    public final void j(T t8) {
        Iterator<C0088a<? super T>> it = this.f6556m.iterator();
        while (it.hasNext()) {
            it.next().f6557b = true;
        }
        super.j(t8);
    }
}
