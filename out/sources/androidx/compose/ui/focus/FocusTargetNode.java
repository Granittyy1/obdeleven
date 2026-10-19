package androidx.compose.ui.focus;

import android.os.Trace;
import androidx.compose.ui.node.AbstractC1187h;
import androidx.compose.ui.node.C1183d;
import androidx.compose.ui.node.C1185f;
import androidx.compose.ui.node.H;
import androidx.compose.ui.node.InterfaceC1182c;
import androidx.compose.ui.node.K;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.O;
import androidx.compose.ui.node.P;
import androidx.compose.ui.platform.CompositionLocalsKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: compiled from: FocusTargetNode.kt */
/* JADX INFO: loaded from: classes.dex */
public final class FocusTargetNode extends androidx.compose.ui.h.c implements InterfaceC1182c, z, O, androidx.compose.ui.modifier.e {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Ia.p<y, y, p293xa.r> f13439p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Ia.l<FocusTargetNode, p293xa.r> f13440q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f13441r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f13442s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f13443t;

    /* JADX INFO: compiled from: FocusTargetNode.kt */
    public static final class FocusTargetElement extends H<FocusTargetNode> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final FocusTargetElement f13444b = new FocusTargetElement();

        private FocusTargetElement() {
        }

        @Override // androidx.compose.ui.node.H
        public final androidx.compose.ui.h.c a() {
            return new FocusTargetNode(0, null, 7);
        }

        @Override // androidx.compose.ui.node.H
        public final /* bridge */ /* synthetic */ void e(androidx.compose.ui.h.c cVar) {
        }

        public final boolean equals(Object obj) {
            return obj == this;
        }

