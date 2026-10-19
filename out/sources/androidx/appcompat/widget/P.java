package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.TypedValue;
import androidx.collection.C0891t;
import androidx.collection.C0893v;
import com.voltasit.obdeleven.R;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: ResourceManagerInternal.java */
/* JADX INFO: loaded from: classes.dex */
public final class P {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static P f8763g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public WeakHashMap<Context, androidx.collection.Y<ColorStateList>> f8765a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WeakHashMap<Context, C0891t<WeakReference<Drawable.ConstantState>>> f8766b = new WeakHashMap<>(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TypedValue f8767c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f8768d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public C0856i.a f8769e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final PorterDuff.Mode f8762f = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f8764h = new a(6);

    /* JADX INFO: compiled from: ResourceManagerInternal.java */
    public static class a extends C0893v<Integer, PorterDuffColorFilter> {
    }

    public static synchronized P b() {
        try {
            if (f8763g == null) {
                f8763g = new P();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f8763g;
    }

    public static synchronized PorterDuffColorFilter e(int i10, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilterC;
        a aVar = f8764h;
        aVar.getClass();
        int i11 = (31 + i10) * 31;
        porterDuffColorFilterC = aVar.c(Integer.valueOf(mode.hashCode() + i11));
        if (porterDuffColorFilterC == null) {
            porterDuffColorFilterC = new PorterDuffColorFilter(i10, mode);
            aVar.d(Integer.valueOf(mode.hashCode() + i11), porterDuffColorFilterC);
        }
        return porterDuffColorFilterC;
    }

    public final Drawable a(Context context, int i10) {
        Drawable drawableNewDrawable;
        WeakReference<Drawable.ConstantState> weakReferenceB;
        if (this.f8767c == null) {
            this.f8767c = new TypedValue();
        }
        TypedValue typedValue = this.f8767c;
        context.getResources().getValue(i10, typedValue, true);
        long j = (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
        synchronized (this) {
            C0891t<WeakReference<Drawable.ConstantState>> c0891t = this.f8766b.get(context);
            drawableNewDrawable = null;
            if (c0891t != null && (weakReferenceB = c0891t.b(j)) != null) {
                Drawable.ConstantState constantState = weakReferenceB.get();
                if (constantState != null) {
                    drawableNewDrawable = constantState.newDrawable(context.getResources());
                } else {
                    c0891t.f(j);
                }
            }
        }
        if (drawableNewDrawable != null) {
            return drawableNewDrawable;
        }
        LayerDrawable layerDrawableC = null;
        if (this.f8769e != null) {
            if (i10 == R.drawable.abc_cab_background_top_material) {
                layerDrawableC = new LayerDrawable(new Drawable[]{c(context, R.drawable.abc_cab_background_internal_bg), c(context, me.zhanghai.android.materialprogressbar.R.drawable.abc_cab_background_top_mtrl_alpha)});
            } else if (i10 == R.drawable.abc_ratingbar_material) {
                layerDrawableC = C0856i.a.c(this, context, R.dimen.abc_star_big);
            } else if (i10 == R.drawable.abc_ratingbar_indicator_material) {
                layerDrawableC = C0856i.a.c(this, context, R.dimen.abc_star_medium);
            } else if (i10 == R.drawable.abc_ratingbar_small_material) {
                layerDrawableC = C0856i.a.c(this, context, R.dimen.abc_star_small);
            }
        }
        if (layerDrawableC != null) {
            layerDrawableC.setChangingConfigurations(typedValue.changingConfigurations);
            synchronized (this) {
                try {
                    Drawable.ConstantState constantState2 = layerDrawableC.getConstantState();
                    if (constantState2 != null) {
                        C0891t<WeakReference<Drawable.ConstantState>> c0891t2 = this.f8766b.get(context);
                        if (c0891t2 == null) {
                            c0891t2 = new C0891t<>();
                            this.f8766b.put(context, c0891t2);
                        }
                        c0891t2.e(new WeakReference(constantState2), j);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return layerDrawableC;
    }

    public final synchronized Drawable c(Context context, int i10) {
        return d(context, i10, false);
    }

    public final synchronized Drawable d(Context context, int i10, boolean z10) {
        Drawable drawableA;
        try {
            if (!this.f8768d) {
                this.f8768d = true;
                Drawable drawableC = c(context, R.drawable.abc_vector_test);
                if (drawableC == null || (!(drawableC instanceof E2.g) && !"android.graphics.drawable.VectorDrawable".equals(drawableC.getClass().getName()))) {
                    this.f8768d = false;
                    throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
                }
            }
            drawableA = a(context, i10);
            if (drawableA == null) {
                drawableA = p186p0.a.C0517a.b(context, i10);
            }
            if (drawableA != null) {
                drawableA = g(context, i10, z10, drawableA);
            }
            if (drawableA != null) {
                D.a(drawableA);
            }
        } catch (Throwable th) {
            throw th;
        }
        return drawableA;
    }

    public final synchronized ColorStateList f(Context context, int i10) {
        ColorStateList colorStateListC;
        androidx.collection.Y<ColorStateList> y10;
        WeakHashMap<Context, androidx.collection.Y<ColorStateList>> weakHashMap = this.f8765a;
        ColorStateList colorStateListD = null;
        colorStateListC = (weakHashMap == null || (y10 = weakHashMap.get(context)) == null) ? null : y10.c(i10);
        if (colorStateListC == null) {
            C0856i.a aVar = this.f8769e;
            if (aVar != null) {
                colorStateListD = aVar.d(context, i10);
            }
            if (colorStateListD != null) {
                if (this.f8765a == null) {
                    this.f8765a = new WeakHashMap<>();
                }
                androidx.collection.Y<ColorStateList> y11 = this.f8765a.get(context);
                if (y11 == null) {
                    y11 = new androidx.collection.Y<>();
                    this.f8765a.put(context, y11);
                }
                y11.a(i10, colorStateListD);
            }
            colorStateListC = colorStateListD;
        }
        return colorStateListC;
    }

    public final Drawable g(Context context, int i10, boolean z10, Drawable drawable) {
        boolean z11;
        int iRound;
        int i11 = R.attr.colorControlNormal;
        int i12 = R.attr.colorControlActivated;
        ColorStateList colorStateListF = f(context, i10);
        PorterDuff.Mode mode = null;
        if (colorStateListF != null) {
            Drawable drawableMutate = drawable.mutate();
            p234t0.a.C0532a.h(drawableMutate, colorStateListF);
            if (this.f8769e != null && i10 == R.drawable.abc_switch_thumb_material) {
                mode = PorterDuff.Mode.MULTIPLY;
            }
            if (mode == null) {
                return drawableMutate;
            }
            p234t0.a.C0532a.i(drawableMutate, mode);
            return drawableMutate;
        }
        if (this.f8769e != null) {
            if (i10 == R.drawable.abc_seekbar_track_material) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                Drawable drawableFindDrawableByLayerId = layerDrawable.findDrawableByLayerId(android.R.id.background);
                int iC = X.c(context, R.attr.colorControlNormal);
                PorterDuff.Mode mode2 = C0856i.f8980b;
                C0856i.a.e(drawableFindDrawableByLayerId, iC);
                C0856i.a.e(layerDrawable.findDrawableByLayerId(android.R.id.secondaryProgress), X.c(context, R.attr.colorControlNormal));
                C0856i.a.e(layerDrawable.findDrawableByLayerId(android.R.id.progress), X.c(context, R.attr.colorControlActivated));
                return drawable;
            }
            if (i10 == R.drawable.abc_ratingbar_material || i10 == R.drawable.abc_ratingbar_indicator_material || i10 == R.drawable.abc_ratingbar_small_material) {
                LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                Drawable drawableFindDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(android.R.id.background);
                int iB = X.b(context, R.attr.colorControlNormal);
                PorterDuff.Mode mode3 = C0856i.f8980b;
                C0856i.a.e(drawableFindDrawableByLayerId2, iB);
                C0856i.a.e(layerDrawable2.findDrawableByLayerId(android.R.id.secondaryProgress), X.c(context, R.attr.colorControlActivated));
                C0856i.a.e(layerDrawable2.findDrawableByLayerId(android.R.id.progress), X.c(context, R.attr.colorControlActivated));
                return drawable;
            }
        }
        C0856i.a aVar = this.f8769e;
        boolean z12 = false;
        if (aVar != null) {
            PorterDuff.Mode mode4 = C0856i.f8980b;
            if (C0856i.a.a(aVar.f8983a, i10)) {
                z11 = true;
                iRound = -1;
            } else {
                if (!C0856i.a.a(aVar.f8985c, i10)) {
                    boolean zA = C0856i.a.a(aVar.f8986d, i10);
                    i12 = android.R.attr.colorBackground;
                    if (zA) {
                        mode4 = PorterDuff.Mode.MULTIPLY;
                    } else if (i10 == 2131230810) {
                        iRound = Math.round(40.8f);
                        i11 = android.R.attr.colorForeground;
                        z11 = true;
                    } else {
                        if (i10 != R.drawable.abc_dialog_material_background) {
                            i11 = 0;
                            z11 = false;
                        }
                        iRound = -1;
                    }
                }
                i11 = i12;
                z11 = true;
                iRound = -1;
            }
            if (z11) {
                Drawable drawableMutate2 = drawable.mutate();
                drawableMutate2.setColorFilter(C0856i.c(X.c(context, i11), mode4));
                if (iRound != -1) {
                    drawableMutate2.setAlpha(iRound);
                }
                z12 = true;
            }
        }
        if (z12 || !z10) {
            return drawable;
        }
        return null;
    }
}
