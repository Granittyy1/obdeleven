package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.InterfaceC1152c;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;

/* JADX INFO: compiled from: TapGestureDetector.kt */
/* JADX INFO: loaded from: classes.dex */
@Aa.c(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitSecondDown$2", f = "TapGestureDetector.kt", l = {227}, m = "invokeSuspend")
final class TapGestureDetectorKt$awaitSecondDown$2 extends RestrictedSuspendLambda implements Ia.p<InterfaceC1152c, kotlin.coroutines.c<? super androidx.compose.ui.input.pointer.q>, Object> {
    final /* synthetic */ androidx.compose.ui.input.pointer.q $firstUp;
    long J$0;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TapGestureDetectorKt$awaitSecondDown$2(androidx.compose.ui.input.pointer.q qVar, kotlin.coroutines.c<? super TapGestureDetectorKt$awaitSecondDown$2> cVar) {
        super(2, cVar);
        this.$firstUp = qVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        TapGestureDetectorKt$awaitSecondDown$2 tapGestureDetectorKt$awaitSecondDown$2 = new TapGestureDetectorKt$awaitSecondDown$2(this.$firstUp, cVar);
        tapGestureDetectorKt$awaitSecondDown$2.L$0 = obj;
        return tapGestureDetectorKt$awaitSecondDown$2;
    }

    @Override // Ia.p
    public final Object invoke(InterfaceC1152c interfaceC1152c, kotlin.coroutines.c<? super androidx.compose.ui.input.pointer.q> cVar) {
        return ((TapGestureDetectorKt$awaitSecondDown$2) create(interfaceC1152c, cVar)).invokeSuspend(p293xa.r.f47939a);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0040 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:14:0x0049 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x003e -> B:12:0x0041). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:0:?
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
            r2 = 1
            if (r1 == 0) goto L1b
            if (r1 != r2) goto L13
            long r3 = r7.J$0
            java.lang.Object r1 = r7.L$0
            androidx.compose.ui.input.pointer.c r1 = (androidx.compose.ui.input.pointer.InterfaceC1152c) r1
            kotlin.b.b(r8)
            goto L41
        L13:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1b:
            kotlin.b.b(r8)
            java.lang.Object r8 = r7.L$0
            androidx.compose.ui.input.pointer.c r8 = (androidx.compose.ui.input.pointer.InterfaceC1152c) r8
            androidx.compose.ui.input.pointer.q r1 = r7.$firstUp
            long r3 = r1.f14101b
            androidx.compose.ui.platform.Y0 r1 = r8.getViewConfiguration()
            r1.getClass()
            r5 = 40
            long r5 = r5 + r3
            r1 = r8
            r3 = r5
        L32:
            r7.L$0 = r1
            r7.J$0 = r3
            r7.label = r2
            r8 = 0
            r5 = 3
            java.lang.Object r8 = androidx.compose.foundation.gestures.TapGestureDetectorKt.c(r1, r8, r7, r5)
            if (r8 != r0) goto L41
            return r0
        L41:
            androidx.compose.ui.input.pointer.q r8 = (androidx.compose.ui.input.pointer.q) r8
            long r5 = r8.f14101b
            int r5 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r5 < 0) goto L32
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitSecondDown$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
