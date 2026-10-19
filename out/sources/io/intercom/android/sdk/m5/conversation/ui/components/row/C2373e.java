package io.intercom.android.sdk.m5.conversation.ui.components.row;

import io.intercom.android.sdk.m5.conversation.states.AttributeData;
import io.intercom.android.sdk.survey.ui.components.SurveyComponentKt;

/* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ui.components.row.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C2373e implements Ia.l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f38886b;

    public /* synthetic */ C2373e(int i10) {
        this.f38886b = i10;
    }

    @Override // Ia.l
    public final Object invoke(Object obj) {
        switch (this.f38886b) {
            case 0:
                return BubbleMessageRowKt.BubbleMessageRow$lambda$0((AttributeData) obj);
            case 1:
                return SurveyComponentKt.SurveyErrorState$lambda$11((kotlinx.coroutines.A) obj);
            default:
                p141l2.C destination = (p141l2.C) obj;
                kotlin.jvm.internal.i.e(destination, "destination");
                p141l2.E e10 = destination.f44220d;
                if (e10 == null || e10.f44235g.f44821c != destination.f44219c.f44813d) {
                    return null;
                }
                return e10;
        }
    }
}
