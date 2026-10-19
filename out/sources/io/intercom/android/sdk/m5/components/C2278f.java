package io.intercom.android.sdk.m5.components;

import androidx.compose.runtime.InterfaceC1084f;
import io.intercom.android.sdk.m5.conversation.ui.components.composer.BottomBarButtonComponentKt;
import io.intercom.android.sdk.m5.helpcenter.ui.components.CollectionSummaryComponentKt;
import io.intercom.android.sdk.m5.home.ui.header.HomeHeaderBackdropKt;
import io.intercom.android.sdk.survey.ui.components.SurveyTopBarComponentKt;
import io.intercom.android.sdk.survey.ui.questiontype.choice.OtherOptionKt;
import io.intercom.android.sdk.survey.ui.questiontype.files.FileActionSheetKt;
import io.intercom.android.sdk.views.compose.TextAttributeCollectorKt;

/* JADX INFO: renamed from: io.intercom.android.sdk.m5.components.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C2278f implements Ia.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f38356b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f38357c;

    public /* synthetic */ C2278f(int i10, int i11) {
        this.f38356b = i11;
        this.f38357c = i10;
    }

    @Override // Ia.p
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f38356b;
        InterfaceC1084f interfaceC1084f = (InterfaceC1084f) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i10) {
            case 0:
                return AvatarTriangleGroupKt.TripleAvatarsPreview$lambda$8(this.f38357c, interfaceC1084f, iIntValue);
            case 1:
                return TopActionBarKt.TopActionBarMultipleAvatarsPreview$lambda$14(this.f38357c, interfaceC1084f, iIntValue);
            case 2:
                return BottomBarButtonComponentKt.BottomBarButtonComponentPreviewGifOnly$lambda$8(this.f38357c, interfaceC1084f, iIntValue);
            case 3:
                return CollectionSummaryComponentKt.CollectionSummaryComponentPreview$lambda$6(this.f38357c, interfaceC1084f, iIntValue);
            case 4:
                return HomeHeaderBackdropKt.GradientHeaderBackdropPreview$lambda$5(this.f38357c, interfaceC1084f, iIntValue);
            case 5:
                return SurveyTopBarComponentKt.SurveyAvatarBar$lambda$10(this.f38357c, interfaceC1084f, iIntValue);
            case 6:
                return OtherOptionKt.OtherOptionPreview$lambda$4(this.f38357c, interfaceC1084f, iIntValue);
            case 7:
                return FileActionSheetKt.FileActionSheetQueuedPreview$lambda$8(this.f38357c, interfaceC1084f, iIntValue);
            default:
                return TextAttributeCollectorKt.PhoneAttributePreview$lambda$17(this.f38357c, interfaceC1084f, iIntValue);
        }
    }
}
