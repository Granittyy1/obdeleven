package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import p101i0.i;

/* JADX INFO: loaded from: classes.dex */
public abstract class WidgetRun implements p101i0.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f16041a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ConstraintWidget f16042b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public i f16043c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ConstraintWidget.DimensionBehaviour f16044d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a f16045e = new a(this);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f16046f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f16047g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final DependencyNode f16048h = new DependencyNode(this);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final DependencyNode f16049i = new DependencyNode(this);
    public RunType j = RunType.f16050b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class RunType {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final RunType f16050b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final RunType f16051c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ RunType[] f16052d;

        static {
            RunType runType = new RunType("NONE", 0);
            f16050b = runType;
            RunType runType2 = new RunType("START", 1);
            RunType runType3 = new RunType("END", 2);
            RunType runType4 = new RunType("CENTER", 3);
            f16051c = runType4;
            f16052d = new RunType[]{runType, runType2, runType3, runType4};
        }

        public RunType() {
            throw null;
        }

        public static RunType valueOf(String str) {
            return (RunType) Enum.valueOf(RunType.class, str);
        }

        public static RunType[] values() {
            return (RunType[]) f16052d.clone();
        }
    }

    public WidgetRun(ConstraintWidget constraintWidget) {
        this.f16042b = constraintWidget;
    }

    public static void b(DependencyNode dependencyNode, DependencyNode dependencyNode2, int i10) {
        dependencyNode.f16032l.add(dependencyNode2);
        dependencyNode.f16027f = i10;
        dependencyNode2.f16031k.add(dependencyNode);
    }

    public static DependencyNode h(ConstraintAnchor constraintAnchor) {
        ConstraintAnchor constraintAnchor2 = constraintAnchor.f15930f;
        if (constraintAnchor2 == null) {
            return null;
        }
        int iOrdinal = constraintAnchor2.f15929e.ordinal();
        ConstraintWidget constraintWidget = constraintAnchor2.f15928d;
        if (iOrdinal == 1) {
            return constraintWidget.f15974d.f16048h;
        }
        if (iOrdinal == 2) {
            return constraintWidget.f15976e.f16048h;
        }
        if (iOrdinal == 3) {
            return constraintWidget.f15974d.f16049i;
        }
        if (iOrdinal == 4) {
            return constraintWidget.f15976e.f16049i;
        }
        if (iOrdinal != 5) {
            return null;
        }
        return constraintWidget.f15976e.f16055k;
    }

    public static DependencyNode i(ConstraintAnchor constraintAnchor, int i10) {
        ConstraintAnchor constraintAnchor2 = constraintAnchor.f15930f;
        if (constraintAnchor2 == null) {
            return null;
        }
        ConstraintWidget constraintWidget = constraintAnchor2.f15928d;
        WidgetRun widgetRun = i10 == 0 ? constraintWidget.f15974d : constraintWidget.f15976e;
        int iOrdinal = constraintAnchor2.f15929e.ordinal();
        if (iOrdinal == 1 || iOrdinal == 2) {
            return widgetRun.f16048h;
        }
        if (iOrdinal == 3 || iOrdinal == 4) {
            return widgetRun.f16049i;
        }
        return null;
    }

    public final void c(DependencyNode dependencyNode, DependencyNode dependencyNode2, int i10, a aVar) {
        dependencyNode.f16032l.add(dependencyNode2);
        dependencyNode.f16032l.add(this.f16045e);
        dependencyNode.f16029h = i10;
        dependencyNode.f16030i = aVar;
        dependencyNode2.f16031k.add(dependencyNode);
        aVar.f16031k.add(dependencyNode);
    }

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public final int g(int i10, int i11) {
        int iMax;
        if (i11 == 0) {
            ConstraintWidget constraintWidget = this.f16042b;
            int i12 = constraintWidget.f16008v;
            iMax = Math.max(constraintWidget.f16007u, i10);
            if (i12 > 0) {
                iMax = Math.min(i12, i10);
            }
            if (iMax == i10) {
                return i10;
            }
        } else {
            ConstraintWidget constraintWidget2 = this.f16042b;
            int i13 = constraintWidget2.f16011y;
            iMax = Math.max(constraintWidget2.f16010x, i10);
            if (i13 > 0) {
                iMax = Math.min(i13, i10);
            }
            if (iMax == i10) {
                return i10;
            }
        }
        return iMax;
    }

    public long j() {
        a aVar = this.f16045e;
        if (aVar.j) {
            return aVar.f16028g;
        }
        return 0L;
    }

    public abstract boolean k();

    /* JADX WARN: Code duplicated, block: B:29:0x0056 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x0058  */
    /* JADX WARN: Code duplicated, block: B:33:0x0060  */
    /* JADX WARN: Code duplicated, block: B:35:0x0064  */
    /* JADX WARN: Code duplicated, block: B:36:0x006b  */
    public final void l(ConstraintAnchor constraintAnchor, ConstraintAnchor constraintAnchor2, int i10) {
        a aVar;
        float f10;
        int i11;
        DependencyNode dependencyNodeH = h(constraintAnchor);
        DependencyNode dependencyNodeH2 = h(constraintAnchor2);
        if (dependencyNodeH.j && dependencyNodeH2.j) {
            int iE = constraintAnchor.e() + dependencyNodeH.f16028g;
            int iE2 = dependencyNodeH2.f16028g - constraintAnchor2.e();
            int i12 = iE2 - iE;
            a aVar2 = this.f16045e;
            if (!aVar2.j) {
                ConstraintWidget.DimensionBehaviour dimensionBehaviour = this.f16044d;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.f16015d;
                if (dimensionBehaviour == dimensionBehaviour2) {
                    int i13 = this.f16041a;
                    if (i13 == 0) {
                        aVar2.d(g(i12, i10));
                    } else if (i13 == 1) {
                        aVar2.d(Math.min(g(aVar2.f16053m, i10), i12));
                    } else if (i13 == 2) {
                        ConstraintWidget constraintWidget = this.f16042b;
                        ConstraintWidget constraintWidget2 = constraintWidget.f15963V;
                        if (constraintWidget2 != null) {
                            a aVar3 = (i10 == 0 ? constraintWidget2.f15974d : constraintWidget2.f15976e).f16045e;
                            if (aVar3.j) {
                                aVar2.d(g((int) ((aVar3.f16028g * (i10 == 0 ? constraintWidget.f16009w : constraintWidget.f16012z)) + 0.5f), i10));
                            }
                        }
                    } else if (i13 == 3) {
                        ConstraintWidget constraintWidget3 = this.f16042b;
                        WidgetRun widgetRun = constraintWidget3.f15974d;
                        if (widgetRun.f16044d == dimensionBehaviour2 && widgetRun.f16041a == 3) {
                            d dVar = constraintWidget3.f15976e;
                            if (dVar.f16044d != dimensionBehaviour2 || dVar.f16041a != 3) {
                                if (i10 == 0) {
                                    widgetRun = constraintWidget3.f15976e;
                                }
                                aVar = widgetRun.f16045e;
                                if (aVar.j) {
                                    f10 = constraintWidget3.f15966Y;
                                    if (i10 == 1) {
                                        i11 = (int) ((aVar.f16028g / f10) + 0.5f);
                                    } else {
                                        i11 = (int) ((f10 * aVar.f16028g) + 0.5f);
                                    }
                                    aVar2.d(i11);
                                }
                            }
                        } else {
                            if (i10 == 0) {
                                widgetRun = constraintWidget3.f15976e;
                            }
                            aVar = widgetRun.f16045e;
                            if (aVar.j) {
                                f10 = constraintWidget3.f15966Y;
                                if (i10 == 1) {
                                    i11 = (int) ((aVar.f16028g / f10) + 0.5f);
                                } else {
                                    i11 = (int) ((f10 * aVar.f16028g) + 0.5f);
                                }
                                aVar2.d(i11);
                            }
                        }
                    }
                }
            }
            if (aVar2.j) {
                int i14 = aVar2.f16028g;
                DependencyNode dependencyNode = this.f16049i;
                DependencyNode dependencyNode2 = this.f16048h;
                if (i14 == i12) {
                    dependencyNode2.d(iE);
                    dependencyNode.d(iE2);
                    return;
                }
                float f11 = i10 == 0 ? this.f16042b.f15979f0 : this.f16042b.f15981g0;
                if (dependencyNodeH == dependencyNodeH2) {
                    iE = dependencyNodeH.f16028g;
                    iE2 = dependencyNodeH2.f16028g;
                    f11 = 0.5f;
                }
                dependencyNode2.d((int) ((((iE2 - iE) - i14) * f11) + iE + 0.5f));
                dependencyNode.d(dependencyNode2.f16028g + aVar2.f16028g);
            }
        }
    }

    @Override // p101i0.d
    public void a(p101i0.d dVar) {
    }
}
