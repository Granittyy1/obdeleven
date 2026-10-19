package B8;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

/* JADX INFO: renamed from: B8.a0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: FragmentControlUnitListBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC0613a0 extends M0.h {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final FloatingActionButton f1854r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final RecyclerView f1855s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final SwipeRefreshLayout f1856t;

    public AbstractC0613a0(M0.d dVar, View view, FloatingActionButton floatingActionButton, RecyclerView recyclerView, SwipeRefreshLayout swipeRefreshLayout) {
        super(view, 0, dVar);
        this.f1854r = floatingActionButton;
        this.f1855s = recyclerView;
        this.f1856t = swipeRefreshLayout;
    }
}
