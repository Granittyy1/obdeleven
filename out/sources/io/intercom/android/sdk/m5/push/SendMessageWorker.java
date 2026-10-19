package io.intercom.android.sdk.m5.push;

import android.content.Context;
import androidx.annotation.Keep;
import androidx.compose.animation.D;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import androidx.work.j;
import io.intercom.android.sdk.api.Api;
import io.intercom.android.sdk.api.MessengerApi;
import io.intercom.android.sdk.m5.conversation.data.ConversationRepository;
import io.intercom.android.sdk.m5.upload.data.UploadRepository;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.i;
import kotlinx.coroutines.B;
import kotlinx.coroutines.C2680e;
import kotlinx.coroutines.N;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: SendMessageWorker.kt */
/* JADX INFO: loaded from: classes3.dex */
@Keep
public final class SendMessageWorker extends CoroutineWorker {
    public static final int $stable = 8;
    private final ConversationRepository conversationRepository;

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.push.SendMessageWorker$doWork$1, reason: invalid class name */
    /* JADX INFO: compiled from: SendMessageWorker.kt */
    @Aa.c(c = "io.intercom.android.sdk.m5.push.SendMessageWorker", f = "SendMessageWorker.kt", l = {R.styleable.AppCompatTheme_actionModeWebSearchDrawable}, m = "doWork")
    public static final class AnonymousClass1 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(kotlin.coroutines.c<? super AnonymousClass1> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SendMessageWorker.this.doWork(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SendMessageWorker(Context context, WorkerParameters params) {
        super(context, params);
        i.e(context, "context");
        i.e(params, "params");
        MessengerApi messengerApi = null;
        UploadRepository uploadRepository = null;
        Api api = null;
        this.conversationRepository = new ConversationRepository(messengerApi, uploadRepository, api, null, null, B.a(N.f43200c), 31, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.work.CoroutineWorker
    public Object doWork(kotlin.coroutines.c<? super j.a> cVar) throws Throwable {
        AnonymousClass1 anonymousClass1;
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
        Object objF = anonymousClass1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = anonymousClass1.label;
        if (i11 == 0) {
            kotlin.b.b(objF);
            Object obj = getInputData().f20353a.get(ConversationActionHandlerKt.KEY_TEXT_REPLY);
            String str = obj instanceof String ? (String) obj : null;
            if (str == null) {
                return new j.a.C0203a();
            }
            Object obj2 = getInputData().f20353a.get(ConversationActionHandlerKt.KEY_CONVERSATION_ID);
            String str2 = obj2 instanceof String ? (String) obj2 : null;
            if (str2 == null) {
                return new j.a.C0203a();
            }
            String strC = D.c("toString(...)");
            Sa.a aVar = N.f43200c;
            SendMessageWorker$doWork$result$1 sendMessageWorker$doWork$result$1 = new SendMessageWorker$doWork$result$1(str, this, str2, strC, null);
            anonymousClass1.label = 1;
            objF = C2680e.f(aVar, sendMessageWorker$doWork$result$1, anonymousClass1);
            if (objF == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(objF);
        }
        i.d(objF, "withContext(...)");
        return (j.a) objF;
    }
}
