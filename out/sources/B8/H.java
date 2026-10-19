package B8;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: compiled from: DialogSecurityBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class H extends M0.h {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final ProgressBar f1681A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final TextView f1682B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final TextView f1683C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final LinearLayout f1684D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final TextView f1685E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public com.voltasit.obdeleven.ui.dialogs.B0 f1686F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public Boolean f1687G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public Boolean f1688H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public Boolean f1689I;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Button f1690r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Button f1691s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Button f1692t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final EditText f1693u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final TextInputLayout f1694v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ProgressBar f1695w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final FrameLayout f1696x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final ListView f1697y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final ProgressBar f1698z;

    public H(M0.d dVar, View view, Button button, Button button2, Button button3, EditText editText, TextInputLayout textInputLayout, ProgressBar progressBar, FrameLayout frameLayout, ListView listView, ProgressBar progressBar2, ProgressBar progressBar3, TextView textView, TextView textView2, LinearLayout linearLayout, TextView textView3) {
        super(view, 0, dVar);
        this.f1690r = button;
        this.f1691s = button2;
        this.f1692t = button3;
        this.f1693u = editText;
        this.f1694v = textInputLayout;
        this.f1695w = progressBar;
        this.f1696x = frameLayout;
        this.f1697y = listView;
        this.f1698z = progressBar2;
        this.f1681A = progressBar3;
        this.f1682B = textView;
        this.f1683C = textView2;
        this.f1684D = linearLayout;
        this.f1685E = textView3;
    }

    public abstract void t(Boolean bool);

    public abstract void u(Boolean bool);

    public abstract void v(Boolean bool);

    public abstract void w(com.voltasit.obdeleven.ui.dialogs.B0 b10);
}
