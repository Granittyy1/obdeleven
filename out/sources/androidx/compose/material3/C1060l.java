package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.N0;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: renamed from: androidx.compose.material3.l, reason: case insensitive filesystem */
/* JADX INFO: compiled from: Card.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C1060l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f12592a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f12593b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f12594c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f12595d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f12596e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f12597f;

    public C1060l(float f10, float f11, float f12, float f13, float f14, float f15) {
        this.f12592a = f10;
        this.f12593b = f11;
        this.f12594c = f12;
        this.f12595d = f13;
        this.f12596e = f14;
        this.f12597f = f15;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:62:0x00fd  */
    public final N0 a(boolean z10, androidx.compose.foundation.interaction.k kVar, InterfaceC1084f interfaceC1084f, int i10) {
        float f10;
        Object objF;
        Animatable animatable;
        boolean zK;
        Object objF2;
        interfaceC1084f.L(-1763481333);
        interfaceC1084f.L(-734838460);
        Object obj = InterfaceC1084f.a.f12980a;
        float f11 = this.f12592a;
        if (kVar == null) {
            Object objF3 = interfaceC1084f.f();
            if (objF3 == obj) {
                objF3 = J0.f(new p013b0.f(f11));
                interfaceC1084f.E(objF3);
            }
            androidx.compose.runtime.X x10 = (androidx.compose.runtime.X) objF3;
            interfaceC1084f.D();
            interfaceC1084f.D();
            return x10;
        }
        interfaceC1084f.D();
        Object objF4 = interfaceC1084f.f();
        if (objF4 == obj) {
            objF4 = new SnapshotStateList();
            interfaceC1084f.E(objF4);
        }
        SnapshotStateList snapshotStateList = (SnapshotStateList) objF4;
        boolean z11 = true;
        boolean z12 = (((i10 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) ^ 48) > 32 && interfaceC1084f.K(kVar)) || (i10 & 48) == 32;
        Object objF5 = interfaceC1084f.f();
        if (z12 || objF5 == obj) {
            objF5 = new CardElevation$animateElevation$1$1(kVar, snapshotStateList, null);
            interfaceC1084f.E(objF5);
        }
        androidx.compose.runtime.E.d((Ia.p) objF5, interfaceC1084f, kVar);
        androidx.compose.foundation.interaction.i iVar = (androidx.compose.foundation.interaction.i) kotlin.collections.q.W(snapshotStateList);
        if (!z10) {
            f10 = this.f12597f;
        } else if (iVar instanceof androidx.compose.foundation.interaction.m.b) {
            f10 = this.f12593b;
        } else if (iVar instanceof androidx.compose.foundation.interaction.g) {
            f10 = this.f12595d;
        } else {
            if (!(iVar instanceof androidx.compose.foundation.interaction.d)) {
                if (iVar instanceof androidx.compose.foundation.interaction.b) {
                    f10 = this.f12596e;
                }
                objF = interfaceC1084f.f();
                if (objF == obj) {
                    objF = new Animatable(new p013b0.f(f11), VectorConvertersKt.f9479c, null, 12);
                    interfaceC1084f.E(objF);
                }
                animatable = (Animatable) objF;
                p013b0.f fVar = new p013b0.f(f11);
                boolean zK2 = interfaceC1084f.k(animatable) | interfaceC1084f.g(f11) | ((((i10 & 14) ^ 6) <= 4 && interfaceC1084f.c(z10)) || (i10 & 6) == 4);
                if ((((i10 & 896) ^ 384) > 256 || !interfaceC1084f.K(this)) && (i10 & 384) != 256) {
                }
                zK = zK2 | z11 | interfaceC1084f.k(iVar);
                objF2 = interfaceC1084f.f();
                if (zK || objF2 == obj) {
                    Object cardElevation$animateElevation$2$1 = new CardElevation$animateElevation$2$1(animatable, f11, z10, this, iVar, null);
                    interfaceC1084f.E(cardElevation$animateElevation$2$1);
                    objF2 = cardElevation$animateElevation$2$1;
                }
                androidx.compose.runtime.E.d((Ia.p) objF2, interfaceC1084f, fVar);
                N0 n10 = animatable.f9338c;
                interfaceC1084f.D();
                return n10;
            }
            f10 = this.f12594c;
        }
        f11 = f10;
        objF = interfaceC1084f.f();
        if (objF == obj) {
            objF = new Animatable(new p013b0.f(f11), VectorConvertersKt.f9479c, null, 12);
            interfaceC1084f.E(objF);
        }
        animatable = (Animatable) objF;
        p013b0.f fVar2 = new p013b0.f(f11);
        boolean zK3 = interfaceC1084f.k(animatable) | interfaceC1084f.g(f11) | ((((i10 & 14) ^ 6) <= 4 && interfaceC1084f.c(z10)) || (i10 & 6) == 4);
        z11 = ((i10 & 896) ^ 384) > 256 ? false : false;
        zK = zK3 | z11 | interfaceC1084f.k(iVar);
        objF2 = interfaceC1084f.f();
        if (zK) {
            Object cardElevation$animateElevation$2$2 = new CardElevation$animateElevation$2$1(animatable, f11, z10, this, iVar, null);
            interfaceC1084f.E(cardElevation$animateElevation$2$2);
            objF2 = cardElevation$animateElevation$2$2;
        } else {
            Object cardElevation$animateElevation$2$3 = new CardElevation$animateElevation$2$1(animatable, f11, z10, this, iVar, null);
            interfaceC1084f.E(cardElevation$animateElevation$2$3);
            objF2 = cardElevation$animateElevation$2$3;
        }
        androidx.compose.runtime.E.d((Ia.p) objF2, interfaceC1084f, fVar2);
        N0 n11 = animatable.f9338c;
        interfaceC1084f.D();
        return n11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C1060l)) {
            return false;
        }
        C1060l c1060l = (C1060l) obj;
        return p013b0.f.a(this.f12592a, c1060l.f12592a) && p013b0.f.a(this.f12593b, c1060l.f12593b) && p013b0.f.a(this.f12594c, c1060l.f12594c) && p013b0.f.a(this.f12595d, c1060l.f12595d) && p013b0.f.a(this.f12597f, c1060l.f12597f);
    }

    public final int hashCode() {
        return Float.hashCode(this.f12597f) + O.a.d(this.f12595d, O.a.d(this.f12594c, O.a.d(this.f12593b, Float.hashCode(this.f12592a) * 31, 31), 31), 31);
    }
}
