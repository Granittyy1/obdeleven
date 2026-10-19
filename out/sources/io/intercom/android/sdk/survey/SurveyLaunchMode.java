package io.intercom.android.sdk.survey;

import io.intercom.android.sdk.survey.model.SurveyData;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: SurveyViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
public abstract class SurveyLaunchMode {
    public static final int $stable = 0;

    /* JADX INFO: compiled from: SurveyViewModel.kt */
    public static final class Automatic extends SurveyLaunchMode {
        public static final int $stable = 8;
        private final SurveyData surveyData;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Automatic(SurveyData surveyData) {
            super(null);
            i.e(surveyData, "surveyData");
            this.surveyData = surveyData;
        }

        public static /* synthetic */ Automatic copy$default(Automatic automatic, SurveyData surveyData, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                surveyData = automatic.surveyData;
            }
            return automatic.copy(surveyData);
        }

        public final SurveyData component1() {
            return this.surveyData;
        }

        public final Automatic copy(SurveyData surveyData) {
            i.e(surveyData, "surveyData");
            return new Automatic(surveyData);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Automatic) && i.a(this.surveyData, ((Automatic) obj).surveyData);
        }

        public final SurveyData getSurveyData() {
            return this.surveyData;
        }

        public int hashCode() {
            return this.surveyData.hashCode();
        }

        public String toString() {
            return "Automatic(surveyData=" + this.surveyData + ')';
        }
    }

    /* JADX INFO: compiled from: SurveyViewModel.kt */
    public static final class Programmatic extends SurveyLaunchMode {
        public static final int $stable = 0;
        private final String surveyId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Programmatic(String surveyId) {
            super(null);
            i.e(surveyId, "surveyId");
            this.surveyId = surveyId;
        }

        public static /* synthetic */ Programmatic copy$default(Programmatic programmatic, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = programmatic.surveyId;
            }
            return programmatic.copy(str);
        }

        public final String component1() {
            return this.surveyId;
        }

        public final Programmatic copy(String surveyId) {
            i.e(surveyId, "surveyId");
            return new Programmatic(surveyId);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Programmatic) && i.a(this.surveyId, ((Programmatic) obj).surveyId);
        }

        public final String getSurveyId() {
            return this.surveyId;
        }

        public int hashCode() {
            return this.surveyId.hashCode();
        }

        public String toString() {
            return B7.b.g(new StringBuilder("Programmatic(surveyId="), this.surveyId, ')');
        }
    }

    public /* synthetic */ SurveyLaunchMode(e eVar) {
        this();
    }

    private SurveyLaunchMode() {
    }
}
