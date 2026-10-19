package androidx.compose.foundation.text;

import androidx.compose.ui.input.pointer.InterfaceC1152c;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: LongPressTextDragObserver.kt */
/* JADX INFO: loaded from: classes.dex */
@Aa.c(c = "androidx.compose.foundation.text.LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2", f = "LongPressTextDragObserver.kt", l = {R.styleable.AppCompatTheme_panelMenuListTheme, R.styleable.AppCompatTheme_radioButtonStyle}, m = "invokeSuspend")
final class LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2 extends RestrictedSuspendLambda implements Ia.p<InterfaceC1152c, kotlin.coroutines.c<? super p293xa.r>, Object> {
    final /* synthetic */ t $observer;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2(t tVar, kotlin.coroutines.c<? super LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2> cVar) {
        super(2, cVar);
        this.$observer = tVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2 longPressTextDragObserverKt$detectPreDragGesturesWithObserver$2 = new LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2(this.$observer, cVar);
        longPressTextDragObserverKt$detectPreDragGesturesWithObserver$2.L$0 = obj;
        return longPressTextDragObserverKt$detectPreDragGesturesWithObserver$2;
    }

    @Override // Ia.p
    public final Object invoke(InterfaceC1152c interfaceC1152c, kotlin.coroutines.c<? super p293xa.r> cVar) {
        return ((LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2) create(interfaceC1152c, cVar)).invokeSuspend(p293xa.r.f47939a);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0055 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:19:0x0064  */
    /* JADX WARN: Code duplicated, block: B:21:0x0074  */
    /* JADX WARN: Code duplicated, block: B:27:0x007c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:0x0079 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r12v10, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0053 -> B:17:0x0056). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:29:0x0079
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.f43038b
            int r1 = r11.label
            r2 = 1
            r3 = 2
            if (r1 == 0) goto L28
            if (r1 == r2) goto L20
            if (r1 != r3) goto L18
            java.lang.Object r1 = r11.L$1
            androidx.compose.ui.input.pointer.q r1 = (androidx.compose.ui.input.pointer.q) r1
            java.lang.Object r2 = r11.L$0
            androidx.compose.ui.input.pointer.c r2 = (androidx.compose.ui.input.pointer.InterfaceC1152c) r2
            kotlin.b.b(r12)
            goto L56
        L18:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L20:
            java.lang.Object r1 = r11.L$0
            androidx.compose.ui.input.pointer.c r1 = (androidx.compose.ui.input.pointer.InterfaceC1152c) r1
            kotlin.b.b(r12)
            goto L3c
        L28:
            kotlin.b.b(r12)
            java.lang.Object r12 = r11.L$0
            r1 = r12
            androidx.compose.ui.input.pointer.c r1 = (androidx.compose.ui.input.pointer.InterfaceC1152c) r1
            r11.L$0 = r1
            r11.label = r2
            r12 = 0
            java.lang.Object r12 = androidx.compose.foundation.gestures.TapGestureDetectorKt.c(r1, r12, r11, r3)
            if (r12 != r0) goto L3c
            return r0
        L3c:
            androidx.compose.ui.input.pointer.q r12 = (androidx.compose.ui.input.pointer.q) r12
            androidx.compose.foundation.text.t r2 = r11.$observer
            long r4 = r12.f14102c
            r2.d()
            r2 = r1
            r1 = r12
        L47:
            r11.L$0 = r2
            r11.L$1 = r1
            r11.label = r3
            androidx.compose.ui.input.pointer.PointerEventPass r12 = androidx.compose.ui.input.pointer.PointerEventPass.f14030c
            java.lang.Object r12 = r2.K(r12, r11)
            if (r12 != r0) goto L56
            return r0
        L56:
            androidx.compose.ui.input.pointer.j r12 = (androidx.compose.ui.input.pointer.j) r12
            java.lang.Object r12 = r12.f14091a
            r4 = r12
            java.util.Collection r4 = (java.util.Collection) r4
            int r4 = r4.size()
            r5 = 0
        L62:
            if (r5 >= r4) goto L7c
            java.lang.Object r6 = r12.get(r5)
            androidx.compose.ui.input.pointer.q r6 = (androidx.compose.ui.input.pointer.q) r6
            long r7 = r6.f14100a
            long r9 = r1.f14100a
            boolean r7 = androidx.compose.ui.input.pointer.p.a(r7, r9)
            if (r7 == 0) goto L79
            boolean r6 = r6.f14103d
            if (r6 == 0) goto L79
            goto L47
        L79:
            int r5 = r5 + 1
            goto L62
        L7c:
            androidx.compose.foundation.text.t r12 = r11.$observer
            r12.c()
            xa.r r12 = p293xa.r.f47939a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
