package io.intercom.android.sdk.tickets;

import A1.C0575j;
import C4.v;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.ui.graphics.H;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: TicketDetailState.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class TicketTimelineCardState {
    public static final int $stable = 8;
    private final List<AvatarWrapper> adminAvatars;
    private final long progressColor;
    private final List<ProgressSection> progressSections;
    private final String statusLabel;
    private final String statusSubtitle;
    private final String statusTitle;
    private final Long timestamp;

    /* JADX INFO: compiled from: TicketDetailState.kt */
    @p293xa.d
    public static abstract class ActualStringOrRes {
        public static final int $stable = 0;

        /* JADX INFO: compiled from: TicketDetailState.kt */
        public static final class ActualString extends ActualStringOrRes {
            public static final int $stable = 0;
            private final String string;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ActualString(String string) {
                super(null);
                kotlin.jvm.internal.i.e(string, "string");
                this.string = string;
            }

            public static /* synthetic */ ActualString copy$default(ActualString actualString, String str, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = actualString.string;
                }
                return actualString.copy(str);
            }

            public final String component1() {
                return this.string;
            }

            public final ActualString copy(String string) {
                kotlin.jvm.internal.i.e(string, "string");
                return new ActualString(string);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ActualString) && kotlin.jvm.internal.i.a(this.string, ((ActualString) obj).string);
            }

            public final String getString() {
                return this.string;
            }

            public int hashCode() {
                return this.string.hashCode();
            }

            public String toString() {
                return B7.b.g(new StringBuilder("ActualString(string="), this.string, ')');
            }
        }

        /* JADX INFO: compiled from: TicketDetailState.kt */
        public static final class StringRes extends ActualStringOrRes {
            public static final int $stable = 0;
            private final int stringRes;

            public StringRes(int i10) {
                super(null);
                this.stringRes = i10;
            }

            public static /* synthetic */ StringRes copy$default(StringRes stringRes, int i10, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    i10 = stringRes.stringRes;
                }
                return stringRes.copy(i10);
            }

            public final int component1() {
                return this.stringRes;
            }

            public final StringRes copy(int i10) {
                return new StringRes(i10);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof StringRes) && this.stringRes == ((StringRes) obj).stringRes;
            }

            public final int getStringRes() {
                return this.stringRes;
            }

            public int hashCode() {
                return Integer.hashCode(this.stringRes);
            }

            public String toString() {
                return C0575j.b(new StringBuilder("StringRes(stringRes="), this.stringRes, ')');
            }
        }

        public /* synthetic */ ActualStringOrRes(kotlin.jvm.internal.e eVar) {
            this();
        }

        public final String getText(InterfaceC1084f interfaceC1084f, int i10) {
            String strP;
            interfaceC1084f.L(796462681);
            if (this instanceof ActualString) {
                strP = ((ActualString) this).getString();
            } else {
                if (!(this instanceof StringRes)) {
                    throw new NoWhenBranchMatchedException();
                }
                strP = S4.o.p(interfaceC1084f, ((StringRes) this).getStringRes());
            }
            interfaceC1084f.D();
            return strP;
        }

        private ActualStringOrRes() {
        }
    }

    /* JADX INFO: compiled from: TicketDetailState.kt */
    public static final class ProgressSection {
        public static final int $stable = 0;
        private final boolean isDone;
        private final boolean isLoading;

        public ProgressSection(boolean z10, boolean z11) {
            this.isDone = z10;
            this.isLoading = z11;
        }

        public static /* synthetic */ ProgressSection copy$default(ProgressSection progressSection, boolean z10, boolean z11, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                z10 = progressSection.isDone;
            }
            if ((i10 & 2) != 0) {
                z11 = progressSection.isLoading;
            }
            return progressSection.copy(z10, z11);
        }

        public final boolean component1() {
            return this.isDone;
        }

        public final boolean component2() {
            return this.isLoading;
        }

        public final ProgressSection copy(boolean z10, boolean z11) {
            return new ProgressSection(z10, z11);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ProgressSection)) {
                return false;
            }
            ProgressSection progressSection = (ProgressSection) obj;
            return this.isDone == progressSection.isDone && this.isLoading == progressSection.isLoading;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isLoading) + (Boolean.hashCode(this.isDone) * 31);
        }

        public final boolean isDone() {
            return this.isDone;
        }

        public final boolean isLoading() {
            return this.isLoading;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("ProgressSection(isDone=");
            sb2.append(this.isDone);
            sb2.append(", isLoading=");
            return Z3.o.d(sb2, this.isLoading, ')');
        }
    }

    public /* synthetic */ TicketTimelineCardState(List list, String str, String str2, long j, List list2, String str3, Long l10, kotlin.jvm.internal.e eVar) {
        this(list, str, str2, j, list2, str3, l10);
    }

    public final List<AvatarWrapper> component1() {
        return this.adminAvatars;
    }

    public final String component2() {
        return this.statusTitle;
    }

    public final String component3() {
        return this.statusSubtitle;
    }

    /* JADX INFO: renamed from: component4-0d7_KjU, reason: not valid java name */
    public final long m479component40d7_KjU() {
        return this.progressColor;
    }

    public final List<ProgressSection> component5() {
        return this.progressSections;
    }

    public final String component6() {
        return this.statusLabel;
    }

    public final Long component7() {
        return this.timestamp;
    }

    /* JADX INFO: renamed from: copy-ww6aTOc, reason: not valid java name */
    public final TicketTimelineCardState m480copyww6aTOc(List<AvatarWrapper> adminAvatars, String statusTitle, String statusSubtitle, long j, List<ProgressSection> progressSections, String statusLabel, Long l10) {
        kotlin.jvm.internal.i.e(adminAvatars, "adminAvatars");
        kotlin.jvm.internal.i.e(statusTitle, "statusTitle");
        kotlin.jvm.internal.i.e(statusSubtitle, "statusSubtitle");
        kotlin.jvm.internal.i.e(progressSections, "progressSections");
        kotlin.jvm.internal.i.e(statusLabel, "statusLabel");
        return new TicketTimelineCardState(adminAvatars, statusTitle, statusSubtitle, j, progressSections, statusLabel, l10, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TicketTimelineCardState)) {
            return false;
        }
        TicketTimelineCardState ticketTimelineCardState = (TicketTimelineCardState) obj;
        return kotlin.jvm.internal.i.a(this.adminAvatars, ticketTimelineCardState.adminAvatars) && kotlin.jvm.internal.i.a(this.statusTitle, ticketTimelineCardState.statusTitle) && kotlin.jvm.internal.i.a(this.statusSubtitle, ticketTimelineCardState.statusSubtitle) && H.c(this.progressColor, ticketTimelineCardState.progressColor) && kotlin.jvm.internal.i.a(this.progressSections, ticketTimelineCardState.progressSections) && kotlin.jvm.internal.i.a(this.statusLabel, ticketTimelineCardState.statusLabel) && kotlin.jvm.internal.i.a(this.timestamp, ticketTimelineCardState.timestamp);
    }

    public final List<AvatarWrapper> getAdminAvatars() {
        return this.adminAvatars;
    }

    /* JADX INFO: renamed from: getProgressColor-0d7_KjU, reason: not valid java name */
    public final long m481getProgressColor0d7_KjU() {
        return this.progressColor;
    }

    public final List<ProgressSection> getProgressSections() {
        return this.progressSections;
    }

    public final String getStatusLabel() {
        return this.statusLabel;
    }

    public final String getStatusSubtitle() {
        return this.statusSubtitle;
    }

    public final String getStatusTitle() {
        return this.statusTitle;
    }

    public final Long getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        int iB = B1.a.b(this.statusSubtitle, B1.a.b(this.statusTitle, this.adminAvatars.hashCode() * 31, 31), 31);
        long j = this.progressColor;
        int i10 = H.f13505m;
        int iB2 = B1.a.b(this.statusLabel, p005a4.p.d(C4.b.c(j, iB, 31), 31, this.progressSections), 31);
        Long l10 = this.timestamp;
        return iB2 + (l10 == null ? 0 : l10.hashCode());
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("TicketTimelineCardState(adminAvatars=");
        sb2.append(this.adminAvatars);
        sb2.append(", statusTitle=");
        sb2.append(this.statusTitle);
        sb2.append(", statusSubtitle=");
        sb2.append(this.statusSubtitle);
        sb2.append(", progressColor=");
        v.h(this.progressColor, ", progressSections=", sb2);
        sb2.append(this.progressSections);
        sb2.append(", statusLabel=");
        sb2.append(this.statusLabel);
        sb2.append(", timestamp=");
        sb2.append(this.timestamp);
        sb2.append(')');
        return sb2.toString();
    }

    private TicketTimelineCardState(List<AvatarWrapper> adminAvatars, String statusTitle, String statusSubtitle, long j, List<ProgressSection> progressSections, String statusLabel, Long l10) {
        kotlin.jvm.internal.i.e(adminAvatars, "adminAvatars");
        kotlin.jvm.internal.i.e(statusTitle, "statusTitle");
        kotlin.jvm.internal.i.e(statusSubtitle, "statusSubtitle");
        kotlin.jvm.internal.i.e(progressSections, "progressSections");
        kotlin.jvm.internal.i.e(statusLabel, "statusLabel");
        this.adminAvatars = adminAvatars;
        this.statusTitle = statusTitle;
        this.statusSubtitle = statusSubtitle;
        this.progressColor = j;
        this.progressSections = progressSections;
        this.statusLabel = statusLabel;
        this.timestamp = l10;
    }
}
