package io.intercom.android.sdk.ui.theme;

import B.E;
import androidx.compose.material3.q0;
import androidx.compose.runtime.AbstractC1099m0;
import androidx.compose.runtime.O0;
import androidx.compose.ui.text.F;
import androidx.compose.ui.text.font.l;
import io.intercom.android.sdk.m5.conversation.ui.components.C2382t;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: IntercomTypography.kt */
/* JADX INFO: loaded from: classes.dex */
public final class IntercomTypographyKt {
    private static final AbstractC1099m0<IntercomTypography> LocalIntercomTypography = new O0(new C2382t(1));

    public static final IntercomTypography defaultIntercomTypography() {
        F f10 = new F(0L, G0.a.g(32), l.j, 0L, 0, G0.a.g(48), 16646137);
        long jG = G0.a.g(28);
        long jG2 = G0.a.g(32);
        l lVar = l.f15444i;
        F f11 = new F(0L, jG, lVar, 0L, 0, jG2, 16646137);
        F f12 = new F(0L, G0.a.g(20), lVar, 0L, 0, G0.a.g(24), 16646137);
        long jG3 = G0.a.g(16);
        long jG4 = G0.a.g(20);
        l lVar2 = l.f15442g;
        return new IntercomTypography(f10, f11, f12, new F(0L, jG3, lVar2, 0L, 0, jG4, 16646137), new F(0L, G0.a.g(16), lVar, 0L, 0, G0.a.g(20), 16646137), new F(0L, G0.a.g(14), lVar2, 0L, 0, G0.a.g(18), 16646137), new F(0L, G0.a.g(12), lVar2, 0L, 0, G0.a.g(18), 16646137));
    }

    public static final AbstractC1099m0<IntercomTypography> getLocalIntercomTypography() {
        return LocalIntercomTypography;
    }

    public static final q0 toMaterialTypography(IntercomTypography intercomTypography) {
        F f10;
        F f11;
        F f12;
        F f13;
        F f14;
        F f15;
        F f16;
        F f17;
        F f18;
        F f19;
        F f20;
        i.e(intercomTypography, "<this>");
        F f21 = null;
        if ((32767 & 1) != 0) {
            F f22 = E.f1153a;
            f10 = E.f1156d;
        } else {
            f10 = null;
        }
        if ((32767 & 2) != 0) {
            F f23 = E.f1153a;
            f11 = E.f1157e;
        } else {
            f11 = null;
        }
        if ((32767 & 4) != 0) {
            F f24 = E.f1153a;
            f12 = E.f1158f;
        } else {
            f12 = null;
        }
        if ((32767 & 8) != 0) {
            F f25 = E.f1153a;
            f13 = E.f1159g;
        } else {
            f13 = null;
        }
        if ((32767 & 16) != 0) {
            F f26 = E.f1153a;
            f14 = E.f1160h;
        } else {
            f14 = null;
        }
        if ((32767 & 32) != 0) {
            F f27 = E.f1153a;
            f15 = E.f1161i;
        } else {
            f15 = null;
        }
        if ((32767 & 64) != 0) {
            F f28 = E.f1153a;
            f16 = E.f1164m;
        } else {
            f16 = null;
        }
        if ((32767 & 128) != 0) {
            F f29 = E.f1153a;
            f17 = E.f1165n;
        } else {
            f17 = null;
        }
        if ((32767 & 256) != 0) {
            F f30 = E.f1153a;
            f18 = E.f1166o;
        } else {
            f18 = null;
        }
        if ((32767 & 512) != 0) {
            F f31 = E.f1153a;
            F f32 = E.f1153a;
        }
        if ((32767 & 1024) != 0) {
            F f33 = E.f1153a;
            F f34 = E.f1153a;
        }
        if ((32767 & 2048) != 0) {
            F f35 = E.f1153a;
            f19 = E.f1155c;
        } else {
            f19 = null;
        }
        if ((32767 & 4096) != 0) {
            F f36 = E.f1153a;
            f20 = E.j;
        } else {
            f20 = null;
        }
        if ((32767 & 8192) != 0) {
            F f37 = E.f1153a;
            F f38 = E.f1153a;
        }
        if ((32767 & 16384) != 0) {
            F f39 = E.f1153a;
            f21 = E.f1163l;
        }
        return new q0(f10, f11, f12, f13, f14, f15, f16, f17, f18, intercomTypography.getType04(), intercomTypography.getType04Point5(), f19, f20, intercomTypography.getType05(), f21);
    }
}
