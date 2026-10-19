package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.D;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl;
import androidx.compose.ui.input.pointer.util.VelocityTracker1D;
import androidx.compose.ui.node.AbstractC1187h;
import androidx.compose.ui.node.Y;
import com.braze.support.BrazeLogger;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$LongRef;
import kotlinx.coroutines.A;
import kotlinx.coroutines.B;
import kotlinx.coroutines.C;
import kotlinx.coroutines.C2680e;
import kotlinx.coroutines.channels.BufferedChannel;

/* JADX INFO: compiled from: Draggable.kt */
/* JADX INFO: loaded from: classes.dex */
public abstract class DragGestureNode extends AbstractC1187h implements Y {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Orientation f9930r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Lambda f9931s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f9932t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public androidx.compose.foundation.interaction.k f9933u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public BufferedChannel f9934v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public androidx.compose.foundation.interaction.b f9935w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f9936x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public D f9937y;

    /* JADX WARN: Multi-variable type inference failed */
    public DragGestureNode(Ia.l<? super androidx.compose.ui.input.pointer.q, Boolean> lVar, boolean z10, androidx.compose.foundation.interaction.k kVar, Orientation orientation) {
        this.f9930r = orientation;
        this.f9931s = (Lambda) lVar;
        this.f9932t = z10;
        this.f9933u = kVar;
        new Ia.l<androidx.compose.ui.input.pointer.q, Boolean>() { // from class: androidx.compose.foundation.gestures.DragGestureNode$_canDrag$1
            {
                super(1);
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [Ia.l, kotlin.jvm.internal.Lambda] */
            @Override // Ia.l
            public final Boolean invoke(androidx.compose.ui.input.pointer.q qVar) {
                return (Boolean) this.this$0.f9931s.invoke(qVar);
            }
        };
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object T1(DragGestureNode dragGestureNode, ContinuationImpl continuationImpl) {
        DragGestureNode$processDragCancel$1 dragGestureNode$processDragCancel$1;
        dragGestureNode.getClass();
        if (continuationImpl instanceof DragGestureNode$processDragCancel$1) {
            dragGestureNode$processDragCancel$1 = (DragGestureNode$processDragCancel$1) continuationImpl;
            int i10 = dragGestureNode$processDragCancel$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                dragGestureNode$processDragCancel$1.label = i10 - Integer.MIN_VALUE;
            } else {
                dragGestureNode$processDragCancel$1 = new DragGestureNode$processDragCancel$1(dragGestureNode, continuationImpl);
            }
        } else {
            dragGestureNode$processDragCancel$1 = new DragGestureNode$processDragCancel$1(dragGestureNode, continuationImpl);
        }
        Object obj = dragGestureNode$processDragCancel$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = dragGestureNode$processDragCancel$1.label;
        if (i11 == 0) {
            kotlin.b.b(obj);
            androidx.compose.foundation.interaction.b bVar = dragGestureNode.f9935w;
            if (bVar != null) {
                androidx.compose.foundation.interaction.k kVar = dragGestureNode.f9933u;
                if (kVar != null) {
                    androidx.compose.foundation.interaction.a aVar = new androidx.compose.foundation.interaction.a(bVar);
                    dragGestureNode$processDragCancel$1.L$0 = dragGestureNode;
                    dragGestureNode$processDragCancel$1.label = 1;
                    if (kVar.c(aVar, dragGestureNode$processDragCancel$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
            }
            dragGestureNode.Z1(0L);
            return p293xa.r.f47939a;
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        dragGestureNode = (DragGestureNode) dragGestureNode$processDragCancel$1.L$0;
        kotlin.b.b(obj);
        dragGestureNode.f9935w = null;
        dragGestureNode.Z1(0L);
        return p293xa.r.f47939a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object U1(DragGestureNode dragGestureNode, f.c cVar, ContinuationImpl continuationImpl) {
        DragGestureNode$processDragStart$1 dragGestureNode$processDragStart$1;
        androidx.compose.foundation.interaction.k kVar;
        androidx.compose.foundation.interaction.b bVar;
        DragGestureNode dragGestureNode2;
        androidx.compose.foundation.interaction.b bVar2;
        dragGestureNode.getClass();
        if (continuationImpl instanceof DragGestureNode$processDragStart$1) {
            dragGestureNode$processDragStart$1 = (DragGestureNode$processDragStart$1) continuationImpl;
            int i10 = dragGestureNode$processDragStart$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                dragGestureNode$processDragStart$1.label = i10 - Integer.MIN_VALUE;
            } else {
                dragGestureNode$processDragStart$1 = new DragGestureNode$processDragStart$1(dragGestureNode, continuationImpl);
            }
        } else {
            dragGestureNode$processDragStart$1 = new DragGestureNode$processDragStart$1(dragGestureNode, continuationImpl);
        }
        Object obj = dragGestureNode$processDragStart$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = dragGestureNode$processDragStart$1.label;
        if (i11 != 0) {
            if (i11 == 1) {
                cVar = (f.c) dragGestureNode$processDragStart$1.L$1;
                dragGestureNode = (DragGestureNode) dragGestureNode$processDragStart$1.L$0;
                kotlin.b.b(obj);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bVar2 = (androidx.compose.foundation.interaction.b) dragGestureNode$processDragStart$1.L$2;
                cVar = (f.c) dragGestureNode$processDragStart$1.L$1;
                dragGestureNode2 = (DragGestureNode) dragGestureNode$processDragStart$1.L$0;
                kotlin.b.b(obj);
            }
            bVar = bVar2;
            dragGestureNode = dragGestureNode2;
            dragGestureNode.f9935w = bVar;
            dragGestureNode.Y1(cVar.f10012a);
            return p293xa.r.f47939a;
        }
        kotlin.b.b(obj);
        androidx.compose.foundation.interaction.b bVar3 = dragGestureNode.f9935w;
        if (bVar3 != null && (kVar = dragGestureNode.f9933u) != null) {
            androidx.compose.foundation.interaction.a aVar = new androidx.compose.foundation.interaction.a(bVar3);
            dragGestureNode$processDragStart$1.L$0 = dragGestureNode;
            dragGestureNode$processDragStart$1.L$1 = cVar;
            dragGestureNode$processDragStart$1.label = 1;
            if (kVar.c(aVar, dragGestureNode$processDragStart$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        bVar = new androidx.compose.foundation.interaction.b();
        androidx.compose.foundation.interaction.k kVar2 = dragGestureNode.f9933u;
        if (kVar2 != null) {
            dragGestureNode$processDragStart$1.L$0 = dragGestureNode;
            dragGestureNode$processDragStart$1.L$1 = cVar;
            dragGestureNode$processDragStart$1.L$2 = bVar;
            dragGestureNode$processDragStart$1.label = 2;
            if (kVar2.c(bVar, dragGestureNode$processDragStart$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
            dragGestureNode2 = dragGestureNode;
            bVar2 = bVar;
            bVar = bVar2;
            dragGestureNode = dragGestureNode2;
        }
        dragGestureNode.f9935w = bVar;
        dragGestureNode.Y1(cVar.f10012a);
        return p293xa.r.f47939a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object V1(DragGestureNode dragGestureNode, f.d dVar, ContinuationImpl continuationImpl) {
        DragGestureNode$processDragStop$1 dragGestureNode$processDragStop$1;
        dragGestureNode.getClass();
        if (continuationImpl instanceof DragGestureNode$processDragStop$1) {
            dragGestureNode$processDragStop$1 = (DragGestureNode$processDragStop$1) continuationImpl;
            int i10 = dragGestureNode$processDragStop$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                dragGestureNode$processDragStop$1.label = i10 - Integer.MIN_VALUE;
            } else {
                dragGestureNode$processDragStop$1 = new DragGestureNode$processDragStop$1(dragGestureNode, continuationImpl);
            }
        } else {
            dragGestureNode$processDragStop$1 = new DragGestureNode$processDragStop$1(dragGestureNode, continuationImpl);
        }
        Object obj = dragGestureNode$processDragStop$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = dragGestureNode$processDragStop$1.label;
        if (i11 == 0) {
            kotlin.b.b(obj);
            androidx.compose.foundation.interaction.b bVar = dragGestureNode.f9935w;
            if (bVar != null) {
                androidx.compose.foundation.interaction.k kVar = dragGestureNode.f9933u;
                if (kVar != null) {
                    androidx.compose.foundation.interaction.c cVar = new androidx.compose.foundation.interaction.c(bVar);
                    dragGestureNode$processDragStop$1.L$0 = dragGestureNode;
                    dragGestureNode$processDragStop$1.L$1 = dVar;
                    dragGestureNode$processDragStop$1.label = 1;
                    if (kVar.c(cVar, dragGestureNode$processDragStop$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
            }
            dragGestureNode.Z1(dVar.f10013a);
            return p293xa.r.f47939a;
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        dVar = (f.d) dragGestureNode$processDragStop$1.L$1;
        dragGestureNode = (DragGestureNode) dragGestureNode$processDragStop$1.L$0;
        kotlin.b.b(obj);
        dragGestureNode.f9935w = null;
        dragGestureNode.Z1(dVar.f10013a);
        return p293xa.r.f47939a;
    }

    @Override // androidx.compose.ui.h.c
    public final void J1() {
        this.f9936x = false;
        W1();
    }

    public final void W1() {
        androidx.compose.foundation.interaction.b bVar = this.f9935w;
        if (bVar != null) {
            androidx.compose.foundation.interaction.k kVar = this.f9933u;
            if (kVar != null) {
                kVar.a(new androidx.compose.foundation.interaction.a(bVar));
            }
            this.f9935w = null;
        }
    }

    public abstract Object X1(Ia.p<? super Ia.l<? super f.b, p293xa.r>, ? super kotlin.coroutines.c<? super p293xa.r>, ? extends Object> pVar, kotlin.coroutines.c<? super p293xa.r> cVar);

    public abstract void Y1(long j);

    public abstract void Z1(long j);

    public abstract boolean a2();

    /* JADX WARN: Multi-variable type inference failed */
    public final void b2(Ia.l<? super androidx.compose.ui.input.pointer.q, Boolean> lVar, boolean z10, androidx.compose.foundation.interaction.k kVar, Orientation orientation, boolean z11) {
        D d10;
        this.f9931s = (Lambda) lVar;
        boolean z12 = true;
        if (this.f9932t != z10) {
            this.f9932t = z10;
            if (!z10) {
                W1();
                D d11 = this.f9937y;
                if (d11 != null) {
                    R1(d11);
                }
                this.f9937y = null;
            }
            z11 = true;
        }
        if (!kotlin.jvm.internal.i.a(this.f9933u, kVar)) {
            W1();
            this.f9933u = kVar;
        }
        if (this.f9930r != orientation) {
            this.f9930r = orientation;
        } else {
            z12 = z11;
        }
        if (!z12 || (d10 = this.f9937y) == null) {
            return;
        }
        d10.D1();
    }

    @Override // androidx.compose.ui.node.Y
    public void q0(androidx.compose.ui.input.pointer.j jVar, PointerEventPass pointerEventPass, long j) {
        if (this.f9932t && this.f9937y == null) {
            PointerInputEventHandler pointerInputEventHandler = new PointerInputEventHandler() { // from class: androidx.compose.foundation.gestures.DragGestureNode$initializePointerInputNode$1

                /* JADX INFO: renamed from: androidx.compose.foundation.gestures.DragGestureNode$initializePointerInputNode$1$1, reason: invalid class name */
                /* JADX INFO: compiled from: Draggable.kt */
                @Aa.c(c = "androidx.compose.foundation.gestures.DragGestureNode$initializePointerInputNode$1$1", f = "Draggable.kt", l = {512}, m = "invokeSuspend")
                public static final class AnonymousClass1 extends SuspendLambda implements Ia.p<A, kotlin.coroutines.c<? super p293xa.r>, Object> {
                    final /* synthetic */ Ia.p<androidx.compose.ui.input.pointer.q, I.d, p293xa.r> $onDrag;
                    final /* synthetic */ Ia.a<p293xa.r> $onDragCancel;
                    final /* synthetic */ Ia.l<androidx.compose.ui.input.pointer.q, p293xa.r> $onDragEnd;
                    final /* synthetic */ Ia.q<androidx.compose.ui.input.pointer.q, androidx.compose.ui.input.pointer.q, I.d, p293xa.r> $onDragStart;
                    final /* synthetic */ Ia.a<Boolean> $shouldAwaitTouchSlop;
                    final /* synthetic */ androidx.compose.ui.input.pointer.w $this_SuspendingPointerInputModifierNode;
                    private /* synthetic */ Object L$0;
                    int label;
                    final /* synthetic */ DragGestureNode this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    public AnonymousClass1(DragGestureNode dragGestureNode, androidx.compose.ui.input.pointer.w wVar, Ia.q<? super androidx.compose.ui.input.pointer.q, ? super androidx.compose.ui.input.pointer.q, ? super I.d, p293xa.r> qVar, Ia.l<? super androidx.compose.ui.input.pointer.q, p293xa.r> lVar, Ia.a<p293xa.r> aVar, Ia.a<Boolean> aVar2, Ia.p<? super androidx.compose.ui.input.pointer.q, ? super I.d, p293xa.r> pVar, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
                        super(2, cVar);
                        this.this$0 = dragGestureNode;
                        this.$this_SuspendingPointerInputModifierNode = wVar;
                        this.$onDragStart = qVar;
                        this.$onDragEnd = lVar;
                        this.$onDragCancel = aVar;
                        this.$shouldAwaitTouchSlop = aVar2;
                        this.$onDrag = pVar;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$this_SuspendingPointerInputModifierNode, this.$onDragStart, this.$onDragEnd, this.$onDragCancel, this.$shouldAwaitTouchSlop, this.$onDrag, cVar);
                        anonymousClass1.L$0 = obj;
                        return anonymousClass1;
                    }

                    @Override // Ia.p
                    public final Object invoke(A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
                        return ((AnonymousClass1) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
                    }

                    /* JADX WARN: Code duplicated, block: B:24:0x005c  */
                    /* JADX WARN: Code duplicated, block: B:29:0x006a  */
                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        A a10;
                        CancellationException e10;
                        BufferedChannel bufferedChannel;
                        Object obj2 = CoroutineSingletons.f43038b;
                        int i10 = this.label;
                        if (i10 == 0) {
                            kotlin.b.b(obj);
                            A a11 = (A) this.L$0;
                            try {
                                Orientation orientation = this.this$0.f9930r;
                                androidx.compose.ui.input.pointer.w wVar = this.$this_SuspendingPointerInputModifierNode;
                                Ia.q<androidx.compose.ui.input.pointer.q, androidx.compose.ui.input.pointer.q, I.d, p293xa.r> qVar = this.$onDragStart;
                                Ia.l<androidx.compose.ui.input.pointer.q, p293xa.r> lVar = this.$onDragEnd;
                                Ia.a<p293xa.r> aVar = this.$onDragCancel;
                                Ia.a<Boolean> aVar2 = this.$shouldAwaitTouchSlop;
                                Ia.p<androidx.compose.ui.input.pointer.q, I.d, p293xa.r> pVar = this.$onDrag;
                                this.L$0 = a11;
                                this.label = 1;
                                float f10 = g.f10014a;
                                Object objB = ForEachGestureKt.b(wVar, new DragGestureDetectorKt$detectDragGestures$9(aVar2, new Ref$LongRef(), orientation, qVar, pVar, aVar, lVar, null), this);
                                if (objB != obj2) {
                                    objB = p293xa.r.f47939a;
                                }
                                if (objB == obj2) {
                                    return obj2;
                                }
                            } catch (CancellationException e11) {
                                a10 = a11;
                                e10 = e11;
                                bufferedChannel = this.this$0.f9934v;
                                if (bufferedChannel != null) {
                                    bufferedChannel.n(f.a.f10010a);
                                }
                                if (!B.e(a10)) {
                                    throw e10;
                                }
                            }
                        } else {
                            if (i10 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            a10 = (A) this.L$0;
                            try {
                                kotlin.b.b(obj);
                            } catch (CancellationException e12) {
                                e10 = e12;
                                bufferedChannel = this.this$0.f9934v;
                                if (bufferedChannel != null) {
                                    bufferedChannel.n(f.a.f10010a);
                                }
                                if (!B.e(a10)) {
                                    throw e10;
                                }
                            }
                        }
                        return p293xa.r.f47939a;
                    }
                }

                @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
                public final Object invoke(final androidx.compose.ui.input.pointer.w wVar, kotlin.coroutines.c<? super p293xa.r> cVar) {
                    final androidx.compose.ui.input.pointer.util.a aVar = new androidx.compose.ui.input.pointer.util.a();
                    final DragGestureNode dragGestureNode = this.f9938b;
                    Object objD = B.d(new AnonymousClass1(this.f9938b, wVar, new Ia.q<androidx.compose.ui.input.pointer.q, androidx.compose.ui.input.pointer.q, I.d, p293xa.r>() { // from class: androidx.compose.foundation.gestures.DragGestureNode$initializePointerInputNode$1$onDragStart$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(3);
                        }

                        /* JADX WARN: Type inference failed for: r8v3, types: [Ia.l, kotlin.jvm.internal.Lambda] */
                        @Override // Ia.q
                        public final p293xa.r invoke(androidx.compose.ui.input.pointer.q qVar, androidx.compose.ui.input.pointer.q qVar2, I.d dVar) {
                            androidx.compose.ui.input.pointer.q qVar3 = qVar;
                            androidx.compose.ui.input.pointer.q qVar4 = qVar2;
                            long j10 = dVar.f3754a;
                            if (((Boolean) dragGestureNode.f9931s.invoke(qVar3)).booleanValue()) {
                                DragGestureNode dragGestureNode2 = dragGestureNode;
                                if (!dragGestureNode2.f9936x) {
                                    if (dragGestureNode2.f9934v == null) {
                                        dragGestureNode2.f9934v = kotlinx.coroutines.channels.g.a(BrazeLogger.SUPPRESS, 6, null);
                                    }
                                    DragGestureNode dragGestureNode3 = dragGestureNode;
                                    dragGestureNode3.f9936x = true;
                                    C2680e.c(dragGestureNode3.E1(), null, null, new DragGestureNode$startListeningForEvents$1(dragGestureNode3, null), 3);
                                }
                                C.g(aVar, qVar3);
                                long jF = I.d.f(qVar4.f14102c, j10);
                                BufferedChannel bufferedChannel = dragGestureNode.f9934v;
                                if (bufferedChannel != null) {
                                    bufferedChannel.n(new f.c(jF));
                                }
                            }
                            return p293xa.r.f47939a;
                        }
                    }, new Ia.l<androidx.compose.ui.input.pointer.q, p293xa.r>() { // from class: androidx.compose.foundation.gestures.DragGestureNode$initializePointerInputNode$1$onDragEnd$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // Ia.l
                        public final p293xa.r invoke(androidx.compose.ui.input.pointer.q qVar) {
                            C.g(aVar, qVar);
                            float fE = wVar.getViewConfiguration().e();
                            androidx.compose.ui.input.pointer.util.a aVar2 = aVar;
                            long jA = I2.e.a(fE, fE);
                            aVar2.getClass();
                            if (p013b0.p.b(jA) <= 0.0f || p013b0.p.c(jA) <= 0.0f) {
                                R.a.b("maximumVelocity should be a positive value. You specified=" + ((Object) p013b0.p.g(jA)));
                            }
                            long jA2 = I2.e.a(aVar2.f14146a.b(p013b0.p.b(jA)), aVar2.f14147b.b(p013b0.p.c(jA)));
                            androidx.compose.ui.input.pointer.util.a aVar3 = aVar;
                            VelocityTracker1D velocityTracker1D = aVar3.f14146a;
                            P.a[] aVarArr = velocityTracker1D.f14138d;
                            Q3.d.w(aVarArr, null, 0, aVarArr.length);
                            velocityTracker1D.f14139e = 0;
                            VelocityTracker1D velocityTracker1D2 = aVar3.f14147b;
                            P.a[] aVarArr2 = velocityTracker1D2.f14138d;
                            Q3.d.w(aVarArr2, null, 0, aVarArr2.length);
                            velocityTracker1D2.f14139e = 0;
                            aVar3.f14148c = 0L;
                            BufferedChannel bufferedChannel = dragGestureNode.f9934v;
                            if (bufferedChannel != null) {
                                Ia.q<A, I.d, kotlin.coroutines.c<? super p293xa.r>, Object> qVar2 = DraggableKt.f9948a;
                                bufferedChannel.n(new f.d(I2.e.a(Float.isNaN(p013b0.p.b(jA2)) ? 0.0f : p013b0.p.b(jA2), Float.isNaN(p013b0.p.c(jA2)) ? 0.0f : p013b0.p.c(jA2))));
                            }
                            return p293xa.r.f47939a;
                        }
                    }, new Ia.a<p293xa.r>() { // from class: androidx.compose.foundation.gestures.DragGestureNode$initializePointerInputNode$1$onDragCancel$1
                        {
                            super(0);
                        }

                        @Override // Ia.a
                        public final p293xa.r invoke() {
                            BufferedChannel bufferedChannel = dragGestureNode.f9934v;
                            if (bufferedChannel != null) {
                                bufferedChannel.n(f.a.f10010a);
                            }
                            return p293xa.r.f47939a;
                        }
                    }, new Ia.a<Boolean>() { // from class: androidx.compose.foundation.gestures.DragGestureNode$initializePointerInputNode$1$shouldAwaitTouchSlop$1
                        {
                            super(0);
                        }

                        @Override // Ia.a
                        public final Boolean invoke() {
                            return Boolean.valueOf(!dragGestureNode.a2());
                        }
                    }, new Ia.p<androidx.compose.ui.input.pointer.q, I.d, p293xa.r>() { // from class: androidx.compose.foundation.gestures.DragGestureNode$initializePointerInputNode$1$onDrag$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(androidx.compose.ui.input.pointer.q qVar, I.d dVar) {
                            long j10 = dVar.f3754a;
                            C.g(aVar, qVar);
                            BufferedChannel bufferedChannel = dragGestureNode.f9934v;
                            if (bufferedChannel != null) {
                                bufferedChannel.n(new f.b(j10));
                            }
                            return p293xa.r.f47939a;
                        }
                    }, null), cVar);
                    return objD == CoroutineSingletons.f43038b ? objD : p293xa.r.f47939a;
                }
            };
            androidx.compose.ui.input.pointer.j jVar2 = androidx.compose.ui.input.pointer.B.f14012a;
            SuspendingPointerInputModifierNodeImpl suspendingPointerInputModifierNodeImpl = new SuspendingPointerInputModifierNodeImpl(null, null, null, pointerInputEventHandler);
            Q1(suspendingPointerInputModifierNodeImpl);
            this.f9937y = suspendingPointerInputModifierNodeImpl;
        }
        D d10 = this.f9937y;
        if (d10 != null) {
            d10.q0(jVar, pointerEventPass, j);
        }
    }

    @Override // androidx.compose.ui.node.Y
    public final void u0() {
        D d10 = this.f9937y;
        if (d10 != null) {
            d10.u0();
        }
    }
}
