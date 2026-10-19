package io.intercom.android.sdk.m5.conversation.ui.components;

import io.intercom.android.sdk.m5.conversation.ui.components.composer.MessageComposerKt;
import io.intercom.android.sdk.m5.conversation.ui.components.composer.TextInputSource;
import io.intercom.android.sdk.models.Source;

/* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ui.components.y, reason: case insensitive filesystem */
/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C2387y implements Ia.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f39013b;

    public /* synthetic */ C2387y(int i10) {
        this.f39013b = i10;
    }

    @Override // Ia.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f39013b) {
            case 0:
                return InlineSourcesSheetContentKt.InlineSourcesSheetContent$lambda$11$lambda$10$lambda$0(((Integer) obj).intValue(), (Source) obj2);
            default:
                return MessageComposerKt.TextComposerWithFinDictationPreview$lambda$36((String) obj, (TextInputSource) obj2);
        }
    }
}
