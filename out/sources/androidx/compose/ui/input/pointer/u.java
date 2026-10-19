package androidx.compose.ui.input.pointer;

import androidx.collection.C0891t;
import androidx.compose.ui.node.C1194o;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidComposeView;

/* JADX INFO: compiled from: PointerInputEventProcessor.kt */
/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LayoutNode f14130a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HitPathTracker f14131b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r f14132c = new r();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C1194o f14133d = new C1194o();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f14134e;

    public u(LayoutNode layoutNode) {
        this.f14130a = layoutNode;
        this.f14131b = new HitPathTracker(layoutNode.f14389G.f14365b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int a(s sVar, AndroidComposeView androidComposeView, boolean z10) {
        int i10;
        Object[] objArr;
        HitPathTracker hitPathTracker;
        int i11;
        C1194o c1194o = this.f14133d;
        if (this.f14134e) {
            return 0;
        }
        try {
            this.f14134e = true;
            C1154e c1154eA = this.f14132c.a(sVar, androidComposeView);
            C0891t<q> c0891t = c1154eA.f14073a;
            int iG = c0891t.g();
            while (true) {
                if (i10 >= iG) {
                    objArr = true;
                    break;
                }
                q qVarH = c0891t.h(i10);
                i10 = (qVarH.f14103d || qVarH.f14107h) ? 0 : i10 + 1;
                objArr = false;
                break;
            }
            int iG2 = c0891t.g();
            int i12 = 0;
            while (true) {
                hitPathTracker = this.f14131b;
                if (i12 >= iG2) {
                    break;
                }
                q qVarH2 = c0891t.h(i12);
                if (objArr != false || I.b.c(qVarH2)) {
                    LayoutNode layoutNode = this.f14130a;
                    long j = qVarH2.f14102c;
                    C1194o c1194o2 = this.f14133d;
                    int i13 = qVarH2.f14108i;
                    LayoutNode.b bVar = LayoutNode.f14379R;
                    layoutNode.K(j, c1194o2, i13, true);
                    if (!c1194o.f14591b.d()) {
                        hitPathTracker.a(qVarH2.f14100a, c1194o, I.b.c(qVarH2));
                        c1194o.clear();
                    }
                }
                i12++;
            }
            boolean zB = hitPathTracker.b(c1154eA, z10);
            if (c1154eA.f14075c) {
                i11 = 0;
            } else {
                int iG3 = c0891t.g();
                for (int i14 = 0; i14 < iG3; i14++) {
                    q qVarH3 = c0891t.h(i14);
                    if (!I.d.b(I.b.o(qVarH3, true), 0L) && qVarH3.b()) {
                        i11 = 1;
                    }
                }
                i11 = 0;
            }
            return ((i11 << 1) | (zB ? 1 : 0)) == true ? 1 : 0;
        } finally {
            this.f14134e = false;
        }
    }
}
