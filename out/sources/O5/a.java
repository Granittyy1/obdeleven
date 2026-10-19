package O5;

import A8.p;
import H0.b;
import android.R;
import android.content.res.ColorStateList;
import androidx.appcompat.widget.AppCompatRadioButton;

/* JADX INFO: compiled from: MaterialRadioButton.java */
/* JADX INFO: loaded from: classes3.dex */
public final class a extends AppCompatRadioButton {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int[][] f4859h = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ColorStateList f4860f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f4861g;

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f4860f == null) {
            int iW = p.w(com.voltasit.obdeleven.R.attr.colorControlActivated, this);
            int iW2 = p.w(com.voltasit.obdeleven.R.attr.colorOnSurface, this);
            int iW3 = p.w(com.voltasit.obdeleven.R.attr.colorSurface, this);
            this.f4860f = new ColorStateList(f4859h, new int[]{p.B(1.0f, iW3, iW), p.B(0.54f, iW3, iW2), p.B(0.38f, iW3, iW2), p.B(0.38f, iW3, iW2)});
        }
        return this.f4860f;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f4861g && b.a(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z10) {
        this.f4861g = z10;
        if (z10) {
            b.c(this, getMaterialThemeColorsTintList());
        } else {
            b.c(this, null);
        }
    }
}