        public final int hashCode() {
            return 1739042953;
        }
    }

    public FocusTargetNode() {
        throw null;
    }

    public FocusTargetNode(int i10, Ia.p pVar, int i11) {
        i10 = (i11 & 1) != 0 ? 1 : i10;
        this.f13439p = (i11 & 2) != 0 ? null : pVar;
        this.f13440q = null;
        this.f13443t = i10;
    }

    @Override // androidx.compose.ui.focus.z
    public final boolean D(int i10) {
        Trace.beginSection("FocusTransactions:requestFocus");
        try {
            boolean zE = false;
            if (!R1().f13459a) {
                Trace.endSection();
                return false;
            }
            int iOrdinal = C.d(this, i10).ordinal();
            if (iOrdinal == 0) {
                zE = C.e(this);
            } else if (iOrdinal != 1) {
                if (iOrdinal == 2) {
                    zE = true;
                } else if (iOrdinal != 3) {
                    throw new NoWhenBranchMatchedException();
                }
            }
            Trace.endSection();
            return zE;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // androidx.compose.ui.h.c
    public final boolean F1() {
        return false;
    }

    @Override // androidx.compose.ui.h.c
    public final void J1() {
        int iOrdinal = c0().ordinal();
        if (iOrdinal == 0 || (iOrdinal != 1 && iOrdinal == 2)) {
            p focusOwner = C1185f.g(this).getFocusOwner();
            focusOwner.m(8, true, false);
            focusOwner.c();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10, types: [androidx.compose.ui.h$c] */
    /* JADX WARN: Type inference failed for: r4v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7, types: [androidx.compose.ui.h$c] */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [androidx.compose.runtime.collection.c] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7, types: [androidx.compose.runtime.collection.c] */
    /* JADX WARN: Type inference failed for: r7v5 */
    public final void Q1(FocusStateImpl focusStateImpl, FocusStateImpl focusStateImpl2) {
        K k10;
        Ia.p<y, y, p293xa.r> pVar;
        p focusOwner = C1185f.g(this).getFocusOwner();
        FocusTargetNode focusTargetNodeR = focusOwner.r();
        if (!focusStateImpl.equals(focusStateImpl2) && (pVar = this.f13439p) != null) {
            pVar.invoke(focusStateImpl, focusStateImpl2);
        }
        androidx.compose.ui.h.c cVar = this.f13985b;
        if (!cVar.f13997o) {
            R.a.b("visitAncestors called on an unattached node");
        }
        androidx.compose.ui.h.c cVar2 = this.f13985b;
        LayoutNode layoutNodeF = C1185f.f(this);
        loop0: while (layoutNodeF != null) {
            if ((layoutNodeF.f14389G.f14368e.f13988e & 5120) != 0) {
                while (cVar2 != null) {
                    int i10 = cVar2.f13987d;
                    if ((i10 & 5120) != 0) {
                        if (cVar2 != cVar && (i10 & 1024) != 0) {
                            break loop0;
                        }
                        if ((i10 & 4096) != 0) {
                            ?? B10 = cVar2;
                            ?? cVar3 = 0;
                            while (B10 != 0) {
                                if (B10 instanceof i) {
                                    i iVar = (i) B10;
                                    if (focusTargetNodeR == focusOwner.r()) {
                                        iVar.V0(focusStateImpl2);
                                    }
                                } else if ((B10.f13987d & 4096) != 0 && (B10 instanceof AbstractC1187h)) {
                                    androidx.compose.ui.h.c cVar4 = ((AbstractC1187h) B10).f14585q;
                                    int i11 = 0;
                                    B10 = B10;
                                    cVar3 = cVar3;
                                    while (cVar4 != null) {
                                        if ((cVar4.f13987d & 4096) != 0) {
                                            i11++;
                                            if (i11 == 1) {
                                                cVar3 = cVar3;
                                                B10 = cVar4;
                                            } else {
                                                if (cVar3 == 0) {
                                                    cVar3 = new androidx.compose.runtime.collection.c(new androidx.compose.ui.h.c[16]);
                                                }
                                                if (B10 != 0) {
                                                    cVar3.b(B10);
                                                    B10 = 0;
                                                }
                                                cVar3.b(cVar4);
                                            }
                                        }
                                        cVar4 = cVar4.f13990g;
                                        B10 = B10;
                                        cVar3 = cVar3;
                                    }
                                    if (i11 == 1) {
                                    }
                                }
                                B10 = C1185f.b(cVar3);
                            }
                        }
                    }
                    cVar2 = cVar2.f13989f;
                }
            }
            layoutNodeF = layoutNodeF.G();
            cVar2 = (layoutNodeF == null || (k10 = layoutNodeF.f14389G) == null) ? null : k10.f14367d;
        }
        Ia.l<FocusTargetNode, p293xa.r> lVar = this.f13440q;
        if (lVar != null) {
            lVar.invoke(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v10, types: [androidx.compose.ui.h$c] */
    /* JADX WARN: Type inference failed for: r6v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7, types: [androidx.compose.ui.h$c] */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [androidx.compose.runtime.collection.c] */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7, types: [androidx.compose.runtime.collection.c] */
    /* JADX WARN: Type inference failed for: r9v4 */
    public final r R1() {
        boolean z10;
        K k10;
        r rVar = new r();
        rVar.f13459a = true;
        FocusRequester focusRequester = FocusRequester.f13428b;
        rVar.f13460b = focusRequester;
        rVar.f13461c = focusRequester;
        rVar.f13462d = focusRequester;
        rVar.f13463e = focusRequester;
        rVar.f13464f = focusRequester;
        rVar.f13465g = focusRequester;
        rVar.f13466h = focusRequester;
        rVar.f13467i = focusRequester;
        rVar.j = new Ia.l<InterfaceC1124f, p293xa.r>() { // from class: androidx.compose.ui.focus.FocusPropertiesImpl$onEnter$1
            @Override // Ia.l
            public final /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1124f interfaceC1124f) {
                return p293xa.r.f47939a;
            }
        };
        rVar.f13468k = new Ia.l<InterfaceC1124f, p293xa.r>() { // from class: androidx.compose.ui.focus.FocusPropertiesImpl$onExit$1
            @Override // Ia.l
            public final /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1124f interfaceC1124f) {
                return p293xa.r.f47939a;
            }
        };
        int i10 = this.f13443t;
        if (i10 == 1) {
            z10 = true;
        } else if (i10 == 0) {
            z10 = !(((N.b) C1183d.a(this, CompositionLocalsKt.f14851m)).a() == 1);
        } else {
            if (i10 != 2) {
                throw new IllegalStateException("Unknown Focusability");
            }
            z10 = false;
        }
        rVar.f13459a = z10;
        androidx.compose.ui.h.c cVar = this.f13985b;
        if (!cVar.f13997o) {
            R.a.b("visitAncestors called on an unattached node");
        }
        androidx.compose.ui.h.c cVar2 = this.f13985b;
        LayoutNode layoutNodeF = C1185f.f(this);
        loop0: while (layoutNodeF != null) {
            if ((layoutNodeF.f14389G.f14368e.f13988e & 3072) != 0) {
                while (cVar2 != null) {
                    int i11 = cVar2.f13987d;
                    if ((i11 & 3072) != 0) {
                        if (cVar2 != cVar && (i11 & 1024) != 0) {
                            break loop0;
                        }
                        if ((i11 & 2048) != 0) {
                            ?? B10 = cVar2;
                            ?? cVar3 = 0;
                            while (B10 != 0) {
                                if (B10 instanceof s) {
                                    ((s) B10).g0(rVar);
                                } else if ((B10.f13987d & 2048) != 0 && (B10 instanceof AbstractC1187h)) {
                                    androidx.compose.ui.h.c cVar4 = ((AbstractC1187h) B10).f14585q;
                                    int i12 = 0;
                                    while (cVar4 != null) {
                                        if ((cVar4.f13987d & 2048) != 0) {
                                            i12++;
                                            if (i12 == 1) {
                                                B10 = B10;
                                                cVar3 = cVar3;
                                                cVar3 = cVar3;
                                                B10 = cVar4;
                                            } else {
                                                if (cVar3 == 0) {
                                                    cVar3 = new androidx.compose.runtime.collection.c(new androidx.compose.ui.h.c[16]);
                                                }
                                                if (B10 != 0) {
                                                    cVar3.b(B10);
                                                    B10 = 0;
                                                }
                                                cVar3.b(cVar4);
                                            }
                                        } else {
                                            B10 = B10;
                                            cVar3 = cVar3;
                                        }
                                        cVar4 = cVar4.f13990g;
                                        B10 = B10;
                                        cVar3 = cVar3;
                                    }
                                    if (i12 == 1) {
                                        B10 = B10;
                                        cVar3 = cVar3;
                                    } else {
                                        B10 = B10;
                                        cVar3 = cVar3;
                                    }
                                }
                                B10 = C1185f.b(cVar3);
                            }
                        }
                    }
                    cVar2 = cVar2.f13989f;
                }
            }
            layoutNodeF = layoutNodeF.G();
            cVar2 = (layoutNodeF == null || (k10 = layoutNodeF.f14389G) == null) ? null : k10.f14367d;
        }
        return rVar;
    }

    @Override // androidx.compose.ui.focus.z
    /* JADX INFO: renamed from: S1, reason: merged with bridge method [inline-methods] */
    public final FocusStateImpl c0() {
        K k10;
        if (!this.f13997o) {
            return FocusStateImpl.f13437e;
        }
        p focusOwner = C1185f.g(this).getFocusOwner();
        FocusTargetNode focusTargetNodeR = focusOwner.r();
        if (focusTargetNodeR == null) {
            return FocusStateImpl.f13437e;
        }
        if (this == focusTargetNodeR) {
            return focusOwner.g() ? FocusStateImpl.f13436d : FocusStateImpl.f13434b;
        }
        if (focusTargetNodeR.f13997o) {
            if (!focusTargetNodeR.f13985b.f13997o) {
                R.a.b("visitAncestors called on an unattached node");
            }
            androidx.compose.ui.h.c cVar = focusTargetNodeR.f13985b.f13989f;
            LayoutNode layoutNodeF = C1185f.f(focusTargetNodeR);
            while (layoutNodeF != null) {
                if ((layoutNodeF.f14389G.f14368e.f13988e & 1024) != 0) {
                    while (cVar != null) {
                        if ((cVar.f13987d & 1024) != 0) {
                            androidx.compose.ui.h.c cVarB = cVar;
                            androidx.compose.runtime.collection.c cVar2 = null;
                            while (cVarB != null) {
                                if (cVarB instanceof FocusTargetNode) {
                                    if (this == ((FocusTargetNode) cVarB)) {
                                        return FocusStateImpl.f13435c;
                                    }
                                } else if ((cVarB.f13987d & 1024) != 0 && (cVarB instanceof AbstractC1187h)) {
                                    int i10 = 0;
                                    for (androidx.compose.ui.h.c cVar3 = ((AbstractC1187h) cVarB).f14585q; cVar3 != null; cVar3 = cVar3.f13990g) {
                                        if ((cVar3.f13987d & 1024) != 0) {
                                            i10++;
                                            if (i10 == 1) {
                                                cVarB = cVar3;
                                            } else {
                                                if (cVar2 == null) {
                                                    cVar2 = new androidx.compose.runtime.collection.c(new androidx.compose.ui.h.c[16]);
                                                }
                                                if (cVarB != null) {
                                                    cVar2.b(cVarB);
                                                    cVarB = null;
                                                }
                                                cVar2.b(cVar3);
                                            }
                                        }
                                    }
                                    if (i10 == 1) {
                                    }
                                }
                                cVarB = C1185f.b(cVar2);
                            }
                        }
                        cVar = cVar.f13989f;
                    }
                }
                layoutNodeF = layoutNodeF.G();
                cVar = (layoutNodeF == null || (k10 = layoutNodeF.f14389G) == null) ? null : k10.f14367d;
            }
        }
        return FocusStateImpl.f13437e;
    }

    public final void T1() {
        int iOrdinal = c0().ordinal();
        if (iOrdinal == 0 || iOrdinal == 2) {
            final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            P.a(this, new Ia.a<p293xa.r>() { // from class: androidx.compose.ui.focus.FocusTargetNode$invalidateFocus$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Type inference failed for: r1v1, types: [T, androidx.compose.ui.focus.r] */
                @Override // Ia.a
                public final p293xa.r invoke() {
                    ref$ObjectRef.element = this.R1();
                    return p293xa.r.f47939a;
                }
            });
            T t8 = ref$ObjectRef.element;
            if (t8 == 0) {
                kotlin.jvm.internal.i.m("focusProperties");
                throw null;
            }
            if (((q) t8).b()) {
                return;
            }
            C1185f.g(this).getFocusOwner().u(true);
        }
    }

    @Override // androidx.compose.ui.node.O
    public final void a1() {
        T1();
    }

    @Override // androidx.compose.ui.h.c
    public final void I1() {
    }
}
