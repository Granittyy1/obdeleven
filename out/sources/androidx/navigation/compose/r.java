package androidx.navigation.compose;

import androidx.compose.animation.InterfaceC0927e;
import io.intercom.android.sdk.m5.conversation.states.AttributeData;
import io.intercom.android.sdk.m5.navigation.HelpCenterDestinationKt;
import io.intercom.android.sdk.views.compose.AttributeCollectorCardKt;
import io.intercom.android.sdk.views.compose.TextAttributeCollectorKt;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r implements Ia.l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f19197b;

    public /* synthetic */ r(int i10) {
        this.f19197b = i10;
    }

    @Override // Ia.l
    public final Object invoke(Object obj) {
        switch (this.f19197b) {
            case 0:
                return new C1408a(androidx.lifecycle.N.a((p014b1.a) obj));
            case 1:
                return HelpCenterDestinationKt.helpCenterDestination$lambda$2((InterfaceC0927e) obj);
            case 2:
                return AttributeCollectorCardKt.AttributeCollectorCard$lambda$0((AttributeData) obj);
            default:
                return TextAttributeCollectorKt.TextAttributeCollector$lambda$1((AttributeData) obj);
        }
    }
}
