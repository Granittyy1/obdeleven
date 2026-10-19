package B8;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: renamed from: B8.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: ActivityNotificationBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC0612a extends M0.h {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ int f1847x = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Button f1848r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ProgressBar f1849s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ImageView f1850t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final ConstraintLayout f1851u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Button f1852v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public com.voltasit.obdeleven.presentation.notification.b f1853w;

    public AbstractC0612a(M0.d dVar, View view, Button button, ProgressBar progressBar, ImageView imageView, ConstraintLayout constraintLayout, Button button2) {
        super(view, 0, dVar);
        this.f1848r = button;
        this.f1849s = progressBar;
        this.f1850t = imageView;
        this.f1851u = constraintLayout;
        this.f1852v = button2;
    }

    public abstract void t(com.voltasit.obdeleven.presentation.notification.b bVar);
}
