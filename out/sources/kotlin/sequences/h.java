package kotlin.sequences;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import p293xa.r;

/* JADX INFO: compiled from: SequenceBuilder.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class h<T> extends i<T> implements Iterator<T>, kotlin.coroutines.c<r>, Ja.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f43098b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public T f43099c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Iterator<? extends T> f43100d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public kotlin.coroutines.c<? super r> f43101e;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.sequences.i
    public final void a(Object obj, kotlin.coroutines.c frame) {
        this.f43099c = obj;
        this.f43098b = 3;
        this.f43101e = frame;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        kotlin.jvm.internal.i.e(frame, "frame");
    }

    @Override // kotlin.sequences.i
    public final Object b(Iterator<? extends T> it, kotlin.coroutines.c<? super r> cVar) {
        if (!it.hasNext()) {
            return r.f47939a;
        }
        this.f43100d = it;
        this.f43098b = 2;
        this.f43101e = cVar;
        return CoroutineSingletons.f43038b;
    }

    public final RuntimeException e() {
        int i10 = this.f43098b;
        if (i10 == 4) {
            return new NoSuchElementException();
        }
        if (i10 == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.f43098b);
    }

    @Override // kotlin.coroutines.c
    public final kotlin.coroutines.e getContext() {
        return EmptyCoroutineContext.f43032b;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        while (true) {
            int i10 = this.f43098b;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2 || i10 == 3) {
                        return true;
                    }
                    if (i10 == 4) {
                        return false;
                    }
                    throw e();
                }
                Iterator<? extends T> it = this.f43100d;
                kotlin.jvm.internal.i.b(it);
                if (it.hasNext()) {
                    this.f43098b = 2;
                    return true;
                }
                this.f43100d = null;
            }
            this.f43098b = 5;
            kotlin.coroutines.c<? super r> cVar = this.f43101e;
            kotlin.jvm.internal.i.b(cVar);
            this.f43101e = null;
            cVar.resumeWith(r.f47939a);
        }
    }

    @Override // java.util.Iterator
    public final T next() {
        int i10 = this.f43098b;
        if (i10 == 0 || i10 == 1) {
            if (hasNext()) {
                return next();
            }
            throw new NoSuchElementException();
        }
        if (i10 == 2) {
            this.f43098b = 1;
            Iterator<? extends T> it = this.f43100d;
            kotlin.jvm.internal.i.b(it);
            return it.next();
        }
        if (i10 != 3) {
            throw e();
        }
        this.f43098b = 0;
        T t8 = this.f43099c;
        this.f43099c = null;
        return t8;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // kotlin.coroutines.c
    public final void resumeWith(Object obj) {
        kotlin.b.b(obj);
        this.f43098b = 4;
    }
}
