package androidx.navigation.compose;

import io.intercom.android.sdk.m5.helpcenter.ui.components.ArticleRowComponentKt;
import io.intercom.android.sdk.survey.block.BlockViewKt;
import io.intercom.android.sdk.survey.ui.models.Answer;
import io.intercom.android.sdk.survey.ui.questiontype.text.LongTextQuestionKt;
import io.intercom.android.sdk.tickets.list.ui.TicketsScreenKt;
import p141l2.C2749t;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class F implements Ia.l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f19097b;

    public /* synthetic */ F(int i10) {
        this.f19097b = i10;
    }

    @Override // Ia.l
    public final Object invoke(Object obj) {
        switch (this.f19097b) {
            case 0:
                return ((C2749t) obj).f44303g;
            case 1:
                return ArticleRowComponentKt.ArticleRowComponent$lambda$0((String) obj);
            case 2:
                return BlockViewKt.BlockView$lambda$1((androidx.compose.ui.text.B) obj);
            case 3:
                return LongTextQuestionKt.LongTextPreview$lambda$6((Answer) obj);
            default:
                return TicketsScreenKt.TicketsScreenContent$lambda$2((String) obj);
        }
    }
}
