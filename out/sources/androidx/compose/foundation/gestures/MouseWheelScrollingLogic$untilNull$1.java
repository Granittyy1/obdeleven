package androidx.compose.foundation.gestures;

import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;

/* JADX INFO: compiled from: MouseWheelScrollable.kt */
/* JADX INFO: loaded from: classes.dex */
@Aa.c(c = "androidx.compose.foundation.gestures.MouseWheelScrollingLogic$untilNull$1", f = "MouseWheelScrollable.kt", l = {179}, m = "invokeSuspend")
final class MouseWheelScrollingLogic$untilNull$1 extends RestrictedSuspendLambda implements Ia.p<kotlin.sequences.i<Object>, kotlin.coroutines.c<? super p293xa.r>, Object> {
    final /* synthetic */ Ia.a<Object> $builderAction;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MouseWheelScrollingLogic$untilNull$1(Ia.a<Object> aVar, kotlin.coroutines.c<? super MouseWheelScrollingLogic$untilNull$1> cVar) {
        super(2, cVar);
        this.$builderAction = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        MouseWheelScrollingLogic$untilNull$1 mouseWheelScrollingLogic$untilNull$1 = new MouseWheelScrollingLogic$untilNull$1(this.$builderAction, cVar);
        mouseWheelScrollingLogic$untilNull$1.L$0 = obj;
        return mouseWheelScrollingLogic$untilNull$1;
    }

    @Override // Ia.p
    public final Object invoke(kotlin.sequences.i<Object> iVar, kotlin.coroutines.c<? super p293xa.r> cVar) {
        return ((MouseWheelScrollingLogic$untilNull$1) create(iVar, cVar)).invokeSuspend(p293xa.r.f47939a);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002b  */
    /* JADX WARN: Code duplicated, block: B:13:0x0037  */
    /* JADX WARN: Code duplicated, block: B:15:0x003a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0037 -> B:14:0x0038). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:13:0x0037
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.f43038b
            int r1 = r4.label
            r2 = 1
            if (r1 == 0) goto L1b
            if (r1 != r2) goto L13
            java.lang.Object r1 = r4.L$1
            java.lang.Object r3 = r4.L$0
            kotlin.sequences.i r3 = (kotlin.sequences.i) r3
            kotlin.b.b(r5)
            goto L38
        L13:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L1b:
            kotlin.b.b(r5)
            java.lang.Object r5 = r4.L$0
            kotlin.sequences.i r5 = (kotlin.sequences.i) r5
            r3 = r5
        L23:
            Ia.a<java.lang.Object> r5 = r4.$builderAction
            java.lang.Object r5 = r5.invoke()
            if (r5 == 0) goto L37
            r4.L$0 = r3
            r4.L$1 = r5
            r4.label = r2
            r3.a(r5, r4)
            kotlin.coroutines.intrinsics.CoroutineSingletons r5 = kotlin.coroutines.intrinsics.CoroutineSingletons.f43038b
            return r0
        L37:
            r1 = 0
        L38:
            if (r1 != 0) goto L23
            xa.r r5 = p293xa.r.f47939a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.MouseWheelScrollingLogic$untilNull$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
