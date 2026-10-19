package io.intercom.android.sdk.m5.conversation.usecase;

import com.google.android.gms.internal.measurement.M1;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.m5.conversation.states.ConversationClientState;
import io.intercom.android.sdk.m5.conversation.ui.components.composer.ComposerInputType;
import io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData;
import io.intercom.android.sdk.models.carousel.AppearanceType;
import kotlin.coroutines.c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.i;
import kotlinx.coroutines.flow.q;
import p293xa.r;

/* JADX INFO: compiled from: SendGifUseCase.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class SendGifUseCase {
    public static final int $stable = 8;
    private final ChangeInputUseCase changeInputUseCase;
    private final SendMessageUseCase sendMessageUseCase;

    public SendGifUseCase(SendMessageUseCase sendMessageUseCase, ChangeInputUseCase changeInputUseCase) {
        i.e(sendMessageUseCase, "sendMessageUseCase");
        i.e(changeInputUseCase, "changeInputUseCase");
        this.sendMessageUseCase = sendMessageUseCase;
        this.changeInputUseCase = changeInputUseCase;
    }

    public final Object invoke(q<ConversationClientState> qVar, MediaData.Gif gif, c<? super r> cVar) {
        this.changeInputUseCase.invoke(qVar, ComposerInputType.TEXT);
        Object objInvoke$default = SendMessageUseCase.invoke$default(this.sendMessageUseCase, qVar, M1.k(new Block.Builder().withType(AppearanceType.IMAGE).withUrl(gif.getUrl()).withAttribution(gif.getAttribution()).withHeight(gif.getHeight()).withWidth(gif.getWidth())), null, false, cVar, 12, null);
        return objInvoke$default == CoroutineSingletons.f43038b ? objInvoke$default : r.f47939a;
    }
}
