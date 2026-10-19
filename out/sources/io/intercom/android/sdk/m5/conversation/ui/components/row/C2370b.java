package io.intercom.android.sdk.m5.conversation.ui.components.row;

import android.content.Context;
import android.content.ContextWrapper;
import io.intercom.android.sdk.survey.ui.components.SurveyComponentKt;

/* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ui.components.row.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C2370b implements Ia.l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f38864b;

    public /* synthetic */ C2370b(int i10) {
        this.f38864b = i10;
    }

    @Override // Ia.l
    public final Object invoke(Object obj) {
        switch (this.f38864b) {
            case 0:
                return Integer.valueOf(BigTicketCardKt.BigTicketCard$lambda$0(((Integer) obj).intValue()));
            case 1:
                return SurveyComponentKt.SurveyComponent$lambda$0((String) obj);
            default:
                Context it = (Context) obj;
                kotlin.jvm.internal.i.e(it, "it");
                if (it instanceof ContextWrapper) {
                    return ((ContextWrapper) it).getBaseContext();
                }
                return null;
        }
    }
}
