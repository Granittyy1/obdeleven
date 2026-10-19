package p101i0;

import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.analyzer.DependencyNode;
import androidx.constraintlayout.core.widgets.analyzer.WidgetRun;
import androidx.constraintlayout.core.widgets.f;

/* JADX INFO: compiled from: GuidelineReference.java */
/* JADX INFO: loaded from: classes.dex */
public final class h extends WidgetRun {
    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun, p101i0.d
    public final void a(d dVar) {
        DependencyNode dependencyNode = this.f16048h;
        if (dependencyNode.f16024c && !dependencyNode.j) {
            dependencyNode.d((int) ((((DependencyNode) dependencyNode.f16032l.get(0)).f16028g * ((f) this.f16042b).f16135u0) + 0.5f));
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public final void d() {
        ConstraintWidget constraintWidget = this.f16042b;
        f fVar = (f) constraintWidget;
        int i10 = fVar.v0;
        int i11 = fVar.f16136w0;
        int i12 = fVar.f16138y0;
        DependencyNode dependencyNode = this.f16048h;
        if (i12 == 1) {
            if (i10 != -1) {
                dependencyNode.f16032l.add(constraintWidget.f15963V.f15974d.f16048h);
                this.f16042b.f15963V.f15974d.f16048h.f16031k.add(dependencyNode);
                dependencyNode.f16027f = i10;
            } else if (i11 != -1) {
                dependencyNode.f16032l.add(constraintWidget.f15963V.f15974d.f16049i);
                this.f16042b.f15963V.f15974d.f16049i.f16031k.add(dependencyNode);
                dependencyNode.f16027f = -i11;
            } else {
                dependencyNode.f16023b = true;
                dependencyNode.f16032l.add(constraintWidget.f15963V.f15974d.f16049i);
                this.f16042b.f15963V.f15974d.f16049i.f16031k.add(dependencyNode);
            }
            m(this.f16042b.f15974d.f16048h);
            m(this.f16042b.f15974d.f16049i);
            return;
        }
        if (i10 != -1) {
            dependencyNode.f16032l.add(constraintWidget.f15963V.f15976e.f16048h);
            this.f16042b.f15963V.f15976e.f16048h.f16031k.add(dependencyNode);
            dependencyNode.f16027f = i10;
        } else if (i11 != -1) {
            dependencyNode.f16032l.add(constraintWidget.f15963V.f15976e.f16049i);
            this.f16042b.f15963V.f15976e.f16049i.f16031k.add(dependencyNode);
            dependencyNode.f16027f = -i11;
        } else {
            dependencyNode.f16023b = true;
            dependencyNode.f16032l.add(constraintWidget.f15963V.f15976e.f16049i);
            this.f16042b.f15963V.f15976e.f16049i.f16031k.add(dependencyNode);
        }
        m(this.f16042b.f15976e.f16048h);
        m(this.f16042b.f15976e.f16049i);
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public final void e() {
        ConstraintWidget constraintWidget = this.f16042b;
        int i10 = ((f) constraintWidget).f16138y0;
        DependencyNode dependencyNode = this.f16048h;
        if (i10 == 1) {
            constraintWidget.f15969a0 = dependencyNode.f16028g;
        } else {
            constraintWidget.f15971b0 = dependencyNode.f16028g;
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public final void f() {
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
