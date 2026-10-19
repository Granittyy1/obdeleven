package kotlin.sequences;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Sequences.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class f<T> implements g<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Lambda f43093a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Ia.l<T, T> f43094b;

    /* JADX INFO: compiled from: Sequences.kt */
    public static final class a implements Iterator<T>, Ja.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public T f43095b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f43096c = -2;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ f<T> f43097d;

        public a(f<T> fVar) {
            this.f43097d = fVar;
        }

        /* JADX WARN: Type inference failed for: r0v7, types: [Ia.a, kotlin.jvm.internal.Lambda] */
        public final void a() {
            T tInvoke;
            int i10 = this.f43096c;
            f<T> fVar = this.f43097d;
            if (i10 == -2) {
                tInvoke = (T) fVar.f43093a.invoke();
            } else {
                Ia.l<T, T> lVar = fVar.f43094b;
                T t8 = this.f43095b;
                kotlin.jvm.internal.i.b(t8);
                tInvoke = lVar.invoke(t8);
            }
            this.f43095b = tInvoke;
            this.f43096c = tInvoke == null ? 0 : 1;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            if (this.f43096c < 0) {
                a();
            }
            return this.f43096c == 1;
        }

        @Override // java.util.Iterator
        public final T next() {
            if (this.f43096c < 0) {
                a();
            }
            if (this.f43096c == 0) {
                throw new NoSuchElementException();
            }
            T t8 = this.f43095b;
            kotlin.jvm.internal.i.c(t8, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
            this.f43096c = -1;
            return t8;
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public f(Ia.a<? extends T> getInitialValue, Ia.l<? super T, ? extends T> getNextValue) {
        kotlin.jvm.internal.i.e(getInitialValue, "getInitialValue");
        kotlin.jvm.internal.i.e(getNextValue, "getNextValue");
        this.f43093a = (Lambda) getInitialValue;
        this.f43094b = getNextValue;
    }

    @Override // kotlin.sequences.g
    public final Iterator<T> iterator() {
        return new a(this);
    }
}
