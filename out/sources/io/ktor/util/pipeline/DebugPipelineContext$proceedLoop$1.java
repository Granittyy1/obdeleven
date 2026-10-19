package io.ktor.util.pipeline;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: DebugPipelineContext.kt */
/* JADX INFO: loaded from: classes.dex */
@Aa.c(c = "io.ktor.util.pipeline.DebugPipelineContext", f = "DebugPipelineContext.kt", l = {R.styleable.AppCompatTheme_listPreferredItemHeightLarge}, m = "proceedLoop")
public final class DebugPipelineContext$proceedLoop$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DebugPipelineContext<TSubject, TContext> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DebugPipelineContext$proceedLoop$1(DebugPipelineContext<TSubject, TContext> debugPipelineContext, kotlin.coroutines.c<? super DebugPipelineContext$proceedLoop$1> cVar) {
        super(cVar);
        this.this$0 = debugPipelineContext;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type kotlin.coroutines.c to io.ktor.util.pipeline.DebugPipelineContext$proceedLoop$1 for r1v1 'this'  kotlin.coroutines.c
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r2) {
        /*
            r1 = this;
            r1.result = r2
            int r2 = r1.label
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r2 | r0
            r1.label = r2
            io.ktor.util.pipeline.DebugPipelineContext<TSubject, TContext> r2 = r1.this$0
            java.lang.Object r2 = r2.e(r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.util.pipeline.DebugPipelineContext$proceedLoop$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
