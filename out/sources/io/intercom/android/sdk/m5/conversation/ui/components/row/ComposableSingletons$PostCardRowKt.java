package io.intercom.android.sdk.m5.conversation.ui.components.row;

import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.models.Participant;

/* JADX INFO: compiled from: PostCardRow.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class ComposableSingletons$PostCardRowKt {
    public static final ComposableSingletons$PostCardRowKt INSTANCE = new ComposableSingletons$PostCardRowKt();

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    public static Ia.p<InterfaceC1084f, Integer, p293xa.r> f147lambda1 = new ComposableLambdaImpl(false, -1591302201, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.ComposableSingletons$PostCardRowKt$lambda-1$1
        @Override // Ia.p
        public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f, Integer num) {
            invoke(interfaceC1084f, num.intValue());
            return p293xa.r.f47939a;
        }

        public final void invoke(InterfaceC1084f interfaceC1084f, int i10) {
            if ((i10 & 11) == 2 && interfaceC1084f.s()) {
                interfaceC1084f.w();
                return;
            }
            Part partBuild = new Part.Builder().withParticipantIsAdmin(false).withBlocks(kotlin.collections.l.s(BubbleMessageRowKt.getParagraphBlock(), BubbleMessageRowKt.getLongParagraphBlock(), BubbleMessageRowKt.getLongParagraphBlock())).withStyle(io.intercom.android.sdk.models.MessageStyle.POST).build();
            partBuild.setParticipant(Participant.create("", "Paul", Participant.USER_TYPE, "", Avatar.create("", "PK"), Boolean.FALSE));
            PostCardRowKt.PostCardRow(null, partBuild, "SDK Test App", interfaceC1084f, 448, 1);
        }
    });

    /* JADX INFO: renamed from: getLambda-1$intercom_sdk_base_release, reason: not valid java name */
    public final Ia.p<InterfaceC1084f, Integer, p293xa.r> m233getLambda1$intercom_sdk_base_release() {
        return f147lambda1;
    }
}
