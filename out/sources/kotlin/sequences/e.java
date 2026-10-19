package kotlin.sequences;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Sequences.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class e<T> implements g<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g<T> f43086a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f43087b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Lambda f43088c;

    /* JADX INFO: compiled from: Sequences.kt */
    public static final class a implements Iterator<T>, Ja.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Iterator<T> f43089b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f43090c = -1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public T f43091d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ e<T> f43092e;

        public a(e<T> eVar) {
            this.f43092e = eVar;
            this.f43089b = eVar.f43086a.iterator();
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [Ia.l, kotlin.jvm.internal.Lambda] */
        public final void a() {
            T next;
            e<T> eVar;
            do {
                Iterator<T> it = this.f43089b;
                if (!it.hasNext()) {
                    this.f43090c = 0;
                    return;
                } else {
                    next = it.next();
                    eVar = this.f43092e;
                }
            } while (((Boolean) eVar.f43088c.invoke(next)).booleanValue() != eVar.f43087b);
            this.f43091d = next;
            this.f43090c = 1;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            if (this.f43090c == -1) {
                a();
            }
            return this.f43090c == 1;
        }

        @Override // java.util.Iterator
        public final T next() {
            if (this.f43090c == -1) {
                a();
            }
            if (this.f43090c == 0) {
                throw new NoSuchElementException();
            }
            T t8 = this.f43091d;
            this.f43091d = null;
            this.f43090c = -1;
            return t8;
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e(g<? extends T> gVar, boolean z10, Ia.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.i.e(predicate, "predicate");
        this.f43086a = gVar;
        this.f43087b = z10;
        this.f43088c = (Lambda) predicate;
    }

    @Override // kotlin.sequences.g
    public final Iterator<T> iterator() {
        return new a(this);
    }
}
