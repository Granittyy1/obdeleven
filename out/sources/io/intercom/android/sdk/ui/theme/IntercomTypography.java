package io.intercom.android.sdk.ui.theme;

import C4.v;
import androidx.compose.ui.text.F;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: IntercomTypography.kt */
/* JADX INFO: loaded from: classes.dex */
public final class IntercomTypography {
    public static final int $stable = 0;
    private final F type01;
    private final F type02;
    private final F type03;
    private final F type04;
    private final F type04Point5;
    private final F type04SemiBold;
    private final F type05;

    public IntercomTypography(F type01, F type02, F type03, F type04, F type04SemiBold, F type04Point5, F type05) {
        i.e(type01, "type01");
        i.e(type02, "type02");
        i.e(type03, "type03");
        i.e(type04, "type04");
        i.e(type04SemiBold, "type04SemiBold");
        i.e(type04Point5, "type04Point5");
        i.e(type05, "type05");
        this.type01 = type01;
        this.type02 = type02;
        this.type03 = type03;
        this.type04 = type04;
        this.type04SemiBold = type04SemiBold;
        this.type04Point5 = type04Point5;
        this.type05 = type05;
    }

    public static /* synthetic */ IntercomTypography copy$default(IntercomTypography intercomTypography, F f10, F f11, F f12, F f13, F f14, F f15, F f16, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = intercomTypography.type01;
        }
        if ((i10 & 2) != 0) {
            f11 = intercomTypography.type02;
        }
        F f17 = f11;
        if ((i10 & 4) != 0) {
            f12 = intercomTypography.type03;
        }
        F f18 = f12;
        if ((i10 & 8) != 0) {
            f13 = intercomTypography.type04;
        }
        F f19 = f13;
        if ((i10 & 16) != 0) {
            f14 = intercomTypography.type04SemiBold;
        }
        F f20 = f14;
        if ((i10 & 32) != 0) {
            f15 = intercomTypography.type04Point5;
        }
        F f21 = f15;
        if ((i10 & 64) != 0) {
            f16 = intercomTypography.type05;
        }
        return intercomTypography.copy(f10, f17, f18, f19, f20, f21, f16);
    }

    public final F component1() {
        return this.type01;
    }

    public final F component2() {
        return this.type02;
    }

    public final F component3() {
        return this.type03;
    }

    public final F component4() {
        return this.type04;
    }

    public final F component5() {
        return this.type04SemiBold;
    }

    public final F component6() {
        return this.type04Point5;
    }

    public final F component7() {
        return this.type05;
    }

    public final IntercomTypography copy(F type01, F type02, F type03, F type04, F type04SemiBold, F type04Point5, F type05) {
        i.e(type01, "type01");
        i.e(type02, "type02");
        i.e(type03, "type03");
        i.e(type04, "type04");
        i.e(type04SemiBold, "type04SemiBold");
        i.e(type04Point5, "type04Point5");
        i.e(type05, "type05");
        return new IntercomTypography(type01, type02, type03, type04, type04SemiBold, type04Point5, type05);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IntercomTypography)) {
            return false;
        }
        IntercomTypography intercomTypography = (IntercomTypography) obj;
        return i.a(this.type01, intercomTypography.type01) && i.a(this.type02, intercomTypography.type02) && i.a(this.type03, intercomTypography.type03) && i.a(this.type04, intercomTypography.type04) && i.a(this.type04SemiBold, intercomTypography.type04SemiBold) && i.a(this.type04Point5, intercomTypography.type04Point5) && i.a(this.type05, intercomTypography.type05);
    }

    public final F getType01() {
        return this.type01;
    }

    public final F getType02() {
        return this.type02;
    }

    public final F getType03() {
        return this.type03;
    }

    public final F getType04() {
        return this.type04;
    }

    public final F getType04Point5() {
        return this.type04Point5;
    }

    public final F getType04SemiBold() {
        return this.type04SemiBold;
    }

    public final F getType05() {
        return this.type05;
    }

    public int hashCode() {
        return this.type05.hashCode() + v.c(v.c(v.c(v.c(v.c(this.type01.hashCode() * 31, 31, this.type02), 31, this.type03), 31, this.type04), 31, this.type04SemiBold), 31, this.type04Point5);
    }

    public String toString() {
        return "IntercomTypography(type01=" + this.type01 + ", type02=" + this.type02 + ", type03=" + this.type03 + ", type04=" + this.type04 + ", type04SemiBold=" + this.type04SemiBold + ", type04Point5=" + this.type04Point5 + ", type05=" + this.type05 + ')';
    }
}
