package p208q9;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.voltasit.obdeleven.ui.view.FloatingEditText;

/* JADX INFO: compiled from: FloatingEditText.java */
/* JADX INFO: loaded from: classes3.dex */
public final class c extends Drawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FloatingEditText f46186a;

    public c(FloatingEditText floatingEditText) {
        this.f46186a = floatingEditText;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        FloatingEditText floatingEditText = this.f46186a;
        if (!floatingEditText.f34175g) {
            Rect rectA = FloatingEditText.a(floatingEditText, canvas);
            floatingEditText.f34181n.setColor(floatingEditText.f34174f);
            canvas.drawRect(rectA, floatingEditText.f34181n);
            floatingEditText.f34181n.setColor(floatingEditText.f34174f);
            floatingEditText.f34181n.setTextSize(floatingEditText.getTextSize() * 0.6f);
            canvas.drawText(floatingEditText.f34176h, floatingEditText.getCompoundPaddingLeft(), ((FloatingEditText.b(16) - floatingEditText.f34181n.getFontMetricsInt().top) / 2) + rectA.bottom, floatingEditText.f34181n);
            return;
        }
        if (floatingEditText.isFocused()) {
            Rect rectA2 = FloatingEditText.a(floatingEditText, canvas);
            floatingEditText.f34181n.setColor(floatingEditText.f34173e);
            canvas.drawRect(rectA2, floatingEditText.f34181n);
            return;
        }
        int paddingLeft = floatingEditText.getPaddingLeft();
        Rect rect = floatingEditText.f34180m;
        rect.left = paddingLeft;
        rect.top = (canvas.getHeight() - floatingEditText.f34177i) - FloatingEditText.b(16);
        rect.right = floatingEditText.getWidth();
        rect.bottom = canvas.getHeight() - FloatingEditText.b(16);
        floatingEditText.f34181n.setColor(floatingEditText.f34172d);
        canvas.drawRect(rect, floatingEditText.f34181n);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        this.f46186a.f34181n.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f46186a.f34181n.setColorFilter(colorFilter);
    }
}
