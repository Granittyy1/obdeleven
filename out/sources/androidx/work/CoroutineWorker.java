package androidx.work;

import android.content.Context;
import androidx.appcompat.widget.e0;
import androidx.work.impl.utils.futures.AbstractFuture;
import java.util.concurrent.ExecutionException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.A;
import kotlinx.coroutines.AbstractC2712w;
import kotlinx.coroutines.B;
import kotlinx.coroutines.C2680e;
import kotlinx.coroutines.C2693i;
import kotlinx.coroutines.C2700k0;
import kotlinx.coroutines.C2702l0;
import kotlinx.coroutines.InterfaceC2707q;
import kotlinx.coroutines.N;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: CoroutineWorker.kt */
/* JADX INFO: loaded from: classes.dex */
public abstract class CoroutineWorker extends j {
    private final AbstractC2712w coroutineContext;
    private final androidx.work.impl.utils.futures.a<j.a> future;
    private final InterfaceC2707q job;

    /* JADX INFO: renamed from: androidx.work.CoroutineWorker$getForegroundInfoAsync$1, reason: invalid class name */
    /* JADX INFO: compiled from: CoroutineWorker.kt */
    @Aa.c(c = "androidx.work.CoroutineWorker$getForegroundInfoAsync$1", f = "CoroutineWorker.kt", l = {134}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends SuspendLambda implements Ia.p<A, kotlin.coroutines.c<? super p293xa.r>, Object> {
        final /* synthetic */ h<e> $jobFuture;
        Object L$0;
        int label;
        final /* synthetic */ CoroutineWorker this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(h<e> hVar, CoroutineWorker coroutineWorker, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.$jobFuture = hVar;
            this.this$0 = coroutineWorker;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
            return new AnonymousClass1(this.$jobFuture, this.this$0, cVar);
        }

        @Override // Ia.p
        public final Object invoke(A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
            return ((AnonymousClass1) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            h<e> hVar;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            int i10 = this.label;
            if (i10 == 0) {
                kotlin.b.b(obj);
                h<e> hVar2 = this.$jobFuture;
                CoroutineWorker coroutineWorker = this.this$0;
                this.L$0 = hVar2;
                this.label = 1;
                Object foregroundInfo = coroutineWorker.getForegroundInfo(this);
                if (foregroundInfo == coroutineSingletons) {
                    return coroutineSingletons;
                }
                hVar = hVar2;
                obj = foregroundInfo;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                hVar = (h) this.L$0;
                kotlin.b.b(obj);
            }
            hVar.f20359b.k((R) obj);
            return p293xa.r.f47939a;
        }
    }

    /* JADX INFO: renamed from: androidx.work.CoroutineWorker$startWork$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: CoroutineWorker.kt */
    @Aa.c(c = "androidx.work.CoroutineWorker$startWork$1", f = "CoroutineWorker.kt", l = {R.styleable.AppCompatTheme_editTextBackground}, m = "invokeSuspend")
    public static final class C14541 extends SuspendLambda implements Ia.p<A, kotlin.coroutines.c<? super p293xa.r>, Object> {
        int label;

        public C14541(kotlin.coroutines.c<? super C14541> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
            return CoroutineWorker.this.new C14541(cVar);
        }

        @Override // Ia.p
        public final Object invoke(A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
            return ((C14541) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            int i10 = this.label;
            try {
                if (i10 == 0) {
                    kotlin.b.b(obj);
                    CoroutineWorker coroutineWorker = CoroutineWorker.this;
                    this.label = 1;
                    obj = coroutineWorker.doWork(this);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.b.b(obj);
                }
                CoroutineWorker.this.getFuture$work_runtime_release().k((j.a) obj);
            } catch (Throwable th) {
                CoroutineWorker.this.getFuture$work_runtime_release().l(th);
            }
            return p293xa.r.f47939a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutineWorker(Context appContext, WorkerParameters params) {
        super(appContext, params);
        kotlin.jvm.internal.i.e(appContext, "appContext");
        kotlin.jvm.internal.i.e(params, "params");
        this.job = C2702l0.a();
        androidx.work.impl.utils.futures.a<j.a> aVar = new androidx.work.impl.utils.futures.a<>();
        this.future = aVar;
        aVar.a(new e0(2, this), getTaskExecutor().c());
        this.coroutineContext = N.f43198a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(CoroutineWorker this$0) {
        kotlin.jvm.internal.i.e(this$0, "this$0");
        if (this$0.future.f20427b instanceof AbstractFuture.b) {
            this$0.job.i(null);
        }
    }

    public static /* synthetic */ Object getForegroundInfo$suspendImpl(CoroutineWorker coroutineWorker, kotlin.coroutines.c<? super e> cVar) {
        throw new IllegalStateException("Not implemented");
    }

    public abstract Object doWork(kotlin.coroutines.c<? super j.a> cVar);

    public AbstractC2712w getCoroutineContext() {
        return this.coroutineContext;
    }

    public Object getForegroundInfo(kotlin.coroutines.c<? super e> cVar) {
        return getForegroundInfo$suspendImpl(this, cVar);
    }

    @Override // androidx.work.j
    public final p107i6.f<e> getForegroundInfoAsync() {
        C2700k0 c2700k0A = C2702l0.a();
        kotlinx.coroutines.internal.f fVarA = B.a(getCoroutineContext().plus(c2700k0A));
        h hVar = new h(c2700k0A);
        C2680e.c(fVarA, null, null, new AnonymousClass1(hVar, this, null), 3);
        return hVar;
    }

    public final androidx.work.impl.utils.futures.a<j.a> getFuture$work_runtime_release() {
        return this.future;
    }

    public final InterfaceC2707q getJob$work_runtime_release() {
        return this.job;
    }

    @Override // androidx.work.j
    public final void onStopped() {
        super.onStopped();
        this.future.cancel(false);
    }

    public final Object setForeground(e eVar, kotlin.coroutines.c<? super p293xa.r> cVar) throws Throwable {
        p107i6.f<Void> foregroundAsync = setForegroundAsync(eVar);
        kotlin.jvm.internal.i.d(foregroundAsync, "setForegroundAsync(foregroundInfo)");
        if (foregroundAsync.isDone()) {
            try {
                foregroundAsync.get();
            } catch (ExecutionException e10) {
                Throwable cause = e10.getCause();
                if (cause == null) {
                    throw e10;
                }
                throw cause;
            }
        } else {
            C2693i c2693i = new C2693i(1, A8.p.y(cVar));
            c2693i.s();
            foregroundAsync.a(new i(c2693i, foregroundAsync), DirectExecutor.f20290b);
            c2693i.u(new ListenableFutureKt$await$2$2(foregroundAsync));
            Object objP = c2693i.p();
            if (objP == CoroutineSingletons.f43038b) {
                return objP;
            }
        }
        return p293xa.r.f47939a;
    }

    public final Object setProgress(d dVar, kotlin.coroutines.c<? super p293xa.r> cVar) throws Throwable {
        p107i6.f<Void> progressAsync = setProgressAsync(dVar);
        kotlin.jvm.internal.i.d(progressAsync, "setProgressAsync(data)");
        if (progressAsync.isDone()) {
            try {
                progressAsync.get();
            } catch (ExecutionException e10) {
                Throwable cause = e10.getCause();
                if (cause == null) {
                    throw e10;
                }
                throw cause;
            }
        } else {
            C2693i c2693i = new C2693i(1, A8.p.y(cVar));
            c2693i.s();
            progressAsync.a(new i(c2693i, progressAsync), DirectExecutor.f20290b);
            c2693i.u(new ListenableFutureKt$await$2$2(progressAsync));
            Object objP = c2693i.p();
            if (objP == CoroutineSingletons.f43038b) {
                return objP;
            }
        }
        return p293xa.r.f47939a;
    }

    @Override // androidx.work.j
    public final p107i6.f<j.a> startWork() {
        C2680e.c(B.a(getCoroutineContext().plus(this.job)), null, null, new C14541(null), 3);
        return this.future;
    }

    @p293xa.d
    public static /* synthetic */ void getCoroutineContext$annotations() {
    }
}
