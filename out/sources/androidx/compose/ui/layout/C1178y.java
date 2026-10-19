package androidx.compose.ui.layout;

import android.view.ViewGroup;
import androidx.compose.runtime.AbstractC1094k;
import androidx.compose.runtime.C1085f0;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1091i0;
import androidx.compose.runtime.C1100n;
import androidx.compose.runtime.InterfaceC1082e;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.snapshots.SnapshotKt;
import androidx.compose.ui.node.AbstractC1187h;
import androidx.compose.ui.node.C1185f;
import androidx.compose.ui.node.C1203y;
import androidx.compose.ui.node.C1204z;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.LookaheadPassDelegate;
import androidx.compose.ui.node.MeasurePassDelegate;
import androidx.compose.ui.node.TraversableNode$Companion$TraverseDescendantsAction;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.platform.m1;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import java.util.Map;
import kotlin.KotlinNothingValueException;
import kotlin.collections.EmptyList;

/* JADX INFO: renamed from: androidx.compose.ui.layout.y, reason: case insensitive filesystem */
/* JADX INFO: compiled from: SubcomposeLayout.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C1178y implements InterfaceC1082e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LayoutNode f14259b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public AbstractC1094k f14260c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public f0 f14261d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f14262e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f14263f;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f14271o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f14272p;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final androidx.collection.K<LayoutNode, b> f14264g = androidx.collection.U.b();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final androidx.collection.K<Object, LayoutNode> f14265h = androidx.collection.U.b();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final c f14266i = new c();
    public final a j = new a();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final androidx.collection.K<Object, LayoutNode> f14267k = androidx.collection.U.b();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final f0.a f14268l = new f0.a(0);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final androidx.collection.K<Object, SubcomposeLayoutState.a> f14269m = androidx.collection.U.b();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final androidx.compose.runtime.collection.c<Object> f14270n = new androidx.compose.runtime.collection.c<>(new Object[16]);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final String f14273q = "Asking for intrinsic measurements of SubcomposeLayout layouts is not supported. This includes components that are built on top of SubcomposeLayout, such as lazy lists, BoxWithConstraints, TabRow, etc. To mitigate this:\n- if intrinsic measurements are used to achieve 'match parent' sizing, consider replacing the parent of the component with a custom layout which controls the order in which children are measured, making intrinsic measurement not needed\n- adding a size modifier to the component, in order to fast return the queried intrinsic measurement.";

    /* JADX INFO: renamed from: androidx.compose.ui.layout.y$a */
    /* JADX INFO: compiled from: SubcomposeLayout.kt */
    public final class a implements e0, H {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ c f14274b;

        public a() {
            this.f14274b = C1178y.this.f14266i;
        }

        @Override // p013b0.c
        public final long A0(float f10) {
            return this.f14274b.A0(f10);
        }

        @Override // androidx.compose.ui.layout.H
        public final F L0(int i10, int i11, Map map, Ia.l lVar) {
            return this.f14274b.L0(i10, i11, map, lVar);
        }

        @Override // p013b0.c
        public final float P0() {
            return this.f14274b.f14284d;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // androidx.compose.ui.layout.e0
        public final List<D> R0(Object obj, Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar) {
            C1178y c1178y = C1178y.this;
            LayoutNode layoutNodeD = c1178y.f14265h.d(obj);
            LayoutNode layoutNode = c1178y.f14259b;
            if (layoutNodeD != null && ((androidx.compose.runtime.collection.c.a) layoutNode.B()).f12946b.l((T) layoutNodeD) < c1178y.f14262e) {
                return layoutNodeD.z();
            }
            androidx.compose.runtime.collection.c<Object> cVar = c1178y.f14270n;
            if (cVar.f12945d < c1178y.f14263f) {
                R.a.a("Error: currentApproachIndex cannot be greater than the size of theapproachComposedSlotIds list.");
            }
            int i10 = cVar.f12945d;
            int i11 = c1178y.f14263f;
            if (i10 == i11) {
                cVar.b(obj);
            } else {
                Object[] objArr = cVar.f12943b;
                Object obj2 = objArr[i11];
                objArr[i11] = obj;
            }
            c1178y.f14263f++;
            androidx.collection.K<Object, LayoutNode> k10 = c1178y.f14267k;
            if (!k10.a(obj)) {
                c1178y.f14269m.l(obj, c1178y.e(obj, pVar));
                if (layoutNode.f14390H.f14630d == LayoutNode.LayoutState.f14427d) {
                    layoutNode.c0(true);
                } else {
                    LayoutNode.d0(layoutNode, true, 6);
                }
            }
            LayoutNode layoutNodeD2 = k10.d(obj);
            if (layoutNodeD2 == null) {
                return EmptyList.f42983b;
            }
            List<MeasurePassDelegate> listV0 = layoutNodeD2.f14390H.f14641p.v0();
            int size = listV0.size();
            for (int i12 = 0; i12 < size; i12++) {
                ((MeasurePassDelegate) ((androidx.compose.runtime.collection.c.a) listV0).get(i12)).f14484g.f14628b = true;
            }
            return listV0;
        }

        @Override // androidx.compose.ui.layout.InterfaceC1167m
        public final boolean S0() {
            return this.f14274b.S0();
        }

        @Override // p013b0.c
        public final float T0(float f10) {
            return this.f14274b.getDensity() * f10;
        }

        @Override // p013b0.c
        public final long W(float f10) {
            return this.f14274b.W(f10);
        }

        @Override // p013b0.c
        public final int Z0(long j) {
            return this.f14274b.Z0(j);
        }

        @Override // p013b0.c
        public final float e0(long j) {
            return this.f14274b.e0(j);
        }

        @Override // p013b0.c
        public final int e1(float f10) {
            return this.f14274b.e1(f10);
        }

        @Override // p013b0.c
        public final float getDensity() {
            return this.f14274b.f14283c;
        }

        @Override // androidx.compose.ui.layout.InterfaceC1167m
        public final LayoutDirection getLayoutDirection() {
            return this.f14274b.f14282b;
        }

        @Override // p013b0.c
        public final long o1(long j) {
            return this.f14274b.o1(j);
        }

        @Override // p013b0.c
        public final long p(long j) {
            return this.f14274b.p(j);
        }

        @Override // p013b0.c
        public final float s1(long j) {
            return this.f14274b.s1(j);
        }

        @Override // p013b0.c
        public final float u(int i10) {
            return this.f14274b.u(i10);
        }

        @Override // p013b0.c
        public final float v(float f10) {
            return f10 / this.f14274b.getDensity();
        }

        @Override // p013b0.c
        public final long w0(int i10) {
            return this.f14274b.w0(i10);
        }

        @Override // androidx.compose.ui.layout.H
        public final F y1(int i10, int i11, Map<AbstractC1155a, Integer> map, Ia.l<? super Y.a, p293xa.r> lVar) {
            return this.f14274b.L0(i10, i11, map, lVar);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.layout.y$b */
    /* JADX INFO: compiled from: SubcomposeLayout.kt */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f14276a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> f14277b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public C1100n f14278c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f14279d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f14280e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public C1085f0 f14281f;

        public b() {
            throw null;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.layout.y$c */
    /* JADX INFO: compiled from: SubcomposeLayout.kt */
    public final class c implements e0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public LayoutDirection f14282b = LayoutDirection.f15718c;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f14283c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float f14284d;

        public c() {
        }

        @Override // androidx.compose.ui.layout.H
        public final F L0(int i10, int i11, Map map, Ia.l lVar) {
            if ((i10 & (-16777216)) != 0 || ((-16777216) & i11) != 0) {
                R.a.b("Size(" + i10 + " x " + i11 + ") is out of range. Each dimension must be between 0 and 16777215.");
            }
            return new C1179z(i10, i11, map, this, C1178y.this, lVar);
        }

        @Override // p013b0.c
        public final float P0() {
            return this.f14284d;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // androidx.compose.ui.layout.e0
        public final List<D> R0(Object obj, Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar) {
            C1178y c1178y = C1178y.this;
            c1178y.c();
            LayoutNode layoutNode = c1178y.f14259b;
            LayoutNode.LayoutState layoutState = layoutNode.f14390H.f14630d;
            LayoutNode.LayoutState layoutState2 = LayoutNode.LayoutState.f14425b;
            if (layoutState != layoutState2 && layoutState != LayoutNode.LayoutState.f14427d && layoutState != LayoutNode.LayoutState.f14426c && layoutState != LayoutNode.LayoutState.f14428e) {
                R.a.b("subcompose can only be used inside the measure or layout blocks");
            }
            androidx.collection.K<Object, LayoutNode> k10 = c1178y.f14265h;
            LayoutNode layoutNodeD = k10.d(obj);
            if (layoutNodeD == null) {
                layoutNodeD = c1178y.f14267k.j(obj);
                if (layoutNodeD != null) {
                    if (c1178y.f14272p <= 0) {
                        R.a.b("Check failed.");
                    }
                    c1178y.f14272p--;
                } else {
                    layoutNodeD = c1178y.g(obj);
                    if (layoutNodeD == null) {
                        int i10 = c1178y.f14262e;
                        LayoutNode layoutNode2 = new LayoutNode(true, 2, 0);
                        layoutNode.f14415r = true;
                        layoutNode.L(i10, layoutNode2);
                        layoutNode.f14415r = false;
                        layoutNodeD = layoutNode2;
                    }
                }
                k10.l(obj, layoutNodeD);
            }
            LayoutNode layoutNode3 = layoutNodeD;
            if (kotlin.collections.q.Q(c1178y.f14262e, layoutNode.B()) != layoutNode3) {
                int iL = ((androidx.compose.runtime.collection.c.a) layoutNode.B()).f12946b.l((T) layoutNode3);
                if (iL < c1178y.f14262e) {
                    R.a.a("Key \"" + obj + "\" was already used. If you are using LazyColumn/Row please make sure you provide a unique key for each item.");
                }
                int i11 = c1178y.f14262e;
                if (i11 != iL) {
                    layoutNode.f14415r = true;
                    layoutNode.T(iL, i11, 1);
                    layoutNode.f14415r = false;
                }
            }
            c1178y.f14262e++;
            c1178y.f(layoutNode3, obj, pVar);
            return (layoutState == layoutState2 || layoutState == LayoutNode.LayoutState.f14427d) ? layoutNode3.z() : layoutNode3.y();
        }

        @Override // androidx.compose.ui.layout.InterfaceC1167m
        public final boolean S0() {
            LayoutNode.LayoutState layoutState = C1178y.this.f14259b.f14390H.f14630d;
            return layoutState == LayoutNode.LayoutState.f14428e || layoutState == LayoutNode.LayoutState.f14426c;
        }

        @Override // p013b0.c
        public final float getDensity() {
            return this.f14283c;
        }

        @Override // androidx.compose.ui.layout.InterfaceC1167m
        public final LayoutDirection getLayoutDirection() {
            return this.f14282b;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.layout.y$e */
    /* JADX INFO: compiled from: SubcomposeLayout.kt */
    public static final class e implements SubcomposeLayoutState.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Object f14287b;

        public e(Object obj) {
            this.f14287b = obj;
        }

        @Override // androidx.compose.ui.layout.SubcomposeLayoutState.a
        public final void a(int i10, long j) {
            C1178y c1178y = C1178y.this;
            LayoutNode layoutNodeD = c1178y.f14267k.d(this.f14287b);
            if (layoutNodeD == null || !layoutNodeD.c()) {
                return;
            }
            int i11 = ((androidx.compose.runtime.collection.c.a) layoutNodeD.A()).f12946b.f12945d;
            if (i10 < 0 || i10 >= i11) {
                R.a.d("Index (" + i10 + ") is out of bound of [0, " + i11 + ')');
            }
            if (layoutNodeD.r()) {
                R.a.a("Pre-measure called on node that is not placed");
            }
            LayoutNode layoutNode = c1178y.f14259b;
            layoutNode.f14415r = true;
            ((AndroidComposeView) C1203y.a(layoutNodeD)).D((LayoutNode) ((androidx.compose.runtime.collection.c.a) layoutNodeD.A()).get(i10), j);
            layoutNode.f14415r = false;
        }

        @Override // androidx.compose.ui.layout.SubcomposeLayoutState.a
        public final int b() {
            LayoutNode layoutNodeD = C1178y.this.f14267k.d(this.f14287b);
            if (layoutNodeD != null) {
                return ((androidx.compose.runtime.collection.c.a) layoutNodeD.A()).f12946b.f12945d;
            }
            return 0;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r6v0 */
        /* JADX WARN: Type inference failed for: r6v1, types: [androidx.compose.ui.h$c] */
        /* JADX WARN: Type inference failed for: r6v10 */
        /* JADX WARN: Type inference failed for: r6v11 */
        /* JADX WARN: Type inference failed for: r6v12 */
        /* JADX WARN: Type inference failed for: r6v13 */
        /* JADX WARN: Type inference failed for: r6v14 */
        /* JADX WARN: Type inference failed for: r6v15 */
        /* JADX WARN: Type inference failed for: r6v7 */
        /* JADX WARN: Type inference failed for: r6v8, types: [androidx.compose.ui.h$c] */
        /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r7v0 */
        /* JADX WARN: Type inference failed for: r7v1 */
        /* JADX WARN: Type inference failed for: r7v10 */
        /* JADX WARN: Type inference failed for: r7v11 */
        /* JADX WARN: Type inference failed for: r7v2 */
        /* JADX WARN: Type inference failed for: r7v3, types: [androidx.compose.runtime.collection.c] */
        /* JADX WARN: Type inference failed for: r7v4 */
        /* JADX WARN: Type inference failed for: r7v5 */
        /* JADX WARN: Type inference failed for: r7v6, types: [androidx.compose.runtime.collection.c] */
        /* JADX WARN: Type inference failed for: r7v8 */
        /* JADX WARN: Type inference failed for: r7v9 */
        /* JADX WARN: Type inference failed for: r8v8 */
        @Override // androidx.compose.ui.layout.SubcomposeLayoutState.a
        public final void c(Ia.l lVar) {
            androidx.compose.ui.node.K k10;
            androidx.compose.ui.h.c cVar;
            LayoutNode layoutNodeD = C1178y.this.f14267k.d(this.f14287b);
            if (layoutNodeD == null || (k10 = layoutNodeD.f14389G) == null || (cVar = k10.f14368e) == null) {
                return;
            }
            if (!cVar.f13985b.f13997o) {
                R.a.b("visitSubtreeIf called on an unattached node");
            }
            androidx.compose.runtime.collection.c cVar2 = new androidx.compose.runtime.collection.c(new androidx.compose.ui.h.c[16]);
            androidx.compose.ui.h.c cVar3 = cVar.f13985b;
            androidx.compose.ui.h.c cVar4 = cVar3.f13990g;
            if (cVar4 == null) {
                C1185f.a(cVar2, cVar3);
            } else {
                cVar2.b(cVar4);
            }
            while (true) {
                int i10 = cVar2.f12945d;
                if (i10 == 0) {
                    return;
                }
                androidx.compose.ui.h.c cVar5 = (androidx.compose.ui.h.c) cVar2.p(i10 - 1);
                if ((cVar5.f13988e & 262144) != 0) {
                    androidx.compose.ui.h.c cVar6 = cVar5;
                    while (true) {
                        if (cVar6 != null) {
                            if ((cVar6.f13987d & 262144) != 0) {
                                ?? B10 = cVar6;
                                ?? cVar7 = 0;
                                while (B10 != 0) {
                                    if (B10 instanceof androidx.compose.ui.node.e0) {
                                        androidx.compose.ui.node.e0 e0Var = (androidx.compose.ui.node.e0) B10;
                                        TraversableNode$Companion$TraverseDescendantsAction traversableNode$Companion$TraverseDescendantsAction = "androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode".equals(e0Var.J()) ? (TraversableNode$Companion$TraverseDescendantsAction) lVar.invoke(e0Var) : TraversableNode$Companion$TraverseDescendantsAction.f14569b;
                                        if (traversableNode$Companion$TraverseDescendantsAction != TraversableNode$Companion$TraverseDescendantsAction.f14571d) {
                                            if (traversableNode$Companion$TraverseDescendantsAction == TraversableNode$Companion$TraverseDescendantsAction.f14570c) {
                                                break;
                                            }
                                        } else {
                                            return;
                                        }
                                    } else if ((B10.f13987d & 262144) != 0 && (B10 instanceof AbstractC1187h)) {
                                        androidx.compose.ui.h.c cVar8 = ((AbstractC1187h) B10).f14585q;
                                        int i11 = 0;
                                        B10 = B10;
                                        cVar7 = cVar7;
                                        while (cVar8 != null) {
                                            if ((cVar8.f13987d & 262144) != 0) {
                                                i11++;
                                                if (i11 == 1) {
                                                    cVar7 = cVar7;
                                                    B10 = cVar8;
                                                } else {
                                                    if (cVar7 == 0) {
                                                        cVar7 = new androidx.compose.runtime.collection.c(new androidx.compose.ui.h.c[16]);
                                                    }
                                                    if (B10 != 0) {
                                                        cVar7.b(B10);
                                                        B10 = 0;
                                                    }
                                                    cVar7.b(cVar8);
                                                }
                                            }
                                            cVar8 = cVar8.f13990g;
                                            B10 = B10;
                                            cVar7 = cVar7;
                                        }
                                        if (i11 == 1) {
                                        }
                                    }
                                    B10 = C1185f.b(cVar7);
                                }
                            }
                            cVar6 = cVar6.f13990g;
                        }
                    }
                }
                C1185f.a(cVar2, cVar5);
            }
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // androidx.compose.ui.layout.SubcomposeLayoutState.a
        public final void dispose() {
            C1178y c1178y = C1178y.this;
            c1178y.c();
            Z z10 = (LayoutNode) c1178y.f14267k.j(this.f14287b);
            if (z10 != null) {
                if (c1178y.f14272p <= 0) {
                    R.a.b("No pre-composed items to dispose");
                }
                LayoutNode layoutNode = c1178y.f14259b;
                int iL = ((androidx.compose.runtime.collection.c.a) layoutNode.B()).f12946b.l((T) z10);
                if (iL < ((androidx.compose.runtime.collection.c.a) layoutNode.B()).f12946b.f12945d - c1178y.f14272p) {
                    R.a.b("Item is not in pre-composed item range");
                }
                c1178y.f14271o++;
                c1178y.f14272p--;
                int i10 = (((androidx.compose.runtime.collection.c.a) layoutNode.B()).f12946b.f12945d - c1178y.f14272p) - c1178y.f14271o;
                layoutNode.f14415r = true;
                layoutNode.T(iL, i10, 1);
                layoutNode.f14415r = false;
                c1178y.b(i10);
            }
        }
    }

    public C1178y(LayoutNode layoutNode, f0 f0Var) {
        this.f14259b = layoutNode;
        this.f14261d = f0Var;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x004d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x004f A[LOOP:0: B:5:0x0014->B:17:0x004f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:21:0x0052 A[EDGE_INSN: B:21:0x0052->B:18:0x0052 BREAK  A[LOOP:0: B:5:0x0014->B:17:0x004f], SYNTHETIC] */
    @Override // androidx.compose.runtime.InterfaceC1082e
    public final void a() {
        C1100n c1100n;
        LayoutNode layoutNode = this.f14259b;
        layoutNode.f14415r = true;
        androidx.collection.K<LayoutNode, b> k10 = this.f14264g;
        Object[] objArr = k10.f9129c;
        long[] jArr = k10.f9127a;
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
                        if ((255 & j) < 128 && (c1100n = ((b) objArr[(i10 << 3) + i12]).f14278c) != null) {
                            c1100n.dispose();
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
        layoutNode.Y();
        layoutNode.f14415r = false;
        k10.f();
        this.f14265h.f();
        this.f14272p = 0;
        this.f14271o = 0;
        this.f14267k.f();
        c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(int i10) {
        boolean z10;
        boolean z11;
        this.f14271o = 0;
        List<LayoutNode> listB = this.f14259b.B();
        androidx.compose.runtime.collection.c.a aVar = (androidx.compose.runtime.collection.c.a) listB;
        int i11 = (aVar.f12946b.f12945d - this.f14272p) - 1;
        if (i10 <= i11) {
            this.f14268l.clear();
            if (i10 <= i11) {
                int i12 = i10;
                while (true) {
                    b bVarD = this.f14264g.d((LayoutNode) aVar.get(i12));
                    kotlin.jvm.internal.i.b(bVarD);
                    this.f14268l.f14242b.b(bVarD.f14276a);
                    if (i12 == i11) {
                        break;
                    } else {
                        i12++;
                    }
                }
            }
            this.f14261d.a(this.f14268l);
            androidx.compose.runtime.snapshots.g gVarA = androidx.compose.runtime.snapshots.g.a.a();
            Ia.l<Object, p293xa.r> lVarE = gVarA != null ? gVarA.e() : null;
            androidx.compose.runtime.snapshots.g gVarB = androidx.compose.runtime.snapshots.g.a.b(gVarA);
            z10 = false;
            while (i11 >= i10) {
                try {
                    LayoutNode layoutNode = (LayoutNode) ((androidx.compose.runtime.collection.c.a) listB).get(i11);
                    b bVarD2 = this.f14264g.d(layoutNode);
                    kotlin.jvm.internal.i.b(bVarD2);
                    b bVar = bVarD2;
                    Object obj = bVar.f14276a;
                    if (this.f14268l.f14242b.a(obj)) {
                        this.f14271o++;
                        if (((Boolean) bVar.f14281f.getValue()).booleanValue()) {
                            C1204z c1204z = layoutNode.f14390H;
                            MeasurePassDelegate measurePassDelegate = c1204z.f14641p;
                            LayoutNode.UsageByParent usageByParent = LayoutNode.UsageByParent.f14433d;
                            measurePassDelegate.f14489m = usageByParent;
                            LookaheadPassDelegate lookaheadPassDelegate = c1204z.f14642q;
                            if (lookaheadPassDelegate != null) {
                                lookaheadPassDelegate.f14447k = usageByParent;
                            }
                            bVar.f14281f.setValue(Boolean.FALSE);
                            z10 = true;
                        }
                    } else {
                        LayoutNode layoutNode2 = this.f14259b;
                        layoutNode2.f14415r = true;
                        this.f14264g.j(layoutNode);
                        C1100n c1100n = bVar.f14278c;
                        if (c1100n != null) {
                            c1100n.dispose();
                        }
                        this.f14259b.Z(i11, 1);
                        layoutNode2.f14415r = false;
                    }
                    this.f14265h.j(obj);
                    i11--;
                } catch (Throwable th) {
                    androidx.compose.runtime.snapshots.g.a.d(gVarA, gVarB, lVarE);
                    throw th;
                }
            }
            p293xa.r rVar = p293xa.r.f47939a;
            androidx.compose.runtime.snapshots.g.a.d(gVarA, gVarB, lVarE);
        } else {
            z10 = false;
        }
        if (z10) {
            synchronized (SnapshotKt.f13154c) {
                androidx.collection.L<androidx.compose.runtime.snapshots.o> l10 = SnapshotKt.j.f13192h;
                z11 = l10 != null && l10.c();
            }
            if (z11) {
                SnapshotKt.a();
            }
        }
        c();
    }

    public final void c() {
        int i10 = ((androidx.compose.runtime.collection.c.a) this.f14259b.B()).f12946b.f12945d;
        androidx.collection.K<LayoutNode, b> k10 = this.f14264g;
        if (k10.f9131e != i10) {
            R.a.a("Inconsistency between the count of nodes tracked by the state (" + k10.f9131e + ") and the children count on the SubcomposeLayout (" + i10 + "). Are you trying to use the state of the disposed SubcomposeLayout?");
        }
        if ((i10 - this.f14271o) - this.f14272p < 0) {
            StringBuilder sbE = A8.f.e(i10, "Incorrect state. Total children ", ". Reusable children ");
            sbE.append(this.f14271o);
            sbE.append(". Precomposed children ");
            sbE.append(this.f14272p);
            R.a.a(sbE.toString());
        }
        androidx.collection.K<Object, LayoutNode> k11 = this.f14267k;
        if (k11.f9131e == this.f14272p) {
            return;
        }
        R.a.a("Incorrect state. Precomposed children " + this.f14272p + ". Map size " + k11.f9131e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void d(boolean z10) {
        this.f14272p = 0;
        this.f14267k.f();
        List<LayoutNode> listB = this.f14259b.B();
        int i10 = ((androidx.compose.runtime.collection.c.a) listB).f12946b.f12945d;
        if (this.f14271o != i10) {
            this.f14271o = i10;
            androidx.compose.runtime.snapshots.g gVarA = androidx.compose.runtime.snapshots.g.a.a();
            Ia.l<Object, p293xa.r> lVarE = gVarA != null ? gVarA.e() : null;
            androidx.compose.runtime.snapshots.g gVarB = androidx.compose.runtime.snapshots.g.a.b(gVarA);
            for (int i11 = 0; i11 < i10; i11++) {
                try {
                    LayoutNode layoutNode = (LayoutNode) ((androidx.compose.runtime.collection.c.a) listB).get(i11);
                    b bVarD = this.f14264g.d(layoutNode);
                    if (bVarD != null && ((Boolean) bVarD.f14281f.getValue()).booleanValue()) {
                        C1204z c1204z = layoutNode.f14390H;
                        MeasurePassDelegate measurePassDelegate = c1204z.f14641p;
                        LayoutNode.UsageByParent usageByParent = LayoutNode.UsageByParent.f14433d;
                        measurePassDelegate.f14489m = usageByParent;
                        LookaheadPassDelegate lookaheadPassDelegate = c1204z.f14642q;
                        if (lookaheadPassDelegate != null) {
                            lookaheadPassDelegate.f14447k = usageByParent;
                        }
                        if (z10) {
                            C1100n c1100n = bVarD.f14278c;
                            if (c1100n != null) {
                                c1100n.y();
                            }
                            bVarD.f14281f = J0.f(Boolean.FALSE);
                        } else {
                            bVarD.f14281f.setValue(Boolean.FALSE);
                        }
                        bVarD.f14276a = SubcomposeLayoutKt.f14210a;
                    }
                } catch (Throwable th) {
                    androidx.compose.runtime.snapshots.g.a.d(gVarA, gVarB, lVarE);
                    throw th;
                }
            }
            p293xa.r rVar = p293xa.r.f47939a;
            androidx.compose.runtime.snapshots.g.a.d(gVarA, gVarB, lVarE);
            this.f14265h.f();
        }
        c();
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final SubcomposeLayoutState.a e(Object obj, Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar) {
        LayoutNode layoutNode = this.f14259b;
        if (!layoutNode.c()) {
            return new d();
        }
        c();
        if (!this.f14265h.b(obj)) {
            this.f14269m.j(obj);
            androidx.collection.K<Object, LayoutNode> k10 = this.f14267k;
            Object objD = k10.d(obj);
            if (objD == null) {
                objD = g(obj);
                if (objD != null) {
                    int iL = ((androidx.compose.runtime.collection.c.a) layoutNode.B()).f12946b.l((T) objD);
                    int i10 = ((androidx.compose.runtime.collection.c.a) layoutNode.B()).f12946b.f12945d;
                    layoutNode.f14415r = true;
                    layoutNode.T(iL, i10, 1);
                    layoutNode.f14415r = false;
                    this.f14272p++;
                } else {
                    int i11 = ((androidx.compose.runtime.collection.c.a) layoutNode.B()).f12946b.f12945d;
                    LayoutNode layoutNode2 = new LayoutNode(true, 2, 0);
                    layoutNode.f14415r = true;
                    layoutNode.L(i11, layoutNode2);
                    layoutNode.f14415r = false;
                    this.f14272p++;
                    objD = layoutNode2;
                }
                k10.l(obj, objD);
            }
            f((LayoutNode) objD, obj, pVar);
        }
        return new e(obj);
    }

    public final void f(LayoutNode layoutNode, Object obj, Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar) {
        androidx.collection.K<LayoutNode, b> k10 = this.f14264g;
        b bVarD = k10.d(layoutNode);
        if (bVarD == null) {
            ComposableLambdaImpl composableLambdaImpl = ComposableSingletons$SubcomposeLayoutKt.f14173a;
            bVarD = new b();
            bVarD.f14276a = obj;
            bVarD.f14277b = composableLambdaImpl;
            bVarD.f14278c = null;
            bVarD.f14281f = J0.f(Boolean.TRUE);
            k10.l(layoutNode, bVarD);
        }
        final b bVar = bVarD;
        C1100n c1100n = bVar.f14278c;
        boolean zO = c1100n != null ? c1100n.o() : true;
        if (bVar.f14277b != pVar || zO || bVar.f14279d) {
            bVar.f14277b = pVar;
            androidx.compose.runtime.snapshots.g gVarA = androidx.compose.runtime.snapshots.g.a.a();
            Ia.l<Object, p293xa.r> lVarE = gVarA != null ? gVarA.e() : null;
            androidx.compose.runtime.snapshots.g gVarB = androidx.compose.runtime.snapshots.g.a.b(gVarA);
            try {
                LayoutNode layoutNode2 = this.f14259b;
                layoutNode2.f14415r = true;
                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar2 = bVar.f14277b;
                C1100n c1100n2 = bVar.f14278c;
                AbstractC1094k abstractC1094k = this.f14260c;
                if (abstractC1094k == null) {
                    R.a.c("parent composition reference not set");
                    throw new KotlinNothingValueException();
                }
                boolean z10 = bVar.f14280e;
                ComposableLambdaImpl composableLambdaImpl2 = new ComposableLambdaImpl(true, -1750409193, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.ui.layout.LayoutNodeSubcompositionsState$subcompose$3$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f, Integer num) {
                        InterfaceC1084f interfaceC1084f2 = interfaceC1084f;
                        int iIntValue = num.intValue();
                        if (interfaceC1084f2.C(iIntValue & 1, (iIntValue & 3) != 2)) {
                            Boolean bool = (Boolean) bVar.f14281f.getValue();
                            boolean zBooleanValue = bool.booleanValue();
                            Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar3 = pVar2;
                            interfaceC1084f2.n(bool);
                            boolean zC = interfaceC1084f2.c(zBooleanValue);
                            if (zBooleanValue) {
                                pVar3.invoke(interfaceC1084f2, 0);
                            } else {
                                interfaceC1084f2.o(zC);
                            }
                            interfaceC1084f2.d();
                        } else {
                            interfaceC1084f2.w();
                        }
                        return p293xa.r.f47939a;
                    }
                });
                if (c1100n2 == null || c1100n2.d()) {
                    ViewGroup.LayoutParams layoutParams = m1.f15068a;
                    c1100n2 = new C1100n(abstractC1094k, new androidx.compose.ui.node.f0(layoutNode));
                }
                if (z10) {
                    C1086g c1086g = c1100n2.f13095t;
                    c1086g.f13021y = 100;
                    c1086g.f13020x = true;
                    if (c1100n2.f13097v) {
                        C1091i0.b("The composition is disposed");
                    }
                    c1100n2.f13078b.a(c1100n2, composableLambdaImpl2);
                    if (c1086g.f12985E || c1086g.f13021y != 100) {
                        C1091i0.a("Cannot disable reuse from root if it was caused by other groups");
                    }
                    c1086g.f13021y = -1;
                    c1086g.f13020x = false;
                } else {
                    c1100n2.w(composableLambdaImpl2);
                }
                bVar.f14278c = c1100n2;
                bVar.f14280e = false;
                layoutNode2.f14415r = false;
                p293xa.r rVar = p293xa.r.f47939a;
                androidx.compose.runtime.snapshots.g.a.d(gVarA, gVarB, lVarE);
                bVar.f14279d = false;
            } catch (Throwable th) {
                androidx.compose.runtime.snapshots.g.a.d(gVarA, gVarB, lVarE);
                throw th;
            }
        }
    }

    public final LayoutNode g(Object obj) {
        androidx.collection.K<LayoutNode, b> k10;
        int i10;
        if (this.f14271o == 0) {
            return null;
        }
        LayoutNode layoutNode = this.f14259b;
        androidx.compose.runtime.collection.c.a aVar = (androidx.compose.runtime.collection.c.a) layoutNode.B();
        int i11 = aVar.f12946b.f12945d - this.f14272p;
        int i12 = i11 - this.f14271o;
        int i13 = i11 - 1;
        int i14 = i13;
        while (true) {
            k10 = this.f14264g;
            if (i14 < i12) {
                i10 = -1;
                break;
            }
            b bVarD = k10.d((LayoutNode) aVar.get(i14));
            kotlin.jvm.internal.i.b(bVarD);
            if (kotlin.jvm.internal.i.a(bVarD.f14276a, obj)) {
                i10 = i14;
                break;
            }
            i14--;
        }
        if (i10 == -1) {
            while (true) {
                if (i13 < i12) {
                    i14 = i13;
                    break;
                }
                b bVarD2 = k10.d((LayoutNode) aVar.get(i13));
                kotlin.jvm.internal.i.b(bVarD2);
                b bVar = bVarD2;
                Object obj2 = bVar.f14276a;
                if (obj2 == SubcomposeLayoutKt.f14210a || this.f14261d.b(obj, obj2)) {
                    bVar.f14276a = obj;
                    i14 = i13;
                    i10 = i14;
                    break;
                }
                i13--;
            }
        }
        if (i10 == -1) {
            return null;
        }
        if (i14 != i12) {
            layoutNode.f14415r = true;
            layoutNode.T(i14, i12, 1);
            layoutNode.f14415r = false;
        }
        this.f14271o--;
        LayoutNode layoutNode2 = (LayoutNode) aVar.get(i12);
        b bVarD3 = k10.d(layoutNode2);
        kotlin.jvm.internal.i.b(bVarD3);
        b bVar2 = bVarD3;
        bVar2.f14281f = J0.f(Boolean.TRUE);
        bVar2.f14280e = true;
        bVar2.f14279d = true;
        return layoutNode2;
    }

    @Override // androidx.compose.runtime.InterfaceC1082e
    public final void h() {
        d(true);
    }

    @Override // androidx.compose.runtime.InterfaceC1082e
    public final void p() {
        d(false);
    }

    /* JADX INFO: renamed from: androidx.compose.ui.layout.y$d */
    /* JADX INFO: compiled from: SubcomposeLayout.kt */
    public static final class d implements SubcomposeLayoutState.a {
        @Override // androidx.compose.ui.layout.SubcomposeLayoutState.a
        public final void dispose() {
        }
    }
}
