package androidx.compose.foundation.text.selection;

import androidx.compose.ui.input.pointer.InterfaceC1152c;
import androidx.compose.ui.platform.Y0;
import java.util.Collection;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.jvm.internal.Ref$BooleanRef;

/* JADX INFO: compiled from: SelectionGestures.kt */
/* JADX INFO: loaded from: classes.dex */
public final class l {
    /* JADX WARN: Code duplicated, block: B:20:0x0051  */
    /* JADX WARN: Code duplicated, block: B:23:0x005e A[LOOP:0: B:19:0x004f->B:23:0x005e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:27:0x0036 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0040 -> B:18:0x0043). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object a(androidx.compose.ui.input.pointer.InterfaceC1152c r7, kotlin.coroutines.jvm.internal.BaseContinuationImpl r8) {
        /*
            boolean r0 = r8 instanceof androidx.compose.foundation.text.selection.SelectionGesturesKt$awaitDown$1
            if (r0 == 0) goto L13
            r0 = r8
            androidx.compose.foundation.text.selection.SelectionGesturesKt$awaitDown$1 r0 = (androidx.compose.foundation.text.selection.SelectionGesturesKt$awaitDown$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.text.selection.SelectionGesturesKt$awaitDown$1 r0 = new androidx.compose.foundation.text.selection.SelectionGesturesKt$awaitDown$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f43038b
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r7 = r0.L$0
            androidx.compose.ui.input.pointer.c r7 = (androidx.compose.ui.input.pointer.InterfaceC1152c) r7
            kotlin.b.b(r8)
            goto L43
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L33:
            kotlin.b.b(r8)
        L36:
            androidx.compose.ui.input.pointer.PointerEventPass r8 = androidx.compose.ui.input.pointer.PointerEventPass.f14030c
            r0.L$0 = r7
            r0.label = r3
            java.lang.Object r8 = r7.K(r8, r0)
            if (r8 != r1) goto L43
            goto L62
        L43:
            androidx.compose.ui.input.pointer.j r8 = (androidx.compose.ui.input.pointer.j) r8
            java.lang.Object r2 = r8.f14091a
            r4 = r2
            java.util.Collection r4 = (java.util.Collection) r4
            int r4 = r4.size()
            r5 = 0
        L4f:
            if (r5 >= r4) goto L61
            java.lang.Object r6 = r2.get(r5)
            androidx.compose.ui.input.pointer.q r6 = (androidx.compose.ui.input.pointer.q) r6
            boolean r6 = I.b.c(r6)
            if (r6 != 0) goto L5e
            goto L36
        L5e:
            int r5 = r5 + 1
            goto L4f
        L61:
            r1 = r8
        L62:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.l.a(androidx.compose.ui.input.pointer.c, kotlin.coroutines.jvm.internal.BaseContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:50:0x0115  */
    /* JADX WARN: Code duplicated, block: B:52:0x0121  */
    /* JADX WARN: Code duplicated, block: B:59:0x0124 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r11v5, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r12v5, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r14v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.List] */
    public static final Object b(InterfaceC1152c interfaceC1152c, final e eVar, c cVar, androidx.compose.ui.input.pointer.j jVar, BaseContinuationImpl baseContinuationImpl) {
        SelectionGesturesKt$mouseSelection$1 selectionGesturesKt$mouseSelection$1;
        final j jVar2;
        InterfaceC1152c interfaceC1152c2;
        Ref$BooleanRef ref$BooleanRef;
        ?? r11;
        int size;
        androidx.compose.ui.input.pointer.q qVar;
        if (baseContinuationImpl instanceof SelectionGesturesKt$mouseSelection$1) {
            selectionGesturesKt$mouseSelection$1 = (SelectionGesturesKt$mouseSelection$1) baseContinuationImpl;
            int i10 = selectionGesturesKt$mouseSelection$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                selectionGesturesKt$mouseSelection$1.label = i10 - Integer.MIN_VALUE;
            } else {
                selectionGesturesKt$mouseSelection$1 = new SelectionGesturesKt$mouseSelection$1(baseContinuationImpl);
            }
        } else {
            selectionGesturesKt$mouseSelection$1 = new SelectionGesturesKt$mouseSelection$1(baseContinuationImpl);
        }
        Object objE = selectionGesturesKt$mouseSelection$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = selectionGesturesKt$mouseSelection$1.label;
        int i12 = 0;
        if (i11 == 0) {
            kotlin.b.b(objE);
            androidx.compose.ui.input.pointer.q qVar2 = cVar.f11594c;
            androidx.compose.ui.input.pointer.q qVar3 = (androidx.compose.ui.input.pointer.q) jVar.f14091a.get(0);
            if (qVar2 != null) {
                long j = qVar3.f14101b - qVar2.f14101b;
                Y0 y10 = cVar.f11592a;
                if (j < y10.a()) {
                    if (I.d.c(I.d.f(qVar2.f14102c, qVar3.f14102c)) < androidx.compose.foundation.gestures.g.g(y10, qVar2.f14108i)) {
                        cVar.f11593b++;
                    } else {
                        cVar.f11593b = 1;
                    }
                } else {
                    cVar.f11593b = 1;
                }
            } else {
                cVar.f11593b = 1;
            }
            cVar.f11594c = qVar3;
            androidx.compose.ui.input.pointer.q qVar4 = (androidx.compose.ui.input.pointer.q) jVar.f14091a.get(0);
            int i13 = cVar.f11593b;
            p005a4.p pVar = j.a.f11608a;
            if (i13 != 1) {
                jVar2 = i13 != 2 ? j.a.f11610c : j.a.f11609b;
            } else {
                jVar2 = pVar;
            }
            if (eVar.a(qVar4.f14102c, jVar2)) {
                final Ref$BooleanRef ref$BooleanRef2 = new Ref$BooleanRef();
                ref$BooleanRef2.element = !jVar2.equals(pVar);
                Ia.l<androidx.compose.ui.input.pointer.q, p293xa.r> lVar = new Ia.l<androidx.compose.ui.input.pointer.q, p293xa.r>() { // from class: androidx.compose.foundation.text.selection.SelectionGesturesKt$mouseSelection$shouldConsumeUp$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // Ia.l
                    public final p293xa.r invoke(androidx.compose.ui.input.pointer.q qVar5) {
                        androidx.compose.ui.input.pointer.q qVar6 = qVar5;
                        if (eVar.c(qVar6.f14102c, jVar2)) {
                            qVar6.a();
                            ref$BooleanRef2.element = true;
                        }
                        return p293xa.r.f47939a;
                    }
                };
                selectionGesturesKt$mouseSelection$1.L$0 = interfaceC1152c;
                selectionGesturesKt$mouseSelection$1.L$1 = eVar;
                selectionGesturesKt$mouseSelection$1.L$2 = ref$BooleanRef2;
                selectionGesturesKt$mouseSelection$1.label = 2;
                objE = androidx.compose.foundation.gestures.g.e(interfaceC1152c, qVar4.f14100a, lVar, selectionGesturesKt$mouseSelection$1);
                if (objE == coroutineSingletons) {
                    return coroutineSingletons;
                }
                interfaceC1152c2 = interfaceC1152c;
                ref$BooleanRef = ref$BooleanRef2;
                if (((Boolean) objE).booleanValue()) {
                    r11 = interfaceC1152c2.P().f14091a;
                    size = ((Collection) r11).size();
                    while (i12 < size) {
                        qVar = (androidx.compose.ui.input.pointer.q) r11.get(i12);
                        if (I.b.d(qVar)) {
                            qVar.a();
                        }
                        i12++;
                    }
                }
                eVar.b();
            }
        } else if (i11 == 1) {
            e eVar2 = (e) selectionGesturesKt$mouseSelection$1.L$1;
            InterfaceC1152c interfaceC1152c3 = (InterfaceC1152c) selectionGesturesKt$mouseSelection$1.L$0;
            kotlin.b.b(objE);
            if (((Boolean) objE).booleanValue()) {
                ?? r12 = interfaceC1152c3.P().f14091a;
                int size2 = ((Collection) r12).size();
                while (i12 < size2) {
                    androidx.compose.ui.input.pointer.q qVar5 = (androidx.compose.ui.input.pointer.q) r12.get(i12);
                    if (I.b.d(qVar5)) {
                        qVar5.a();
                    }
                    i12++;
                }
            }
            eVar2.b();
        } else {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ref$BooleanRef = (Ref$BooleanRef) selectionGesturesKt$mouseSelection$1.L$2;
            eVar = (e) selectionGesturesKt$mouseSelection$1.L$1;
            interfaceC1152c2 = (InterfaceC1152c) selectionGesturesKt$mouseSelection$1.L$0;
            kotlin.b.b(objE);
            if (((Boolean) objE).booleanValue() && ref$BooleanRef.element) {
                r11 = interfaceC1152c2.P().f14091a;
                size = ((Collection) r11).size();
                while (i12 < size) {
                    qVar = (androidx.compose.ui.input.pointer.q) r11.get(i12);
                    if (I.b.d(qVar)) {
                        qVar.a();
                    }
                    i12++;
                }
            }
            eVar.b();
        }
        return p293xa.r.f47939a;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00b4 A[Catch: CancellationException -> 0x0035, TryCatch #0 {CancellationException -> 0x0035, blocks: (B:13:0x0030, B:36:0x00ac, B:38:0x00b4, B:40:0x00c3, B:42:0x00cf, B:43:0x00d2, B:44:0x00d5, B:45:0x00d9, B:20:0x004c, B:26:0x0070, B:28:0x0074, B:33:0x0092, B:23:0x0056), top: B:50:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00c3 A[Catch: CancellationException -> 0x0035, TryCatch #0 {CancellationException -> 0x0035, blocks: (B:13:0x0030, B:36:0x00ac, B:38:0x00b4, B:40:0x00c3, B:42:0x00cf, B:43:0x00d2, B:44:0x00d5, B:45:0x00d9, B:20:0x004c, B:26:0x0070, B:28:0x0074, B:33:0x0092, B:23:0x0056), top: B:50:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00cf A[Catch: CancellationException -> 0x0035, TryCatch #0 {CancellationException -> 0x0035, blocks: (B:13:0x0030, B:36:0x00ac, B:38:0x00b4, B:40:0x00c3, B:42:0x00cf, B:43:0x00d2, B:44:0x00d5, B:45:0x00d9, B:20:0x004c, B:26:0x0070, B:28:0x0074, B:33:0x0092, B:23:0x0056), top: B:50:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00d9 A[Catch: CancellationException -> 0x0035, TRY_LEAVE, TryCatch #0 {CancellationException -> 0x0035, blocks: (B:13:0x0030, B:36:0x00ac, B:38:0x00b4, B:40:0x00c3, B:42:0x00cf, B:43:0x00d2, B:44:0x00d5, B:45:0x00d9, B:20:0x004c, B:26:0x0070, B:28:0x0074, B:33:0x0092, B:23:0x0056), top: B:50:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x00d2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r11v5, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.Object, java.util.List] */
    public static final Object c(InterfaceC1152c interfaceC1152c, final androidx.compose.foundation.text.t tVar, androidx.compose.ui.input.pointer.j jVar, BaseContinuationImpl baseContinuationImpl) {
        SelectionGesturesKt$touchSelection$1 selectionGesturesKt$touchSelection$1;
        androidx.compose.ui.input.pointer.q qVar;
        ?? r11;
        int size;
        androidx.compose.ui.input.pointer.q qVar2;
        if (baseContinuationImpl instanceof SelectionGesturesKt$touchSelection$1) {
            selectionGesturesKt$touchSelection$1 = (SelectionGesturesKt$touchSelection$1) baseContinuationImpl;
            int i10 = selectionGesturesKt$touchSelection$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                selectionGesturesKt$touchSelection$1.label = i10 - Integer.MIN_VALUE;
            } else {
                selectionGesturesKt$touchSelection$1 = new SelectionGesturesKt$touchSelection$1(baseContinuationImpl);
            }
        } else {
            selectionGesturesKt$touchSelection$1 = new SelectionGesturesKt$touchSelection$1(baseContinuationImpl);
        }
        Object objB = selectionGesturesKt$touchSelection$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = selectionGesturesKt$touchSelection$1.label;
        boolean z10 = true;
        try {
            if (i11 != 0) {
                if (i11 == 1) {
                    androidx.compose.ui.input.pointer.q qVar3 = (androidx.compose.ui.input.pointer.q) selectionGesturesKt$touchSelection$1.L$2;
                    tVar = (androidx.compose.foundation.text.t) selectionGesturesKt$touchSelection$1.L$1;
                    InterfaceC1152c interfaceC1152c2 = (InterfaceC1152c) selectionGesturesKt$touchSelection$1.L$0;
                    kotlin.b.b(objB);
                    qVar = qVar3;
                    interfaceC1152c = interfaceC1152c2;
                } else {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    tVar = (androidx.compose.foundation.text.t) selectionGesturesKt$touchSelection$1.L$1;
                    interfaceC1152c = (InterfaceC1152c) selectionGesturesKt$touchSelection$1.L$0;
                    kotlin.b.b(objB);
                }
                if (((Boolean) objB).booleanValue()) {
                    r11 = interfaceC1152c.P().f14091a;
                    size = ((Collection) r11).size();
                    for (int i12 = 0; i12 < size; i12++) {
                        qVar2 = (androidx.compose.ui.input.pointer.q) r11.get(i12);
                        if (I.b.d(qVar2)) {
                            qVar2.a();
                        }
                    }
                    tVar.a();
                } else {
                    tVar.onCancel();
                }
                return p293xa.r.f47939a;
            }
            kotlin.b.b(objB);
            qVar = (androidx.compose.ui.input.pointer.q) kotlin.collections.q.O(jVar.f14091a);
            long j = qVar.f14100a;
            selectionGesturesKt$touchSelection$1.L$0 = interfaceC1152c;
            selectionGesturesKt$touchSelection$1.L$1 = tVar;
            selectionGesturesKt$touchSelection$1.L$2 = qVar;
            selectionGesturesKt$touchSelection$1.label = 1;
            objB = androidx.compose.foundation.gestures.g.b(interfaceC1152c, j, selectionGesturesKt$touchSelection$1);
            if (objB == coroutineSingletons) {
                return coroutineSingletons;
            }
            androidx.compose.ui.input.pointer.q qVar4 = (androidx.compose.ui.input.pointer.q) objB;
            if (qVar4 != null) {
                long j10 = qVar4.f14102c;
                if (I.d.c(I.d.f(qVar.f14102c, j10)) >= androidx.compose.foundation.gestures.g.g(interfaceC1152c.getViewConfiguration(), qVar.f14108i)) {
                    z10 = false;
                }
                if (z10) {
                    tVar.b(j10);
                    long j11 = qVar4.f14100a;
                    Ia.l<androidx.compose.ui.input.pointer.q, p293xa.r> lVar = new Ia.l<androidx.compose.ui.input.pointer.q, p293xa.r>() { // from class: androidx.compose.foundation.text.selection.SelectionGesturesKt$touchSelection$2
                        {
                            super(1);
                        }

                        @Override // Ia.l
                        public final p293xa.r invoke(androidx.compose.ui.input.pointer.q qVar5) {
                            androidx.compose.ui.input.pointer.q qVar6 = qVar5;
                            tVar.e(I.b.o(qVar6, false));
                            qVar6.a();
                            return p293xa.r.f47939a;
                        }
                    };
                    selectionGesturesKt$touchSelection$1.L$0 = interfaceC1152c;
                    selectionGesturesKt$touchSelection$1.L$1 = tVar;
                    selectionGesturesKt$touchSelection$1.L$2 = null;
                    selectionGesturesKt$touchSelection$1.label = 2;
                    objB = androidx.compose.foundation.gestures.g.e(interfaceC1152c, j11, lVar, selectionGesturesKt$touchSelection$1);
                    if (objB == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    if (((Boolean) objB).booleanValue()) {
                        r11 = interfaceC1152c.P().f14091a;
                        size = ((Collection) r11).size();
                        while (i12 < size) {
                            qVar2 = (androidx.compose.ui.input.pointer.q) r11.get(i12);
                            if (I.b.d(qVar2)) {
                                qVar2.a();
                            }
                        }
                        tVar.a();
                    } else {
                        tVar.onCancel();
                    }
                }
            }
            return p293xa.r.f47939a;
        } catch (CancellationException e10) {
            tVar.onCancel();
            throw e10;
        }
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.util.List] */
    public static final boolean d(androidx.compose.ui.input.pointer.j jVar) {
        ?? r10 = jVar.f14091a;
        int size = ((Collection) r10).size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!androidx.compose.ui.input.pointer.y.a(((androidx.compose.ui.input.pointer.q) r10.get(i10)).f14108i, 2)) {
                return false;
            }
        }
        return true;
    }
}
