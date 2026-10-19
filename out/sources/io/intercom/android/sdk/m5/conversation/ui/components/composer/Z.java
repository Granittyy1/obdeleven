package io.intercom.android.sdk.m5.conversation.ui.components.composer;

import androidx.compose.runtime.InterfaceC1084f;
import io.intercom.android.sdk.m5.conversation.ui.components.row.QuickRepliesKt;
import java.util.List;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class Z implements Ia.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f38672b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.h f38673c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f38674d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f38675e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f38676f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p293xa.e f38677g;

    public /* synthetic */ Z(int i10, int i11, Ia.l lVar, androidx.compose.ui.h hVar, List list) {
        this.f38673c = hVar;
        this.f38676f = list;
        this.f38677g = lVar;
        this.f38674d = i10;
        this.f38675e = i11;
    }

    @Override // Ia.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f38672b) {
            case 0:
                return PrivacyPolicyKt.PrivacyPolicy$lambda$2((String) this.f38676f, this.f38673c, (Ia.a) this.f38677g, this.f38674d, this.f38675e, (InterfaceC1084f) obj, ((Integer) obj2).intValue());
            default:
                return QuickRepliesKt.ReplyOptions$lambda$5(this.f38673c, (List) this.f38676f, (Ia.l) this.f38677g, this.f38674d, this.f38675e, (InterfaceC1084f) obj, ((Integer) obj2).intValue());
        }
    }

    public /* synthetic */ Z(String str, androidx.compose.ui.h hVar, Ia.a aVar, int i10, int i11) {
        this.f38676f = str;
        this.f38673c = hVar;
        this.f38677g = aVar;
        this.f38674d = i10;
        this.f38675e = i11;
    }
}
