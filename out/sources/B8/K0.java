package B8;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.voltasit.obdeleven.presentation.garage.GarageViewModel;

/* JADX INFO: compiled from: FragmentVehicleListBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class K0 extends M0.h {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final LinearLayout f1735r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final TextView f1736s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final FloatingActionButton f1737t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final RecyclerView f1738u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final SwipeRefreshLayout f1739v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public GarageViewModel f1740w;

    public K0(M0.d dVar, View view, LinearLayout linearLayout, TextView textView, FloatingActionButton floatingActionButton, RecyclerView recyclerView, SwipeRefreshLayout swipeRefreshLayout) {
        super(view, 4, dVar);
        this.f1735r = linearLayout;
        this.f1736s = textView;
        this.f1737t = floatingActionButton;
        this.f1738u = recyclerView;
        this.f1739v = swipeRefreshLayout;
    }

    public abstract void t(GarageViewModel garageViewModel);
}
