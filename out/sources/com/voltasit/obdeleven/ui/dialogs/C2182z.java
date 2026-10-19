package com.voltasit.obdeleven.ui.dialogs;

import io.intercom.android.sdk.m5.conversation.states.PendingMessage;
import io.intercom.android.sdk.m5.conversation.ui.components.row.BubbleMessageRowKt;

/* JADX INFO: renamed from: com.voltasit.obdeleven.ui.dialogs.z, reason: case insensitive filesystem */
/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C2182z implements Ia.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f34062b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f34063c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f34064d;

    public /* synthetic */ C2182z(Object obj, int i10, Object obj2) {
        this.f34062b = i10;
        this.f34063c = obj;
        this.f34064d = obj2;
    }

    @Override // Ia.a
    public final Object invoke() {
        switch (this.f34062b) {
            case 0:
                B b10 = (B) this.f34063c;
                b10.getClass();
                p255u9.z zVar = (p255u9.z) this.f34064d;
                zVar.addUnique("roles", "DEVELOPER");
                zVar.saveInBackground();
                b10.c();
                return null;
            default:
                return BubbleMessageRowKt.MessageContent_993knro$lambda$11$lambda$10$lambda$9$lambda$8((Ia.l) this.f34063c, (PendingMessage.FailedImageUploadData) this.f34064d);
        }
    }
}
