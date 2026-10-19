package kotlinx.coroutines;

import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;

/* JADX INFO: compiled from: JobSupport.kt */
/* JADX INFO: loaded from: classes2.dex */
@Aa.c(c = "kotlinx.coroutines.JobSupport$children$1", f = "JobSupport.kt", l = {963, 965}, m = "invokeSuspend")
public final class JobSupport$children$1 extends RestrictedSuspendLambda implements Ia.p<kotlin.sequences.i<? super InterfaceC2694i0>, kotlin.coroutines.c<? super p293xa.r>, Object> {
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ JobSupport this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JobSupport$children$1(kotlin.coroutines.c cVar, JobSupport jobSupport) {
        super(2, cVar);
        this.this$0 = jobSupport;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        JobSupport$children$1 jobSupport$children$1 = new JobSupport$children$1(cVar, this.this$0);
        jobSupport$children$1.L$0 = obj;
        return jobSupport$children$1;
    }

    @Override // Ia.p
    public final Object invoke(kotlin.sequences.i<? super InterfaceC2694i0> iVar, kotlin.coroutines.c<? super p293xa.r> cVar) {
        return ((JobSupport$children$1) create(iVar, cVar)).invokeSuspend(p293xa.r.f47939a);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0064  */
    /* JADX WARN: Code duplicated, block: B:23:0x0068  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0066 -> B:25:0x007b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.f43038b
            int r1 = r6.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L28
            if (r1 == r3) goto L24
            if (r1 != r2) goto L1c
            java.lang.Object r1 = r6.L$2
            kotlinx.coroutines.internal.LockFreeLinkedListNode r1 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r1
            java.lang.Object r3 = r6.L$1
            kotlinx.coroutines.internal.l r3 = (kotlinx.coroutines.internal.l) r3
            java.lang.Object r4 = r6.L$0
            kotlin.sequences.i r4 = (kotlin.sequences.i) r4
            kotlin.b.b(r7)
            goto L7b
        L1c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L24:
            kotlin.b.b(r7)
            goto L80
        L28:
            kotlin.b.b(r7)
            java.lang.Object r7 = r6.L$0
            kotlin.sequences.i r7 = (kotlin.sequences.i) r7
            kotlinx.coroutines.JobSupport r1 = r6.this$0
            java.lang.Object r1 = r1.W()
            boolean r4 = r1 instanceof kotlinx.coroutines.C2704n
            if (r4 == 0) goto L43
            kotlinx.coroutines.n r1 = (kotlinx.coroutines.C2704n) r1
            kotlinx.coroutines.JobSupport r1 = r1.f43514f
            r6.label = r3
            r7.a(r1, r6)
            return r0
        L43:
            boolean r3 = r1 instanceof kotlinx.coroutines.InterfaceC2677c0
            if (r3 == 0) goto L80
            kotlinx.coroutines.c0 r1 = (kotlinx.coroutines.InterfaceC2677c0) r1
            kotlinx.coroutines.r0 r1 = r1.d()
            if (r1 == 0) goto L80
            java.lang.Object r3 = r1.g()
            java.lang.String r4 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }"
            kotlin.jvm.internal.i.c(r3, r4)
            kotlinx.coroutines.internal.LockFreeLinkedListNode r3 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r3
            r4 = r7
            r5 = r3
            r3 = r1
            r1 = r5
        L5e:
            boolean r7 = r1.equals(r3)
            if (r7 != 0) goto L80
            boolean r7 = r1 instanceof kotlinx.coroutines.C2704n
            if (r7 == 0) goto L7b
            r7 = r1
            kotlinx.coroutines.n r7 = (kotlinx.coroutines.C2704n) r7
            r6.L$0 = r4
            r6.L$1 = r3
            r6.L$2 = r1
            r6.label = r2
            kotlinx.coroutines.JobSupport r7 = r7.f43514f
            r4.a(r7, r6)
            kotlin.coroutines.intrinsics.CoroutineSingletons r7 = kotlin.coroutines.intrinsics.CoroutineSingletons.f43038b
            return r0
        L7b:
            kotlinx.coroutines.internal.LockFreeLinkedListNode r1 = r1.h()
            goto L5e
        L80:
            xa.r r7 = p293xa.r.f47939a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.JobSupport$children$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
