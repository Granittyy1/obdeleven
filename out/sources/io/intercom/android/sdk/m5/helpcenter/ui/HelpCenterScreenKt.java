package io.intercom.android.sdk.m5.helpcenter.ui;

import android.content.Context;
import android.view.View;
import androidx.compose.foundation.C0932d;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.WindowInsetsPaddingKt;
import androidx.compose.foundation.layout.c0;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.O0;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.graphics.h0;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.navigation.compose.Q;
import com.google.android.gms.internal.measurement.C1787c0;
import io.intercom.android.sdk.helpcenter.search.IntercomArticleSearchActivity;
import io.intercom.android.sdk.m5.components.N;
import io.intercom.android.sdk.m5.conversation.ui.C2389d;
import io.intercom.android.sdk.m5.helpcenter.HelpCenterViewModel;
import io.intercom.android.sdk.m5.helpcenter.ui.components.HelpCenterTopBarKt;
import io.intercom.android.sdk.ui.common.StringProvider;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import java.util.List;
import java.util.WeakHashMap;
import me.zhanghai.android.materialprogressbar.R;
import p141l2.C2748s;
import p141l2.F;
import p141l2.H;
import p141l2.L;
import p141l2.P;

/* JADX INFO: compiled from: HelpCenterScreen.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class HelpCenterScreenKt {
    private static final String START_DESTINATION = "startDestination";

    public static final void HelpCenterNavGraph(final HelpCenterViewModel viewModel, final H navController, String startDestination, final List<String> collectionIds, androidx.compose.ui.h hVar, InterfaceC1084f interfaceC1084f, int i10, int i11) {
        kotlin.jvm.internal.i.e(viewModel, "viewModel");
        kotlin.jvm.internal.i.e(navController, "navController");
        kotlin.jvm.internal.i.e(startDestination, "startDestination");
        kotlin.jvm.internal.i.e(collectionIds, "collectionIds");
        C1086g c1086gP = interfaceC1084f.p(686627856);
        androidx.compose.ui.h hVar2 = (i11 & 16) != 0 ? androidx.compose.ui.h.a.f13984b : hVar;
        final Context context = (Context) c1086gP.x(AndroidCompositionLocals_androidKt.f14793b);
        Q.a(navController, startDestination, hVar2, null, null, null, null, null, null, null, new Ia.l() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.j
            @Override // Ia.l
            public final Object invoke(Object obj) {
                return HelpCenterScreenKt.HelpCenterNavGraph$lambda$3(viewModel, collectionIds, navController, context, (F) obj);
            }
        }, c1086gP, ((i10 >> 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 8 | ((i10 >> 6) & 896), 0, 1016);
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new k(viewModel, navController, startDestination, collectionIds, hVar2, i10, i11, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r HelpCenterNavGraph$lambda$3(HelpCenterViewModel viewModel, List collectionIds, H navController, Context context, F NavHost) {
        kotlin.jvm.internal.i.e(viewModel, "$viewModel");
        kotlin.jvm.internal.i.e(collectionIds, "$collectionIds");
        kotlin.jvm.internal.i.e(navController, "$navController");
        kotlin.jvm.internal.i.e(context, "$context");
        kotlin.jvm.internal.i.e(NavHost, "$this$NavHost");
        androidx.navigation.compose.u.a(NavHost, "COLLECTIONS", null, null, null, null, null, new ComposableLambdaImpl(true, -1869047411, new HelpCenterScreenKt$HelpCenterNavGraph$1$1(viewModel, collectionIds, navController)), 254);
        androidx.navigation.compose.u.a(NavHost, "COLLECTION_DETAILS/{id}?startDestination={startDestination}", kotlin.collections.l.s(L4.b.e(new C2389d(2), "id"), L4.b.e(new N(3), START_DESTINATION)), null, null, null, null, new ComposableLambdaImpl(true, 2018839094, new HelpCenterScreenKt$HelpCenterNavGraph$1$4(viewModel, context, navController)), 252);
        androidx.navigation.compose.u.a(NavHost, "COLLECTION_DETAILS", null, null, null, null, null, new ComposableLambdaImpl(true, -157077227, new HelpCenterScreenKt$HelpCenterNavGraph$1$5(viewModel, collectionIds, context, navController)), 254);
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r HelpCenterNavGraph$lambda$3$lambda$1(C2748s navArgument) {
        kotlin.jvm.internal.i.e(navArgument, "$this$navArgument");
        navArgument.b(L.StringType);
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r HelpCenterNavGraph$lambda$3$lambda$2(C2748s navArgument) {
        kotlin.jvm.internal.i.e(navArgument, "$this$navArgument");
        navArgument.b(L.BoolType);
        navArgument.a(Boolean.FALSE);
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r HelpCenterNavGraph$lambda$4(HelpCenterViewModel viewModel, H navController, String startDestination, List collectionIds, androidx.compose.ui.h hVar, int i10, int i11, InterfaceC1084f interfaceC1084f, int i12) {
        kotlin.jvm.internal.i.e(viewModel, "$viewModel");
        kotlin.jvm.internal.i.e(navController, "$navController");
        kotlin.jvm.internal.i.e(startDestination, "$startDestination");
        kotlin.jvm.internal.i.e(collectionIds, "$collectionIds");
        HelpCenterNavGraph(viewModel, navController, startDestination, collectionIds, hVar, interfaceC1084f, L4.b.l(i10 | 1), i11);
        return p293xa.r.f47939a;
    }

    public static final void HelpCenterScreen(final HelpCenterViewModel viewModel, final List<String> collectionIds, final Ia.a<p293xa.r> onCloseClick, final int i10, InterfaceC1084f interfaceC1084f, final int i11) {
        kotlin.jvm.internal.i.e(viewModel, "viewModel");
        kotlin.jvm.internal.i.e(collectionIds, "collectionIds");
        kotlin.jvm.internal.i.e(onCloseClick, "onCloseClick");
        C1086g c1086gP = interfaceC1084f.p(1421214035);
        O0 o10 = AndroidCompositionLocals_androidKt.f14793b;
        CompositionLocalKt.a(o10.b(viewModel.localizedContext((Context) c1086gP.x(o10))), androidx.compose.runtime.internal.a.b(-267860845, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.HelpCenterScreenKt.HelpCenterScreen.1

            /* JADX INFO: renamed from: io.intercom.android.sdk.m5.helpcenter.ui.HelpCenterScreenKt$HelpCenterScreen$1$1, reason: invalid class name and collision with other inner class name */
            /* JADX INFO: compiled from: HelpCenterScreen.kt */
            public static final class C04251 implements Ia.p<InterfaceC1084f, Integer, p293xa.r> {
                final /* synthetic */ Context $context;
                final /* synthetic */ H $navController;
                final /* synthetic */ int $navIcon;
                final /* synthetic */ Ia.a<p293xa.r> $onCloseClick;
                final /* synthetic */ HelpCenterViewModel $viewModel;

                public C04251(H h8, int i10, HelpCenterViewModel helpCenterViewModel, Ia.a<p293xa.r> aVar, Context context) {
                    this.$navController = h8;
                    this.$navIcon = i10;
                    this.$viewModel = helpCenterViewModel;
                    this.$onCloseClick = aVar;
                    this.$context = context;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final p293xa.r invoke$lambda$0(H navController, Ia.a onCloseClick) {
                    kotlin.jvm.internal.i.e(navController, "$navController");
                    kotlin.jvm.internal.i.e(onCloseClick, "$onCloseClick");
                    if (navController.b() == null) {
                        onCloseClick.invoke();
                    } else {
                        navController.e();
                    }
                    return p293xa.r.f47939a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final p293xa.r invoke$lambda$1(Context context) {
                    kotlin.jvm.internal.i.e(context, "$context");
                    context.startActivity(IntercomArticleSearchActivity.Companion.buildIntent(context, false));
                    return p293xa.r.f47939a;
                }

                @Override // Ia.p
                public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f, Integer num) {
                    invoke(interfaceC1084f, num.intValue());
                    return p293xa.r.f47939a;
                }

                public final void invoke(InterfaceC1084f interfaceC1084f, int i10) {
                    if ((i10 & 11) == 2 && interfaceC1084f.s()) {
                        interfaceC1084f.w();
                        return;
                    }
                    final H h8 = this.$navController;
                    final Ia.a<p293xa.r> aVar = this.$onCloseClick;
                    Ia.a aVar2 = new Ia.a() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.u
                        @Override // Ia.a
                        public final Object invoke() {
                            return HelpCenterScreenKt.AnonymousClass1.C04251.invoke$lambda$0(h8, aVar);
                        }
                    };
                    final Context context = this.$context;
                    HelpCenterTopBarKt.HelpCenterTopBar(aVar2, new Ia.a() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.v
                        @Override // Ia.a
                        public final Object invoke() {
                            return HelpCenterScreenKt.AnonymousClass1.C04251.invoke$lambda$1(context);
                        }
                    }, h8.b() == null ? this.$navIcon : io.intercom.android.sdk.ui.R.drawable.intercom_ic_back, this.$viewModel.getScreenTitle(), interfaceC1084f, StringProvider.$stable << 9, 0);
                }
            }

            @Override // Ia.p
            public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                invoke(interfaceC1084f2, num.intValue());
                return p293xa.r.f47939a;
            }

            public final void invoke(InterfaceC1084f interfaceC1084f2, int i12) {
                if ((i12 & 11) == 2 && interfaceC1084f2.s()) {
                    interfaceC1084f2.w();
                    return;
                }
                final H hS = C1787c0.s(new P[0], interfaceC1084f2);
                Context context = (Context) interfaceC1084f2.x(AndroidCompositionLocals_androidKt.f14793b);
                androidx.compose.ui.h hVarB = C0932d.b(androidx.compose.ui.h.a.f13984b, IntercomTheme.INSTANCE.getColors(interfaceC1084f2, IntercomTheme.$stable).m621getBackground0d7_KjU(), h0.f13629a);
                WeakHashMap<View, c0> weakHashMap = c0.f10254v;
                androidx.compose.ui.h hVarC = WindowInsetsPaddingKt.c(hVarB, c0.a.c(interfaceC1084f2).f10256b);
                ComposableLambdaImpl composableLambdaImplB = androidx.compose.runtime.internal.a.b(1261102927, new C04251(hS, i10, viewModel, onCloseClick, context), interfaceC1084f2);
                final List<String> list = collectionIds;
                final HelpCenterViewModel helpCenterViewModel = viewModel;
                ScaffoldKt.a(hVarC, composableLambdaImplB, null, null, null, 0, 0L, 0L, null, androidx.compose.runtime.internal.a.b(900356900, new Ia.q<androidx.compose.foundation.layout.L, InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.HelpCenterScreenKt.HelpCenterScreen.1.2
                    @Override // Ia.q
                    public /* bridge */ /* synthetic */ p293xa.r invoke(androidx.compose.foundation.layout.L l10, InterfaceC1084f interfaceC1084f3, Integer num) {
                        invoke(l10, interfaceC1084f3, num.intValue());
                        return p293xa.r.f47939a;
                    }

                    public final void invoke(androidx.compose.foundation.layout.L paddingValues, InterfaceC1084f interfaceC1084f3, int i13) {
                        kotlin.jvm.internal.i.e(paddingValues, "paddingValues");
                        if ((i13 & 14) == 0) {
                            i13 |= interfaceC1084f3.K(paddingValues) ? 4 : 2;
                        }
                        if ((i13 & 91) == 18 && interfaceC1084f3.s()) {
                            interfaceC1084f3.w();
                        } else {
                            HelpCenterScreenKt.HelpCenterNavGraph(helpCenterViewModel, hS, list.size() == 1 ? "COLLECTION_DETAILS" : "COLLECTIONS", list, PaddingKt.e(androidx.compose.ui.h.a.f13984b, paddingValues), interfaceC1084f3, 4168, 0);
                        }
                    }
                }, interfaceC1084f2), interfaceC1084f2, 805306416, 508);
            }
        }, c1086gP), c1086gP, 56);
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.l
                @Override // Ia.p
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return HelpCenterScreenKt.HelpCenterScreen$lambda$0(viewModel, collectionIds, onCloseClick, i10, i11, (InterfaceC1084f) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r HelpCenterScreen$lambda$0(HelpCenterViewModel viewModel, List collectionIds, Ia.a onCloseClick, int i10, int i11, InterfaceC1084f interfaceC1084f, int i12) {
        kotlin.jvm.internal.i.e(viewModel, "$viewModel");
        kotlin.jvm.internal.i.e(collectionIds, "$collectionIds");
        kotlin.jvm.internal.i.e(onCloseClick, "$onCloseClick");
        HelpCenterScreen(viewModel, collectionIds, onCloseClick, i10, interfaceC1084f, L4.b.l(i11 | 1));
        return p293xa.r.f47939a;
    }
}
