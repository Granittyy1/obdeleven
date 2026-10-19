package p011ab;

import Ia.l;
import androidx.compose.runtime.X;
import androidx.compose.ui.layout.Y;
import io.intercom.android.sdk.m5.home.ui.header.HomeHeaderKt;
import io.intercom.android.sdk.tickets.create.model.CreateTicketViewModel;
import p293xa.r;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class g implements l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f8105b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f8106c;

    public /* synthetic */ g(int i10, Object obj) {
        this.f8105b = i10;
        this.f8106c = obj;
    }

    @Override // Ia.l
    public final Object invoke(Object obj) {
        switch (this.f8105b) {
            case 0:
                int iIntValue = ((Integer) obj).intValue();
                StringBuilder sb2 = new StringBuilder();
                h hVar = (h) this.f8106c;
                sb2.append(hVar.f8112f[iIntValue]);
                sb2.append(": ");
                sb2.append(hVar.f8113g[iIntValue].a());
                return sb2.toString();
            case 1:
                ((Y.a) obj).d((Y) this.f8106c, 0, 0, 0.0f);
                return r.f47939a;
            case 2:
                return HomeHeaderKt.HomeContentHeader$lambda$11$lambda$10$lambda$9$lambda$8((X) this.f8106c, ((Boolean) obj).booleanValue());
            default:
                return CreateTicketViewModel.onAnswerUpdated$lambda$3$lambda$2$lambda$1((CreateTicketViewModel) this.f8106c, (CreateTicketViewModel.CreateTicketFormUiState.Content) obj);
        }
    }
}
