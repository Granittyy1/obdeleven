package androidx.compose.foundation.gestures;

import android.os.Build;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import androidx.compose.animation.B;
import androidx.compose.animation.core.C0919t;
import androidx.compose.foundation.E;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.ui.focus.FocusTargetNode;
import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;
import androidx.compose.ui.input.nestedscroll.NestedScrollNode;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.layout.InterfaceC1170p;
import androidx.compose.ui.node.C1185f;
import androidx.compose.ui.node.C1186g;
import androidx.compose.ui.node.InterfaceC1182c;
import androidx.compose.ui.node.b0;
import java.util.Collection;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.A;
import kotlinx.coroutines.C2680e;

/* JADX INFO: compiled from: Scrollable.kt */
/* JADX INFO: loaded from: classes.dex */
public final class ScrollableNode extends DragGestureNode implements O.f, b0, InterfaceC1182c {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public j f9974A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final NestedScrollDispatcher f9975B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final t f9976C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final e f9977D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final ScrollingLogic f9978E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final ScrollableNestedScrollConnection f9979F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final ContentInViewNode f9980G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public Ia.p<? super Float, ? super Float, Boolean> f9981H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public Ia.p<? super I.d, ? super kotlin.coroutines.c<? super I.d>, ? extends Object> f9982I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public m f9983J;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public E f9984z;

    public ScrollableNode(E e10, c cVar, j jVar, Orientation orientation, u uVar, androidx.compose.foundation.interaction.k kVar, boolean z10, boolean z11) {
        super(ScrollableKt.f9967a, z10, kVar, orientation);
        this.f9984z = e10;
        this.f9974A = jVar;
        NestedScrollDispatcher nestedScrollDispatcher = new NestedScrollDispatcher();
        this.f9975B = nestedScrollDispatcher;
        t tVar = new t(z10);
        Q1(tVar);
        this.f9976C = tVar;
        e eVar = new e(new C0919t(new B(ScrollableKt.f9970d)));
        this.f9977D = eVar;
        E e11 = this.f9984z;
        j jVar2 = this.f9974A;
        ScrollingLogic scrollingLogic = new ScrollingLogic(uVar, e11, jVar2 == null ? eVar : jVar2, orientation, z11, nestedScrollDispatcher, new Ia.a<Boolean>() { // from class: androidx.compose.foundation.gestures.ScrollableNode$scrollingLogic$1
            {
                super(0);
            }

            @Override // Ia.a
            public final Boolean invoke() {
                return Boolean.valueOf(this.this$0.f13997o);
            }
        });
        this.f9978E = scrollingLogic;
        ScrollableNestedScrollConnection scrollableNestedScrollConnection = new ScrollableNestedScrollConnection(scrollingLogic, z10);
        this.f9979F = scrollableNestedScrollConnection;
        ContentInViewNode contentInViewNode = new ContentInViewNode(orientation, scrollingLogic, z11, cVar);
        Q1(contentInViewNode);
        this.f9980G = contentInViewNode;
        Q1(new NestedScrollNode(scrollableNestedScrollConnection, nestedScrollDispatcher));
        Q1(new FocusTargetNode(2, null, 4));
        androidx.compose.foundation.relocation.e eVar2 = new androidx.compose.foundation.relocation.e();
        eVar2.f11026p = contentInViewNode;
        Q1(eVar2);
        Q1(new androidx.compose.foundation.q(new Ia.l<InterfaceC1170p, p293xa.r>() { // from class: androidx.compose.foundation.gestures.ScrollableNode.1
            {
                super(1);
            }

            @Override // Ia.l
            public final p293xa.r invoke(InterfaceC1170p interfaceC1170p) {
                I.f fVarS1;
                ContentInViewNode contentInViewNode2 = ScrollableNode.this.f9980G;
                contentInViewNode2.f9913u = interfaceC1170p;
                if (contentInViewNode2.f9915w && (fVarS1 = contentInViewNode2.S1()) != null && !contentInViewNode2.T1(fVarS1, contentInViewNode2.f9916x)) {
                    contentInViewNode2.f9914v = true;
                    contentInViewNode2.U1();
                }
                contentInViewNode2.f9915w = false;
                return p293xa.r.f47939a;
            }
        }));
    }

    @Override // androidx.compose.ui.h.c
    public final boolean F1() {
        return false;
    }

