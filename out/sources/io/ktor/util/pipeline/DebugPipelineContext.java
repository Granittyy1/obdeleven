package io.ktor.util.pipeline;

import Ia.q;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.i;
import p293xa.r;

/* JADX INFO: compiled from: DebugPipelineContext.kt */
/* JADX INFO: loaded from: classes.dex */
public final class DebugPipelineContext<TSubject, TContext> extends c<TSubject, TContext> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<q<c<TSubject, TContext>, TSubject, kotlin.coroutines.c<? super r>, Object>> f40548c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final kotlin.coroutines.e f40549d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TSubject f40550e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f40551f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DebugPipelineContext(TContext context, List<? extends q<? super c<TSubject, TContext>, ? super TSubject, ? super kotlin.coroutines.c<? super r>, ? extends Object>> interceptors, TSubject subject, kotlin.coroutines.e eVar) {
        super(context);
        i.e(context, "context");
        i.e(interceptors, "interceptors");
        i.e(subject, "subject");
        this.f40548c = interceptors;
        this.f40549d = eVar;
        this.f40550e = subject;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.ktor.util.pipeline.c
    public final Object a(Object obj, ContinuationImpl continuationImpl) {
        this.f40551f = 0;
        i.e(obj, "<set-?>");
        this.f40550e = obj;
        return c(continuationImpl);
    }

    @Override // io.ktor.util.pipeline.c
    public final TSubject b() {
        return this.f40550e;
    }

    @Override // io.ktor.util.pipeline.c
    public final Object c(kotlin.coroutines.c<? super TSubject> cVar) {
        int i10 = this.f40551f;
        if (i10 < 0) {
            return this.f40550e;
        }
        if (i10 < this.f40548c.size()) {
            return e(cVar);
        }
        this.f40551f = -1;
        return this.f40550e;
    }

    @Override // io.ktor.util.pipeline.c
    public final Object d(TSubject tsubject, kotlin.coroutines.c<? super TSubject> cVar) {
        i.e(tsubject, "<set-?>");
        this.f40550e = tsubject;
        return c(cVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(kotlin.coroutines.c<? super TSubject> cVar) {
        DebugPipelineContext$proceedLoop$1 debugPipelineContext$proceedLoop$1;
        DebugPipelineContext<TSubject, TContext> debugPipelineContext;
        q<c<TSubject, TContext>, TSubject, kotlin.coroutines.c<? super r>, Object> qVar;
        TSubject tsubject;
        if (cVar instanceof DebugPipelineContext$proceedLoop$1) {
            debugPipelineContext$proceedLoop$1 = (DebugPipelineContext$proceedLoop$1) cVar;
            int i10 = debugPipelineContext$proceedLoop$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                debugPipelineContext$proceedLoop$1.label = i10 - Integer.MIN_VALUE;
            } else {
                debugPipelineContext$proceedLoop$1 = new DebugPipelineContext$proceedLoop$1(this, cVar);
            }
        } else {
            debugPipelineContext$proceedLoop$1 = new DebugPipelineContext$proceedLoop$1(this, cVar);
        }
        Object obj = debugPipelineContext$proceedLoop$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = debugPipelineContext$proceedLoop$1.label;
        if (i11 == 0) {
            kotlin.b.b(obj);
            debugPipelineContext = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            debugPipelineContext = (DebugPipelineContext) debugPipelineContext$proceedLoop$1.L$0;
            kotlin.b.b(obj);
        }
        do {
            int i12 = debugPipelineContext.f40551f;
            if (i12 != -1) {
                List<q<c<TSubject, TContext>, TSubject, kotlin.coroutines.c<? super r>, Object>> list = debugPipelineContext.f40548c;
                if (i12 >= list.size()) {
                    debugPipelineContext.f40551f = -1;
                } else {
                    qVar = list.get(i12);
                    debugPipelineContext.f40551f = i12 + 1;
                    i.c(qVar, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.coroutines.SuspendFunction2<io.ktor.util.pipeline.PipelineContext<TSubject of io.ktor.util.pipeline.DebugPipelineContext, TContext of io.ktor.util.pipeline.DebugPipelineContext>, TSubject of io.ktor.util.pipeline.DebugPipelineContext, kotlin.Unit>{ io.ktor.util.pipeline.PipelineKt.PipelineInterceptor<TSubject of io.ktor.util.pipeline.DebugPipelineContext, TContext of io.ktor.util.pipeline.DebugPipelineContext> }");
                    tsubject = debugPipelineContext.f40550e;
                    debugPipelineContext$proceedLoop$1.L$0 = debugPipelineContext;
                    debugPipelineContext$proceedLoop$1.label = 1;
                }
            }
            return debugPipelineContext.f40550e;
        } while (qVar.invoke(debugPipelineContext, tsubject, debugPipelineContext$proceedLoop$1) != coroutineSingletons);
        return coroutineSingletons;
    }

    @Override // kotlinx.coroutines.A
    public final kotlin.coroutines.e getCoroutineContext() {
        return this.f40549d;
    }
}
