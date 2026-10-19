package io.intercom.android.sdk.m5.helpcenter.ui;

import androidx.compose.animation.InterfaceC0900c;
import androidx.compose.runtime.InterfaceC1084f;
import io.intercom.android.sdk.m5.helpcenter.HelpCenterViewModel;
import java.util.List;
import p141l2.C2749t;
import p141l2.H;
import p141l2.K;
import p141l2.T;
import p141l2.w;

/* JADX INFO: compiled from: HelpCenterScreen.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class HelpCenterScreenKt$HelpCenterNavGraph$1$1 implements Ia.r<InterfaceC0900c, C2749t, InterfaceC1084f, Integer, p293xa.r> {
    final /* synthetic */ List<String> $collectionIds;
    final /* synthetic */ H $navController;
    final /* synthetic */ HelpCenterViewModel $viewModel;

    public HelpCenterScreenKt$HelpCenterNavGraph$1$1(HelpCenterViewModel helpCenterViewModel, List<String> list, H h8) {
        this.$viewModel = helpCenterViewModel;
        this.$collectionIds = list;
        this.$navController = h8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r invoke$lambda$0(H navController, String collectionId) {
        kotlin.jvm.internal.i.e(navController, "$navController");
        kotlin.jvm.internal.i.e(collectionId, "collectionId");
        w.d(navController, "COLLECTION_DETAILS/".concat(collectionId), null, 6);
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r invoke$lambda$3(H navController, String collectionId) {
        kotlin.jvm.internal.i.e(navController, "$navController");
        kotlin.jvm.internal.i.e(collectionId, "collectionId");
        navController.c(new n(), Q8.d.a(new StringBuilder("COLLECTION_DETAILS/"), collectionId, "?startDestination=true"));
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r invoke$lambda$3$lambda$2(K navigate) {
        kotlin.jvm.internal.i.e(navigate, "$this$navigate");
        navigate.a(new m(), "COLLECTIONS");
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r invoke$lambda$3$lambda$2$lambda$1(T popUpTo) {
        kotlin.jvm.internal.i.e(popUpTo, "$this$popUpTo");
        popUpTo.f44280a = true;
        return p293xa.r.f47939a;
    }

    @Override // Ia.r
    public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC0900c interfaceC0900c, C2749t c2749t, InterfaceC1084f interfaceC1084f, Integer num) {
        invoke(interfaceC0900c, c2749t, interfaceC1084f, num.intValue());
        return p293xa.r.f47939a;
    }

    public final void invoke(InterfaceC0900c composable, C2749t it, InterfaceC1084f interfaceC1084f, int i10) {
        kotlin.jvm.internal.i.e(composable, "$this$composable");
        kotlin.jvm.internal.i.e(it, "it");
        HelpCenterViewModel helpCenterViewModel = this.$viewModel;
        List<String> list = this.$collectionIds;
        final H h8 = this.$navController;
        HelpCenterCollectionsScreenKt.HelpCenterCollectionsScreen(helpCenterViewModel, list, new Ia.l() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.o
            @Override // Ia.l
            public final Object invoke(Object obj) {
                return HelpCenterScreenKt$HelpCenterNavGraph$1$1.invoke$lambda$0(h8, (String) obj);
            }
        }, new Ia.l() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.p
            @Override // Ia.l
            public final Object invoke(Object obj) {
                return HelpCenterScreenKt$HelpCenterNavGraph$1$1.invoke$lambda$3(h8, (String) obj);
            }
        }, interfaceC1084f, 72);
    }
}
