package io.intercom.android.sdk.m5.conversation.ui;

import io.intercom.android.sdk.m5.conversation.ConversationViewModel;
import io.intercom.android.sdk.m5.conversation.states.ReplySuggestion;
import io.intercom.android.sdk.ui.component.MediaPickerButtonKt;
import java.util.List;

/* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ui.u, reason: case insensitive filesystem */
/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C2405u implements Ia.l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f39095b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f39096c;

    public /* synthetic */ C2405u(int i10, Object obj) {
        this.f39095b = i10;
        this.f39096c = obj;
    }

    @Override // Ia.l
    public final Object invoke(Object obj) {
        switch (this.f39095b) {
            case 0:
                return ConversationScreenKt.ConversationScreen$lambda$20((ConversationViewModel) this.f39096c, (ReplySuggestion) obj);
            case 1:
                return MediaPickerButtonKt.MediaPickerButton$lambda$2$lambda$1((Ia.l) this.f39096c, (List) obj);
            default:
                String key = (String) obj;
                kotlin.jvm.internal.i.e(key, "key");
                return Boolean.valueOf(!((p141l2.z) this.f39096c).c().contains(key));
        }
    }
}
