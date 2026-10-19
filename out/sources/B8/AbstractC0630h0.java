package B8;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.voltasit.obdeleven.presentation.components.coverLayout.MainCoverLayout;
import com.voltasit.obdeleven.presentation.components.progressWheel.ProgressWheel;
import com.voltasit.obdeleven.presentation.main.MainViewModel;

/* JADX INFO: renamed from: B8.h0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: FragmentMainBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC0630h0 extends M0.h {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final ProgressBar f1935A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final FloatingActionButton f1936B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final RecyclerView f1937C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final ProgressWheel f1938D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final TextView f1939E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final TextView f1940F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final SwipeRefreshLayout f1941G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final TextView f1942H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public MainViewModel f1943I;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ImageView f1944r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ImageView f1945s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final LinearLayout f1946t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final ImageView f1947u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final ImageView f1948v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ImageView f1949w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final ImageView f1950x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final MainCoverLayout f1951y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final TextView f1952z;

    public AbstractC0630h0(M0.d dVar, View view, ImageView imageView, ImageView imageView2, LinearLayout linearLayout, ImageView imageView3, ImageView imageView4, ImageView imageView5, ImageView imageView6, MainCoverLayout mainCoverLayout, TextView textView, ProgressBar progressBar, FloatingActionButton floatingActionButton, RecyclerView recyclerView, ProgressWheel progressWheel, TextView textView2, TextView textView3, SwipeRefreshLayout swipeRefreshLayout, TextView textView4) {
        super(view, 18, dVar);
        this.f1944r = imageView;
        this.f1945s = imageView2;
        this.f1946t = linearLayout;
        this.f1947u = imageView3;
        this.f1948v = imageView4;
        this.f1949w = imageView5;
        this.f1950x = imageView6;
        this.f1951y = mainCoverLayout;
        this.f1952z = textView;
        this.f1935A = progressBar;
        this.f1936B = floatingActionButton;
        this.f1937C = recyclerView;
        this.f1938D = progressWheel;
        this.f1939E = textView2;
        this.f1940F = textView3;
        this.f1941G = swipeRefreshLayout;
        this.f1942H = textView4;
    }

    public abstract void t(MainViewModel mainViewModel);
}
