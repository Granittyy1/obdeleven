package com.airbnb.lottie;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.Choreographer;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import androidx.compose.ui.platform.RunnableC1240q;
import com.airbnb.lottie.AsyncUpdates;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.layer.Layer;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p079g3.b;
import p154m3.j;
import p202q3.v;
import p214r3.c;
import p214r3.d;
import p214r3.e;
import p214r3.f;

/* JADX INFO: loaded from: classes.dex */
public final class LottieDrawable extends Drawable implements Drawable.Callback, Animatable {

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public static final ThreadPoolExecutor f23302J = new ThreadPoolExecutor(0, 2, 35, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new d());

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public RectF f23303A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public RectF f23304B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public Matrix f23305C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public Matrix f23306D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public AsyncUpdates f23307E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final Semaphore f23308F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final RunnableC1240q f23309G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public float f23310H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public boolean f23311I;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b f23312b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f23313c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f23314d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public OnVisibleAction f23315e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList<a> f23316f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public p129k3.b f23317g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p129k3.a f23318h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Map<String, Typeface> f23319i;
    public boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f23320k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f23321l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public com.airbnb.lottie.model.layer.b f23322m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f23323n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f23324o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f23325p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public RenderMode f23326q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f23327r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Matrix f23328s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Bitmap f23329t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Canvas f23330u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Rect f23331v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public RectF f23332w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public p092h3.a f23333x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Rect f23334y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public Rect f23335z;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class OnVisibleAction {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final OnVisibleAction f23336b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final OnVisibleAction f23337c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final OnVisibleAction f23338d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ OnVisibleAction[] f23339e;

        static {
            OnVisibleAction onVisibleAction = new OnVisibleAction("NONE", 0);
            f23336b = onVisibleAction;
            OnVisibleAction onVisibleAction2 = new OnVisibleAction("PLAY", 1);
            f23337c = onVisibleAction2;
            OnVisibleAction onVisibleAction3 = new OnVisibleAction("RESUME", 2);
            f23338d = onVisibleAction3;
            f23339e = new OnVisibleAction[]{onVisibleAction, onVisibleAction2, onVisibleAction3};
        }

        public OnVisibleAction() {
            throw null;
        }

        public static OnVisibleAction valueOf(String str) {
            return (OnVisibleAction) Enum.valueOf(OnVisibleAction.class, str);
        }

        public static OnVisibleAction[] values() {
            return (OnVisibleAction[]) f23339e.clone();
        }
    }

    public interface a {
        void run();
    }

