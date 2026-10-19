package Q9;

import Ia.l;
import androidx.compose.animation.InterfaceC0927e;
import io.intercom.android.sdk.m5.navigation.CreateTicketDestinationKt;
import io.intercom.android.sdk.m5.navigation.IntercomTransitionsKt;
import io.intercom.android.sdk.survey.ui.models.Answer;
import p141l2.C2748s;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f5137b;

    public /* synthetic */ b(int i10) {
        this.f5137b = i10;
    }

    @Override // Ia.l
    public final Object invoke(Object obj) {
        switch (this.f5137b) {
            case 0:
                return Answer.MultipleAnswer.getLength$lambda$1((String) obj);
            case 1:
                return CreateTicketDestinationKt.createTicketDestination$lambda$2((C2748s) obj);
            default:
                return IntercomTransitionsKt.slideUpEnterTransition$lambda$0((InterfaceC0927e) obj);
        }
    }
}
