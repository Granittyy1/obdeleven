package androidx.compose.material3;

import androidx.compose.material3.tokens.ColorSchemeKeyTokens;
import androidx.compose.runtime.InterfaceC1084f;

/* JADX INFO: renamed from: androidx.compose.material3.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: Button.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C1051f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final androidx.compose.foundation.layout.N f12444a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final androidx.compose.foundation.layout.N f12445b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f12446c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final float f12447d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final float f12448e;

    static {
        float f10 = 24;
        float f11 = 8;
        f12444a = new androidx.compose.foundation.layout.N(f10, f11, f10, f11);
        float f12 = 16;
        new androidx.compose.foundation.layout.N(f12, f11, f10, f11);
        float f13 = 12;
        f12445b = new androidx.compose.foundation.layout.N(f13, f11, f13, f11);
        new androidx.compose.foundation.layout.N(f13, f11, f12, f11);
        f12446c = 58;
        f12447d = 40;
        float f14 = B.k.f1279a;
        f12448e = f11;
    }

    public static C1050e a(long j, long j10, long j11, long j12, InterfaceC1084f interfaceC1084f, int i10) {
        return c((C1061m) interfaceC1084f.x(ColorSchemeKt.f12087a)).a(j, (i10 & 2) != 0 ? androidx.compose.ui.graphics.H.f13504l : j10, (i10 & 4) != 0 ? androidx.compose.ui.graphics.H.f13504l : j11, (i10 & 8) != 0 ? androidx.compose.ui.graphics.H.f13504l : j12);
    }

    public static C1052g b(float f10, float f11, float f12, float f13, float f14, int i10) {
        if ((i10 & 1) != 0) {
            f10 = B.k.f1279a;
        }
        float f15 = f10;
        if ((i10 & 2) != 0) {
            f11 = B.k.f1287i;
        }
        float f16 = f11;
        if ((i10 & 4) != 0) {
            f12 = B.k.f1284f;
        }
        float f17 = f12;
        if ((i10 & 8) != 0) {
            f13 = B.k.f1285g;
        }
        float f18 = f13;
        if ((i10 & 16) != 0) {
            f14 = B.k.f1282d;
        }
        return new C1052g(f15, f16, f17, f18, f14);
    }

    public static C1050e c(C1061m c1061m) {
        C1050e c1050e = c1061m.f12608K;
        if (c1050e != null) {
            return c1050e;
        }
        float f10 = B.k.f1279a;
        C1050e c1050e2 = new C1050e(ColorSchemeKt.c(c1061m, ColorSchemeKeyTokens.f12721n), ColorSchemeKt.c(c1061m, B.k.f1286h), androidx.compose.ui.graphics.H.b(0.12f, ColorSchemeKt.c(c1061m, B.k.f1281c)), androidx.compose.ui.graphics.H.b(0.38f, ColorSchemeKt.c(c1061m, B.k.f1283e)));
        c1061m.f12608K = c1050e2;
        return c1050e2;
    }

    public static C1050e d(C1061m c1061m) {
        C1050e c1050e = c1061m.f12609L;
        if (c1050e != null) {
            return c1050e;
        }
        long j = androidx.compose.ui.graphics.H.f13503k;
        float f10 = B.r.f1316a;
        C1050e c1050e2 = new C1050e(j, ColorSchemeKt.c(c1061m, ColorSchemeKeyTokens.f12721n), j, androidx.compose.ui.graphics.H.b(0.38f, ColorSchemeKt.c(c1061m, ColorSchemeKeyTokens.f12717i)));
        c1061m.f12609L = c1050e2;
        return c1050e2;
    }

    public static C1050e e(C1061m c1061m) {
        C1050e c1050e = c1061m.f12610M;
        if (c1050e != null) {
            return c1050e;
        }
        long j = androidx.compose.ui.graphics.H.f13503k;
        C1050e c1050e2 = new C1050e(j, ColorSchemeKt.c(c1061m, ColorSchemeKeyTokens.f12721n), j, androidx.compose.ui.graphics.H.b(0.38f, ColorSchemeKt.c(c1061m, ColorSchemeKeyTokens.f12717i)));
        c1061m.f12610M = c1050e2;
        return c1050e2;
    }

    public static C1050e f(long j, long j10, InterfaceC1084f interfaceC1084f) {
        long j11 = androidx.compose.ui.graphics.H.f13504l;
        return d((C1061m) interfaceC1084f.x(ColorSchemeKt.f12087a)).a(j, j10, j11, j11);
    }

    public static C1050e g(long j, long j10, InterfaceC1084f interfaceC1084f, int i10) {
        if ((i10 & 1) != 0) {
            j = androidx.compose.ui.graphics.H.f13504l;
        }
        long j11 = j;
        long j12 = androidx.compose.ui.graphics.H.f13504l;
        return e((C1061m) interfaceC1084f.x(ColorSchemeKt.f12087a)).a(j11, j10, j12, j12);
    }
}
