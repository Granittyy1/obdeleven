package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.Iterator;

/* JADX INFO: compiled from: HelperReferences.java */
/* JADX INFO: loaded from: classes.dex */
public final class b extends WidgetRun {
    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun, p101i0.d
    public final void a(p101i0.d dVar) {
        androidx.constraintlayout.core.widgets.a aVar = (androidx.constraintlayout.core.widgets.a) this.f16042b;
        int i10 = aVar.f16018w0;
        DependencyNode dependencyNode = this.f16048h;
        Iterator it = dependencyNode.f16032l.iterator();
        int i11 = 0;
        int i12 = -1;
        while (it.hasNext()) {
            int i13 = ((DependencyNode) it.next()).f16028g;
            if (i12 == -1 || i13 < i12) {
                i12 = i13;
            }
            if (i11 < i13) {
                i11 = i13;
            }
        }
        if (i10 == 0 || i10 == 2) {
            dependencyNode.d(i12 + aVar.f16020y0);
        } else {
            dependencyNode.d(i11 + aVar.f16020y0);
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public final void d() {
        ConstraintWidget constraintWidget = this.f16042b;
        if (constraintWidget instanceof androidx.constraintlayout.core.widgets.a) {
            DependencyNode dependencyNode = this.f16048h;
            dependencyNode.f16023b = true;
            androidx.constraintlayout.core.widgets.a aVar = (androidx.constraintlayout.core.widgets.a) constraintWidget;
            int i10 = aVar.f16018w0;
            boolean z10 = aVar.f16019x0;
            int i11 = 0;
            if (i10 == 0) {
                dependencyNode.f16026e = DependencyNode.Type.f16036e;
                while (i11 < aVar.v0) {
                    ConstraintWidget constraintWidget2 = aVar.f35714u0[i11];
                    if (z10 || constraintWidget2.f15985i0 != 8) {
                        DependencyNode dependencyNode2 = constraintWidget2.f15974d.f16048h;
                        dependencyNode2.f16031k.add(dependencyNode);
                        dependencyNode.f16032l.add(dependencyNode2);
                    }
                    i11++;
                }
                m(this.f16042b.f15974d.f16048h);
                m(this.f16042b.f15974d.f16049i);
                return;
            }
            if (i10 == 1) {
                dependencyNode.f16026e = DependencyNode.Type.f16037f;
                while (i11 < aVar.v0) {
                    ConstraintWidget constraintWidget3 = aVar.f35714u0[i11];
                    if (z10 || constraintWidget3.f15985i0 != 8) {
                        DependencyNode dependencyNode3 = constraintWidget3.f15974d.f16049i;
                        dependencyNode3.f16031k.add(dependencyNode);
                        dependencyNode.f16032l.add(dependencyNode3);
                    }
                    i11++;
                }
                m(this.f16042b.f15974d.f16048h);
                m(this.f16042b.f15974d.f16049i);
                return;
            }
            if (i10 == 2) {
                dependencyNode.f16026e = DependencyNode.Type.f16038g;
                while (i11 < aVar.v0) {
                    ConstraintWidget constraintWidget4 = aVar.f35714u0[i11];
                    if (z10 || constraintWidget4.f15985i0 != 8) {
                        DependencyNode dependencyNode4 = constraintWidget4.f15976e.f16048h;
                        dependencyNode4.f16031k.add(dependencyNode);
                        dependencyNode.f16032l.add(dependencyNode4);
                    }
                    i11++;
                }
                m(this.f16042b.f15976e.f16048h);
                m(this.f16042b.f15976e.f16049i);
                return;
            }
            if (i10 != 3) {
                return;
            }
            dependencyNode.f16026e = DependencyNode.Type.f16039h;
            while (i11 < aVar.v0) {
                ConstraintWidget constraintWidget5 = aVar.f35714u0[i11];
                if (z10 || constraintWidget5.f15985i0 != 8) {
                    DependencyNode dependencyNode5 = constraintWidget5.f15976e.f16049i;
                    dependencyNode5.f16031k.add(dependencyNode);
                    dependencyNode.f16032l.add(dependencyNode5);
                }
                i11++;
            }
            m(this.f16042b.f15976e.f16048h);
            m(this.f16042b.f15976e.f16049i);
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public final void e() {
        ConstraintWidget constraintWidget = this.f16042b;
        if (constraintWidget instanceof androidx.constraintlayout.core.widgets.a) {
            int i10 = ((androidx.constraintlayout.core.widgets.a) constraintWidget).f16018w0;
            DependencyNode dependencyNode = this.f16048h;
            if (i10 == 0 || i10 == 1) {
                constraintWidget.f15969a0 = dependencyNode.f16028g;
            } else {
                constraintWidget.f15971b0 = dependencyNode.f16028g;
            }
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public final void f() {
        this.f16043c = null;
        this.f16048h.c();
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public final boolean k() {
        return false;
    }

    public final void m(DependencyNode dependencyNode) {
        DependencyNode dependencyNode2 = this.f16048h;
        dependencyNode2.f16031k.add(dependencyNode);
        dependencyNode.f16032l.add(dependencyNode2);
    }
}
