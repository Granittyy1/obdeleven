package androidx.compose.foundation;

import android.view.KeyEvent;
import androidx.collection.C0889q;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl;
import androidx.compose.ui.node.AbstractC1187h;
import androidx.compose.ui.node.C1185f;
import androidx.compose.ui.node.InterfaceC1184e;
import androidx.compose.ui.node.Y;
import androidx.compose.ui.node.b0;
import androidx.compose.ui.node.e0;
import androidx.compose.ui.semantics.SemanticsProperties;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.C2680e;

/* JADX INFO: compiled from: Clickable.kt */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractClickableNode extends AbstractC1187h implements Y, O.f, b0, e0 {

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static final a f9678H = new a();

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public androidx.compose.foundation.interaction.m.b f9679A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public androidx.compose.foundation.interaction.g f9680B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final androidx.collection.E<androidx.compose.foundation.interaction.m.b> f9681C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public long f9682D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public androidx.compose.foundation.interaction.k f9683E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public boolean f9684F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final a f9685G;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public androidx.compose.foundation.interaction.k f9686r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public z f9687s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public String f9688t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public androidx.compose.ui.semantics.i f9689u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f9690v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Ia.a<p293xa.r> f9691w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final FocusableNode f9692x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public androidx.compose.ui.input.pointer.D f9693y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public InterfaceC1184e f9694z;

    /* JADX INFO: compiled from: Clickable.kt */
    public static final class a {
    }

    /* JADX INFO: compiled from: Clickable.kt */
    public static final class b implements PointerInputEventHandler {
        public b() {
        }

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(androidx.compose.ui.input.pointer.w wVar, kotlin.coroutines.c<? super p293xa.r> cVar) {
            Object objU1 = AbstractClickableNode.this.U1(wVar, cVar);
            return objU1 == CoroutineSingletons.f43038b ? objU1 : p293xa.r.f47939a;
        }
    }

    public AbstractClickableNode() {
        throw null;
    }

    public AbstractClickableNode(androidx.compose.foundation.interaction.k kVar, z zVar, boolean z10, String str, androidx.compose.ui.semantics.i iVar, Ia.a aVar) {
        this.f9686r = kVar;
        this.f9687s = zVar;
        this.f9688t = str;
        this.f9689u = iVar;
        this.f9690v = z10;
        this.f9691w = aVar;
        boolean z11 = false;
        this.f9692x = new FocusableNode(kVar, 0, new AbstractClickableNode$focusableNode$1(1, this, AbstractClickableNode.class, "onFocusChange", "onFocusChange(Z)V", 0));
        int i10 = C0889q.f9204a;
        this.f9681C = new androidx.collection.E<>(6);
        this.f9682D = 0L;
        androidx.compose.foundation.interaction.k kVar2 = this.f9686r;
        this.f9683E = kVar2;
        if (kVar2 == null && this.f9687s != null) {
            z11 = true;
        }
        this.f9684F = z11;
        this.f9685G = f9678H;
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
        if (!this.f9684F) {
            W1();
        }
        if (this.f9690v) {
            Q1(this.f9692x);
        }
    }

    @Override // androidx.compose.ui.node.e0
    public final Object J() {
        return this.f9685G;
    }

    @Override // androidx.compose.ui.h.c
    public final void J1() {
        V1();
        if (this.f9683E == null) {
            this.f9686r = null;
        }
        InterfaceC1184e interfaceC1184e = this.f9694z;
        if (interfaceC1184e != null) {
            R1(interfaceC1184e);
        }
        this.f9694z = null;
    }

    public abstract Object U1(androidx.compose.ui.input.pointer.w wVar, kotlin.coroutines.c<? super p293xa.r> cVar);

    /* JADX WARN: Code duplicated, block: B:22:0x0065 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:23:0x0067 A[LOOP:0: B:13:0x002b->B:23:0x0067, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:27:0x006a A[EDGE_INSN: B:27:0x006a->B:24:0x006a BREAK  A[LOOP:0: B:13:0x002b->B:23:0x0067], SYNTHETIC] */
    public final void V1() {
        androidx.compose.foundation.interaction.k kVar = this.f9686r;
        androidx.collection.E<androidx.compose.foundation.interaction.m.b> e10 = this.f9681C;
        if (kVar != null) {
            androidx.compose.foundation.interaction.m.b bVar = this.f9679A;
            if (bVar != null) {
                kVar.a(new androidx.compose.foundation.interaction.m.a(bVar));
            }
            androidx.compose.foundation.interaction.g gVar = this.f9680B;
            if (gVar != null) {
                kVar.a(new androidx.compose.foundation.interaction.h(gVar));
            }
            Object[] objArr = e10.f9201c;
            long[] jArr = e10.f9199a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i10 = 0;
                while (true) {
                    long j = jArr[i10];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i10 != length) {
                            break;
                            break;
                        }
                        i10++;
                    } else {
                        int i11 = 8 - ((~(i10 - length)) >>> 31);
                        for (int i12 = 0; i12 < i11; i12++) {
                            if ((255 & j) < 128) {
                                kVar.a(new androidx.compose.foundation.interaction.m.a((androidx.compose.foundation.interaction.m.b) objArr[(i10 << 3) + i12]));
                            }
                            j >>= 8;
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
        }
        this.f9679A = null;
        this.f9680B = null;
        e10.c();
    }

    public final void W1() {
        z zVar;
        if (this.f9694z == null && (zVar = this.f9687s) != null) {
            if (this.f9686r == null) {
                this.f9686r = new androidx.compose.foundation.interaction.l();
            }
            this.f9692x.V1(this.f9686r);
            androidx.compose.foundation.interaction.k kVar = this.f9686r;
            kotlin.jvm.internal.i.b(kVar);
            InterfaceC1184e interfaceC1184eB = zVar.b(kVar);
            Q1(interfaceC1184eB);
            this.f9694z = interfaceC1184eB;
        }
    }

    public abstract boolean Y1(KeyEvent keyEvent);

    public abstract void Z1(KeyEvent keyEvent);

    /* JADX WARN: Code duplicated, block: B:37:0x007d  */
    public final void a2(androidx.compose.foundation.interaction.k kVar, z zVar, boolean z10, String str, androidx.compose.ui.semantics.i iVar, Ia.a<p293xa.r> aVar) {
        boolean z11;
        boolean z12;
        InterfaceC1184e interfaceC1184e;
        boolean z13 = false;
        if (kotlin.jvm.internal.i.a(this.f9683E, kVar)) {
            z11 = false;
        } else {
            V1();
            this.f9683E = kVar;
            this.f9686r = kVar;
            z11 = true;
        }
        if (!kotlin.jvm.internal.i.a(this.f9687s, zVar)) {
            this.f9687s = zVar;
            z11 = true;
        }
        boolean z14 = this.f9690v;
        FocusableNode focusableNode = this.f9692x;
        if (z14 != z10) {
            if (z10) {
                Q1(focusableNode);
            } else {
                R1(focusableNode);
                V1();
            }
            C1185f.f(this).P();
            this.f9690v = z10;
        }
        if (!kotlin.jvm.internal.i.a(this.f9688t, str)) {
            this.f9688t = str;
            C1185f.f(this).P();
        }
        if (!kotlin.jvm.internal.i.a(this.f9689u, iVar)) {
            this.f9689u = iVar;
            C1185f.f(this).P();
        }
        this.f9691w = aVar;
        boolean z15 = this.f9684F;
        androidx.compose.foundation.interaction.k kVar2 = this.f9683E;
        if (z15 != (kVar2 == null && this.f9687s != null)) {
            if (kVar2 == null && this.f9687s != null) {
                z13 = true;
            }
            this.f9684F = z13;
            z12 = (z13 || this.f9694z != null) ? z11 : true;
        }
        if (z12 && ((interfaceC1184e = this.f9694z) != null || !this.f9684F)) {
            if (interfaceC1184e != null) {
                R1(interfaceC1184e);
            }
            this.f9694z = null;
            W1();
        }
        focusableNode.V1(this.f9686r);
    }

    @Override // O.f
    public final boolean k0(KeyEvent keyEvent) {
        boolean z10;
        W1();
        long jN = O.e.n(keyEvent);
        boolean z11 = this.f9690v;
        androidx.collection.E<androidx.compose.foundation.interaction.m.b> e10 = this.f9681C;
        if (z11 && O.d.a(O.e.r(keyEvent), 2) && ClickableKt.e(keyEvent)) {
            if (e10.a(jN)) {
                z10 = false;
            } else {
                androidx.compose.foundation.interaction.m.b bVar = new androidx.compose.foundation.interaction.m.b(this.f9682D);
                e10.g(bVar, jN);
                if (this.f9686r != null) {
                    C2680e.c(E1(), null, null, new AbstractClickableNode$onKeyEvent$1(this, bVar, null), 3);
                }
                z10 = true;
            }
            if (Y1(keyEvent) || z10) {
                return true;
            }
        } else if (this.f9690v && O.d.a(O.e.r(keyEvent), 1) && ClickableKt.e(keyEvent)) {
            androidx.compose.foundation.interaction.m.b bVarF = e10.f(jN);
            if (bVarF != null) {
                if (this.f9686r != null) {
                    C2680e.c(E1(), null, null, new AbstractClickableNode$onKeyEvent$2(this, bVarF, null), 3);
                }
                Z1(keyEvent);
            }
            if (bVarF != null) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.compose.ui.node.b0
    public final void p1(androidx.compose.ui.semantics.w wVar) {
        androidx.compose.ui.semantics.i iVar = this.f9689u;
        if (iVar != null) {
            androidx.compose.ui.semantics.t.k(wVar, iVar.f15203a);
        }
        String str = this.f9688t;
        Ia.a<Boolean> aVar = new Ia.a<Boolean>() { // from class: androidx.compose.foundation.AbstractClickableNode$applySemantics$1
            {
                super(0);
            }

            @Override // Ia.a
            public final Boolean invoke() {
                this.this$0.f9691w.invoke();
                return Boolean.TRUE;
            }
        };
        Oa.l<Object>[] lVarArr = androidx.compose.ui.semantics.t.f15251a;
        wVar.e(androidx.compose.ui.semantics.k.f15210b, new androidx.compose.ui.semantics.a(str, aVar));
        if (this.f9690v) {
            this.f9692x.p1(wVar);
        } else {
            wVar.e(SemanticsProperties.f15156i, p293xa.r.f47939a);
        }
        T1(wVar);
    }

    @Override // androidx.compose.ui.node.Y
    public final void q0(androidx.compose.ui.input.pointer.j jVar, PointerEventPass pointerEventPass, long j) {
        long jE = A8.A.e(j);
        this.f9682D = (((long) Float.floatToRawIntBits((int) (jE & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits((int) (jE >> 32)) << 32);
        W1();
        if (this.f9690v && pointerEventPass == PointerEventPass.f14030c) {
            int i10 = jVar.f14094d;
            if (androidx.compose.ui.input.pointer.k.a(i10, 4)) {
                C2680e.c(E1(), null, null, new AbstractClickableNode$onPointerEvent$1(this, null), 3);
            } else if (androidx.compose.ui.input.pointer.k.a(i10, 5)) {
                C2680e.c(E1(), null, null, new AbstractClickableNode$onPointerEvent$2(this, null), 3);
            }
        }
        if (this.f9693y == null) {
            b bVar = new b();
            androidx.compose.ui.input.pointer.j jVar2 = androidx.compose.ui.input.pointer.B.f14012a;
            SuspendingPointerInputModifierNodeImpl suspendingPointerInputModifierNodeImpl = new SuspendingPointerInputModifierNodeImpl(null, null, null, bVar);
            Q1(suspendingPointerInputModifierNodeImpl);
            this.f9693y = suspendingPointerInputModifierNodeImpl;
        }
        androidx.compose.ui.input.pointer.D d10 = this.f9693y;
        if (d10 != null) {
            d10.q0(jVar, pointerEventPass, j);
        }
    }

    @Override // androidx.compose.ui.node.Y
    public final void u0() {
        androidx.compose.foundation.interaction.g gVar;
        androidx.compose.foundation.interaction.k kVar = this.f9686r;
        if (kVar != null && (gVar = this.f9680B) != null) {
            kVar.a(new androidx.compose.foundation.interaction.h(gVar));
        }
        this.f9680B = null;
        androidx.compose.ui.input.pointer.D d10 = this.f9693y;
        if (d10 != null) {
            d10.u0();
        }
    }

    @Override // androidx.compose.ui.node.b0
    public final boolean v1() {
        return true;
    }

    public void X1() {
    }

    public void T1(androidx.compose.ui.semantics.w wVar) {
    }
}
