package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.ArrayList;

/* JADX INFO: compiled from: HorizontalWidgetRun.java */
/* JADX INFO: loaded from: classes.dex */
public final class c extends WidgetRun {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int[] f16054k = new int[2];

    public c(ConstraintWidget constraintWidget) {
        super(constraintWidget);
        this.f16048h.f16026e = DependencyNode.Type.f16036e;
        this.f16049i.f16026e = DependencyNode.Type.f16037f;
        this.f16046f = 0;
    }

    public static void m(int[] iArr, int i10, int i11, int i12, int i13, float f10, int i14) {
        int i15 = i11 - i10;
        int i16 = i13 - i12;
        if (i14 != -1) {
            if (i14 == 0) {
                iArr[0] = (int) ((i16 * f10) + 0.5f);
                iArr[1] = i16;
                return;
            } else {
                if (i14 != 1) {
                    return;
                }
                iArr[0] = i15;
                iArr[1] = (int) ((i15 * f10) + 0.5f);
                return;
            }
        }
        int i17 = (int) ((i16 * f10) + 0.5f);
        int i18 = (int) ((i15 / f10) + 0.5f);
        if (i17 <= i15) {
            iArr[0] = i17;
            iArr[1] = i16;
        } else if (i18 <= i16) {
            iArr[0] = i15;
            iArr[1] = i18;
        }
    }

