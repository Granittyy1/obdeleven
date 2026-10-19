package B8;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.imageview.ShapeableImageView;
import com.voltasit.obdeleven.presentation.vehicle.VehicleViewModel;

/* JADX INFO: compiled from: FragmentVehicleBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class D0 extends M0.h {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final Button f1640A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final Button f1641B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final ShapeableImageView f1642C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final Button f1643D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final Button f1644E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final TextView f1645F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final TextView f1646G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public VehicleViewModel f1647H;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Button f1648r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Button f1649s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ImageView f1650t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Button f1651u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final LinearLayout f1652v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Button f1653w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final TextView f1654x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final FloatingActionButton f1655y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final Button f1656z;

    public D0(M0.d dVar, View view, Button button, Button button2, ImageView imageView, Button button3, LinearLayout linearLayout, Button button4, TextView textView, FloatingActionButton floatingActionButton, Button button5, Button button6, Button button7, ShapeableImageView shapeableImageView, Button button8, Button button9, TextView textView2, TextView textView3) {
        super(view, 7, dVar);
        this.f1648r = button;
        this.f1649s = button2;
        this.f1650t = imageView;
        this.f1651u = button3;
        this.f1652v = linearLayout;
        this.f1653w = button4;
        this.f1654x = textView;
        this.f1655y = floatingActionButton;
        this.f1656z = button5;
        this.f1640A = button6;
        this.f1641B = button7;
        this.f1642C = shapeableImageView;
        this.f1643D = button8;
        this.f1644E = button9;
        this.f1645F = textView2;
        this.f1646G = textView3;
    }

    public abstract void t(VehicleViewModel vehicleViewModel);
}
