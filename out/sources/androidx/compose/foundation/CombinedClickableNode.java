package androidx.compose.foundation;

import android.view.KeyEvent;
import androidx.collection.C0889q;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.ui.node.C1183d;
import androidx.compose.ui.node.InterfaceC1182c;
import androidx.compose.ui.platform.CompositionLocalsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.C2680e;
import kotlinx.coroutines.InterfaceC2694i0;
import kotlinx.coroutines.z0;

/* JADX INFO: compiled from: Clickable.kt */
/* JADX INFO: loaded from: classes.dex */
public final class CombinedClickableNode extends AbstractClickableNode implements InterfaceC1182c {

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public String f9739I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public Ia.a<p293xa.r> f9740J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public Ia.a<p293xa.r> f9741K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public boolean f9742L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final androidx.collection.E<InterfaceC2694i0> f9743M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public final androidx.collection.E<a> f9744N;

    /* JADX INFO: compiled from: Clickable.kt */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final z0 f9745a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f9746b;

        public a(z0 z0Var) {
            this.f9745a = z0Var;
        }
    }

    public CombinedClickableNode() {
        throw null;
    }

    public CombinedClickableNode(Ia.a aVar, Ia.a aVar2, Ia.a aVar3, androidx.compose.foundation.interaction.k kVar, androidx.compose.ui.semantics.i iVar, String str, String str2, boolean z10, boolean z11) {
        super(kVar, null, z11, str2, iVar, aVar);
        this.f9739I = str;
        this.f9740J = aVar2;
        this.f9741K = aVar3;
        this.f9742L = z10;
        int i10 = C0889q.f9204a;
        this.f9743M = new androidx.collection.E<>(6);
        this.f9744N = new androidx.collection.E<>(6);
    }

    @Override // androidx.compose.ui.h.c
    public final void K1() {
        b2();
    }

    @Override // androidx.compose.foundation.AbstractClickableNode
    public final void T1(androidx.compose.ui.semantics.w wVar) {
        if (this.f9740J != null) {
            String str = this.f9739I;
            Ia.a<Boolean> aVar = new Ia.a<Boolean>() { // from class: androidx.compose.foundation.CombinedClickableNode$applyAdditionalSemantics$1
                {
                    super(0);
                }

                @Override // Ia.a
                public final Boolean invoke() {
                    Ia.a<p293xa.r> aVar2 = this.this$0.f9740J;
                    if (aVar2 != null) {
                        aVar2.invoke();
                    }
                    return Boolean.TRUE;
                }
            };
            Oa.l<Object>[] lVarArr = androidx.compose.ui.semantics.t.f15251a;
            wVar.e(androidx.compose.ui.semantics.k.f15211c, new androidx.compose.ui.semantics.a(str, aVar));
        }
    }

    @Override // androidx.compose.foundation.AbstractClickableNode
    public final Object U1(androidx.compose.ui.input.pointer.w wVar, kotlin.coroutines.c<? super p293xa.r> cVar) {
        Object objE = TapGestureDetectorKt.e((!this.f9690v || this.f9741K == null) ? null : new Ia.l<I.d, p293xa.r>() { // from class: androidx.compose.foundation.CombinedClickableNode$clickPointerInput$2
            {
                super(1);
            }

            @Override // Ia.l
            public final p293xa.r invoke(I.d dVar) {
                long j = dVar.f3754a;
                Ia.a<p293xa.r> aVar = this.this$0.f9741K;
                if (aVar != null) {
                    aVar.invoke();
                }
                return p293xa.r.f47939a;
            }
        }, (!this.f9690v || this.f9740J == null) ? null : new Ia.l<I.d, p293xa.r>() { // from class: androidx.compose.foundation.CombinedClickableNode$clickPointerInput$3
            {
                super(1);
            }

            @Override // Ia.l
            public final p293xa.r invoke(I.d dVar) {
                long j = dVar.f3754a;
                Ia.a<p293xa.r> aVar = this.this$0.f9740J;
                if (aVar != null) {
                    aVar.invoke();
                }
                CombinedClickableNode combinedClickableNode = this.this$0;
                if (combinedClickableNode.f9742L) {
                    ((M.a) C1183d.a(combinedClickableNode, CompositionLocalsKt.f14850l)).a(0);
                }
                return p293xa.r.f47939a;
            }
        }, new Ia.l<I.d, p293xa.r>() { // from class: androidx.compose.foundation.CombinedClickableNode$clickPointerInput$5
            {
                super(1);
            }

            @Override // Ia.l
            public final p293xa.r invoke(I.d dVar) {
                long j = dVar.f3754a;
                CombinedClickableNode combinedClickableNode = this.this$0;
                if (combinedClickableNode.f9690v) {
                    combinedClickableNode.f9691w.invoke();
                }
                return p293xa.r.f47939a;
            }
        }, new CombinedClickableNode$clickPointerInput$4(this, null), wVar, cVar);
        return objE == CoroutineSingletons.f43038b ? objE : p293xa.r.f47939a;
    }

    @Override // androidx.compose.foundation.AbstractClickableNode
    public final void X1() {
        b2();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0024  */
    @Override // androidx.compose.foundation.AbstractClickableNode
    public final boolean Y1(KeyEvent keyEvent) {
        boolean z10;
        long jN = O.e.n(keyEvent);
        if (this.f9740J != null) {
            androidx.collection.E<InterfaceC2694i0> e10 = this.f9743M;
            if (e10.b(jN) == null) {
                e10.g(C2680e.c(E1(), null, null, new CombinedClickableNode$onClickKeyDownEvent$1(this, null), 3), jN);
                z10 = true;
            } else {
                z10 = false;
            }
        } else {
            z10 = false;
        }
        androidx.collection.E<a> e11 = this.f9744N;
        a aVarB = e11.b(jN);
        if (aVarB != null) {
            z0 z0Var = aVarB.f9745a;
            if (z0Var.c()) {
                z0Var.i(null);
                if (!aVarB.f9746b) {
                    this.f9691w.invoke();
                    e11.f(jN);
                }
            } else {
                e11.f(jN);
            }
        }
        return z10;
    }

    @Override // androidx.compose.foundation.AbstractClickableNode
    public final void Z1(KeyEvent keyEvent) {
        Ia.a<p293xa.r> aVar;
        long jN = O.e.n(keyEvent);
        androidx.collection.E<InterfaceC2694i0> e10 = this.f9743M;
        boolean z10 = false;
        if (e10.b(jN) != null) {
            InterfaceC2694i0 interfaceC2694i0B = e10.b(jN);
            if (interfaceC2694i0B != null) {
                if (interfaceC2694i0B.c()) {
                    interfaceC2694i0B.i(null);
                } else {
                    z10 = true;
                }
            }
            e10.f(jN);
        }
        if (this.f9741K == null) {
            if (z10) {
                return;
            }
            this.f9691w.invoke();
            return;
        }
        androidx.collection.E<a> e11 = this.f9744N;
        if (e11.b(jN) == null) {
            if (z10) {
                return;
            }
            e11.g(new a(C2680e.c(E1(), null, null, new CombinedClickableNode$onClickKeyUpEvent$2(this, jN, null), 3)), jN);
        } else {
            if (!z10 && (aVar = this.f9741K) != null) {
                aVar.invoke();
            }
            e11.f(jN);
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0046 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:15:0x0048 A[LOOP:0: B:5:0x0016->B:15:0x0048, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:37:0x004b A[EDGE_INSN: B:37:0x004b->B:16:0x004b BREAK  A[LOOP:0: B:5:0x0016->B:15:0x0048], SYNTHETIC] */
    public final void b2() {
        androidx.collection.E<InterfaceC2694i0> e10 = this.f9743M;
        Object[] objArr = e10.f9201c;
        long[] jArr = e10.f9199a;
        int length = jArr.length - 2;
        char c10 = 7;
        long j = -9187201950435737472L;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j10 = jArr[i10];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i10 != length) {
                        break;
                        break;
                    }
                    i10++;
                } else {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((j10 & 255) < 128) {
                            ((InterfaceC2694i0) objArr[(i10 << 3) + i12]).i(null);
                        }
                        j10 >>= 8;
                    }
                    if (i11 != 8) {
                        break;
                    } else if (i10 != length) {
                        break;
                    } else {
                        i10++;
                    }
                }
            }
        }
        e10.c();
        androidx.collection.E<a> e11 = this.f9744N;
        Object[] objArr2 = e11.f9201c;
        long[] jArr2 = e11.f9199a;
        int length2 = jArr2.length - 2;
        if (length2 >= 0) {
            int i13 = 0;
            while (true) {
                long j11 = jArr2[i13];
                if ((((~j11) << c10) & j11 & j) != j) {
                    int i14 = 8 - ((~(i13 - length2)) >>> 31);
                    for (int i15 = 0; i15 < i14; i15++) {
                        if ((j11 & 255) < 128) {
                            ((a) objArr2[(i13 << 3) + i15]).f9745a.i(null);
                        }
                        j11 >>= 8;
                    }
                    if (i14 != 8) {
                        break;
                    }
                }
                if (i13 == length2) {
                    break;
                }
                i13++;
                c10 = 7;
                j = -9187201950435737472L;
            }
        }
        e11.c();
    }
}
