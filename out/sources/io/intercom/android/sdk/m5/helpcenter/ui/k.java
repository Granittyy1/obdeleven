package io.intercom.android.sdk.m5.helpcenter.ui;

import androidx.compose.runtime.InterfaceC1084f;
import androidx.lifecycle.Y;
import io.intercom.android.sdk.m5.helpcenter.HelpCenterViewModel;
import io.intercom.android.sdk.m5.inbox.InboxViewModel;
import io.intercom.android.sdk.m5.inbox.ui.InboxScreenKt;
import java.util.List;
import p141l2.H;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class k implements Ia.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f39181b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f39182c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f39183d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Y f39184e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f39185f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f39186g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f39187h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f39188i;

    public /* synthetic */ k(Y y10, Object obj, Object obj2, Object obj3, Object obj4, int i10, int i11, int i12) {
        this.f39181b = i12;
        this.f39184e = y10;
        this.f39185f = obj;
        this.f39186g = obj2;
        this.f39187h = obj3;
        this.f39188i = obj4;
        this.f39182c = i10;
        this.f39183d = i11;
    }

    @Override // Ia.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f39181b) {
            case 0:
                return HelpCenterScreenKt.HelpCenterNavGraph$lambda$4((HelpCenterViewModel) this.f39184e, (H) this.f39185f, (String) this.f39186g, (List) this.f39187h, (androidx.compose.ui.h) this.f39188i, this.f39182c, this.f39183d, (InterfaceC1084f) obj, ((Integer) obj2).intValue());
            default:
                return InboxScreenKt.InboxScreen$lambda$3((InboxViewModel) this.f39184e, (Ia.a) this.f39185f, (Ia.a) this.f39186g, (Ia.a) this.f39187h, (Ia.l) this.f39188i, this.f39182c, this.f39183d, (InterfaceC1084f) obj, ((Integer) obj2).intValue());
        }
    }
}
