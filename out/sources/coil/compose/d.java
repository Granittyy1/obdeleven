package coil.compose;

import androidx.compose.animation.InterfaceC0927e;
import io.intercom.android.sdk.m5.conversation.ui.components.MessageListKt;
import io.intercom.android.sdk.m5.navigation.HelpCenterDestinationKt;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements Ia.l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f22765b;

    public /* synthetic */ d(int i10) {
        this.f22765b = i10;
    }

    @Override // Ia.l
    public final Object invoke(Object obj) {
        switch (this.f22765b) {
            case 0:
                return (AsyncImagePainter.a) obj;
            case 1:
                return Integer.valueOf(MessageListKt.MessageList$lambda$38$lambda$37$lambda$35(((Integer) obj).intValue()));
            default:
                return HelpCenterDestinationKt.helpCenterDestination$lambda$4((InterfaceC0927e) obj);
        }
    }
}
