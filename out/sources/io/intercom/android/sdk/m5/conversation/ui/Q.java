package io.intercom.android.sdk.m5.conversation.ui;

import android.content.Context;
import android.content.ContextWrapper;
import io.intercom.android.sdk.m5.conversation.states.AttributeData;
import io.intercom.android.sdk.m5.helpcenter.ui.HelpCenterCollectionDetailsScreenKt;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class Q implements Ia.l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f38477b;

    public /* synthetic */ Q(int i10) {
        this.f38477b = i10;
    }

    @Override // Ia.l
    public final Object invoke(Object obj) {
        switch (this.f38477b) {
            case 0:
                return ConversationScreenKt.ConversationScreenContent$lambda$63((AttributeData) obj);
            case 1:
                return HelpCenterCollectionDetailsScreenKt.HelpCenterCollectionDetailsScreen$lambda$0((String) obj);
            default:
                Context it = (Context) obj;
                kotlin.jvm.internal.i.e(it, "it");
                ContextWrapper contextWrapper = it instanceof ContextWrapper ? (ContextWrapper) it : null;
                if (contextWrapper != null) {
                    return contextWrapper.getBaseContext();
                }
                return null;
        }
    }
}
