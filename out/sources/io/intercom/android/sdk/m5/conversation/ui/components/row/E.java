package io.intercom.android.sdk.m5.conversation.ui.components.row;

import androidx.compose.runtime.InterfaceC1084f;
import io.intercom.android.sdk.m5.helpcenter.states.CollectionRowData;
import io.intercom.android.sdk.m5.helpcenter.ui.components.CollectionRowComponentKt;
import java.util.List;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class E implements Ia.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f38824b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Ia.l f38825c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.h f38826d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f38827e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f38828f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f38829g;

    public /* synthetic */ E(int i10, int i11, Ia.l lVar, androidx.compose.ui.h hVar, List list) {
        this.f38826d = hVar;
        this.f38829g = list;
        this.f38825c = lVar;
        this.f38827e = i10;
        this.f38828f = i11;
    }

    @Override // Ia.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f38824b) {
            case 0:
                return QuickRepliesKt.ComposerSuggestions$lambda$10(this.f38826d, (List) this.f38829g, this.f38825c, this.f38827e, this.f38828f, (InterfaceC1084f) obj, ((Integer) obj2).intValue());
            default:
                return CollectionRowComponentKt.CollectionRowComponent$lambda$5((CollectionRowData) this.f38829g, this.f38825c, this.f38826d, this.f38827e, this.f38828f, (InterfaceC1084f) obj, ((Integer) obj2).intValue());
        }
    }

    public /* synthetic */ E(CollectionRowData collectionRowData, Ia.l lVar, androidx.compose.ui.h hVar, int i10, int i11) {
        this.f38829g = collectionRowData;
        this.f38825c = lVar;
        this.f38826d = hVar;
        this.f38827e = i10;
        this.f38828f = i11;
    }
}
