package androidx.navigation.compose;

import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.core.C0907g;
import io.intercom.android.sdk.blocks.lib.models.TicketType;
import io.intercom.android.sdk.m5.conversation.metrics.MetricData;
import io.intercom.android.sdk.m5.conversation.ui.ConversationScreenKt;
import io.intercom.android.sdk.m5.conversation.ui.components.ConversationKebabKt;
import io.intercom.android.sdk.m5.conversation.ui.components.MessageMetadataKt;
import io.intercom.android.sdk.m5.conversation.ui.components.row.BubbleMessageRowKt;
import io.intercom.android.sdk.survey.ui.components.SurveyComponentKt;
import io.intercom.android.sdk.survey.ui.questiontype.AnswerClickData;
import io.intercom.android.sdk.survey.ui.questiontype.files.UploadFileQuestionKt;
import io.intercom.android.sdk.views.compose.IntercomOutlinedTextFieldKt;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class D implements Ia.l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f19078b;

    public /* synthetic */ D(int i10) {
        this.f19078b = i10;
    }

    @Override // Ia.l
    public final Object invoke(Object obj) {
        switch (this.f19078b) {
            case 0:
                return EnterExitTransitionKt.f(C0907g.d(700, 0, null, 6), 2);
            case 1:
                return ConversationScreenKt.ConversationScreen$lambda$17((androidx.compose.runtime.B) obj);
            case 2:
                return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$1((MetricData) obj);
            case 3:
                return MessageMetadataKt.MessageMetadata$lambda$4$lambda$3$lambda$2((androidx.compose.ui.semantics.w) obj);
            case 4:
                return BubbleMessageRowKt.BubbleMessageRow$lambda$2((TicketType) obj);
            case 5:
                return SurveyComponentKt.SurveyErrorState$lambda$13((String) obj);
            case 6:
                return UploadFileQuestionKt.UploadFileQuestion$lambda$0((AnswerClickData) obj);
            case 7:
                return IntercomOutlinedTextFieldKt.IntercomOutlinedTextField$lambda$2((androidx.compose.ui.semantics.w) obj);
            default:
                p141l2.K navOptions = (p141l2.K) obj;
                kotlin.jvm.internal.i.e(navOptions, "$this$navOptions");
                navOptions.f44259c = true;
                return p293xa.r.f47939a;
        }
    }
}
