package N8;

import M0.h;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* JADX INFO: compiled from: OnRefreshListener.java */
/* JADX INFO: loaded from: classes3.dex */
public final class d implements SwipeRefreshLayout.f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f4674b;

    /* JADX INFO: compiled from: OnRefreshListener.java */
    public interface a {
        void b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d(a aVar) {
        this.f4674b = (h) aVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [M0.h, N8.d$a] */
    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.f
    public final void onRefresh() {
        this.f4674b.b();
    }
}
