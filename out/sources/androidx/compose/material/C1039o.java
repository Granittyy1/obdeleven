package androidx.compose.material;

import androidx.compose.animation.core.C0908h;
import androidx.compose.runtime.InterfaceC1084f;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: renamed from: androidx.compose.material.o, reason: case insensitive filesystem */
/* JADX INFO: compiled from: FloatingActionButton.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C1039o implements C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f11921a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f11922b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f11923c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f11924d;

    public C1039o(float f10, float f11, float f12, float f13) {
        this.f11921a = f10;
        this.f11922b = f11;
        this.f11923c = f12;
        this.f11924d = f13;
    }

    @Override // androidx.compose.material.C
    public final C0908h a(androidx.compose.foundation.interaction.k kVar, InterfaceC1084f interfaceC1084f, int i10) {
        interfaceC1084f.L(-478475335);
        int i11 = (i10 & 14) ^ 6;
        boolean z10 = (i11 > 4 && interfaceC1084f.K(kVar)) || (i10 & 6) == 4;
        Object objF = interfaceC1084f.f();
        Object obj = InterfaceC1084f.a.f12980a;
        if (z10 || objF == obj) {
            objF = new D(this.f11921a, this.f11922b, this.f11923c, this.f11924d);
            interfaceC1084f.E(objF);
        }
        D d10 = (D) objF;
        boolean zK = interfaceC1084f.k(d10) | ((((i10 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) ^ 48) > 32 && interfaceC1084f.K(this)) || (i10 & 48) == 32);
        Object objF2 = interfaceC1084f.f();
        if (zK || objF2 == obj) {
            objF2 = new DefaultFloatingActionButtonElevation$elevation$1$1(d10, this, null);
            interfaceC1084f.E(objF2);
        }
        androidx.compose.runtime.E.d((Ia.p) objF2, interfaceC1084f, this);
        boolean zK2 = interfaceC1084f.k(d10) | ((i11 > 4 && interfaceC1084f.K(kVar)) || (i10 & 6) == 4);
        Object objF3 = interfaceC1084f.f();
        if (zK2 || objF3 == obj) {
            objF3 = new DefaultFloatingActionButtonElevation$elevation$2$1(kVar, d10, null);
            interfaceC1084f.E(objF3);
        }
        androidx.compose.runtime.E.d((Ia.p) objF3, interfaceC1084f, kVar);
        C0908h<p013b0.f, V> c0908h = d10.f11721e.f9338c;
        interfaceC1084f.D();
        return c0908h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1039o)) {
            return false;
        }
        C1039o c1039o = (C1039o) obj;
        if (p013b0.f.a(this.f11921a, c1039o.f11921a) && p013b0.f.a(this.f11922b, c1039o.f11922b) && p013b0.f.a(this.f11923c, c1039o.f11923c)) {
            return p013b0.f.a(this.f11924d, c1039o.f11924d);
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f11924d) + O.a.d(this.f11923c, O.a.d(this.f11922b, Float.hashCode(this.f11921a) * 31, 31), 31);
    }
}
