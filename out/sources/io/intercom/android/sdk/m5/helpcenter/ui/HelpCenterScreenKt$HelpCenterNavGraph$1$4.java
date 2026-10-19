package io.intercom.android.sdk.m5.helpcenter.ui;

import android.content.Context;
import android.os.Bundle;
import androidx.compose.animation.InterfaceC0900c;
import androidx.compose.runtime.InterfaceC1084f;
import io.intercom.android.sdk.helpcenter.articles.IntercomArticleActivity;
import io.intercom.android.sdk.m5.helpcenter.HelpCenterViewModel;
import io.intercom.android.sdk.metrics.MetricTracker;
import p141l2.C2749t;
import p141l2.H;
import p141l2.w;

/* JADX INFO: compiled from: HelpCenterScreen.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class HelpCenterScreenKt$HelpCenterNavGraph$1$4 implements Ia.r<InterfaceC0900c, C2749t, InterfaceC1084f, Integer, p293xa.r> {
    final /* synthetic */ Context $context;
    final /* synthetic */ H $navController;
    final /* synthetic */ HelpCenterViewModel $viewModel;

    public HelpCenterScreenKt$HelpCenterNavGraph$1$4(HelpCenterViewModel helpCenterViewModel, Context context, H h8) {
        this.$viewModel = helpCenterViewModel;
        this.$context = context;
        this.$navController = h8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r invoke$lambda$0(HelpCenterViewModel viewModel, Context context, String articleId) {
        kotlin.jvm.internal.i.e(viewModel, "$viewModel");
        kotlin.jvm.internal.i.e(context, "$context");
        kotlin.jvm.internal.i.e(articleId, "articleId");
        viewModel.onArticleClicked();
        context.startActivity(IntercomArticleActivity.Companion.buildIntent(context, new IntercomArticleActivity.ArticleActivityArguments(articleId, MetricTracker.Place.COLLECTION_LIST, false, false, 8, null)));
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r invoke$lambda$1(H navController, String subCollectionId) {
        kotlin.jvm.internal.i.e(navController, "$navController");
        kotlin.jvm.internal.i.e(subCollectionId, "subCollectionId");
        w.d(navController, "COLLECTION_DETAILS/".concat(subCollectionId), null, 6);
        return p293xa.r.f47939a;
    }

    public final void invoke(InterfaceC0900c composable, C2749t it, InterfaceC1084f interfaceC1084f, int i10) {
        String string;
        kotlin.jvm.internal.i.e(composable, "$this$composable");
        kotlin.jvm.internal.i.e(it, "it");
        Bundle bundleA = it.f44305i.a();
        if (bundleA == null || (string = bundleA.getString("id")) == null) {
            string = "";
        }
        String str = string;
        final HelpCenterViewModel helpCenterViewModel = this.$viewModel;
        final Context context = this.$context;
        Ia.l lVar = new Ia.l() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.q
            @Override // Ia.l
            public final Object invoke(Object obj) {
                return HelpCenterScreenKt$HelpCenterNavGraph$1$4.invoke$lambda$0(helpCenterViewModel, context, (String) obj);
            }
        };
        final H h8 = this.$navController;
        HelpCenterCollectionDetailsScreenKt.HelpCenterCollectionDetailsScreen(helpCenterViewModel, str, lVar, new Ia.l() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.r
            @Override // Ia.l
            public final Object invoke(Object obj) {
                return HelpCenterScreenKt$HelpCenterNavGraph$1$4.invoke$lambda$1(h8, (String) obj);
            }
        }, interfaceC1084f, 8, 0);
    }

    @Override // Ia.r
    public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC0900c interfaceC0900c, C2749t c2749t, InterfaceC1084f interfaceC1084f, Integer num) {
        invoke(interfaceC0900c, c2749t, interfaceC1084f, num.intValue());
        return p293xa.r.f47939a;
    }
}
