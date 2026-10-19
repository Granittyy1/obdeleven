package R9;

import androidx.compose.runtime.X;
import io.intercom.android.sdk.m5.conversation.states.AttributeData;
import io.intercom.android.sdk.m5.conversation.ui.components.row.FinAnswerRowKt;
import io.intercom.android.sdk.tickets.list.reducers.TicketsListReducerKt;
import io.intercom.android.sdk.views.compose.TextAttributeCollectorKt;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements Ia.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f5334b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f5335c;

    public /* synthetic */ b(int i10, Object obj) {
        this.f5334b = i10;
        this.f5335c = obj;
    }

    @Override // Ia.a
    public final Object invoke() {
        switch (this.f5334b) {
            case 0:
                return TicketsListReducerKt.reduceToTicketsScreenUiState$lambda$3((androidx.paging.compose.b) this.f5335c);
            case 1:
                return FinAnswerRowKt.FinAnswerMetadata$lambda$10$lambda$9$lambda$6$lambda$5((X) this.f5335c);
            default:
                return TextAttributeCollectorKt.TextAttributeCollector$lambda$2((AttributeData) this.f5335c);
        }
    }
}
