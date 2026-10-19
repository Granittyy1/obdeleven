package B8;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/* JADX INFO: renamed from: B8.n0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: FragmentSigninBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC0642n0 extends M0.h {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ int f2078u = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final TextView f2079r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ImageView f2080s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public com.voltasit.obdeleven.presentation.signIn.b f2081t;

    public AbstractC0642n0(M0.d dVar, View view, TextView textView, ImageView imageView) {
        super(view, 0, dVar);
        this.f2079r = textView;
        this.f2080s = imageView;
    }

    public abstract void t(com.voltasit.obdeleven.presentation.signIn.b bVar);
}
