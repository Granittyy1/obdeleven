package io.intercom.android.sdk.m5.push;

import Ia.p;
import androidx.work.j;
import io.intercom.android.sdk.blocks.BlockFactory;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.blocks.logic.TextSplittingStrategy;
import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse;
import io.intercom.android.sdk.m5.conversation.data.ConversationRepository;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.i;
import kotlinx.coroutines.A;
import me.zhanghai.android.materialprogressbar.R;
import p293xa.r;

/* JADX INFO: compiled from: SendMessageWorker.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "io.intercom.android.sdk.m5.push.SendMessageWorker$doWork$result$1", f = "SendMessageWorker.kt", l = {R.styleable.AppCompatTheme_alertDialogButtonGroupStyle}, m = "invokeSuspend")
public final class SendMessageWorker$doWork$result$1 extends SuspendLambda implements p<A, kotlin.coroutines.c<? super j.a>, Object> {
    final /* synthetic */ String $clientUUID;
    final /* synthetic */ String $conversationId;
    final /* synthetic */ String $messageText;
    int label;
    final /* synthetic */ SendMessageWorker this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SendMessageWorker$doWork$result$1(String str, SendMessageWorker sendMessageWorker, String str2, String str3, kotlin.coroutines.c<? super SendMessageWorker$doWork$result$1> cVar) {
        super(2, cVar);
        this.$messageText = str;
        this.this$0 = sendMessageWorker;
        this.$conversationId = str2;
        this.$clientUUID = str3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new SendMessageWorker$doWork$result$1(this.$messageText, this.this$0, this.$conversationId, this.$clientUUID, cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            List<Block.Builder> blocksForText = new BlockFactory(new TextSplittingStrategy()).getBlocksForText(this.$messageText);
            ConversationRepository conversationRepository = this.this$0.conversationRepository;
            String str = this.$conversationId;
            String str2 = this.$clientUUID;
            i.b(blocksForText);
            this.label = 1;
            obj = conversationRepository.replyToConversation(str, str2, blocksForText, null, false, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
        }
        NetworkResponse networkResponse = (NetworkResponse) obj;
        if (networkResponse instanceof NetworkResponse.ClientError) {
            return new j.a.C0203a();
        }
        if ((networkResponse instanceof NetworkResponse.NetworkError) || (networkResponse instanceof NetworkResponse.ServerError)) {
            return new j.a.b();
        }
        if (networkResponse instanceof NetworkResponse.Success) {
            return new j.a.c();
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // Ia.p
    public final Object invoke(A a10, kotlin.coroutines.c<? super j.a> cVar) {
        return ((SendMessageWorker$doWork$result$1) create(a10, cVar)).invokeSuspend(r.f47939a);
    }
}
