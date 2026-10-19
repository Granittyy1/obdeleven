package B8;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.material.imageview.ShapeableImageView;

/* JADX INFO: compiled from: ItemControlUnitBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class W0 extends M0.h {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ int f1824x = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ShapeableImageView f1825r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final FrameLayout f1826s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final TextView f1827t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final TextView f1828u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final ProgressBar f1829v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public G8.C f1830w;

    public W0(M0.d dVar, View view, ShapeableImageView shapeableImageView, FrameLayout frameLayout, TextView textView, TextView textView2, ProgressBar progressBar) {
        super(view, 0, dVar);
        this.f1825r = shapeableImageView;
        this.f1826s = frameLayout;
        this.f1827t = textView;
        this.f1828u = textView2;
        this.f1829v = progressBar;
    }

    public abstract void t(G8.C c10);
}
