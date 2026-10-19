package io.intercom.android.sdk.m5.conversation.ui.components.row;

import android.content.Context;
import io.intercom.android.sdk.models.Header;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class F implements Ia.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f38830b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f38831c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f38832d;

    public /* synthetic */ F(Object obj, int i10, Object obj2) {
        this.f38830b = i10;
        this.f38831c = obj;
        this.f38832d = obj2;
    }

    @Override // Ia.a
    public final Object invoke() {
        switch (this.f38830b) {
            case 0:
                return QuickRepliesKt.AnonymousClass1.invoke$lambda$2$lambda$1$lambda$0((Ia.l) this.f38831c, (QuickReply) this.f38832d);
            default:
                return ExpandedTeamPresenceLayoutKt.ExpandedTeamPresenceLayout$lambda$8$lambda$4$lambda$3$lambda$2((Header.Expanded.SocialAccount) this.f38831c, (Context) this.f38832d);
        }
    }
}
