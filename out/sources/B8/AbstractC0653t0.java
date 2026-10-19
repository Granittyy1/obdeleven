package B8;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/* JADX INFO: renamed from: B8.t0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: FragmentTwoFactorAuthBackupBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC0653t0 extends M0.h {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final TextView f2154r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Button f2155s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final View f2156t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public com.voltasit.obdeleven.presentation.twofactorauth.backup.b f2157u;

    public AbstractC0653t0(M0.d dVar, View view, TextView textView, Button button, View view2) {
        super(view, 1, dVar);
        this.f2154r = textView;
        this.f2155s = button;
        this.f2156t = view2;
    }

    public abstract void t(com.voltasit.obdeleven.presentation.twofactorauth.backup.b bVar);
}
