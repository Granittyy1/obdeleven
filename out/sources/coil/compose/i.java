package coil.compose;

import android.content.DialogInterface;
import androidx.compose.ui.layout.Y;
import io.intercom.android.sdk.tickets.create.model.CreateTicketViewModel;
import java.util.ArrayList;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i implements Ia.l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f22773b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f22774c;

    public /* synthetic */ i(int i10, Object obj) {
        this.f22773b = i10;
        this.f22774c = obj;
    }

    @Override // Ia.l
    public final Object invoke(Object obj) {
        switch (this.f22773b) {
            case 0:
                Y.a.g((Y.a) obj, (Y) this.f22774c, 0, 0);
                return p293xa.r.f47939a;
            case 1:
                ((com.voltasit.obdeleven.presentation.controlUnit.kwp.livedata.f) this.f22774c).getClass();
                ((DialogInterface) obj).dismiss();
                return p293xa.r.f47939a;
            default:
                return CreateTicketViewModel.getAttributeRequest$lambda$6((ArrayList) this.f22774c, (CreateTicketViewModel.CreateTicketFormUiState.Content) obj);
        }
    }
}
