package M2;

import com.braze.ui.BrazeXamarinFormsFeedFragment;
import java.util.ArrayList;
import java.util.Iterator;
import kotlinx.coroutines.C2700k0;
import p079g3.q;
import p079g3.r;
import p079g3.s;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4531b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f4532c;

    public /* synthetic */ e(int i10, Object obj) {
        this.f4531b = i10;
        this.f4532c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4531b) {
            case 0:
                f.d((f) this.f4532c);
                return;
            case 1:
                ((C2700k0) this.f4532c).i(null);
                return;
            case 2:
                ((BrazeXamarinFormsFeedFragment) this.f4532c).lambda$onRefresh$4();
                return;
            case 3:
                s sVar = (s) this.f4532c;
                r<T> rVar = sVar.f35597d;
                if (rVar == 0) {
                    return;
                }
                V v10 = rVar.f35591a;
                if (v10 != 0) {
                    synchronized (sVar) {
                        Iterator it = new ArrayList(sVar.f35594a).iterator();
                        while (it.hasNext()) {
                            ((q) it.next()).onResult(v10);
                        }
                    }
                    return;
                }
                Throwable th = rVar.f35592b;
                synchronized (sVar) {
                    ArrayList arrayList = new ArrayList(sVar.f35595b);
                    if (arrayList.isEmpty()) {
                        p214r3.c.c("Lottie encountered an error but no failure listener was added:", th);
                        return;
                    }
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        ((q) it2.next()).onResult(th);
                    }
                    return;
                }
            default:
                ((androidx.media3.ui.c) this.f4532c).o();
                return;
        }
    }
}
