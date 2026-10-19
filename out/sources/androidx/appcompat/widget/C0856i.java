package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: renamed from: androidx.appcompat.widget.i, reason: case insensitive filesystem */
/* JADX INFO: compiled from: AppCompatDrawableManager.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0856i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final PorterDuff.Mode f8980b = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static C0856i f8981c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public P f8982a;

    /* JADX INFO: renamed from: androidx.appcompat.widget.i$a */
    /* JADX INFO: compiled from: AppCompatDrawableManager.java */
    public class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int[] f8983a = {R.drawable.abc_textfield_search_default_mtrl_alpha, R.drawable.abc_textfield_default_mtrl_alpha, R.drawable.abc_ab_share_pack_mtrl_alpha};

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int[] f8984b = {R.drawable.abc_ic_commit_search_api_mtrl_alpha, com.voltasit.obdeleven.R.drawable.abc_seekbar_tick_mark_material, com.voltasit.obdeleven.R.drawable.abc_ic_menu_share_mtrl_alpha, com.voltasit.obdeleven.R.drawable.abc_ic_menu_copy_mtrl_am_alpha, com.voltasit.obdeleven.R.drawable.abc_ic_menu_cut_mtrl_alpha, com.voltasit.obdeleven.R.drawable.abc_ic_menu_selectall_mtrl_alpha, com.voltasit.obdeleven.R.drawable.abc_ic_menu_paste_mtrl_am_alpha};

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int[] f8985c = {R.drawable.abc_textfield_activated_mtrl_alpha, R.drawable.abc_textfield_search_activated_mtrl_alpha, R.drawable.abc_cab_background_top_mtrl_alpha, com.voltasit.obdeleven.R.drawable.abc_text_cursor_material, 2131230843, 2131230844, 2131230845};

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int[] f8986d = {R.drawable.abc_popup_background_mtrl_mult, com.voltasit.obdeleven.R.drawable.abc_cab_background_internal_bg, R.drawable.abc_menu_hardkey_panel_mtrl_mult};

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int[] f8987e = {com.voltasit.obdeleven.R.drawable.abc_tab_indicator_material, com.voltasit.obdeleven.R.drawable.abc_textfield_search_material};

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int[] f8988f = {com.voltasit.obdeleven.R.drawable.abc_btn_check_material, com.voltasit.obdeleven.R.drawable.abc_btn_radio_material, com.voltasit.obdeleven.R.drawable.abc_btn_check_material_anim, com.voltasit.obdeleven.R.drawable.abc_btn_radio_material_anim};

        public static boolean a(int[] iArr, int i10) {
            for (int i11 : iArr) {
                if (i11 == i10) {
                    return true;
                }
            }
            return false;
        }

        public static ColorStateList b(Context context, int i10) {
            int iC = X.c(context, com.voltasit.obdeleven.R.attr.colorControlHighlight);
            int iB = X.b(context, com.voltasit.obdeleven.R.attr.colorButtonNormal);
            int[] iArr = X.f8880b;
            int[] iArr2 = X.f8882d;
            int iE = p222s0.a.e(iC, i10);
            return new ColorStateList(new int[][]{iArr, iArr2, X.f8881c, X.f8884f}, new int[]{iB, iE, p222s0.a.e(iC, i10), i10});
        }

        public static LayerDrawable c(P p10, Context context, int i10) {
            BitmapDrawable bitmapDrawable;
            BitmapDrawable bitmapDrawable2;
            BitmapDrawable bitmapDrawable3;
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(i10);
            Drawable drawableC = p10.c(context, com.voltasit.obdeleven.R.drawable.abc_star_black_48dp);
            Drawable drawableC2 = p10.c(context, com.voltasit.obdeleven.R.drawable.abc_star_half_black_48dp);
            if ((drawableC instanceof BitmapDrawable) && drawableC.getIntrinsicWidth() == dimensionPixelSize && drawableC.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable = (BitmapDrawable) drawableC;
                bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
            } else {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                drawableC.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                drawableC.draw(canvas);
                bitmapDrawable = new BitmapDrawable(bitmapCreateBitmap);
                bitmapDrawable2 = new BitmapDrawable(bitmapCreateBitmap);
            }
            bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
            if ((drawableC2 instanceof BitmapDrawable) && drawableC2.getIntrinsicWidth() == dimensionPixelSize && drawableC2.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable3 = (BitmapDrawable) drawableC2;
            } else {
                Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
                drawableC2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                drawableC2.draw(canvas2);
                bitmapDrawable3 = new BitmapDrawable(bitmapCreateBitmap2);
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
            layerDrawable.setId(0, android.R.id.background);
            layerDrawable.setId(1, android.R.id.secondaryProgress);
            layerDrawable.setId(2, android.R.id.progress);
            return layerDrawable;
        }

        public static void e(Drawable drawable, int i10) {
            drawable.mutate().setColorFilter(C0856i.c(i10, C0856i.f8980b));
        }

        public final ColorStateList d(Context context, int i10) {
            if (i10 == com.voltasit.obdeleven.R.drawable.abc_edit_text_material) {
                return p186p0.a.b(context, com.voltasit.obdeleven.R.color.abc_tint_edittext);
            }
            if (i10 == 2131230839) {
                return p186p0.a.b(context, com.voltasit.obdeleven.R.color.abc_tint_switch_track);
            }
            if (i10 != com.voltasit.obdeleven.R.drawable.abc_switch_thumb_material) {
                if (i10 == com.voltasit.obdeleven.R.drawable.abc_btn_default_mtrl_shape) {
                    return b(context, X.c(context, com.voltasit.obdeleven.R.attr.colorButtonNormal));
                }
                if (i10 == com.voltasit.obdeleven.R.drawable.abc_btn_borderless_material) {
                    return b(context, 0);
                }
                if (i10 == com.voltasit.obdeleven.R.drawable.abc_btn_colored_material) {
                    return b(context, X.c(context, com.voltasit.obdeleven.R.attr.colorAccent));
                }
                if (i10 == 2131230834 || i10 == com.voltasit.obdeleven.R.drawable.abc_spinner_textfield_background_material) {
                    return p186p0.a.b(context, com.voltasit.obdeleven.R.color.abc_tint_spinner);
                }
                if (a(this.f8984b, i10)) {
                    return X.d(context, com.voltasit.obdeleven.R.attr.colorControlNormal);
                }
                if (a(this.f8987e, i10)) {
                    return p186p0.a.b(context, com.voltasit.obdeleven.R.color.abc_tint_default);
                }
                if (a(this.f8988f, i10)) {
                    return p186p0.a.b(context, com.voltasit.obdeleven.R.color.abc_tint_btn_checkable);
                }
                if (i10 == com.voltasit.obdeleven.R.drawable.abc_seekbar_thumb_material) {
                    return p186p0.a.b(context, com.voltasit.obdeleven.R.color.abc_tint_seek_thumb);
                }
                return null;
            }
            int[][] iArr = new int[3][];
            int[] iArr2 = new int[3];
            ColorStateList colorStateListD = X.d(context, com.voltasit.obdeleven.R.attr.colorSwitchThumbNormal);
            if (colorStateListD == null || !colorStateListD.isStateful()) {
                iArr[0] = X.f8880b;
                iArr2[0] = X.b(context, com.voltasit.obdeleven.R.attr.colorSwitchThumbNormal);
                iArr[1] = X.f8883e;
                iArr2[1] = X.c(context, com.voltasit.obdeleven.R.attr.colorControlActivated);
                iArr[2] = X.f8884f;
                iArr2[2] = X.c(context, com.voltasit.obdeleven.R.attr.colorSwitchThumbNormal);
            } else {
                int[] iArr3 = X.f8880b;
                iArr[0] = iArr3;
                iArr2[0] = colorStateListD.getColorForState(iArr3, 0);
                iArr[1] = X.f8883e;
                iArr2[1] = X.c(context, com.voltasit.obdeleven.R.attr.colorControlActivated);
                iArr[2] = X.f8884f;
                iArr2[2] = colorStateListD.getDefaultColor();
            }
            return new ColorStateList(iArr, iArr2);
        }
    }

    public static synchronized C0856i a() {
        try {
            if (f8981c == null) {
                d();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f8981c;
    }

    public static synchronized PorterDuffColorFilter c(int i10, PorterDuff.Mode mode) {
        return P.e(i10, mode);
    }

    public static synchronized void d() {
        if (f8981c == null) {
            C0856i c0856i = new C0856i();
            f8981c = c0856i;
            c0856i.f8982a = P.b();
            P p10 = f8981c.f8982a;
            a aVar = new a();
            synchronized (p10) {
                p10.f8769e = aVar;
            }
        }
    }

    public static void e(Drawable drawable, a0 a0Var, int[] iArr) {
        PorterDuff.Mode mode = P.f8762f;
        int[] state = drawable.getState();
        if (drawable.mutate() == drawable) {
            if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
                drawable.setState(new int[0]);
                drawable.setState(state);
            }
            boolean z10 = a0Var.f8901d;
            if (!z10 && !a0Var.f8900c) {
                drawable.clearColorFilter();
                return;
            }
            PorterDuffColorFilter porterDuffColorFilterE = null;
            ColorStateList colorStateList = z10 ? a0Var.f8898a : null;
            PorterDuff.Mode mode2 = a0Var.f8900c ? a0Var.f8899b : P.f8762f;
            if (colorStateList != null && mode2 != null) {
                porterDuffColorFilterE = P.e(colorStateList.getColorForState(iArr, 0), mode2);
            }
            drawable.setColorFilter(porterDuffColorFilterE);
        }
    }

    public final synchronized Drawable b(Context context, int i10) {
        return this.f8982a.c(context, i10);
    }
}
