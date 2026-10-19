package p033c7;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import p083g7.a;
import p083g7.h;
import p097h9.j;
import p097h9.m;
import p212r1.e;

/* JADX INFO: renamed from: c7.l, reason: case insensitive filesystem */
/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC1499l implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f22468b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f22469c;

    public /* synthetic */ RunnableC1499l(int i10, Object obj) {
        this.f22468b = i10;
        this.f22469c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f22468b) {
            case 0:
                ((C1501n.a) this.f22469c).getClass();
                throw null;
            case 1:
                m mVar = ((j) this.f22469c).j;
                j jVar = mVar.f36218a.f36231q;
                jVar.getClass();
                LinearLayoutManager linearLayoutManager = mVar.f36219b;
                View viewT0 = linearLayoutManager.T0(0, linearLayoutManager.x(), true, false);
                int iL = viewT0 == null ? -1 : RecyclerView.l.L(viewT0);
                View viewT1 = linearLayoutManager.T0(linearLayoutManager.x() - 1, -1, true, false);
                int iL2 = viewT1 != null ? RecyclerView.l.L(viewT1) : -1;
                int itemCount = jVar.getItemCount();
                if (iL == 0 && iL2 == itemCount - 1) {
                    mVar.f36220c.n();
                    return;
                }
                return;
            default:
                e eVar = (e) this.f22469c;
                synchronized (eVar.f46289a) {
                    try {
                        if (eVar.f46300m) {
                            return;
                        }
                        long j = eVar.f46299l - 1;
                        eVar.f46299l = j;
                        if (j > 0) {
                            return;
                        }
                        if (j >= 0) {
                            eVar.a();
                            return;
                        }
                        IllegalStateException illegalStateException = new IllegalStateException();
                        synchronized (eVar.f46289a) {
                            eVar.f46301n = illegalStateException;
                            break;
                        }
                        return;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
        }
    }

    public /* synthetic */ RunnableC1499l(C1501n.a aVar, h hVar, a aVar2) {
        this.f22468b = 0;
        this.f22469c = aVar;
    }
}
