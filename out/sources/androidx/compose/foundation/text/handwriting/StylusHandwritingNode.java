package androidx.compose.foundation.text.handwriting;

import Aa.c;
import Ia.p;
import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.ui.focus.FocusStateImpl;
import androidx.compose.ui.focus.i;
import androidx.compose.ui.focus.v;
import androidx.compose.ui.input.pointer.B;
import androidx.compose.ui.input.pointer.D;
import androidx.compose.ui.input.pointer.InterfaceC1152c;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl;
import androidx.compose.ui.input.pointer.j;
import androidx.compose.ui.input.pointer.w;
import androidx.compose.ui.node.AbstractC1187h;
import androidx.compose.ui.node.C1185f;
import androidx.compose.ui.node.C1190k;
import androidx.compose.ui.node.Y;
import androidx.compose.ui.node.d0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import p293xa.r;

/* JADX INFO: compiled from: StylusHandwriting.kt */
/* JADX INFO: loaded from: classes.dex */
public final class StylusHandwritingNode extends AbstractC1187h implements Y, i, v {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Ia.a<r> f11256r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f11257s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final D f11258t;

    public StylusHandwritingNode(Ia.a<r> aVar) {
        this.f11256r = aVar;
        PointerInputEventHandler pointerInputEventHandler = new PointerInputEventHandler() { // from class: androidx.compose.foundation.text.handwriting.StylusHandwritingNode$suspendingPointerInputModifierNode$1

            /* JADX INFO: renamed from: androidx.compose.foundation.text.handwriting.StylusHandwritingNode$suspendingPointerInputModifierNode$1$1, reason: invalid class name */
            /* JADX INFO: compiled from: StylusHandwriting.kt */
            @c(c = "androidx.compose.foundation.text.handwriting.StylusHandwritingNode$suspendingPointerInputModifierNode$1$1", f = "StylusHandwriting.kt", l = {105, 133, 171}, m = "invokeSuspend")
            public static final class AnonymousClass1 extends RestrictedSuspendLambda implements p<InterfaceC1152c, kotlin.coroutines.c<? super r>, Object> {
                private /* synthetic */ Object L$0;
                Object L$1;
                Object L$2;
                int label;
                final /* synthetic */ StylusHandwritingNode this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(StylusHandwritingNode stylusHandwritingNode, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
                    super(2, cVar);
                    this.this$0 = stylusHandwritingNode;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, cVar);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // Ia.p
                public final Object invoke(InterfaceC1152c interfaceC1152c, kotlin.coroutines.c<? super r> cVar) {
                    return ((AnonymousClass1) create(interfaceC1152c, cVar)).invokeSuspend(r.f47939a);
                }

                /* JADX WARN: Code duplicated, block: B:100:0x0103 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:41:0x00d4 A[RETURN] */
                /* JADX WARN: Code duplicated, block: B:44:0x00e3  */
                /* JADX WARN: Code duplicated, block: B:46:0x00f0  */
                /* JADX WARN: Code duplicated, block: B:48:0x00fc  */
                /* JADX WARN: Code duplicated, block: B:51:0x0101  */
                /* JADX WARN: Code duplicated, block: B:57:0x0111  */
                /* JADX WARN: Code duplicated, block: B:60:0x0123  */
                /* JADX WARN: Code duplicated, block: B:62:0x0129  */
                /* JADX WARN: Code duplicated, block: B:91:0x01a8  */
                /* JADX WARN: Code duplicated, block: B:98:0x0109 A[SYNTHETIC] */
                /* JADX WARN: Type inference failed for: r4v21, types: [java.lang.Object, java.util.List] */
                /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, java.util.List] */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x00d2 -> B:42:0x00d5). Please report as a decompilation issue!!! */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:73:0x016c -> B:75:0x016f). Please report as a decompilation issue!!! */
                /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                    jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
                    	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                    	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                    	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                    */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final java.lang.Object invokeSuspend(java.lang.Object r19) {
                    /*
                        Method dump skipped, instruction units count: 427
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.handwriting.StylusHandwritingNode$suspendingPointerInputModifierNode$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
            public final Object invoke(w wVar, kotlin.coroutines.c<? super r> cVar) {
                Object objB = ForEachGestureKt.b(wVar, new AnonymousClass1(this.f11259b, null), cVar);
                return objB == CoroutineSingletons.f43038b ? objB : r.f47939a;
            }
        };
        j jVar = B.f14012a;
        SuspendingPointerInputModifierNodeImpl suspendingPointerInputModifierNodeImpl = new SuspendingPointerInputModifierNodeImpl(null, null, null, pointerInputEventHandler);
        Q1(suspendingPointerInputModifierNodeImpl);
        this.f11258t = suspendingPointerInputModifierNodeImpl;
    }

    @Override // androidx.compose.ui.node.Y
    public final long Q() {
        C1190k c1190k = a.f11260a;
        p013b0.c cVar = C1185f.f(this).f14423z;
        c1190k.getClass();
        int i10 = d0.f14580b;
        return d0.a.b(cVar.e1(c1190k.f14587a), cVar.e1(c1190k.f14588b), cVar.e1(c1190k.f14589c), cVar.e1(c1190k.f14590d));
    }

    @Override // androidx.compose.ui.focus.i
    public final void V0(FocusStateImpl focusStateImpl) {
        this.f11257s = focusStateImpl.b();
    }

    @Override // androidx.compose.ui.node.Y
    public final void q0(j jVar, PointerEventPass pointerEventPass, long j) {
        this.f11258t.q0(jVar, pointerEventPass, j);
    }

    @Override // androidx.compose.ui.node.Y
    public final void u0() {
        this.f11258t.u0();
    }
}
