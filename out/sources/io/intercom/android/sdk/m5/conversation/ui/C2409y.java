package io.intercom.android.sdk.m5.conversation.ui;

import android.content.Context;
import io.intercom.android.sdk.m5.conversation.ConversationViewModel;
import io.intercom.android.sdk.m5.conversation.ui.components.row.QuickRepliesKt;
import io.intercom.android.sdk.m5.conversation.ui.components.row.QuickReply;
import java.util.List;

/* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ui.y, reason: case insensitive filesystem */
/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C2409y implements Ia.l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f39101b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f39102c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f39103d;

    public /* synthetic */ C2409y(Object obj, int i10, Object obj2) {
        this.f39101b = i10;
        this.f39102c = obj;
        this.f39103d = obj2;
    }

    @Override // Ia.l
    public final Object invoke(Object obj) {
        switch (this.f39101b) {
            case 0:
                return ConversationScreenKt.ConversationScreen$lambda$29((Context) this.f39102c, (ConversationViewModel) this.f39103d, (List) obj);
            default:
                return QuickRepliesKt.ReplyOptions$lambda$4((List) this.f39102c, (Ia.l) this.f39103d, (QuickReply) obj);
        }
    }
}
