package io.intercom.android.sdk.m5.helpcenter.ui;

import android.content.Context;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.W;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.E;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.N0;
import androidx.compose.runtime.X;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.navigation.compose.J;
import io.intercom.android.sdk.m5.helpcenter.HelpCenterViewModel;
import io.intercom.android.sdk.m5.helpcenter.states.CollectionsRow;
import io.intercom.android.sdk.m5.helpcenter.states.CollectionsUiEffects;
import io.intercom.android.sdk.m5.helpcenter.states.CollectionsUiState;
import io.intercom.android.sdk.m5.helpcenter.ui.components.BrowseAllHelpTopicsComponentKt;
import io.intercom.android.sdk.m5.helpcenter.ui.components.CollectionRowComponentKt;
import io.intercom.android.sdk.m5.helpcenter.ui.components.TeamPresenceComponentKt;
import io.intercom.android.sdk.ui.component.IntercomDividerKt;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.utilities.Phrase;
import java.util.ArrayList;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.A;
import kotlinx.coroutines.flow.InterfaceC2687d;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: HelpCenterCollectionsScreen.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class HelpCenterCollectionsScreenKt {

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.helpcenter.ui.HelpCenterCollectionsScreenKt$HelpCenterCollectionsScreen$1, reason: invalid class name */
    /* JADX INFO: compiled from: HelpCenterCollectionsScreen.kt */
    @Aa.c(c = "io.intercom.android.sdk.m5.helpcenter.ui.HelpCenterCollectionsScreenKt$HelpCenterCollectionsScreen$1", f = "HelpCenterCollectionsScreen.kt", l = {}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends SuspendLambda implements Ia.p<A, kotlin.coroutines.c<? super p293xa.r>, Object> {
        final /* synthetic */ List<String> $collectionIds;
        final /* synthetic */ HelpCenterViewModel $viewModel;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(HelpCenterViewModel helpCenterViewModel, List<String> list, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.$viewModel = helpCenterViewModel;
            this.$collectionIds = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
            return new AnonymousClass1(this.$viewModel, this.$collectionIds, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
            this.$viewModel.fetchCollections(kotlin.collections.q.s0(this.$collectionIds));
            return p293xa.r.f47939a;
        }

        @Override // Ia.p
        public final Object invoke(A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
            return ((AnonymousClass1) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.helpcenter.ui.HelpCenterCollectionsScreenKt$HelpCenterCollectionsScreen$2, reason: invalid class name */
    /* JADX INFO: compiled from: HelpCenterCollectionsScreen.kt */
    @Aa.c(c = "io.intercom.android.sdk.m5.helpcenter.ui.HelpCenterCollectionsScreenKt$HelpCenterCollectionsScreen$2", f = "HelpCenterCollectionsScreen.kt", l = {R.styleable.AppCompatTheme_buttonStyleSmall}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends SuspendLambda implements Ia.p<A, kotlin.coroutines.c<? super p293xa.r>, Object> {
        final /* synthetic */ Ia.l<String, p293xa.r> $onAutoNavigateToCollection;
        final /* synthetic */ HelpCenterViewModel $viewModel;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(HelpCenterViewModel helpCenterViewModel, Ia.l<? super String, p293xa.r> lVar, kotlin.coroutines.c<? super AnonymousClass2> cVar) {
            super(2, cVar);
            this.$viewModel = helpCenterViewModel;
            this.$onAutoNavigateToCollection = lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
            return new AnonymousClass2(this.$viewModel, this.$onAutoNavigateToCollection, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            int i10 = this.label;
            if (i10 == 0) {
                kotlin.b.b(obj);
                kotlinx.coroutines.flow.u<CollectionsUiEffects> effect = this.$viewModel.getEffect();
                final Ia.l<String, p293xa.r> lVar = this.$onAutoNavigateToCollection;
                InterfaceC2687d<? super CollectionsUiEffects> interfaceC2687d = new InterfaceC2687d() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.HelpCenterCollectionsScreenKt.HelpCenterCollectionsScreen.2.1
                    @Override // kotlinx.coroutines.flow.InterfaceC2687d
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, kotlin.coroutines.c cVar) {
                        return emit((CollectionsUiEffects) obj2, (kotlin.coroutines.c<? super p293xa.r>) cVar);
                    }

                    public final Object emit(CollectionsUiEffects collectionsUiEffects, kotlin.coroutines.c<? super p293xa.r> cVar) {
                        if (!(collectionsUiEffects instanceof CollectionsUiEffects.NavigateToCollectionContent)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        lVar.invoke(((CollectionsUiEffects.NavigateToCollectionContent) collectionsUiEffects).getCollectionId());
                        return p293xa.r.f47939a;
                    }
                };
                this.label = 1;
                if (effect.collect(interfaceC2687d, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
            }
            throw new KotlinNothingValueException();
        }

        @Override // Ia.p
        public final Object invoke(A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
            return ((AnonymousClass2) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
        }
    }

    public static final void HelpCenterCollectionsScreen(final HelpCenterViewModel viewModel, final List<String> collectionIds, final Ia.l<? super String, p293xa.r> onCollectionClick, final Ia.l<? super String, p293xa.r> onAutoNavigateToCollection, InterfaceC1084f interfaceC1084f, final int i10) {
        kotlin.jvm.internal.i.e(viewModel, "viewModel");
        kotlin.jvm.internal.i.e(collectionIds, "collectionIds");
        kotlin.jvm.internal.i.e(onCollectionClick, "onCollectionClick");
        kotlin.jvm.internal.i.e(onAutoNavigateToCollection, "onAutoNavigateToCollection");
        C1086g c1086gP = interfaceC1084f.p(-1836627764);
        E.d(new AnonymousClass1(viewModel, collectionIds, null), c1086gP, "");
        E.d(new AnonymousClass2(viewModel, onAutoNavigateToCollection, null), c1086gP, "");
        X xA = J0.a(viewModel.getCollectionsState(), c1086gP, 8);
        androidx.compose.ui.f.a aVar = androidx.compose.ui.d.a.f13347n;
        FillElement fillElement = W.f10226c;
        c1086gP.L(2138903112);
        boolean zK = c1086gP.K(xA) | ((((i10 & 896) ^ 384) > 256 && c1086gP.K(onCollectionClick)) || (i10 & 384) == 256);
        Object objF = c1086gP.f();
        if (zK || objF == InterfaceC1084f.a.f12980a) {
            objF = new J(xA, 1, onCollectionClick);
            c1086gP.E(objF);
        }
        c1086gP.T(false);
        LazyDslKt.a(fillElement, null, null, false, null, aVar, null, false, null, (Ia.l) objF, c1086gP, 196614, 478);
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.d
                @Override // Ia.p
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return HelpCenterCollectionsScreenKt.HelpCenterCollectionsScreen$lambda$2(viewModel, collectionIds, onCollectionClick, onAutoNavigateToCollection, i10, (InterfaceC1084f) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r HelpCenterCollectionsScreen$lambda$1$lambda$0(N0 state, Ia.l onCollectionClick, androidx.compose.foundation.lazy.p LazyColumn) {
        kotlin.jvm.internal.i.e(state, "$state");
        kotlin.jvm.internal.i.e(onCollectionClick, "$onCollectionClick");
        kotlin.jvm.internal.i.e(LazyColumn, "$this$LazyColumn");
        final CollectionsUiState collectionsUiState = (CollectionsUiState) state.getValue();
        if (kotlin.jvm.internal.i.a(collectionsUiState, CollectionsUiState.Initial.INSTANCE) || kotlin.jvm.internal.i.a(collectionsUiState, CollectionsUiState.Loading.INSTANCE)) {
            androidx.compose.foundation.lazy.p.c(LazyColumn, null, ComposableSingletons$HelpCenterCollectionsScreenKt.INSTANCE.m265getLambda1$intercom_sdk_base_release(), 3);
        } else if (collectionsUiState instanceof CollectionsUiState.Error) {
            androidx.compose.foundation.lazy.p.c(LazyColumn, null, new ComposableLambdaImpl(true, -2086280874, new Ia.q<androidx.compose.foundation.lazy.b, InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.HelpCenterCollectionsScreenKt$HelpCenterCollectionsScreen$3$1$1
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
                        HelpCenterErrorScreenKt.HelpCenterErrorScreen(((CollectionsUiState.Error) collectionsUiState).getErrorState(), item.c(1.0f), interfaceC1084f, 0, 0);
                    }
                }
            }), 3);
        } else {
            if (!(collectionsUiState instanceof CollectionsUiState.Content)) {
                throw new NoWhenBranchMatchedException();
            }
            CollectionsUiState.Content content = (CollectionsUiState.Content) collectionsUiState;
            if (content.getCollections().isEmpty()) {
                androidx.compose.foundation.lazy.p.c(LazyColumn, null, ComposableSingletons$HelpCenterCollectionsScreenKt.INSTANCE.m266getLambda2$intercom_sdk_base_release(), 3);
            } else {
                helpCenterCollectionItems(LazyColumn, content, onCollectionClick);
            }
        }
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r HelpCenterCollectionsScreen$lambda$2(HelpCenterViewModel viewModel, List collectionIds, Ia.l onCollectionClick, Ia.l onAutoNavigateToCollection, int i10, InterfaceC1084f interfaceC1084f, int i11) {
        kotlin.jvm.internal.i.e(viewModel, "$viewModel");
        kotlin.jvm.internal.i.e(collectionIds, "$collectionIds");
        kotlin.jvm.internal.i.e(onCollectionClick, "$onCollectionClick");
        kotlin.jvm.internal.i.e(onAutoNavigateToCollection, "$onAutoNavigateToCollection");
        HelpCenterCollectionsScreen(viewModel, collectionIds, onCollectionClick, onAutoNavigateToCollection, interfaceC1084f, L4.b.l(i10 | 1));
        return p293xa.r.f47939a;
    }

    private static final void helpCenterCollectionItems(androidx.compose.foundation.lazy.p pVar, final CollectionsUiState.Content content, final Ia.l<? super String, p293xa.r> lVar) {
        androidx.compose.foundation.lazy.p.c(pVar, null, new ComposableLambdaImpl(true, -464708772, new Ia.q<androidx.compose.foundation.lazy.b, InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.HelpCenterCollectionsScreenKt.helpCenterCollectionItems.1
            @Override // Ia.q
            public /* bridge */ /* synthetic */ p293xa.r invoke(androidx.compose.foundation.lazy.b bVar, InterfaceC1084f interfaceC1084f, Integer num) {
                invoke(bVar, interfaceC1084f, num.intValue());
                return p293xa.r.f47939a;
            }

            public final void invoke(androidx.compose.foundation.lazy.b item, InterfaceC1084f interfaceC1084f, int i10) {
                String string;
                kotlin.jvm.internal.i.e(item, "$this$item");
                if ((i10 & 81) == 16 && interfaceC1084f.s()) {
                    interfaceC1084f.w();
                    return;
                }
                List<CollectionsRow> collections = content.getCollections();
                ArrayList arrayList = new ArrayList();
                for (Object obj : collections) {
                    if (!(((CollectionsRow) obj) instanceof CollectionsRow.SendMessageRow)) {
                        arrayList.add(obj);
                    }
                }
                int size = arrayList.size();
                if (size == 1) {
                    interfaceC1084f.L(765329843);
                    string = S4.o.p(interfaceC1084f, io.intercom.android.sdk.R.string.intercom_single_collection);
                    interfaceC1084f.D();
                } else {
                    interfaceC1084f.L(765428144);
                    string = Phrase.from((Context) interfaceC1084f.x(AndroidCompositionLocals_androidKt.f14793b), io.intercom.android.sdk.R.string.intercom_multiple_collections).put("total_collection", size).format().toString();
                    interfaceC1084f.D();
                }
                TextKt.b(string, PaddingKt.f(W.d(androidx.compose.ui.h.a.f13984b, 1.0f), 16), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(interfaceC1084f, IntercomTheme.$stable).getType04SemiBold(), interfaceC1084f, 48, 0, 65532);
                IntercomDividerKt.IntercomDivider(null, interfaceC1084f, 0, 1);
            }
        }), 3);
        final List<CollectionsRow> collections = content.getCollections();
        pVar.g(collections.size(), null, new Ia.l<Integer, Object>() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.HelpCenterCollectionsScreenKt$helpCenterCollectionItems$$inlined$itemsIndexed$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // Ia.l
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int i10) {
                collections.get(i10);
                return null;
            }
        }, new ComposableLambdaImpl(true, -1091073711, new Ia.r<androidx.compose.foundation.lazy.b, Integer, InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.HelpCenterCollectionsScreenKt$helpCenterCollectionItems$$inlined$itemsIndexed$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(4);
            }

            @Override // Ia.r
            public /* bridge */ /* synthetic */ p293xa.r invoke(androidx.compose.foundation.lazy.b bVar, Integer num, InterfaceC1084f interfaceC1084f, Integer num2) {
                invoke(bVar, num.intValue(), interfaceC1084f, num2.intValue());
                return p293xa.r.f47939a;
            }

            public final void invoke(androidx.compose.foundation.lazy.b bVar, int i10, InterfaceC1084f interfaceC1084f, int i11) {
                int i12;
                if ((i11 & 6) == 0) {
                    i12 = (interfaceC1084f.K(bVar) ? 4 : 2) | i11;
                } else {
                    i12 = i11;
                }
                if ((i11 & 48) == 0) {
                    i12 |= interfaceC1084f.h(i10) ? 32 : 16;
                }
                if (!interfaceC1084f.C(i12 & 1, (i12 & 147) != 146)) {
                    interfaceC1084f.w();
                    return;
                }
                CollectionsRow collectionsRow = (CollectionsRow) collections.get(i10);
                interfaceC1084f.L(766027716);
                if (kotlin.jvm.internal.i.a(collectionsRow, CollectionsRow.FullHelpCenterRow.INSTANCE)) {
                    interfaceC1084f.L(766073285);
                    BrowseAllHelpTopicsComponentKt.BrowseAllHelpTopicsComponent(PaddingKt.j(androidx.compose.ui.h.a.f13984b, 0.0f, 24, 0.0f, 0.0f, 13), interfaceC1084f, 6, 0);
                    interfaceC1084f.D();
                } else if (collectionsRow instanceof CollectionsRow.SendMessageRow) {
                    interfaceC1084f.L(766223604);
                    TeamPresenceComponentKt.TeamPresenceComponent(((CollectionsRow.SendMessageRow) collectionsRow).getTeamPresenceState(), false, null, interfaceC1084f, 48, 4);
                    interfaceC1084f.D();
                } else if (collectionsRow instanceof CollectionsRow.CollectionRow) {
                    interfaceC1084f.L(766388896);
                    CollectionRowComponentKt.CollectionRowComponent(((CollectionsRow.CollectionRow) collectionsRow).getRowData(), lVar, null, interfaceC1084f, 0, 4);
                    interfaceC1084f.D();
                } else {
                    if (!kotlin.jvm.internal.i.a(collectionsRow, CollectionsRow.BrowseAllHelpTopicsAsListRow.INSTANCE)) {
                        interfaceC1084f.L(-390931425);
                        interfaceC1084f.D();
                        throw new NoWhenBranchMatchedException();
                    }
                    interfaceC1084f.L(766553072);
                    BrowseAllHelpTopicsComponentKt.BrowseAllHelpTopicsAsItem(null, interfaceC1084f, 0, 1);
                    interfaceC1084f.D();
                }
                interfaceC1084f.D();
            }
        }));
    }
}
