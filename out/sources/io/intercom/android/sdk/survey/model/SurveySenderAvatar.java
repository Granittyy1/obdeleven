package io.intercom.android.sdk.survey.model;

import I7.b;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: SurveyData.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class SurveySenderAvatar {
    public static final int $stable = 0;

    @b("square_128")
    private final String squareImg128;

    /* JADX WARN: Multi-variable type inference failed */
    public SurveySenderAvatar() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ SurveySenderAvatar copy$default(SurveySenderAvatar surveySenderAvatar, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = surveySenderAvatar.squareImg128;
        }
        return surveySenderAvatar.copy(str);
    }

    public final String component1() {
        return this.squareImg128;
    }

    public final SurveySenderAvatar copy(String squareImg128) {
        i.e(squareImg128, "squareImg128");
        return new SurveySenderAvatar(squareImg128);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SurveySenderAvatar) && i.a(this.squareImg128, ((SurveySenderAvatar) obj).squareImg128);
    }

    public final String getSquareImg128() {
        return this.squareImg128;
    }

    public int hashCode() {
        return this.squareImg128.hashCode();
    }

    public String toString() {
        return B7.b.g(new StringBuilder("SurveySenderAvatar(squareImg128="), this.squareImg128, ')');
    }

    public SurveySenderAvatar(String squareImg128) {
        i.e(squareImg128, "squareImg128");
        this.squareImg128 = squareImg128;
    }

    public /* synthetic */ SurveySenderAvatar(String str, int i10, e eVar) {
        this((i10 & 1) != 0 ? "" : str);
    }
}
