package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.InterfaceC1152c;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.internal.Ref$LongRef;

/* JADX INFO: compiled from: DragGestureDetector.kt */
/* JADX INFO: loaded from: classes.dex */
@Aa.c(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGestures$9", f = "DragGestureDetector.kt", l = {245, 251, 1061, 1101, 278, 1148, 1190, 1202}, m = "invokeSuspend")
final class DragGestureDetectorKt$detectDragGestures$9 extends RestrictedSuspendLambda implements Ia.p<InterfaceC1152c, kotlin.coroutines.c<? super p293xa.r>, Object> {
    final /* synthetic */ Ia.p<androidx.compose.ui.input.pointer.q, I.d, p293xa.r> $onDrag;
    final /* synthetic */ Ia.a<p293xa.r> $onDragCancel;
    final /* synthetic */ Ia.l<androidx.compose.ui.input.pointer.q, p293xa.r> $onDragEnd;
    final /* synthetic */ Ia.q<androidx.compose.ui.input.pointer.q, androidx.compose.ui.input.pointer.q, I.d, p293xa.r> $onDragStart;
    final /* synthetic */ Orientation $orientationLock;
    final /* synthetic */ Ref$LongRef $overSlop;
    final /* synthetic */ Ia.a<Boolean> $shouldAwaitTouchSlop;
    float F$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    boolean Z$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DragGestureDetectorKt$detectDragGestures$9(Ia.a<Boolean> aVar, Ref$LongRef ref$LongRef, Orientation orientation, Ia.q<? super androidx.compose.ui.input.pointer.q, ? super androidx.compose.ui.input.pointer.q, ? super I.d, p293xa.r> qVar, Ia.p<? super androidx.compose.ui.input.pointer.q, ? super I.d, p293xa.r> pVar, Ia.a<p293xa.r> aVar2, Ia.l<? super androidx.compose.ui.input.pointer.q, p293xa.r> lVar, kotlin.coroutines.c<? super DragGestureDetectorKt$detectDragGestures$9> cVar) {
        super(2, cVar);
        this.$shouldAwaitTouchSlop = aVar;
        this.$overSlop = ref$LongRef;
        this.$orientationLock = orientation;
        this.$onDragStart = qVar;
        this.$onDrag = pVar;
        this.$onDragCancel = aVar2;
        this.$onDragEnd = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        DragGestureDetectorKt$detectDragGestures$9 dragGestureDetectorKt$detectDragGestures$9 = new DragGestureDetectorKt$detectDragGestures$9(this.$shouldAwaitTouchSlop, this.$overSlop, this.$orientationLock, this.$onDragStart, this.$onDrag, this.$onDragCancel, this.$onDragEnd, cVar);
        dragGestureDetectorKt$detectDragGestures$9.L$0 = obj;
        return dragGestureDetectorKt$detectDragGestures$9;
    }

    @Override // Ia.p
    public final Object invoke(InterfaceC1152c interfaceC1152c, kotlin.coroutines.c<? super p293xa.r> cVar) {
        return ((DragGestureDetectorKt$detectDragGestures$9) create(interfaceC1152c, cVar)).invokeSuspend(p293xa.r.f47939a);
    }

    /* JADX WARN: Code duplicated, block: B:228:0x0292 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:229:0x02e4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:95:0x02d3  */
    /* JADX WARN: Code duplicated, block: B:98:0x02de A[LOOP:5: B:94:0x02d1->B:98:0x02de, LOOP_END] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r21v1 */
    /* JADX WARN: Type inference failed for: r2v37, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v54, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v71, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v18, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v34, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v50 */
    /* JADX WARN: Type inference failed for: r4v62 */
    /* JADX WARN: Type inference failed for: r9v14, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v21, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:110:0x031b -> B:111:0x031c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:112:0x0329 -> B:113:0x0340). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:152:0x0426 -> B:153:0x0427). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:157:0x0442 -> B:79:0x0274). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:165:0x04b1 -> B:167:0x04b4). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0167 -> B:30:0x017e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:69:0x024d -> B:70:0x0253). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:96:0x02db -> B:85:0x0292). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r25) {
        /*
            Method dump skipped, instruction units count: 1424
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGestures$9.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
