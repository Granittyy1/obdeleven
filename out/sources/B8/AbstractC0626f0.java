package B8;

import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.textfield.TextInputEditText;
import com.voltasit.obdeleven.presentation.controlUnit.eeprom.EepromFragment;

/* JADX INFO: renamed from: B8.f0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: FragmentInputEepromBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC0626f0 extends M0.h {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final TextInputEditText f1908r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final TextInputEditText f1909s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final LinearLayout f1910t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final FloatingActionButton f1911u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final LinearLayout f1912v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final TextInputEditText f1913w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final RecyclerView f1914x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public EepromFragment f1915y;

    public AbstractC0626f0(M0.d dVar, View view, TextInputEditText textInputEditText, TextInputEditText textInputEditText2, LinearLayout linearLayout, FloatingActionButton floatingActionButton, LinearLayout linearLayout2, TextInputEditText textInputEditText3, RecyclerView recyclerView) {
        super(view, 0, dVar);
        this.f1908r = textInputEditText;
        this.f1909s = textInputEditText2;
        this.f1910t = linearLayout;
        this.f1911u = floatingActionButton;
        this.f1912v = linearLayout2;
        this.f1913w = textInputEditText3;
        this.f1914x = recyclerView;
    }

    public abstract void t(EepromFragment eepromFragment);
}
