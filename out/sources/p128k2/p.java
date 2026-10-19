package p128k2;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;

/* JADX INFO: compiled from: SubtitlePainter.java */
/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f41540A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int f41541B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public int f41542C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public int f41543D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public StaticLayout f41544E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public StaticLayout f41545F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public int f41546G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public int f41547H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public int f41548I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public Rect f41549J;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f41550a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f41551b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f41552c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f41553d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f41554e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TextPaint f41555f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Paint f41556g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Paint f41557h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public CharSequence f41558i;
    public Layout.Alignment j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Bitmap f41559k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f41560l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f41561m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f41562n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f41563o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f41564p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f41565q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public float f41566r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f41567s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f41568t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f41569u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f41570v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f41571w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public float f41572x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public float f41573y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public float f41574z;

    public p(Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, new int[]{R.attr.lineSpacingExtra, R.attr.lineSpacingMultiplier}, 0, 0);
        this.f41554e = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f41553d = typedArrayObtainStyledAttributes.getFloat(1, 1.0f);
        typedArrayObtainStyledAttributes.recycle();
        float fRound = Math.round((context.getResources().getDisplayMetrics().densityDpi * 2.0f) / 160.0f);
        this.f41550a = fRound;
        this.f41551b = fRound;
        this.f41552c = fRound;
        TextPaint textPaint = new TextPaint();
        this.f41555f = textPaint;
        textPaint.setAntiAlias(true);
        textPaint.setSubpixelText(true);
        Paint paint = new Paint();
        this.f41556g = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint();
        this.f41557h = paint2;
        paint2.setAntiAlias(true);
        paint2.setFilterBitmap(true);
    }

    public final void a(Canvas canvas, boolean z10) {
        if (!z10) {
            this.f41549J.getClass();
            this.f41559k.getClass();
            canvas.drawBitmap(this.f41559k, (Rect) null, this.f41549J, this.f41557h);
            return;
        }
        StaticLayout staticLayout = this.f41544E;
        StaticLayout staticLayout2 = this.f41545F;
        if (staticLayout == null || staticLayout2 == null) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(this.f41546G, this.f41547H);
        if (Color.alpha(this.f41569u) > 0) {
            Paint paint = this.f41556g;
            paint.setColor(this.f41569u);
            canvas.drawRect(-this.f41548I, 0.0f, staticLayout.getWidth() + this.f41548I, staticLayout.getHeight(), paint);
        }
        int i10 = this.f41571w;
        TextPaint textPaint = this.f41555f;
        if (i10 == 1) {
            textPaint.setStrokeJoin(Paint.Join.ROUND);
            textPaint.setStrokeWidth(this.f41550a);
            textPaint.setColor(this.f41570v);
            textPaint.setStyle(Paint.Style.FILL_AND_STROKE);
            staticLayout2.draw(canvas);
        } else {
            float f10 = this.f41551b;
            if (i10 == 2) {
                float f11 = this.f41552c;
                textPaint.setShadowLayer(f10, f11, f11, this.f41570v);
            } else if (i10 == 3 || i10 == 4) {
                boolean z11 = i10 == 3;
                int i11 = z11 ? -1 : this.f41570v;
                int i12 = z11 ? this.f41570v : -1;
                float f12 = f10 / 2.0f;
                textPaint.setColor(this.f41567s);
                textPaint.setStyle(Paint.Style.FILL);
                float f13 = -f12;
                textPaint.setShadowLayer(f10, f13, f13, i11);
                staticLayout2.draw(canvas);
                textPaint.setShadowLayer(f10, f12, f12, i12);
            }
        }
        textPaint.setColor(this.f41567s);
        textPaint.setStyle(Paint.Style.FILL);
        staticLayout.draw(canvas);
        textPaint.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
        canvas.restoreToCount(iSave);
    }
}
