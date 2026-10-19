package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.InterfaceC1152c;
import androidx.compose.ui.input.pointer.PointerEventPass;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: compiled from: TapGestureDetector.kt */
/* JADX INFO: loaded from: classes.dex */
@Aa.c(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$waitForLongPress$2", f = "TapGestureDetector.kt", l = {386, 409}, m = "invokeSuspend")
final class TapGestureDetectorKt$waitForLongPress$2 extends RestrictedSuspendLambda implements Ia.p<InterfaceC1152c, kotlin.coroutines.c<? super p293xa.r>, Object> {
    final /* synthetic */ PointerEventPass $pass;
    final /* synthetic */ Ref$ObjectRef<k> $result;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TapGestureDetectorKt$waitForLongPress$2(PointerEventPass pointerEventPass, Ref$ObjectRef<k> ref$ObjectRef, kotlin.coroutines.c<? super TapGestureDetectorKt$waitForLongPress$2> cVar) {
        super(2, cVar);
        this.$pass = pointerEventPass;
        this.$result = ref$ObjectRef;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        TapGestureDetectorKt$waitForLongPress$2 tapGestureDetectorKt$waitForLongPress$2 = new TapGestureDetectorKt$waitForLongPress$2(this.$pass, this.$result, cVar);
        tapGestureDetectorKt$waitForLongPress$2.L$0 = obj;
        return tapGestureDetectorKt$waitForLongPress$2;
    }

    @Override // Ia.p
    public final Object invoke(InterfaceC1152c interfaceC1152c, kotlin.coroutines.c<? super p293xa.r> cVar) {
        return ((TapGestureDetectorKt$waitForLongPress$2) create(interfaceC1152c, cVar)).invokeSuspend(p293xa.r.f47939a);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x004d  */
    /* JADX WARN: Code duplicated, block: B:22:0x005f  */
    /* JADX WARN: Code duplicated, block: B:23:0x0067  */
    /* JADX WARN: Code duplicated, block: B:27:0x007d  */
    /* JADX WARN: Code duplicated, block: B:42:0x00ca A[LOOP:1: B:16:0x0049->B:42:0x00ca, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:48:0x00ce A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:49:0x0059 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:0x008f A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v1, types: [T, androidx.compose.foundation.gestures.k$b] */
    /* JADX WARN: Type inference failed for: r0v2, types: [T, androidx.compose.foundation.gestures.k$a] */
    /* JADX WARN: Type inference failed for: r0v3, types: [T, androidx.compose.foundation.gestures.k$c] */
    /* JADX WARN: Type inference failed for: r0v4, types: [T, androidx.compose.foundation.gestures.k$a] */
    /* JADX WARN: Type inference failed for: r15v19, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00a0 -> B:35:0x00a3). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TapGestureDetectorKt$waitForLongPress$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
