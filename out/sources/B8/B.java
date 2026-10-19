package B8;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: compiled from: DialogFragmentRecyclerListBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class B extends M0.h {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final RecyclerView f1611r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Button f1612s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Button f1613t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Button f1614u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final TextView f1615v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public p110i9.c f1616w;

    public B(M0.d dVar, View view, RecyclerView recyclerView, Button button, Button button2, Button button3, TextView textView) {
        super(view, 0, dVar);
        this.f1611r = recyclerView;
        this.f1612s = button;
        this.f1613t = button2;
        this.f1614u = button3;
        this.f1615v = textView;
    }

    public abstract void t(p110i9.c cVar);
}
