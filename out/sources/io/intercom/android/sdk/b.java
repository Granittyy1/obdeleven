package io.intercom.android.sdk;

import androidx.compose.runtime.X;
import io.intercom.android.sdk.helpcenter.search.IntercomArticleSearchActivity;
import io.intercom.android.sdk.m5.helpcenter.HelpCenterViewModel;
import io.intercom.android.sdk.survey.ui.questiontype.dropdown.DropDownQuestionKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import p141l2.z;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements Ia.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f38050b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f38051c;

    public /* synthetic */ b(int i10, Object obj) {
        this.f38050b = i10;
        this.f38051c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, xa.g] */
    @Override // Ia.a
    public final Object invoke() {
        List list;
        switch (this.f38050b) {
            case 0:
                return AppIdentityInjector.kotlinXRetrofit_delegate$lambda$5((AppIdentityInjector) this.f38051c);
            case 1:
                return IntercomArticleSearchActivity.viewModel_delegate$lambda$0((IntercomArticleSearchActivity) this.f38051c);
            case 2:
                return HelpCenterViewModel.searchBrowseTeamPresenceState_delegate$lambda$0((HelpCenterViewModel) this.f38051c);
            case 3:
                return DropDownQuestionKt.DropDownQuestion$lambda$10$lambda$9$lambda$8$lambda$7$lambda$6((X) this.f38051c);
            default:
                Pair pair = (Pair) ((z) this.f38051c).f44334h.getValue();
                return (pair == null || (list = (List) pair.c()) == null) ? new ArrayList() : list;
        }
    }
}
