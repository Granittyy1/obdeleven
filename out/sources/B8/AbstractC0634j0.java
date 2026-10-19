package B8;

import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.imageview.ShapeableImageView;
import com.voltasit.obdeleven.presentation.profile.ProfileViewModel;

/* JADX INFO: renamed from: B8.j0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: FragmentProfileBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC0634j0 extends M0.h {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final Button f1971A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final LinearLayout f1972B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final AbstractC0620c1 f1973C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final TextView f1974D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final AbstractC0620c1 f1975E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public ProfileViewModel f1976F;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final AbstractC0620c1 f1977r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Button f1978s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final LinearLayout f1979t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Button f1980u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final ImageButton f1981v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Button f1982w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final ShapeableImageView f1983x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Button f1984y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final TextView f1985z;

    public AbstractC0634j0(M0.d dVar, View view, AbstractC0620c1 abstractC0620c1, Button button, LinearLayout linearLayout, Button button2, ImageButton imageButton, Button button3, ShapeableImageView shapeableImageView, Button button4, TextView textView, Button button5, LinearLayout linearLayout2, AbstractC0620c1 abstractC0620c2, TextView textView2, AbstractC0620c1 abstractC0620c3) {
        super(view, 5, dVar);
        this.f1977r = abstractC0620c1;
        this.f1978s = button;
        this.f1979t = linearLayout;
        this.f1980u = button2;
        this.f1981v = imageButton;
        this.f1982w = button3;
        this.f1983x = shapeableImageView;
        this.f1984y = button4;
        this.f1985z = textView;
        this.f1971A = button5;
        this.f1972B = linearLayout2;
        this.f1973C = abstractC0620c2;
        this.f1974D = textView2;
        this.f1975E = abstractC0620c3;
    }

    public abstract void t(ProfileViewModel profileViewModel);
}
