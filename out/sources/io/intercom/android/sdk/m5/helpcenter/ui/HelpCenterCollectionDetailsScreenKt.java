package io.intercom.android.sdk.m5.helpcenter.ui;

import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.W;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.E;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.N0;
import androidx.compose.runtime.X;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import io.intercom.android.sdk.m5.conversation.ui.Q;
import io.intercom.android.sdk.m5.helpcenter.HelpCenterViewModel;
import io.intercom.android.sdk.m5.helpcenter.states.CollectionDetailsRow;
import io.intercom.android.sdk.m5.helpcenter.states.CollectionDetailsUiState;
import io.intercom.android.sdk.m5.helpcenter.ui.components.ArticleRowComponentKt;
import io.intercom.android.sdk.m5.helpcenter.ui.components.CollectionRowComponentKt;
import io.intercom.android.sdk.m5.helpcenter.ui.components.CollectionSummaryComponentKt;
import io.intercom.android.sdk.m5.helpcenter.ui.components.TeamPresenceComponentKt;
import io.intercom.android.sdk.ui.component.IntercomDividerKt;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.A;

/* JADX INFO: compiled from: HelpCenterCollectionDetailsScreen.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class HelpCenterCollectionDetailsScreenKt {

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.helpcenter.ui.HelpCenterCollectionDetailsScreenKt$HelpCenterCollectionDetailsScreen$2, reason: invalid class name */
    /* JADX INFO: compiled from: HelpCenterCollectionDetailsScreen.kt */
    @Aa.c(c = "io.intercom.android.sdk.m5.helpcenter.ui.HelpCenterCollectionDetailsScreenKt$HelpCenterCollectionDetailsScreen$2", f = "HelpCenterCollectionDetailsScreen.kt", l = {}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends SuspendLambda implements Ia.p<A, kotlin.coroutines.c<? super p293xa.r>, Object> {
        final /* synthetic */ String $collectionId;
        final /* synthetic */ HelpCenterViewModel $viewModel;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(HelpCenterViewModel helpCenterViewModel, String str, kotlin.coroutines.c<? super AnonymousClass2> cVar) {
            super(2, cVar);
            this.$viewModel = helpCenterViewModel;
            this.$collectionId = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
            return new AnonymousClass2(this.$viewModel, this.$collectionId, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
            this.$viewModel.fetchCollectionDetails(this.$collectionId);
            return p293xa.r.f47939a;
        }

        @Override // Ia.p
        public final Object invoke(A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
            return ((AnonymousClass2) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
        }
    }

    public static final void HelpCenterCollectionDetailsScreen(final HelpCenterViewModel viewModel, final String collectionId, Ia.l<? super String, p293xa.r> lVar, final Ia.l<? super String, p293xa.r> onCollectionClicked, InterfaceC1084f interfaceC1084f, final int i10, final int i11) {
        kotlin.jvm.internal.i.e(viewModel, "viewModel");
        kotlin.jvm.internal.i.e(collectionId, "collectionId");
        kotlin.jvm.internal.i.e(onCollectionClicked, "onCollectionClicked");
        C1086g c1086gP = interfaceC1084f.p(-1331499807);
        final Ia.l<? super String, p293xa.r> q10 = (i11 & 4) != 0 ? new Q(1) : lVar;
        E.d(new AnonymousClass2(viewModel, collectionId, null), c1086gP, "");
        final X xA = J0.a(viewModel.getCollectionDetailsState(), c1086gP, 8);
        androidx.compose.ui.f.a aVar = androidx.compose.ui.d.a.f13347n;
        FillElement fillElement = W.f10226c;
        c1086gP.L(-1710791525);
        boolean z10 = true;
        boolean zK = c1086gP.K(xA) | ((((i10 & 896) ^ 384) > 256 && c1086gP.K(q10)) || (i10 & 384) == 256);
        if ((((i10 & 7168) ^ 3072) <= 2048 || !c1086gP.K(onCollectionClicked)) && (i10 & 3072) != 2048) {
            z10 = false;
        }
        boolean z11 = zK | z10;
        Object objF = c1086gP.f();
        if (z11 || objF == InterfaceC1084f.a.f12980a) {
            objF = new Ia.l() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.b
                @Override // Ia.l
                public final Object invoke(Object obj) {
                    return HelpCenterCollectionDetailsScreenKt.HelpCenterCollectionDetailsScreen$lambda$2$lambda$1(xA, q10, onCollectionClicked, (androidx.compose.foundation.lazy.p) obj);
                }
            };
            c1086gP.E(objF);
        }
        c1086gP.T(false);
        LazyDslKt.a(fillElement, null, null, false, null, aVar, null, false, null, (Ia.l) objF, c1086gP, 196614, 478);
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.c
                @Override // Ia.p
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return HelpCenterCollectionDetailsScreenKt.HelpCenterCollectionDetailsScreen$lambda$3(viewModel, collectionId, q10, onCollectionClicked, i10, i11, (InterfaceC1084f) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r HelpCenterCollectionDetailsScreen$lambda$0(String it) {
        kotlin.jvm.internal.i.e(it, "it");
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r HelpCenterCollectionDetailsScreen$lambda$2$lambda$1(N0 state, Ia.l lVar, Ia.l onCollectionClicked, androidx.compose.foundation.lazy.p LazyColumn) {
        kotlin.jvm.internal.i.e(state, "$state");
        kotlin.jvm.internal.i.e(onCollectionClicked, "$onCollectionClicked");
        kotlin.jvm.internal.i.e(LazyColumn, "$this$LazyColumn");
        final CollectionDetailsUiState collectionDetailsUiState = (CollectionDetailsUiState) state.getValue();
        if (kotlin.jvm.internal.i.a(collectionDetailsUiState, CollectionDetailsUiState.Initial.INSTANCE) || kotlin.jvm.internal.i.a(collectionDetailsUiState, CollectionDetailsUiState.Loading.INSTANCE)) {
            androidx.compose.foundation.lazy.p.c(LazyColumn, null, ComposableSingletons$HelpCenterCollectionDetailsScreenKt.INSTANCE.m262getLambda1$intercom_sdk_base_release(), 3);
        } else if (collectionDetailsUiState instanceof CollectionDetailsUiState.Error) {
            androidx.compose.foundation.lazy.p.c(LazyColumn, null, new ComposableLambdaImpl(true, 211733483, new Ia.q<androidx.compose.foundation.lazy.b, InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.HelpCenterCollectionDetailsScreenKt$HelpCenterCollectionDetailsScreen$3$1$1
                @Override // Ia.q
                public /* bridge */ /* synthetic */ p293xa.r invoke(androidx.compose.foundation.lazy.b bVar, InterfaceC1084f interfaceC1084f, Integer num) {
                    invoke(bVar, interfaceC1084f, num.intValue());
                    return p293xa.r.f47939a;
                }

                public final void invoke(androidx.compose.foundation.lazy.b item, InterfaceC1084f interfaceC1084f, int i10) {
                    kotlin.jvm.internal.i.e(item, "$this$item");
                    if ((i10 & 14) == 0) {
                        i10 |= interfaceC1084f.K(item) ? 4 : 2;
                    }
                    if ((i10 & 91) == 18 && interfaceC1084f.s()) {
                        interfaceC1084f.w();
                    } else {
                        HelpCenterErrorScreenKt.HelpCenterErrorScreen(((CollectionDetailsUiState.Error) collectionDetailsUiState).getErrorState(), item.c(1.0f), interfaceC1084f, 0, 0);
                    }
                }
            }), 3);
        } else {
            if (!(collectionDetailsUiState instanceof CollectionDetailsUiState.Content)) {
                throw new NoWhenBranchMatchedException();
            }
            CollectionDetailsUiState.Content content = (CollectionDetailsUiState.Content) collectionDetailsUiState;
            if (content.getCollectionDetailsRows().isEmpty()) {
                androidx.compose.foundation.lazy.p.c(LazyColumn, null, ComposableSingletons$HelpCenterCollectionDetailsScreenKt.INSTANCE.m263getLambda2$intercom_sdk_base_release(), 3);
            } else {
                helpCenterSectionItems(LazyColumn, content, lVar, onCollectionClicked);
            }
        }
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r HelpCenterCollectionDetailsScreen$lambda$3(HelpCenterViewModel viewModel, String collectionId, Ia.l lVar, Ia.l onCollectionClicked, int i10, int i11, InterfaceC1084f interfaceC1084f, int i12) {
        kotlin.jvm.internal.i.e(viewModel, "$viewModel");
        kotlin.jvm.internal.i.e(collectionId, "$collectionId");
        kotlin.jvm.internal.i.e(onCollectionClicked, "$onCollectionClicked");
        HelpCenterCollectionDetailsScreen(viewModel, collectionId, lVar, onCollectionClicked, interfaceC1084f, L4.b.l(i10 | 1), i11);
        return p293xa.r.f47939a;
    }

    private static final void helpCenterSectionItems(androidx.compose.foundation.lazy.p pVar, final CollectionDetailsUiState.Content content, final Ia.l<? super String, p293xa.r> lVar, final Ia.l<? super String, p293xa.r> lVar2) {
        androidx.compose.foundation.lazy.p.c(pVar, null, new ComposableLambdaImpl(true, 1491252145, new Ia.q<androidx.compose.foundation.lazy.b, InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.HelpCenterCollectionDetailsScreenKt.helpCenterSectionItems.1
            @Override // Ia.q
            public /* bridge */ /* synthetic */ p293xa.r invoke(androidx.compose.foundation.lazy.b bVar, InterfaceC1084f interfaceC1084f, Integer num) {
                invoke(bVar, interfaceC1084f, num.intValue());
                return p293xa.r.f47939a;
            }

            public final void invoke(androidx.compose.foundation.lazy.b item, InterfaceC1084f interfaceC1084f, int i10) {
                kotlin.jvm.internal.i.e(item, "$this$item");
                if ((i10 & 81) == 16 && interfaceC1084f.s()) {
                    interfaceC1084f.w();
                } else {
                    CollectionSummaryComponentKt.CollectionSummaryComponent(content, null, interfaceC1084f, 8, 2);
                }
            }
        }), 3);
        final List<CollectionDetailsRow> collectionDetailsRows = content.getCollectionDetailsRows();
        final int i10 = 0;
        for (Object obj : collectionDetailsRows) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                kotlin.collections.l.x();
                throw null;
            }
            final CollectionDetailsRow collectionDetailsRow = (CollectionDetailsRow) obj;
            if (collectionDetailsRow instanceof CollectionDetailsRow.ArticleRow) {
                androidx.compose.foundation.lazy.p.c(pVar, null, new ComposableLambdaImpl(true, -103698696, new Ia.q<androidx.compose.foundation.lazy.b, InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.HelpCenterCollectionDetailsScreenKt$helpCenterSectionItems$2$1
                    @Override // Ia.q
                    public /* bridge */ /* synthetic */ p293xa.r invoke(androidx.compose.foundation.lazy.b bVar, InterfaceC1084f interfaceC1084f, Integer num) {
                        invoke(bVar, interfaceC1084f, num.intValue());
                        return p293xa.r.f47939a;
                    }

                    public final void invoke(androidx.compose.foundation.lazy.b item, InterfaceC1084f interfaceC1084f, int i12) {
                        kotlin.jvm.internal.i.e(item, "$this$item");
                        if ((i12 & 81) == 16 && interfaceC1084f.s()) {
                            interfaceC1084f.w();
                            return;
                        }
                        interfaceC1084f.L(153525508);
                        int i13 = i10;
                        androidx.compose.ui.h.a aVar = androidx.compose.ui.h.a.f13984b;
                        if (i13 == 0) {
                            Lb.a.a(interfaceC1084f, W.e(aVar, 16));
                        }
                        interfaceC1084f.D();
                        ArticleRowComponentKt.ArticleRowComponent(null, (CollectionDetailsRow.ArticleRow) collectionDetailsRow, lVar, interfaceC1084f, 0, 1);
                        if (i10 == collectionDetailsRows.size() - 1 || !(collectionDetailsRows.get(i10 + 1) instanceof CollectionDetailsRow.ArticleRow)) {
                            return;
                        }
                        float f10 = 16;
                        IntercomDividerKt.IntercomDivider(PaddingKt.j(aVar, f10, 0.0f, f10, 0.0f, 10), interfaceC1084f, 6, 0);
                    }
                }), 3);
            } else if (kotlin.jvm.internal.i.a(collectionDetailsRow, CollectionDetailsRow.FullHelpCenterRow.INSTANCE)) {
                androidx.compose.foundation.lazy.p.c(pVar, null, ComposableSingletons$HelpCenterCollectionDetailsScreenKt.INSTANCE.m264getLambda3$intercom_sdk_base_release(), 3);
            } else if (collectionDetailsRow instanceof CollectionDetailsRow.CollectionRow) {
                androidx.compose.foundation.lazy.p.c(pVar, null, new ComposableLambdaImpl(true, 1175818224, new Ia.q<androidx.compose.foundation.lazy.b, InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.HelpCenterCollectionDetailsScreenKt$helpCenterSectionItems$2$2
                    @Override // Ia.q
                    public /* bridge */ /* synthetic */ p293xa.r invoke(androidx.compose.foundation.lazy.b bVar, InterfaceC1084f interfaceC1084f, Integer num) {
                        invoke(bVar, interfaceC1084f, num.intValue());
                        return p293xa.r.f47939a;
                    }

                    public final void invoke(androidx.compose.foundation.lazy.b item, InterfaceC1084f interfaceC1084f, int i12) {
                        kotlin.jvm.internal.i.e(item, "$this$item");
                        if ((i12 & 81) == 16 && interfaceC1084f.s()) {
                            interfaceC1084f.w();
                        } else {
                            CollectionRowComponentKt.CollectionRowComponent(((CollectionDetailsRow.CollectionRow) collectionDetailsRow).getRowData(), lVar2, null, interfaceC1084f, 0, 4);
                        }
                    }
                }), 3);
            } else {
                if (!(collectionDetailsRow instanceof CollectionDetailsRow.SendMessageRow)) {
                    throw new NoWhenBranchMatchedException();
                }
                androidx.compose.foundation.lazy.p.c(pVar, null, new ComposableLambdaImpl(true, 1352146481, new Ia.q<androidx.compose.foundation.lazy.b, InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.HelpCenterCollectionDetailsScreenKt$helpCenterSectionItems$2$3
                    @Override // Ia.q
                    public /* bridge */ /* synthetic */ p293xa.r invoke(androidx.compose.foundation.lazy.b bVar, InterfaceC1084f interfaceC1084f, Integer num) {
                        invoke(bVar, interfaceC1084f, num.intValue());
                        return p293xa.r.f47939a;
                    }

                    public final void invoke(androidx.compose.foundation.lazy.b item, InterfaceC1084f interfaceC1084f, int i12) {
                        kotlin.jvm.internal.i.e(item, "$this$item");
                        if ((i12 & 81) == 16 && interfaceC1084f.s()) {
                            interfaceC1084f.w();
                        } else {
                            TeamPresenceComponentKt.TeamPresenceComponent(((CollectionDetailsRow.SendMessageRow) collectionDetailsRow).getTeamPresenceState(), false, null, interfaceC1084f, 48, 4);
                        }
                    }
                }), 3);
            }
            i10 = i11;
        }
    }
}
