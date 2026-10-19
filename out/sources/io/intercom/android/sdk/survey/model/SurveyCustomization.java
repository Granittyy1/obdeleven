package io.intercom.android.sdk.survey.model;

import I7.b;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: SurveyData.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class SurveyCustomization {
    public static final int $stable = 0;

    @b("background_color")
    private final String backgroundColor;

    @b("button_color")
    private final String buttonColor;

    /* JADX WARN: Multi-variable type inference failed */
    public SurveyCustomization() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ SurveyCustomization copy$default(SurveyCustomization surveyCustomization, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = surveyCustomization.backgroundColor;
        }
        if ((i10 & 2) != 0) {
            str2 = surveyCustomization.buttonColor;
        }
        return surveyCustomization.copy(str, str2);
    }

    public final String component1() {
        return this.backgroundColor;
    }

    public final String component2() {
        return this.buttonColor;
    }

    public final SurveyCustomization copy(String backgroundColor, String buttonColor) {
        i.e(backgroundColor, "backgroundColor");
        i.e(buttonColor, "buttonColor");
        return new SurveyCustomization(backgroundColor, buttonColor);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SurveyCustomization)) {
            return false;
        }
        SurveyCustomization surveyCustomization = (SurveyCustomization) obj;
        return i.a(this.backgroundColor, surveyCustomization.backgroundColor) && i.a(this.buttonColor, surveyCustomization.buttonColor);
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final String getButtonColor() {
        return this.buttonColor;
    }

    public int hashCode() {
        return this.buttonColor.hashCode() + (this.backgroundColor.hashCode() * 31);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("SurveyCustomization(backgroundColor=");
        sb2.append(this.backgroundColor);
        sb2.append(", buttonColor=");
        return B7.b.g(sb2, this.buttonColor, ')');
    }

    public SurveyCustomization(String backgroundColor, String buttonColor) {
        i.e(backgroundColor, "backgroundColor");
        i.e(buttonColor, "buttonColor");
        this.backgroundColor = backgroundColor;
        this.buttonColor = buttonColor;
    }

    public /* synthetic */ SurveyCustomization(String str, String str2, int i10, e eVar) {
        this((i10 & 1) != 0 ? "#FFFFFF" : str, (i10 & 2) != 0 ? "#000000" : str2);
    }
}
