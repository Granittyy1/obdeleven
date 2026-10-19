package io.intercom.android.sdk.m5.conversation.usecase;

/* JADX INFO: compiled from: SoundEffectsUseCase.kt */
/* JADX INFO: loaded from: classes3.dex */
public enum Action {
    MESSAGE_SENT,
    ADMIN_MESSAGE_RECEIVED,
    OPERATOR_MESSAGE_RECEIVED,
    MESSAGE_FAILED;

    private static final /* synthetic */ Ba.a $ENTRIES = kotlin.enums.a.a(values());

    public static Ba.a<Action> getEntries() {
        return $ENTRIES;
    }
}
