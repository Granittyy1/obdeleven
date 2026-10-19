package io.intercom.android.sdk.m5.conversation.usecase;

import Aa.c;
import Ia.p;
import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse;
import io.intercom.android.sdk.m5.conversation.data.ConversationRepository;
import io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData;
import io.intercom.android.sdk.models.Upload;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.A;
import p293xa.r;

/* JADX INFO: compiled from: SendMediaUseCase.kt */
/* JADX INFO: loaded from: classes3.dex */
@c(c = "io.intercom.android.sdk.m5.conversation.usecase.SendMediaUseCase$sendMediaNewWay$2$mediaUpload$1", f = "SendMediaUseCase.kt", l = {268}, m = "invokeSuspend")
public final class SendMediaUseCase$sendMediaNewWay$2$mediaUpload$1 extends SuspendLambda implements p<A, kotlin.coroutines.c<? super NetworkResponse<? extends Upload.Builder>>, Object> {
    final /* synthetic */ MediaData.Media $compressedMediaData;
    int label;
    final /* synthetic */ SendMediaUseCase this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SendMediaUseCase$sendMediaNewWay$2$mediaUpload$1(SendMediaUseCase sendMediaUseCase, MediaData.Media media, kotlin.coroutines.c<? super SendMediaUseCase$sendMediaNewWay$2$mediaUpload$1> cVar) {
        super(2, cVar);
        this.this$0 = sendMediaUseCase;
        this.$compressedMediaData = media;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new SendMediaUseCase$sendMediaNewWay$2$mediaUpload$1(this.this$0, this.$compressedMediaData, cVar);
    }

    @Override // Ia.p
    public /* bridge */ /* synthetic */ Object invoke(A a10, kotlin.coroutines.c<? super NetworkResponse<? extends Upload.Builder>> cVar) {
        return invoke2(a10, (kotlin.coroutines.c<? super NetworkResponse<Upload.Builder>>) cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            b.b(obj);
            ConversationRepository conversationRepository = this.this$0.conversationRepository;
            MediaData.Media media = this.$compressedMediaData;
            this.label = 1;
            obj = conversationRepository.uploadMedia(media, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b.b(obj);
        }
        return obj;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(A a10, kotlin.coroutines.c<? super NetworkResponse<Upload.Builder>> cVar) {
        return ((SendMediaUseCase$sendMediaNewWay$2$mediaUpload$1) create(a10, cVar)).invokeSuspend(r.f47939a);
    }
}
