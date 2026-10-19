package B8;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/* JADX INFO: compiled from: ListDeviceNameBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class q1 extends M0.h {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final TextView f2105r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final TextView f2106s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ImageView f2107t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Q8.b f2108u;

    public q1(M0.d dVar, View view, ImageView imageView, TextView textView, TextView textView2) {
        super(view, 0, dVar);
        this.f2105r = textView;
        this.f2106s = textView2;
        this.f2107t = imageView;
    }

    public abstract void t(Q8.b bVar);
}
