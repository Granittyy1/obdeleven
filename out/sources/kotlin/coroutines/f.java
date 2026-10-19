package kotlin.coroutines;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* JADX INFO: compiled from: SafeContinuationJvm.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class f<T> implements c<T>, Aa.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater<f<?>, Object> f43036c = AtomicReferenceFieldUpdater.newUpdater(f.class, Object.class, "result");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c<T> f43037b;
    private volatile Object result;

    public f() {
        throw null;
    }

    public f(c cVar, CoroutineSingletons coroutineSingletons) {
        this.f43037b = cVar;
        this.result = coroutineSingletons;
    }

    public final Object a() throws Throwable {
        Object obj = this.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43039c;
        if (obj == coroutineSingletons) {
            AtomicReferenceFieldUpdater<f<?>, Object> atomicReferenceFieldUpdater = f43036c;
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.f43038b;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, coroutineSingletons, coroutineSingletons2)) {
                if (atomicReferenceFieldUpdater.get(this) != coroutineSingletons) {
                    obj = this.result;
                }
            }
            return CoroutineSingletons.f43038b;
        }
        if (obj == CoroutineSingletons.f43040d) {
            return CoroutineSingletons.f43038b;
        }
        if (obj instanceof Result.Failure) {
            throw ((Result.Failure) obj).exception;
        }
        return obj;
    }

    @Override // Aa.b
    public final Aa.b getCallerFrame() {
        c<T> cVar = this.f43037b;
        if (cVar instanceof Aa.b) {
            return (Aa.b) cVar;
        }
        return null;
    }

    @Override // kotlin.coroutines.c
    public final e getContext() {
        return this.f43037b.getContext();
    }

    @Override // kotlin.coroutines.c
    public final void resumeWith(Object obj) {
        while (true) {
            Object obj2 = this.result;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43039c;
            if (obj2 == coroutineSingletons) {
                AtomicReferenceFieldUpdater<f<?>, Object> atomicReferenceFieldUpdater = f43036c;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, coroutineSingletons, obj)) {
                    if (atomicReferenceFieldUpdater.get(this) != coroutineSingletons) {
                    }
                }
                return;
            }
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.f43038b;
            if (obj2 != coroutineSingletons2) {
                throw new IllegalStateException("Already resumed");
            }
            AtomicReferenceFieldUpdater<f<?>, Object> atomicReferenceFieldUpdater2 = f43036c;
            CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.f43040d;
            do {
                if (atomicReferenceFieldUpdater2.compareAndSet(this, coroutineSingletons2, coroutineSingletons3)) {
                    this.f43037b.resumeWith(obj);
                    return;
                }
            } while (atomicReferenceFieldUpdater2.get(this) == coroutineSingletons2);
        }
    }

    public final String toString() {
        return "SafeContinuation for " + this.f43037b;
    }
}