    @Override // O.f
    public final boolean G(KeyEvent keyEvent) {
        return false;
    }

    @Override // androidx.compose.ui.h.c
    public final void I1() {
        if (this.f13997o) {
            p013b0.c cVar = C1185f.f(this).f14423z;
            e eVar = this.f9977D;
            eVar.getClass();
            eVar.f10008a = new C0919t(new B(cVar));
        }
        m mVar = this.f9983J;
        if (mVar != null) {
            mVar.f10023d = C1185f.f(this).f14423z;
        }
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    public final Object X1(Ia.p<? super Ia.l<? super f.b, p293xa.r>, ? super kotlin.coroutines.c<? super p293xa.r>, ? extends Object> pVar, kotlin.coroutines.c<? super p293xa.r> cVar) {
        MutatePriority mutatePriority = MutatePriority.f9811c;
        ScrollingLogic scrollingLogic = this.f9978E;
        Object objF = scrollingLogic.f(mutatePriority, new ScrollableNode$drag$2$1(pVar, scrollingLogic, null), (ContinuationImpl) cVar);
        return objF == CoroutineSingletons.f43038b ? objF : p293xa.r.f47939a;
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    public final void Z1(long j) {
        C2680e.c(this.f9975B.c(), null, null, new ScrollableNode$onDragStopped$1(this, j, null), 3);
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    public final boolean a2() {
        ScrollingLogic scrollingLogic = this.f9978E;
        if (!scrollingLogic.f9985a.a()) {
            E e10 = scrollingLogic.f9986b;
            if (!(e10 != null ? e10.c() : false)) {
                return false;
            }
        }
        return true;
    }

    public final void c2(E e10, c cVar, j jVar, Orientation orientation, u uVar, androidx.compose.foundation.interaction.k kVar, boolean z10, boolean z11) {
        boolean z12;
        boolean z13 = true;
        boolean z14 = false;
        if (this.f9932t != z10) {
            this.f9979F.f9973c = z10;
            this.f9976C.f10054q = z10;
            z12 = true;
        } else {
            z12 = false;
        }
        j jVar2 = jVar == null ? this.f9977D : jVar;
        ScrollingLogic scrollingLogic = this.f9978E;
        if (!kotlin.jvm.internal.i.a(scrollingLogic.f9985a, uVar)) {
            scrollingLogic.f9985a = uVar;
            z14 = true;
        }
        scrollingLogic.f9986b = e10;
        if (scrollingLogic.f9988d != orientation) {
            scrollingLogic.f9988d = orientation;
            z14 = true;
        }
        if (scrollingLogic.f9989e != z11) {
            scrollingLogic.f9989e = z11;
        } else {
            z13 = z14;
        }
        scrollingLogic.f9987c = jVar2;
        scrollingLogic.f9990f = this.f9975B;
        ContentInViewNode contentInViewNode = this.f9980G;
        contentInViewNode.f9908p = orientation;
        contentInViewNode.f9910r = z11;
        contentInViewNode.f9911s = cVar;
        this.f9984z = e10;
        this.f9974A = jVar;
        Ia.l<androidx.compose.ui.input.pointer.q, Boolean> lVar = ScrollableKt.f9967a;
        Orientation orientation2 = scrollingLogic.f9988d;
        Orientation orientation3 = Orientation.f9957b;
        b2(lVar, z10, kVar, orientation2 == orientation3 ? orientation3 : Orientation.f9958c, z13);
        if (z12) {
            this.f9981H = null;
            this.f9982I = null;
            C1185f.f(this).P();
        }
    }

    @Override // O.f
    public final boolean k0(KeyEvent keyEvent) {
        long jFloatToRawIntBits;
        long j;
        if (!this.f9932t) {
            return false;
        }
        if ((!O.b.a(O.e.n(keyEvent), O.b.f4718l) && !O.b.a(O.h.a(keyEvent.getKeyCode()), O.b.f4717k)) || !O.d.a(O.e.r(keyEvent), 2) || keyEvent.isCtrlPressed()) {
            return false;
        }
        boolean z10 = this.f9978E.f9988d == Orientation.f9957b;
        ContentInViewNode contentInViewNode = this.f9980G;
        if (z10) {
            int i10 = (int) (contentInViewNode.f9916x & 4294967295L);
            float f10 = O.b.a(O.h.a(keyEvent.getKeyCode()), O.b.f4717k) ? i10 : -i10;
            long jFloatToRawIntBits2 = Float.floatToRawIntBits(0.0f);
            jFloatToRawIntBits = Float.floatToRawIntBits(f10);
            j = jFloatToRawIntBits2 << 32;
        } else {
            int i11 = (int) (contentInViewNode.f9916x >> 32);
            long jFloatToRawIntBits3 = Float.floatToRawIntBits(O.b.a(O.h.a(keyEvent.getKeyCode()), O.b.f4717k) ? i11 : -i11);
            jFloatToRawIntBits = Float.floatToRawIntBits(0.0f);
            j = jFloatToRawIntBits3 << 32;
        }
        C2680e.c(E1(), null, null, new ScrollableNode$onKeyEvent$1(this, j | (jFloatToRawIntBits & 4294967295L), null), 3);
        return true;
    }

    @Override // androidx.compose.ui.node.b0
    public final void p1(androidx.compose.ui.semantics.w wVar) {
        if (this.f9932t && (this.f9981H == null || this.f9982I == null)) {
            this.f9981H = new Ia.p<Float, Float, Boolean>() { // from class: androidx.compose.foundation.gestures.ScrollableNode$setScrollSemanticsActions$1

                /* JADX INFO: renamed from: androidx.compose.foundation.gestures.ScrollableNode$setScrollSemanticsActions$1$1, reason: invalid class name */
                /* JADX INFO: compiled from: Scrollable.kt */
                @Aa.c(c = "androidx.compose.foundation.gestures.ScrollableNode$setScrollSemanticsActions$1$1", f = "Scrollable.kt", l = {518}, m = "invokeSuspend")
                final class AnonymousClass1 extends SuspendLambda implements Ia.p<A, kotlin.coroutines.c<? super p293xa.r>, Object> {
                    final /* synthetic */ float $x;
                    final /* synthetic */ float $y;
                    int label;
                    final /* synthetic */ ScrollableNode this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public AnonymousClass1(ScrollableNode scrollableNode, float f10, float f11, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
                        super(2, cVar);
                        this.this$0 = scrollableNode;
                        this.$x = f10;
                        this.$y = f11;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
                        return new AnonymousClass1(this.this$0, this.$x, this.$y, cVar);
                    }

                    @Override // Ia.p
                    public final Object invoke(A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
                        return ((AnonymousClass1) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
                        int i10 = this.label;
                        if (i10 == 0) {
                            kotlin.b.b(obj);
                            ScrollingLogic scrollingLogic = this.this$0.f9978E;
                            float f10 = this.$x;
                            float f11 = this.$y;
                            long jFloatToRawIntBits = Float.floatToRawIntBits(f10);
                            long jFloatToRawIntBits2 = Float.floatToRawIntBits(f11);
                            this.label = 1;
                            if (ScrollableKt.a(scrollingLogic, (jFloatToRawIntBits << 32) | (jFloatToRawIntBits2 & 4294967295L), this) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        } else {
                            if (i10 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            kotlin.b.b(obj);
                        }
                        return p293xa.r.f47939a;
                    }
                }

                {
                    super(2);
                }

                @Override // Ia.p
                public final Boolean invoke(Float f10, Float f11) {
                    C2680e.c(this.this$0.E1(), null, null, new AnonymousClass1(this.this$0, f10.floatValue(), f11.floatValue(), null), 3);
                    return Boolean.TRUE;
                }
            };
            this.f9982I = new ScrollableNode$setScrollSemanticsActions$2(this, null);
        }
        Ia.p<? super Float, ? super Float, Boolean> pVar = this.f9981H;
        if (pVar != null) {
            Oa.l<Object>[] lVarArr = androidx.compose.ui.semantics.t.f15251a;
            wVar.e(androidx.compose.ui.semantics.k.f15212d, new androidx.compose.ui.semantics.a(null, pVar));
        }
        Ia.p<? super I.d, ? super kotlin.coroutines.c<? super I.d>, ? extends Object> pVar2 = this.f9982I;
        if (pVar2 != null) {
            Oa.l<Object>[] lVarArr2 = androidx.compose.ui.semantics.t.f15251a;
            wVar.e(androidx.compose.ui.semantics.k.f15213e, pVar2);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v8, types: [Ia.l, kotlin.jvm.internal.Lambda] */
    @Override // androidx.compose.foundation.gestures.DragGestureNode, androidx.compose.ui.node.Y
    public final void q0(androidx.compose.ui.input.pointer.j jVar, PointerEventPass pointerEventPass, long j) {
        long j10;
        ?? r10 = jVar.f14091a;
        int size = ((Collection) r10).size();
        for (int i10 = 0; i10 < size; i10++) {
            if (((Boolean) this.f9931s.invoke((androidx.compose.ui.input.pointer.q) r10.get(i10))).booleanValue()) {
                super.q0(jVar, pointerEventPass, j);
                break;
            }
        }
        if (this.f9932t) {
            if (pointerEventPass == PointerEventPass.f14029b && androidx.compose.ui.input.pointer.k.a(jVar.f14094d, 6)) {
                if (this.f9983J == null) {
                    this.f9983J = new m(this.f9978E, new a(ViewConfiguration.get(C1186g.a(this).getContext())), new ScrollableNode$ensureMouseWheelScrollNodeInitialized$1(2, this, ScrollableNode.class, "onWheelScrollStopped", "onWheelScrollStopped-TH1AsA0(J)V", 4), C1185f.f(this).f14423z);
                }
                m mVar = this.f9983J;
                if (mVar != null) {
                    A aE1 = E1();
                    if (mVar.f10026g == null) {
                        mVar.f10026g = C2680e.c(aE1, null, null, new MouseWheelScrollingLogic$startReceivingMouseWheelEvents$1(mVar, null), 3);
                    }
                }
            }
            m mVar2 = this.f9983J;
            if (mVar2 != null && pointerEventPass == PointerEventPass.f14030c && androidx.compose.ui.input.pointer.k.a(jVar.f14094d, 6)) {
                ?? r12 = jVar.f14091a;
                Collection collection = (Collection) r12;
                int size2 = collection.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    if (((androidx.compose.ui.input.pointer.q) r12.get(i11)).b()) {
                        return;
                    }
                }
                p013b0.c cVar = mVar2.f10023d;
                a aVar = mVar2.f10021b;
                int i12 = Build.VERSION.SDK_INT;
                ViewConfiguration viewConfiguration = aVar.f10002a;
                float f10 = -(i12 > 26 ? viewConfiguration.getScaledVerticalScrollFactor() : cVar.T0(64));
                float f11 = -(i12 > 26 ? viewConfiguration.getScaledHorizontalScrollFactor() : cVar.T0(64));
                I.d dVar = new I.d(0L);
                int size3 = ((Collection) r12).size();
                int i13 = 0;
                while (true) {
                    j10 = dVar.f3754a;
                    if (i13 >= size3) {
                        break;
                    }
                    dVar = new I.d(I.d.g(j10, ((androidx.compose.ui.input.pointer.q) r12.get(i13)).j));
                    i13++;
                }
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j10 >> 32)) * f11)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j10 & 4294967295L)) * f10)));
                ScrollingLogic scrollingLogic = mVar2.f10020a;
                float fG = scrollingLogic.g(scrollingLogic.e(jFloatToRawIntBits));
                if (fG == 0.0f ? false : fG > 0.0f ? scrollingLogic.f9985a.d() : scrollingLogic.f9985a.c() ? !(mVar2.f10024e.n(new m.a(jFloatToRawIntBits, ((androidx.compose.ui.input.pointer.q) kotlin.collections.q.O(r12)).f14101b, false)) instanceof kotlinx.coroutines.channels.h.b) : mVar2.f10025f) {
                    int size4 = collection.size();
                    for (int i14 = 0; i14 < size4; i14++) {
                        ((androidx.compose.ui.input.pointer.q) r12.get(i14)).a();
                    }
                }
            }
        }
    }

    @Override // androidx.compose.ui.node.InterfaceC1184e, androidx.compose.ui.node.Y
    public final void w() {
        u0();
        if (this.f13997o) {
            p013b0.c cVar = C1185f.f(this).f14423z;
            e eVar = this.f9977D;
            eVar.getClass();
            eVar.f10008a = new C0919t(new B(cVar));
        }
        m mVar = this.f9983J;
        if (mVar != null) {
            mVar.f10023d = C1185f.f(this).f14423z;
        }
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    public final void Y1(long j) {
    }
}
