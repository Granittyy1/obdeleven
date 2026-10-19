package io.intercom.android.sdk.m5.components;

import androidx.compose.runtime.InterfaceC1084f;
import io.intercom.android.sdk.m5.conversation.ui.components.composer.MessageComposerKt;
import io.intercom.android.sdk.m5.conversation.ui.components.row.BubbleMessageRowKt;
import io.intercom.android.sdk.m5.helpcenter.ui.components.ArticleCountComponentKt;
import io.intercom.android.sdk.survey.block.TextBlockKt;
import io.intercom.android.sdk.survey.ui.questiontype.dropdown.DropDownQuestionKt;
import io.intercom.android.sdk.ui.component.IntercomTopBarKt;

/* JADX INFO: renamed from: io.intercom.android.sdk.m5.components.a0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C2269a0 implements Ia.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f38276b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f38277c;

    public /* synthetic */ C2269a0(int i10, int i11) {
        this.f38276b = i11;
        this.f38277c = i10;
    }

    @Override // Ia.p
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f38276b;
        InterfaceC1084f interfaceC1084f = (InterfaceC1084f) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i10) {
            case 0:
                return EmptyStateKt.EmptyStatePreview$lambda$5(this.f38277c, interfaceC1084f, iIntValue);
            case 1:
                return PoweredByBadgeKt.PoweredByBadgePreview$lambda$2(this.f38277c, interfaceC1084f, iIntValue);
            case 2:
                return MessageComposerKt.TextComposerWithFinDictationPreview$lambda$37(this.f38277c, interfaceC1084f, iIntValue);
            case 3:
                return BubbleMessageRowKt.BubbleMessageRowPreview$lambda$13(this.f38277c, interfaceC1084f, iIntValue);
            case 4:
                return ArticleCountComponentKt.SingleArticleCountComponentPreview$lambda$2(this.f38277c, interfaceC1084f, iIntValue);
            case 5:
                return TextBlockKt.TextBlockAlignmentPreview$lambda$26(this.f38277c, interfaceC1084f, iIntValue);
            case 6:
                return DropDownQuestionKt.ColoredDropDownSelectedQuestionPreview$lambda$14(this.f38277c, interfaceC1084f, iIntValue);
            default:
                return IntercomTopBarKt.IntercomTopBarPreviewWithMenuItems$lambda$10(this.f38277c, interfaceC1084f, iIntValue);
        }
    }
}
