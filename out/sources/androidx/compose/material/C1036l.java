package androidx.compose.material;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.C0908h;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: renamed from: androidx.compose.material.l, reason: case insensitive filesystem */
/* JADX INFO: compiled from: Button.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C1036l implements InterfaceC1031g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f11905a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f11906b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f11907c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f11908d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f11909e;

    public C1036l(float f10, float f11, float f12, float f13, float f14) {
        this.f11905a = f10;
        this.f11906b = f11;
        this.f11907c = f12;
        this.f11908d = f13;
        this.f11909e = f14;
    }

    @Override // androidx.compose.material.InterfaceC1031g
    public final C0908h a(boolean z10, androidx.compose.foundation.interaction.k kVar, InterfaceC1084f interfaceC1084f, int i10) {
        float f10;
        interfaceC1084f.L(-1588756907);
        Object objF = interfaceC1084f.f();
        Object obj = InterfaceC1084f.a.f12980a;
        if (objF == obj) {
            objF = new SnapshotStateList();
            interfaceC1084f.E(objF);
        }
        SnapshotStateList snapshotStateList = (SnapshotStateList) objF;
        boolean z11 = true;
        boolean z12 = (((i10 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) ^ 48) > 32 && interfaceC1084f.K(kVar)) || (i10 & 48) == 32;
        Object objF2 = interfaceC1084f.f();
        if (z12 || objF2 == obj) {
            objF2 = new DefaultButtonElevation$elevation$1$1(kVar, snapshotStateList, null);
            interfaceC1084f.E(objF2);
        }
        androidx.compose.runtime.E.d((Ia.p) objF2, interfaceC1084f, kVar);
        androidx.compose.foundation.interaction.i iVar = (androidx.compose.foundation.interaction.i) kotlin.collections.q.W(snapshotStateList);
        if (!z10) {
            f10 = this.f11907c;
        } else if (iVar instanceof androidx.compose.foundation.interaction.m.b) {
            f10 = this.f11906b;
        } else if (iVar instanceof androidx.compose.foundation.interaction.g) {
            f10 = this.f11908d;
        } else {
            f10 = iVar instanceof androidx.compose.foundation.interaction.d ? this.f11909e : this.f11905a;
        }
        float f11 = f10;
        Object objF3 = interfaceC1084f.f();
        if (objF3 == obj) {
            objF3 = new Animatable(new p013b0.f(f11), VectorConvertersKt.f9479c, null, 12);
            interfaceC1084f.E(objF3);
        }
        Animatable animatable = (Animatable) objF3;
        p013b0.f fVar = new p013b0.f(f11);
        boolean zK = interfaceC1084f.k(animatable) | interfaceC1084f.g(f11) | ((((i10 & 14) ^ 6) > 4 && interfaceC1084f.c(z10)) || (i10 & 6) == 4);
        if ((((i10 & 896) ^ 384) <= 256 || !interfaceC1084f.K(this)) && (i10 & 384) != 256) {
            z11 = false;
        }
        boolean zK2 = zK | z11 | interfaceC1084f.k(iVar);
        Object objF4 = interfaceC1084f.f();
        if (zK2 || objF4 == obj) {
            Object defaultButtonElevation$elevation$2$1 = new DefaultButtonElevation$elevation$2$1(animatable, f11, z10, this, iVar, null);
            interfaceC1084f.E(defaultButtonElevation$elevation$2$1);
            objF4 = defaultButtonElevation$elevation$2$1;
        }
        androidx.compose.runtime.E.d((Ia.p) objF4, interfaceC1084f, fVar);
        C0908h<T, V> c0908h = animatable.f9338c;
        interfaceC1084f.D();
        return c0908h;
    }
}
