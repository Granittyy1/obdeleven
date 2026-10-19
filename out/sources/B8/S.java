package B8;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.imageview.ShapeableImageView;
import com.voltasit.obdeleven.ui.view.AppSpinnerDropDown;

/* JADX INFO: compiled from: FragmentAppBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class S extends M0.h {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final LinearLayout f1797r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final FloatingActionButton f1798s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final TextView f1799t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final TextView f1800u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final ShapeableImageView f1801v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final TextView f1802w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final AppSpinnerDropDown f1803x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final ImageView f1804y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public com.voltasit.obdeleven.presentation.oca.k f1805z;

    public S(M0.d dVar, View view, LinearLayout linearLayout, FloatingActionButton floatingActionButton, TextView textView, TextView textView2, ShapeableImageView shapeableImageView, TextView textView3, AppSpinnerDropDown appSpinnerDropDown, ImageView imageView) {
        super(view, 1, dVar);
        this.f1797r = linearLayout;
        this.f1798s = floatingActionButton;
        this.f1799t = textView;
        this.f1800u = textView2;
        this.f1801v = shapeableImageView;
        this.f1802w = textView3;
        this.f1803x = appSpinnerDropDown;
        this.f1804y = imageView;
    }

    public abstract void t(com.voltasit.obdeleven.presentation.oca.k kVar);
}
