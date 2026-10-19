package O3;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import com.google.android.gms.internal.measurement.M1;
import java.util.ArrayList;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: GifDrawable.java */
/* JADX INFO: loaded from: classes.dex */
public final class c extends Drawable implements g.b, Animatable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f4804b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f4805c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f4806d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f4807e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f4808f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f4809g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f4810h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f4811i;
    public Paint j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Rect f4812k;

    /* JADX INFO: compiled from: GifDrawable.java */
    public static final class a extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final g f4813a;

        public a(g gVar) {
            this.f4813a = gVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable() {
            return new c(this);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources) {
            return new c(this);
        }
    }

    public c() {
        throw null;
    }

    public c(a aVar) {
        this.f4808f = true;
        this.f4810h = -1;
        M1.d(aVar, "Argument must not be null");
        this.f4804b = aVar;
    }

    @Override // O3.g.b
    public final void a() {
        Object callback = getCallback();
        while (callback instanceof Drawable) {
            callback = ((Drawable) callback).getCallback();
        }
        if (callback == null) {
            stop();
            invalidateSelf();
            return;
        }
        invalidateSelf();
        g gVar = this.f4804b.f4813a;
        g.a aVar = gVar.f4826i;
        if ((aVar != null ? aVar.f4835f : -1) == gVar.f4818a.f48818l.f48796c - 1) {
            this.f4809g++;
        }
        int i10 = this.f4810h;
        if (i10 == -1 || this.f4809g < i10) {
            return;
        }
        stop();
    }

    public final void b() {
        M1.b("You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.", !this.f4807e);
        g gVar = this.f4804b.f4813a;
        if (gVar.f4818a.f48818l.f48796c == 1) {
            invalidateSelf();
            return;
        }
        if (this.f4805c) {
            return;
        }
        this.f4805c = true;
        if (gVar.j) {
            throw new IllegalStateException("Cannot subscribe to a cleared frame loader");
        }
        ArrayList arrayList = gVar.f4820c;
        if (arrayList.contains(this)) {
            throw new IllegalStateException("Cannot subscribe twice in a row");
        }
        boolean zIsEmpty = arrayList.isEmpty();
        arrayList.add(this);
        if (zIsEmpty && !gVar.f4823f) {
            gVar.f4823f = true;
            gVar.j = false;
            gVar.a();
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.f4807e) {
            return;
        }
        if (this.f4811i) {
            int intrinsicWidth = getIntrinsicWidth();
            int intrinsicHeight = getIntrinsicHeight();
            Rect bounds = getBounds();
            if (this.f4812k == null) {
                this.f4812k = new Rect();
            }
            Gravity.apply(R.styleable.AppCompatTheme_windowActionModeOverlay, intrinsicWidth, intrinsicHeight, bounds, this.f4812k);
            this.f4811i = false;
        }
        g gVar = this.f4804b.f4813a;
        g.a aVar = gVar.f4826i;
        Bitmap bitmap = aVar != null ? aVar.f4837h : gVar.f4828l;
        if (this.f4812k == null) {
            this.f4812k = new Rect();
        }
        Rect rect = this.f4812k;
        if (this.j == null) {
            this.j = new Paint(2);
        }
        canvas.drawBitmap(bitmap, (Rect) null, rect, this.j);
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.f4804b;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f4804b.f4813a.f4833q;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f4804b.f4813a.f4832p;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.f4805c;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f4811i = true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        if (this.j == null) {
            this.j = new Paint(2);
        }
        this.j.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.j == null) {
            this.j = new Paint(2);
        }
        this.j.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z10, boolean z11) {
        M1.b("Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.", !this.f4807e);
        this.f4808f = z10;
        if (!z10) {
            this.f4805c = false;
            g gVar = this.f4804b.f4813a;
            ArrayList arrayList = gVar.f4820c;
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                gVar.f4823f = false;
            }
        } else if (this.f4806d) {
            b();
        }
        return super.setVisible(z10, z11);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        this.f4806d = true;
        this.f4809g = 0;
        if (this.f4808f) {
            b();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.f4806d = false;
        this.f4805c = false;
        g gVar = this.f4804b.f4813a;
        ArrayList arrayList = gVar.f4820c;
        arrayList.remove(this);
        if (arrayList.isEmpty()) {
            gVar.f4823f = false;
        }
    }
}
