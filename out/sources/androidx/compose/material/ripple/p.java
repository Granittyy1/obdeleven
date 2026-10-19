package androidx.compose.material.ripple;

import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.RippleDrawable;
import androidx.compose.ui.graphics.H;

/* JADX INFO: compiled from: RippleHostView.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class p extends RippleDrawable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f12017b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public H f12018c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Integer f12019d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f12020e;

    public p(boolean z10) {
        super(ColorStateList.valueOf(-16777216), null, z10 ? new ColorDrawable(-1) : null);
        this.f12017b = z10;
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.Drawable
    public final Rect getDirtyBounds() {
        if (!this.f12017b) {
            this.f12020e = true;
        }
        Rect dirtyBounds = super.getDirtyBounds();
        this.f12020e = false;
        return dirtyBounds;
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public final boolean isProjected() {
        return this.f12020e;
    }
}
