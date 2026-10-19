package io.intercom.android.sdk.survey;

import androidx.compose.animation.D;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.models.Avatar;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: SurveyViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
public abstract class TopBarState {
    public static final int $stable = 0;

    public /* synthetic */ TopBarState(e eVar) {
        this();
    }

    public abstract TopBarState enableDismissButton();

    public abstract ProgressBarState getProgressBarState();

    public abstract boolean getShowDismissButton();

    public abstract SurveyUiColors getSurveyUiColors();

    public abstract TopBarState withProgressBarState(ProgressBarState progressBarState);

    /* JADX INFO: compiled from: SurveyViewModel.kt */
    public static final class NoTopBarState extends TopBarState {
        public static final int $stable = 0;
        private final ProgressBarState progressBarState;
        private final boolean showDismissButton;
        private final SurveyUiColors surveyUiColors;

        public /* synthetic */ NoTopBarState(boolean z10, SurveyUiColors surveyUiColors, ProgressBarState progressBarState, int i10, e eVar) {
            if ((i10 & 4) != 0) {
                progressBarState = new ProgressBarState(false, 0.0f, 3, null);
            }
            this(z10, surveyUiColors, progressBarState);
        }

        public static /* synthetic */ NoTopBarState copy$default(NoTopBarState noTopBarState, boolean z10, SurveyUiColors surveyUiColors, ProgressBarState progressBarState, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                z10 = noTopBarState.showDismissButton;
            }
            if ((i10 & 2) != 0) {
                surveyUiColors = noTopBarState.surveyUiColors;
            }
            if ((i10 & 4) != 0) {
                progressBarState = noTopBarState.progressBarState;
            }
            return noTopBarState.copy(z10, surveyUiColors, progressBarState);
        }

        public final boolean component1() {
            return this.showDismissButton;
        }

        public final SurveyUiColors component2() {
            return this.surveyUiColors;
        }

        public final ProgressBarState component3() {
            return this.progressBarState;
        }

        public final NoTopBarState copy(boolean z10, SurveyUiColors surveyUiColors, ProgressBarState progressBarState) {
            i.e(surveyUiColors, "surveyUiColors");
            i.e(progressBarState, "progressBarState");
            return new NoTopBarState(z10, surveyUiColors, progressBarState);
        }