    public LottieDrawable() {
        e eVar = new e();
        eVar.f46322e = 1.0f;
        eVar.f46323f = false;
        eVar.f46324g = 0L;
        eVar.f46325h = 0.0f;
        eVar.f46326i = 0.0f;
        eVar.j = 0;
        eVar.f46327k = -2.1474836E9f;
        eVar.f46328l = 2.1474836E9f;
        eVar.f46330n = false;
        this.f23313c = eVar;
        this.f23314d = true;
        this.f23315e = OnVisibleAction.f23336b;
        this.f23316f = new ArrayList<>();
        this.f23320k = false;
        this.f23321l = true;
        this.f23323n = 255;
        this.f23326q = RenderMode.f23340b;
        this.f23327r = false;
        this.f23328s = new Matrix();
        this.f23307E = AsyncUpdates.f23299b;
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: g3.l
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                LottieDrawable lottieDrawable = this.f35581b;
                if (lottieDrawable.f23307E == AsyncUpdates.f23300c) {
                    lottieDrawable.invalidateSelf();
                    return;
                }
                com.airbnb.lottie.model.layer.b bVar = lottieDrawable.f23322m;
                if (bVar != null) {
                    bVar.o(lottieDrawable.f23313c.c());
                }
            }
        };
        this.f23308F = new Semaphore(1);
        this.f23309G = new RunnableC1240q(2, this);
        this.f23310H = -3.4028235E38f;
        this.f23311I = false;
        eVar.addUpdateListener(animatorUpdateListener);
    }

    public static void c(Rect rect, RectF rectF) {
        rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
    }

    public final void a() {
        b bVar = this.f23312b;
        if (bVar == null) {
            return;
        }
        JsonReader.a aVar = v.f46081a;
        Rect rect = bVar.f35560i;
        com.airbnb.lottie.model.layer.b bVar2 = new com.airbnb.lottie.model.layer.b(this, new Layer(Collections.emptyList(), bVar, "__container", -1L, Layer.LayerType.f23467b, -1L, null, Collections.emptyList(), new j(), 0, 0, 0, 0.0f, 0.0f, rect.width(), rect.height(), null, null, Collections.emptyList(), Layer.MatteType.f23471b, null, false, null, null), bVar.f35559h, bVar);
        this.f23322m = bVar2;
        if (this.f23324o) {
            bVar2.n(true);
        }
        this.f23322m.f23507I = this.f23321l;
    }

    public final void b() {
        b bVar = this.f23312b;
        if (bVar == null) {
            return;
        }
        RenderMode renderMode = this.f23326q;
        int i10 = Build.VERSION.SDK_INT;
        boolean z10 = bVar.f35563m;
        int i11 = bVar.f35564n;
        int iOrdinal = renderMode.ordinal();
        boolean z11 = false;
        if (iOrdinal != 1 && (iOrdinal == 2 || ((z10 && i10 < 28) || i11 > 4))) {
            z11 = true;
        }
        this.f23327r = z11;
    }

    public final void d(Canvas canvas) {
        com.airbnb.lottie.model.layer.b bVar = this.f23322m;
        b bVar2 = this.f23312b;
        if (bVar == null || bVar2 == null) {
            return;
        }
        Matrix matrix = this.f23328s;
        matrix.reset();
        Rect bounds = getBounds();
        if (!bounds.isEmpty()) {
            matrix.preScale(bounds.width() / bVar2.f35560i.width(), bounds.height() / bVar2.f35560i.height());
            matrix.preTranslate(bounds.left, bounds.top);
        }
        bVar.f(canvas, matrix, this.f23323n);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        float f10;
        float fC;
        com.airbnb.lottie.model.layer.b bVar = this.f23322m;
        if (bVar == null) {
            return;
        }
        boolean z10 = this.f23307E == AsyncUpdates.f23300c;
        ThreadPoolExecutor threadPoolExecutor = f23302J;
        Semaphore semaphore = this.f23308F;
        RunnableC1240q runnableC1240q = this.f23309G;
        e eVar = this.f23313c;
        if (z10) {
            try {
                semaphore.acquire();
            } catch (InterruptedException unused) {
                if (!z10) {
                    return;
                } else {
                    if ((f10 > fC ? 1 : (f10 == fC ? 0 : -1)) == 0) {
                        return;
                    }
                }
            } finally {
                if (z10) {
                    semaphore.release();
                    if (bVar.f23506H != eVar.c()) {
                        threadPoolExecutor.execute(runnableC1240q);
                    }
                }
            }
        }
        if (z10 && k()) {
            j(eVar.c());
        }
        if (this.f23327r) {
            f(canvas, bVar);
        } else {
            d(canvas);
        }
        this.f23311I = false;
    }

    public final void e() {
        if (this.f23322m == null) {
            this.f23316f.add(new a() { // from class: g3.m
                @Override // com.airbnb.lottie.LottieDrawable.a
                public final void run() {
                    this.f35582a.e();
                }
            });
            return;
        }
        b();
        OnVisibleAction onVisibleAction = OnVisibleAction.f23336b;
        boolean z10 = this.f23314d;
        e eVar = this.f23313c;
        if (z10 || eVar.getRepeatCount() == 0) {
            if (isVisible()) {
                eVar.f46330n = true;
                boolean zF = eVar.f();
                Iterator it = eVar.f46314c.iterator();
                while (it.hasNext()) {
                    ((Animator.AnimatorListener) it.next()).onAnimationStart(eVar, zF);
                }
                eVar.h((int) (eVar.f() ? eVar.d() : eVar.e()));
                eVar.f46324g = 0L;
                eVar.j = 0;
                if (eVar.f46330n) {
                    eVar.g(false);
                    Choreographer.getInstance().postFrameCallback(eVar);
                }
                this.f23315e = onVisibleAction;
            } else {
                this.f23315e = OnVisibleAction.f23337c;
            }
        }
        if (z10) {
            return;
        }
        i((int) (eVar.f46322e < 0.0f ? eVar.e() : eVar.d()));
        eVar.g(true);
        eVar.a(eVar.f());
        if (isVisible()) {
            return;
        }
        this.f23315e = onVisibleAction;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x00d5  */
    public final void f(Canvas canvas, com.airbnb.lottie.model.layer.b bVar) {
        boolean z10;
        if (this.f23312b == null || bVar == null) {
            return;
        }
        if (this.f23330u == null) {
            this.f23330u = new Canvas();
            this.f23304B = new RectF();
            this.f23305C = new Matrix();
            this.f23306D = new Matrix();
            this.f23331v = new Rect();
            this.f23332w = new RectF();
            this.f23333x = new p092h3.a();
            this.f23334y = new Rect();
            this.f23335z = new Rect();
            this.f23303A = new RectF();
        }
        canvas.getMatrix(this.f23305C);
        canvas.getClipBounds(this.f23331v);
        Rect rect = this.f23331v;
        this.f23332w.set(rect.left, rect.top, rect.right, rect.bottom);
        this.f23305C.mapRect(this.f23332w);
        c(this.f23331v, this.f23332w);
        if (this.f23321l) {
            this.f23304B.set(0.0f, 0.0f, getIntrinsicWidth(), getIntrinsicHeight());
        } else {
            bVar.c(this.f23304B, null, false);
        }
        this.f23305C.mapRect(this.f23304B);
        Rect bounds = getBounds();
        float fWidth = bounds.width() / getIntrinsicWidth();
        float fHeight = bounds.height() / getIntrinsicHeight();
        RectF rectF = this.f23304B;
        rectF.set(rectF.left * fWidth, rectF.top * fHeight, rectF.right * fWidth, rectF.bottom * fHeight);
        Drawable.Callback callback = getCallback();
        if (callback instanceof View) {
            ViewParent parent = ((View) callback).getParent();
            if (parent instanceof ViewGroup) {
                z10 = !((ViewGroup) parent).getClipChildren();
            } else {
                z10 = false;
            }
        } else {
            z10 = false;
        }
        if (!z10) {
            RectF rectF2 = this.f23304B;
            Rect rect2 = this.f23331v;
            rectF2.intersect(rect2.left, rect2.top, rect2.right, rect2.bottom);
        }
        int iCeil = (int) Math.ceil(this.f23304B.width());
        int iCeil2 = (int) Math.ceil(this.f23304B.height());
        if (iCeil == 0 || iCeil2 == 0) {
            return;
        }
        Bitmap bitmap = this.f23329t;
        if (bitmap == null || bitmap.getWidth() < iCeil || this.f23329t.getHeight() < iCeil2) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iCeil, iCeil2, Bitmap.Config.ARGB_8888);
            this.f23329t = bitmapCreateBitmap;
            this.f23330u.setBitmap(bitmapCreateBitmap);
            this.f23311I = true;
        } else if (this.f23329t.getWidth() > iCeil || this.f23329t.getHeight() > iCeil2) {
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(this.f23329t, 0, 0, iCeil, iCeil2);
            this.f23329t = bitmapCreateBitmap2;
            this.f23330u.setBitmap(bitmapCreateBitmap2);
            this.f23311I = true;
        }
        if (this.f23311I) {
            Matrix matrix = this.f23328s;
            matrix.set(this.f23305C);
            matrix.preScale(fWidth, fHeight);
            RectF rectF3 = this.f23304B;
            matrix.postTranslate(-rectF3.left, -rectF3.top);
            this.f23329t.eraseColor(0);
            bVar.f(this.f23330u, matrix, this.f23323n);
            this.f23305C.invert(this.f23306D);
            this.f23306D.mapRect(this.f23303A, this.f23304B);
            c(this.f23335z, this.f23303A);
        }
        this.f23334y.set(0, 0, iCeil, iCeil2);
        canvas.drawBitmap(this.f23329t, this.f23334y, this.f23335z, this.f23333x);
    }

    public final void g() {
        if (this.f23322m == null) {
            this.f23316f.add(new a() { // from class: g3.k
                @Override // com.airbnb.lottie.LottieDrawable.a
                public final void run() {
                    this.f35580a.g();
                }
            });
            return;
        }
        b();
        OnVisibleAction onVisibleAction = OnVisibleAction.f23336b;
        boolean z10 = this.f23314d;
        e eVar = this.f23313c;
        if (z10 || eVar.getRepeatCount() == 0) {
            if (isVisible()) {
                eVar.f46330n = true;
                eVar.g(false);
                Choreographer.getInstance().postFrameCallback(eVar);
                eVar.f46324g = 0L;
                if (eVar.f() && eVar.f46326i == eVar.e()) {
                    eVar.h(eVar.d());
                } else if (!eVar.f() && eVar.f46326i == eVar.d()) {
                    eVar.h(eVar.e());
                }
                Iterator it = eVar.f46315d.iterator();
                while (it.hasNext()) {
                    ((Animator.AnimatorPauseListener) it.next()).onAnimationResume(eVar);
                }
                this.f23315e = onVisibleAction;
            } else {
                this.f23315e = OnVisibleAction.f23338d;
            }
        }
        if (z10) {
            return;
        }
        i((int) (eVar.f46322e < 0.0f ? eVar.e() : eVar.d()));
        eVar.g(true);
        eVar.a(eVar.f());
        if (isVisible()) {
            return;
        }
        this.f23315e = onVisibleAction;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f23323n;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        b bVar = this.f23312b;
        if (bVar == null) {
            return -1;
        }
        return bVar.f35560i.height();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        b bVar = this.f23312b;
        if (bVar == null) {
            return -1;
        }
        return bVar.f35560i.width();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    public final void h(b bVar) {
        if (this.f23312b == bVar) {
            return;
        }
        this.f23311I = true;
        e eVar = this.f23313c;
        if (eVar.f46330n) {
            eVar.cancel();
            if (!isVisible()) {
                this.f23315e = OnVisibleAction.f23336b;
            }
        }
        this.f23312b = null;
        this.f23322m = null;
        this.f23317g = null;
        this.f23310H = -3.4028235E38f;
        eVar.f46329m = null;
        eVar.f46327k = -2.1474836E9f;
        eVar.f46328l = 2.1474836E9f;
        invalidateSelf();
        this.f23312b = bVar;
        a();
        boolean z10 = eVar.f46329m == null;
        eVar.f46329m = bVar;
        if (z10) {
            eVar.i(Math.max(eVar.f46327k, bVar.j), Math.min(eVar.f46328l, bVar.f35561k));
        } else {
            eVar.i((int) bVar.j, (int) bVar.f35561k);
        }
        float f10 = eVar.f46326i;
        eVar.f46326i = 0.0f;
        eVar.f46325h = 0.0f;
        eVar.h((int) f10);
        eVar.b();
        j(eVar.getAnimatedFraction());
        ArrayList<a> arrayList = this.f23316f;
        Iterator it = new ArrayList(arrayList).iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (aVar != null) {
                aVar.run();
            }
            it.remove();
        }
        arrayList.clear();
        bVar.f35552a.getClass();
        b();
        Drawable.Callback callback = getCallback();
        if (callback instanceof ImageView) {
            ImageView imageView = (ImageView) callback;
            imageView.setImageDrawable(null);
            imageView.setImageDrawable(this);
        }
    }

    public final void i(final int i10) {
        if (this.f23312b == null) {
            this.f23316f.add(new a() { // from class: g3.o
                @Override // com.airbnb.lottie.LottieDrawable.a
                public final void run() {
                    this.f35585a.i(i10);
                }
            });
        } else {
            this.f23313c.h(i10);
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        if (this.f23311I) {
            return;
        }
        this.f23311I = true;
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        e eVar = this.f23313c;
        if (eVar == null) {
            return false;
        }
        return eVar.f46330n;
    }

    public final void j(final float f10) {
        b bVar = this.f23312b;
        if (bVar == null) {
            this.f23316f.add(new a() { // from class: g3.n
                @Override // com.airbnb.lottie.LottieDrawable.a
                public final void run() {
                    this.f35583a.j(f10);
                }
            });
        } else {
            this.f23313c.h(f.d(bVar.j, bVar.f35561k, f10));
        }
    }

    public final boolean k() {
        b bVar = this.f23312b;
        if (bVar == null) {
            return false;
        }
        float f10 = this.f23310H;
        float fC = this.f23313c.c();
        this.f23310H = fC;
        return Math.abs(fC - f10) * bVar.b() >= 50.0f;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.scheduleDrawable(this, runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        this.f23323n = i10;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        c.b("Use addColorFilter instead.");
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z10, boolean z11) {
        boolean zIsVisible = isVisible();
        boolean visible = super.setVisible(z10, z11);
        OnVisibleAction onVisibleAction = OnVisibleAction.f23338d;
        if (z10) {
            OnVisibleAction onVisibleAction2 = this.f23315e;
            if (onVisibleAction2 == OnVisibleAction.f23337c) {
                e();
            } else if (onVisibleAction2 == onVisibleAction) {
                g();
            }
        } else {
            e eVar = this.f23313c;
            boolean z12 = eVar.f46330n;
            OnVisibleAction onVisibleAction3 = OnVisibleAction.f23336b;
            if (z12) {
                this.f23316f.clear();
                eVar.g(true);
                Iterator it = eVar.f46315d.iterator();
                while (it.hasNext()) {
                    ((Animator.AnimatorPauseListener) it.next()).onAnimationPause(eVar);
                }
                if (!isVisible()) {
                    this.f23315e = onVisibleAction3;
                }
                this.f23315e = onVisibleAction;
            } else if (zIsVisible) {
                this.f23315e = onVisibleAction3;
            }
        }
        return visible;
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Drawable.Callback callback = getCallback();
        if ((callback instanceof View) && ((View) callback).isInEditMode()) {
            return;
        }
        e();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.f23316f.clear();
        e eVar = this.f23313c;
        eVar.g(true);
        eVar.a(eVar.f());
        if (isVisible()) {
            return;
        }
        this.f23315e = OnVisibleAction.f23336b;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.unscheduleDrawable(this, runnable);
    }
}
