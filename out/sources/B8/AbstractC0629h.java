package B8;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.imageview.ShapeableImageView;

/* JADX INFO: renamed from: B8.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: ControlUnitFaultsFragmentBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC0629h extends M0.h {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final TextView f1927r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final FloatingActionButton f1928s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ShapeableImageView f1929t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final FrameLayout f1930u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Spinner f1931v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final RecyclerView f1932w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final TextView f1933x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final SwipeRefreshLayout f1934y;

    public AbstractC0629h(M0.d dVar, View view, TextView textView, FloatingActionButton floatingActionButton, ShapeableImageView shapeableImageView, FrameLayout frameLayout, Spinner spinner, RecyclerView recyclerView, TextView textView2, SwipeRefreshLayout swipeRefreshLayout) {
        super(view, 0, dVar);
        this.f1927r = textView;
        this.f1928s = floatingActionButton;
        this.f1929t = shapeableImageView;
        this.f1930u = frameLayout;
        this.f1931v = spinner;
        this.f1932w = recyclerView;
        this.f1933x = textView2;
        this.f1934y = swipeRefreshLayout;
    }
}
