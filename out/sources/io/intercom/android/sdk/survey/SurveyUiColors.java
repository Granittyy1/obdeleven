package io.intercom.android.sdk.survey;

import C4.v;
import androidx.compose.ui.graphics.H;
import io.intercom.android.sdk.utilities.ColorExtensionsKt;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: SurveyViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class SurveyUiColors {
    public static final int $stable = 0;
    private final long background;
    private final long button;
    private final H dropDownSelectedColor;
    private final long onBackground;
    private final long onButton;

    public /* synthetic */ SurveyUiColors(long j, long j10, long j11, long j12, H h8, e eVar) {
        this(j, j10, j11, j12, h8);
    }

    /* JADX INFO: renamed from: component1-0d7_KjU, reason: not valid java name */
    public final long m350component10d7_KjU() {
        return this.background;
    }

    /* JADX INFO: renamed from: component2-0d7_KjU, reason: not valid java name */
    public final long m351component20d7_KjU() {
        return this.onBackground;
    }

    /* JADX INFO: renamed from: component3-0d7_KjU, reason: not valid java name */
    public final long m352component30d7_KjU() {
        return this.button;
    }

    /* JADX INFO: renamed from: component4-0d7_KjU, reason: not valid java name */
    public final long m353component40d7_KjU() {
        return this.onButton;
    }

    /* JADX INFO: renamed from: component5-QN2ZGVo, reason: not valid java name */
    public final H m354component5QN2ZGVo() {
        return this.dropDownSelectedColor;
    }

    /* JADX INFO: renamed from: copy-qa9m3tE, reason: not valid java name */
    public final SurveyUiColors m355copyqa9m3tE(long j, long j10, long j11, long j12, H h8) {
        return new SurveyUiColors(j, j10, j11, j12, h8, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SurveyUiColors)) {
            return false;
        }
        SurveyUiColors surveyUiColors = (SurveyUiColors) obj;
        return H.c(this.background, surveyUiColors.background) && H.c(this.onBackground, surveyUiColors.onBackground) && H.c(this.button, surveyUiColors.button) && H.c(this.onButton, surveyUiColors.onButton) && i.a(this.dropDownSelectedColor, surveyUiColors.dropDownSelectedColor);
    }

    /* JADX INFO: renamed from: getBackground-0d7_KjU, reason: not valid java name */
    public final long m356getBackground0d7_KjU() {
        return this.background;
    }

    /* JADX INFO: renamed from: getButton-0d7_KjU, reason: not valid java name */
    public final long m357getButton0d7_KjU() {
        return this.button;
    }

    /* JADX INFO: renamed from: getButtonBorder-0d7_KjU, reason: not valid java name */
    public final long m358getButtonBorder0d7_KjU() {
        return ColorExtensionsKt.m664isDarkColor8_81llA(this.button) ? ColorExtensionsKt.m667lighten8_81llA(this.button) : ColorExtensionsKt.m657darken8_81llA(this.button);
    }

    /* JADX INFO: renamed from: getDropDownSelectedColor-QN2ZGVo, reason: not valid java name */
    public final H m359getDropDownSelectedColorQN2ZGVo() {
        return this.dropDownSelectedColor;
    }

    /* JADX INFO: renamed from: getOnBackground-0d7_KjU, reason: not valid java name */
    public final long m360getOnBackground0d7_KjU() {
        return this.onBackground;
    }

    /* JADX INFO: renamed from: getOnButton-0d7_KjU, reason: not valid java name */
    public final long m361getOnButton0d7_KjU() {
        return this.onButton;
    }

    public int hashCode() {
        long j = this.background;
        int i10 = H.f13505m;
        int iC = C4.b.c(this.onButton, C4.b.c(this.button, C4.b.c(this.onBackground, Long.hashCode(j) * 31, 31), 31), 31);
        H h8 = this.dropDownSelectedColor;
        return iC + (h8 == null ? 0 : Long.hashCode(h8.f13506a));
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("SurveyUiColors(background=");
        v.h(this.background, ", onBackground=", sb2);
        v.h(this.onBackground, ", button=", sb2);
        v.h(this.button, ", onButton=", sb2);
        v.h(this.onButton, ", dropDownSelectedColor=", sb2);
        sb2.append(this.dropDownSelectedColor);
        sb2.append(')');
        return sb2.toString();
    }

    private SurveyUiColors(long j, long j10, long j11, long j12, H h8) {
        this.background = j;
        this.onBackground = j10;
        this.button = j11;
        this.onButton = j12;
        this.dropDownSelectedColor = h8;
    }

    public /* synthetic */ SurveyUiColors(long j, long j10, long j11, long j12, H h8, int i10, e eVar) {
        this(j, j10, j11, j12, (i10 & 16) != 0 ? null : h8, null);
    }
}
