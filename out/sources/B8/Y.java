package B8;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.imageview.ShapeableImageView;

/* JADX INFO: compiled from: FragmentControlUnitInfoBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class Y extends M0.h {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final FrameLayout f1834r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ShapeableImageView f1835s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final RecyclerView f1836t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final TextView f1837u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final TextView f1838v;

    public Y(M0.d dVar, View view, FrameLayout frameLayout, ShapeableImageView shapeableImageView, RecyclerView recyclerView, TextView textView, TextView textView2) {
        super(view, 0, dVar);
        this.f1834r = frameLayout;
        this.f1835s = shapeableImageView;
        this.f1836t = recyclerView;
        this.f1837u = textView;
        this.f1838v = textView2;
    }
}
