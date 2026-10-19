package androidx.compose.ui.input.pointer;

import androidx.collection.C0891t;
import androidx.collection.I;
import androidx.compose.ui.node.C1195p;

/* JADX INFO: compiled from: HitPathTracker.kt */
/* JADX INFO: loaded from: classes.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final androidx.compose.runtime.collection.c<h> f14089a = new androidx.compose.runtime.collection.c<>(new h[16]);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final I<i> f14090b = new I<>(10);

    public boolean a(C0891t c0891t, C1195p c1195p, C1154e c1154e, boolean z10) {
        androidx.compose.runtime.collection.c<h> cVar = this.f14089a;
        h[] hVarArr = cVar.f12943b;
        int i10 = cVar.f12945d;
        boolean z11 = false;
        for (int i11 = 0; i11 < i10; i11++) {
            z11 = hVarArr[i11].a(c0891t, c1195p, c1154e, z10) || z11;
        }
        return z11;
    }

    public void b(C1154e c1154e) {
        androidx.compose.runtime.collection.c<h> cVar = this.f14089a;
        int i10 = cVar.f12945d;
        while (true) {
            i10--;
            if (-1 >= i10) {
                return;
            }
            if (cVar.f12943b[i10].f14083d.f4881a == 0) {
                cVar.p(i10);
            }
        }
    }
}
