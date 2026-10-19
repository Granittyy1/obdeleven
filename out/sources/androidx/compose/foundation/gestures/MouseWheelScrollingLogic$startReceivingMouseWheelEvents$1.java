package androidx.compose.foundation.gestures;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.A;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: MouseWheelScrollable.kt */
/* JADX INFO: loaded from: classes.dex */
@Aa.c(c = "androidx.compose.foundation.gestures.MouseWheelScrollingLogic$startReceivingMouseWheelEvents$1", f = "MouseWheelScrollable.kt", l = {R.styleable.AppCompatTheme_textAppearanceSearchResultSubtitle, R.styleable.AppCompatTheme_textColorAlertDialogListItem}, m = "invokeSuspend")
final class MouseWheelScrollingLogic$startReceivingMouseWheelEvents$1 extends SuspendLambda implements Ia.p<A, kotlin.coroutines.c<? super p293xa.r>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ m this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MouseWheelScrollingLogic$startReceivingMouseWheelEvents$1(m mVar, kotlin.coroutines.c<? super MouseWheelScrollingLogic$startReceivingMouseWheelEvents$1> cVar) {
        super(2, cVar);
        this.this$0 = mVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        MouseWheelScrollingLogic$startReceivingMouseWheelEvents$1 mouseWheelScrollingLogic$startReceivingMouseWheelEvents$1 = new MouseWheelScrollingLogic$startReceivingMouseWheelEvents$1(this.this$0, cVar);
        mouseWheelScrollingLogic$startReceivingMouseWheelEvents$1.L$0 = obj;
        return mouseWheelScrollingLogic$startReceivingMouseWheelEvents$1;
    }

    @Override // Ia.p
    public final Object invoke(A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
        return ((MouseWheelScrollingLogic$startReceivingMouseWheelEvents$1) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0039 A[Catch: all -> 0x0016, TryCatch #0 {all -> 0x0016, blocks: (B:7:0x0011, B:17:0x002f, B:19:0x0039, B:23:0x004b, B:14:0x0024), top: B:30:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:21:0x0047 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:22:0x0048  */
    /* JADX WARN: Code duplicated, block: B:25:0x0071 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x006f -> B:8:0x0014). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.f43038b
            int r1 = r12.label
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L28
            if (r1 == r4) goto L20
            if (r1 != r3) goto L18
            java.lang.Object r1 = r12.L$0
            kotlinx.coroutines.A r1 = (kotlinx.coroutines.A) r1
            kotlin.b.b(r13)     // Catch: java.lang.Throwable -> L16
        L14:
            r13 = r1
            goto L2f
        L16:
            r13 = move-exception
            goto L79
        L18:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L20:
            java.lang.Object r1 = r12.L$0
            kotlinx.coroutines.A r1 = (kotlinx.coroutines.A) r1
            kotlin.b.b(r13)     // Catch: java.lang.Throwable -> L16
            goto L4b
        L28:
            kotlin.b.b(r13)
            java.lang.Object r13 = r12.L$0
            kotlinx.coroutines.A r13 = (kotlinx.coroutines.A) r13
        L2f:
            kotlin.coroutines.e r1 = r13.getCoroutineContext()     // Catch: java.lang.Throwable -> L16
            boolean r1 = kotlinx.coroutines.C2702l0.h(r1)     // Catch: java.lang.Throwable -> L16
            if (r1 == 0) goto L72
            androidx.compose.foundation.gestures.m r1 = r12.this$0     // Catch: java.lang.Throwable -> L16
            kotlinx.coroutines.channels.BufferedChannel r1 = r1.f10024e     // Catch: java.lang.Throwable -> L16
            r12.L$0 = r13     // Catch: java.lang.Throwable -> L16
            r12.label = r4     // Catch: java.lang.Throwable -> L16
            java.lang.Object r1 = r1.d(r12)     // Catch: java.lang.Throwable -> L16
            if (r1 != r0) goto L48
            return r0
        L48:
            r11 = r1
            r1 = r13
            r13 = r11
        L4b:
            r7 = r13
            androidx.compose.foundation.gestures.m$a r7 = (androidx.compose.foundation.gestures.m.a) r7     // Catch: java.lang.Throwable -> L16
            androidx.compose.foundation.gestures.m r13 = r12.this$0     // Catch: java.lang.Throwable -> L16
            b0.c r13 = r13.f10023d     // Catch: java.lang.Throwable -> L16
            float r5 = androidx.compose.foundation.gestures.l.f10018a     // Catch: java.lang.Throwable -> L16
            float r8 = r13.T0(r5)     // Catch: java.lang.Throwable -> L16
            androidx.compose.foundation.gestures.m r13 = r12.this$0     // Catch: java.lang.Throwable -> L16
            b0.c r13 = r13.f10023d     // Catch: java.lang.Throwable -> L16
            float r5 = androidx.compose.foundation.gestures.l.f10019b     // Catch: java.lang.Throwable -> L16
            float r9 = r13.T0(r5)     // Catch: java.lang.Throwable -> L16
            androidx.compose.foundation.gestures.m r5 = r12.this$0     // Catch: java.lang.Throwable -> L16
            androidx.compose.foundation.gestures.ScrollingLogic r6 = r5.f10020a     // Catch: java.lang.Throwable -> L16
            r12.L$0 = r1     // Catch: java.lang.Throwable -> L16
            r12.label = r3     // Catch: java.lang.Throwable -> L16
            r10 = r12
            java.lang.Object r13 = androidx.compose.foundation.gestures.m.b(r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L16
            if (r13 != r0) goto L14
            return r0
        L72:
            androidx.compose.foundation.gestures.m r13 = r12.this$0
            r13.f10026g = r2
            xa.r r13 = p293xa.r.f47939a
            return r13
        L79:
            androidx.compose.foundation.gestures.m r0 = r12.this$0
            r0.f10026g = r2
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.MouseWheelScrollingLogic$startReceivingMouseWheelEvents$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
