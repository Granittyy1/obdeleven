package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import com.voltasit.obdeleven.R;

/* JADX INFO: renamed from: androidx.appcompat.widget.s, reason: case insensitive filesystem */
/* JADX INFO: compiled from: AppCompatSeekBar.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0865s extends SeekBar {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0866t f9015b;

    public C0865s(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.seekBarStyle);
        X.a(this, getContext());
        C0866t c0866t = new C0866t(this);
        this.f9015b = c0866t;
        c0866t.a(attributeSet, R.attr.seekBarStyle);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0866t c0866t = this.f9015b;
        Drawable drawable = c0866t.f9017e;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        C0865s c0865s = c0866t.f9016d;
        if (drawable.setState(c0865s.getDrawableState())) {
            c0865s.invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f9015b.f9017e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f9015b.d(canvas);
    }
}
