package androidx.constraintlayout.core.widgets.analyzer;

/* JADX INFO: compiled from: DimensionDependency.java */
/* JADX INFO: loaded from: classes.dex */
public class a extends DependencyNode {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f16053m;

    public a(WidgetRun widgetRun) {
        super(widgetRun);
        if (widgetRun instanceof c) {
            this.f16026e = DependencyNode.Type.f16034c;
        } else {
            this.f16026e = DependencyNode.Type.f16035d;
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.DependencyNode
    public final void d(int i10) {
        if (this.j) {
            return;
        }
        this.j = true;
        this.f16028g = i10;
        for (p101i0.d dVar : this.f16031k) {
            dVar.a(dVar);
        }
    }
}
