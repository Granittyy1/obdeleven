package com.afollestad.materialdialogs.internal;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.TextView;
import com.afollestad.materialdialogs.GravityEnum;
import com.voltasit.obdeleven.R;

/* JADX INFO: loaded from: classes.dex */
public class MDButton extends TextView {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f23275b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public GravityEnum f23276c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f23277d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Drawable f23278e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Drawable f23279f;

    public MDButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f23275b = false;
        this.f23277d = context.getResources().getDimensionPixelSize(R.dimen.md_dialog_frame_margin);
        this.f23276c = GravityEnum.f23190d;
    }

    public final void a(boolean z10, boolean z11) {
        int iOrdinal;
        if (this.f23275b != z10 || z11) {
            setGravity(z10 ? this.f23276c.a() | 16 : 17);
            int i10 = 4;
            if (z10 && (iOrdinal = this.f23276c.ordinal()) != 1) {
                i10 = iOrdinal != 2 ? 5 : 6;
            }
            setTextAlignment(i10);
            setBackground(z10 ? this.f23278e : this.f23279f);
            if (z10) {
                setPadding(this.f23277d, getPaddingTop(), this.f23277d, getPaddingBottom());
            }
            this.f23275b = z10;
        }
    }

    public void setAllCapsCompat(boolean z10) {
        setAllCaps(z10);
    }

    public void setDefaultSelector(Drawable drawable) {
        this.f23279f = drawable;
        if (this.f23275b) {
            return;
        }
        a(false, true);
    }

    public void setStackedGravity(GravityEnum gravityEnum) {
        this.f23276c = gravityEnum;
    }

    public void setStackedSelector(Drawable drawable) {
        this.f23278e = drawable;
        if (this.f23275b) {
            a(true, true);
        }
    }
}
