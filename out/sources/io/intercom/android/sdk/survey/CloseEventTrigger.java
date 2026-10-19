package io.intercom.android.sdk.survey;

/* JADX INFO: compiled from: SurveyViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
public enum CloseEventTrigger {
    CLOSE_BUTTON,
    CTA,
    SECONDARY_CTA_EXTERNAL_LINK,
    SECONDARY_CTA_DEEP_LINK;

    private static final /* synthetic */ Ba.a $ENTRIES = kotlin.enums.a.a(values());

    public static Ba.a<CloseEventTrigger> getEntries() {
        return $ENTRIES;
    }
}
