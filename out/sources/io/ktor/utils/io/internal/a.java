package io.ktor.utils.io.internal;

import Ia.l;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Result;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.i;
import kotlinx.coroutines.InterfaceC2694i0;
import kotlinx.coroutines.P;
import p293xa.r;

/* JADX INFO: compiled from: CancellableReusableContinuation.kt */
/* JADX INFO: loaded from: classes.dex */
public final class a<T> implements kotlin.coroutines.c<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f40602b = AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "state");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f40603c = AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "jobCancellationHandler");
    private volatile /* synthetic */ Object state = null;
    private volatile /* synthetic */ Object jobCancellationHandler = null;

    /* JADX INFO: renamed from: io.ktor.utils.io.internal.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: CancellableReusableContinuation.kt */
    public final class C0458a implements l<Throwable, r> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final InterfaceC2694i0 f40604b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public P f40605c;

        public C0458a(InterfaceC2694i0 interfaceC2694i0) {
            this.f40604b = interfaceC2694i0;
            P pF0 = interfaceC2694i0.f0(true, true, this);
            if (interfaceC2694i0.c()) {
                this.f40605c = pF0;
            }
        }

        public final void a() {
            P p10 = this.f40605c;
            if (p10 != null) {
                this.f40605c = null;
                p10.dispose();
            }
        }

        @Override // Ia.l
        public final r invoke(Throwable th) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
            Throwable th2 = th;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = a.f40602b;
            a<T> aVar = a.this;
            aVar.getClass();
            do {
                atomicReferenceFieldUpdater = a.f40603c;
                if (atomicReferenceFieldUpdater.compareAndSet(aVar, this, null)) {
                    break;
                }
            } while (atomicReferenceFieldUpdater.get(aVar) == this);
            a();
            if (th2 != null) {
                a.a(aVar, this.f40604b, th2);
            }
            return r.f47939a;
        }
    }

    public static final void a(a aVar, InterfaceC2694i0 interfaceC2694i0, Throwable th) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        while (true) {
            Object obj = aVar.state;
            if (!(obj instanceof kotlin.coroutines.c)) {
                return;
            }
            kotlin.coroutines.c cVar = (kotlin.coroutines.c) obj;
            if (cVar.getContext().get(InterfaceC2694i0.b.f43449b) != interfaceC2694i0) {
                return;
            }
            do {
                atomicReferenceFieldUpdater = f40602b;
                if (atomicReferenceFieldUpdater.compareAndSet(aVar, obj, null)) {
                    i.c(obj, "null cannot be cast to non-null type kotlin.coroutines.Continuation<T of io.ktor.utils.io.internal.CancellableReusableContinuation>");
                    cVar.resumeWith(kotlin.b.a(th));
                    return;
                }
            } while (atomicReferenceFieldUpdater.get(aVar) == obj);
        }
    }

    public final void b(Throwable cause) {
        i.e(cause, "cause");
        resumeWith(kotlin.b.a(cause));
        C0458a c0458a = (C0458a) f40603c.getAndSet(this, null);
        if (c0458a != null) {
            c0458a.a();
        }
    }

    public final Object d(kotlin.coroutines.c<? super T> cVar) {
        while (true) {
            Object obj = this.state;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f40602b;
            if (obj == null) {
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, null, cVar)) {
                        InterfaceC2694i0 interfaceC2694i0 = (InterfaceC2694i0) cVar.getContext().get(InterfaceC2694i0.b.f43449b);
                        C0458a c0458a = (C0458a) this.jobCancellationHandler;
                        if ((c0458a != null ? c0458a.f40604b : null) != interfaceC2694i0) {
                            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f40603c;
                            if (interfaceC2694i0 == null) {
                                C0458a c0458a2 = (C0458a) atomicReferenceFieldUpdater2.getAndSet(this, null);
                                if (c0458a2 != null) {
                                    c0458a2.a();
                                }
                            } else {
                                C0458a c0458a3 = new C0458a(interfaceC2694i0);
                                loop3: while (true) {
                                    Object obj2 = this.jobCancellationHandler;
                                    C0458a c0458a4 = (C0458a) obj2;
                                    if (c0458a4 != null && c0458a4.f40604b == interfaceC2694i0) {
                                        c0458a3.a();
                                        break;
                                    }
                                    do {
                                        if (atomicReferenceFieldUpdater2.compareAndSet(this, obj2, c0458a3)) {
                                            if (c0458a4 == null) {
                                                break loop3;
                                            }
                                            c0458a4.a();
                                            break loop3;
                                        }
                                    } while (atomicReferenceFieldUpdater2.get(this) == obj2);
                                }
                            }
                        }
                        return CoroutineSingletons.f43038b;
                    }
                } while (atomicReferenceFieldUpdater.get(this) == null);
            } else {
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, obj, null)) {
                        if (obj instanceof Throwable) {
                            throw ((Throwable) obj);
                        }
                        return obj;
                    }
                } while (atomicReferenceFieldUpdater.get(this) == obj);
            }
        }
    }

    @Override // kotlin.coroutines.c
    public final kotlin.coroutines.e getContext() {
        kotlin.coroutines.e context;
        Object obj = this.state;
        kotlin.coroutines.c cVar = obj instanceof kotlin.coroutines.c ? (kotlin.coroutines.c) obj : null;
        return (cVar == null || (context = cVar.getContext()) == null) ? EmptyCoroutineContext.f43032b : context;
    }

    @Override // kotlin.coroutines.c
    public final void resumeWith(Object obj) {
        Object objA;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        while (true) {
            Object obj2 = this.state;
            if (obj2 == null) {
                objA = Result.a(obj);
                if (objA == null) {
                    kotlin.b.b(obj);
                    objA = obj;
                }
            } else if (!(obj2 instanceof kotlin.coroutines.c)) {
                return;
            } else {
                objA = null;
            }
            do {
                atomicReferenceFieldUpdater = f40602b;
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj2, objA)) {
                    if (obj2 instanceof kotlin.coroutines.c) {
                        ((kotlin.coroutines.c) obj2).resumeWith(obj);
                        return;
                    }
                    return;
                }
            } while (atomicReferenceFieldUpdater.get(this) == obj2);
        }
    }
}
