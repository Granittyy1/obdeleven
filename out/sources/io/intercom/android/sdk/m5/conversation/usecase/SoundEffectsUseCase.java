package io.intercom.android.sdk.m5.conversation.usecase;

import Z3.o;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.m5.conversation.utils.SoundPlayer;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: SoundEffectsUseCase.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class SoundEffectsUseCase {
    public static final int $stable = 8;
    private final AppConfig appConfig;
    private final SoundPlayer soundPlayer;

    /* JADX INFO: compiled from: SoundEffectsUseCase.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Action.values().length];
            try {
                iArr[Action.MESSAGE_SENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Action.ADMIN_MESSAGE_RECEIVED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Action.OPERATOR_MESSAGE_RECEIVED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Action.MESSAGE_FAILED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ SoundEffectsUseCase(AppConfig appConfig, SoundPlayer soundPlayer, int i10, e eVar) {
        this((i10 & 1) != 0 ? (AppConfig) o.b() : appConfig, soundPlayer);
    }

    public final AppConfig getAppConfig() {
        return this.appConfig;
    }

    public final SoundPlayer getSoundPlayer() {
        return this.soundPlayer;
    }

    public final void invoke$intercom_sdk_base_release(Action action) {
        i.e(action, "action");
        if (this.appConfig.isAudioEnabled()) {
            int i10 = WhenMappings.$EnumSwitchMapping$0[action.ordinal()];
            if (i10 == 1) {
                this.soundPlayer.playMessageSentSound();
                return;
            }
            if (i10 == 2) {
                this.soundPlayer.playAdminMessageReceivedSound();
            } else if (i10 == 3) {
                this.soundPlayer.playOperatorMessageReceivedSound();
            } else {
                if (i10 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                this.soundPlayer.playMessageFailedSound();
            }
        }
    }

    public SoundEffectsUseCase(AppConfig appConfig, SoundPlayer soundPlayer) {
        i.e(appConfig, "appConfig");
        i.e(soundPlayer, "soundPlayer");
        this.appConfig = appConfig;
        this.soundPlayer = soundPlayer;
    }
}
