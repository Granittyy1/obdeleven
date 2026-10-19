package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.InterfaceC1152c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* JADX INFO: compiled from: ForEachGesture.kt */
/* JADX INFO: loaded from: classes.dex */
public final class ForEachGestureKt {
    /* JADX WARN: Code duplicated, block: B:23:0x0073  */
    /* JADX WARN: Code duplicated, block: B:26:0x007e A[LOOP:0: B:22:0x0071->B:26:0x007e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:30:0x0084 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:31:0x0058 A[EDGE_INSN: B:31:0x0058->B:18:0x0058 BREAK  A[LOOP:0: B:22:0x0071->B:26:0x007e], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r10v7, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0062 -> B:21:0x0065). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object a(androidx.compose.ui.input.pointer.InterfaceC1152c r8, androidx.compose.ui.input.pointer.PointerEventPass r9, kotlin.coroutines.jvm.internal.BaseContinuationImpl r10) {
        /*
            boolean r0 = r10 instanceof androidx.compose.foundation.gestures.ForEachGestureKt$awaitAllPointersUp$3
            if (r0 == 0) goto L13
            r0 = r10
            androidx.compose.foundation.gestures.ForEachGestureKt$awaitAllPointersUp$3 r0 = (androidx.compose.foundation.gestures.ForEachGestureKt$awaitAllPointersUp$3) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.ForEachGestureKt$awaitAllPointersUp$3 r0 = new androidx.compose.foundation.gestures.ForEachGestureKt$awaitAllPointersUp$3
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f43038b
            int r2 = r0.label
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r8 = r0.L$1
            androidx.compose.ui.input.pointer.PointerEventPass r8 = (androidx.compose.ui.input.pointer.PointerEventPass) r8
            java.lang.Object r9 = r0.L$0
            androidx.compose.ui.input.pointer.c r9 = (androidx.compose.ui.input.pointer.InterfaceC1152c) r9
            kotlin.b.b(r10)
            r7 = r9
            r9 = r8
            r8 = r7
            goto L65
        L33:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3b:
            kotlin.b.b(r10)
            androidx.compose.ui.input.pointer.j r10 = r8.P()
            java.lang.Object r10 = r10.f14091a
            r2 = r10
            java.util.Collection r2 = (java.util.Collection) r2
            int r2 = r2.size()
            r5 = r4
        L4c:
            if (r5 >= r2) goto L84
            java.lang.Object r6 = r10.get(r5)
            androidx.compose.ui.input.pointer.q r6 = (androidx.compose.ui.input.pointer.q) r6
            boolean r6 = r6.f14103d
            if (r6 == 0) goto L81
        L58:
            r0.L$0 = r8
            r0.L$1 = r9
            r0.label = r3
            java.lang.Object r10 = r8.K(r9, r0)
            if (r10 != r1) goto L65
            return r1
        L65:
            androidx.compose.ui.input.pointer.j r10 = (androidx.compose.ui.input.pointer.j) r10
            java.lang.Object r10 = r10.f14091a
            r2 = r10
            java.util.Collection r2 = (java.util.Collection) r2
            int r2 = r2.size()
            r5 = r4
        L71:
            if (r5 >= r2) goto L84
            java.lang.Object r6 = r10.get(r5)
            androidx.compose.ui.input.pointer.q r6 = (androidx.compose.ui.input.pointer.q) r6
            boolean r6 = r6.f14103d
            if (r6 == 0) goto L7e
            goto L58
        L7e:
            int r5 = r5 + 1
            goto L71
        L81:
            int r5 = r5 + 1
            goto L4c
        L84:
            xa.r r8 = p293xa.r.f47939a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ForEachGestureKt.a(androidx.compose.ui.input.pointer.c, androidx.compose.ui.input.pointer.PointerEventPass, kotlin.coroutines.jvm.internal.BaseContinuationImpl):java.lang.Object");
    }

    public static final Object b(androidx.compose.ui.input.pointer.w wVar, Ia.p<? super InterfaceC1152c, ? super kotlin.coroutines.c<? super p293xa.r>, ? extends Object> pVar, kotlin.coroutines.c<? super p293xa.r> cVar) {
        Object objN0 = wVar.n0(new ForEachGestureKt$awaitEachGesture$2(cVar.getContext(), pVar, null), cVar);
        return objN0 == CoroutineSingletons.f43038b ? objN0 : p293xa.r.f47939a;
    }
}