    /* JADX WARN: Code duplicated, block: B:118:0x026f  */
    /* JADX WARN: Code duplicated, block: B:120:0x0280  */
    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun, p101i0.d
    public final void a(p101i0.d dVar) {
        int iG;
        int i10;
        int iG2;
        float f10;
        float f11;
        float f12;
        int i11;
        if (this.j.ordinal() == 3) {
            ConstraintWidget constraintWidget = this.f16042b;
            l(constraintWidget.f15951J, constraintWidget.f15953L, 0);
            return;
        }
        a aVar = this.f16045e;
        boolean z10 = aVar.j;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.f16015d;
        DependencyNode dependencyNode = this.f16048h;
        DependencyNode dependencyNode2 = this.f16049i;
        if (!z10 && this.f16044d == dimensionBehaviour) {
            ConstraintWidget constraintWidget2 = this.f16042b;
            int i12 = constraintWidget2.f16001r;
            if (i12 == 2) {
                ConstraintWidget constraintWidget3 = constraintWidget2.f15963V;
                if (constraintWidget3 != null) {
                    a aVar2 = constraintWidget3.f15974d.f16045e;
                    if (aVar2.j) {
                        aVar.d((int) ((aVar2.f16028g * constraintWidget2.f16009w) + 0.5f));
                    }
                }
            } else if (i12 == 3) {
                int i13 = constraintWidget2.f16003s;
                if (i13 == 0 || i13 == 3) {
                    d dVar2 = constraintWidget2.f15976e;
                    DependencyNode dependencyNode3 = dVar2.f16048h;
                    DependencyNode dependencyNode4 = dVar2.f16049i;
                    boolean z11 = constraintWidget2.f15951J.f15930f != null;
                    boolean z12 = constraintWidget2.f15952K.f15930f != null;
                    boolean z13 = constraintWidget2.f15953L.f15930f != null;
                    boolean z14 = constraintWidget2.f15954M.f15930f != null;
                    int i14 = constraintWidget2.f15967Z;
                    if (z11 && z12 && z13 && z14) {
                        float f13 = constraintWidget2.f15966Y;
                        boolean z15 = dependencyNode3.j;
                        int[] iArr = f16054k;
                        if (z15 && dependencyNode4.j) {
                            if (dependencyNode.f16024c && dependencyNode2.f16024c) {
                                m(iArr, ((DependencyNode) dependencyNode.f16032l.get(0)).f16028g + dependencyNode.f16027f, ((DependencyNode) dependencyNode2.f16032l.get(0)).f16028g - dependencyNode2.f16027f, dependencyNode3.f16028g + dependencyNode3.f16027f, dependencyNode4.f16028g - dependencyNode4.f16027f, f13, i14);
                                aVar.d(iArr[0]);
                                this.f16042b.f15976e.f16045e.d(iArr[1]);
                                return;
                            }
                            return;
                        }
                        boolean z16 = dependencyNode.j;
                        ArrayList arrayList = dependencyNode3.f16032l;
                        if (z16 && dependencyNode2.j) {
                            if (!dependencyNode3.f16024c || !dependencyNode4.f16024c) {
                                return;
                            }
                            m(iArr, dependencyNode.f16028g + dependencyNode.f16027f, dependencyNode2.f16028g - dependencyNode2.f16027f, ((DependencyNode) arrayList.get(0)).f16028g + dependencyNode3.f16027f, ((DependencyNode) dependencyNode4.f16032l.get(0)).f16028g - dependencyNode4.f16027f, f13, i14);
                            aVar.d(iArr[0]);
                            this.f16042b.f15976e.f16045e.d(iArr[1]);
                        }
                        if (!dependencyNode.f16024c || !dependencyNode2.f16024c || !dependencyNode3.f16024c || !dependencyNode4.f16024c) {
                            return;
                        }
                        m(iArr, ((DependencyNode) dependencyNode.f16032l.get(0)).f16028g + dependencyNode.f16027f, ((DependencyNode) dependencyNode2.f16032l.get(0)).f16028g - dependencyNode2.f16027f, ((DependencyNode) arrayList.get(0)).f16028g + dependencyNode3.f16027f, ((DependencyNode) dependencyNode4.f16032l.get(0)).f16028g - dependencyNode4.f16027f, f13, i14);
                        aVar.d(iArr[0]);
                        this.f16042b.f15976e.f16045e.d(iArr[1]);
                    } else if (z11 && z13) {
                        if (!dependencyNode.f16024c || !dependencyNode2.f16024c) {
                            return;
                        }
                        float f14 = constraintWidget2.f15966Y;
                        int i15 = ((DependencyNode) dependencyNode.f16032l.get(0)).f16028g + dependencyNode.f16027f;
                        int i16 = ((DependencyNode) dependencyNode2.f16032l.get(0)).f16028g - dependencyNode2.f16027f;
                        if (i14 == -1 || i14 == 0) {
                            int iG3 = g(i16 - i15, 0);
                            int i17 = (int) ((iG3 * f14) + 0.5f);
                            int iG4 = g(i17, 1);
                            if (i17 != iG4) {
                                iG3 = (int) ((iG4 / f14) + 0.5f);
                            }
                            aVar.d(iG3);
                            this.f16042b.f15976e.f16045e.d(iG4);
                        } else if (i14 == 1) {
                            int iG5 = g(i16 - i15, 0);
                            int i18 = (int) ((iG5 / f14) + 0.5f);
                            int iG6 = g(i18, 1);
                            if (i18 != iG6) {
                                iG5 = (int) ((iG6 * f14) + 0.5f);
                            }
                            aVar.d(iG5);
                            this.f16042b.f15976e.f16045e.d(iG6);
                        }
                    } else if (z12 && z14) {
                        if (!dependencyNode3.f16024c || !dependencyNode4.f16024c) {
                            return;
                        }
                        float f15 = constraintWidget2.f15966Y;
                        int i19 = ((DependencyNode) dependencyNode3.f16032l.get(0)).f16028g + dependencyNode3.f16027f;
                        int i20 = ((DependencyNode) dependencyNode4.f16032l.get(0)).f16028g - dependencyNode4.f16027f;
                        if (i14 == -1) {
                            iG = g(i20 - i19, 1);
                            i10 = (int) ((iG / f15) + 0.5f);
                            iG2 = g(i10, 0);
                            if (i10 != iG2) {
                                iG = (int) ((iG2 * f15) + 0.5f);
                            }
                            aVar.d(iG2);
                            this.f16042b.f15976e.f16045e.d(iG);
                        } else if (i14 == 0) {
                            int iG7 = g(i20 - i19, 1);
                            int i21 = (int) ((iG7 * f15) + 0.5f);
                            int iG8 = g(i21, 0);
                            if (i21 != iG8) {
                                iG7 = (int) ((iG8 / f15) + 0.5f);
                            }
                            aVar.d(iG8);
                            this.f16042b.f15976e.f16045e.d(iG7);
                        } else if (i14 == 1) {
                            iG = g(i20 - i19, 1);
                            i10 = (int) ((iG / f15) + 0.5f);
                            iG2 = g(i10, 0);
                            if (i10 != iG2) {
                                iG = (int) ((iG2 * f15) + 0.5f);
                            }
                            aVar.d(iG2);
                            this.f16042b.f15976e.f16045e.d(iG);
                        }
                    }
                } else {
                    int i22 = constraintWidget2.f15967Z;
                    if (i22 != -1) {
                        if (i22 == 0) {
                            f12 = constraintWidget2.f15976e.f16045e.f16028g / constraintWidget2.f15966Y;
                            i11 = (int) (f12 + 0.5f);
                        } else if (i22 != 1) {
                            i11 = 0;
                        } else {
                            f10 = constraintWidget2.f15976e.f16045e.f16028g;
                            f11 = constraintWidget2.f15966Y;
                        }
                        aVar.d(i11);
                    } else {
                        f10 = constraintWidget2.f15976e.f16045e.f16028g;
                        f11 = constraintWidget2.f15966Y;
                    }
                    f12 = f10 * f11;
                    i11 = (int) (f12 + 0.5f);
                    aVar.d(i11);
                }
            }
        }
        if (dependencyNode.f16024c && dependencyNode2.f16024c) {
            if (dependencyNode.j && dependencyNode2.j && aVar.j) {
                return;
            }
            if (!aVar.j && this.f16044d == dimensionBehaviour) {
                ConstraintWidget constraintWidget4 = this.f16042b;
                if (constraintWidget4.f16001r == 0 && !constraintWidget4.B()) {
                    DependencyNode dependencyNode5 = (DependencyNode) dependencyNode.f16032l.get(0);
                    DependencyNode dependencyNode6 = (DependencyNode) dependencyNode2.f16032l.get(0);
                    int i23 = dependencyNode5.f16028g + dependencyNode.f16027f;
                    int i24 = dependencyNode6.f16028g + dependencyNode2.f16027f;
                    dependencyNode.d(i23);
                    dependencyNode2.d(i24);
                    aVar.d(i24 - i23);
                    return;
                }
            }
            if (!aVar.j && this.f16044d == dimensionBehaviour && this.f16041a == 1 && dependencyNode.f16032l.size() > 0 && dependencyNode2.f16032l.size() > 0) {
                int iMin = Math.min((((DependencyNode) dependencyNode2.f16032l.get(0)).f16028g + dependencyNode2.f16027f) - (((DependencyNode) dependencyNode.f16032l.get(0)).f16028g + dependencyNode.f16027f), aVar.f16053m);
                ConstraintWidget constraintWidget5 = this.f16042b;
                int i25 = constraintWidget5.f16008v;
                int iMax = Math.max(constraintWidget5.f16007u, iMin);
                if (i25 > 0) {
                    iMax = Math.min(i25, iMax);
                }
                aVar.d(iMax);
            }
            if (aVar.j) {
                DependencyNode dependencyNode7 = (DependencyNode) dependencyNode.f16032l.get(0);
                DependencyNode dependencyNode8 = (DependencyNode) dependencyNode2.f16032l.get(0);
                int i26 = dependencyNode7.f16028g;
                int i27 = dependencyNode.f16027f + i26;
                int i28 = dependencyNode8.f16028g;
                int i29 = dependencyNode2.f16027f + i28;
                float f16 = this.f16042b.f15979f0;
                if (dependencyNode7 == dependencyNode8) {
                    f16 = 0.5f;
                } else {
                    i26 = i27;
                    i28 = i29;
                }
                dependencyNode.d((int) ((((i28 - i26) - aVar.f16028g) * f16) + i26 + 0.5f));
                dependencyNode2.d(dependencyNode.f16028g + aVar.f16028g);
            }
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public final void d() {
        ConstraintWidget constraintWidget;
        ConstraintWidget constraintWidget2;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour;
        ConstraintWidget constraintWidget3;
        ConstraintWidget constraintWidget4;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2;
        ConstraintWidget constraintWidget5 = this.f16042b;
        boolean z10 = constraintWidget5.f15968a;
        a aVar = this.f16045e;
        if (z10) {
            aVar.d(constraintWidget5.u());
        }
        boolean z11 = aVar.j;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.f16016e;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.f16015d;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour5 = ConstraintWidget.DimensionBehaviour.f16013b;
        DependencyNode dependencyNode = this.f16049i;
        DependencyNode dependencyNode2 = this.f16048h;
        if (!z11) {
            ConstraintWidget constraintWidget6 = this.f16042b;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour6 = constraintWidget6.f15962U[0];
            this.f16044d = dimensionBehaviour6;
            if (dimensionBehaviour6 != dimensionBehaviour4) {
                if (dimensionBehaviour6 == dimensionBehaviour3 && (constraintWidget4 = constraintWidget6.f15963V) != null && ((dimensionBehaviour2 = constraintWidget4.f15962U[0]) == dimensionBehaviour5 || dimensionBehaviour2 == dimensionBehaviour3)) {
                    int iU = (constraintWidget4.u() - this.f16042b.f15951J.e()) - this.f16042b.f15953L.e();
                    WidgetRun.b(dependencyNode2, constraintWidget4.f15974d.f16048h, this.f16042b.f15951J.e());
                    WidgetRun.b(dependencyNode, constraintWidget4.f15974d.f16049i, -this.f16042b.f15953L.e());
                    aVar.d(iU);
                    return;
                }
                if (dimensionBehaviour6 == dimensionBehaviour5) {
                    aVar.d(constraintWidget6.u());
                }
            }
        } else if (this.f16044d == dimensionBehaviour3 && (constraintWidget2 = (constraintWidget = this.f16042b).f15963V) != null && ((dimensionBehaviour = constraintWidget2.f15962U[0]) == dimensionBehaviour5 || dimensionBehaviour == dimensionBehaviour3)) {
            WidgetRun.b(dependencyNode2, constraintWidget2.f15974d.f16048h, constraintWidget.f15951J.e());
            WidgetRun.b(dependencyNode, constraintWidget2.f15974d.f16049i, -this.f16042b.f15953L.e());
            return;
        }
        if (aVar.j) {
            ConstraintWidget constraintWidget7 = this.f16042b;
            if (constraintWidget7.f15968a) {
                ConstraintAnchor[] constraintAnchorArr = constraintWidget7.f15959R;
                ConstraintAnchor constraintAnchor = constraintAnchorArr[0];
                ConstraintAnchor constraintAnchor2 = constraintAnchor.f15930f;
                if (constraintAnchor2 != null && constraintAnchorArr[1].f15930f != null) {
                    if (constraintWidget7.B()) {
                        dependencyNode2.f16027f = this.f16042b.f15959R[0].e();
                        dependencyNode.f16027f = -this.f16042b.f15959R[1].e();
                        return;
                    }
                    DependencyNode dependencyNodeH = WidgetRun.h(this.f16042b.f15959R[0]);
                    if (dependencyNodeH != null) {
                        WidgetRun.b(dependencyNode2, dependencyNodeH, this.f16042b.f15959R[0].e());
                    }
                    DependencyNode dependencyNodeH2 = WidgetRun.h(this.f16042b.f15959R[1]);
                    if (dependencyNodeH2 != null) {
                        WidgetRun.b(dependencyNode, dependencyNodeH2, -this.f16042b.f15959R[1].e());
                    }
                    dependencyNode2.f16023b = true;
                    dependencyNode.f16023b = true;
                    return;
                }
                if (constraintAnchor2 != null) {
                    DependencyNode dependencyNodeH3 = WidgetRun.h(constraintAnchor);
                    if (dependencyNodeH3 != null) {
                        WidgetRun.b(dependencyNode2, dependencyNodeH3, this.f16042b.f15959R[0].e());
                        WidgetRun.b(dependencyNode, dependencyNode2, aVar.f16028g);
                        return;
                    }
                    return;
                }
                ConstraintAnchor constraintAnchor3 = constraintAnchorArr[1];
                if (constraintAnchor3.f15930f != null) {
                    DependencyNode dependencyNodeH4 = WidgetRun.h(constraintAnchor3);
                    if (dependencyNodeH4 != null) {
                        WidgetRun.b(dependencyNode, dependencyNodeH4, -this.f16042b.f15959R[1].e());
                        WidgetRun.b(dependencyNode2, dependencyNode, -aVar.f16028g);
                        return;
                    }
                    return;
                }
                if ((constraintWidget7 instanceof p089h0.a) || constraintWidget7.f15963V == null || constraintWidget7.m(ConstraintAnchor.Type.f15939g).f15930f != null) {
                    return;
                }
                ConstraintWidget constraintWidget8 = this.f16042b;
                WidgetRun.b(dependencyNode2, constraintWidget8.f15963V.f15974d.f16048h, constraintWidget8.v());
                WidgetRun.b(dependencyNode, dependencyNode2, aVar.f16028g);
                return;
            }
        }
        if (this.f16044d == dimensionBehaviour4) {
            ConstraintWidget constraintWidget9 = this.f16042b;
            int i10 = constraintWidget9.f16001r;
            if (i10 == 2) {
                ConstraintWidget constraintWidget10 = constraintWidget9.f15963V;
                if (constraintWidget10 != null) {
                    a aVar2 = constraintWidget10.f15976e.f16045e;
                    aVar.f16032l.add(aVar2);
                    aVar2.f16031k.add(aVar);
                    aVar.f16023b = true;
                    aVar.f16031k.add(dependencyNode2);
                    aVar.f16031k.add(dependencyNode);
                }
            } else if (i10 == 3) {
                if (constraintWidget9.f16003s == 3) {
                    dependencyNode2.f16022a = this;
                    dependencyNode.f16022a = this;
                    d dVar = constraintWidget9.f15976e;
                    dVar.f16048h.f16022a = this;
                    dVar.f16049i.f16022a = this;
                    aVar.f16022a = this;
                    if (constraintWidget9.C()) {
                        aVar.f16032l.add(this.f16042b.f15976e.f16045e);
                        this.f16042b.f15976e.f16045e.f16031k.add(aVar);
                        d dVar2 = this.f16042b.f15976e;
                        dVar2.f16045e.f16022a = this;
                        aVar.f16032l.add(dVar2.f16048h);
                        aVar.f16032l.add(this.f16042b.f15976e.f16049i);
                        this.f16042b.f15976e.f16048h.f16031k.add(aVar);
                        this.f16042b.f15976e.f16049i.f16031k.add(aVar);
                    } else if (this.f16042b.B()) {
                        this.f16042b.f15976e.f16045e.f16032l.add(aVar);
                        aVar.f16031k.add(this.f16042b.f15976e.f16045e);
                    } else {
                        this.f16042b.f15976e.f16045e.f16032l.add(aVar);
                    }
                } else {
                    a aVar3 = constraintWidget9.f15976e.f16045e;
                    aVar.f16032l.add(aVar3);
                    aVar3.f16031k.add(aVar);
                    this.f16042b.f15976e.f16048h.f16031k.add(aVar);
                    this.f16042b.f15976e.f16049i.f16031k.add(aVar);
                    aVar.f16023b = true;
                    aVar.f16031k.add(dependencyNode2);
                    aVar.f16031k.add(dependencyNode);
                    dependencyNode2.f16032l.add(aVar);
                    dependencyNode.f16032l.add(aVar);
                }
            }
        }
        ConstraintWidget constraintWidget11 = this.f16042b;
        ConstraintAnchor[] constraintAnchorArr2 = constraintWidget11.f15959R;
        ConstraintAnchor constraintAnchor4 = constraintAnchorArr2[0];
        ConstraintAnchor constraintAnchor5 = constraintAnchor4.f15930f;
        if (constraintAnchor5 != null && constraintAnchorArr2[1].f15930f != null) {
            if (constraintWidget11.B()) {
                dependencyNode2.f16027f = this.f16042b.f15959R[0].e();
                dependencyNode.f16027f = -this.f16042b.f15959R[1].e();
                return;
            }
            DependencyNode dependencyNodeH5 = WidgetRun.h(this.f16042b.f15959R[0]);
            DependencyNode dependencyNodeH6 = WidgetRun.h(this.f16042b.f15959R[1]);
            if (dependencyNodeH5 != null) {
                dependencyNodeH5.b(this);
            }
            if (dependencyNodeH6 != null) {
                dependencyNodeH6.b(this);
            }
            this.j = WidgetRun.RunType.f16051c;
            return;
        }
        if (constraintAnchor5 != null) {
            DependencyNode dependencyNodeH7 = WidgetRun.h(constraintAnchor4);
            if (dependencyNodeH7 != null) {
                WidgetRun.b(dependencyNode2, dependencyNodeH7, this.f16042b.f15959R[0].e());
                c(dependencyNode, dependencyNode2, 1, aVar);
                return;
            }
            return;
        }
        ConstraintAnchor constraintAnchor6 = constraintAnchorArr2[1];
        if (constraintAnchor6.f15930f != null) {
            DependencyNode dependencyNodeH8 = WidgetRun.h(constraintAnchor6);
            if (dependencyNodeH8 != null) {
                WidgetRun.b(dependencyNode, dependencyNodeH8, -this.f16042b.f15959R[1].e());
                c(dependencyNode2, dependencyNode, -1, aVar);
                return;
            }
            return;
        }
        if ((constraintWidget11 instanceof p089h0.a) || (constraintWidget3 = constraintWidget11.f15963V) == null) {
            return;
        }
        WidgetRun.b(dependencyNode2, constraintWidget3.f15974d.f16048h, constraintWidget11.v());
        c(dependencyNode, dependencyNode2, 1, aVar);
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public final void e() {
        DependencyNode dependencyNode = this.f16048h;
        if (dependencyNode.j) {
            this.f16042b.f15969a0 = dependencyNode.f16028g;
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public final void f() {
        this.f16043c = null;
        this.f16048h.c();
        this.f16049i.c();
        this.f16045e.c();
        this.f16047g = false;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public final boolean k() {
        return this.f16044d != ConstraintWidget.DimensionBehaviour.f16015d || this.f16042b.f16001r == 0;
    }

    public final void n() {
        this.f16047g = false;
        DependencyNode dependencyNode = this.f16048h;
        dependencyNode.c();
        dependencyNode.j = false;
        DependencyNode dependencyNode2 = this.f16049i;
        dependencyNode2.c();
        dependencyNode2.j = false;
        this.f16045e.j = false;
    }

    public final String toString() {
        return "HorizontalRun " + this.f16042b.f15988k0;
    }
}
