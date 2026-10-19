package p101i0;

import Z3.n;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.analyzer.DependencyNode;
import androidx.constraintlayout.core.widgets.analyzer.WidgetRun;
import androidx.constraintlayout.core.widgets.analyzer.a;
import androidx.constraintlayout.core.widgets.analyzer.c;
import androidx.constraintlayout.core.widgets.d;
import androidx.constraintlayout.core.widgets.f;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import p089h0.b;

/* JADX INFO: compiled from: DependencyGraph.java */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public d f36475a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f36476b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f36477c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public d f36478d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ArrayList<WidgetRun> f36479e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public b.InterfaceC0381b f36480f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public b.a f36481g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ArrayList<i> f36482h;

    public final void a(DependencyNode dependencyNode, int i10, ArrayList arrayList, i iVar) {
        WidgetRun widgetRun = dependencyNode.f16025d;
        if (widgetRun.f16043c == null) {
            d dVar = this.f36475a;
            if (widgetRun == dVar.f15974d || widgetRun == dVar.f15976e) {
                return;
            }
            if (iVar == null) {
                iVar = new i();
                iVar.f36484a = null;
                iVar.f36485b = new ArrayList<>();
                iVar.f36484a = widgetRun;
                arrayList.add(iVar);
            }
            widgetRun.f16043c = iVar;
            iVar.f36485b.add(widgetRun);
            DependencyNode dependencyNode2 = widgetRun.f16048h;
            for (d dVar2 : dependencyNode2.f16031k) {
                if (dVar2 instanceof DependencyNode) {
                    a((DependencyNode) dVar2, i10, arrayList, iVar);
                }
            }
            DependencyNode dependencyNode3 = widgetRun.f16049i;
            for (d dVar3 : dependencyNode3.f16031k) {
                if (dVar3 instanceof DependencyNode) {
                    a((DependencyNode) dVar3, i10, arrayList, iVar);
                }
            }
            if (i10 == 1 && (widgetRun instanceof androidx.constraintlayout.core.widgets.analyzer.d)) {
                for (d dVar4 : ((androidx.constraintlayout.core.widgets.analyzer.d) widgetRun).f16055k.f16031k) {
                    if (dVar4 instanceof DependencyNode) {
                        a((DependencyNode) dVar4, i10, arrayList, iVar);
                    }
                }
            }
            Iterator it = dependencyNode2.f16032l.iterator();
            while (it.hasNext()) {
                a((DependencyNode) it.next(), i10, arrayList, iVar);
            }
            Iterator it2 = dependencyNode3.f16032l.iterator();
            while (it2.hasNext()) {
                a((DependencyNode) it2.next(), i10, arrayList, iVar);
            }
            if (i10 == 1 && (widgetRun instanceof androidx.constraintlayout.core.widgets.analyzer.d)) {
                Iterator it3 = ((androidx.constraintlayout.core.widgets.analyzer.d) widgetRun).f16055k.f16032l.iterator();
                while (it3.hasNext()) {
                    a((DependencyNode) it3.next(), i10, arrayList, iVar);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:112:0x025d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:114:0x0261 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:124:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:85:0x0183  */
    /* JADX WARN: Code duplicated, block: B:86:0x0185 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:89:0x018b  */
    public final void b(d dVar) {
        int iU;
        int iO;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour;
        Iterator<ConstraintWidget> it = dVar.f35715u0.iterator();
        while (it.hasNext()) {
            ConstraintWidget next = it.next();
            ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = next.f15962U;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = dimensionBehaviourArr[0];
            ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = dimensionBehaviourArr[1];
            if (next.f15985i0 == 8) {
                next.f15968a = true;
            } else {
                float f10 = next.f16009w;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.f16015d;
                if (f10 < 1.0f && dimensionBehaviour2 == dimensionBehaviour4) {
                    next.f16001r = 2;
                }
                float f11 = next.f16012z;
                if (f11 < 1.0f && dimensionBehaviour3 == dimensionBehaviour4) {
                    next.f16003s = 2;
                }
                float f12 = next.f15966Y;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour5 = ConstraintWidget.DimensionBehaviour.f16014c;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour6 = ConstraintWidget.DimensionBehaviour.f16013b;
                if (f12 > 0.0f) {
                    if (dimensionBehaviour2 == dimensionBehaviour4 && (dimensionBehaviour3 == dimensionBehaviour5 || dimensionBehaviour3 == dimensionBehaviour6)) {
                        next.f16001r = 3;
                    } else if (dimensionBehaviour3 == dimensionBehaviour4 && (dimensionBehaviour2 == dimensionBehaviour5 || dimensionBehaviour2 == dimensionBehaviour6)) {
                        next.f16003s = 3;
                    } else if (dimensionBehaviour2 == dimensionBehaviour4 && dimensionBehaviour3 == dimensionBehaviour4) {
                        if (next.f16001r == 0) {
                            next.f16001r = 3;
                        }
                        if (next.f16003s == 0) {
                            next.f16003s = 3;
                        }
                    }
                }
                ConstraintAnchor constraintAnchor = next.f15953L;
                ConstraintAnchor constraintAnchor2 = next.f15951J;
                if (dimensionBehaviour2 == dimensionBehaviour4 && next.f16001r == 1 && (constraintAnchor2.f15930f == null || constraintAnchor.f15930f == null)) {
                    dimensionBehaviour2 = dimensionBehaviour5;
                }
                ConstraintAnchor constraintAnchor3 = next.f15954M;
                ConstraintAnchor constraintAnchor4 = next.f15952K;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour7 = (dimensionBehaviour3 == dimensionBehaviour4 && next.f16003s == 1 && (constraintAnchor4.f15930f == null || constraintAnchor3.f15930f == null)) ? dimensionBehaviour5 : dimensionBehaviour3;
                c cVar = next.f15974d;
                cVar.f16044d = dimensionBehaviour2;
                int i10 = next.f16001r;
                cVar.f16041a = i10;
                androidx.constraintlayout.core.widgets.analyzer.d dVar2 = next.f15976e;
                dVar2.f16044d = dimensionBehaviour7;
                Iterator<ConstraintWidget> it2 = it;
                int i11 = next.f16003s;
                dVar2.f16041a = i11;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour8 = ConstraintWidget.DimensionBehaviour.f16016e;
                if ((dimensionBehaviour2 == dimensionBehaviour8 || dimensionBehaviour2 == dimensionBehaviour6 || dimensionBehaviour2 == dimensionBehaviour5) && (dimensionBehaviour7 == dimensionBehaviour8 || dimensionBehaviour7 == dimensionBehaviour6 || dimensionBehaviour7 == dimensionBehaviour5)) {
                    int iU2 = next.u();
                    if (dimensionBehaviour2 == dimensionBehaviour8) {
                        iU = (dVar.u() - constraintAnchor2.f15931g) - constraintAnchor.f15931g;
                        dimensionBehaviour2 = dimensionBehaviour6;
                    } else {
                        iU = iU2;
                    }
                    int iO2 = next.o();
                    if (dimensionBehaviour7 == dimensionBehaviour8) {
                        iO = (dVar.o() - constraintAnchor4.f15931g) - constraintAnchor3.f15931g;
                        dimensionBehaviour = dimensionBehaviour6;
                    } else {
                        iO = iO2;
                        dimensionBehaviour = dimensionBehaviour7;
                    }
                    f(next, dimensionBehaviour2, iU, dimensionBehaviour, iO);
                    next.f15974d.f16045e.d(next.u());
                    next.f15976e.f16045e.d(next.o());
                    next.f15968a = true;
                } else {
                    ConstraintAnchor[] constraintAnchorArr = next.f15959R;
                    if (dimensionBehaviour2 == dimensionBehaviour4 && (dimensionBehaviour7 == dimensionBehaviour5 || dimensionBehaviour7 == dimensionBehaviour6)) {
                        if (i10 == 3) {
                            if (dimensionBehaviour7 == dimensionBehaviour5) {
                                f(next, dimensionBehaviour5, 0, dimensionBehaviour5, 0);
                            }
                            int iO3 = next.o();
                            f(next, dimensionBehaviour6, (int) ((iO3 * next.f15966Y) + 0.5f), dimensionBehaviour6, iO3);
                            next.f15974d.f16045e.d(next.u());
                            next.f15976e.f16045e.d(next.o());
                            next.f15968a = true;
                        } else if (i10 == 1) {
                            f(next, dimensionBehaviour5, 0, dimensionBehaviour7, 0);
                            next.f15974d.f16045e.f16053m = next.u();
                        } else if (i10 == 2) {
                            ConstraintWidget.DimensionBehaviour dimensionBehaviour9 = dVar.f15962U[0];
                            if (dimensionBehaviour9 == dimensionBehaviour6 || dimensionBehaviour9 == dimensionBehaviour8) {
                                f(next, dimensionBehaviour6, (int) ((f10 * dVar.u()) + 0.5f), dimensionBehaviour7, next.o());
                                next.f15974d.f16045e.d(next.u());
                                next.f15976e.f16045e.d(next.o());
                                next.f15968a = true;
                            } else if (dimensionBehaviour7 == dimensionBehaviour4) {
                                if (dimensionBehaviour2 == dimensionBehaviour4) {
                                    if (i10 != 1) {
                                        f(next, dimensionBehaviour5, 0, dimensionBehaviour5, 0);
                                        next.f15974d.f16045e.f16053m = next.u();
                                        next.f15976e.f16045e.f16053m = next.o();
                                    } else {
                                        f(next, dimensionBehaviour5, 0, dimensionBehaviour5, 0);
                                        next.f15974d.f16045e.f16053m = next.u();
                                        next.f15976e.f16045e.f16053m = next.o();
                                    }
                                }
                            } else if (dimensionBehaviour2 == dimensionBehaviour4) {
                                if (i10 != 1) {
                                    f(next, dimensionBehaviour5, 0, dimensionBehaviour5, 0);
                                    next.f15974d.f16045e.f16053m = next.u();
                                    next.f15976e.f16045e.f16053m = next.o();
                                } else {
                                    f(next, dimensionBehaviour5, 0, dimensionBehaviour5, 0);
                                    next.f15974d.f16045e.f16053m = next.u();
                                    next.f15976e.f16045e.f16053m = next.o();
                                }
                            }
                        } else if (constraintAnchorArr[0].f15930f == null || constraintAnchorArr[1].f15930f == null) {
                            f(next, dimensionBehaviour5, 0, dimensionBehaviour7, 0);
                            next.f15974d.f16045e.d(next.u());
                            next.f15976e.f16045e.d(next.o());
                            next.f15968a = true;
                        } else if (dimensionBehaviour7 == dimensionBehaviour4) {
                            if (dimensionBehaviour2 == dimensionBehaviour4) {
                                if (i10 != 1) {
                                    f(next, dimensionBehaviour5, 0, dimensionBehaviour5, 0);
                                    next.f15974d.f16045e.f16053m = next.u();
                                    next.f15976e.f16045e.f16053m = next.o();
                                } else {
                                    f(next, dimensionBehaviour5, 0, dimensionBehaviour5, 0);
                                    next.f15974d.f16045e.f16053m = next.u();
                                    next.f15976e.f16045e.f16053m = next.o();
                                }
                            }
                        } else if (dimensionBehaviour2 == dimensionBehaviour4) {
                            if (i10 != 1) {
                                f(next, dimensionBehaviour5, 0, dimensionBehaviour5, 0);
                                next.f15974d.f16045e.f16053m = next.u();
                                next.f15976e.f16045e.f16053m = next.o();
                            } else {
                                f(next, dimensionBehaviour5, 0, dimensionBehaviour5, 0);
                                next.f15974d.f16045e.f16053m = next.u();
                                next.f15976e.f16045e.f16053m = next.o();
                            }
                        }
                    } else if (dimensionBehaviour7 == dimensionBehaviour4 || !(dimensionBehaviour2 == dimensionBehaviour5 || dimensionBehaviour2 == dimensionBehaviour6)) {
                        if (dimensionBehaviour2 == dimensionBehaviour4 && dimensionBehaviour7 == dimensionBehaviour4) {
                            if (i10 != 1 || i11 == 1) {
                                f(next, dimensionBehaviour5, 0, dimensionBehaviour5, 0);
                                next.f15974d.f16045e.f16053m = next.u();
                                next.f15976e.f16045e.f16053m = next.o();
                            } else if (i11 == 2 && i10 == 2) {
                                ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr2 = dVar.f15962U;
                                if (dimensionBehaviourArr2[0] == dimensionBehaviour6 && dimensionBehaviourArr2[1] == dimensionBehaviour6) {
                                    f(next, dimensionBehaviour6, (int) ((f10 * dVar.u()) + 0.5f), dimensionBehaviour6, (int) ((f11 * dVar.o()) + 0.5f));
                                    next.f15974d.f16045e.d(next.u());
                                    next.f15976e.f16045e.d(next.o());
                                    next.f15968a = true;
                                }
                            }
                        }
                    } else if (i11 == 3) {
                        if (dimensionBehaviour2 == dimensionBehaviour5) {
                            f(next, dimensionBehaviour5, 0, dimensionBehaviour5, 0);
                        }
                        int iU3 = next.u();
                        float f13 = next.f15966Y;
                        if (next.f15967Z == -1) {
                            f13 = 1.0f / f13;
                        }
                        f(next, dimensionBehaviour6, iU3, dimensionBehaviour6, (int) ((iU3 * f13) + 0.5f));
                        next.f15974d.f16045e.d(next.u());
                        next.f15976e.f16045e.d(next.o());
                        next.f15968a = true;
                    } else if (i11 == 1) {
                        f(next, dimensionBehaviour2, 0, dimensionBehaviour5, 0);
                        next.f15976e.f16045e.f16053m = next.o();
                    } else if (i11 == 2) {
                        ConstraintWidget.DimensionBehaviour dimensionBehaviour10 = dVar.f15962U[1];
                        if (dimensionBehaviour10 == dimensionBehaviour6 || dimensionBehaviour10 == dimensionBehaviour8) {
                            f(next, dimensionBehaviour2, next.u(), dimensionBehaviour6, (int) ((f11 * dVar.o()) + 0.5f));
                            next.f15974d.f16045e.d(next.u());
                            next.f15976e.f16045e.d(next.o());
                            next.f15968a = true;
                        } else if (dimensionBehaviour2 == dimensionBehaviour4) {
                            if (i10 != 1) {
                                f(next, dimensionBehaviour5, 0, dimensionBehaviour5, 0);
                                next.f15974d.f16045e.f16053m = next.u();
                                next.f15976e.f16045e.f16053m = next.o();
                            } else {
                                f(next, dimensionBehaviour5, 0, dimensionBehaviour5, 0);
                                next.f15974d.f16045e.f16053m = next.u();
                                next.f15976e.f16045e.f16053m = next.o();
                            }
                        }
                    } else if (constraintAnchorArr[2].f15930f == null || constraintAnchorArr[3].f15930f == null) {
                        f(next, dimensionBehaviour5, 0, dimensionBehaviour7, 0);
                        next.f15974d.f16045e.d(next.u());
                        next.f15976e.f16045e.d(next.o());
                        next.f15968a = true;
                    } else if (dimensionBehaviour2 == dimensionBehaviour4) {
                        if (i10 != 1) {
                            f(next, dimensionBehaviour5, 0, dimensionBehaviour5, 0);
                            next.f15974d.f16045e.f16053m = next.u();
                            next.f15976e.f16045e.f16053m = next.o();
                        } else {
                            f(next, dimensionBehaviour5, 0, dimensionBehaviour5, 0);
                            next.f15974d.f16045e.f16053m = next.u();
                            next.f15976e.f16045e.f16053m = next.o();
                        }
                    }
                }
                it = it2;
            }
        }
    }

    public final void c() {
        ArrayList<WidgetRun> arrayList = this.f36479e;
        arrayList.clear();
        d dVar = this.f36478d;
        dVar.f15974d.f();
        dVar.f15976e.f();
        arrayList.add(dVar.f15974d);
        arrayList.add(dVar.f15976e);
        HashSet hashSet = null;
        for (ConstraintWidget constraintWidget : dVar.f35715u0) {
            if (constraintWidget instanceof f) {
                h hVar = new h(constraintWidget);
                constraintWidget.f15974d.f();
                constraintWidget.f15976e.f();
                hVar.f16046f = ((f) constraintWidget).f16138y0;
                arrayList.add(hVar);
            } else {
                if (constraintWidget.B()) {
                    if (constraintWidget.f15970b == null) {
                        constraintWidget.f15970b = new c(constraintWidget, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(constraintWidget.f15970b);
                } else {
                    arrayList.add(constraintWidget.f15974d);
                }
                if (constraintWidget.C()) {
                    if (constraintWidget.f15972c == null) {
                        constraintWidget.f15972c = new c(constraintWidget, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(constraintWidget.f15972c);
                } else {
                    arrayList.add(constraintWidget.f15976e);
                }
                if (constraintWidget instanceof b) {
                    arrayList.add(new androidx.constraintlayout.core.widgets.analyzer.b(constraintWidget));
                }
            }
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator<WidgetRun> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().f();
        }
        for (WidgetRun widgetRun : arrayList) {
            if (widgetRun.f16042b != dVar) {
                widgetRun.d();
            }
        }
        ArrayList<i> arrayList2 = this.f36482h;
        arrayList2.clear();
        d dVar2 = this.f36475a;
        e(dVar2.f15974d, 0, arrayList2);
        e(dVar2.f15976e, 1, arrayList2);
        this.f36476b = false;
    }

    public final int d(d dVar, int i10) {
        ArrayList<i> arrayList;
        int i11;
        int i12;
        long j;
        float f10;
        long j10;
        ArrayList<i> arrayList2 = this.f36482h;
        int size = arrayList2.size();
        int i13 = 0;
        long jMax = 0;
        while (i13 < size) {
            WidgetRun widgetRun = arrayList2.get(i13).f36484a;
            if (!(widgetRun instanceof c) ? !(i10 != 0 ? (widgetRun instanceof androidx.constraintlayout.core.widgets.analyzer.d) : (widgetRun instanceof c)) : ((c) widgetRun).f16046f != i10) {
                DependencyNode dependencyNode = (i10 == 0 ? dVar.f15974d : dVar.f15976e).f16048h;
                DependencyNode dependencyNode2 = (i10 == 0 ? dVar.f15974d : dVar.f15976e).f16049i;
                boolean zContains = widgetRun.f16048h.f16032l.contains(dependencyNode);
                DependencyNode dependencyNode3 = widgetRun.f16049i;
                boolean zContains2 = dependencyNode3.f16032l.contains(dependencyNode2);
                long j11 = widgetRun.j();
                DependencyNode dependencyNode4 = widgetRun.f16048h;
                if (zContains && zContains2) {
                    long jB = i.b(dependencyNode4, 0L);
                    ArrayList<i> arrayList3 = arrayList2;
                    i11 = size;
                    long jA = i.a(dependencyNode3, 0L);
                    long j12 = jB - j11;
                    int i14 = dependencyNode3.f16027f;
                    arrayList = arrayList3;
                    i12 = i13;
                    if (j12 >= (-i14)) {
                        j12 += (long) i14;
                    }
                    long j13 = (-jA) - j11;
                    long j14 = dependencyNode4.f16027f;
                    long j15 = j13 - j14;
                    if (j15 >= j14) {
                        j15 -= j14;
                    }
                    ConstraintWidget constraintWidget = widgetRun.f16042b;
                    if (i10 == 0) {
                        f10 = constraintWidget.f15979f0;
                    } else if (i10 == 1) {
                        f10 = constraintWidget.f15981g0;
                    } else {
                        constraintWidget.getClass();
                        f10 = -1.0f;
                    }
                    if (f10 > 0.0f) {
                        j10 = (long) ((j12 / (1.0f - f10)) + (j15 / f10));
                    } else {
                        j10 = 0;
                    }
                    float f11 = j10;
                    j = (((long) dependencyNode4.f16027f) + ((((long) ((f11 * f10) + 0.5f)) + j11) + ((long) n.b(1.0f, f10, f11, 0.5f)))) - ((long) dependencyNode3.f16027f);
                } else {
                    arrayList = arrayList2;
                    i11 = size;
                    i12 = i13;
                    if (zContains) {
                        j = Math.max(i.b(dependencyNode4, dependencyNode4.f16027f), ((long) dependencyNode4.f16027f) + j11);
                    } else if (zContains2) {
                        j = Math.max(-i.a(dependencyNode3, dependencyNode3.f16027f), ((long) (-dependencyNode3.f16027f)) + j11);
                    } else {
                        j = (widgetRun.j() + ((long) dependencyNode4.f16027f)) - ((long) dependencyNode3.f16027f);
                    }
                }
            } else {
                arrayList = arrayList2;
                i11 = size;
                i12 = i13;
                j = 0;
            }
            jMax = Math.max(jMax, j);
            i13 = i12 + 1;
            size = i11;
            arrayList2 = arrayList;
        }
        return (int) jMax;
    }

    public final void e(WidgetRun widgetRun, int i10, ArrayList<i> arrayList) {
        DependencyNode dependencyNode;
        Iterator it = widgetRun.f16048h.f16031k.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            dependencyNode = widgetRun.f16049i;
            if (!zHasNext) {
                break;
            }
            d dVar = (d) it.next();
            if (dVar instanceof DependencyNode) {
                a((DependencyNode) dVar, i10, arrayList, null);
            } else if (dVar instanceof WidgetRun) {
                a(((WidgetRun) dVar).f16048h, i10, arrayList, null);
            }
        }
        for (d dVar2 : dependencyNode.f16031k) {
            if (dVar2 instanceof DependencyNode) {
                a((DependencyNode) dVar2, i10, arrayList, null);
            } else if (dVar2 instanceof WidgetRun) {
                a(((WidgetRun) dVar2).f16049i, i10, arrayList, null);
            }
        }
        if (i10 == 1) {
            for (d dVar3 : ((androidx.constraintlayout.core.widgets.analyzer.d) widgetRun).f16055k.f16031k) {
                if (dVar3 instanceof DependencyNode) {
                    a((DependencyNode) dVar3, i10, arrayList, null);
                }
            }
        }
    }

    public final void f(ConstraintWidget constraintWidget, ConstraintWidget.DimensionBehaviour dimensionBehaviour, int i10, ConstraintWidget.DimensionBehaviour dimensionBehaviour2, int i11) {
        b.a aVar = this.f36481g;
        aVar.f36464a = dimensionBehaviour;
        aVar.f36465b = dimensionBehaviour2;
        aVar.f36466c = i10;
        aVar.f36467d = i11;
        ((ConstraintLayout.b) this.f36480f).b(constraintWidget, aVar);
        constraintWidget.S(aVar.f36468e);
        constraintWidget.P(aVar.f36469f);
        constraintWidget.f15946E = aVar.f36471h;
        constraintWidget.M(aVar.f36470g);
    }

    public final void g() {
        a aVar;
        for (ConstraintWidget constraintWidget : this.f36475a.f35715u0) {
            if (!constraintWidget.f15968a) {
                ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = constraintWidget.f15962U;
                boolean z10 = false;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour = dimensionBehaviourArr[0];
                ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = dimensionBehaviourArr[1];
                int i10 = constraintWidget.f16001r;
                int i11 = constraintWidget.f16003s;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.f16014c;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.f16015d;
                boolean z11 = dimensionBehaviour == dimensionBehaviour3 || (dimensionBehaviour == dimensionBehaviour4 && i10 == 1);
                if (dimensionBehaviour2 == dimensionBehaviour3 || (dimensionBehaviour2 == dimensionBehaviour4 && i11 == 1)) {
                    z10 = true;
                }
                a aVar2 = constraintWidget.f15974d.f16045e;
                boolean z12 = aVar2.j;
                a aVar3 = constraintWidget.f15976e.f16045e;
                boolean z13 = aVar3.j;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour5 = ConstraintWidget.DimensionBehaviour.f16013b;
                if (z12 && z13) {
                    f(constraintWidget, dimensionBehaviour5, aVar2.f16028g, dimensionBehaviour5, aVar3.f16028g);
                    constraintWidget.f15968a = true;
                } else if (z12 && z10) {
                    f(constraintWidget, dimensionBehaviour5, aVar2.f16028g, dimensionBehaviour3, aVar3.f16028g);
                    if (dimensionBehaviour2 == dimensionBehaviour4) {
                        constraintWidget.f15976e.f16045e.f16053m = constraintWidget.o();
                    } else {
                        constraintWidget.f15976e.f16045e.d(constraintWidget.o());
                        constraintWidget.f15968a = true;
                    }
                } else if (z13 && z11) {
                    f(constraintWidget, dimensionBehaviour3, aVar2.f16028g, dimensionBehaviour5, aVar3.f16028g);
                    if (dimensionBehaviour == dimensionBehaviour4) {
                        constraintWidget.f15974d.f16045e.f16053m = constraintWidget.u();
                    } else {
                        constraintWidget.f15974d.f16045e.d(constraintWidget.u());
                        constraintWidget.f15968a = true;
                    }
                }
                if (constraintWidget.f15968a && (aVar = constraintWidget.f15976e.f16056l) != null) {
                    aVar.d(constraintWidget.f15973c0);
                }
            }
        }
    }
}
