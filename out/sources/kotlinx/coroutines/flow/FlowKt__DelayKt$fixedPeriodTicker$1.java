package kotlinx.coroutines.flow;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: compiled from: Delay.kt */
/* JADX INFO: loaded from: classes2.dex */
@Aa.c(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$fixedPeriodTicker$1", f = "Delay.kt", l = {307, 309, 310}, m = "invokeSuspend")
final class FlowKt__DelayKt$fixedPeriodTicker$1 extends SuspendLambda implements Ia.p<kotlinx.coroutines.channels.n<? super p293xa.r>, kotlin.coroutines.c<? super p293xa.r>, Object> {
    final /* synthetic */ long $delayMillis;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__DelayKt$fixedPeriodTicker$1(long j, kotlin.coroutines.c<? super FlowKt__DelayKt$fixedPeriodTicker$1> cVar) {
        super(2, cVar);
        this.$delayMillis = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        FlowKt__DelayKt$fixedPeriodTicker$1 flowKt__DelayKt$fixedPeriodTicker$1 = new FlowKt__DelayKt$fixedPeriodTicker$1(this.$delayMillis, cVar);
        flowKt__DelayKt$fixedPeriodTicker$1.L$0 = obj;
        return flowKt__DelayKt$fixedPeriodTicker$1;
    }

    @Override // Ia.p
    public final Object invoke(kotlinx.coroutines.channels.n<? super p293xa.r> nVar, kotlin.coroutines.c<? super p293xa.r> cVar) {
        ((FlowKt__DelayKt$fixedPeriodTicker$1) create(nVar, cVar)).invokeSuspend(p293xa.r.f47939a);
        return CoroutineSingletons.f43038b;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x004f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x005c A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x005a -> B:15:0x003d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:20:0x005c
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.f43038b
            int r1 = r7.label
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L28
            if (r1 == r4) goto L20
            if (r1 == r3) goto L18
            if (r1 != r2) goto L10
            goto L20
        L10:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L18:
            java.lang.Object r1 = r7.L$0
            kotlinx.coroutines.channels.n r1 = (kotlinx.coroutines.channels.n) r1
            kotlin.b.b(r8)
            goto L50
        L20:
            java.lang.Object r1 = r7.L$0
            kotlinx.coroutines.channels.n r1 = (kotlinx.coroutines.channels.n) r1
            kotlin.b.b(r8)
            goto L3d
        L28:
            kotlin.b.b(r8)
            java.lang.Object r8 = r7.L$0
            r1 = r8
            kotlinx.coroutines.channels.n r1 = (kotlinx.coroutines.channels.n) r1
            long r5 = r7.$delayMillis
            r7.L$0 = r1
            r7.label = r4
            java.lang.Object r8 = kotlinx.coroutines.I.b(r5, r7)
            if (r8 != r0) goto L3d
            return r0
        L3d:
            kotlinx.coroutines.channels.m r8 = r1.getChannel()
            xa.r r4 = p293xa.r.f47939a
            r7.L$0 = r1
            r7.label = r3
            kotlinx.coroutines.channels.BufferedChannel r8 = r8.f43290e
            java.lang.Object r8 = r8.t(r4, r7)
            if (r8 != r0) goto L50
            return r0
        L50:
            long r4 = r7.$delayMillis
            r7.L$0 = r1
            r7.label = r2
            java.lang.Object r8 = kotlinx.coroutines.I.b(r4, r7)
            if (r8 != r0) goto L3d
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__DelayKt$fixedPeriodTicker$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
