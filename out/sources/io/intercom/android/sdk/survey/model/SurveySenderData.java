package io.intercom.android.sdk.survey.model;

import I7.b;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: SurveyData.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class SurveySenderData {
    public static final int $stable = 0;

    @b("avatar")
    private final SurveySenderAvatar avatar;

    @b("first_name")
    private final String firstName;

    @b("initial")
    private final String initials;

    @b("name")
    private final String name;

    public SurveySenderData() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ SurveySenderData copy$default(SurveySenderData surveySenderData, String str, String str2, String str3, SurveySenderAvatar surveySenderAvatar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = surveySenderData.firstName;
        }
        if ((i10 & 2) != 0) {
            str2 = surveySenderData.name;
        }
        if ((i10 & 4) != 0) {
            str3 = surveySenderData.initials;
        }
        if ((i10 & 8) != 0) {
            surveySenderAvatar = surveySenderData.avatar;
        }
        return surveySenderData.copy(str, str2, str3, surveySenderAvatar);
    }

    public final String component1() {
        return this.firstName;
    }

    public final String component2() {
        return this.name;
    }

    public final String component3() {
        return this.initials;
    }

    public final SurveySenderAvatar component4() {
        return this.avatar;
    }

    public final SurveySenderData copy(String str, String str2, String str3, SurveySenderAvatar surveySenderAvatar) {
        return new SurveySenderData(str, str2, str3, surveySenderAvatar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SurveySenderData)) {
            return false;
        }
        SurveySenderData surveySenderData = (SurveySenderData) obj;
        return i.a(this.firstName, surveySenderData.firstName) && i.a(this.name, surveySenderData.name) && i.a(this.initials, surveySenderData.initials) && i.a(this.avatar, surveySenderData.avatar);
    }

    public final SurveySenderAvatar getAvatar() {
        return this.avatar;
    }

    public final String getFirstName() {
        return this.firstName;
    }

    public final String getInitials() {
        return this.initials;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        String str = this.firstName;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.name;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.initials;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        SurveySenderAvatar surveySenderAvatar = this.avatar;
        return iHashCode3 + (surveySenderAvatar != null ? surveySenderAvatar.hashCode() : 0);
    }

    public String toString() {
        return "SurveySenderData(firstName=" + this.firstName + ", name=" + this.name + ", initials=" + this.initials + ", avatar=" + this.avatar + ')';
    }

    public SurveySenderData(String str, String str2, String str3, SurveySenderAvatar surveySenderAvatar) {
        this.firstName = str;
        this.name = str2;
        this.initials = str3;
        this.avatar = surveySenderAvatar;
    }

    public /* synthetic */ SurveySenderData(String str, String str2, String str3, SurveySenderAvatar surveySenderAvatar, int i10, e eVar) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? null : surveySenderAvatar);
    }
}
