package io.intercom.android.sdk.m5.helpcenter;

import Aa.c;
import android.content.Context;
import android.content.res.Configuration;
import androidx.lifecycle.InterfaceC1369l;
import androidx.lifecycle.Y;
import androidx.lifecycle.Z;
import androidx.lifecycle.a0;
import androidx.lifecycle.b0;
import androidx.lifecycle.c0;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.api.MessengerApi;
import io.intercom.android.sdk.helpcenter.api.HelpCenterApi;
import io.intercom.android.sdk.helpcenter.articles.ArticleViewState;
import io.intercom.android.sdk.helpcenter.collections.HelpCenterCollection;
import io.intercom.android.sdk.helpcenter.component.TeammateHelpKt;
import io.intercom.android.sdk.helpcenter.sections.HelpCenterArticle;
import io.intercom.android.sdk.helpcenter.sections.HelpCenterCollectionContent;
import io.intercom.android.sdk.helpcenter.utils.HelpCenterEligibilityChecker;
import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.m5.components.ErrorState;
import io.intercom.android.sdk.m5.data.CommonRepository;
import io.intercom.android.sdk.m5.data.IntercomDataLayer;
import io.intercom.android.sdk.m5.helpcenter.states.CollectionDetailsRow;
import io.intercom.android.sdk.m5.helpcenter.states.CollectionDetailsUiState;
import io.intercom.android.sdk.m5.helpcenter.states.CollectionRowData;
import io.intercom.android.sdk.m5.helpcenter.states.CollectionsRow;
import io.intercom.android.sdk.m5.helpcenter.states.CollectionsUiEffects;
import io.intercom.android.sdk.m5.helpcenter.states.CollectionsUiState;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.models.OpenMessengerResponse;
import io.intercom.android.sdk.models.Space;
import io.intercom.android.sdk.ui.common.StringProvider;
import io.intercom.android.sdk.utilities.ContextLocaliser;
import io.intercom.android.sdk.utilities.extensions.AppConfigExtensionsKt;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptySet;
import kotlin.collections.m;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.l;
import kotlinx.coroutines.AbstractC2712w;
import kotlinx.coroutines.C2680e;
import kotlinx.coroutines.I;
import kotlinx.coroutines.N;
import kotlinx.coroutines.flow.A;
import kotlinx.coroutines.flow.B;
import kotlinx.coroutines.flow.C2688e;
import kotlinx.coroutines.flow.StateFlowImpl;
import kotlinx.coroutines.flow.p;
import kotlinx.coroutines.flow.q;
import kotlinx.coroutines.flow.u;
import kotlinx.coroutines.flow.v;
import kotlinx.coroutines.flow.w;
import me.zhanghai.android.materialprogressbar.R;
import p014b1.f;
import p293xa.g;
import p293xa.r;

