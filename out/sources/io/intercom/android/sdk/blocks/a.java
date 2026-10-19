package io.intercom.android.sdk.blocks;

import android.content.Context;
import io.intercom.android.sdk.blocks.lib.models.BlockAttachment;
import io.intercom.android.sdk.survey.block.AttachmentBlockKt;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements Ia.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f38052b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f38053c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f38054d;

    public /* synthetic */ a(Object obj, Context context, int i10) {
        this.f38052b = i10;
        this.f38054d = obj;
        this.f38053c = context;
    }

    @Override // Ia.a
    public final Object invoke() {
        switch (this.f38052b) {
            case 0:
                return ((ConversationRatingCard) this.f38054d).lambda$createConversationRatingBlock$0(this.f38053c);
            default:
                return AttachmentBlockKt.TextAttachmentBlock_FNF3uiM$lambda$3((BlockAttachment) this.f38054d, this.f38053c);
        }
    }
}
