package p101i0;

import androidx.constraintlayout.core.widgets.analyzer.DependencyNode;
import androidx.constraintlayout.core.widgets.analyzer.WidgetRun;
import androidx.constraintlayout.core.widgets.analyzer.b;
import java.util.ArrayList;

/* JADX INFO: compiled from: RunGroup.java */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public WidgetRun f36484a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList<WidgetRun> f36485b;

    public static long a(DependencyNode dependencyNode, long j) {
        WidgetRun widgetRun = dependencyNode.f16025d;
        if (widgetRun instanceof b) {
            return j;
        }
        ArrayList arrayList = dependencyNode.f16031k;
        int size = arrayList.size();
        long jMin = j;
        for (int i10 = 0; i10 < size; i10++) {
            d dVar = (d) arrayList.get(i10);
            if (dVar instanceof DependencyNode) {
                DependencyNode dependencyNode2 = (DependencyNode) dVar;
                if (dependencyNode2.f16025d != widgetRun) {
                    jMin = Math.min(jMin, a(dependencyNode2, ((long) dependencyNode2.f16027f) + j));
                }
            }
        }
        if (dependencyNode != widgetRun.f16049i) {
            return jMin;
        }
        long j10 = widgetRun.j();
        DependencyNode dependencyNode3 = widgetRun.f16048h;
        long j11 = j - j10;
        return Math.min(Math.min(jMin, a(dependencyNode3, j11)), j11 - ((long) dependencyNode3.f16027f));
    }

    public static long b(DependencyNode dependencyNode, long j) {
        WidgetRun widgetRun = dependencyNode.f16025d;
        if (widgetRun instanceof b) {
            return j;
        }
        ArrayList arrayList = dependencyNode.f16031k;
        int size = arrayList.size();
        long jMax = j;
        for (int i10 = 0; i10 < size; i10++) {
            d dVar = (d) arrayList.get(i10);
            if (dVar instanceof DependencyNode) {
                DependencyNode dependencyNode2 = (DependencyNode) dVar;
                if (dependencyNode2.f16025d != widgetRun) {
                    jMax = Math.max(jMax, b(dependencyNode2, ((long) dependencyNode2.f16027f) + j));
                }
            }
        }
        if (dependencyNode != widgetRun.f16048h) {
            return jMax;
        }
        long j10 = widgetRun.j();
        DependencyNode dependencyNode3 = widgetRun.f16049i;
        long j11 = j + j10;
        return Math.max(Math.max(jMax, b(dependencyNode3, j11)), j11 - ((long) dependencyNode3.f16027f));
    }
}
