package io.intercom.android.sdk.post;

import Ia.l;
import Ia.q;
import android.content.Context;
import android.view.ViewGroup;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.U;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.ui.h;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.activities.ConversationReactionListener;
import io.intercom.android.sdk.conversation.ReactionInputView;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.models.ReactionReply;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import kotlin.jvm.internal.i;
import p293xa.r;

/* JADX INFO: compiled from: PostActivityV2.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class PostActivityV2$onCreate$1$1$3$1$1 implements q<U, InterfaceC1084f, Integer, r> {
    final /* synthetic */ Part $part;
    final /* synthetic */ PostActivityV2 this$0;

    public PostActivityV2$onCreate$1$1$3$1$1(Part part, PostActivityV2 postActivityV2) {
        this.$part = part;
        this.this$0 = postActivityV2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ReactionInputView invoke$lambda$1(Part part, PostActivityV2 this$0, Context it) {
        i.e(part, "$part");
        i.e(this$0, "this$0");
        i.e(it, "it");
        ReactionInputView reactionInputView = new ReactionInputView(it, null);
        reactionInputView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        reactionInputView.setUpReactions(part.getReactionReply(), true, new ConversationReactionListener(MetricTracker.ReactionLocation.IN_APP, part.getId(), this$0.getConversationId(), this$0.getInjector().getApi(), this$0.getInjector().getMetricTracker()));
        return reactionInputView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r invoke$lambda$2(PostActivityV2 this$0) {
        i.e(this$0, "this$0");
        this$0.openConversation();
        return r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r invoke$lambda$3(PostActivityV2 this$0) {
        i.e(this$0, "this$0");
        this$0.openConversation();
        return r.f47939a;
    }

    @Override // Ia.q
    public /* bridge */ /* synthetic */ r invoke(U u10, InterfaceC1084f interfaceC1084f, Integer num) {
        invoke(u10, interfaceC1084f, num.intValue());
        return r.f47939a;
    }

    public final void invoke(U BottomBarContent, InterfaceC1084f interfaceC1084f, int i10) {
        i.e(BottomBarContent, "$this$BottomBarContent");
        if ((i10 & 81) == 16 && interfaceC1084f.s()) {
            interfaceC1084f.w();
            return;
        }
        if (!ReactionReply.isNull(this.$part.getReactionReply())) {
            interfaceC1084f.L(1850078684);
            final Part part = this.$part;
            final PostActivityV2 postActivityV2 = this.this$0;
            AndroidView_androidKt.b(new l() { // from class: io.intercom.android.sdk.post.b
                @Override // Ia.l
                public final Object invoke(Object obj) {
                    return PostActivityV2$onCreate$1$1$3$1$1.invoke$lambda$1(part, postActivityV2, (Context) obj);
                }
            }, null, null, interfaceC1084f, 0, 6);
            interfaceC1084f.D();
            return;
        }
        if (!this.this$0.isComposerVisible()) {
            interfaceC1084f.L(1852835235);
            interfaceC1084f.D();
            return;
        }
        interfaceC1084f.L(1851871135);
        h.a aVar = h.a.f13984b;
        final PostActivityV2 postActivityV3 = this.this$0;
        h hVarC = ClickableKt.c(aVar, false, null, new Ia.a() { // from class: io.intercom.android.sdk.post.c
            @Override // Ia.a
            public final Object invoke() {
                return PostActivityV2$onCreate$1$1$3$1$1.invoke$lambda$2(postActivityV3);
            }
        }, 7);
        String string = this.this$0.getString(R.string.intercom_reply_to_conversation);
        i.d(string, "getString(...)");
        IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
        int i11 = IntercomTheme.$stable;
        TextKt.b(string, hVarC, Q3.d.e(4288585374L), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(interfaceC1084f, i11).getType04(), interfaceC1084f, 384, 0, 65528);
        final PostActivityV2 postActivityV4 = this.this$0;
        h hVarC2 = ClickableKt.c(aVar, false, null, new Ia.a() { // from class: io.intercom.android.sdk.post.d
            @Override // Ia.a
            public final Object invoke() {
                return PostActivityV2$onCreate$1$1$3$1$1.invoke$lambda$3(postActivityV4);
            }
        }, 7);
        String string2 = this.this$0.getString(R.string.intercom_send);
        i.d(string2, "getString(...)");
        TextKt.b(string2, hVarC2, Q3.d.e(4288585374L), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(interfaceC1084f, i11).getType04(), interfaceC1084f, 384, 0, 65528);
        interfaceC1084f.D();
    }
}
