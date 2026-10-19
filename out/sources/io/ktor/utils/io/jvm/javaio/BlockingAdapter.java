package io.ktor.utils.io.jvm.javaio;

import Ia.l;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.D0;
import kotlinx.coroutines.InterfaceC2694i0;
import kotlinx.coroutines.P;
import kotlinx.coroutines.U;
import p293xa.r;

/* JADX INFO: compiled from: Blocking.kt */
/* JADX INFO: loaded from: classes.dex */
public abstract class BlockingAdapter {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f40633f = AtomicReferenceFieldUpdater.newUpdater(BlockingAdapter.class, Object.class, "state");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC2694i0 f40634a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f40635b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final P f40636c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f40637d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f40638e;
    volatile /* synthetic */ int result;
    volatile /* synthetic */ Object state;

    /* JADX INFO: compiled from: Blocking.kt */
    public static final class a implements kotlin.coroutines.c<r> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final kotlin.coroutines.e f40639b;

        public a() {
            InterfaceC2694i0 interfaceC2694i0 = BlockingAdapter.this.f40634a;
            this.f40639b = interfaceC2694i0 != null ? g.f40651c.plus(interfaceC2694i0) : g.f40651c;
        }

        @Override // kotlin.coroutines.c
        public final kotlin.coroutines.e getContext() {
            return this.f40639b;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.c
        public final void resumeWith(Object obj) {
            Object obj2;
            boolean z10;
            boolean z11;
            Throwable thA;
            InterfaceC2694i0 interfaceC2694i0;
            Object objA = Result.a(obj);
            if (objA == null) {
                objA = r.f47939a;
            }
            BlockingAdapter blockingAdapter = BlockingAdapter.this;
            do {
                obj2 = blockingAdapter.state;
                z10 = obj2 instanceof Thread;
                z11 = true;
                if (!(z10 ? true : obj2 instanceof kotlin.coroutines.c ? true : i.a(obj2, this))) {
                    return;
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = BlockingAdapter.f40633f;
                while (!atomicReferenceFieldUpdater.compareAndSet(blockingAdapter, obj2, objA)) {
                    if (atomicReferenceFieldUpdater.get(blockingAdapter) != obj2) {
                        z11 = false;
                        break;
                    }
                }
            } while (!z11);
            if (z10) {
                d.a().b(obj2);
            } else if ((obj2 instanceof kotlin.coroutines.c) && (thA = Result.a(obj)) != null) {
                ((kotlin.coroutines.c) obj2).resumeWith(kotlin.b.a(thA));
            }
            if ((obj instanceof Result.Failure) && !(Result.a(obj) instanceof CancellationException) && (interfaceC2694i0 = BlockingAdapter.this.f40634a) != null) {
                interfaceC2694i0.i(null);
            }
            P p10 = BlockingAdapter.this.f40636c;
            if (p10 != null) {
                p10.dispose();
            }
        }
    }

    public BlockingAdapter() {
        this(null);
    }

    public abstract Object a(ContinuationImpl continuationImpl);

    public final int b(byte[] buffer, int i10, int i11) throws Throwable {
        Object noWhenBranchMatchedException;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        i.e(buffer, "buffer");
        this.f40637d = i10;
        this.f40638e = i11;
        Thread thread = Thread.currentThread();
        kotlin.coroutines.c cVar = null;
        while (true) {
            Object obj = this.state;
            if (obj instanceof kotlin.coroutines.c) {
                i.c(obj, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any>");
                cVar = (kotlin.coroutines.c) obj;
                noWhenBranchMatchedException = thread;
            } else {
                if (obj instanceof r) {
                    return this.result;
                }
                if (obj instanceof Throwable) {
                    throw ((Throwable) obj);
                }
                if (obj instanceof Thread) {
                    throw new IllegalStateException("There is already thread owning adapter");
                }
                if (i.a(obj, this)) {
                    throw new IllegalStateException("Not yet started");
                }
                noWhenBranchMatchedException = new NoWhenBranchMatchedException();
            }
            i.d(noWhenBranchMatchedException, "when (value) {\n         …Exception()\n            }");
            do {
                atomicReferenceFieldUpdater = f40633f;
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj, noWhenBranchMatchedException)) {
                    i.b(cVar);
                    cVar.resumeWith(buffer);
                    i.d(thread, "thread");
                    if (this.state == thread) {
                        if (d.a() == e.f40650a) {
                            ((cc.b) BlockingKt.f40641a.getValue()).a("Blocking network thread detected. \nIt can possible lead to a performance decline or even a deadlock.\nPlease make sure you're using blocking IO primitives like InputStream and OutputStream only in \nthe context of Dispatchers.IO:\n```\nwithContext(Dispatchers.IO) {\n    myInputStream.read()\n}\n```");
                        }
                        while (true) {
                            U u10 = D0.f43172a.get();
                            long jH1 = u10 != null ? u10.h1() : Long.MAX_VALUE;
                            if (this.state != thread) {
                                break;
                            }
                            if (jH1 > 0) {
                                d.a().a(jH1);
                            }
                        }
                    }
                    Object obj2 = this.state;
                    if (obj2 instanceof Throwable) {
                        throw ((Throwable) obj2);
                    }
                    return this.result;
                }
            } while (atomicReferenceFieldUpdater.get(this) == obj);
        }
    }

    public BlockingAdapter(InterfaceC2694i0 interfaceC2694i0) {
        this.f40634a = interfaceC2694i0;
        a aVar = new a();
        this.f40635b = aVar;
        this.state = this;
        this.result = 0;
        this.f40636c = interfaceC2694i0 != null ? interfaceC2694i0.B(new l<Throwable, r>() { // from class: io.ktor.utils.io.jvm.javaio.BlockingAdapter$disposable$1
            {
                super(1);
            }

            @Override // Ia.l
            public final r invoke(Throwable th) {
                Throwable th2 = th;
                if (th2 != null) {
                    this.this$0.f40635b.resumeWith(kotlin.b.a(th2));
                }
                return r.f47939a;
            }
        }) : null;
        BlockingAdapter$block$1 blockingAdapter$block$1 = new BlockingAdapter$block$1(this, null);
        o.d(1, blockingAdapter$block$1);
        blockingAdapter$block$1.invoke(aVar);
        if (this.state == this) {
            throw new IllegalArgumentException("Failed requirement.");
        }
    }
}
