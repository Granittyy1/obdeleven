package io.intercom.android.sdk.ui.common;

import androidx.compose.ui.graphics.H;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: IntercomTopBarState.kt */
/* JADX INFO: loaded from: classes.dex */
public final class IntercomTopBarState {
    public static final int $stable = 0;
    private final H backgroundColor;
    private final H contentColor;
    private final Integer navIcon;
    private final String subTitle;
    private final H subTitleColor;
    private final String title;

    public /* synthetic */ IntercomTopBarState(Integer num, String str, String str2, H h8, H h10, H h11, e eVar) {
        this(num, str, str2, h8, h10, h11);
    }

    /* JADX INFO: renamed from: copy-K74yeK8$default, reason: not valid java name */
    public static /* synthetic */ IntercomTopBarState m498copyK74yeK8$default(IntercomTopBarState intercomTopBarState, Integer num, String str, String str2, H h8, H h10, H h11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            num = intercomTopBarState.navIcon;
        }
        if ((i10 & 2) != 0) {
            str = intercomTopBarState.title;
        }
        String str3 = str;
        if ((i10 & 4) != 0) {
            str2 = intercomTopBarState.subTitle;
        }
        String str4 = str2;
        if ((i10 & 8) != 0) {
            h8 = intercomTopBarState.backgroundColor;
        }
        H h12 = h8;
        if ((i10 & 16) != 0) {
            h10 = intercomTopBarState.contentColor;
        }
        H h13 = h10;
        if ((i10 & 32) != 0) {
            h11 = intercomTopBarState.subTitleColor;
        }
        return intercomTopBarState.m502copyK74yeK8(num, str3, str4, h12, h13, h11);
    }

    public final Integer component1() {
        return this.navIcon;
    }

    public final String component2() {
        return this.title;
    }

    public final String component3() {
        return this.subTitle;
    }

    /* JADX INFO: renamed from: component4-QN2ZGVo, reason: not valid java name */
    public final H m499component4QN2ZGVo() {
        return this.backgroundColor;
    }

    /* JADX INFO: renamed from: component5-QN2ZGVo, reason: not valid java name */
    public final H m500component5QN2ZGVo() {
        return this.contentColor;
    }

    /* JADX INFO: renamed from: component6-QN2ZGVo, reason: not valid java name */
    public final H m501component6QN2ZGVo() {
        return this.subTitleColor;
    }

    /* JADX INFO: renamed from: copy-K74yeK8, reason: not valid java name */
    public final IntercomTopBarState m502copyK74yeK8(Integer num, String str, String str2, H h8, H h10, H h11) {
        return new IntercomTopBarState(num, str, str2, h8, h10, h11, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IntercomTopBarState)) {
            return false;
        }
        IntercomTopBarState intercomTopBarState = (IntercomTopBarState) obj;
        return i.a(this.navIcon, intercomTopBarState.navIcon) && i.a(this.title, intercomTopBarState.title) && i.a(this.subTitle, intercomTopBarState.subTitle) && i.a(this.backgroundColor, intercomTopBarState.backgroundColor) && i.a(this.contentColor, intercomTopBarState.contentColor) && i.a(this.subTitleColor, intercomTopBarState.subTitleColor);
    }

    /* JADX INFO: renamed from: getBackgroundColor-QN2ZGVo, reason: not valid java name */
    public final H m503getBackgroundColorQN2ZGVo() {
        return this.backgroundColor;
    }

    /* JADX INFO: renamed from: getContentColor-QN2ZGVo, reason: not valid java name */
    public final H m504getContentColorQN2ZGVo() {
        return this.contentColor;
    }

    public final Integer getNavIcon() {
        return this.navIcon;
    }

    public final String getSubTitle() {
        return this.subTitle;
    }

    /* JADX INFO: renamed from: getSubTitleColor-QN2ZGVo, reason: not valid java name */
    public final H m505getSubTitleColorQN2ZGVo() {
        return this.subTitleColor;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        Integer num = this.navIcon;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.title;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.subTitle;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        H h8 = this.backgroundColor;
        int iHashCode4 = (iHashCode3 + (h8 == null ? 0 : Long.hashCode(h8.f13506a))) * 31;
        H h10 = this.contentColor;
        int iHashCode5 = (iHashCode4 + (h10 == null ? 0 : Long.hashCode(h10.f13506a))) * 31;
        H h11 = this.subTitleColor;
        return iHashCode5 + (h11 != null ? Long.hashCode(h11.f13506a) : 0);
    }

    public String toString() {
        return "IntercomTopBarState(navIcon=" + this.navIcon + ", title=" + this.title + ", subTitle=" + this.subTitle + ", backgroundColor=" + this.backgroundColor + ", contentColor=" + this.contentColor + ", subTitleColor=" + this.subTitleColor + ')';
    }

    private IntercomTopBarState(Integer num, String str, String str2, H h8, H h10, H h11) {
        this.navIcon = num;
        this.title = str;
        this.subTitle = str2;
        this.backgroundColor = h8;
        this.contentColor = h10;
        this.subTitleColor = h11;
    }

    public /* synthetic */ IntercomTopBarState(Integer num, String str, String str2, H h8, H h10, H h11, int i10, e eVar) {
        this((i10 & 1) != 0 ? null : num, (i10 & 2) != 0 ? null : str, (i10 & 4) != 0 ? null : str2, (i10 & 8) != 0 ? null : h8, (i10 & 16) != 0 ? null : h10, (i10 & 32) == 0 ? h11 : null, null);
    }
}
