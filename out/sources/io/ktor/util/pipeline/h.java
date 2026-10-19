package io.ktor.util.pipeline;

import A8.p;
import Ia.q;
import io.ktor.utils.io.ExceptionUtilsJvmKt;
import java.util.List;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.i;
import p293xa.r;

/* JADX INFO: compiled from: SuspendFunctionGun.kt */
/* JADX INFO: loaded from: classes.dex */
public final class h<TSubject, TContext> extends c<TSubject, TContext> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<q<c<TSubject, TContext>, TSubject, kotlin.coroutines.c<? super r>, Object>> f40567c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a f40568d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TSubject f40569e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final kotlin.coroutines.c<TSubject>[] f40570f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f40571g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f40572h;

    /* JADX INFO: compiled from: SuspendFunctionGun.kt */
    public static final class a implements kotlin.coroutines.c<r>, Aa.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f40573b = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ h<TSubject, TContext> f40574c;

        public a(h<TSubject, TContext> hVar) {
            this.f40574c = hVar;
        }

        @Override // Aa.b
        public final Aa.b getCallerFrame() {
            kotlin.coroutines.c<TSubject> cVar = g.f40566b;
            int i10 = this.f40573b;
            h<TSubject, TContext> hVar = this.f40574c;
            if (i10 == Integer.MIN_VALUE) {
                this.f40573b = hVar.f40571g;
            }
            int i11 = this.f40573b;
            if (i11 < 0) {
                this.f40573b = Integer.MIN_VALUE;
                cVar = null;
            } else {
                try {
                    kotlin.coroutines.c<TSubject> cVar2 = hVar.f40570f[i11];
                    if (cVar2 != null) {
                        this.f40573b = i11 - 1;
                        cVar = cVar2;
                    }
                } catch (Throwable unused) {
                }
            }
            if (cVar instanceof Aa.b) {
                return (Aa.b) cVar;
            }
            return null;
        }

        @Override // kotlin.coroutines.c
        public final kotlin.coroutines.e getContext() {
            kotlin.coroutines.e context;
            h<TSubject, TContext> hVar = this.f40574c;
            kotlin.coroutines.c<TSubject> cVar = hVar.f40570f[hVar.f40571g];
            if (cVar == null || (context = cVar.getContext()) == null) {
                throw new IllegalStateException("Not started");
            }
            return context;
        }

        @Override // kotlin.coroutines.c
        public final void resumeWith(Object obj) {
            boolean z10 = obj instanceof Result.Failure;
            h<TSubject, TContext> hVar = this.f40574c;
            if (!z10) {
                hVar.e(false);
                return;
            }
            Throwable thA = Result.a(obj);
            i.b(thA);
            hVar.f(kotlin.b.a(thA));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public h(TSubject initial, TContext context, List<? extends q<? super c<TSubject, TContext>, ? super TSubject, ? super kotlin.coroutines.c<? super r>, ? extends Object>> blocks) {
        super(context);
        i.e(initial, "initial");
        i.e(context, "context");
        i.e(blocks, "blocks");
        this.f40567c = blocks;
        this.f40568d = new a(this);
        this.f40569e = initial;
        this.f40570f = new kotlin.coroutines.c[blocks.size()];
        this.f40571g = -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.ktor.util.pipeline.c
    public final Object a(Object obj, ContinuationImpl continuationImpl) {
        this.f40572h = 0;
        if (this.f40567c.size() == 0) {
            return obj;
        }
        i.e(obj, "<set-?>");
        this.f40569e = obj;
        if (this.f40571g < 0) {
            return c(continuationImpl);
        }
        throw new IllegalStateException("Already started");
    }

    @Override // io.ktor.util.pipeline.c
    public final TSubject b() {
        return this.f40569e;
    }

    @Override // io.ktor.util.pipeline.c
    public final Object c(kotlin.coroutines.c<? super TSubject> frame) {
        Object obj;
        if (this.f40572h == this.f40567c.size()) {
            obj = this.f40569e;
        } else {
            kotlin.coroutines.c<TSubject> cVarY = p.y(frame);
            int i10 = this.f40571g + 1;
            this.f40571g = i10;
            kotlin.coroutines.c<TSubject>[] cVarArr = this.f40570f;
            cVarArr[i10] = cVarY;
            if (e(true)) {
                int i11 = this.f40571g;
                if (i11 < 0) {
                    throw new IllegalStateException("No more continuations to resume");
                }
                this.f40571g = i11 - 1;
                cVarArr[i11] = null;
                obj = this.f40569e;
            } else {
                obj = CoroutineSingletons.f43038b;
            }
        }
        if (obj == CoroutineSingletons.f43038b) {
            i.e(frame, "frame");
        }
        return obj;
    }

    @Override // io.ktor.util.pipeline.c
    public final Object d(TSubject tsubject, kotlin.coroutines.c<? super TSubject> cVar) {
        i.e(tsubject, "<set-?>");
        this.f40569e = tsubject;
        return c(cVar);
    }

    public final boolean e(boolean z10) {
        int i10;
        List<q<c<TSubject, TContext>, TSubject, kotlin.coroutines.c<? super r>, Object>> list;
        do {
            i10 = this.f40572h;
            list = this.f40567c;
            if (i10 == list.size()) {
                if (z10) {
                    return true;
                }
                f(this.f40569e);
                return false;
            }
            this.f40572h = i10 + 1;
            try {
            } catch (Throwable th) {
                f(kotlin.b.a(th));
                return false;
            }
        } while (list.get(i10).invoke(this, this.f40569e, this.f40568d) != CoroutineSingletons.f43038b);
        return false;
    }

    public final void f(Object obj) {
        Throwable thB;
        int i10 = this.f40571g;
        if (i10 < 0) {
            throw new IllegalStateException("No more continuations to resume");
        }
        kotlin.coroutines.c<TSubject>[] cVarArr = this.f40570f;
        kotlin.coroutines.c<TSubject> cVar = cVarArr[i10];
        i.b(cVar);
        int i11 = this.f40571g;
        this.f40571g = i11 - 1;
        cVarArr[i11] = null;
        if (!(obj instanceof Result.Failure)) {
            cVar.resumeWith(obj);
            return;
        }
        Throwable thA = Result.a(obj);
        i.b(thA);
        try {
            Throwable cause = thA.getCause();
            if (cause != null && !i.a(thA.getCause(), cause) && (thB = ExceptionUtilsJvmKt.b(thA, cause)) != null) {
                thB.setStackTrace(thA.getStackTrace());
                thA = thB;
            }
        } catch (Throwable unused) {
        }
        cVar.resumeWith(kotlin.b.a(thA));
    }

    @Override // kotlinx.coroutines.A
    public final kotlin.coroutines.e getCoroutineContext() {
        return this.f40568d.getContext();
    }
}
