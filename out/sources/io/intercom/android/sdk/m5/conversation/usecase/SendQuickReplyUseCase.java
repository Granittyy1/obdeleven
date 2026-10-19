package io.intercom.android.sdk.m5.conversation.usecase;

import Aa.c;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.blocks.BlockFactory;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.blocks.logic.TextSplittingStrategy;
import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse;
import io.intercom.android.sdk.identity.UserIdentity;
import io.intercom.android.sdk.m5.conversation.data.ConversationRepository;
import io.intercom.android.sdk.m5.conversation.data.GetConversationReason;
import io.intercom.android.sdk.m5.conversation.states.ConversationClientState;
import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.models.ReplyOption;
import java.util.List;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;
import kotlin.text.n;
import kotlinx.coroutines.flow.q;
import me.zhanghai.android.materialprogressbar.R;
import p293xa.r;

/* JADX INFO: compiled from: SendQuickReplyUseCase.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class SendQuickReplyUseCase {
    public static final int $stable = 8;
    private final ConversationRepository conversationRepository;
    private final RefreshConversationUseCase refreshConversationUseCase;
    private final SoundEffectsUseCase soundEffectsUseCase;
    private final UserIdentity userIdentity;

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.usecase.SendQuickReplyUseCase$invoke$1, reason: invalid class name */
    /* JADX INFO: compiled from: SendQuickReplyUseCase.kt */
    @c(c = "io.intercom.android.sdk.m5.conversation.usecase.SendQuickReplyUseCase", f = "SendQuickReplyUseCase.kt", l = {R.styleable.AppCompatTheme_alertDialogStyle, R.styleable.AppCompatTheme_colorControlHighlight}, m = "invoke")
    public static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(kotlin.coroutines.c<? super AnonymousClass1> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SendQuickReplyUseCase.this.invoke(null, null, null, this);
        }
    }

    public SendQuickReplyUseCase(ConversationRepository conversationRepository, RefreshConversationUseCase refreshConversationUseCase, SoundEffectsUseCase soundEffectsUseCase, UserIdentity userIdentity) {
        i.e(conversationRepository, "conversationRepository");
        i.e(refreshConversationUseCase, "refreshConversationUseCase");
        i.e(soundEffectsUseCase, "soundEffectsUseCase");
        i.e(userIdentity, "userIdentity");
        this.conversationRepository = conversationRepository;
        this.refreshConversationUseCase = refreshConversationUseCase;
        this.soundEffectsUseCase = soundEffectsUseCase;
        this.userIdentity = userIdentity;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object invoke(q<ConversationClientState> qVar, ReplyOption replyOption, Part part, kotlin.coroutines.c<? super r> cVar) {
        AnonymousClass1 anonymousClass1;
        q<ConversationClientState> qVar2;
        SendQuickReplyUseCase sendQuickReplyUseCase;
        String str;
        if (cVar instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) cVar;
            int i10 = anonymousClass1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i10 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(cVar);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(cVar);
        }
        Object obj = anonymousClass1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = anonymousClass1.label;
        if (i11 != 0) {
            if (i11 == 1) {
                str = (String) anonymousClass1.L$2;
                q<ConversationClientState> qVar3 = (q) anonymousClass1.L$1;
                sendQuickReplyUseCase = (SendQuickReplyUseCase) anonymousClass1.L$0;
                b.b(obj);
                qVar2 = qVar3;
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                b.b(obj);
            }
            return r.f47939a;
        }
        b.b(obj);
        String string = UUID.randomUUID().toString();
        i.d(string, "toString(...)");
        List<Block.Builder> blocksForText = new BlockFactory(new TextSplittingStrategy()).getBlocksForText(n.p0(replyOption.getText()).toString());
        SendMessageUseCase.Companion companion = SendMessageUseCase.Companion;
        i.b(blocksForText);
        SendMessageUseCase.Companion.addBlocksToPendingMessages$default(companion, qVar, blocksForText, string, this.userIdentity, false, 16, null);
        Conversation conversation = qVar.getValue().getConversation();
        String id = !part.isInitialMessage() ? part.getId() : "";
        if (conversation != null) {
            ConversationRepository conversationRepository = this.conversationRepository;
            String uuid = replyOption.getUuid();
            String id2 = conversation.getId();
            i.b(id);
            anonymousClass1.L$0 = this;
            qVar2 = qVar;
            anonymousClass1.L$1 = qVar2;
            anonymousClass1.L$2 = string;
            anonymousClass1.label = 1;
            Object objAddQuickReplyToConversation = conversationRepository.addQuickReplyToConversation(uuid, id2, id, string, anonymousClass1);
            if (objAddQuickReplyToConversation == coroutineSingletons) {
                return coroutineSingletons;
            }
            sendQuickReplyUseCase = this;
            str = string;
            obj = objAddQuickReplyToConversation;
        }
        return r.f47939a;
        NetworkResponse networkResponse = (NetworkResponse) obj;
        if ((networkResponse instanceof NetworkResponse.ClientError) || (networkResponse instanceof NetworkResponse.NetworkError) || (networkResponse instanceof NetworkResponse.ServerError)) {
            sendQuickReplyUseCase.soundEffectsUseCase.invoke$intercom_sdk_base_release(Action.MESSAGE_FAILED);
            SendMessageUseCase.Companion.updateFailedPendingMessages(qVar2, str);
            return r.f47939a;
        }
        if (!(networkResponse instanceof NetworkResponse.Success)) {
            throw new NoWhenBranchMatchedException();
        }
        sendQuickReplyUseCase.soundEffectsUseCase.invoke$intercom_sdk_base_release(Action.MESSAGE_SENT);
        RefreshConversationUseCase refreshConversationUseCase = sendQuickReplyUseCase.refreshConversationUseCase;
        GetConversationReason getConversationReason = GetConversationReason.NEW_COMMENT;
        anonymousClass1.L$0 = null;
        anonymousClass1.L$1 = null;
        anonymousClass1.L$2 = null;
        anonymousClass1.label = 2;
        if (refreshConversationUseCase.invoke(qVar2, getConversationReason, anonymousClass1) == coroutineSingletons) {
            return coroutineSingletons;
        }
        return r.f47939a;
    }

    public /* synthetic */ SendQuickReplyUseCase(ConversationRepository conversationRepository, RefreshConversationUseCase refreshConversationUseCase, SoundEffectsUseCase soundEffectsUseCase, UserIdentity userIdentity, int i10, e eVar) {
        this(conversationRepository, refreshConversationUseCase, soundEffectsUseCase, (i10 & 8) != 0 ? Injector.get().getUserIdentity() : userIdentity);
    }
}
