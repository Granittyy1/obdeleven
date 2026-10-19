package androidx.compose.foundation.gestures;

import java.util.concurrent.CancellationException;
import kotlinx.coroutines.InterfaceC2691h;

/* JADX INFO: compiled from: BringIntoViewRequestPriorityQueue.kt */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final androidx.compose.runtime.collection.c<ContentInViewNode.a> f10003a = new androidx.compose.runtime.collection.c<>(new ContentInViewNode.a[16]);

    public final void a(CancellationException cancellationException) {
        androidx.compose.runtime.collection.c<ContentInViewNode.a> cVar = this.f10003a;
        int i10 = cVar.f12945d;
        InterfaceC2691h[] interfaceC2691hArr = new InterfaceC2691h[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            interfaceC2691hArr[i11] = cVar.f12943b[i11].f9919b;
        }
        for (int i12 = 0; i12 < i10; i12++) {
            interfaceC2691hArr[i12].o(cancellationException);
        }
        if (cVar.f12945d == 0) {
            return;
        }
        p245u.c.c("uncancelled requests present");
    }

    public final void b() {
        androidx.compose.runtime.collection.c<ContentInViewNode.a> cVar = this.f10003a;
        Na.i iVarJ = Na.l.J(0, cVar.f12945d);
        int i10 = iVarJ.f4687b;
        int i11 = iVarJ.f4688c;
        if (i10 <= i11) {
            while (true) {
                cVar.f12943b[i10].f9919b.resumeWith(p293xa.r.f47939a);
                if (i10 == i11) {
                    break;
                } else {
                    i10++;
                }
            }
        }
        cVar.j();
    }
}
