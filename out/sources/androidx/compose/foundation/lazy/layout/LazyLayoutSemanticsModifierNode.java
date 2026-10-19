package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.node.b0;
import androidx.compose.ui.semantics.SemanticsProperties;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C2680e;

/* JADX INFO: compiled from: LazyLayoutSemantics.kt */
/* JADX INFO: loaded from: classes.dex */
public final class LazyLayoutSemanticsModifierNode extends androidx.compose.ui.h.c implements b0 {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Oa.i f10652p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public M f10653q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Orientation f10654r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f10655s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f10656t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public androidx.compose.ui.semantics.j f10657u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Ia.l<Object, Integer> f10658v = new Ia.l<Object, Integer>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsModifierNode$indexForKeyMapping$1
        {
            super(1);
        }

        @Override // Ia.l
        public final Integer invoke(Object obj) {
            InterfaceC0985u interfaceC0985u = (InterfaceC0985u) this.this$0.f10652p.invoke();
            int iB = interfaceC0985u.b();
            int i10 = 0;
            while (i10 < iB) {
                if (interfaceC0985u.c(i10).equals(obj)) {
                    return Integer.valueOf(i10);
                }
                i10++;
            }
            i10 = -1;
            return Integer.valueOf(i10);
        }
    };

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Ia.l<? super Integer, Boolean> f10659w;

    public LazyLayoutSemanticsModifierNode(Oa.i iVar, M m7, Orientation orientation, boolean z10, boolean z11) {
        this.f10652p = iVar;
        this.f10653q = m7;
        this.f10654r = orientation;
        this.f10655s = z10;
        this.f10656t = z11;
        Q1();
    }

    @Override // androidx.compose.ui.h.c
    public final boolean F1() {
        return false;
    }

    public final void Q1() {
        this.f10657u = new androidx.compose.ui.semantics.j(new Ia.a<Float>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsModifierNode$updateCachedSemanticsValues$1
            {
                super(0);
            }

            @Override // Ia.a
            public final Float invoke() {
                return Float.valueOf(this.this$0.f10653q.b());
            }
        }, this.f10656t, new Ia.a<Float>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsModifierNode$updateCachedSemanticsValues$2
            {
                super(0);
            }

            @Override // Ia.a
            public final Float invoke() {
                return Float.valueOf(this.this$0.f10653q.d());
            }
        });
        this.f10659w = this.f10655s ? new Ia.l<Integer, Boolean>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsModifierNode$updateCachedSemanticsValues$3

            /* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsModifierNode$updateCachedSemanticsValues$3$2, reason: invalid class name */
            /* JADX INFO: compiled from: LazyLayoutSemantics.kt */
            @Aa.c(c = "androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsModifierNode$updateCachedSemanticsValues$3$2", f = "LazyLayoutSemantics.kt", l = {213}, m = "invokeSuspend")
            final class AnonymousClass2 extends SuspendLambda implements Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<? super p293xa.r>, Object> {
                final /* synthetic */ int $index;
                int label;
                final /* synthetic */ LazyLayoutSemanticsModifierNode this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass2(LazyLayoutSemanticsModifierNode lazyLayoutSemanticsModifierNode, int i10, kotlin.coroutines.c<? super AnonymousClass2> cVar) {
                    super(2, cVar);
                    this.this$0 = lazyLayoutSemanticsModifierNode;
                    this.$index = i10;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
                    return new AnonymousClass2(this.this$0, this.$index, cVar);
                }

                @Override // Ia.p
                public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
                    return ((AnonymousClass2) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
                    int i10 = this.label;
                    if (i10 == 0) {
                        kotlin.b.b(obj);
                        M m7 = this.this$0.f10653q;
                        int i11 = this.$index;
                        this.label = 1;
                        if (m7.e(i11, this) == coroutineSingletons) {
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
                super(1);
            }

            @Override // Ia.l
            public final Boolean invoke(Integer num) {
                int iIntValue = num.intValue();
                InterfaceC0985u interfaceC0985u = (InterfaceC0985u) this.this$0.f10652p.invoke();
                if (iIntValue < 0 || iIntValue >= interfaceC0985u.b()) {
                    StringBuilder sbE = A8.f.e(iIntValue, "Can't scroll to index ", ", it is out of bounds [0, ");
                    sbE.append(interfaceC0985u.b());
                    sbE.append(')');
                    p245u.c.a(sbE.toString());
                }
                C2680e.c(this.this$0.E1(), null, null, new AnonymousClass2(this.this$0, iIntValue, null), 3);
                return Boolean.TRUE;
            }
        } : null;
    }

    @Override // androidx.compose.ui.node.b0
    public final void p1(androidx.compose.ui.semantics.w wVar) {
        androidx.compose.ui.semantics.t.m(wVar);
        wVar.e(SemanticsProperties.f15145K, this.f10658v);
        if (this.f10654r == Orientation.f9957b) {
            androidx.compose.ui.semantics.j jVar = this.f10657u;
            if (jVar == null) {
                kotlin.jvm.internal.i.m("scrollAxisRange");
                throw null;
            }
            androidx.compose.ui.semantics.t.o(wVar, jVar);
        } else {
            androidx.compose.ui.semantics.j jVar2 = this.f10657u;
            if (jVar2 == null) {
                kotlin.jvm.internal.i.m("scrollAxisRange");
                throw null;
            }
            androidx.compose.ui.semantics.t.h(wVar, jVar2);
        }
        Ia.l<? super Integer, Boolean> lVar = this.f10659w;
        if (lVar != null) {
            wVar.e(androidx.compose.ui.semantics.k.f15214f, new androidx.compose.ui.semantics.a(null, lVar));
        }
        androidx.compose.ui.semantics.t.c(wVar, new Ia.a<Float>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsModifierNode$applySemantics$2
            {
                super(0);
            }

            @Override // Ia.a
            public final Float invoke() {
                return Float.valueOf(this.this$0.f10653q.a() - this.this$0.f10653q.c());
            }
        });
        androidx.compose.ui.semantics.b bVarF = this.f10653q.f();
        androidx.compose.ui.semantics.v<androidx.compose.ui.semantics.b> vVar = SemanticsProperties.f15153f;
        Oa.l<Object> lVar2 = androidx.compose.ui.semantics.t.f15251a[21];
        vVar.getClass();
        wVar.e(vVar, bVarF);
    }
}
