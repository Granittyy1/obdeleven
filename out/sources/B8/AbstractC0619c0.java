package B8;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.textfield.TextInputEditText;
import com.voltasit.obdeleven.presentation.twofactorauth.backupCode.DisableTwoFactorBackupCodeViewModel;

/* JADX INFO: renamed from: B8.c0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: FragmentDisableTwoFactorAuthBackupBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC0619c0 extends M0.h {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ int f1876y = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final TextInputEditText f1877r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Button f1878s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final TextView f1879t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final TextView f1880u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final View f1881v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Toolbar f1882w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public DisableTwoFactorBackupCodeViewModel f1883x;

    public AbstractC0619c0(M0.d dVar, View view, TextInputEditText textInputEditText, Button button, TextView textView, TextView textView2, View view2, Toolbar toolbar) {
        super(view, 2, dVar);
        this.f1877r = textInputEditText;
        this.f1878s = button;
        this.f1879t = textView;
        this.f1880u = textView2;
        this.f1881v = view2;
        this.f1882w = toolbar;
    }

    public abstract void t(DisableTwoFactorBackupCodeViewModel disableTwoFactorBackupCodeViewModel);
}