        @Override // io.intercom.android.sdk.survey.TopBarState
        public TopBarState enableDismissButton() {
            return copy$default(this, true, null, null, 6, null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NoTopBarState)) {
                return false;
            }
            NoTopBarState noTopBarState = (NoTopBarState) obj;
            return this.showDismissButton == noTopBarState.showDismissButton && i.a(this.surveyUiColors, noTopBarState.surveyUiColors) && i.a(this.progressBarState, noTopBarState.progressBarState);
        }

        @Override // io.intercom.android.sdk.survey.TopBarState
        public ProgressBarState getProgressBarState() {
            return this.progressBarState;
        }

        @Override // io.intercom.android.sdk.survey.TopBarState
        public boolean getShowDismissButton() {
            return this.showDismissButton;
        }

        @Override // io.intercom.android.sdk.survey.TopBarState
        public SurveyUiColors getSurveyUiColors() {
            return this.surveyUiColors;
        }

        public int hashCode() {
            return this.progressBarState.hashCode() + ((this.surveyUiColors.hashCode() + (Boolean.hashCode(this.showDismissButton) * 31)) * 31);
        }

        public String toString() {
            return "NoTopBarState(showDismissButton=" + this.showDismissButton + ", surveyUiColors=" + this.surveyUiColors + ", progressBarState=" + this.progressBarState + ')';
        }

        @Override // io.intercom.android.sdk.survey.TopBarState
        public TopBarState withProgressBarState(ProgressBarState progressBarState) {
            i.e(progressBarState, "progressBarState");
            return copy$default(this, false, null, progressBarState, 3, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NoTopBarState(boolean z10, SurveyUiColors surveyUiColors, ProgressBarState progressBarState) {
            super(null);
            i.e(surveyUiColors, "surveyUiColors");
            i.e(progressBarState, "progressBarState");
            this.showDismissButton = z10;
            this.surveyUiColors = surveyUiColors;
            this.progressBarState = progressBarState;
        }
    }

    /* JADX INFO: compiled from: SurveyViewModel.kt */
    public static final class SenderTopBarState extends TopBarState {
        public static final int $stable = 8;
        private final AppConfig appConfig;
        private final Avatar avatar;
        private final ProgressBarState progressBarState;
        private final String senderName;
        private final boolean showDismissButton;
        private final SurveyUiColors surveyUiColors;

        public /* synthetic */ SenderTopBarState(Avatar avatar, String str, AppConfig appConfig, boolean z10, SurveyUiColors surveyUiColors, ProgressBarState progressBarState, int i10, e eVar) {
            ProgressBarState progressBarState2;
            if ((i10 & 32) != 0) {
                progressBarState2 = new ProgressBarState(false, 0.0f, 3, null);
            } else {
                progressBarState2 = progressBarState;
            }
            this(avatar, str, appConfig, z10, surveyUiColors, progressBarState2);
        }

        public static /* synthetic */ SenderTopBarState copy$default(SenderTopBarState senderTopBarState, Avatar avatar, String str, AppConfig appConfig, boolean z10, SurveyUiColors surveyUiColors, ProgressBarState progressBarState, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                avatar = senderTopBarState.avatar;
            }
            if ((i10 & 2) != 0) {
                str = senderTopBarState.senderName;
            }
            String str2 = str;
            if ((i10 & 4) != 0) {
                appConfig = senderTopBarState.appConfig;
            }
            AppConfig appConfig2 = appConfig;
            if ((i10 & 8) != 0) {
                z10 = senderTopBarState.showDismissButton;
            }
            boolean z11 = z10;
            if ((i10 & 16) != 0) {
                surveyUiColors = senderTopBarState.surveyUiColors;
            }
            SurveyUiColors surveyUiColors2 = surveyUiColors;
            if ((i10 & 32) != 0) {
                progressBarState = senderTopBarState.progressBarState;
            }
            return senderTopBarState.copy(avatar, str2, appConfig2, z11, surveyUiColors2, progressBarState);
        }

        public final Avatar component1() {
            return this.avatar;
        }

        public final String component2() {
            return this.senderName;
        }

        public final AppConfig component3() {
            return this.appConfig;
        }

        public final boolean component4() {
            return this.showDismissButton;
        }

        public final SurveyUiColors component5() {
            return this.surveyUiColors;
        }

        public final ProgressBarState component6() {
            return this.progressBarState;
        }

        public final SenderTopBarState copy(Avatar avatar, String senderName, AppConfig appConfig, boolean z10, SurveyUiColors surveyUiColors, ProgressBarState progressBarState) {
            i.e(avatar, "avatar");
            i.e(senderName, "senderName");
            i.e(appConfig, "appConfig");
            i.e(surveyUiColors, "surveyUiColors");
            i.e(progressBarState, "progressBarState");
            return new SenderTopBarState(avatar, senderName, appConfig, z10, surveyUiColors, progressBarState);
        }

        @Override // io.intercom.android.sdk.survey.TopBarState
        public TopBarState enableDismissButton() {
            return copy$default(this, null, null, null, true, null, null, 55, null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SenderTopBarState)) {
                return false;
            }
            SenderTopBarState senderTopBarState = (SenderTopBarState) obj;
            return i.a(this.avatar, senderTopBarState.avatar) && i.a(this.senderName, senderTopBarState.senderName) && i.a(this.appConfig, senderTopBarState.appConfig) && this.showDismissButton == senderTopBarState.showDismissButton && i.a(this.surveyUiColors, senderTopBarState.surveyUiColors) && i.a(this.progressBarState, senderTopBarState.progressBarState);
        }

        public final AppConfig getAppConfig() {
            return this.appConfig;
        }

        public final Avatar getAvatar() {
            return this.avatar;
        }

        @Override // io.intercom.android.sdk.survey.TopBarState
        public ProgressBarState getProgressBarState() {
            return this.progressBarState;
        }

        public final String getSenderName() {
            return this.senderName;
        }

        @Override // io.intercom.android.sdk.survey.TopBarState
        public boolean getShowDismissButton() {
            return this.showDismissButton;
        }

        @Override // io.intercom.android.sdk.survey.TopBarState
        public SurveyUiColors getSurveyUiColors() {
            return this.surveyUiColors;
        }

        public int hashCode() {
            return this.progressBarState.hashCode() + ((this.surveyUiColors.hashCode() + D.b((this.appConfig.hashCode() + B1.a.b(this.senderName, this.avatar.hashCode() * 31, 31)) * 31, 31, this.showDismissButton)) * 31);
        }

        public String toString() {
            return "SenderTopBarState(avatar=" + this.avatar + ", senderName=" + this.senderName + ", appConfig=" + this.appConfig + ", showDismissButton=" + this.showDismissButton + ", surveyUiColors=" + this.surveyUiColors + ", progressBarState=" + this.progressBarState + ')';
        }

        @Override // io.intercom.android.sdk.survey.TopBarState
        public TopBarState withProgressBarState(ProgressBarState progressBarState) {
            i.e(progressBarState, "progressBarState");
            return copy$default(this, null, null, null, false, null, progressBarState, 31, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SenderTopBarState(Avatar avatar, String senderName, AppConfig appConfig, boolean z10, SurveyUiColors surveyUiColors, ProgressBarState progressBarState) {
            super(null);
            i.e(avatar, "avatar");
            i.e(senderName, "senderName");
            i.e(appConfig, "appConfig");
            i.e(surveyUiColors, "surveyUiColors");
            i.e(progressBarState, "progressBarState");
            this.avatar = avatar;
            this.senderName = senderName;
            this.appConfig = appConfig;
            this.showDismissButton = z10;
            this.surveyUiColors = surveyUiColors;
            this.progressBarState = progressBarState;
        }
    }

    private TopBarState() {
    }
}
