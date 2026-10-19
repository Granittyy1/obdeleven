package p239t5;

import K5.m;
import K5.o;
import P5.d;
import S5.f;
import S5.i;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.view.O;
import androidx.core.view.Z;
import com.voltasit.obdeleven.R;
import java.lang.ref.WeakReference;
import java.text.NumberFormat;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: BadgeDrawable.java */
/* JADX INFO: loaded from: classes3.dex */
public final class a extends Drawable implements m.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WeakReference<Context> f47266b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f47267c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m f47268d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Rect f47269e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final b f47270f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f47271g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f47272h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f47273i;
    public float j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f47274k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f47275l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public WeakReference<View> f47276m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public WeakReference<FrameLayout> f47277n;

    public a(Context context) {
        d dVar;
        WeakReference<Context> weakReference = new WeakReference<>(context);
        this.f47266b = weakReference;
        o.c(context, o.f4357b, "Theme.MaterialComponents");
        this.f47269e = new Rect();
        m mVar = new m(this);
        this.f47268d = mVar;
        TextPaint textPaint = mVar.f4348a;
        textPaint.setTextAlign(Paint.Align.CENTER);
        b bVar = new b(context);
        this.f47270f = bVar;
        boolean zE = e();
        b.a aVar = bVar.f47279b;
        f fVar = new f(i.a(context, zE ? aVar.f47299h.intValue() : aVar.f47297f.intValue(), e() ? aVar.f47300i.intValue() : aVar.f47298g.intValue(), new S5.a(0)).a());
        this.f47267c = fVar;
        g();
        Context context2 = weakReference.get();
        if (context2 != null && mVar.f4354g != (dVar = new d(context2, aVar.f47296e.intValue()))) {
            mVar.b(dVar, context2);
            textPaint.setColor(aVar.f47295d.intValue());
            invalidateSelf();
            i();
            invalidateSelf();
        }
        int i10 = aVar.f47303m;
        if (i10 != -2) {
            this.f47273i = ((int) Math.pow(10.0d, ((double) i10) - 1.0d)) - 1;
        } else {
            this.f47273i = aVar.f47304n;
        }
        mVar.f4352e = true;
        i();
        invalidateSelf();
        mVar.f4352e = true;
        g();
        i();
        invalidateSelf();
        textPaint.setAlpha(getAlpha());
        invalidateSelf();
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(aVar.f47294c.intValue());
        if (fVar.f5566b.f5591c != colorStateListValueOf) {
            fVar.k(colorStateListValueOf);
            invalidateSelf();
        }
        textPaint.setColor(aVar.f47295d.intValue());
        invalidateSelf();
        WeakReference<View> weakReference2 = this.f47276m;
        if (weakReference2 != null && weakReference2.get() != null) {
            View view = this.f47276m.get();
            WeakReference<FrameLayout> weakReference3 = this.f47277n;
            h(view, weakReference3 != null ? weakReference3.get() : null);
        }
        i();
        setVisible(aVar.f47311u.booleanValue(), false);
    }

    @Override // K5.m.b
    public final void a() {
        invalidateSelf();
    }

    public final String b() {
        b bVar = this.f47270f;
        b.a aVar = bVar.f47279b;
        String str = aVar.f47301k;
        boolean z10 = str != null;
        WeakReference<Context> weakReference = this.f47266b;
        if (z10) {
            int i10 = aVar.f47303m;
            if (i10 == -2 || str == null || str.length() <= i10) {
                return str;
            }
            Context context = weakReference.get();
            if (context == null) {
                return "";
            }
            return String.format(context.getString(R.string.m3_exceed_max_badge_text_suffix), str.substring(0, i10 - 1), "…");
        }
        if (!f()) {
            return null;
        }
        int i11 = this.f47273i;
        b.a aVar2 = bVar.f47279b;
        if (i11 == -2 || d() <= this.f47273i) {
            return NumberFormat.getInstance(aVar2.f47305o).format(d());
        }
        Context context2 = weakReference.get();
        return context2 == null ? "" : String.format(aVar2.f47305o, context2.getString(R.string.mtrl_exceed_max_badge_number_suffix), Integer.valueOf(this.f47273i), "+");
    }

    public final FrameLayout c() {
        WeakReference<FrameLayout> weakReference = this.f47277n;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public final int d() {
        int i10 = this.f47270f.f47279b.f47302l;
        if (i10 != -1) {
            return i10;
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        String strB;
        if (getBounds().isEmpty() || getAlpha() == 0 || !isVisible()) {
            return;
        }
        this.f47267c.draw(canvas);
        if (!e() || (strB = b()) == null) {
            return;
        }
        Rect rect = new Rect();
        m mVar = this.f47268d;
        mVar.f4348a.getTextBounds(strB, 0, strB.length(), rect);
        float fExactCenterY = this.f47272h - rect.exactCenterY();
        canvas.drawText(strB, this.f47271g, rect.bottom <= 0 ? (int) fExactCenterY : Math.round(fExactCenterY), mVar.f4348a);
    }

    public final boolean e() {
        return this.f47270f.f47279b.f47301k != null || f();
    }

    public final boolean f() {
        b.a aVar = this.f47270f.f47279b;
        return aVar.f47301k == null && aVar.f47302l != -1;
    }

    public final void g() {
        Context context = this.f47266b.get();
        if (context == null) {
            return;
        }
        boolean zE = e();
        b bVar = this.f47270f;
        this.f47267c.setShapeAppearanceModel(i.a(context, zE ? bVar.f47279b.f47299h.intValue() : bVar.f47279b.f47297f.intValue(), e() ? bVar.f47279b.f47300i.intValue() : bVar.f47279b.f47298g.intValue(), new S5.a(0)).a());
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f47270f.f47279b.j;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f47269e.height();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f47269e.width();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    public final void h(View view, FrameLayout frameLayout) {
        this.f47276m = new WeakReference<>(view);
        this.f47277n = new WeakReference<>(frameLayout);
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        viewGroup.setClipChildren(false);
        viewGroup.setClipToPadding(false);
        i();
        invalidateSelf();
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0220  */
    /* JADX WARN: Code duplicated, block: B:102:0x0238  */
    /* JADX WARN: Code duplicated, block: B:105:0x0241  */
    /* JADX WARN: Code duplicated, block: B:106:0x0259  */
    /* JADX WARN: Code duplicated, block: B:109:0x025e  */
    /* JADX WARN: Code duplicated, block: B:112:0x026b  */
    /* JADX WARN: Code duplicated, block: B:115:0x0278  */
    /* JADX WARN: Code duplicated, block: B:118:0x0285  */
    public final void i() {
        float y10;
        float x10;
        float y11;
        float x11;
        float height;
        float width;
        float f10;
        float f11;
        WeakReference<Context> weakReference = this.f47266b;
        Context context = weakReference.get();
        WeakReference<View> weakReference2 = this.f47276m;
        View view = weakReference2 != null ? weakReference2.get() : null;
        if (context == null || view == null) {
            return;
        }
        Rect rect = new Rect();
        Rect rect2 = this.f47269e;
        rect.set(rect2);
        Rect rect3 = new Rect();
        view.getDrawingRect(rect3);
        WeakReference<FrameLayout> weakReference3 = this.f47277n;
        FrameLayout frameLayout = weakReference3 != null ? weakReference3.get() : null;
        if (frameLayout != null) {
            frameLayout.offsetDescendantRectToMyCoords(view, rect3);
        }
        boolean zE = e();
        b bVar = this.f47270f;
        float f12 = zE ? bVar.f47281d : bVar.f47280c;
        this.j = f12;
        if (f12 != -1.0f) {
            this.f47274k = f12;
            this.f47275l = f12;
        } else {
            this.f47274k = Math.round((e() ? bVar.f47284g : bVar.f47282e) / 2.0f);
            this.f47275l = Math.round((e() ? bVar.f47285h : bVar.f47283f) / 2.0f);
        }
        if (e()) {
            String strB = b();
            float f13 = this.f47274k;
            m mVar = this.f47268d;
            if (mVar.f4352e) {
                mVar.a(strB);
                f10 = mVar.f4350c;
            } else {
                f10 = mVar.f4350c;
            }
            this.f47274k = Math.max(f13, (f10 / 2.0f) + bVar.f47279b.f47312v.intValue());
            float f14 = this.f47275l;
            if (mVar.f4352e) {
                mVar.a(strB);
                f11 = mVar.f4351d;
            } else {
                f11 = mVar.f4351d;
            }
            float fMax = Math.max(f14, (f11 / 2.0f) + bVar.f47279b.f47313w.intValue());
            this.f47275l = fMax;
            this.f47274k = Math.max(this.f47274k, fMax);
        }
        int iIntValue = bVar.f47279b.f47315y.intValue();
        boolean zE2 = e();
        b.a aVar = bVar.f47279b;
        if (zE2) {
            iIntValue = aVar.f47288A.intValue();
            Context context2 = weakReference.get();
            if (context2 != null) {
                iIntValue = p216r5.a.c(p216r5.a.b(0.0f, 1.0f, 0.3f, 1.0f, context2.getResources().getConfiguration().fontScale - 1.0f), iIntValue, iIntValue - aVar.f47291D.intValue());
            }
        }
        int i10 = bVar.f47287k;
        if (i10 == 0) {
            iIntValue -= Math.round(this.f47275l);
        }
        int iIntValue2 = aVar.f47290C.intValue() + iIntValue;
        int iIntValue3 = aVar.f47310t.intValue();
        if (iIntValue3 == 8388691 || iIntValue3 == 8388693) {
            this.f47272h = rect3.bottom - iIntValue2;
        } else {
            this.f47272h = rect3.top + iIntValue2;
        }
        int iIntValue4 = e() ? aVar.f47316z.intValue() : aVar.f47314x.intValue();
        if (i10 == 1) {
            iIntValue4 += e() ? bVar.j : bVar.f47286i;
        }
        int iIntValue5 = aVar.f47289B.intValue() + iIntValue4;
        int iIntValue6 = aVar.f47310t.intValue();
        if (iIntValue6 == 8388659 || iIntValue6 == 8388691) {
            WeakHashMap<View, Z> weakHashMap = O.f16859a;
            this.f47271g = view.getLayoutDirection() == 0 ? (rect3.left - this.f47274k) + iIntValue5 : (rect3.right + this.f47274k) - iIntValue5;
        } else {
            WeakHashMap<View, Z> weakHashMap2 = O.f16859a;
            this.f47271g = view.getLayoutDirection() == 0 ? (rect3.right + this.f47274k) - iIntValue5 : (rect3.left - this.f47274k) + iIntValue5;
        }
        if (aVar.f47292E.booleanValue()) {
            View viewC = c();
            if (viewC != null) {
                FrameLayout frameLayoutC = c();
                if (frameLayoutC == null || frameLayoutC.getId() != R.id.mtrl_anchor_parent) {
                    y10 = 0.0f;
                    x10 = 0.0f;
                } else if (viewC.getParent() instanceof View) {
                    y10 = viewC.getY();
                    x10 = viewC.getX();
                    viewC = (View) viewC.getParent();
                }
                y11 = viewC.getY() + (this.f47272h - this.f47275l) + y10;
                x11 = viewC.getX() + (this.f47271g - this.f47274k) + x10;
                if (viewC.getParent() instanceof View) {
                    height = ((this.f47272h + this.f47275l) - (((View) viewC.getParent()).getHeight() - viewC.getY())) + y10;
                } else {
                    height = 0.0f;
                }
                if (viewC.getParent() instanceof View) {
                    width = ((this.f47271g + this.f47274k) - (((View) viewC.getParent()).getWidth() - viewC.getX())) + x10;
                } else {
                    width = 0.0f;
                }
                if (y11 < 0.0f) {
                    this.f47272h = Math.abs(y11) + this.f47272h;
                }
                if (x11 < 0.0f) {
                    this.f47271g = Math.abs(x11) + this.f47271g;
                }
                if (height > 0.0f) {
                    this.f47272h -= Math.abs(height);
                }
                if (width > 0.0f) {
                    this.f47271g -= Math.abs(width);
                }
            } else if (view.getParent() instanceof View) {
                float y12 = view.getY();
                x10 = view.getX();
                View view2 = (View) view.getParent();
                y10 = y12;
                viewC = view2;
                y11 = viewC.getY() + (this.f47272h - this.f47275l) + y10;
                x11 = viewC.getX() + (this.f47271g - this.f47274k) + x10;
                if (viewC.getParent() instanceof View) {
                    height = ((this.f47272h + this.f47275l) - (((View) viewC.getParent()).getHeight() - viewC.getY())) + y10;
                } else {
                    height = 0.0f;
                }
                if (viewC.getParent() instanceof View) {
                    width = ((this.f47271g + this.f47274k) - (((View) viewC.getParent()).getWidth() - viewC.getX())) + x10;
                } else {
                    width = 0.0f;
                }
                if (y11 < 0.0f) {
                    this.f47272h = Math.abs(y11) + this.f47272h;
                }
                if (x11 < 0.0f) {
                    this.f47271g = Math.abs(x11) + this.f47271g;
                }
                if (height > 0.0f) {
                    this.f47272h -= Math.abs(height);
                }
                if (width > 0.0f) {
                    this.f47271g -= Math.abs(width);
                }
            }
        }
        float f15 = this.f47271g;
        float f16 = this.f47272h;
        float f17 = this.f47274k;
        float f18 = this.f47275l;
        rect2.set((int) (f15 - f17), (int) (f16 - f18), (int) (f15 + f17), (int) (f16 + f18));
        float f19 = this.j;
        f fVar = this.f47267c;
        if (f19 != -1.0f) {
            i.a aVarE = fVar.f5566b.f5589a.e();
            aVarE.e(f19);
            aVarE.f(f19);
            aVarE.d(f19);
            aVarE.c(f19);
            fVar.setShapeAppearanceModel(aVarE.a());
        }
        if (rect.equals(rect2)) {
            return;
        }
        fVar.setBounds(rect2);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return false;
    }

    @Override // android.graphics.drawable.Drawable, K5.m.b
    public final boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        b bVar = this.f47270f;
        bVar.f47278a.j = i10;
        bVar.f47279b.j = i10;
        this.f47268d.f4348a.setAlpha(getAlpha());
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
