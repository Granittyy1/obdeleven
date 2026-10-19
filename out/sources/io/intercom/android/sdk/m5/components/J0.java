package io.intercom.android.sdk.m5.components;

import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.m5.conversation.ui.ConversationScreenKt;
import io.intercom.android.sdk.m5.home.ui.components.WrapReportingTextKt;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class J0 implements Ia.l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f38183b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f38184c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f38185d;

    public /* synthetic */ J0(Object obj, int i10, Object obj2) {
        this.f38183b = i10;
        this.f38184c = obj;
        this.f38185d = obj2;
    }

    @Override // Ia.l
    public final Object invoke(Object obj) {
        switch (this.f38183b) {
            case 0:
                return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$1$lambda$0((String) this.f38184c, (String) this.f38185d, (androidx.compose.ui.semantics.w) obj);
            case 1:
                return ConversationScreenKt.ConversationScreen$lambda$24((androidx.activity.compose.e) this.f38184c, (androidx.compose.runtime.X) this.f38185d, (Block) obj);
            default:
                return WrapReportingTextKt.WrapReportingText_T042LqI$lambda$5$lambda$4((Ia.l) this.f38184c, (androidx.compose.runtime.X) this.f38185d, (androidx.compose.ui.text.B) obj);
        }
    }
}
