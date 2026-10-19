package androidx.collection;

import com.google.android.gms.internal.measurement.C1787c0;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;

/* JADX INFO: compiled from: OrderedScatterSet.kt */
/* JADX INFO: loaded from: classes.dex */
public class OrderedSetWrapper<E> implements Set<E>, Ja.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final J f9117b;

    /* JADX INFO: renamed from: androidx.collection.OrderedSetWrapper$iterator$1, reason: invalid class name */
    /* JADX INFO: compiled from: OrderedScatterSet.kt */
    @Aa.c(c = "androidx.collection.OrderedSetWrapper$iterator$1", f = "OrderedScatterSet.kt", l = {1454}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends RestrictedSuspendLambda implements Ia.p<kotlin.sequences.i<? super E>, kotlin.coroutines.c<? super p293xa.r>, Object> {
        int I$0;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;
        final /* synthetic */ OrderedSetWrapper<E> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(OrderedSetWrapper<E> orderedSetWrapper, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.this$0 = orderedSetWrapper;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, cVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // Ia.p
        public final Object invoke(Object obj, kotlin.coroutines.c<? super p293xa.r> cVar) {
            return ((AnonymousClass1) create((kotlin.sequences.i) obj, cVar)).invokeSuspend(p293xa.r.f47939a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.sequences.i iVar;
            Object[] objArr;
            long[] jArr;
            int i10;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            int i11 = this.label;
            if (i11 == 0) {
                kotlin.b.b(obj);
                iVar = (kotlin.sequences.i) this.L$0;
                J j = this.this$0.f9117b;
                objArr = j.f9111b;
                jArr = j.f9112c;
                i10 = j.f9114e;
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i10 = this.I$0;
                jArr = (long[]) this.L$2;
                objArr = (Object[]) this.L$1;
                iVar = (kotlin.sequences.i) this.L$0;
                kotlin.b.b(obj);
            }
            if (i10 == Integer.MAX_VALUE) {
                return p293xa.r.f47939a;
            }
            int i12 = (int) ((jArr[i10] >> 31) & 2147483647L);
            Object obj2 = objArr[i10];
            this.L$0 = iVar;
            this.L$1 = objArr;
            this.L$2 = jArr;
            this.I$0 = i12;
            this.label = 1;
            iVar.a(obj2, this);
            return coroutineSingletons;
        }
    }

    public OrderedSetWrapper(J parent) {
        kotlin.jvm.internal.i.e(parent, "parent");
        this.f9117b = parent;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean add(E e10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f9117b.a(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection<? extends Object> elements) {
        kotlin.jvm.internal.i.e(elements, "elements");
        Iterator<T> it = elements.iterator();
        while (it.hasNext()) {
            if (!this.f9117b.a(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return kotlin.jvm.internal.i.a(this.f9117b, ((OrderedSetWrapper) obj).f9117b);
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        return this.f9117b.hashCode();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f9117b.f9116g == 0;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public Iterator<E> iterator() {
        return C1787c0.n(new AnonymousClass1(this, null));
    }

    @Override // java.util.Set, java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f9117b.f9116g;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return kotlin.jvm.internal.d.a(this);
    }

    public final String toString() {
        return this.f9117b.toString();
    }

    @Override // java.util.Set, java.util.Collection
    public final <T> T[] toArray(T[] array) {
        kotlin.jvm.internal.i.e(array, "array");
        return (T[]) kotlin.jvm.internal.d.b(this, array);
    }
}
