package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;

/* JADX INFO: compiled from: VerticalWidgetRun.java */
/* JADX INFO: loaded from: classes.dex */
public final class d extends WidgetRun {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final DependencyNode f16055k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public p101i0.a f16056l;

    public d(ConstraintWidget constraintWidget) {
        super(constraintWidget);
        DependencyNode dependencyNode = new DependencyNode(this);
        this.f16055k = dependencyNode;
        this.f16056l = null;
        this.f16048h.f16026e = DependencyNode.Type.f16038g;
        this.f16049i.f16026e = DependencyNode.Type.f16039h;
        dependencyNode.f16026e = DependencyNode.Type.f16040i;
        this.f16046f = 1;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun, p101i0.d
    public final void a(p101i0.d dVar) {
        float f10;
        float f11;
        float f12;
        int i10;
        if (this.j.ordinal() == 3) {
            ConstraintWidget constraintWidget = this.f16042b;
            l(constraintWidget.f15952K, constraintWidget.f15954M, 1);
            return;
        }
        a aVar = this.f16045e;
        boolean z10 = aVar.f16024c;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.f16015d;
        if (z10 && !aVar.j && this.f16044d == dimensionBehaviour) {
            ConstraintWidget constraintWidget2 = this.f16042b;
            int i11 = constraintWidget2.f16003s;
            if (i11 == 2) {
                ConstraintWidget constraintWidget3 = constraintWidget2.f15963V;
                if (constraintWidget3 != null) {
                    a aVar2 = constraintWidget3.f15976e.f16045e;
                    if (aVar2.j) {
                        aVar.d((int) ((aVar2.f16028g * constraintWidget2.f16012z) + 0.5f));
                    }
                }
            } else if (i11 == 3) {
                a aVar3 = constraintWidget2.f15974d.f16045e;
                if (aVar3.j) {
                    int i12 = constraintWidget2.f15967Z;
                    if (i12 != -1) {
                        if (i12 == 0) {
                            f12 = aVar3.f16028g * constraintWidget2.f15966Y;
                            i10 = (int) (f12 + 0.5f);
                        } else if (i12 != 1) {
                            i10 = 0;
                        } else {
                            f10 = aVar3.f16028g;
                            f11 = constraintWidget2.f15966Y;
                        }
                        aVar.d(i10);
                    } else {
                        f10 = aVar3.f16028g;
                        f11 = constraintWidget2.f15966Y;
                    }
                    f12 = f10 / f11;
                    i10 = (int) (f12 + 0.5f);
                    aVar.d(i10);
                }
            }
        }
        DependencyNode dependencyNode = this.f16048h;
        if (dependencyNode.f16024c) {
            DependencyNode dependencyNode2 = this.f16049i;
            if (dependencyNode2.f16024c) {
                if (dependencyNode.j && dependencyNode2.j && aVar.j) {
                    return;
                }
                if (!aVar.j && this.f16044d == dimensionBehaviour) {
                    ConstraintWidget constraintWidget4 = this.f16042b;
                    if (constraintWidget4.f16001r == 0 && !constraintWidget4.C()) {
                        DependencyNode dependencyNode3 = (DependencyNode) dependencyNode.f16032l.get(0);
                        DependencyNode dependencyNode4 = (DependencyNode) dependencyNode2.f16032l.get(0);
                        int i13 = dependencyNode3.f16028g + dependencyNode.f16027f;
                        int i14 = dependencyNode4.f16028g + dependencyNode2.f16027f;
                        dependencyNode.d(i13);
                        dependencyNode2.d(i14);
                        aVar.d(i14 - i13);
                        return;
                    }
                }
                if (!aVar.j && this.f16044d == dimensionBehaviour && this.f16041a == 1 && dependencyNode.f16032l.size() > 0 && dependencyNode2.f16032l.size() > 0) {
                    DependencyNode dependencyNode5 = (DependencyNode) dependencyNode.f16032l.get(0);
                    int i15 = (((DependencyNode) dependencyNode2.f16032l.get(0)).f16028g + dependencyNode2.f16027f) - (dependencyNode5.f16028g + dependencyNode.f16027f);
                    int i16 = aVar.f16053m;
                    if (i15 < i16) {
                        aVar.d(i15);
                    } else {
                        aVar.d(i16);
                    }
                }
                if (aVar.j && dependencyNode.f16032l.size() > 0 && dependencyNode2.f16032l.size() > 0) {
                    DependencyNode dependencyNode6 = (DependencyNode) dependencyNode.f16032l.get(0);
                    DependencyNode dependencyNode7 = (DependencyNode) dependencyNode2.f16032l.get(0);
                    int i17 = dependencyNode6.f16028g;
                    int i18 = dependencyNode.f16027f + i17;
                    int i19 = dependencyNode7.f16028g;
                    int i20 = dependencyNode2.f16027f + i19;
                    float f13 = this.f16042b.f15981g0;
                    if (dependencyNode6 == dependencyNode7) {
                        f13 = 0.5f;
                    } else {
                        i17 = i18;
                        i19 = i20;
                    }
                    dependencyNode.d((int) ((((i19 - i17) - aVar.f16028g) * f13) + i17 + 0.5f));
                    dependencyNode2.d(dependencyNode.f16028g + aVar.f16028g);
                }
            }
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public final void d() {
        ConstraintWidget constraintWidget;
        ConstraintWidget constraintWidget2;
        ConstraintWidget constraintWidget3;
        ConstraintWidget constraintWidget4;
        ConstraintWidget constraintWidget5 = this.f16042b;
        boolean z10 = constraintWidget5.f15968a;
        a aVar = this.f16045e;
        if (z10) {
            aVar.d(constraintWidget5.o());
        }
        boolean z11 = aVar.j;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.f16016e;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.f16013b;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.f16015d;
        DependencyNode dependencyNode = this.f16049i;
        DependencyNode dependencyNode2 = this.f16048h;
        if (!z11) {
            ConstraintWidget constraintWidget6 = this.f16042b;
            this.f16044d = constraintWidget6.f15962U[1];
            if (constraintWidget6.f15946E) {
                this.f16056l = new p101i0.a(this);
            }
            ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = this.f16044d;
            if (dimensionBehaviour4 != dimensionBehaviour3) {
                if (dimensionBehaviour4 == dimensionBehaviour && (constraintWidget4 = this.f16042b.f15963V) != null && constraintWidget4.f15962U[1] == dimensionBehaviour2) {
                    int iO = (constraintWidget4.o() - this.f16042b.f15952K.e()) - this.f16042b.f15954M.e();
                    WidgetRun.b(dependencyNode2, constraintWidget4.f15976e.f16048h, this.f16042b.f15952K.e());
                    WidgetRun.b(dependencyNode, constraintWidget4.f15976e.f16049i, -this.f16042b.f15954M.e());
                    aVar.d(iO);
                    return;
                }
                if (dimensionBehaviour4 == dimensionBehaviour2) {
                    aVar.d(this.f16042b.o());
                }
            }
        } else if (this.f16044d == dimensionBehaviour && (constraintWidget2 = (constraintWidget = this.f16042b).f15963V) != null && constraintWidget2.f15962U[1] == dimensionBehaviour2) {
            WidgetRun.b(dependencyNode2, constraintWidget2.f15976e.f16048h, constraintWidget.f15952K.e());
            WidgetRun.b(dependencyNode, constraintWidget2.f15976e.f16049i, -this.f16042b.f15954M.e());
            return;
        }
        boolean z12 = aVar.j;
        DependencyNode dependencyNode3 = this.f16055k;
        if (z12) {
            ConstraintWidget constraintWidget7 = this.f16042b;
            if (constraintWidget7.f15968a) {
                ConstraintAnchor[] constraintAnchorArr = constraintWidget7.f15959R;
                ConstraintAnchor constraintAnchor = constraintAnchorArr[2];
                ConstraintAnchor constraintAnchor2 = constraintAnchor.f15930f;
                if (constraintAnchor2 != null && constraintAnchorArr[3].f15930f != null) {
                    if (constraintWidget7.C()) {
                        dependencyNode2.f16027f = this.f16042b.f15959R[2].e();
                        dependencyNode.f16027f = -this.f16042b.f15959R[3].e();
                    } else {
                        DependencyNode dependencyNodeH = WidgetRun.h(this.f16042b.f15959R[2]);
                        if (dependencyNodeH != null) {
                            WidgetRun.b(dependencyNode2, dependencyNodeH, this.f16042b.f15959R[2].e());
                        }
                        DependencyNode dependencyNodeH2 = WidgetRun.h(this.f16042b.f15959R[3]);
                        if (dependencyNodeH2 != null) {
                            WidgetRun.b(dependencyNode, dependencyNodeH2, -this.f16042b.f15959R[3].e());
                        }
                        dependencyNode2.f16023b = true;
                        dependencyNode.f16023b = true;
                    }
                    ConstraintWidget constraintWidget8 = this.f16042b;
                    if (constraintWidget8.f15946E) {
                        WidgetRun.b(dependencyNode3, dependencyNode2, constraintWidget8.f15973c0);
                        return;
                    }
                    return;
                }
                if (constraintAnchor2 != null) {
                    DependencyNode dependencyNodeH3 = WidgetRun.h(constraintAnchor);
                    if (dependencyNodeH3 != null) {
                        WidgetRun.b(dependencyNode2, dependencyNodeH3, this.f16042b.f15959R[2].e());
                        WidgetRun.b(dependencyNode, dependencyNode2, aVar.f16028g);
                        ConstraintWidget constraintWidget9 = this.f16042b;
                        if (constraintWidget9.f15946E) {
                            WidgetRun.b(dependencyNode3, dependencyNode2, constraintWidget9.f15973c0);
                            return;
                        }
                        return;
                    }
                    return;
                }
                ConstraintAnchor constraintAnchor3 = constraintAnchorArr[3];
                if (constraintAnchor3.f15930f != null) {
                    DependencyNode dependencyNodeH4 = WidgetRun.h(constraintAnchor3);
                    if (dependencyNodeH4 != null) {
                        WidgetRun.b(dependencyNode, dependencyNodeH4, -this.f16042b.f15959R[3].e());
                        WidgetRun.b(dependencyNode2, dependencyNode, -aVar.f16028g);
                    }
                    ConstraintWidget constraintWidget10 = this.f16042b;
                    if (constraintWidget10.f15946E) {
                        WidgetRun.b(dependencyNode3, dependencyNode2, constraintWidget10.f15973c0);
                        return;
                    }
                    return;
                }
                ConstraintAnchor constraintAnchor4 = constraintAnchorArr[4];
                if (constraintAnchor4.f15930f != null) {
                    DependencyNode dependencyNodeH5 = WidgetRun.h(constraintAnchor4);
                    if (dependencyNodeH5 != null) {
                        WidgetRun.b(dependencyNode3, dependencyNodeH5, 0);
                        WidgetRun.b(dependencyNode2, dependencyNode3, -this.f16042b.f15973c0);
                        WidgetRun.b(dependencyNode, dependencyNode2, aVar.f16028g);
                        return;
                    }
                    return;
                }
                if ((constraintWidget7 instanceof p089h0.a) || constraintWidget7.f15963V == null || constraintWidget7.m(ConstraintAnchor.Type.f15939g).f15930f != null) {
                    return;
                }
                ConstraintWidget constraintWidget11 = this.f16042b;
                WidgetRun.b(dependencyNode2, constraintWidget11.f15963V.f15976e.f16048h, constraintWidget11.w());
                WidgetRun.b(dependencyNode, dependencyNode2, aVar.f16028g);
                ConstraintWidget constraintWidget12 = this.f16042b;
                if (constraintWidget12.f15946E) {
                    WidgetRun.b(dependencyNode3, dependencyNode2, constraintWidget12.f15973c0);
                    return;
                }
                return;
            }
        }
        if (z12 || this.f16044d != dimensionBehaviour3) {
            aVar.b(this);
        } else {
            ConstraintWidget constraintWidget13 = this.f16042b;
            int i10 = constraintWidget13.f16003s;
            if (i10 == 2) {
                ConstraintWidget constraintWidget14 = constraintWidget13.f15963V;
                if (constraintWidget14 != null) {
                    a aVar2 = constraintWidget14.f15976e.f16045e;
                    aVar.f16032l.add(aVar2);
                    aVar2.f16031k.add(aVar);
                    aVar.f16023b = true;
                    aVar.f16031k.add(dependencyNode2);
                    aVar.f16031k.add(dependencyNode);
                }
            } else if (i10 == 3 && !constraintWidget13.C()) {
                ConstraintWidget constraintWidget15 = this.f16042b;
                if (constraintWidget15.f16001r != 3) {
                    a aVar3 = constraintWidget15.f15974d.f16045e;
                    aVar.f16032l.add(aVar3);
                    aVar3.f16031k.add(aVar);
                    aVar.f16023b = true;
                    aVar.f16031k.add(dependencyNode2);
                    aVar.f16031k.add(dependencyNode);
                }
            }
        }
        ConstraintWidget constraintWidget16 = this.f16042b;
        ConstraintAnchor[] constraintAnchorArr2 = constraintWidget16.f15959R;
        ConstraintAnchor constraintAnchor5 = constraintAnchorArr2[2];
        ConstraintAnchor constraintAnchor6 = constraintAnchor5.f15930f;
        if (constraintAnchor6 != null && constraintAnchorArr2[3].f15930f != null) {
            if (constraintWidget16.C()) {
                dependencyNode2.f16027f = this.f16042b.f15959R[2].e();
                dependencyNode.f16027f = -this.f16042b.f15959R[3].e();
            } else {
                DependencyNode dependencyNodeH6 = WidgetRun.h(this.f16042b.f15959R[2]);
                DependencyNode dependencyNodeH7 = WidgetRun.h(this.f16042b.f15959R[3]);
                if (dependencyNodeH6 != null) {
                    dependencyNodeH6.b(this);
                }
                if (dependencyNodeH7 != null) {
                    dependencyNodeH7.b(this);
                }
                this.j = WidgetRun.RunType.f16051c;
            }
            if (this.f16042b.f15946E) {
                c(dependencyNode3, dependencyNode2, 1, this.f16056l);
            }
        } else if (constraintAnchor6 != null) {
            DependencyNode dependencyNodeH8 = WidgetRun.h(constraintAnchor5);
            if (dependencyNodeH8 != null) {
                WidgetRun.b(dependencyNode2, dependencyNodeH8, this.f16042b.f15959R[2].e());
                c(dependencyNode, dependencyNode2, 1, aVar);
                if (this.f16042b.f15946E) {
                    c(dependencyNode3, dependencyNode2, 1, this.f16056l);
                }
                if (this.f16044d == dimensionBehaviour3) {
                    ConstraintWidget constraintWidget17 = this.f16042b;
                    if (constraintWidget17.f15966Y > 0.0f) {
                        c cVar = constraintWidget17.f15974d;
                        if (cVar.f16044d == dimensionBehaviour3) {
                            cVar.f16045e.f16031k.add(aVar);
                            aVar.f16032l.add(this.f16042b.f15974d.f16045e);
                            aVar.f16022a = this;
                        }
                    }
                }
            }
        } else {
            ConstraintAnchor constraintAnchor7 = constraintAnchorArr2[3];
            if (constraintAnchor7.f15930f != null) {
                DependencyNode dependencyNodeH9 = WidgetRun.h(constraintAnchor7);
                if (dependencyNodeH9 != null) {
                    WidgetRun.b(dependencyNode, dependencyNodeH9, -this.f16042b.f15959R[3].e());
                    c(dependencyNode2, dependencyNode, -1, aVar);
                    if (this.f16042b.f15946E) {
                        c(dependencyNode3, dependencyNode2, 1, this.f16056l);
                    }
                }
            } else {
                ConstraintAnchor constraintAnchor8 = constraintAnchorArr2[4];
                if (constraintAnchor8.f15930f != null) {
                    DependencyNode dependencyNodeH10 = WidgetRun.h(constraintAnchor8);
                    if (dependencyNodeH10 != null) {
                        WidgetRun.b(dependencyNode3, dependencyNodeH10, 0);
                        c(dependencyNode2, dependencyNode3, -1, this.f16056l);
                        c(dependencyNode, dependencyNode2, 1, aVar);
                    }
                } else if (!(constraintWidget16 instanceof p089h0.a) && (constraintWidget3 = constraintWidget16.f15963V) != null) {
                    WidgetRun.b(dependencyNode2, constraintWidget3.f15976e.f16048h, constraintWidget16.w());
                    c(dependencyNode, dependencyNode2, 1, aVar);
                    if (this.f16042b.f15946E) {
                        c(dependencyNode3, dependencyNode2, 1, this.f16056l);
                    }
                    if (this.f16044d == dimensionBehaviour3) {
                        ConstraintWidget constraintWidget18 = this.f16042b;
                        if (constraintWidget18.f15966Y > 0.0f) {
                            c cVar2 = constraintWidget18.f15974d;
                            if (cVar2.f16044d == dimensionBehaviour3) {
                                cVar2.f16045e.f16031k.add(aVar);
                                aVar.f16032l.add(this.f16042b.f15974d.f16045e);
                                aVar.f16022a = this;
                            }
                        }
                    }
                }
            }
        }
        if (aVar.f16032l.size() == 0) {
            aVar.f16024c = true;
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public final void e() {
        DependencyNode dependencyNode = this.f16048h;
        if (dependencyNode.j) {
            this.f16042b.f15971b0 = dependencyNode.f16028g;
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public final void f() {
        this.f16043c = null;
        this.f16048h.c();
        this.f16049i.c();
        this.f16055k.c();
        this.f16045e.c();
        this.f16047g = false;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public final boolean k() {
        return this.f16044d != ConstraintWidget.DimensionBehaviour.f16015d || this.f16042b.f16003s == 0;
    }

    public final void m() {
        this.f16047g = false;
        DependencyNode dependencyNode = this.f16048h;
        dependencyNode.c();
        dependencyNode.j = false;
        DependencyNode dependencyNode2 = this.f16049i;
        dependencyNode2.c();
        dependencyNode2.j = false;
        DependencyNode dependencyNode3 = this.f16055k;
        dependencyNode3.c();
        dependencyNode3.j = false;
        this.f16045e.j = false;
    }

    public final String toString() {
        return "VerticalRun " + this.f16042b.f15988k0;
    }
}
