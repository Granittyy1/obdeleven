package p288x5;

import A8.p;
import S5.f;
import S5.i;
import S5.m;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import androidx.core.view.O;
import androidx.core.view.Z;
import com.google.android.material.button.MaterialButton;
import com.voltasit.obdeleven.R;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: MaterialButtonHelper.java */
/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MaterialButton f47891a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public i f47892b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f47893c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f47894d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f47895e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f47896f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f47897g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f47898h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public PorterDuff.Mode f47899i;
    public ColorStateList j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ColorStateList f47900k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ColorStateList f47901l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public f f47902m;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f47906q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public RippleDrawable f47908s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f47909t;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f47903n = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f47904o = false;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f47905p = false;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f47907r = true;

    public a(MaterialButton materialButton, i iVar) {
        this.f47891a = materialButton;
        this.f47892b = iVar;
    }

    public final m a() {
        RippleDrawable rippleDrawable = this.f47908s;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        return this.f47908s.getNumberOfLayers() > 2 ? (m) this.f47908s.getDrawable(2) : (m) this.f47908s.getDrawable(1);
    }

    public final f b(boolean z10) {
        RippleDrawable rippleDrawable = this.f47908s;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (f) ((LayerDrawable) ((InsetDrawable) this.f47908s.getDrawable(0)).getDrawable()).getDrawable(!z10 ? 1 : 0);
    }

    public final void c(i iVar) {
        this.f47892b = iVar;
        if (b(false) != null) {
            b(false).setShapeAppearanceModel(iVar);
        }
        if (b(true) != null) {
            b(true).setShapeAppearanceModel(iVar);
        }
        if (a() != null) {
            a().setShapeAppearanceModel(iVar);
        }
    }

    public final void d(int i10, int i11) {
        WeakHashMap<View, Z> weakHashMap = O.f16859a;
        MaterialButton materialButton = this.f47891a;
        int paddingStart = materialButton.getPaddingStart();
        int paddingTop = materialButton.getPaddingTop();
        int paddingEnd = materialButton.getPaddingEnd();
        int paddingBottom = materialButton.getPaddingBottom();
        int i12 = this.f47895e;
        int i13 = this.f47896f;
        this.f47896f = i11;
        this.f47895e = i10;
        if (!this.f47904o) {
            e();
        }
        materialButton.setPaddingRelative(paddingStart, (paddingTop + i10) - i12, paddingEnd, (paddingBottom + i11) - i13);
    }

    public final void e() {
        f fVar = new f(this.f47892b);
        MaterialButton materialButton = this.f47891a;
        fVar.i(materialButton.getContext());
        p234t0.a.C0532a.h(fVar, this.j);
        PorterDuff.Mode mode = this.f47899i;
        if (mode != null) {
            p234t0.a.C0532a.i(fVar, mode);
        }
        float f10 = this.f47898h;
        ColorStateList colorStateList = this.f47900k;
        fVar.f5566b.j = f10;
        fVar.invalidateSelf();
        f.b bVar = fVar.f5566b;
        if (bVar.f5592d != colorStateList) {
            bVar.f5592d = colorStateList;
            fVar.onStateChange(fVar.getState());
        }
        f fVar2 = new f(this.f47892b);
        fVar2.setTint(0);
        float f11 = this.f47898h;
        int iW = this.f47903n ? p.w(R.attr.colorSurface, materialButton) : 0;
        fVar2.f5566b.j = f11;
        fVar2.invalidateSelf();
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(iW);
        f.b bVar2 = fVar2.f5566b;
        if (bVar2.f5592d != colorStateListValueOf) {
            bVar2.f5592d = colorStateListValueOf;
            fVar2.onStateChange(fVar2.getState());
        }
        f fVar3 = new f(this.f47892b);
        this.f47902m = fVar3;
        p234t0.a.C0532a.g(fVar3, -1);
        RippleDrawable rippleDrawable = new RippleDrawable(Q5.a.b(this.f47901l), new InsetDrawable((Drawable) new LayerDrawable(new Drawable[]{fVar2, fVar}), this.f47893c, this.f47895e, this.f47894d, this.f47896f), this.f47902m);
        this.f47908s = rippleDrawable;
        materialButton.setInternalBackground(rippleDrawable);
        f fVarB = b(false);
        if (fVarB != null) {
            fVarB.j(this.f47909t);
            fVarB.setState(materialButton.getDrawableState());
        }
    }

    public final void f() {
        f fVarB = b(false);
        f fVarB2 = b(true);
        if (fVarB != null) {
            float f10 = this.f47898h;
            ColorStateList colorStateList = this.f47900k;
            fVarB.f5566b.j = f10;
            fVarB.invalidateSelf();
            f.b bVar = fVarB.f5566b;
            if (bVar.f5592d != colorStateList) {
                bVar.f5592d = colorStateList;
                fVarB.onStateChange(fVarB.getState());
            }
            if (fVarB2 != null) {
                float f11 = this.f47898h;
                int iW = this.f47903n ? p.w(R.attr.colorSurface, this.f47891a) : 0;
                fVarB2.f5566b.j = f11;
                fVarB2.invalidateSelf();
                ColorStateList colorStateListValueOf = ColorStateList.valueOf(iW);
                f.b bVar2 = fVarB2.f5566b;
                if (bVar2.f5592d != colorStateListValueOf) {
                    bVar2.f5592d = colorStateListValueOf;
                    fVarB2.onStateChange(fVarB2.getState());
                }
            }
        }
    }
}
