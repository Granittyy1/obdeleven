package io.intercom.android.sdk.survey.block;

import io.intercom.android.sdk.survey.ui.questiontype.choice.ChoicePillKt;
import java.util.List;
import p141l2.C;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class e implements Ia.l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f39481b;

    public /* synthetic */ e(int i10) {
        this.f39481b = i10;
    }

    @Override // Ia.l
    public final Object invoke(Object obj) {
        switch (this.f39481b) {
            case 0:
                return BlockViewKt.BlockView$lambda$0((List) obj);
            case 1:
                return ChoicePillKt.ChoicePill_UdaoDFU$lambda$0((String) obj);
            default:
                C it = (C) obj;
                kotlin.jvm.internal.i.e(it, "it");
                return Integer.valueOf(it.f44219c.f44813d);
        }
    }
}
