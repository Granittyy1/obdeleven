package androidx.constraintlayout.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.view.View;

/* JADX INFO: compiled from: Placeholder.java */
/* JADX INFO: loaded from: classes.dex */
public final class e extends View {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f16621b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public View f16622c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f16623d;

    public View getContent() {
        return this.f16622c;
    }

    public int getEmptyVisibility() {
        return this.f16623d;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (isInEditMode()) {
            canvas.drawRGB(223, 223, 223);
            Paint paint = new Paint();
            paint.setARGB(255, 210, 210, 210);
            paint.setTextAlign(Paint.Align.CENTER);
            paint.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
            Rect rect = new Rect();
            canvas.getClipBounds(rect);
            paint.setTextSize(rect.height());
            int iHeight = rect.height();
            int iWidth = rect.width();
            paint.setTextAlign(Paint.Align.LEFT);
            paint.getTextBounds("?", 0, 1, rect);
            canvas.drawText("?", ((iWidth / 2.0f) - (rect.width() / 2.0f)) - rect.left, ((rect.height() / 2.0f) + (iHeight / 2.0f)) - rect.bottom, paint);
        }
    }

    public void setContentId(int i10) {
        View viewFindViewById;
        if (this.f16621b == i10) {
            return;
        }
        View view = this.f16622c;
        if (view != null) {
            view.setVisibility(0);
            ((ConstraintLayout.a) this.f16622c.getLayoutParams()).f16432f0 = false;
            this.f16622c = null;
        }
        this.f16621b = i10;
        if (i10 == -1 || (viewFindViewById = ((View) getParent()).findViewById(i10)) == null) {
            return;
        }
        viewFindViewById.setVisibility(8);
    }

    public void setEmptyVisibility(int i10) {
        this.f16623d = i10;
    }
}
