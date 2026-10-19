package com.voltasit.obdeleven.data.extensions;

import Aa.c;
import Ia.l;
import Ia.p;
import com.parse.boltsinternal.TaskCompletionSource;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.A;
import me.zhanghai.android.materialprogressbar.R;
import p293xa.r;

/* JADX INFO: compiled from: ParseTaskExtensions.kt */
/* JADX INFO: loaded from: classes3.dex */
@c(c = "com.voltasit.obdeleven.data.extensions.ParseTaskExtensionsKt$coroutineToTask$1", f = "ParseTaskExtensions.kt", l = {R.styleable.AppCompatTheme_actionModeWebSearchDrawable}, m = "invokeSuspend")
public final class ParseTaskExtensionsKt$coroutineToTask$1 extends SuspendLambda implements p<A, kotlin.coroutines.c<? super r>, Object> {
    final /* synthetic */ l<kotlin.coroutines.c<? super T>, Object> $block;
    final /* synthetic */ TaskCompletionSource<T> $taskCompletionSource;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ParseTaskExtensionsKt$coroutineToTask$1(l<? super kotlin.coroutines.c<? super T>, ? extends Object> lVar, TaskCompletionSource<T> taskCompletionSource, kotlin.coroutines.c<? super ParseTaskExtensionsKt$coroutineToTask$1> cVar) {
        super(2, cVar);
        this.$block = lVar;
        this.$taskCompletionSource = taskCompletionSource;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new ParseTaskExtensionsKt$coroutineToTask$1(this.$block, this.$taskCompletionSource, cVar);
    }

    @Override // Ia.p
    public final Object invoke(A a10, kotlin.coroutines.c<? super r> cVar) {
        return ((ParseTaskExtensionsKt$coroutineToTask$1) create(a10, cVar)).invokeSuspend(r.f47939a);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to com.voltasit.obdeleven.data.extensions.ParseTaskExtensionsKt$coroutineToTask$1 for r3v1 'this'  java.lang.Object
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r4) {
        /*
            r3 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.f43038b
            int r1 = r3.label
            r2 = 1
            if (r1 == 0) goto L17
            if (r1 != r2) goto Lf
            kotlin.b.b(r4)     // Catch: java.lang.Exception -> Ld
            goto L25
        Ld:
            r4 = move-exception
            goto L2b
        Lf:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r0)
            throw r4
        L17:
            kotlin.b.b(r4)
            Ia.l<kotlin.coroutines.c<? super T>, java.lang.Object> r4 = r3.$block     // Catch: java.lang.Exception -> Ld
            r3.label = r2     // Catch: java.lang.Exception -> Ld
            java.lang.Object r4 = r4.invoke(r3)     // Catch: java.lang.Exception -> Ld
            if (r4 != r0) goto L25
            return r0
        L25:
            com.parse.boltsinternal.TaskCompletionSource<T> r0 = r3.$taskCompletionSource     // Catch: java.lang.Exception -> Ld
            r0.setResult(r4)     // Catch: java.lang.Exception -> Ld
            goto L30
        L2b:
            com.parse.boltsinternal.TaskCompletionSource<T> r0 = r3.$taskCompletionSource
            r0.setError(r4)
        L30:
            xa.r r4 = p293xa.r.f47939a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.voltasit.obdeleven.data.extensions.ParseTaskExtensionsKt$coroutineToTask$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
