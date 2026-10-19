package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.InterfaceC1152c;
import androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException;
import androidx.compose.ui.platform.Y0;
import java.util.Collection;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$LongRef;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: compiled from: DragGestureDetector.kt */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f10014a = ((float) 0.125d) / 18;

    /* JADX WARN: Code duplicated, block: B:24:0x007b  */
    /* JADX WARN: Code duplicated, block: B:27:0x008d A[LOOP:0: B:23:0x0079->B:27:0x008d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:54:0x0091 A[EDGE_INSN: B:54:0x0091->B:29:0x0091 BREAK  A[LOOP:0: B:23:0x0079->B:27:0x008d], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0067 -> B:22:0x006c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object a(androidx.compose.ui.input.pointer.InterfaceC1152c r17, long r18, kotlin.coroutines.jvm.internal.ContinuationImpl r20) {
        /*
            Method dump skipped, instruction units count: 219
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.g.a(androidx.compose.ui.input.pointer.c, long, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [long] */
    /* JADX WARN: Type inference failed for: r10v1, types: [kotlin.jvm.internal.Ref$ObjectRef] */
    /* JADX WARN: Type inference failed for: r10v3, types: [kotlin.jvm.internal.Ref$ObjectRef] */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r11v3, types: [T, androidx.compose.ui.input.pointer.q, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r12v5, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v0, types: [androidx.compose.ui.input.pointer.c] */
    public static final Object b(InterfaceC1152c interfaceC1152c, long j, ContinuationImpl continuationImpl) {
        DragGestureDetectorKt$awaitLongPressOrCancellation$1 dragGestureDetectorKt$awaitLongPressOrCancellation$1;
        Object obj;
        Ref$BooleanRef ref$BooleanRef;
        ?? r11;
        if (continuationImpl instanceof DragGestureDetectorKt$awaitLongPressOrCancellation$1) {
            dragGestureDetectorKt$awaitLongPressOrCancellation$1 = (DragGestureDetectorKt$awaitLongPressOrCancellation$1) continuationImpl;
            int i10 = dragGestureDetectorKt$awaitLongPressOrCancellation$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                dragGestureDetectorKt$awaitLongPressOrCancellation$1.label = i10 - Integer.MIN_VALUE;
            } else {
                dragGestureDetectorKt$awaitLongPressOrCancellation$1 = new DragGestureDetectorKt$awaitLongPressOrCancellation$1(continuationImpl);
            }
        } else {
            dragGestureDetectorKt$awaitLongPressOrCancellation$1 = new DragGestureDetectorKt$awaitLongPressOrCancellation$1(continuationImpl);
        }
        Object obj2 = dragGestureDetectorKt$awaitLongPressOrCancellation$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = dragGestureDetectorKt$awaitLongPressOrCancellation$1.label;
        try {
            if (i11 == 0) {
                kotlin.b.b(obj2);
                if (f(interfaceC1152c.P(), j)) {
                    return null;
                }
                ?? r12 = interfaceC1152c.P().f14091a;
                int size = ((Collection) r12).size();
                int i12 = 0;
                while (true) {
                    if (i12 >= size) {
                        obj = null;
                        break;
                    }
                    obj = r12.get(i12);
                    if (androidx.compose.ui.input.pointer.p.a(((androidx.compose.ui.input.pointer.q) obj).f14100a, j)) {
                        break;
                    }
                    i12++;
                }
                ?? r13 = (androidx.compose.ui.input.pointer.q) obj;
                if (r13 == 0) {
                    return null;
                }
                Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
                ref$ObjectRef2.element = r13;
                long jB = interfaceC1152c.getViewConfiguration().b();
                Ref$BooleanRef ref$BooleanRef2 = new Ref$BooleanRef();
                DragGestureDetectorKt$awaitLongPressOrCancellation$2 dragGestureDetectorKt$awaitLongPressOrCancellation$2 = new DragGestureDetectorKt$awaitLongPressOrCancellation$2(ref$BooleanRef2, ref$ObjectRef2, ref$ObjectRef, null);
                dragGestureDetectorKt$awaitLongPressOrCancellation$1.L$0 = r13;
                dragGestureDetectorKt$awaitLongPressOrCancellation$1.L$1 = ref$ObjectRef;
                dragGestureDetectorKt$awaitLongPressOrCancellation$1.L$2 = ref$BooleanRef2;
                dragGestureDetectorKt$awaitLongPressOrCancellation$1.label = 1;
                if (interfaceC1152c.d0(jB, dragGestureDetectorKt$awaitLongPressOrCancellation$2, dragGestureDetectorKt$awaitLongPressOrCancellation$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                ref$BooleanRef = ref$BooleanRef2;
                j = ref$ObjectRef;
                r11 = r13;
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ref$BooleanRef = (Ref$BooleanRef) dragGestureDetectorKt$awaitLongPressOrCancellation$1.L$2;
                Ref$ObjectRef ref$ObjectRef3 = (Ref$ObjectRef) dragGestureDetectorKt$awaitLongPressOrCancellation$1.L$1;
                androidx.compose.ui.input.pointer.q qVar = (androidx.compose.ui.input.pointer.q) dragGestureDetectorKt$awaitLongPressOrCancellation$1.L$0;
                kotlin.b.b(obj2);
                j = ref$ObjectRef3;
                r11 = qVar;
            }
            if (!ref$BooleanRef.element) {
                return null;
            }
            androidx.compose.ui.input.pointer.q qVar2 = (androidx.compose.ui.input.pointer.q) j.element;
            if (qVar2 != null) {
                return qVar2;
            }
        } catch (PointerEventTimeoutCancellationException unused) {
            androidx.compose.ui.input.pointer.q qVar3 = (androidx.compose.ui.input.pointer.q) j.element;
            if (qVar3 != null) {
                return qVar3;
            }
        }
        return r11;
    }

    public static final Object c(androidx.compose.ui.input.pointer.w wVar, final Ia.l lVar, final Ia.a aVar, Ia.a aVar2, Ia.p pVar, SuspendLambda suspendLambda) {
        Object objB = ForEachGestureKt.b(wVar, new DragGestureDetectorKt$detectDragGestures$9(new Ia.a<Boolean>() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGestures$7
            @Override // Ia.a
            public final /* bridge */ /* synthetic */ Boolean invoke() {
                return Boolean.TRUE;
            }
        }, new Ref$LongRef(), null, new Ia.q<androidx.compose.ui.input.pointer.q, androidx.compose.ui.input.pointer.q, I.d, p293xa.r>() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGestures$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }

            @Override // Ia.q
            public final p293xa.r invoke(androidx.compose.ui.input.pointer.q qVar, androidx.compose.ui.input.pointer.q qVar2, I.d dVar) {
                long j = dVar.f3754a;
                lVar.invoke(new I.d(qVar2.f14102c));
                return p293xa.r.f47939a;
            }
        }, pVar, aVar2, new Ia.l<androidx.compose.ui.input.pointer.q, p293xa.r>() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGestures$6
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // Ia.l
            public final p293xa.r invoke(androidx.compose.ui.input.pointer.q qVar) {
                aVar.invoke();
                return p293xa.r.f47939a;
            }
        }, null), suspendLambda);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        if (objB != coroutineSingletons) {
            objB = p293xa.r.f47939a;
        }
        return objB == coroutineSingletons ? objB : p293xa.r.f47939a;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0048 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:22:0x0050  */
    /* JADX WARN: Code duplicated, block: B:24:0x0056  */
    /* JADX WARN: Code duplicated, block: B:26:0x0059  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0046 -> B:18:0x0049). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object e(androidx.compose.ui.input.pointer.InterfaceC1152c r4, long r5, Ia.l r7, kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            boolean r0 = r8 instanceof androidx.compose.foundation.gestures.DragGestureDetectorKt$drag$1
            if (r0 == 0) goto L13
            r0 = r8
            androidx.compose.foundation.gestures.DragGestureDetectorKt$drag$1 r0 = (androidx.compose.foundation.gestures.DragGestureDetectorKt$drag$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.DragGestureDetectorKt$drag$1 r0 = new androidx.compose.foundation.gestures.DragGestureDetectorKt$drag$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f43038b
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r4 = r0.L$1
            Ia.l r4 = (Ia.l) r4
            java.lang.Object r5 = r0.L$0
            androidx.compose.ui.input.pointer.c r5 = (androidx.compose.ui.input.pointer.InterfaceC1152c) r5
            kotlin.b.b(r8)
            r7 = r4
            r4 = r5
            goto L49
        L31:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L39:
            kotlin.b.b(r8)
        L3c:
            r0.L$0 = r4
            r0.L$1 = r7
            r0.label = r3
            java.lang.Object r8 = a(r4, r5, r0)
            if (r8 != r1) goto L49
            return r1
        L49:
            androidx.compose.ui.input.pointer.q r8 = (androidx.compose.ui.input.pointer.q) r8
            if (r8 != 0) goto L50
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            return r4
        L50:
            boolean r5 = I.b.e(r8)
            if (r5 == 0) goto L59
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            return r4
        L59:
            r7.invoke(r8)
            long r5 = r8.f14100a
            goto L3c
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.g.e(androidx.compose.ui.input.pointer.c, long, Ia.l, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, java.util.List] */
    public static final boolean f(androidx.compose.ui.input.pointer.j jVar, long j) {
        Object obj;
        ?? r10 = jVar.f14091a;
        int size = ((Collection) r10).size();
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                obj = null;
                break;
            }
            obj = r10.get(i10);
            if (androidx.compose.ui.input.pointer.p.a(((androidx.compose.ui.input.pointer.q) obj).f14100a, j)) {
                break;
            }
            i10++;
        }
        androidx.compose.ui.input.pointer.q qVar = (androidx.compose.ui.input.pointer.q) obj;
        if (qVar != null && qVar.f14103d) {
            z10 = true;
        }
        return true ^ z10;
    }

    public static final float g(Y0 y10, int i10) {
        return androidx.compose.ui.input.pointer.y.a(i10, 2) ? y10.f() * f10014a : y10.f();
    }
}
