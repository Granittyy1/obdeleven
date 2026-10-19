package B8;

import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import com.voltasit.obdeleven.presentation.dialogs.bonus.BonusDialogViewModel;

/* JADX INFO: renamed from: B8.t, reason: case insensitive filesystem */
/* JADX INFO: compiled from: DialogBonusBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC0652t extends M0.h {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ int f2146y = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Button f2147r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Button f2148s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ProgressBar f2149t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final TextView f2150u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final AppCompatCheckBox f2151v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final AppCompatCheckBox f2152w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public BonusDialogViewModel f2153x;

    public AbstractC0652t(M0.d dVar, View view, Button button, Button button2, ProgressBar progressBar, TextView textView, AppCompatCheckBox appCompatCheckBox, AppCompatCheckBox appCompatCheckBox2) {
        super(view, 5, dVar);
        this.f2147r = button;
        this.f2148s = button2;
        this.f2149t = progressBar;
        this.f2150u = textView;
        this.f2151v = appCompatCheckBox;
        this.f2152w = appCompatCheckBox2;
    }

    public abstract void t(BonusDialogViewModel bonusDialogViewModel);
}
