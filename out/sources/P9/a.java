package P9;

import androidx.compose.runtime.X;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.a0;
import io.intercom.android.sdk.m5.conversation.ui.components.row.FinAnswerRowKt;
import io.intercom.android.sdk.m5.inbox.reducers.InboxPagingItemsReducerKt;
import io.intercom.android.sdk.ui.preview.model.PreviewUiState;
import io.intercom.android.sdk.ui.preview.ui.PreviewRootScreenKt;
import kotlin.jvm.internal.l;
import p141l2.C2749t;
import p163n2.c;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements Ia.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4967b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f4968c;

    public /* synthetic */ a(int i10, Object obj) {
        this.f4967b = i10;
        this.f4968c = obj;
    }

    @Override // Ia.a
    public final Object invoke() {
        switch (this.f4967b) {
            case 0:
                return InboxPagingItemsReducerKt.reduceToInboxUiState$lambda$1$lambda$0((androidx.paging.compose.b) this.f4968c);
            case 1:
                return FinAnswerRowKt.FinAnswerMetadata$lambda$10$lambda$9$lambda$8$lambda$7((X) this.f4968c);
            case 2:
                return Integer.valueOf(PreviewRootScreenKt.PreviewRootScreen$lambda$0((PreviewUiState) this.f4968c));
            default:
                c cVar = ((C2749t) this.f4968c).f44305i;
                if (!cVar.f44760i) {
                    throw new IllegalStateException("You cannot access the NavBackStackEntry's SavedStateHandle until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).");
                }
                if (cVar.j.f17828d == Lifecycle.State.f17749b) {
                    throw new IllegalStateException("You cannot access the NavBackStackEntry's SavedStateHandle after the NavBackStackEntry is destroyed.");
                }
                return ((c.a) a0.b.a(cVar.f44752a, (a0.c) cVar.f44763m.getValue(), 4).a(l.a(c.a.class))).f44764a;
        }
    }
}