/* JADX INFO: compiled from: HelpCenterViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class HelpCenterViewModel extends Y {
    private final q<CollectionDetailsUiState> _collectionDetailsState;
    private final q<CollectionsUiState> _collectionsState;
    private final p<CollectionsUiEffects> _effect;
    private final AppConfig appConfig;
    private final A<CollectionDetailsUiState> collectionDetailsState;
    private final A<CollectionsUiState> collectionsState;
    private final CommonRepository commonRepository;
    private final AbstractC2712w dispatcher;
    private final u<CollectionsUiEffects> effect;
    private final ErrorState.WithoutCTA genericError;
    private boolean hasClickedAtLeastOneArticle;
    private final HelpCenterApi helpCenterApi;
    private final HelpCenterEligibilityChecker helpCenterEligibilityChecker;
    private final IntercomDataLayer intercomDataLayer;
    private boolean isPartialHelpCenterLoaded;
    private final MetricTracker metricTracker;
    private final ErrorState.WithoutCTA notFoundError;
    private final String place;
    private final g searchBrowseTeamPresenceState$delegate;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.helpcenter.HelpCenterViewModel$1, reason: invalid class name */
    /* JADX INFO: compiled from: HelpCenterViewModel.kt */
    @c(c = "io.intercom.android.sdk.m5.helpcenter.HelpCenterViewModel$1", f = "HelpCenterViewModel.kt", l = {100}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends SuspendLambda implements Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<? super r>, Object> {
        int label;

        /* JADX INFO: renamed from: io.intercom.android.sdk.m5.helpcenter.HelpCenterViewModel$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: HelpCenterViewModel.kt */
        @c(c = "io.intercom.android.sdk.m5.helpcenter.HelpCenterViewModel$1$1", f = "HelpCenterViewModel.kt", l = {R.styleable.AppCompatTheme_switchStyle}, m = "invokeSuspend")
        public static final class C04241 extends SuspendLambda implements Ia.p<AppConfig, kotlin.coroutines.c<? super r>, Object> {
            int label;
            final /* synthetic */ HelpCenterViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C04241(HelpCenterViewModel helpCenterViewModel, kotlin.coroutines.c<? super C04241> cVar) {
                super(2, cVar);
                this.this$0 = helpCenterViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
                return new C04241(this.this$0, cVar);
            }

            @Override // Ia.p
            public final Object invoke(AppConfig appConfig, kotlin.coroutines.c<? super r> cVar) {
                return ((C04241) create(appConfig, cVar)).invokeSuspend(r.f47939a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
                int i10 = this.label;
                if (i10 == 0) {
                    kotlin.b.b(obj);
                    HelpCenterViewModel helpCenterViewModel = this.this$0;
                    this.label = 1;
                    if (helpCenterViewModel.onNewConfig(this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.b.b(obj);
                }
                return r.f47939a;
            }
        }

        public AnonymousClass1(kotlin.coroutines.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
            return HelpCenterViewModel.this.new AnonymousClass1(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            int i10 = this.label;
            if (i10 == 0) {
                kotlin.b.b(obj);
                A<AppConfig> config = HelpCenterViewModel.this.intercomDataLayer.getConfig();
                C04241 c04241 = new C04241(HelpCenterViewModel.this, null);
                this.label = 1;
                if (C2688e.e(config, c04241, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
            }
            return r.f47939a;
        }

        @Override // Ia.p
        public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c<? super r> cVar) {
            return ((AnonymousClass1) create(a10, cVar)).invokeSuspend(r.f47939a);
        }
    }

    /* JADX INFO: compiled from: HelpCenterViewModel.kt */
    public static final class Companion {
        public /* synthetic */ Companion(e eVar) {
            this();
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [io.intercom.android.sdk.m5.helpcenter.HelpCenterViewModel$Companion$factory$1] */
        private final HelpCenterViewModel$Companion$factory$1 factory(final HelpCenterApi helpCenterApi, final String str) {
            return new a0.c() { // from class: io.intercom.android.sdk.m5.helpcenter.HelpCenterViewModel$Companion$factory$1
                @Override // androidx.lifecycle.a0.c
                public /* bridge */ /* synthetic */ Y create(Oa.c cVar, p014b1.a aVar) {
                    return super.create(cVar, aVar);
                }

                @Override // androidx.lifecycle.a0.c
                public /* bridge */ /* synthetic */ Y create(Class cls, p014b1.a aVar) {
                    return super.create(cls, aVar);
                }

                @Override // androidx.lifecycle.a0.c
                public <T extends Y> T create(Class<T> modelClass) {
                    i.e(modelClass, "modelClass");
                    IntercomDataLayer dataLayer = Injector.get().getDataLayer();
                    HelpCenterApi helpCenterApi2 = helpCenterApi;
                    AppConfig appConfig = Injector.get().getAppConfigProvider().get();
                    i.d(appConfig, "get(...)");
                    AppConfig appConfig2 = appConfig;
                    MetricTracker metricTracker = Injector.get().getMetricTracker();
                    i.d(metricTracker, "getMetricTracker(...)");
                    String str2 = str;
                    i.b(dataLayer);
                    MessengerApi messengerApi = Injector.get().getMessengerApi();
                    i.d(messengerApi, "getMessengerApi(...)");
                    return new HelpCenterViewModel(helpCenterApi2, appConfig2, metricTracker, str2, null, null, dataLayer, new CommonRepository(messengerApi, dataLayer), 48, null);
                }
            };
        }

        public final HelpCenterViewModel create(c0 owner, HelpCenterApi helpCenterApi, String place) {
            i.e(owner, "owner");
            i.e(helpCenterApi, "helpCenterApi");
            i.e(place, "place");
            HelpCenterViewModel$Companion$factory$1 factory = factory(helpCenterApi, place);
            i.e(factory, "factory");
            b0 store = owner.getViewModelStore();
            p014b1.a defaultCreationExtras = owner instanceof InterfaceC1369l ? ((InterfaceC1369l) owner).getDefaultViewModelCreationExtras() : p014b1.a.C0207a.f20498b;
            i.e(store, "store");
            i.e(defaultCreationExtras, "defaultCreationExtras");
            f fVar = new f(store, factory, defaultCreationExtras);
            kotlin.jvm.internal.c cVarA = l.a(HelpCenterViewModel.class);
            String strI = cVarA.i();
            if (strI != null) {
                return (HelpCenterViewModel) fVar.a(cVarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strI));
            }
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.helpcenter.HelpCenterViewModel$fetchCollectionDetails$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: HelpCenterViewModel.kt */
    @c(c = "io.intercom.android.sdk.m5.helpcenter.HelpCenterViewModel$fetchCollectionDetails$1", f = "HelpCenterViewModel.kt", l = {243, 285}, m = "invokeSuspend")
    public static final class C24151 extends SuspendLambda implements Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<? super r>, Object> {
        final /* synthetic */ String $collectionId;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C24151(String str, kotlin.coroutines.c<? super C24151> cVar) {
            super(2, cVar);
            this.$collectionId = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final r invokeSuspend$lambda$0(HelpCenterViewModel helpCenterViewModel, String str) {
            helpCenterViewModel.fetchCollectionDetails(str);
            return r.f47939a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
            return HelpCenterViewModel.this.new C24151(this.$collectionId, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            q qVar;
            HelpCenterCollectionContent helpCenterCollectionContent;
            List list;
            List list2;
            List list3;
            CollectionDetailsUiState error;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 == 1) {
                    kotlin.b.b(obj);
                } else {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    list2 = (List) this.L$3;
                    qVar = (q) this.L$2;
                    list3 = (List) this.L$1;
                    helpCenterCollectionContent = (HelpCenterCollectionContent) this.L$0;
                    kotlin.b.b(obj);
                }
                list2.add(new CollectionDetailsRow.SendMessageRow((ArticleViewState.TeamPresenceState) obj));
                list = list3;
                error = new CollectionDetailsUiState.Content(helpCenterCollectionContent.getCollectionId(), helpCenterCollectionContent.getTitle(), helpCenterCollectionContent.getSummary(), helpCenterCollectionContent.getArticlesCount(), helpCenterCollectionContent.getAuthors(), list);
                qVar.setValue(error);
                return r.f47939a;
            }
            kotlin.b.b(obj);
            CollectionDetailsUiState value = HelpCenterViewModel.this.getCollectionDetailsState().getValue();
            if ((value instanceof CollectionDetailsUiState.Content) && i.a(((CollectionDetailsUiState.Content) value).getId(), this.$collectionId)) {
                return r.f47939a;
            }
            HelpCenterViewModel.this._collectionDetailsState.setValue(CollectionDetailsUiState.Loading.INSTANCE);
            HelpCenterApi helpCenterApi = HelpCenterViewModel.this.helpCenterApi;
            String str = this.$collectionId;
            this.label = 1;
            obj = HelpCenterApi.DefaultImpls.fetchCollectionDetails$default(helpCenterApi, str, null, this, 2, null);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
            NetworkResponse networkResponse = (NetworkResponse) obj;
            qVar = HelpCenterViewModel.this._collectionDetailsState;
            if (networkResponse instanceof NetworkResponse.ServerError) {
                NetworkResponse.ServerError serverError = (NetworkResponse.ServerError) networkResponse;
                HelpCenterViewModel.this.sendFailedSingleCollectionMetric(new Integer(serverError.getCode()));
                error = serverError.getCode() == 404 ? new CollectionDetailsUiState.Error(HelpCenterViewModel.this.notFoundError) : new CollectionDetailsUiState.Error(HelpCenterViewModel.this.genericError);
            } else if (networkResponse instanceof NetworkResponse.ClientError) {
                HelpCenterViewModel.sendFailedSingleCollectionMetric$default(HelpCenterViewModel.this, null, 1, null);
                error = new CollectionDetailsUiState.Error(HelpCenterViewModel.this.genericError);
            } else if (networkResponse instanceof NetworkResponse.NetworkError) {
                HelpCenterViewModel.sendFailedSingleCollectionMetric$default(HelpCenterViewModel.this, null, 1, null);
                final HelpCenterViewModel helpCenterViewModel = HelpCenterViewModel.this;
                final String str2 = this.$collectionId;
                error = new CollectionDetailsUiState.Error(helpCenterViewModel.errorWithRetry(new Ia.a() { // from class: io.intercom.android.sdk.m5.helpcenter.a
                    @Override // Ia.a
                    public final Object invoke() {
                        return HelpCenterViewModel.C24151.invokeSuspend$lambda$0(helpCenterViewModel, str2);
                    }
                }));
            } else {
                if (!(networkResponse instanceof NetworkResponse.Success)) {
                    throw new NoWhenBranchMatchedException();
                }
                helpCenterCollectionContent = (HelpCenterCollectionContent) ((NetworkResponse.Success) networkResponse).getBody();
                ArrayList arrayListP0 = kotlin.collections.q.p0(HelpCenterViewModel.this.transformToUiModel(helpCenterCollectionContent));
                if (HelpCenterViewModel.this.isPartialHelpCenterLoaded) {
                    arrayListP0.add(CollectionDetailsRow.FullHelpCenterRow.INSTANCE);
                }
                HelpCenterViewModel.this.metricTracker.viewedNativeHelpCenter(MetricTracker.Place.ARTICLE_LIST, Boolean.valueOf(HelpCenterViewModel.this.isPartialHelpCenterLoaded), HelpCenterViewModel.this.isFromSearchBrowse());
                if (HelpCenterViewModel.this.shouldAddSendMessageRow()) {
                    HelpCenterViewModel helpCenterViewModel2 = HelpCenterViewModel.this;
                    this.L$0 = helpCenterCollectionContent;
                    this.L$1 = arrayListP0;
                    this.L$2 = qVar;
                    this.L$3 = arrayListP0;
                    this.label = 2;
                    Object ctaData = helpCenterViewModel2.getCtaData(this);
                    if (ctaData == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    list2 = arrayListP0;
                    obj = ctaData;
                    list3 = list2;
                    list2.add(new CollectionDetailsRow.SendMessageRow((ArticleViewState.TeamPresenceState) obj));
                    list = list3;
                } else {
                    list = arrayListP0;
                }
                error = new CollectionDetailsUiState.Content(helpCenterCollectionContent.getCollectionId(), helpCenterCollectionContent.getTitle(), helpCenterCollectionContent.getSummary(), helpCenterCollectionContent.getArticlesCount(), helpCenterCollectionContent.getAuthors(), list);
            }
            qVar.setValue(error);
            return r.f47939a;
        }

        @Override // Ia.p
        public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c<? super r> cVar) {
            return ((C24151) create(a10, cVar)).invokeSuspend(r.f47939a);
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.helpcenter.HelpCenterViewModel$fetchCollections$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: HelpCenterViewModel.kt */
    @c(c = "io.intercom.android.sdk.m5.helpcenter.HelpCenterViewModel$fetchCollections$1", f = "HelpCenterViewModel.kt", l = {R.styleable.AppCompatTheme_windowNoTitle, 165, 175, 198}, m = "invokeSuspend")
    public static final class C24161 extends SuspendLambda implements Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<? super r>, Object> {
        final /* synthetic */ Set<String> $collectionIds;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C24161(Set<String> set, kotlin.coroutines.c<? super C24161> cVar) {
            super(2, cVar);
            this.$collectionIds = set;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final r invokeSuspend$lambda$0(HelpCenterViewModel helpCenterViewModel, Set set) {
            helpCenterViewModel.fetchCollections(set);
            return r.f47939a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
            return HelpCenterViewModel.this.new C24161(this.$collectionIds, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            q qVar;
            CollectionsUiState error;
            List list;
            List list2;
            List list3;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            int i10 = this.label;
            if (i10 == 0) {
                kotlin.b.b(obj);
                if (HelpCenterViewModel.this.getCollectionsState().getValue() instanceof CollectionsUiState.Content) {
                    return r.f47939a;
                }
                HelpCenterViewModel.this._collectionsState.setValue(CollectionsUiState.Loading.INSTANCE);
                HelpCenterApi helpCenterApi = HelpCenterViewModel.this.helpCenterApi;
                this.label = 1;
                obj = HelpCenterApi.DefaultImpls.fetchCollections$default(helpCenterApi, null, this, 1, null);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i10 != 1) {
                    if (i10 == 2) {
                        kotlin.b.b(obj);
                        return r.f47939a;
                    }
                    if (i10 == 3) {
                        kotlin.b.b(obj);
                        return r.f47939a;
                    }
                    if (i10 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    List list4 = (List) this.L$2;
                    qVar = (q) this.L$1;
                    List list5 = (List) this.L$0;
                    kotlin.b.b(obj);
                    list3 = list4;
                    list = list5;
                    list3.add(new CollectionsRow.SendMessageRow((ArticleViewState.TeamPresenceState) obj));
                    list2 = list;
                    error = new CollectionsUiState.Content(list2);
                    qVar.setValue(error);
                    return r.f47939a;
                }
                kotlin.b.b(obj);
            }
            NetworkResponse networkResponse = (NetworkResponse) obj;
            qVar = HelpCenterViewModel.this._collectionsState;
            if (networkResponse instanceof NetworkResponse.ServerError) {
                NetworkResponse.ServerError serverError = (NetworkResponse.ServerError) networkResponse;
                HelpCenterViewModel.this.sendFailedCollectionListMetric(new Integer(serverError.getCode()));
                error = serverError.getCode() == 404 ? new CollectionsUiState.Error(HelpCenterViewModel.this.notFoundError) : new CollectionsUiState.Error(HelpCenterViewModel.this.genericError);
            } else if (networkResponse instanceof NetworkResponse.ClientError) {
                HelpCenterViewModel.sendFailedCollectionListMetric$default(HelpCenterViewModel.this, null, 1, null);
                error = new CollectionsUiState.Error(HelpCenterViewModel.this.genericError);
            } else if (networkResponse instanceof NetworkResponse.NetworkError) {
                HelpCenterViewModel.sendFailedCollectionListMetric$default(HelpCenterViewModel.this, null, 1, null);
                final HelpCenterViewModel helpCenterViewModel = HelpCenterViewModel.this;
                final Set<String> set = this.$collectionIds;
                error = new CollectionsUiState.Error(helpCenterViewModel.errorWithRetry(new Ia.a() { // from class: io.intercom.android.sdk.m5.helpcenter.b
                    @Override // Ia.a
                    public final Object invoke() {
                        return HelpCenterViewModel.C24161.invokeSuspend$lambda$0(helpCenterViewModel, set);
                    }
                }));
            } else {
                if (!(networkResponse instanceof NetworkResponse.Success)) {
                    throw new NoWhenBranchMatchedException();
                }
                List list6 = (List) ((NetworkResponse.Success) networkResponse).getBody();
                Set<String> set2 = this.$collectionIds;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list6) {
                    if (set2.contains(((HelpCenterCollection) obj2).getId())) {
                        arrayList.add(obj2);
                    }
                }
                HelpCenterViewModel.this.isPartialHelpCenterLoaded = arrayList.size() < list6.size() && !arrayList.isEmpty();
                HelpCenterViewModel.this.metricTracker.viewedNativeHelpCenter(MetricTracker.Place.COLLECTION_LIST, Boolean.valueOf(HelpCenterViewModel.this.isPartialHelpCenterLoaded), HelpCenterViewModel.this.isFromSearchBrowse());
                if (arrayList.size() == 1) {
                    p pVar = HelpCenterViewModel.this._effect;
                    CollectionsUiEffects.NavigateToCollectionContent navigateToCollectionContent = new CollectionsUiEffects.NavigateToCollectionContent(((HelpCenterCollection) kotlin.collections.q.O(arrayList)).getId());
                    this.L$0 = qVar;
                    this.label = 2;
                    if (pVar.emit(navigateToCollectionContent, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    return r.f47939a;
                }
                if (list6.size() == 1) {
                    p pVar2 = HelpCenterViewModel.this._effect;
                    CollectionsUiEffects.NavigateToCollectionContent navigateToCollectionContent2 = new CollectionsUiEffects.NavigateToCollectionContent(((HelpCenterCollection) kotlin.collections.q.O(list6)).getId());
                    this.L$0 = qVar;
                    this.label = 3;
                    if (pVar2.emit(navigateToCollectionContent2, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    return r.f47939a;
                }
                boolean zIsEmpty = arrayList.isEmpty();
                if (!arrayList.isEmpty()) {
                    list6 = arrayList;
                }
                if (list6.isEmpty()) {
                    error = new CollectionsUiState.Error(HelpCenterViewModel.this.genericError);
                } else {
                    ArrayList arrayListP0 = kotlin.collections.q.p0(HelpCenterViewModel.this.transformToUiModel((List<HelpCenterCollection>) list6));
                    if (!zIsEmpty) {
                        arrayListP0.add(CollectionsRow.BrowseAllHelpTopicsAsListRow.INSTANCE);
                    } else if (HelpCenterViewModel.this.isPartialHelpCenterLoaded) {
                        arrayListP0.add(CollectionsRow.FullHelpCenterRow.INSTANCE);
                    }
                    list2 = arrayListP0;
                    if (HelpCenterViewModel.this.shouldAddSendMessageRow()) {
                        HelpCenterViewModel helpCenterViewModel2 = HelpCenterViewModel.this;
                        this.L$0 = arrayListP0;
                        this.L$1 = qVar;
                        this.L$2 = arrayListP0;
                        this.label = 4;
                        Object ctaData = helpCenterViewModel2.getCtaData(this);
                        if (ctaData == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        ArrayList arrayList2 = arrayListP0;
                        obj = ctaData;
                        list = arrayList2;
                        list3 = arrayList2;
                        list3.add(new CollectionsRow.SendMessageRow((ArticleViewState.TeamPresenceState) obj));
                        list2 = list;
                    }
                    error = new CollectionsUiState.Content(list2);
                }
            }
            qVar.setValue(error);
            return r.f47939a;
        }

        @Override // Ia.p
        public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c<? super r> cVar) {
            return ((C24161) create(a10, cVar)).invokeSuspend(r.f47939a);
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.helpcenter.HelpCenterViewModel$getCtaData$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: HelpCenterViewModel.kt */
    @c(c = "io.intercom.android.sdk.m5.helpcenter.HelpCenterViewModel", f = "HelpCenterViewModel.kt", l = {390}, m = "getCtaData")
    public static final class C24171 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C24171(kotlin.coroutines.c<? super C24171> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HelpCenterViewModel.this.getCtaData(this);
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.helpcenter.HelpCenterViewModel$onArticleClicked$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: HelpCenterViewModel.kt */
    @c(c = "io.intercom.android.sdk.m5.helpcenter.HelpCenterViewModel$onArticleClicked$1", f = "HelpCenterViewModel.kt", l = {311, 314, 319}, m = "invokeSuspend")
    public static final class C24181 extends SuspendLambda implements Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<? super r>, Object> {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;

        public C24181(kotlin.coroutines.c<? super C24181> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
            return HelpCenterViewModel.this.new C24181(cVar);
        }

        /* JADX WARN: Code duplicated, block: B:46:0x00d7 A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:49:0x00ed A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:50:0x00ee  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CollectionDetailsUiState.Content content;
            int i10;
            CollectionsUiState.Content content2;
            int i11;
            CollectionDetailsUiState.Content content3;
            q qVar;
            q qVar2;
            q qVar3;
            CollectionsUiState.Content content4;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            int i12 = this.label;
            if (i12 == 0) {
                kotlin.b.b(obj);
                HelpCenterViewModel.this.hasClickedAtLeastOneArticle = true;
                if (HelpCenterViewModel.this.shouldAddSendMessageRow()) {
                    Object value = HelpCenterViewModel.this._collectionDetailsState.getValue();
                    content = value instanceof CollectionDetailsUiState.Content ? (CollectionDetailsUiState.Content) value : null;
                    Object value2 = HelpCenterViewModel.this._collectionsState.getValue();
                    CollectionsUiState.Content content5 = value2 instanceof CollectionsUiState.Content ? (CollectionsUiState.Content) value2 : null;
                    int i13 = 0;
                    int i14 = (content == null || content.hasSendMessageRow()) ? 0 : 1;
                    if (content5 != null && !content5.hasSendMessageRow()) {
                        i13 = 1;
                    }
                    if (i14 != 0 || i13 != 0) {
                        this.L$0 = content;
                        this.L$1 = content5;
                        this.I$0 = i14;
                        this.I$1 = i13;
                        this.label = 1;
                        if (I.b(2000L, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        i10 = i14;
                        int i15 = i13;
                        content2 = content5;
                        i11 = i15;
                    }
                }
                return r.f47939a;
            }
            if (i12 == 1) {
                i11 = this.I$1;
                i10 = this.I$0;
                content2 = (CollectionsUiState.Content) this.L$1;
                CollectionDetailsUiState.Content content6 = (CollectionDetailsUiState.Content) this.L$0;
                kotlin.b.b(obj);
                content = content6;
            } else {
                if (i12 == 2) {
                    i11 = this.I$0;
                    qVar = (q) this.L$2;
                    content3 = (CollectionDetailsUiState.Content) this.L$1;
                    content2 = (CollectionsUiState.Content) this.L$0;
                    kotlin.b.b(obj);
                    qVar.setValue(content3.copyWithSingleSendMessageRow((ArticleViewState.TeamPresenceState) obj));
                    if (i11 != 0 && content2 != null) {
                        HelpCenterViewModel helpCenterViewModel = HelpCenterViewModel.this;
                        qVar2 = helpCenterViewModel._collectionsState;
                        this.L$0 = content2;
                        this.L$1 = qVar2;
                        this.L$2 = null;
                        this.label = 3;
                        obj = helpCenterViewModel.getCtaData(this);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        qVar3 = qVar2;
                        content4 = content2;
                    }
                    return r.f47939a;
                }
                if (i12 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                qVar3 = (q) this.L$1;
                content4 = (CollectionsUiState.Content) this.L$0;
                kotlin.b.b(obj);
            }
            qVar3.setValue(content4.copyWithSingleSendMessageRow((ArticleViewState.TeamPresenceState) obj));
            return r.f47939a;
            if (i10 != 0 && content != null) {
                HelpCenterViewModel helpCenterViewModel2 = HelpCenterViewModel.this;
                q qVar4 = helpCenterViewModel2._collectionDetailsState;
                this.L$0 = content2;
                this.L$1 = content;
                this.L$2 = qVar4;
                this.I$0 = i11;
                this.label = 2;
                Object ctaData = helpCenterViewModel2.getCtaData(this);
                if (ctaData == coroutineSingletons) {
                    return coroutineSingletons;
                }
                content3 = content;
                obj = ctaData;
                qVar = qVar4;
                qVar.setValue(content3.copyWithSingleSendMessageRow((ArticleViewState.TeamPresenceState) obj));
                if (i11 != 0) {
                    HelpCenterViewModel helpCenterViewModel3 = HelpCenterViewModel.this;
                    qVar2 = helpCenterViewModel3._collectionsState;
                    this.L$0 = content2;
                    this.L$1 = qVar2;
                    this.L$2 = null;
                    this.label = 3;
                    obj = helpCenterViewModel3.getCtaData(this);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    qVar3 = qVar2;
                    content4 = content2;
                    qVar3.setValue(content4.copyWithSingleSendMessageRow((ArticleViewState.TeamPresenceState) obj));
                }
            } else if (i11 != 0) {
                HelpCenterViewModel helpCenterViewModel4 = HelpCenterViewModel.this;
                qVar2 = helpCenterViewModel4._collectionsState;
                this.L$0 = content2;
                this.L$1 = qVar2;
                this.L$2 = null;
                this.label = 3;
                obj = helpCenterViewModel4.getCtaData(this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
                qVar3 = qVar2;
                content4 = content2;
                qVar3.setValue(content4.copyWithSingleSendMessageRow((ArticleViewState.TeamPresenceState) obj));
            }
            return r.f47939a;
        }

        @Override // Ia.p
        public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c<? super r> cVar) {
            return ((C24181) create(a10, cVar)).invokeSuspend(r.f47939a);
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.helpcenter.HelpCenterViewModel$onNewConfig$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: HelpCenterViewModel.kt */
    @c(c = "io.intercom.android.sdk.m5.helpcenter.HelpCenterViewModel", f = "HelpCenterViewModel.kt", l = {371, 379}, m = "onNewConfig")
    public static final class C24191 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C24191(kotlin.coroutines.c<? super C24191> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HelpCenterViewModel.this.onNewConfig(this);
        }
    }

    public HelpCenterViewModel(HelpCenterApi helpCenterApi, AppConfig appConfig, MetricTracker metricTracker, String str, HelpCenterEligibilityChecker helpCenterEligibilityChecker, AbstractC2712w abstractC2712w, IntercomDataLayer intercomDataLayer, CommonRepository commonRepository, int i10, e eVar) {
        this(helpCenterApi, appConfig, metricTracker, str, (i10 & 16) != 0 ? HelpCenterEligibilityChecker.INSTANCE : helpCenterEligibilityChecker, (i10 & 32) != 0 ? N.f43200c : abstractC2712w, intercomDataLayer, commonRepository);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ErrorState.WithCTA errorWithRetry(Ia.a<r> aVar) {
        return new ErrorState.WithCTA(0, 0, null, 0, aVar, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void fetchCollections$default(HelpCenterViewModel helpCenterViewModel, Set set, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            set = EmptySet.f42985b;
        }
        helpCenterViewModel.fetchCollections(set);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object getCtaData(kotlin.coroutines.c<? super ArticleViewState.TeamPresenceState> cVar) {
        C24171 c24171;
        HelpCenterViewModel helpCenterViewModel;
        if (cVar instanceof C24171) {
            c24171 = (C24171) cVar;
            int i10 = c24171.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c24171.label = i10 - Integer.MIN_VALUE;
            } else {
                c24171 = new C24171(cVar);
            }
        } else {
            c24171 = new C24171(cVar);
        }
        Object objOpenMessenger = c24171.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = c24171.label;
        if (i11 == 0) {
            kotlin.b.b(objOpenMessenger);
            CommonRepository commonRepository = this.commonRepository;
            c24171.L$0 = this;
            c24171.label = 1;
            objOpenMessenger = commonRepository.openMessenger(c24171);
            if (objOpenMessenger == coroutineSingletons) {
                return coroutineSingletons;
            }
            helpCenterViewModel = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            helpCenterViewModel = (HelpCenterViewModel) c24171.L$0;
            kotlin.b.b(objOpenMessenger);
        }
        OpenMessengerResponse openMessengerResponse = (OpenMessengerResponse) objOpenMessenger;
        if (openMessengerResponse == null) {
            return helpCenterViewModel.getSearchBrowseTeamPresenceState();
        }
        OpenMessengerResponse.NewConversationData newConversationData = openMessengerResponse.getNewConversationData();
        if (newConversationData == null) {
            return helpCenterViewModel.getSearchBrowseTeamPresenceState();
        }
        ArticleViewState.TeamPresenceState searchBrowseTeamPresenceState = helpCenterViewModel.getSearchBrowseTeamPresenceState();
        return searchBrowseTeamPresenceState.copy((511 & 1) != 0 ? searchBrowseTeamPresenceState.articleMetadata : null, (511 & 2) != 0 ? searchBrowseTeamPresenceState.conversationState : null, (511 & 4) != 0 ? searchBrowseTeamPresenceState.subtitleText : null, (511 & 8) != 0 ? searchBrowseTeamPresenceState.messageButtonText : 0, (511 & 16) != 0 ? searchBrowseTeamPresenceState.messageButtonIcon : 0, (511 & 32) != 0 ? searchBrowseTeamPresenceState.messageButtonColor : 0, (511 & 64) != 0 ? searchBrowseTeamPresenceState.metricPlace : null, (511 & 128) != 0 ? searchBrowseTeamPresenceState.metricContext : null, (511 & 256) != 0 ? searchBrowseTeamPresenceState.isFromSearchBrowse : false, (511 & 512) != 0 ? searchBrowseTeamPresenceState.ctaData : newConversationData.getCta());
    }

    private final ArticleViewState.TeamPresenceState getSearchBrowseTeamPresenceState() {
        return (ArticleViewState.TeamPresenceState) this.searchBrowseTeamPresenceState$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isFromSearchBrowse() {
        return i.a(this.place, "search_browse");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:30:0x0098  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:34:0x00b1 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:35:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:37:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object onNewConfig(kotlin.coroutines.c<? super r> cVar) {
        C24191 c24191;
        HelpCenterViewModel helpCenterViewModel;
        q<CollectionsUiState> qVar;
        CollectionsUiState.Content contentCopyWithoutSendMessageRow;
        CollectionsUiState.Content content;
        q<CollectionsUiState> qVar2;
        CollectionDetailsUiState value;
        q<CollectionDetailsUiState> qVar3;
        CollectionDetailsUiState.Content contentCopyWithoutSendMessageRow2;
        CollectionDetailsUiState.Content content2;
        Object ctaData;
        CollectionDetailsUiState.Content content3;
        q<CollectionDetailsUiState> qVar4;
        if (cVar instanceof C24191) {
            c24191 = (C24191) cVar;
            int i10 = c24191.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c24191.label = i10 - Integer.MIN_VALUE;
            } else {
                c24191 = new C24191(cVar);
            }
        } else {
            c24191 = new C24191(cVar);
        }
        Object obj = c24191.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = c24191.label;
        if (i11 != 0) {
            if (i11 == 1) {
                content = (CollectionsUiState.Content) c24191.L$2;
                qVar2 = (q) c24191.L$1;
                helpCenterViewModel = (HelpCenterViewModel) c24191.L$0;
                kotlin.b.b(obj);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                content3 = (CollectionDetailsUiState.Content) c24191.L$1;
                qVar4 = (q) c24191.L$0;
                kotlin.b.b(obj);
            }
            contentCopyWithoutSendMessageRow2 = content3.copyWithSingleSendMessageRow((ArticleViewState.TeamPresenceState) obj);
            qVar3 = qVar4;
            qVar3.setValue(contentCopyWithoutSendMessageRow2);
            return r.f47939a;
        }
        kotlin.b.b(obj);
        CollectionsUiState value2 = this._collectionsState.getValue();
        if (value2 instanceof CollectionsUiState.Content) {
            qVar = this._collectionsState;
            if (shouldAddSendMessageRow()) {
                CollectionsUiState.Content content4 = (CollectionsUiState.Content) value2;
                c24191.L$0 = this;
                c24191.L$1 = qVar;
                c24191.L$2 = content4;
                c24191.label = 1;
                Object ctaData2 = getCtaData(c24191);
                if (ctaData2 == coroutineSingletons) {
                    return coroutineSingletons;
                }
                helpCenterViewModel = this;
                content = content4;
                obj = ctaData2;
                qVar2 = qVar;
            } else {
                contentCopyWithoutSendMessageRow = ((CollectionsUiState.Content) value2).copyWithoutSendMessageRow();
                helpCenterViewModel = this;
            }
            qVar.setValue(contentCopyWithoutSendMessageRow);
        } else {
            helpCenterViewModel = this;
        }
        value = helpCenterViewModel._collectionDetailsState.getValue();
        if (value instanceof CollectionDetailsUiState.Content) {
            qVar3 = helpCenterViewModel._collectionDetailsState;
            if (helpCenterViewModel.shouldAddSendMessageRow()) {
                content2 = (CollectionDetailsUiState.Content) value;
                c24191.L$0 = qVar3;
                c24191.L$1 = content2;
                c24191.L$2 = null;
                c24191.label = 2;
                ctaData = helpCenterViewModel.getCtaData(c24191);
                if (ctaData == coroutineSingletons) {
                    return coroutineSingletons;
                }
                content3 = content2;
                obj = ctaData;
                qVar4 = qVar3;
                contentCopyWithoutSendMessageRow2 = content3.copyWithSingleSendMessageRow((ArticleViewState.TeamPresenceState) obj);
                qVar3 = qVar4;
            } else {
                contentCopyWithoutSendMessageRow2 = ((CollectionDetailsUiState.Content) value).copyWithoutSendMessageRow();
            }
            qVar3.setValue(contentCopyWithoutSendMessageRow2);
        }
        return r.f47939a;
        contentCopyWithoutSendMessageRow = content.copyWithSingleSendMessageRow((ArticleViewState.TeamPresenceState) obj);
        qVar = qVar2;
        qVar.setValue(contentCopyWithoutSendMessageRow);
        value = helpCenterViewModel._collectionDetailsState.getValue();
        if (value instanceof CollectionDetailsUiState.Content) {
            qVar3 = helpCenterViewModel._collectionDetailsState;
            if (helpCenterViewModel.shouldAddSendMessageRow()) {
                content2 = (CollectionDetailsUiState.Content) value;
                c24191.L$0 = qVar3;
                c24191.L$1 = content2;
                c24191.L$2 = null;
                c24191.label = 2;
                ctaData = helpCenterViewModel.getCtaData(c24191);
                if (ctaData == coroutineSingletons) {
                    return coroutineSingletons;
                }
                content3 = content2;
                obj = ctaData;
                qVar4 = qVar3;
                contentCopyWithoutSendMessageRow2 = content3.copyWithSingleSendMessageRow((ArticleViewState.TeamPresenceState) obj);
                qVar3 = qVar4;
            } else {
                contentCopyWithoutSendMessageRow2 = ((CollectionDetailsUiState.Content) value).copyWithoutSendMessageRow();
            }
            qVar3.setValue(contentCopyWithoutSendMessageRow2);
        }
        return r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ArticleViewState.TeamPresenceState searchBrowseTeamPresenceState_delegate$lambda$0(HelpCenterViewModel this$0) {
        i.e(this$0, "this$0");
        return TeammateHelpKt.computeViewState(null, ArticleViewState.TeamPresenceState.Companion.getDefaultTeamPresenceState(), this$0.intercomDataLayer.getTeamPresence().getValue(), this$0.appConfig, this$0.place, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendFailedCollectionListMetric(Integer num) {
        this.metricTracker.failedHelpCenter(MetricTracker.Object.HELP_CENTER, MetricTracker.Place.COLLECTION_LIST, num != null ? num.toString() : null, isFromSearchBrowse());
    }

    public static /* synthetic */ void sendFailedCollectionListMetric$default(HelpCenterViewModel helpCenterViewModel, Integer num, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            num = null;
        }
        helpCenterViewModel.sendFailedCollectionListMetric(num);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendFailedSingleCollectionMetric(Integer num) {
        this.metricTracker.failedHelpCenter(MetricTracker.Object.HELP_CENTER, MetricTracker.Place.ARTICLE_LIST, num != null ? num.toString() : null, isFromSearchBrowse());
    }

    public static /* synthetic */ void sendFailedSingleCollectionMetric$default(HelpCenterViewModel helpCenterViewModel, Integer num, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            num = null;
        }
        helpCenterViewModel.sendFailedSingleCollectionMetric(num);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean shouldAddSendMessageRow() {
        return AppConfigExtensionsKt.canStartNewConversation(this.appConfig) && this.hasClickedAtLeastOneArticle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<CollectionsRow.CollectionRow> transformToUiModel(List<HelpCenterCollection> list) {
        List<HelpCenterCollection> list2 = list;
        ArrayList arrayList = new ArrayList(m.y(list2, 10));
        for (HelpCenterCollection helpCenterCollection : list2) {
            arrayList.add(new CollectionsRow.CollectionRow(new CollectionRowData(helpCenterCollection.getId(), helpCenterCollection.getTitle(), helpCenterCollection.getSummary().length() == 0 ? 8 : 0, helpCenterCollection.getSummary(), helpCenterCollection.getArticlesCount(), helpCenterCollection.getCollectionsCount())));
        }
        return arrayList;
    }

    public final void fetchCollectionDetails(String collectionId) {
        i.e(collectionId, "collectionId");
        C2680e.c(Z.a(this), this.dispatcher, null, new C24151(collectionId, null), 2);
    }

    public final void fetchCollections(Set<String> collectionIds) {
        i.e(collectionIds, "collectionIds");
        if (this.helpCenterEligibilityChecker.isEligibleUser()) {
            C2680e.c(Z.a(this), this.dispatcher, null, new C24161(collectionIds, null), 2);
        } else {
            this._collectionsState.setValue(new CollectionsUiState.Error(this.genericError));
        }
    }

    public final A<CollectionDetailsUiState> getCollectionDetailsState() {
        return this.collectionDetailsState;
    }

    public final A<CollectionsUiState> getCollectionsState() {
        return this.collectionsState;
    }

    public final u<CollectionsUiEffects> getEffect() {
        return this.effect;
    }

    public final StringProvider getScreenTitle() {
        String spaceLabelIfExists = this.appConfig.getSpaceLabelIfExists(Space.Type.HELP);
        return spaceLabelIfExists != null ? new StringProvider.ActualString(spaceLabelIfExists) : new StringProvider.StringRes(io.intercom.android.sdk.R.string.intercom_get_help, null, 2, null);
    }

    public final Context localizedContext(Context context) {
        i.e(context, "context");
        Configuration configuration = new Configuration(context.getResources().getConfiguration());
        configuration.setLocale(ContextLocaliser.convertToLocale(this.appConfig.getHelpCenterLocale()));
        Context contextCreateConfigurationContext = context.createConfigurationContext(configuration);
        i.d(contextCreateConfigurationContext, "createConfigurationContext(...)");
        return contextCreateConfigurationContext;
    }

    public final void onArticleClicked() {
        C2680e.c(Z.a(this), this.dispatcher, null, new C24181(null), 2);
    }

    public HelpCenterViewModel(HelpCenterApi helpCenterApi, AppConfig appConfig, MetricTracker metricTracker, String place, HelpCenterEligibilityChecker helpCenterEligibilityChecker, AbstractC2712w dispatcher, IntercomDataLayer intercomDataLayer, CommonRepository commonRepository) {
        i.e(helpCenterApi, "helpCenterApi");
        i.e(appConfig, "appConfig");
        i.e(metricTracker, "metricTracker");
        i.e(place, "place");
        i.e(helpCenterEligibilityChecker, "helpCenterEligibilityChecker");
        i.e(dispatcher, "dispatcher");
        i.e(intercomDataLayer, "intercomDataLayer");
        i.e(commonRepository, "commonRepository");
        this.helpCenterApi = helpCenterApi;
        this.appConfig = appConfig;
        this.metricTracker = metricTracker;
        this.place = place;
        this.helpCenterEligibilityChecker = helpCenterEligibilityChecker;
        this.dispatcher = dispatcher;
        this.intercomDataLayer = intercomDataLayer;
        this.commonRepository = commonRepository;
        StateFlowImpl stateFlowImplA = B.a(CollectionsUiState.Initial.INSTANCE);
        this._collectionsState = stateFlowImplA;
        this.collectionsState = C2688e.b(stateFlowImplA);
        StateFlowImpl stateFlowImplA2 = B.a(CollectionDetailsUiState.Initial.INSTANCE);
        this._collectionDetailsState = stateFlowImplA2;
        this.collectionDetailsState = C2688e.b(stateFlowImplA2);
        v vVarB = w.b(0, 0, null, 7);
        this._effect = vVarB;
        this.effect = C2688e.p(vVarB, Z.a(this));
        this.genericError = new ErrorState.WithoutCTA(0, 0, null, 7, null);
        this.notFoundError = new ErrorState.WithoutCTA(0, io.intercom.android.sdk.R.string.intercom_page_not_found, null, 5, null);
        this.searchBrowseTeamPresenceState$delegate = kotlin.a.a(new io.intercom.android.sdk.b(2, this));
        if (place.length() > 0) {
            metricTracker.openedNativeHelpCenter(place, null);
        }
        C2680e.c(Z.a(this), null, null, new AnonymousClass1(null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<CollectionDetailsRow> transformToUiModel(HelpCenterCollectionContent helpCenterCollectionContent) {
        ArrayList arrayList = new ArrayList();
        List<HelpCenterArticle> helpCenterArticles = helpCenterCollectionContent.getHelpCenterArticles();
        ArrayList arrayList2 = new ArrayList(m.y(helpCenterArticles, 10));
        for (HelpCenterArticle helpCenterArticle : helpCenterArticles) {
            arrayList2.add(new CollectionDetailsRow.ArticleRow(helpCenterArticle.getArticleId(), helpCenterArticle.getTitle()));
        }
        arrayList.addAll(arrayList2);
        List<HelpCenterCollection> subCollections = helpCenterCollectionContent.getSubCollections();
        ArrayList arrayList3 = new ArrayList(m.y(subCollections, 10));
        for (HelpCenterCollection helpCenterCollection : subCollections) {
            arrayList3.add(new CollectionDetailsRow.CollectionRow(new CollectionRowData(helpCenterCollection.getId(), helpCenterCollection.getTitle(), helpCenterCollection.getSummary().length() == 0 ? 8 : 0, helpCenterCollection.getSummary(), helpCenterCollection.getArticlesCount(), helpCenterCollection.getCollectionsCount())));
        }
        arrayList.addAll(arrayList3);
        return arrayList;
    }
}
