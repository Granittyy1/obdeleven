package U2;

import A0.f;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Movie;
import android.graphics.Paint;
import android.graphics.Picture;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import coil.size.Scale;
import coil.transform.PixelOpacity;
import java.util.ArrayList;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: MovieDrawable.kt */
/* JADX INFO: loaded from: classes.dex */
public final class c extends Drawable implements Animatable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Movie f6308b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Bitmap.Config f6309c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Scale f6310d;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Canvas f6315i;
    public Bitmap j;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f6318m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f6319n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f6320o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f6321p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f6322q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public p016b3.a f6324s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Picture f6325t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f6327v;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Paint f6311e = new Paint(3);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f6312f = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Rect f6313g = new Rect();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Rect f6314h = new Rect();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f6316k = 1.0f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f6317l = 1.0f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f6323r = -1;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public PixelOpacity f6326u = PixelOpacity.f23146b;

    public c(Movie movie, Bitmap.Config config, Scale scale) {
        this.f6308b = movie;
        this.f6309c = config;
        this.f6310d = scale;
        if (config == Bitmap.Config.HARDWARE) {
            throw new IllegalArgumentException("Bitmap config must not be hardware.");
        }
    }

    public final void a(Canvas canvas) {
        Canvas canvas2 = this.f6315i;
        Bitmap bitmap = this.j;
        if (canvas2 == null || bitmap == null) {
            return;
        }
        canvas2.drawColor(0, PorterDuff.Mode.CLEAR);
        int iSave = canvas2.save();
        try {
            float f10 = this.f6316k;
            canvas2.scale(f10, f10);
            Movie movie = this.f6308b;
            Paint paint = this.f6311e;
            movie.draw(canvas2, 0.0f, 0.0f, paint);
            Picture picture = this.f6325t;
            if (picture != null) {
                picture.draw(canvas2);
            }
            canvas2.restoreToCount(iSave);
            int iSave2 = canvas.save();
            try {
                canvas.translate(this.f6318m, this.f6319n);
                float f11 = this.f6317l;
                canvas.scale(f11, f11);
                canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
            } finally {
                canvas.restoreToCount(iSave2);
            }
        } catch (Throwable th) {
            canvas2.restoreToCount(iSave);
            throw th;
        }
    }

    public final void b(Rect rect) {
        Rect rect2 = this.f6313g;
        if (i.a(rect2, rect)) {
            return;
        }
        rect2.set(rect);
        int iWidth = rect.width();
        int iHeight = rect.height();
        Movie movie = this.f6308b;
        int iWidth2 = movie.width();
        int iHeight2 = movie.height();
        if (iWidth2 <= 0 || iHeight2 <= 0) {
            return;
        }
        Scale scale = this.f6310d;
        double dG = f.g(iWidth2, iHeight2, iWidth, iHeight, scale);
        if (!this.f6327v && dG > 1.0d) {
            dG = 1.0d;
        }
        float f10 = (float) dG;
        this.f6316k = f10;
        int i10 = (int) (iWidth2 * f10);
        int i11 = (int) (f10 * iHeight2);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i10, i11, this.f6309c);
        Bitmap bitmap = this.j;
        if (bitmap != null) {
            bitmap.recycle();
        }
        this.j = bitmapCreateBitmap;
        this.f6315i = new Canvas(bitmapCreateBitmap);
        if (this.f6327v) {
            this.f6317l = 1.0f;
            this.f6318m = 0.0f;
            this.f6319n = 0.0f;
            return;
        }
        float fG = (float) f.g(i10, i11, iWidth, iHeight, scale);
        this.f6317l = fG;
        float f11 = iWidth - (i10 * fG);
        float f12 = 2;
        this.f6318m = (f11 / f12) + rect.left;
        this.f6319n = ((iHeight - (fG * i11)) / f12) + rect.top;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean z10;
        Movie movie = this.f6308b;
        int iDuration = movie.duration();
        if (iDuration == 0) {
            iDuration = 0;
            z10 = false;
        } else {
            if (this.f6320o) {
                this.f6322q = SystemClock.uptimeMillis();
            }
            int i10 = (int) (this.f6322q - this.f6321p);
            int i11 = i10 / iDuration;
            int i12 = this.f6323r;
            z10 = i12 == -1 || i11 <= i12;
            if (z10) {
                iDuration = i10 - (i11 * iDuration);
            }
        }
        movie.setTime(iDuration);
        if (this.f6327v) {
            int width = canvas.getWidth();
            int height = canvas.getHeight();
            Rect rect = this.f6314h;
            rect.set(0, 0, width, height);
            b(rect);
            int iSave = canvas.save();
            try {
                float f10 = 1 / this.f6316k;
                canvas.scale(f10, f10);
                a(canvas);
                canvas.restoreToCount(iSave);
            } catch (Throwable th) {
                canvas.restoreToCount(iSave);
                throw th;
            }
        } else {
            b(getBounds());
            a(canvas);
        }
        if (this.f6320o && z10) {
            invalidateSelf();
        } else {
            stop();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f6308b.height();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f6308b.width();
    }

    @Override // android.graphics.drawable.Drawable
    @p293xa.d
    public final int getOpacity() {
        PixelOpacity pixelOpacity;
        return (this.f6311e.getAlpha() == 255 && ((pixelOpacity = this.f6326u) == PixelOpacity.f23148d || (pixelOpacity == PixelOpacity.f23146b && this.f6308b.isOpaque()))) ? -1 : -3;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.f6320o;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        if (i10 < 0 || i10 >= 256) {
            throw new IllegalArgumentException(J4.i.b(i10, "Invalid alpha: ").toString());
        }
        this.f6311e.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f6311e.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        if (this.f6320o) {
            return;
        }
        this.f6320o = true;
        this.f6321p = SystemClock.uptimeMillis();
        ArrayList arrayList = this.f6312f;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((E2.c) arrayList.get(i10)).b(this);
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        if (this.f6320o) {
            this.f6320o = false;
            ArrayList arrayList = this.f6312f;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((E2.c) arrayList.get(i10)).a(this);
            }
        }
    }
}
