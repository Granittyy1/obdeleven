package B8;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: compiled from: FragmentAppListBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class U extends M0.h {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final TextView f1811r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final TextView f1812s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final RecyclerView f1813t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Button f1814u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Button f1815v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Button f1816w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f1817x;

    public U(M0.d dVar, View view, TextView textView, TextView textView2, RecyclerView recyclerView, Button button, Button button2, Button button3) {
        super(view, 0, dVar);
        this.f1811r = textView;
        this.f1812s = textView2;
        this.f1813t = recyclerView;
        this.f1814u = button;
        this.f1815v = button2;
        this.f1816w = button3;
    }

    public abstract void t(String str);
}
