package androidx.compose.ui.focus;

import android.view.KeyEvent;
import androidx.collection.I;
import androidx.collection.U;
import androidx.compose.ui.node.AbstractC1187h;
import androidx.compose.ui.node.C1185f;
import androidx.compose.ui.node.H;
import androidx.compose.ui.node.K;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: compiled from: FocusOwnerImpl.kt */
/* JADX INFO: loaded from: classes.dex */
public final class FocusOwnerImpl implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Ia.p<C1123e, I.f, Boolean> f13414a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Ia.l<C1123e, Boolean> f13415b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Ia.a<p293xa.r> f13416c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Ia.a<I.f> f13417d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Ia.a<LayoutDirection> f13418e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final FocusTargetNode f13419f = new FocusTargetNode(2, null, 6);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final l f13420g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final B f13421h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final FocusOwnerImpl$modifier$1 f13422i;
    public androidx.collection.F j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final I<m> f13423k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public FocusTargetNode f13424l;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [androidx.compose.ui.focus.FocusOwnerImpl$modifier$1] */
    public FocusOwnerImpl(Ia.l<? super Ia.a<p293xa.r>, p293xa.r> lVar, Ia.p<? super C1123e, ? super I.f, Boolean> pVar, Ia.l<? super C1123e, Boolean> lVar2, Ia.a<p293xa.r> aVar, Ia.a<I.f> aVar2, Ia.a<? extends LayoutDirection> aVar3) {
        this.f13414a = pVar;
        this.f13415b = lVar2;
        this.f13416c = aVar;
        this.f13417d = aVar2;
        this.f13418e = aVar3;
        this.f13420g = new l(lVar, new FocusOwnerImpl$focusInvalidationManager$1(0, this, FocusOwnerImpl.class, "invalidateOwnerFocusState", "invalidateOwnerFocusState()V", 0), new FocusOwnerImpl$focusInvalidationManager$2(this, FocusOwnerImpl.class, "rootState", "getRootState()Landroidx/compose/ui/focus/FocusState;", 0), new FocusOwnerImpl$focusInvalidationManager$3(this, FocusOwnerImpl.class, "activeFocusTargetNode", "getActiveFocusTargetNode()Landroidx/compose/ui/focus/FocusTargetNode;", 0));
        B b10 = new B();
        U.b();
        this.f13421h = b10;
        this.f13422i = new H<FocusTargetNode>() { // from class: androidx.compose.ui.focus.FocusOwnerImpl$modifier$1
            @Override // androidx.compose.ui.node.H
            public final androidx.compose.ui.h.c a() {
                return this.f13425b.f13419f;
            }

            @Override // androidx.compose.ui.node.H
            public final /* bridge */ /* synthetic */ void e(androidx.compose.ui.h.c cVar) {
            }

            public final boolean equals(Object obj) {
                return obj == this;
            }

            public final int hashCode() {
                return this.f13425b.f13419f.hashCode();
            }
        };
        this.f13423k = new I<>(1);
    }

    @Override // androidx.compose.ui.focus.p
    public final void a(i iVar) {
        l lVar = this.f13420g;
        if (!lVar.f13457f.d(iVar) || lVar.f13458g) {
            return;
        }
        lVar.f13452a.invoke(new FocusInvalidationManager$setUpOnRequestApplyChangesListener$1(0, lVar, l.class, "invalidateNodes", "invalidateNodes()V", 0));
        lVar.f13458g = true;
    }

    @Override // androidx.compose.ui.focus.p
    public final void b(FocusTargetNode focusTargetNode) {
        l lVar = this.f13420g;
        if (!lVar.f13456e.d(focusTargetNode) || lVar.f13458g) {
            return;
        }
        lVar.f13452a.invoke(new FocusInvalidationManager$setUpOnRequestApplyChangesListener$1(0, lVar, l.class, "invalidateNodes", "invalidateNodes()V", 0));
        lVar.f13458g = true;
    }

    @Override // androidx.compose.ui.focus.p
    public final void c() {
        l lVar = this.f13420g;
        if (lVar.f13458g) {
            return;
        }
        lVar.f13452a.invoke(new FocusInvalidationManager$setUpOnRequestApplyChangesListener$1(0, lVar, l.class, "invalidateNodes", "invalidateNodes()V", 0));
        lVar.f13458g = true;
    }

    @Override // androidx.compose.ui.focus.p
    public final FocusOwnerImpl$modifier$1 d() {
        return this.f13422i;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0075 A[PHI: r12
      0x0075: PHI (r12v16 androidx.compose.ui.focus.FocusRequester) = (r12v13 androidx.compose.ui.focus.FocusRequester), (r12v20 androidx.compose.ui.focus.FocusRequester) binds: [B:43:0x0096, B:28:0x006f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v11, types: [Ia.l, kotlin.jvm.internal.Lambda] */
    /* JADX WARN: Type inference failed for: r15v4, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r15v9, types: [Ia.l, kotlin.jvm.internal.Lambda] */
    /* JADX WARN: Type inference failed for: r6v10, types: [androidx.compose.runtime.collection.c] */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7, types: [androidx.compose.runtime.collection.c] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /*  JADX ERROR: NullPointerException in pass: PrepareForCodeGen
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.getSVar()" because "result" is null
        	at jadx.core.dex.visitors.PrepareForCodeGen.removeInstructions(PrepareForCodeGen.java:118)
        	at jadx.core.dex.visitors.PrepareForCodeGen.visit(PrepareForCodeGen.java:85)
        */
    @Override // androidx.compose.ui.focus.p
    public final java.lang.Boolean e(int r20, I.f r21, Ia.l<? super androidx.compose.ui.focus.FocusTargetNode, java.lang.Boolean> r22) {
        /*
            Method dump skipped, instruction units count: 631
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.FocusOwnerImpl.e(int, I.f, Ia.l):java.lang.Boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [androidx.compose.ui.h$c] */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17, types: [androidx.compose.runtime.collection.c] */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20, types: [androidx.compose.runtime.collection.c] */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v25, types: [androidx.compose.ui.h$c] */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v47 */
    /* JADX WARN: Type inference failed for: r0v48 */
    /* JADX WARN: Type inference failed for: r0v49 */
    /* JADX WARN: Type inference failed for: r0v50 */
    /* JADX WARN: Type inference failed for: r0v51 */
    /* JADX WARN: Type inference failed for: r0v52 */
    /* JADX WARN: Type inference failed for: r0v9, types: [androidx.compose.ui.h$c] */
    /* JADX WARN: Type inference failed for: r15v10, types: [androidx.compose.ui.h$c] */
    /* JADX WARN: Type inference failed for: r15v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v13 */
    /* JADX WARN: Type inference failed for: r15v14 */
    /* JADX WARN: Type inference failed for: r15v15 */
    /* JADX WARN: Type inference failed for: r15v17 */
    /* JADX WARN: Type inference failed for: r15v18 */
    /* JADX WARN: Type inference failed for: r15v4, types: [androidx.compose.ui.h$c] */
    /* JADX WARN: Type inference failed for: r15v5, types: [androidx.compose.ui.h$c] */
    /* JADX WARN: Type inference failed for: r15v9 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18, types: [androidx.compose.runtime.collection.c] */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v21, types: [androidx.compose.runtime.collection.c] */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16, types: [androidx.compose.ui.h$c] */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v18, types: [androidx.compose.ui.h$c] */
    /* JADX WARN: Type inference failed for: r7v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v22 */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v24 */
    /* JADX WARN: Type inference failed for: r7v25 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r8v27 */
    /* JADX WARN: Type inference failed for: r8v28 */
    /* JADX WARN: Type inference failed for: r8v29 */
    /* JADX WARN: Type inference failed for: r8v30, types: [androidx.compose.runtime.collection.c] */
    /* JADX WARN: Type inference failed for: r8v31 */
    /* JADX WARN: Type inference failed for: r8v32 */
    /* JADX WARN: Type inference failed for: r8v33, types: [androidx.compose.runtime.collection.c] */
    /* JADX WARN: Type inference failed for: r8v35 */
    /* JADX WARN: Type inference failed for: r8v36 */
    /* JADX WARN: Type inference failed for: r8v37 */
    /* JADX WARN: Type inference failed for: r8v38 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r9v16 */
    @Override // androidx.compose.ui.focus.p
    public final boolean f(Q.c cVar, Ia.a<Boolean> aVar) {
        Q.a aVar2;
        int size;
        K k10;
        ?? B10;
        K k11;
        if (this.f13420g.f13458g) {
            System.out.println((Object) "FocusRelatedWarning: Dispatching rotary event while the focus system is invalidated.");
            return false;
        }
        FocusTargetNode focusTargetNodeA = D.a(this.f13419f);
        if (focusTargetNodeA != null) {
            if (!focusTargetNodeA.f13985b.f13997o) {
                R.a.b("visitAncestors called on an unattached node");
            }
            androidx.compose.ui.h.c cVar2 = focusTargetNodeA.f13985b;
            LayoutNode layoutNodeF = C1185f.f(focusTargetNodeA);
            loop0: while (true) {
                if (layoutNodeF == null) {
                    B10 = 0;
                    break;
                }
                if ((layoutNodeF.f14389G.f14368e.f13988e & 16384) != 0) {
                    while (cVar2 != null) {
                        if ((cVar2.f13987d & 16384) != 0) {
                            ?? cVar3 = 0;
                            B10 = cVar2;
                            while (B10 != 0) {
                                if (B10 instanceof Q.a) {
                                    break loop0;
                                }
                                if ((B10.f13987d & 16384) != 0 && (B10 instanceof AbstractC1187h)) {
                                    androidx.compose.ui.h.c cVar4 = ((AbstractC1187h) B10).f14585q;
                                    int i10 = 0;
                                    while (cVar4 != null) {
                                        if ((cVar4.f13987d & 16384) != 0) {
                                            i10++;
                                            if (i10 == 1) {
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
                                    if (i10 == 1) {
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
                        cVar2 = cVar2.f13989f;
                    }
                }
                layoutNodeF = layoutNodeF.G();
                cVar2 = (layoutNodeF == null || (k11 = layoutNodeF.f14389G) == null) ? null : k11.f14367d;
            }
            aVar2 = (Q.a) B10;
        } else {
            aVar2 = null;
        }
        if (aVar2 != null) {
            if (!aVar2.getNode().f13997o) {
                R.a.b("visitAncestors called on an unattached node");
            }
            androidx.compose.ui.h.c cVar5 = aVar2.getNode().f13989f;
            LayoutNode layoutNodeF2 = C1185f.f(aVar2);
            ArrayList arrayList = null;
            while (layoutNodeF2 != null) {
                if ((layoutNodeF2.f14389G.f14368e.f13988e & 16384) != 0) {
                    while (cVar5 != null) {
                        if ((cVar5.f13987d & 16384) != 0) {
                            androidx.compose.ui.h.c cVarB = cVar5;
                            androidx.compose.runtime.collection.c cVar6 = null;
                            while (cVarB != null) {
                                if (cVarB instanceof Q.a) {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    arrayList.add(cVarB);
                                } else if ((cVarB.f13987d & 16384) != 0 && (cVarB instanceof AbstractC1187h)) {
                                    int i11 = 0;
                                    for (androidx.compose.ui.h.c cVar7 = ((AbstractC1187h) cVarB).f14585q; cVar7 != null; cVar7 = cVar7.f13990g) {
                                        if ((cVar7.f13987d & 16384) != 0) {
                                            i11++;
                                            if (i11 == 1) {
                                                cVarB = cVar7;
                                            } else {
                                                if (cVar6 == null) {
                                                    cVar6 = new androidx.compose.runtime.collection.c(new androidx.compose.ui.h.c[16]);
                                                }
                                                if (cVarB != null) {
                                                    cVar6.b(cVarB);
                                                    cVarB = null;
                                                }
                                                cVar6.b(cVar7);
                                            }
                                        }
                                    }
                                    if (i11 == 1) {
                                    }
                                }
                                cVarB = C1185f.b(cVar6);
                            }
                        }
                        cVar5 = cVar5.f13989f;
                    }
                }
                layoutNodeF2 = layoutNodeF2.G();
                cVar5 = (layoutNodeF2 == null || (k10 = layoutNodeF2.f14389G) == null) ? null : k10.f14367d;
            }
            if (arrayList != null && (size = arrayList.size() - 1) >= 0) {
                while (true) {
                    int i12 = size - 1;
                    if (((Q.a) arrayList.get(size)).x0(cVar)) {
                        return true;
                    }
                    if (i12 < 0) {
                        break;
                    }
                    size = i12;
                }
            }
            ?? node = aVar2.getNode();
            ?? cVar8 = 0;
            while (node != 0) {
                if (node instanceof Q.a) {
                    if (((Q.a) node).x0(cVar)) {
                        return true;
                    }
                } else if ((node.f13987d & 16384) != 0 && (node instanceof AbstractC1187h)) {
                    androidx.compose.ui.h.c cVar9 = ((AbstractC1187h) node).f14585q;
                    int i13 = 0;
                    while (cVar9 != null) {
                        if ((cVar9.f13987d & 16384) != 0) {
                            i13++;
                            if (i13 == 1) {
                                node = node;
                                cVar8 = cVar8;
                                cVar8 = cVar8;
                                node = cVar9;
                            } else {
                                if (cVar8 == 0) {
                                    cVar8 = new androidx.compose.runtime.collection.c(new androidx.compose.ui.h.c[16]);
                                }
                                if (node != 0) {
                                    cVar8.b(node);
                                    node = 0;
                                }
                                cVar8.b(cVar9);
                            }
                        } else {
                            node = node;
                            cVar8 = cVar8;
                        }
                        cVar9 = cVar9.f13990g;
                        node = node;
                        cVar8 = cVar8;
                    }
                    if (i13 == 1) {
                        node = node;
                        cVar8 = cVar8;
                    } else {
                        node = node;
                        cVar8 = cVar8;
                    }
                }
                node = C1185f.b(cVar8);
            }
            if (aVar.invoke().booleanValue()) {
                return true;
            }
            ?? node2 = aVar2.getNode();
            ?? cVar10 = 0;
            while (node2 != 0) {
                if (node2 instanceof Q.a) {
                    if (((Q.a) node2).h1(cVar)) {
                        return true;
                    }
                } else if ((node2.f13987d & 16384) != 0 && (node2 instanceof AbstractC1187h)) {
                    androidx.compose.ui.h.c cVar11 = ((AbstractC1187h) node2).f14585q;
                    int i14 = 0;
                    while (cVar11 != null) {
                        if ((cVar11.f13987d & 16384) != 0) {
                            i14++;
                            if (i14 == 1) {
                                cVar10 = cVar10;
                                node2 = node2;
                                cVar10 = cVar10;
                                node2 = cVar11;
                            } else {
                                if (cVar10 == 0) {
                                    cVar10 = new androidx.compose.runtime.collection.c(new androidx.compose.ui.h.c[16]);
                                }
                                if (node2 != 0) {
                                    cVar10.b(node2);
                                    node2 = 0;
                                }
                                cVar10.b(cVar11);
                            }
                        } else {
                            cVar10 = cVar10;
                            node2 = node2;
                        }
                        cVar11 = cVar11.f13990g;
                        cVar10 = cVar10;
                        node2 = node2;
                    }
                    if (i14 == 1) {
                        cVar10 = cVar10;
                        node2 = node2;
                    } else {
                        cVar10 = cVar10;
                        node2 = node2;
                    }
                }
                node2 = C1185f.b(cVar10);
            }
            if (arrayList != null) {
                int size2 = arrayList.size();
                for (int i15 = 0; i15 < size2; i15++) {
                    if (((Q.a) arrayList.get(i15)).h1(cVar)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // androidx.compose.ui.focus.p
    public final boolean g() {
        return false;
    }

    @Override // androidx.compose.ui.focus.p
    public final FocusStateImpl i() {
        return this.f13419f.c0();
    }

    /* JADX WARN: Code duplicated, block: B:118:0x0152 A[Catch: all -> 0x001a, TryCatch #0 {all -> 0x001a, blocks: (B:3:0x0008, B:5:0x000f, B:10:0x001d, B:14:0x0027, B:17:0x0032, B:19:0x0038, B:20:0x003d, B:22:0x0045, B:24:0x004a, B:26:0x0050, B:30:0x0056, B:128:0x0168, B:130:0x016e, B:131:0x0171, B:133:0x017c, B:136:0x0188, B:140:0x0192, B:143:0x0198, B:144:0x019d, B:164:0x01d6, B:145:0x01a1, B:147:0x01a7, B:149:0x01ab, B:151:0x01b3, B:153:0x01b9, B:157:0x01c0, B:159:0x01c9, B:160:0x01cd, B:161:0x01d0, B:165:0x01db, B:166:0x01de, B:168:0x01e4, B:170:0x01e8, B:173:0x01ef, B:175:0x01f7, B:182:0x020e, B:183:0x0210, B:184:0x021e, B:186:0x0222, B:188:0x0226, B:215:0x027b, B:192:0x0232, B:194:0x023b, B:196:0x023f, B:198:0x0246, B:200:0x024c, B:202:0x024f, B:203:0x0252, B:205:0x0258, B:206:0x025f, B:208:0x0267, B:209:0x026c, B:211:0x0272, B:212:0x0275, B:216:0x0286, B:220:0x0296, B:221:0x02a4, B:223:0x02a8, B:225:0x02ac, B:252:0x0301, B:229:0x02b8, B:231:0x02c1, B:233:0x02c5, B:235:0x02cc, B:237:0x02d2, B:239:0x02d5, B:240:0x02d8, B:242:0x02de, B:243:0x02e5, B:245:0x02ed, B:246:0x02f2, B:248:0x02f8, B:249:0x02fb, B:254:0x030e, B:256:0x0315, B:261:0x0327, B:262:0x0329, B:34:0x005e, B:36:0x0064, B:37:0x0067, B:39:0x006f, B:42:0x007b, B:46:0x0085, B:77:0x00d7, B:79:0x00db, B:49:0x008a, B:51:0x0090, B:53:0x0094, B:55:0x009c, B:57:0x00a2, B:61:0x00a9, B:63:0x00b2, B:64:0x00b6, B:65:0x00b9, B:68:0x00bf, B:69:0x00c4, B:70:0x00c7, B:72:0x00cd, B:74:0x00d1, B:80:0x00e1, B:82:0x00e7, B:83:0x00ea, B:85:0x00f4, B:88:0x0100, B:92:0x010a, B:123:0x015c, B:125:0x0160, B:95:0x010f, B:97:0x0115, B:99:0x0119, B:101:0x0121, B:103:0x0127, B:107:0x012e, B:109:0x0137, B:110:0x013b, B:111:0x013e, B:114:0x0144, B:115:0x0149, B:116:0x014c, B:118:0x0152, B:120:0x0156), top: B:267:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:125:0x0160 A[Catch: all -> 0x001a, TryCatch #0 {all -> 0x001a, blocks: (B:3:0x0008, B:5:0x000f, B:10:0x001d, B:14:0x0027, B:17:0x0032, B:19:0x0038, B:20:0x003d, B:22:0x0045, B:24:0x004a, B:26:0x0050, B:30:0x0056, B:128:0x0168, B:130:0x016e, B:131:0x0171, B:133:0x017c, B:136:0x0188, B:140:0x0192, B:143:0x0198, B:144:0x019d, B:164:0x01d6, B:145:0x01a1, B:147:0x01a7, B:149:0x01ab, B:151:0x01b3, B:153:0x01b9, B:157:0x01c0, B:159:0x01c9, B:160:0x01cd, B:161:0x01d0, B:165:0x01db, B:166:0x01de, B:168:0x01e4, B:170:0x01e8, B:173:0x01ef, B:175:0x01f7, B:182:0x020e, B:183:0x0210, B:184:0x021e, B:186:0x0222, B:188:0x0226, B:215:0x027b, B:192:0x0232, B:194:0x023b, B:196:0x023f, B:198:0x0246, B:200:0x024c, B:202:0x024f, B:203:0x0252, B:205:0x0258, B:206:0x025f, B:208:0x0267, B:209:0x026c, B:211:0x0272, B:212:0x0275, B:216:0x0286, B:220:0x0296, B:221:0x02a4, B:223:0x02a8, B:225:0x02ac, B:252:0x0301, B:229:0x02b8, B:231:0x02c1, B:233:0x02c5, B:235:0x02cc, B:237:0x02d2, B:239:0x02d5, B:240:0x02d8, B:242:0x02de, B:243:0x02e5, B:245:0x02ed, B:246:0x02f2, B:248:0x02f8, B:249:0x02fb, B:254:0x030e, B:256:0x0315, B:261:0x0327, B:262:0x0329, B:34:0x005e, B:36:0x0064, B:37:0x0067, B:39:0x006f, B:42:0x007b, B:46:0x0085, B:77:0x00d7, B:79:0x00db, B:49:0x008a, B:51:0x0090, B:53:0x0094, B:55:0x009c, B:57:0x00a2, B:61:0x00a9, B:63:0x00b2, B:64:0x00b6, B:65:0x00b9, B:68:0x00bf, B:69:0x00c4, B:70:0x00c7, B:72:0x00cd, B:74:0x00d1, B:80:0x00e1, B:82:0x00e7, B:83:0x00ea, B:85:0x00f4, B:88:0x0100, B:92:0x010a, B:123:0x015c, B:125:0x0160, B:95:0x010f, B:97:0x0115, B:99:0x0119, B:101:0x0121, B:103:0x0127, B:107:0x012e, B:109:0x0137, B:110:0x013b, B:111:0x013e, B:114:0x0144, B:115:0x0149, B:116:0x014c, B:118:0x0152, B:120:0x0156), top: B:267:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:126:0x0165  */
    /* JADX WARN: Code duplicated, block: B:330:0x00d6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:331:0x0089 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:337:0x00c4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x005c  */
    /* JADX WARN: Code duplicated, block: B:34:0x005e A[Catch: all -> 0x001a, TryCatch #0 {all -> 0x001a, blocks: (B:3:0x0008, B:5:0x000f, B:10:0x001d, B:14:0x0027, B:17:0x0032, B:19:0x0038, B:20:0x003d, B:22:0x0045, B:24:0x004a, B:26:0x0050, B:30:0x0056, B:128:0x0168, B:130:0x016e, B:131:0x0171, B:133:0x017c, B:136:0x0188, B:140:0x0192, B:143:0x0198, B:144:0x019d, B:164:0x01d6, B:145:0x01a1, B:147:0x01a7, B:149:0x01ab, B:151:0x01b3, B:153:0x01b9, B:157:0x01c0, B:159:0x01c9, B:160:0x01cd, B:161:0x01d0, B:165:0x01db, B:166:0x01de, B:168:0x01e4, B:170:0x01e8, B:173:0x01ef, B:175:0x01f7, B:182:0x020e, B:183:0x0210, B:184:0x021e, B:186:0x0222, B:188:0x0226, B:215:0x027b, B:192:0x0232, B:194:0x023b, B:196:0x023f, B:198:0x0246, B:200:0x024c, B:202:0x024f, B:203:0x0252, B:205:0x0258, B:206:0x025f, B:208:0x0267, B:209:0x026c, B:211:0x0272, B:212:0x0275, B:216:0x0286, B:220:0x0296, B:221:0x02a4, B:223:0x02a8, B:225:0x02ac, B:252:0x0301, B:229:0x02b8, B:231:0x02c1, B:233:0x02c5, B:235:0x02cc, B:237:0x02d2, B:239:0x02d5, B:240:0x02d8, B:242:0x02de, B:243:0x02e5, B:245:0x02ed, B:246:0x02f2, B:248:0x02f8, B:249:0x02fb, B:254:0x030e, B:256:0x0315, B:261:0x0327, B:262:0x0329, B:34:0x005e, B:36:0x0064, B:37:0x0067, B:39:0x006f, B:42:0x007b, B:46:0x0085, B:77:0x00d7, B:79:0x00db, B:49:0x008a, B:51:0x0090, B:53:0x0094, B:55:0x009c, B:57:0x00a2, B:61:0x00a9, B:63:0x00b2, B:64:0x00b6, B:65:0x00b9, B:68:0x00bf, B:69:0x00c4, B:70:0x00c7, B:72:0x00cd, B:74:0x00d1, B:80:0x00e1, B:82:0x00e7, B:83:0x00ea, B:85:0x00f4, B:88:0x0100, B:92:0x010a, B:123:0x015c, B:125:0x0160, B:95:0x010f, B:97:0x0115, B:99:0x0119, B:101:0x0121, B:103:0x0127, B:107:0x012e, B:109:0x0137, B:110:0x013b, B:111:0x013e, B:114:0x0144, B:115:0x0149, B:116:0x014c, B:118:0x0152, B:120:0x0156), top: B:267:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:350:0x015b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:351:0x010e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:352:0x0159 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:359:0x0149 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:361:0x0144 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0064 A[Catch: all -> 0x001a, TryCatch #0 {all -> 0x001a, blocks: (B:3:0x0008, B:5:0x000f, B:10:0x001d, B:14:0x0027, B:17:0x0032, B:19:0x0038, B:20:0x003d, B:22:0x0045, B:24:0x004a, B:26:0x0050, B:30:0x0056, B:128:0x0168, B:130:0x016e, B:131:0x0171, B:133:0x017c, B:136:0x0188, B:140:0x0192, B:143:0x0198, B:144:0x019d, B:164:0x01d6, B:145:0x01a1, B:147:0x01a7, B:149:0x01ab, B:151:0x01b3, B:153:0x01b9, B:157:0x01c0, B:159:0x01c9, B:160:0x01cd, B:161:0x01d0, B:165:0x01db, B:166:0x01de, B:168:0x01e4, B:170:0x01e8, B:173:0x01ef, B:175:0x01f7, B:182:0x020e, B:183:0x0210, B:184:0x021e, B:186:0x0222, B:188:0x0226, B:215:0x027b, B:192:0x0232, B:194:0x023b, B:196:0x023f, B:198:0x0246, B:200:0x024c, B:202:0x024f, B:203:0x0252, B:205:0x0258, B:206:0x025f, B:208:0x0267, B:209:0x026c, B:211:0x0272, B:212:0x0275, B:216:0x0286, B:220:0x0296, B:221:0x02a4, B:223:0x02a8, B:225:0x02ac, B:252:0x0301, B:229:0x02b8, B:231:0x02c1, B:233:0x02c5, B:235:0x02cc, B:237:0x02d2, B:239:0x02d5, B:240:0x02d8, B:242:0x02de, B:243:0x02e5, B:245:0x02ed, B:246:0x02f2, B:248:0x02f8, B:249:0x02fb, B:254:0x030e, B:256:0x0315, B:261:0x0327, B:262:0x0329, B:34:0x005e, B:36:0x0064, B:37:0x0067, B:39:0x006f, B:42:0x007b, B:46:0x0085, B:77:0x00d7, B:79:0x00db, B:49:0x008a, B:51:0x0090, B:53:0x0094, B:55:0x009c, B:57:0x00a2, B:61:0x00a9, B:63:0x00b2, B:64:0x00b6, B:65:0x00b9, B:68:0x00bf, B:69:0x00c4, B:70:0x00c7, B:72:0x00cd, B:74:0x00d1, B:80:0x00e1, B:82:0x00e7, B:83:0x00ea, B:85:0x00f4, B:88:0x0100, B:92:0x010a, B:123:0x015c, B:125:0x0160, B:95:0x010f, B:97:0x0115, B:99:0x0119, B:101:0x0121, B:103:0x0127, B:107:0x012e, B:109:0x0137, B:110:0x013b, B:111:0x013e, B:114:0x0144, B:115:0x0149, B:116:0x014c, B:118:0x0152, B:120:0x0156), top: B:267:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x006f A[Catch: all -> 0x001a, TryCatch #0 {all -> 0x001a, blocks: (B:3:0x0008, B:5:0x000f, B:10:0x001d, B:14:0x0027, B:17:0x0032, B:19:0x0038, B:20:0x003d, B:22:0x0045, B:24:0x004a, B:26:0x0050, B:30:0x0056, B:128:0x0168, B:130:0x016e, B:131:0x0171, B:133:0x017c, B:136:0x0188, B:140:0x0192, B:143:0x0198, B:144:0x019d, B:164:0x01d6, B:145:0x01a1, B:147:0x01a7, B:149:0x01ab, B:151:0x01b3, B:153:0x01b9, B:157:0x01c0, B:159:0x01c9, B:160:0x01cd, B:161:0x01d0, B:165:0x01db, B:166:0x01de, B:168:0x01e4, B:170:0x01e8, B:173:0x01ef, B:175:0x01f7, B:182:0x020e, B:183:0x0210, B:184:0x021e, B:186:0x0222, B:188:0x0226, B:215:0x027b, B:192:0x0232, B:194:0x023b, B:196:0x023f, B:198:0x0246, B:200:0x024c, B:202:0x024f, B:203:0x0252, B:205:0x0258, B:206:0x025f, B:208:0x0267, B:209:0x026c, B:211:0x0272, B:212:0x0275, B:216:0x0286, B:220:0x0296, B:221:0x02a4, B:223:0x02a8, B:225:0x02ac, B:252:0x0301, B:229:0x02b8, B:231:0x02c1, B:233:0x02c5, B:235:0x02cc, B:237:0x02d2, B:239:0x02d5, B:240:0x02d8, B:242:0x02de, B:243:0x02e5, B:245:0x02ed, B:246:0x02f2, B:248:0x02f8, B:249:0x02fb, B:254:0x030e, B:256:0x0315, B:261:0x0327, B:262:0x0329, B:34:0x005e, B:36:0x0064, B:37:0x0067, B:39:0x006f, B:42:0x007b, B:46:0x0085, B:77:0x00d7, B:79:0x00db, B:49:0x008a, B:51:0x0090, B:53:0x0094, B:55:0x009c, B:57:0x00a2, B:61:0x00a9, B:63:0x00b2, B:64:0x00b6, B:65:0x00b9, B:68:0x00bf, B:69:0x00c4, B:70:0x00c7, B:72:0x00cd, B:74:0x00d1, B:80:0x00e1, B:82:0x00e7, B:83:0x00ea, B:85:0x00f4, B:88:0x0100, B:92:0x010a, B:123:0x015c, B:125:0x0160, B:95:0x010f, B:97:0x0115, B:99:0x0119, B:101:0x0121, B:103:0x0127, B:107:0x012e, B:109:0x0137, B:110:0x013b, B:111:0x013e, B:114:0x0144, B:115:0x0149, B:116:0x014c, B:118:0x0152, B:120:0x0156), top: B:267:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x0079 A[ADDED_TO_REGION, LOOP:12: B:41:0x0079->B:69:0x00c4, LOOP_START, PHI: r7
      0x0079: PHI (r7v26 androidx.compose.ui.h$c) = (r7v21 androidx.compose.ui.h$c), (r7v27 androidx.compose.ui.h$c) binds: [B:40:0x0077, B:69:0x00c4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:42:0x007b A[Catch: all -> 0x001a, TryCatch #0 {all -> 0x001a, blocks: (B:3:0x0008, B:5:0x000f, B:10:0x001d, B:14:0x0027, B:17:0x0032, B:19:0x0038, B:20:0x003d, B:22:0x0045, B:24:0x004a, B:26:0x0050, B:30:0x0056, B:128:0x0168, B:130:0x016e, B:131:0x0171, B:133:0x017c, B:136:0x0188, B:140:0x0192, B:143:0x0198, B:144:0x019d, B:164:0x01d6, B:145:0x01a1, B:147:0x01a7, B:149:0x01ab, B:151:0x01b3, B:153:0x01b9, B:157:0x01c0, B:159:0x01c9, B:160:0x01cd, B:161:0x01d0, B:165:0x01db, B:166:0x01de, B:168:0x01e4, B:170:0x01e8, B:173:0x01ef, B:175:0x01f7, B:182:0x020e, B:183:0x0210, B:184:0x021e, B:186:0x0222, B:188:0x0226, B:215:0x027b, B:192:0x0232, B:194:0x023b, B:196:0x023f, B:198:0x0246, B:200:0x024c, B:202:0x024f, B:203:0x0252, B:205:0x0258, B:206:0x025f, B:208:0x0267, B:209:0x026c, B:211:0x0272, B:212:0x0275, B:216:0x0286, B:220:0x0296, B:221:0x02a4, B:223:0x02a8, B:225:0x02ac, B:252:0x0301, B:229:0x02b8, B:231:0x02c1, B:233:0x02c5, B:235:0x02cc, B:237:0x02d2, B:239:0x02d5, B:240:0x02d8, B:242:0x02de, B:243:0x02e5, B:245:0x02ed, B:246:0x02f2, B:248:0x02f8, B:249:0x02fb, B:254:0x030e, B:256:0x0315, B:261:0x0327, B:262:0x0329, B:34:0x005e, B:36:0x0064, B:37:0x0067, B:39:0x006f, B:42:0x007b, B:46:0x0085, B:77:0x00d7, B:79:0x00db, B:49:0x008a, B:51:0x0090, B:53:0x0094, B:55:0x009c, B:57:0x00a2, B:61:0x00a9, B:63:0x00b2, B:64:0x00b6, B:65:0x00b9, B:68:0x00bf, B:69:0x00c4, B:70:0x00c7, B:72:0x00cd, B:74:0x00d1, B:80:0x00e1, B:82:0x00e7, B:83:0x00ea, B:85:0x00f4, B:88:0x0100, B:92:0x010a, B:123:0x015c, B:125:0x0160, B:95:0x010f, B:97:0x0115, B:99:0x0119, B:101:0x0121, B:103:0x0127, B:107:0x012e, B:109:0x0137, B:110:0x013b, B:111:0x013e, B:114:0x0144, B:115:0x0149, B:116:0x014c, B:118:0x0152, B:120:0x0156), top: B:267:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x0081  */
    /* JADX WARN: Code duplicated, block: B:46:0x0085 A[Catch: all -> 0x001a, TryCatch #0 {all -> 0x001a, blocks: (B:3:0x0008, B:5:0x000f, B:10:0x001d, B:14:0x0027, B:17:0x0032, B:19:0x0038, B:20:0x003d, B:22:0x0045, B:24:0x004a, B:26:0x0050, B:30:0x0056, B:128:0x0168, B:130:0x016e, B:131:0x0171, B:133:0x017c, B:136:0x0188, B:140:0x0192, B:143:0x0198, B:144:0x019d, B:164:0x01d6, B:145:0x01a1, B:147:0x01a7, B:149:0x01ab, B:151:0x01b3, B:153:0x01b9, B:157:0x01c0, B:159:0x01c9, B:160:0x01cd, B:161:0x01d0, B:165:0x01db, B:166:0x01de, B:168:0x01e4, B:170:0x01e8, B:173:0x01ef, B:175:0x01f7, B:182:0x020e, B:183:0x0210, B:184:0x021e, B:186:0x0222, B:188:0x0226, B:215:0x027b, B:192:0x0232, B:194:0x023b, B:196:0x023f, B:198:0x0246, B:200:0x024c, B:202:0x024f, B:203:0x0252, B:205:0x0258, B:206:0x025f, B:208:0x0267, B:209:0x026c, B:211:0x0272, B:212:0x0275, B:216:0x0286, B:220:0x0296, B:221:0x02a4, B:223:0x02a8, B:225:0x02ac, B:252:0x0301, B:229:0x02b8, B:231:0x02c1, B:233:0x02c5, B:235:0x02cc, B:237:0x02d2, B:239:0x02d5, B:240:0x02d8, B:242:0x02de, B:243:0x02e5, B:245:0x02ed, B:246:0x02f2, B:248:0x02f8, B:249:0x02fb, B:254:0x030e, B:256:0x0315, B:261:0x0327, B:262:0x0329, B:34:0x005e, B:36:0x0064, B:37:0x0067, B:39:0x006f, B:42:0x007b, B:46:0x0085, B:77:0x00d7, B:79:0x00db, B:49:0x008a, B:51:0x0090, B:53:0x0094, B:55:0x009c, B:57:0x00a2, B:61:0x00a9, B:63:0x00b2, B:64:0x00b6, B:65:0x00b9, B:68:0x00bf, B:69:0x00c4, B:70:0x00c7, B:72:0x00cd, B:74:0x00d1, B:80:0x00e1, B:82:0x00e7, B:83:0x00ea, B:85:0x00f4, B:88:0x0100, B:92:0x010a, B:123:0x015c, B:125:0x0160, B:95:0x010f, B:97:0x0115, B:99:0x0119, B:101:0x0121, B:103:0x0127, B:107:0x012e, B:109:0x0137, B:110:0x013b, B:111:0x013e, B:114:0x0144, B:115:0x0149, B:116:0x014c, B:118:0x0152, B:120:0x0156), top: B:267:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x008a A[Catch: all -> 0x001a, TryCatch #0 {all -> 0x001a, blocks: (B:3:0x0008, B:5:0x000f, B:10:0x001d, B:14:0x0027, B:17:0x0032, B:19:0x0038, B:20:0x003d, B:22:0x0045, B:24:0x004a, B:26:0x0050, B:30:0x0056, B:128:0x0168, B:130:0x016e, B:131:0x0171, B:133:0x017c, B:136:0x0188, B:140:0x0192, B:143:0x0198, B:144:0x019d, B:164:0x01d6, B:145:0x01a1, B:147:0x01a7, B:149:0x01ab, B:151:0x01b3, B:153:0x01b9, B:157:0x01c0, B:159:0x01c9, B:160:0x01cd, B:161:0x01d0, B:165:0x01db, B:166:0x01de, B:168:0x01e4, B:170:0x01e8, B:173:0x01ef, B:175:0x01f7, B:182:0x020e, B:183:0x0210, B:184:0x021e, B:186:0x0222, B:188:0x0226, B:215:0x027b, B:192:0x0232, B:194:0x023b, B:196:0x023f, B:198:0x0246, B:200:0x024c, B:202:0x024f, B:203:0x0252, B:205:0x0258, B:206:0x025f, B:208:0x0267, B:209:0x026c, B:211:0x0272, B:212:0x0275, B:216:0x0286, B:220:0x0296, B:221:0x02a4, B:223:0x02a8, B:225:0x02ac, B:252:0x0301, B:229:0x02b8, B:231:0x02c1, B:233:0x02c5, B:235:0x02cc, B:237:0x02d2, B:239:0x02d5, B:240:0x02d8, B:242:0x02de, B:243:0x02e5, B:245:0x02ed, B:246:0x02f2, B:248:0x02f8, B:249:0x02fb, B:254:0x030e, B:256:0x0315, B:261:0x0327, B:262:0x0329, B:34:0x005e, B:36:0x0064, B:37:0x0067, B:39:0x006f, B:42:0x007b, B:46:0x0085, B:77:0x00d7, B:79:0x00db, B:49:0x008a, B:51:0x0090, B:53:0x0094, B:55:0x009c, B:57:0x00a2, B:61:0x00a9, B:63:0x00b2, B:64:0x00b6, B:65:0x00b9, B:68:0x00bf, B:69:0x00c4, B:70:0x00c7, B:72:0x00cd, B:74:0x00d1, B:80:0x00e1, B:82:0x00e7, B:83:0x00ea, B:85:0x00f4, B:88:0x0100, B:92:0x010a, B:123:0x015c, B:125:0x0160, B:95:0x010f, B:97:0x0115, B:99:0x0119, B:101:0x0121, B:103:0x0127, B:107:0x012e, B:109:0x0137, B:110:0x013b, B:111:0x013e, B:114:0x0144, B:115:0x0149, B:116:0x014c, B:118:0x0152, B:120:0x0156), top: B:267:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:79:0x00db A[Catch: all -> 0x001a, TryCatch #0 {all -> 0x001a, blocks: (B:3:0x0008, B:5:0x000f, B:10:0x001d, B:14:0x0027, B:17:0x0032, B:19:0x0038, B:20:0x003d, B:22:0x0045, B:24:0x004a, B:26:0x0050, B:30:0x0056, B:128:0x0168, B:130:0x016e, B:131:0x0171, B:133:0x017c, B:136:0x0188, B:140:0x0192, B:143:0x0198, B:144:0x019d, B:164:0x01d6, B:145:0x01a1, B:147:0x01a7, B:149:0x01ab, B:151:0x01b3, B:153:0x01b9, B:157:0x01c0, B:159:0x01c9, B:160:0x01cd, B:161:0x01d0, B:165:0x01db, B:166:0x01de, B:168:0x01e4, B:170:0x01e8, B:173:0x01ef, B:175:0x01f7, B:182:0x020e, B:183:0x0210, B:184:0x021e, B:186:0x0222, B:188:0x0226, B:215:0x027b, B:192:0x0232, B:194:0x023b, B:196:0x023f, B:198:0x0246, B:200:0x024c, B:202:0x024f, B:203:0x0252, B:205:0x0258, B:206:0x025f, B:208:0x0267, B:209:0x026c, B:211:0x0272, B:212:0x0275, B:216:0x0286, B:220:0x0296, B:221:0x02a4, B:223:0x02a8, B:225:0x02ac, B:252:0x0301, B:229:0x02b8, B:231:0x02c1, B:233:0x02c5, B:235:0x02cc, B:237:0x02d2, B:239:0x02d5, B:240:0x02d8, B:242:0x02de, B:243:0x02e5, B:245:0x02ed, B:246:0x02f2, B:248:0x02f8, B:249:0x02fb, B:254:0x030e, B:256:0x0315, B:261:0x0327, B:262:0x0329, B:34:0x005e, B:36:0x0064, B:37:0x0067, B:39:0x006f, B:42:0x007b, B:46:0x0085, B:77:0x00d7, B:79:0x00db, B:49:0x008a, B:51:0x0090, B:53:0x0094, B:55:0x009c, B:57:0x00a2, B:61:0x00a9, B:63:0x00b2, B:64:0x00b6, B:65:0x00b9, B:68:0x00bf, B:69:0x00c4, B:70:0x00c7, B:72:0x00cd, B:74:0x00d1, B:80:0x00e1, B:82:0x00e7, B:83:0x00ea, B:85:0x00f4, B:88:0x0100, B:92:0x010a, B:123:0x015c, B:125:0x0160, B:95:0x010f, B:97:0x0115, B:99:0x0119, B:101:0x0121, B:103:0x0127, B:107:0x012e, B:109:0x0137, B:110:0x013b, B:111:0x013e, B:114:0x0144, B:115:0x0149, B:116:0x014c, B:118:0x0152, B:120:0x0156), top: B:267:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:80:0x00e1 A[Catch: all -> 0x001a, TryCatch #0 {all -> 0x001a, blocks: (B:3:0x0008, B:5:0x000f, B:10:0x001d, B:14:0x0027, B:17:0x0032, B:19:0x0038, B:20:0x003d, B:22:0x0045, B:24:0x004a, B:26:0x0050, B:30:0x0056, B:128:0x0168, B:130:0x016e, B:131:0x0171, B:133:0x017c, B:136:0x0188, B:140:0x0192, B:143:0x0198, B:144:0x019d, B:164:0x01d6, B:145:0x01a1, B:147:0x01a7, B:149:0x01ab, B:151:0x01b3, B:153:0x01b9, B:157:0x01c0, B:159:0x01c9, B:160:0x01cd, B:161:0x01d0, B:165:0x01db, B:166:0x01de, B:168:0x01e4, B:170:0x01e8, B:173:0x01ef, B:175:0x01f7, B:182:0x020e, B:183:0x0210, B:184:0x021e, B:186:0x0222, B:188:0x0226, B:215:0x027b, B:192:0x0232, B:194:0x023b, B:196:0x023f, B:198:0x0246, B:200:0x024c, B:202:0x024f, B:203:0x0252, B:205:0x0258, B:206:0x025f, B:208:0x0267, B:209:0x026c, B:211:0x0272, B:212:0x0275, B:216:0x0286, B:220:0x0296, B:221:0x02a4, B:223:0x02a8, B:225:0x02ac, B:252:0x0301, B:229:0x02b8, B:231:0x02c1, B:233:0x02c5, B:235:0x02cc, B:237:0x02d2, B:239:0x02d5, B:240:0x02d8, B:242:0x02de, B:243:0x02e5, B:245:0x02ed, B:246:0x02f2, B:248:0x02f8, B:249:0x02fb, B:254:0x030e, B:256:0x0315, B:261:0x0327, B:262:0x0329, B:34:0x005e, B:36:0x0064, B:37:0x0067, B:39:0x006f, B:42:0x007b, B:46:0x0085, B:77:0x00d7, B:79:0x00db, B:49:0x008a, B:51:0x0090, B:53:0x0094, B:55:0x009c, B:57:0x00a2, B:61:0x00a9, B:63:0x00b2, B:64:0x00b6, B:65:0x00b9, B:68:0x00bf, B:69:0x00c4, B:70:0x00c7, B:72:0x00cd, B:74:0x00d1, B:80:0x00e1, B:82:0x00e7, B:83:0x00ea, B:85:0x00f4, B:88:0x0100, B:92:0x010a, B:123:0x015c, B:125:0x0160, B:95:0x010f, B:97:0x0115, B:99:0x0119, B:101:0x0121, B:103:0x0127, B:107:0x012e, B:109:0x0137, B:110:0x013b, B:111:0x013e, B:114:0x0144, B:115:0x0149, B:116:0x014c, B:118:0x0152, B:120:0x0156), top: B:267:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:82:0x00e7 A[Catch: all -> 0x001a, TryCatch #0 {all -> 0x001a, blocks: (B:3:0x0008, B:5:0x000f, B:10:0x001d, B:14:0x0027, B:17:0x0032, B:19:0x0038, B:20:0x003d, B:22:0x0045, B:24:0x004a, B:26:0x0050, B:30:0x0056, B:128:0x0168, B:130:0x016e, B:131:0x0171, B:133:0x017c, B:136:0x0188, B:140:0x0192, B:143:0x0198, B:144:0x019d, B:164:0x01d6, B:145:0x01a1, B:147:0x01a7, B:149:0x01ab, B:151:0x01b3, B:153:0x01b9, B:157:0x01c0, B:159:0x01c9, B:160:0x01cd, B:161:0x01d0, B:165:0x01db, B:166:0x01de, B:168:0x01e4, B:170:0x01e8, B:173:0x01ef, B:175:0x01f7, B:182:0x020e, B:183:0x0210, B:184:0x021e, B:186:0x0222, B:188:0x0226, B:215:0x027b, B:192:0x0232, B:194:0x023b, B:196:0x023f, B:198:0x0246, B:200:0x024c, B:202:0x024f, B:203:0x0252, B:205:0x0258, B:206:0x025f, B:208:0x0267, B:209:0x026c, B:211:0x0272, B:212:0x0275, B:216:0x0286, B:220:0x0296, B:221:0x02a4, B:223:0x02a8, B:225:0x02ac, B:252:0x0301, B:229:0x02b8, B:231:0x02c1, B:233:0x02c5, B:235:0x02cc, B:237:0x02d2, B:239:0x02d5, B:240:0x02d8, B:242:0x02de, B:243:0x02e5, B:245:0x02ed, B:246:0x02f2, B:248:0x02f8, B:249:0x02fb, B:254:0x030e, B:256:0x0315, B:261:0x0327, B:262:0x0329, B:34:0x005e, B:36:0x0064, B:37:0x0067, B:39:0x006f, B:42:0x007b, B:46:0x0085, B:77:0x00d7, B:79:0x00db, B:49:0x008a, B:51:0x0090, B:53:0x0094, B:55:0x009c, B:57:0x00a2, B:61:0x00a9, B:63:0x00b2, B:64:0x00b6, B:65:0x00b9, B:68:0x00bf, B:69:0x00c4, B:70:0x00c7, B:72:0x00cd, B:74:0x00d1, B:80:0x00e1, B:82:0x00e7, B:83:0x00ea, B:85:0x00f4, B:88:0x0100, B:92:0x010a, B:123:0x015c, B:125:0x0160, B:95:0x010f, B:97:0x0115, B:99:0x0119, B:101:0x0121, B:103:0x0127, B:107:0x012e, B:109:0x0137, B:110:0x013b, B:111:0x013e, B:114:0x0144, B:115:0x0149, B:116:0x014c, B:118:0x0152, B:120:0x0156), top: B:267:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:85:0x00f4 A[Catch: all -> 0x001a, TryCatch #0 {all -> 0x001a, blocks: (B:3:0x0008, B:5:0x000f, B:10:0x001d, B:14:0x0027, B:17:0x0032, B:19:0x0038, B:20:0x003d, B:22:0x0045, B:24:0x004a, B:26:0x0050, B:30:0x0056, B:128:0x0168, B:130:0x016e, B:131:0x0171, B:133:0x017c, B:136:0x0188, B:140:0x0192, B:143:0x0198, B:144:0x019d, B:164:0x01d6, B:145:0x01a1, B:147:0x01a7, B:149:0x01ab, B:151:0x01b3, B:153:0x01b9, B:157:0x01c0, B:159:0x01c9, B:160:0x01cd, B:161:0x01d0, B:165:0x01db, B:166:0x01de, B:168:0x01e4, B:170:0x01e8, B:173:0x01ef, B:175:0x01f7, B:182:0x020e, B:183:0x0210, B:184:0x021e, B:186:0x0222, B:188:0x0226, B:215:0x027b, B:192:0x0232, B:194:0x023b, B:196:0x023f, B:198:0x0246, B:200:0x024c, B:202:0x024f, B:203:0x0252, B:205:0x0258, B:206:0x025f, B:208:0x0267, B:209:0x026c, B:211:0x0272, B:212:0x0275, B:216:0x0286, B:220:0x0296, B:221:0x02a4, B:223:0x02a8, B:225:0x02ac, B:252:0x0301, B:229:0x02b8, B:231:0x02c1, B:233:0x02c5, B:235:0x02cc, B:237:0x02d2, B:239:0x02d5, B:240:0x02d8, B:242:0x02de, B:243:0x02e5, B:245:0x02ed, B:246:0x02f2, B:248:0x02f8, B:249:0x02fb, B:254:0x030e, B:256:0x0315, B:261:0x0327, B:262:0x0329, B:34:0x005e, B:36:0x0064, B:37:0x0067, B:39:0x006f, B:42:0x007b, B:46:0x0085, B:77:0x00d7, B:79:0x00db, B:49:0x008a, B:51:0x0090, B:53:0x0094, B:55:0x009c, B:57:0x00a2, B:61:0x00a9, B:63:0x00b2, B:64:0x00b6, B:65:0x00b9, B:68:0x00bf, B:69:0x00c4, B:70:0x00c7, B:72:0x00cd, B:74:0x00d1, B:80:0x00e1, B:82:0x00e7, B:83:0x00ea, B:85:0x00f4, B:88:0x0100, B:92:0x010a, B:123:0x015c, B:125:0x0160, B:95:0x010f, B:97:0x0115, B:99:0x0119, B:101:0x0121, B:103:0x0127, B:107:0x012e, B:109:0x0137, B:110:0x013b, B:111:0x013e, B:114:0x0144, B:115:0x0149, B:116:0x014c, B:118:0x0152, B:120:0x0156), top: B:267:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:87:0x00fe A[ADDED_TO_REGION, LOOP:16: B:87:0x00fe->B:115:0x0149, LOOP_START, PHI: r2
      0x00fe: PHI (r2v14 androidx.compose.ui.h$c) = (r2v9 androidx.compose.ui.h$c), (r2v15 androidx.compose.ui.h$c) binds: [B:86:0x00fc, B:115:0x0149] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:88:0x0100 A[Catch: all -> 0x001a, TryCatch #0 {all -> 0x001a, blocks: (B:3:0x0008, B:5:0x000f, B:10:0x001d, B:14:0x0027, B:17:0x0032, B:19:0x0038, B:20:0x003d, B:22:0x0045, B:24:0x004a, B:26:0x0050, B:30:0x0056, B:128:0x0168, B:130:0x016e, B:131:0x0171, B:133:0x017c, B:136:0x0188, B:140:0x0192, B:143:0x0198, B:144:0x019d, B:164:0x01d6, B:145:0x01a1, B:147:0x01a7, B:149:0x01ab, B:151:0x01b3, B:153:0x01b9, B:157:0x01c0, B:159:0x01c9, B:160:0x01cd, B:161:0x01d0, B:165:0x01db, B:166:0x01de, B:168:0x01e4, B:170:0x01e8, B:173:0x01ef, B:175:0x01f7, B:182:0x020e, B:183:0x0210, B:184:0x021e, B:186:0x0222, B:188:0x0226, B:215:0x027b, B:192:0x0232, B:194:0x023b, B:196:0x023f, B:198:0x0246, B:200:0x024c, B:202:0x024f, B:203:0x0252, B:205:0x0258, B:206:0x025f, B:208:0x0267, B:209:0x026c, B:211:0x0272, B:212:0x0275, B:216:0x0286, B:220:0x0296, B:221:0x02a4, B:223:0x02a8, B:225:0x02ac, B:252:0x0301, B:229:0x02b8, B:231:0x02c1, B:233:0x02c5, B:235:0x02cc, B:237:0x02d2, B:239:0x02d5, B:240:0x02d8, B:242:0x02de, B:243:0x02e5, B:245:0x02ed, B:246:0x02f2, B:248:0x02f8, B:249:0x02fb, B:254:0x030e, B:256:0x0315, B:261:0x0327, B:262:0x0329, B:34:0x005e, B:36:0x0064, B:37:0x0067, B:39:0x006f, B:42:0x007b, B:46:0x0085, B:77:0x00d7, B:79:0x00db, B:49:0x008a, B:51:0x0090, B:53:0x0094, B:55:0x009c, B:57:0x00a2, B:61:0x00a9, B:63:0x00b2, B:64:0x00b6, B:65:0x00b9, B:68:0x00bf, B:69:0x00c4, B:70:0x00c7, B:72:0x00cd, B:74:0x00d1, B:80:0x00e1, B:82:0x00e7, B:83:0x00ea, B:85:0x00f4, B:88:0x0100, B:92:0x010a, B:123:0x015c, B:125:0x0160, B:95:0x010f, B:97:0x0115, B:99:0x0119, B:101:0x0121, B:103:0x0127, B:107:0x012e, B:109:0x0137, B:110:0x013b, B:111:0x013e, B:114:0x0144, B:115:0x0149, B:116:0x014c, B:118:0x0152, B:120:0x0156), top: B:267:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:90:0x0106  */
    /* JADX WARN: Code duplicated, block: B:92:0x010a A[Catch: all -> 0x001a, TryCatch #0 {all -> 0x001a, blocks: (B:3:0x0008, B:5:0x000f, B:10:0x001d, B:14:0x0027, B:17:0x0032, B:19:0x0038, B:20:0x003d, B:22:0x0045, B:24:0x004a, B:26:0x0050, B:30:0x0056, B:128:0x0168, B:130:0x016e, B:131:0x0171, B:133:0x017c, B:136:0x0188, B:140:0x0192, B:143:0x0198, B:144:0x019d, B:164:0x01d6, B:145:0x01a1, B:147:0x01a7, B:149:0x01ab, B:151:0x01b3, B:153:0x01b9, B:157:0x01c0, B:159:0x01c9, B:160:0x01cd, B:161:0x01d0, B:165:0x01db, B:166:0x01de, B:168:0x01e4, B:170:0x01e8, B:173:0x01ef, B:175:0x01f7, B:182:0x020e, B:183:0x0210, B:184:0x021e, B:186:0x0222, B:188:0x0226, B:215:0x027b, B:192:0x0232, B:194:0x023b, B:196:0x023f, B:198:0x0246, B:200:0x024c, B:202:0x024f, B:203:0x0252, B:205:0x0258, B:206:0x025f, B:208:0x0267, B:209:0x026c, B:211:0x0272, B:212:0x0275, B:216:0x0286, B:220:0x0296, B:221:0x02a4, B:223:0x02a8, B:225:0x02ac, B:252:0x0301, B:229:0x02b8, B:231:0x02c1, B:233:0x02c5, B:235:0x02cc, B:237:0x02d2, B:239:0x02d5, B:240:0x02d8, B:242:0x02de, B:243:0x02e5, B:245:0x02ed, B:246:0x02f2, B:248:0x02f8, B:249:0x02fb, B:254:0x030e, B:256:0x0315, B:261:0x0327, B:262:0x0329, B:34:0x005e, B:36:0x0064, B:37:0x0067, B:39:0x006f, B:42:0x007b, B:46:0x0085, B:77:0x00d7, B:79:0x00db, B:49:0x008a, B:51:0x0090, B:53:0x0094, B:55:0x009c, B:57:0x00a2, B:61:0x00a9, B:63:0x00b2, B:64:0x00b6, B:65:0x00b9, B:68:0x00bf, B:69:0x00c4, B:70:0x00c7, B:72:0x00cd, B:74:0x00d1, B:80:0x00e1, B:82:0x00e7, B:83:0x00ea, B:85:0x00f4, B:88:0x0100, B:92:0x010a, B:123:0x015c, B:125:0x0160, B:95:0x010f, B:97:0x0115, B:99:0x0119, B:101:0x0121, B:103:0x0127, B:107:0x012e, B:109:0x0137, B:110:0x013b, B:111:0x013e, B:114:0x0144, B:115:0x0149, B:116:0x014c, B:118:0x0152, B:120:0x0156), top: B:267:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:95:0x010f A[Catch: all -> 0x001a, TryCatch #0 {all -> 0x001a, blocks: (B:3:0x0008, B:5:0x000f, B:10:0x001d, B:14:0x0027, B:17:0x0032, B:19:0x0038, B:20:0x003d, B:22:0x0045, B:24:0x004a, B:26:0x0050, B:30:0x0056, B:128:0x0168, B:130:0x016e, B:131:0x0171, B:133:0x017c, B:136:0x0188, B:140:0x0192, B:143:0x0198, B:144:0x019d, B:164:0x01d6, B:145:0x01a1, B:147:0x01a7, B:149:0x01ab, B:151:0x01b3, B:153:0x01b9, B:157:0x01c0, B:159:0x01c9, B:160:0x01cd, B:161:0x01d0, B:165:0x01db, B:166:0x01de, B:168:0x01e4, B:170:0x01e8, B:173:0x01ef, B:175:0x01f7, B:182:0x020e, B:183:0x0210, B:184:0x021e, B:186:0x0222, B:188:0x0226, B:215:0x027b, B:192:0x0232, B:194:0x023b, B:196:0x023f, B:198:0x0246, B:200:0x024c, B:202:0x024f, B:203:0x0252, B:205:0x0258, B:206:0x025f, B:208:0x0267, B:209:0x026c, B:211:0x0272, B:212:0x0275, B:216:0x0286, B:220:0x0296, B:221:0x02a4, B:223:0x02a8, B:225:0x02ac, B:252:0x0301, B:229:0x02b8, B:231:0x02c1, B:233:0x02c5, B:235:0x02cc, B:237:0x02d2, B:239:0x02d5, B:240:0x02d8, B:242:0x02de, B:243:0x02e5, B:245:0x02ed, B:246:0x02f2, B:248:0x02f8, B:249:0x02fb, B:254:0x030e, B:256:0x0315, B:261:0x0327, B:262:0x0329, B:34:0x005e, B:36:0x0064, B:37:0x0067, B:39:0x006f, B:42:0x007b, B:46:0x0085, B:77:0x00d7, B:79:0x00db, B:49:0x008a, B:51:0x0090, B:53:0x0094, B:55:0x009c, B:57:0x00a2, B:61:0x00a9, B:63:0x00b2, B:64:0x00b6, B:65:0x00b9, B:68:0x00bf, B:69:0x00c4, B:70:0x00c7, B:72:0x00cd, B:74:0x00d1, B:80:0x00e1, B:82:0x00e7, B:83:0x00ea, B:85:0x00f4, B:88:0x0100, B:92:0x010a, B:123:0x015c, B:125:0x0160, B:95:0x010f, B:97:0x0115, B:99:0x0119, B:101:0x0121, B:103:0x0127, B:107:0x012e, B:109:0x0137, B:110:0x013b, B:111:0x013e, B:114:0x0144, B:115:0x0149, B:116:0x014c, B:118:0x0152, B:120:0x0156), top: B:267:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:97:0x0115 A[Catch: all -> 0x001a, TryCatch #0 {all -> 0x001a, blocks: (B:3:0x0008, B:5:0x000f, B:10:0x001d, B:14:0x0027, B:17:0x0032, B:19:0x0038, B:20:0x003d, B:22:0x0045, B:24:0x004a, B:26:0x0050, B:30:0x0056, B:128:0x0168, B:130:0x016e, B:131:0x0171, B:133:0x017c, B:136:0x0188, B:140:0x0192, B:143:0x0198, B:144:0x019d, B:164:0x01d6, B:145:0x01a1, B:147:0x01a7, B:149:0x01ab, B:151:0x01b3, B:153:0x01b9, B:157:0x01c0, B:159:0x01c9, B:160:0x01cd, B:161:0x01d0, B:165:0x01db, B:166:0x01de, B:168:0x01e4, B:170:0x01e8, B:173:0x01ef, B:175:0x01f7, B:182:0x020e, B:183:0x0210, B:184:0x021e, B:186:0x0222, B:188:0x0226, B:215:0x027b, B:192:0x0232, B:194:0x023b, B:196:0x023f, B:198:0x0246, B:200:0x024c, B:202:0x024f, B:203:0x0252, B:205:0x0258, B:206:0x025f, B:208:0x0267, B:209:0x026c, B:211:0x0272, B:212:0x0275, B:216:0x0286, B:220:0x0296, B:221:0x02a4, B:223:0x02a8, B:225:0x02ac, B:252:0x0301, B:229:0x02b8, B:231:0x02c1, B:233:0x02c5, B:235:0x02cc, B:237:0x02d2, B:239:0x02d5, B:240:0x02d8, B:242:0x02de, B:243:0x02e5, B:245:0x02ed, B:246:0x02f2, B:248:0x02f8, B:249:0x02fb, B:254:0x030e, B:256:0x0315, B:261:0x0327, B:262:0x0329, B:34:0x005e, B:36:0x0064, B:37:0x0067, B:39:0x006f, B:42:0x007b, B:46:0x0085, B:77:0x00d7, B:79:0x00db, B:49:0x008a, B:51:0x0090, B:53:0x0094, B:55:0x009c, B:57:0x00a2, B:61:0x00a9, B:63:0x00b2, B:64:0x00b6, B:65:0x00b9, B:68:0x00bf, B:69:0x00c4, B:70:0x00c7, B:72:0x00cd, B:74:0x00d1, B:80:0x00e1, B:82:0x00e7, B:83:0x00ea, B:85:0x00f4, B:88:0x0100, B:92:0x010a, B:123:0x015c, B:125:0x0160, B:95:0x010f, B:97:0x0115, B:99:0x0119, B:101:0x0121, B:103:0x0127, B:107:0x012e, B:109:0x0137, B:110:0x013b, B:111:0x013e, B:114:0x0144, B:115:0x0149, B:116:0x014c, B:118:0x0152, B:120:0x0156), top: B:267:0x0008 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v17, types: [T, androidx.compose.runtime.collection.c] */
    /* JADX WARN: Type inference failed for: r10v31 */
    /* JADX WARN: Type inference failed for: r10v32 */
    /* JADX WARN: Type inference failed for: r15v11, types: [T, androidx.compose.ui.h$c] */
    /* JADX WARN: Type inference failed for: r15v14, types: [T, androidx.compose.ui.h$c, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v17 */
    /* JADX WARN: Type inference failed for: r15v18 */
    /* JADX WARN: Type inference failed for: r15v4, types: [T, androidx.compose.ui.h$c] */
    /* JADX WARN: Type inference failed for: r1v19, types: [T, androidx.compose.ui.h$c] */
    /* JADX WARN: Type inference failed for: r1v22, types: [T, androidx.compose.ui.h$c, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v38 */
    /* JADX WARN: Type inference failed for: r1v39 */
    /* JADX WARN: Type inference failed for: r1v9, types: [T, androidx.compose.ui.h$c] */
    /* JADX WARN: Type inference failed for: r8v34, types: [T, androidx.compose.runtime.collection.c] */
    /* JADX WARN: Type inference failed for: r8v46 */
    /* JADX WARN: Type inference failed for: r8v47 */
    /*  JADX ERROR: NullPointerException in pass: PrepareForCodeGen
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.getSVar()" because "result" is null
        	at jadx.core.dex.visitors.PrepareForCodeGen.removeInstructions(PrepareForCodeGen.java:118)
        	at jadx.core.dex.visitors.PrepareForCodeGen.visit(PrepareForCodeGen.java:85)
        */
    @Override // androidx.compose.ui.focus.p
    public final boolean j(android.view.KeyEvent r14, Ia.a<java.lang.Boolean> r15) {
        /*
            Method dump skipped, instruction units count: 819
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.FocusOwnerImpl.j(android.view.KeyEvent, Ia.a):boolean");
    }

    @Override // androidx.compose.ui.focus.p
    public final B k() {
        return this.f13421h;
    }

    @Override // androidx.compose.ui.focus.p
    public final I.f l() {
        FocusTargetNode focusTargetNodeA = D.a(this.f13419f);
        if (focusTargetNodeA != null) {
            return D.b(focusTargetNodeA);
        }
        return null;
    }

    @Override // androidx.compose.ui.focus.p
    public final boolean m(int i10, boolean z10, boolean z11) {
        int iOrdinal;
        boolean z12 = true;
        if (z10 || (iOrdinal = C.b(this.f13419f, i10).ordinal()) == 0) {
            v(z10);
        } else {
            if (iOrdinal != 1 && iOrdinal != 2 && iOrdinal != 3) {
                throw new NoWhenBranchMatchedException();
            }
            z12 = false;
        }
        if (z12 && z11) {
            this.f13416c.invoke();
        }
        return z12;
    }

    @Override // androidx.compose.ui.focus.p
    public final void n(FocusTargetNode focusTargetNode) {
        FocusTargetNode focusTargetNode2 = this.f13424l;
        this.f13424l = focusTargetNode;
        I<m> i10 = this.f13423k;
        Object[] objArr = i10.f9108a;
        int i11 = i10.f9109b;
        for (int i12 = 0; i12 < i11; i12++) {
            ((m) objArr[i12]).a(focusTargetNode2, focusTargetNode);
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [T, java.lang.Boolean] */
    @Override // androidx.compose.ui.focus.n
    public final boolean o(final int i10) {
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.element = Boolean.FALSE;
        this.f13421h.getClass();
        FocusTargetNode focusTargetNode = this.f13424l;
        Boolean boolE = e(i10, this.f13417d.invoke(), new Ia.l<FocusTargetNode, Boolean>() { // from class: androidx.compose.ui.focus.FocusOwnerImpl$moveFocus$focusSearchSuccess$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX WARN: Type inference failed for: r3v3, types: [T, java.lang.Boolean] */
            @Override // Ia.l
            public final Boolean invoke(FocusTargetNode focusTargetNode2) {
                ref$ObjectRef.element = Boolean.valueOf(focusTargetNode2.D(i10));
                Boolean bool = ref$ObjectRef.element;
                return Boolean.valueOf(bool != null ? bool.booleanValue() : false);
            }
        });
        Boolean bool = Boolean.TRUE;
        if (kotlin.jvm.internal.i.a(boolE, bool) && focusTargetNode != this.f13424l) {
            return true;
        }
        if (boolE == null || ref$ObjectRef.element == 0) {
            return false;
        }
        if (boolE.equals(bool) && kotlin.jvm.internal.i.a(ref$ObjectRef.element, bool)) {
            return true;
        }
        if (!(C1123e.a(i10, 1) ? true : C1123e.a(i10, 2))) {
            return this.f13415b.invoke(new C1123e(i10)).booleanValue();
        }
        if (m(i10, false, false)) {
            Boolean boolE2 = e(i10, null, new Ia.l<FocusTargetNode, Boolean>() { // from class: androidx.compose.ui.focus.FocusOwnerImpl$takeFocus$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // Ia.l
                public final Boolean invoke(FocusTargetNode focusTargetNode2) {
                    return Boolean.valueOf(focusTargetNode2.D(i10));
                }
            });
            if (boolE2 != null ? boolE2.booleanValue() : false) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v10, types: [androidx.compose.ui.h$c] */
    /* JADX WARN: Type inference failed for: r14v11, types: [androidx.compose.ui.h$c] */
    /* JADX WARN: Type inference failed for: r14v12, types: [androidx.compose.ui.h$c] */
    /* JADX WARN: Type inference failed for: r14v13, types: [androidx.compose.ui.h$c] */
    /* JADX WARN: Type inference failed for: r14v17 */
    /* JADX WARN: Type inference failed for: r14v18, types: [androidx.compose.ui.h$c] */
    /* JADX WARN: Type inference failed for: r14v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v20 */
    /* JADX WARN: Type inference failed for: r14v21 */
    /* JADX WARN: Type inference failed for: r14v22 */
    /* JADX WARN: Type inference failed for: r14v23 */
    /* JADX WARN: Type inference failed for: r14v26 */
    /* JADX WARN: Type inference failed for: r14v27, types: [androidx.compose.ui.h$c] */
    /* JADX WARN: Type inference failed for: r14v28, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v29 */
    /* JADX WARN: Type inference failed for: r14v30 */
    /* JADX WARN: Type inference failed for: r14v31 */
    /* JADX WARN: Type inference failed for: r14v32 */
    /* JADX WARN: Type inference failed for: r14v49 */
    /* JADX WARN: Type inference failed for: r14v50 */
    /* JADX WARN: Type inference failed for: r14v51 */
    /* JADX WARN: Type inference failed for: r14v52 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11, types: [androidx.compose.runtime.collection.c] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14, types: [androidx.compose.runtime.collection.c] */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17, types: [androidx.compose.runtime.collection.c] */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v20, types: [androidx.compose.runtime.collection.c] */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v30 */
    /* JADX WARN: Type inference failed for: r2v31 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v21, types: [androidx.compose.ui.h$c] */
    /* JADX WARN: Type inference failed for: r7v22 */
    /* JADX WARN: Type inference failed for: r7v23, types: [androidx.compose.ui.h$c] */
    /* JADX WARN: Type inference failed for: r7v24, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v25 */
    /* JADX WARN: Type inference failed for: r7v26 */
    /* JADX WARN: Type inference failed for: r7v27 */
    /* JADX WARN: Type inference failed for: r7v28 */
    /* JADX WARN: Type inference failed for: r7v29 */
    /* JADX WARN: Type inference failed for: r7v30 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r8v28 */
    /* JADX WARN: Type inference failed for: r8v29 */
    /* JADX WARN: Type inference failed for: r8v30 */
    /* JADX WARN: Type inference failed for: r8v31, types: [androidx.compose.runtime.collection.c] */
    /* JADX WARN: Type inference failed for: r8v32 */
    /* JADX WARN: Type inference failed for: r8v33 */
    /* JADX WARN: Type inference failed for: r8v34, types: [androidx.compose.runtime.collection.c] */
    /* JADX WARN: Type inference failed for: r8v36 */
    /* JADX WARN: Type inference failed for: r8v37 */
    /* JADX WARN: Type inference failed for: r8v38 */
    /* JADX WARN: Type inference failed for: r8v39 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r9v19 */
    @Override // androidx.compose.ui.focus.p
    public final boolean p(KeyEvent keyEvent) {
        O.i iVar;
        int size;
        K k10;
        ?? B10;
        K k11;
        if (this.f13420g.f13458g) {
            System.out.println((Object) "FocusRelatedWarning: Dispatching intercepted soft keyboard event while the focus system is invalidated.");
            return false;
        }
        FocusTargetNode focusTargetNodeA = D.a(this.f13419f);
        if (focusTargetNodeA != null) {
            if (!focusTargetNodeA.f13985b.f13997o) {
                R.a.b("visitAncestors called on an unattached node");
            }
            androidx.compose.ui.h.c cVar = focusTargetNodeA.f13985b;
            LayoutNode layoutNodeF = C1185f.f(focusTargetNodeA);
            loop0: while (true) {
                if (layoutNodeF == null) {
                    B10 = 0;
                    break;
                }
                if ((layoutNodeF.f14389G.f14368e.f13988e & 131072) != 0) {
                    while (cVar != null) {
                        if ((cVar.f13987d & 131072) != 0) {
                            ?? cVar2 = 0;
                            B10 = cVar;
                            while (B10 != 0) {
                                if (B10 instanceof O.i) {
                                    break loop0;
                                }
                                if ((B10.f13987d & 131072) != 0 && (B10 instanceof AbstractC1187h)) {
                                    androidx.compose.ui.h.c cVar3 = ((AbstractC1187h) B10).f14585q;
                                    int i10 = 0;
                                    while (cVar3 != null) {
                                        if ((cVar3.f13987d & 131072) != 0) {
                                            i10++;
                                            if (i10 == 1) {
                                                B10 = B10;
                                                cVar2 = cVar2;
                                                cVar2 = cVar2;
                                                B10 = cVar3;
                                            } else {
                                                if (cVar2 == 0) {
                                                    cVar2 = new androidx.compose.runtime.collection.c(new androidx.compose.ui.h.c[16]);
                                                }
                                                if (B10 != 0) {
                                                    cVar2.b(B10);
                                                    B10 = 0;
                                                }
                                                cVar2.b(cVar3);
                                            }
                                        } else {
                                            B10 = B10;
                                            cVar2 = cVar2;
                                        }
                                        cVar3 = cVar3.f13990g;
                                        B10 = B10;
                                        cVar2 = cVar2;
                                    }
                                    if (i10 == 1) {
                                        B10 = B10;
                                        cVar2 = cVar2;
                                    } else {
                                        B10 = B10;
                                        cVar2 = cVar2;
                                    }
                                }
                                B10 = C1185f.b(cVar2);
                            }
                        }
                        cVar = cVar.f13989f;
                    }
                }
                layoutNodeF = layoutNodeF.G();
                cVar = (layoutNodeF == null || (k11 = layoutNodeF.f14389G) == null) ? null : k11.f14367d;
            }
            iVar = (O.i) B10;
        } else {
            iVar = null;
        }
        if (iVar != null) {
            if (!iVar.getNode().f13997o) {
                R.a.b("visitAncestors called on an unattached node");
            }
            androidx.compose.ui.h.c cVar4 = iVar.getNode().f13989f;
            LayoutNode layoutNodeF2 = C1185f.f(iVar);
            ArrayList arrayList = null;
            while (layoutNodeF2 != null) {
                if ((layoutNodeF2.f14389G.f14368e.f13988e & 131072) != 0) {
                    while (cVar4 != null) {
                        if ((cVar4.f13987d & 131072) != 0) {
                            androidx.compose.ui.h.c cVarB = cVar4;
                            androidx.compose.runtime.collection.c cVar5 = null;
                            while (cVarB != null) {
                                if (cVarB instanceof O.i) {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    arrayList.add(cVarB);
                                } else if ((cVarB.f13987d & 131072) != 0 && (cVarB instanceof AbstractC1187h)) {
                                    int i11 = 0;
                                    for (androidx.compose.ui.h.c cVar6 = ((AbstractC1187h) cVarB).f14585q; cVar6 != null; cVar6 = cVar6.f13990g) {
                                        if ((cVar6.f13987d & 131072) != 0) {
                                            i11++;
                                            if (i11 == 1) {
                                                cVarB = cVar6;
                                            } else {
                                                if (cVar5 == null) {
                                                    cVar5 = new androidx.compose.runtime.collection.c(new androidx.compose.ui.h.c[16]);
                                                }
                                                if (cVarB != null) {
                                                    cVar5.b(cVarB);
                                                    cVarB = null;
                                                }
                                                cVar5.b(cVar6);
                                            }
                                        }
                                    }
                                    if (i11 == 1) {
                                    }
                                }
                                cVarB = C1185f.b(cVar5);
                            }
                        }
                        cVar4 = cVar4.f13989f;
                    }
                }
                layoutNodeF2 = layoutNodeF2.G();
                cVar4 = (layoutNodeF2 == null || (k10 = layoutNodeF2.f14389G) == null) ? null : k10.f14367d;
            }
            if (arrayList != null && (size = arrayList.size() - 1) >= 0) {
                while (true) {
                    int i12 = size - 1;
                    if (((O.i) arrayList.get(size)).X()) {
                        return true;
                    }
                    if (i12 < 0) {
                        break;
                    }
                    size = i12;
                }
            }
            ?? node = iVar.getNode();
            ?? cVar7 = 0;
            while (node != 0) {
                if (node instanceof O.i) {
                    if (((O.i) node).X()) {
                        return true;
                    }
                } else if ((node.f13987d & 131072) != 0 && (node instanceof AbstractC1187h)) {
                    androidx.compose.ui.h.c cVar8 = ((AbstractC1187h) node).f14585q;
                    int i13 = 0;
                    while (cVar8 != null) {
                        if ((cVar8.f13987d & 131072) != 0) {
                            i13++;
                            if (i13 == 1) {
                                cVar7 = cVar7;
                                node = node;
                                cVar7 = cVar7;
                                node = cVar8;
                            } else {
                                if (cVar7 == 0) {
                                    cVar7 = new androidx.compose.runtime.collection.c(new androidx.compose.ui.h.c[16]);
                                }
                                if (node != 0) {
                                    cVar7.b(node);
                                    node = 0;
                                }
                                cVar7.b(cVar8);
                            }
                        } else {
                            cVar7 = cVar7;
                            node = node;
                        }
                        cVar8 = cVar8.f13990g;
                        cVar7 = cVar7;
                        node = node;
                    }
                    if (i13 == 1) {
                        cVar7 = cVar7;
                        node = node;
                    } else {
                        cVar7 = cVar7;
                        node = node;
                    }
                }
                node = C1185f.b(cVar7);
            }
            ?? node2 = iVar.getNode();
            ?? cVar9 = 0;
            while (node2 != 0) {
                if (node2 instanceof O.i) {
                    if (((O.i) node2).i1()) {
                        return true;
                    }
                } else if ((node2.f13987d & 131072) != 0 && (node2 instanceof AbstractC1187h)) {
                    androidx.compose.ui.h.c cVar10 = ((AbstractC1187h) node2).f14585q;
                    int i14 = 0;
                    while (cVar10 != null) {
                        if ((cVar10.f13987d & 131072) != 0) {
                            i14++;
                            if (i14 == 1) {
                                cVar9 = cVar9;
                                node2 = node2;
                                cVar9 = cVar9;
                                node2 = cVar10;
                            } else {
                                if (cVar9 == 0) {
                                    cVar9 = new androidx.compose.runtime.collection.c(new androidx.compose.ui.h.c[16]);
                                }
                                if (node2 != 0) {
                                    cVar9.b(node2);
                                    node2 = 0;
                                }
                                cVar9.b(cVar10);
                            }
                        } else {
                            cVar9 = cVar9;
                            node2 = node2;
                        }
                        cVar10 = cVar10.f13990g;
                        cVar9 = cVar9;
                        node2 = node2;
                    }
                    if (i14 == 1) {
                        cVar9 = cVar9;
                        node2 = node2;
                    } else {
                        cVar9 = cVar9;
                        node2 = node2;
                    }
                }
                node2 = C1185f.b(cVar9);
            }
            if (arrayList != null) {
                int size2 = arrayList.size();
                for (int i15 = 0; i15 < size2; i15++) {
                    if (((O.i) arrayList.get(i15)).i1()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // androidx.compose.ui.focus.p
    public final void q() {
        C.a(this.f13419f, true, true);
    }

    @Override // androidx.compose.ui.focus.p
    public final FocusTargetNode r() {
        return this.f13424l;
    }

    @Override // androidx.compose.ui.focus.p
    public final I<m> s() {
        return this.f13423k;
    }

    @Override // androidx.compose.ui.focus.p
    public final boolean t() {
        return this.f13414a.invoke(null, null).booleanValue();
    }

    @Override // androidx.compose.ui.focus.n
    public final void u(boolean z10) {
        m(8, z10, true);
    }

    public final boolean v(boolean z10) {
        K k10;
        FocusTargetNode focusTargetNode = this.f13424l;
        if (focusTargetNode == null) {
            return true;
        }
        n(null);
        focusTargetNode.Q1(FocusStateImpl.f13434b, FocusStateImpl.f13437e);
        if (!focusTargetNode.f13985b.f13997o) {
            R.a.b("visitAncestors called on an unattached node");
        }
        androidx.compose.ui.h.c cVar = focusTargetNode.f13985b.f13989f;
        LayoutNode layoutNodeF = C1185f.f(focusTargetNode);
        while (layoutNodeF != null) {
            if ((layoutNodeF.f14389G.f14368e.f13988e & 1024) != 0) {
                while (cVar != null) {
                    if ((cVar.f13987d & 1024) != 0) {
                        androidx.compose.runtime.collection.c cVar2 = null;
                        androidx.compose.ui.h.c cVarB = cVar;
                        while (cVarB != null) {
                            if (cVarB instanceof FocusTargetNode) {
                                ((FocusTargetNode) cVarB).Q1(FocusStateImpl.f13435c, FocusStateImpl.f13437e);
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
        return true;
    }

    public final boolean w(KeyEvent keyEvent) {
        int iNumberOfTrailingZeros;
        int iB;
        int i10;
        long jN = O.e.n(keyEvent);
        int iR = O.e.r(keyEvent);
        int i11 = 0;
        if (O.d.a(iR, 2)) {
            androidx.collection.F f10 = this.j;
            if (f10 == null) {
                f10 = new androidx.collection.F(3);
                this.j = f10;
            }
            androidx.collection.F f11 = f10;
            int iHashCode = Long.hashCode(jN) * (-862048943);
            int i12 = iHashCode ^ (iHashCode << 16);
            int i13 = i12 >>> 7;
            int i14 = i12 & 127;
            int i15 = f11.f9207c;
            int i16 = i13 & i15;
            int i17 = 0;
            loop0: while (true) {
                long[] jArr = f11.f9205a;
                int i18 = i16 >> 3;
                int i19 = (i16 & 7) << 3;
                long j = (jArr[i18] >>> i19) | ((jArr[i18 + 1] << (64 - i19)) & ((-i19) >> 63));
                int i20 = i13;
                long j10 = i14;
                long j11 = j ^ (j10 * 72340172838076673L);
                for (long j12 = (j11 - 72340172838076673L) & (~j11) & (-9187201950435737472L); j12 != 0; j12 &= j12 - 1) {
                    iB = ((Long.numberOfTrailingZeros(j12) >> 3) + i16) & i15;
                    if (f11.f9206b[iB] == jN) {
                        jN = jN;
                        break loop0;
                    }
                }
                if ((j & ((~j) << 6) & (-9187201950435737472L)) != 0) {
                    int iB2 = f11.b(i20);
                    if (f11.f9075e != 0 || ((f11.f9205a[iB2 >> 3] >> ((iB2 & 7) << 3)) & 255) == 254) {
                        jN = jN;
                        iB = iB2;
                    } else {
                        int i21 = f11.f9207c;
                        if (i21 <= 8 || Long.compareUnsigned(((long) f11.f9208d) * 32, ((long) i21) * 25) > 0) {
                            i10 = i20;
                            int iC = U.c(f11.f9207c);
                            long[] jArr2 = f11.f9205a;
                            long[] jArr3 = f11.f9206b;
                            int i22 = f11.f9207c;
                            f11.c(iC);
                            long[] jArr4 = f11.f9205a;
                            long[] jArr5 = f11.f9206b;
                            int i23 = f11.f9207c;
                            int i24 = 0;
                            while (i24 < i22) {
                                if (((jArr2[i24 >> 3] >> ((i24 & 7) << 3)) & 255) < 128) {
                                    long j13 = jArr3[i24];
                                    int iHashCode2 = Long.hashCode(j13) * (-862048943);
                                    int i25 = iHashCode2 ^ (iHashCode2 << 16);
                                    int iB3 = f11.b(i25 >>> 7);
                                    long j14 = i25 & 127;
                                    int i26 = iB3 >> 3;
                                    int i27 = (iB3 & 7) << 3;
                                    long j15 = (jArr4[i26] & (~(255 << i27))) | (j14 << i27);
                                    jArr4[i26] = j15;
                                    jArr4[(((iB3 - 7) & i23) + (i23 & 7)) >> 3] = j15;
                                    jArr5[iB3] = j13;
                                }
                                i24++;
                                jArr2 = jArr2;
                                jArr3 = jArr3;
                            }
                        } else {
                            long[] jArr6 = f11.f9205a;
                            int i28 = f11.f9207c;
                            long[] jArr7 = f11.f9206b;
                            int i29 = (i28 + 7) >> 3;
                            for (int i30 = 0; i30 < i29; i30++) {
                                i10 = i20;
                                long j16 = jArr6[i30] & (-9187201950435737472L);
                                jArr6[i30] = (-72340172838076674L) & ((~j16) + (j16 >>> 7));
                            }
                            i10 = i20;
                            int iR2 = kotlin.collections.k.R(jArr6);
                            int i31 = iR2 - 1;
                            jArr6[i31] = (jArr6[i31] & 72057594037927935L) | (-72057594037927936L);
                            jArr6[iR2] = jArr6[0];
                            int i32 = 0;
                            while (i32 != i28) {
                                int i33 = i32 >> 3;
                                int i34 = (i32 & 7) << 3;
                                long j17 = (jArr6[i33] >> i34) & 255;
                                if (j17 != 128 && j17 == 254) {
                                    int iHashCode3 = Long.hashCode(jArr7[i32]) * (-862048943);
                                    int i35 = (iHashCode3 << 16) ^ iHashCode3;
                                    int i36 = i35 >>> 7;
                                    int iB4 = f11.b(i36);
                                    int i37 = i36 & i28;
                                    if (((iB4 - i37) & i28) / 8 == ((i32 - i37) & i28) / 8) {
                                        jArr6[i33] = (((long) (i35 & 127)) << i34) | ((~(255 << i34)) & jArr6[i33]);
                                        jArr6[jArr6.length - 1] = (jArr6[0] & 72057594037927935L) | Long.MIN_VALUE;
                                        i32++;
                                    } else {
                                        int i38 = iB4 >> 3;
                                        long j18 = jArr6[i38];
                                        int i39 = (iB4 & 7) << 3;
                                        if (((j18 >> i39) & 255) == 128) {
                                            jArr6[i38] = (j18 & (~(255 << i39))) | (((long) (i35 & 127)) << i39);
                                            jArr6[i33] = (jArr6[i33] & (~(255 << i34))) | (128 << i34);
                                            jArr7[iB4] = jArr7[i32];
                                            jArr7[i32] = 0;
                                        } else {
                                            jArr6[i38] = (j18 & (~(255 << i39))) | (((long) (i35 & 127)) << i39);
                                            long j19 = jArr7[iB4];
                                            jArr7[iB4] = jArr7[i32];
                                            jArr7[i32] = j19;
                                            i32--;
                                        }
                                        jArr6[jArr6.length - 1] = (jArr6[0] & 72057594037927935L) | Long.MIN_VALUE;
                                        i32++;
                                        jN = jN;
                                    }
                                } else {
                                    i32++;
                                }
                            }
                            jN = jN;
                            f11.f9075e = U.a(f11.f9207c) - f11.f9208d;
                        }
                        iB = f11.b(i10);
                    }
                    f11.f9208d++;
                    int i40 = f11.f9075e;
                    long[] jArr8 = f11.f9205a;
                    int i41 = iB >> 3;
                    long j20 = jArr8[i41];
                    int i42 = (iB & 7) << 3;
                    f11.f9075e = i40 - (((j20 >> i42) & 255) == 128 ? 1 : 0);
                    int i43 = f11.f9207c;
                    long j21 = (j10 << i42) | (j20 & (~(255 << i42)));
                    jArr8[i41] = j21;
                    jArr8[(((iB - 7) & i43) + (i43 & 7)) >> 3] = j21;
                    break;
                }
                i17 += 8;
                i16 = (i16 + i17) & i15;
                i13 = i20;
                jN = jN;
            }
            f11.f9206b[iB] = jN;
        } else {
            if (!O.d.a(iR, 1)) {
                return true;
            }
            androidx.collection.F f12 = this.j;
            if (f12 == null || !f12.a(jN)) {
                return false;
            }
            androidx.collection.F f13 = this.j;
            if (f13 != null) {
                int iHashCode4 = Long.hashCode(jN) * (-862048943);
                int i44 = iHashCode4 ^ (iHashCode4 << 16);
                int i45 = i44 & 127;
                int i46 = f13.f9207c;
                int i47 = i44 >>> 7;
                loop5: while (true) {
                    int i48 = i47 & i46;
                    long[] jArr9 = f13.f9205a;
                    int i49 = i48 >> 3;
                    int i50 = (i48 & 7) << 3;
                    long j22 = ((jArr9[i49 + 1] << (64 - i50)) & ((-i50) >> 63)) | (jArr9[i49] >>> i50);
                    long j23 = (((long) i45) * 72340172838076673L) ^ j22;
                    for (long j24 = (~j23) & (j23 - 72340172838076673L) & (-9187201950435737472L); j24 != 0; j24 &= j24 - 1) {
                        iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j24) >> 3) + i48) & i46;
                        if (f13.f9206b[iNumberOfTrailingZeros] == jN) {
                            break loop5;
                        }
                    }
                    if ((j22 & ((~j22) << 6) & (-9187201950435737472L)) != 0) {
                        iNumberOfTrailingZeros = -1;
                        break;
                    }
                    i11 += 8;
                    i47 = i48 + i11;
                }
                if (iNumberOfTrailingZeros >= 0) {
                    f13.f9208d--;
                    long[] jArr10 = f13.f9205a;
                    int i51 = f13.f9207c;
                    int i52 = iNumberOfTrailingZeros >> 3;
                    int i53 = (iNumberOfTrailingZeros & 7) << 3;
                    long j25 = (jArr10[i52] & (~(255 << i53))) | (254 << i53);
                    jArr10[i52] = j25;
                    jArr10[(((iNumberOfTrailingZeros - 7) & i51) + (i51 & 7)) >> 3] = j25;
                }
            }
        }
        return true;
    }
}
