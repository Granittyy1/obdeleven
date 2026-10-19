package B8;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: compiled from: ListDialogBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class s1 extends M0.h {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final EditText f2140r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Button f2141s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Button f2142t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final RecyclerView f2143u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final ProgressBar f2144v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public p110i9.l f2145w;

    public s1(M0.d dVar, View view, EditText editText, Button button, Button button2, RecyclerView recyclerView, ProgressBar progressBar) {
        super(view, 0, dVar);
        this.f2140r = editText;
        this.f2141s = button;
        this.f2142t = button2;
        this.f2143u = recyclerView;
        this.f2144v = progressBar;
    }

    public abstract void t(p110i9.l lVar);
}
