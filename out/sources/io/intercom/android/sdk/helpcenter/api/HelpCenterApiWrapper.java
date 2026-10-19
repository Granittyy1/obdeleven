package io.intercom.android.sdk.helpcenter.api;

import Aa.c;
import Ia.p;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.helpcenter.collections.HelpCenterCollection;
import io.intercom.android.sdk.helpcenter.search.HelpCenterArticleSearchResponse;
import io.intercom.android.sdk.helpcenter.sections.HelpCenterCollectionContent;
import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.i;
import kotlin.text.m;
import kotlinx.coroutines.A;
import kotlinx.coroutines.C2673a0;
import kotlinx.coroutines.C2680e;
import kotlinx.coroutines.N;
import kotlinx.coroutines.internal.q;
import kotlinx.coroutines.q0;
import me.zhanghai.android.materialprogressbar.R;
import p293xa.r;

/* JADX INFO: compiled from: HelpCenterApiWrapper.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class HelpCenterApiWrapper {
    public static final int $stable = 0;
    public static final HelpCenterApiWrapper INSTANCE = new HelpCenterApiWrapper();

    /* JADX INFO: renamed from: io.intercom.android.sdk.helpcenter.api.HelpCenterApiWrapper$fetchHelpCenterCollection$1, reason: invalid class name */
    /* JADX INFO: compiled from: HelpCenterApiWrapper.kt */
    @c(c = "io.intercom.android.sdk.helpcenter.api.HelpCenterApiWrapper$fetchHelpCenterCollection$1", f = "HelpCenterApiWrapper.kt", l = {R.styleable.AppCompatTheme_selectableItemBackgroundBorderless, R.styleable.AppCompatTheme_spinnerDropDownItemStyle}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends SuspendLambda implements p<A, kotlin.coroutines.c<? super r>, Object> {
        final /* synthetic */ CollectionContentRequestCallback $collectionContentRequestCallback;
        final /* synthetic */ String $collectionId;
        final /* synthetic */ MetricTracker $metricTracker;
        int label;

        /* JADX INFO: renamed from: io.intercom.android.sdk.helpcenter.api.HelpCenterApiWrapper$fetchHelpCenterCollection$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: HelpCenterApiWrapper.kt */
        @c(c = "io.intercom.android.sdk.helpcenter.api.HelpCenterApiWrapper$fetchHelpCenterCollection$1$1", f = "HelpCenterApiWrapper.kt", l = {}, m = "invokeSuspend")
        public static final class C04001 extends SuspendLambda implements p<A, kotlin.coroutines.c<? super r>, Object> {
            final /* synthetic */ CollectionContentRequestCallback $collectionContentRequestCallback;
            final /* synthetic */ NetworkResponse<HelpCenterCollectionContent> $fetchSectionsListResponse;
            final /* synthetic */ MetricTracker $metricTracker;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C04001(NetworkResponse<HelpCenterCollectionContent> networkResponse, MetricTracker metricTracker, CollectionContentRequestCallback collectionContentRequestCallback, kotlin.coroutines.c<? super C04001> cVar) {
                super(2, cVar);
                this.$fetchSectionsListResponse = networkResponse;
                this.$metricTracker = metricTracker;
                this.$collectionContentRequestCallback = collectionContentRequestCallback;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
                return new C04001(this.$fetchSectionsListResponse, this.$metricTracker, this.$collectionContentRequestCallback, cVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                b.b(obj);
                NetworkResponse<HelpCenterCollectionContent> networkResponse = this.$fetchSectionsListResponse;
                if (networkResponse instanceof NetworkResponse.ServerError) {
                    this.$metricTracker.failedHelpCenter(MetricTracker.Object.HELP_CENTER_DATA_API, MetricTracker.Place.ARTICLE_LIST, String.valueOf(((NetworkResponse.ServerError) networkResponse).getCode()), false);
                    this.$collectionContentRequestCallback.onError(((NetworkResponse.ServerError) this.$fetchSectionsListResponse).getCode());
                } else if ((networkResponse instanceof NetworkResponse.ClientError) || (networkResponse instanceof NetworkResponse.NetworkError)) {
                    this.$metricTracker.failedHelpCenter(MetricTracker.Object.HELP_CENTER_DATA_API, MetricTracker.Place.ARTICLE_LIST, null, false);
                    this.$collectionContentRequestCallback.onFailure();
                } else {
                    if (!(networkResponse instanceof NetworkResponse.Success)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    this.$collectionContentRequestCallback.onComplete((HelpCenterCollectionContent) ((NetworkResponse.Success) networkResponse).getBody());
                }
                return r.f47939a;
            }

            @Override // Ia.p
            public final Object invoke(A a10, kotlin.coroutines.c<? super r> cVar) {
                return ((C04001) create(a10, cVar)).invokeSuspend(r.f47939a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(MetricTracker metricTracker, String str, CollectionContentRequestCallback collectionContentRequestCallback, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.$metricTracker = metricTracker;
            this.$collectionId = str;
            this.$collectionContentRequestCallback = collectionContentRequestCallback;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
            return new AnonymousClass1(this.$metricTracker, this.$collectionId, this.$collectionContentRequestCallback, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 == 1) {
                    b.b(obj);
                } else {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    b.b(obj);
                }
                return r.f47939a;
            }
            b.b(obj);
            this.$metricTracker.requestedHelpCenterData(MetricTracker.Place.ARTICLE_LIST);
            HelpCenterApi helpCenterApi = Injector.get().getHelpCenterApi();
            String str = this.$collectionId;
            this.label = 1;
            obj = HelpCenterApi.DefaultImpls.fetchCollectionDetails$default(helpCenterApi, str, null, this, 2, null);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
            Sa.b bVar = N.f43198a;
            q0 q0Var = q.f43500a;
            C04001 c04001 = new C04001((NetworkResponse) obj, this.$metricTracker, this.$collectionContentRequestCallback, null);
            this.label = 2;
            if (C2680e.f(q0Var, c04001, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            return r.f47939a;
        }

        @Override // Ia.p
        public final Object invoke(A a10, kotlin.coroutines.c<? super r> cVar) {
            return ((AnonymousClass1) create(a10, cVar)).invokeSuspend(r.f47939a);
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.helpcenter.api.HelpCenterApiWrapper$fetchHelpCenterCollections$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: HelpCenterApiWrapper.kt */
    @c(c = "io.intercom.android.sdk.helpcenter.api.HelpCenterApiWrapper$fetchHelpCenterCollections$1", f = "HelpCenterApiWrapper.kt", l = {23, 24}, m = "invokeSuspend")
    public static final class C22551 extends SuspendLambda implements p<A, kotlin.coroutines.c<? super r>, Object> {
        final /* synthetic */ CollectionRequestCallback $collectionRequestCallback;
        final /* synthetic */ MetricTracker $metricTracker;
        int label;

        /* JADX INFO: renamed from: io.intercom.android.sdk.helpcenter.api.HelpCenterApiWrapper$fetchHelpCenterCollections$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: HelpCenterApiWrapper.kt */
        @c(c = "io.intercom.android.sdk.helpcenter.api.HelpCenterApiWrapper$fetchHelpCenterCollections$1$1", f = "HelpCenterApiWrapper.kt", l = {}, m = "invokeSuspend")
        public static final class C04011 extends SuspendLambda implements p<A, kotlin.coroutines.c<? super r>, Object> {
            final /* synthetic */ CollectionRequestCallback $collectionRequestCallback;
            final /* synthetic */ NetworkResponse<List<HelpCenterCollection>> $fetchCollectionListResponse;
            final /* synthetic */ MetricTracker $metricTracker;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C04011(NetworkResponse<? extends List<HelpCenterCollection>> networkResponse, MetricTracker metricTracker, CollectionRequestCallback collectionRequestCallback, kotlin.coroutines.c<? super C04011> cVar) {
                super(2, cVar);
                this.$fetchCollectionListResponse = networkResponse;
                this.$metricTracker = metricTracker;
                this.$collectionRequestCallback = collectionRequestCallback;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
                return new C04011(this.$fetchCollectionListResponse, this.$metricTracker, this.$collectionRequestCallback, cVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                b.b(obj);
                NetworkResponse<List<HelpCenterCollection>> networkResponse = this.$fetchCollectionListResponse;
                if (networkResponse instanceof NetworkResponse.ServerError) {
                    this.$metricTracker.failedHelpCenter(MetricTracker.Object.HELP_CENTER_DATA_API, MetricTracker.Place.COLLECTION_LIST, String.valueOf(((NetworkResponse.ServerError) networkResponse).getCode()), false);
                    this.$collectionRequestCallback.onError(((NetworkResponse.ServerError) this.$fetchCollectionListResponse).getCode());
                } else if ((networkResponse instanceof NetworkResponse.ClientError) || (networkResponse instanceof NetworkResponse.NetworkError)) {
                    this.$metricTracker.failedHelpCenter(MetricTracker.Object.HELP_CENTER_DATA_API, MetricTracker.Place.COLLECTION_LIST, null, false);
                    this.$collectionRequestCallback.onFailure();
                } else {
                    if (!(networkResponse instanceof NetworkResponse.Success)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    this.$collectionRequestCallback.onComplete((List) ((NetworkResponse.Success) networkResponse).getBody());
                }
                return r.f47939a;
            }

            @Override // Ia.p
            public final Object invoke(A a10, kotlin.coroutines.c<? super r> cVar) {
                return ((C04011) create(a10, cVar)).invokeSuspend(r.f47939a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C22551(MetricTracker metricTracker, CollectionRequestCallback collectionRequestCallback, kotlin.coroutines.c<? super C22551> cVar) {
            super(2, cVar);
            this.$metricTracker = metricTracker;
            this.$collectionRequestCallback = collectionRequestCallback;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
            return new C22551(this.$metricTracker, this.$collectionRequestCallback, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 == 1) {
                    b.b(obj);
                } else {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    b.b(obj);
                }
                return r.f47939a;
            }
            b.b(obj);
            this.$metricTracker.requestedHelpCenterData(MetricTracker.Place.COLLECTION_LIST);
            HelpCenterApi helpCenterApi = Injector.get().getHelpCenterApi();
            this.label = 1;
            obj = HelpCenterApi.DefaultImpls.fetchCollections$default(helpCenterApi, null, this, 1, null);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
            Sa.b bVar = N.f43198a;
            q0 q0Var = q.f43500a;
            C04011 c04011 = new C04011((NetworkResponse) obj, this.$metricTracker, this.$collectionRequestCallback, null);
            this.label = 2;
            if (C2680e.f(q0Var, c04011, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            return r.f47939a;
        }

        @Override // Ia.p
        public final Object invoke(A a10, kotlin.coroutines.c<? super r> cVar) {
            return ((C22551) create(a10, cVar)).invokeSuspend(r.f47939a);
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.helpcenter.api.HelpCenterApiWrapper$fetchHelpCenterResultsForSearchTerm$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: HelpCenterApiWrapper.kt */
    @c(c = "io.intercom.android.sdk.helpcenter.api.HelpCenterApiWrapper$fetchHelpCenterResultsForSearchTerm$1", f = "HelpCenterApiWrapper.kt", l = {R.styleable.AppCompatTheme_colorSwitchThumbNormal, R.styleable.AppCompatTheme_controlBackground}, m = "invokeSuspend")
    public static final class C22561 extends SuspendLambda implements p<A, kotlin.coroutines.c<? super r>, Object> {
        final /* synthetic */ MetricTracker $metricTracker;
        final /* synthetic */ SearchRequestCallback $searchRequestCallback;
        final /* synthetic */ String $searchTerm;
        int label;

        /* JADX INFO: renamed from: io.intercom.android.sdk.helpcenter.api.HelpCenterApiWrapper$fetchHelpCenterResultsForSearchTerm$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: HelpCenterApiWrapper.kt */
        @c(c = "io.intercom.android.sdk.helpcenter.api.HelpCenterApiWrapper$fetchHelpCenterResultsForSearchTerm$1$1", f = "HelpCenterApiWrapper.kt", l = {}, m = "invokeSuspend")
        public static final class C04021 extends SuspendLambda implements p<A, kotlin.coroutines.c<? super r>, Object> {
            final /* synthetic */ MetricTracker $metricTracker;
            final /* synthetic */ NetworkResponse<List<HelpCenterArticleSearchResponse>> $searchForArticlesResponse;
            final /* synthetic */ SearchRequestCallback $searchRequestCallback;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C04021(NetworkResponse<? extends List<HelpCenterArticleSearchResponse>> networkResponse, MetricTracker metricTracker, SearchRequestCallback searchRequestCallback, kotlin.coroutines.c<? super C04021> cVar) {
                super(2, cVar);
                this.$searchForArticlesResponse = networkResponse;
                this.$metricTracker = metricTracker;
                this.$searchRequestCallback = searchRequestCallback;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
                return new C04021(this.$searchForArticlesResponse, this.$metricTracker, this.$searchRequestCallback, cVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                b.b(obj);
                NetworkResponse<List<HelpCenterArticleSearchResponse>> networkResponse = this.$searchForArticlesResponse;
                if (networkResponse instanceof NetworkResponse.ServerError) {
                    this.$metricTracker.failedHelpCenter(MetricTracker.Object.HELP_CENTER_DATA_API, MetricTracker.Place.SEARCH_RESULTS, String.valueOf(((NetworkResponse.ServerError) networkResponse).getCode()), false);
                    this.$searchRequestCallback.onError(((NetworkResponse.ServerError) this.$searchForArticlesResponse).getCode());
                } else if ((networkResponse instanceof NetworkResponse.ClientError) || (networkResponse instanceof NetworkResponse.NetworkError)) {
                    this.$metricTracker.failedHelpCenter(MetricTracker.Object.HELP_CENTER_DATA_API, MetricTracker.Place.SEARCH_RESULTS, null, false);
                    this.$searchRequestCallback.onFailure();
                } else {
                    if (!(networkResponse instanceof NetworkResponse.Success)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    this.$searchRequestCallback.onComplete(HelpCenterApiWrapper.INSTANCE.transformSearchResponse((List) ((NetworkResponse.Success) networkResponse).getBody()));
                }
                return r.f47939a;
            }

            @Override // Ia.p
            public final Object invoke(A a10, kotlin.coroutines.c<? super r> cVar) {
                return ((C04021) create(a10, cVar)).invokeSuspend(r.f47939a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C22561(MetricTracker metricTracker, String str, SearchRequestCallback searchRequestCallback, kotlin.coroutines.c<? super C22561> cVar) {
            super(2, cVar);
            this.$metricTracker = metricTracker;
            this.$searchTerm = str;
            this.$searchRequestCallback = searchRequestCallback;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
            return new C22561(this.$metricTracker, this.$searchTerm, this.$searchRequestCallback, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 == 1) {
                    b.b(obj);
                } else {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    b.b(obj);
                }
                return r.f47939a;
            }
            b.b(obj);
            this.$metricTracker.requestedHelpCenterData(MetricTracker.Place.SEARCH_RESULTS);
            HelpCenterApi helpCenterApi = Injector.get().getHelpCenterApi();
            String str = this.$searchTerm;
            this.label = 1;
            obj = HelpCenterApi.DefaultImpls.searchForArticles$default(helpCenterApi, str, null, null, this, 6, null);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
            Sa.b bVar = N.f43198a;
            q0 q0Var = q.f43500a;
            C04021 c04021 = new C04021((NetworkResponse) obj, this.$metricTracker, this.$searchRequestCallback, null);
            this.label = 2;
            if (C2680e.f(q0Var, c04021, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            return r.f47939a;
        }

        @Override // Ia.p
        public final Object invoke(A a10, kotlin.coroutines.c<? super r> cVar) {
            return ((C22561) create(a10, cVar)).invokeSuspend(r.f47939a);
        }
    }

    private HelpCenterApiWrapper() {
    }

    private final String removeHighlightTags(String str) {
        return m.G(m.G(str, "<highlight>", ""), "</highlight>", "");
    }

    public final void fetchHelpCenterCollection(MetricTracker metricTracker, String collectionId, CollectionContentRequestCallback collectionContentRequestCallback) {
        i.e(metricTracker, "metricTracker");
        i.e(collectionId, "collectionId");
        i.e(collectionContentRequestCallback, "collectionContentRequestCallback");
        C2680e.c(C2673a0.f43223b, N.f43200c, null, new AnonymousClass1(metricTracker, collectionId, collectionContentRequestCallback, null), 2);
    }

    public final void fetchHelpCenterCollections(MetricTracker metricTracker, CollectionRequestCallback collectionRequestCallback) {
        i.e(metricTracker, "metricTracker");
        i.e(collectionRequestCallback, "collectionRequestCallback");
        C2680e.c(C2673a0.f43223b, N.f43200c, null, new C22551(metricTracker, collectionRequestCallback, null), 2);
    }

    public final void fetchHelpCenterResultsForSearchTerm(MetricTracker metricTracker, String searchTerm, SearchRequestCallback searchRequestCallback) {
        i.e(metricTracker, "metricTracker");
        i.e(searchTerm, "searchTerm");
        i.e(searchRequestCallback, "searchRequestCallback");
        C2680e.c(C2673a0.f43223b, N.f43200c, null, new C22561(metricTracker, searchTerm, searchRequestCallback, null), 2);
    }

    public final List<HelpCenterArticleSearchResult> transformSearchResponse(List<HelpCenterArticleSearchResponse> response) {
        i.e(response, "response");
        List<HelpCenterArticleSearchResponse> list = response;
        ArrayList arrayList = new ArrayList(kotlin.collections.m.y(list, 10));
        for (HelpCenterArticleSearchResponse helpCenterArticleSearchResponse : list) {
            String title = helpCenterArticleSearchResponse.getHighlight().getTitle();
            String title2 = (title == null || title.length() == 0) ? helpCenterArticleSearchResponse.getTitle() : helpCenterArticleSearchResponse.getHighlight().getTitle();
            String summary = helpCenterArticleSearchResponse.getHighlight().getSummary();
            String str = "";
            if (summary == null) {
                summary = "";
            }
            String articleId = helpCenterArticleSearchResponse.getArticleId();
            HelpCenterApiWrapper helpCenterApiWrapper = INSTANCE;
            String strRemoveHighlightTags = helpCenterApiWrapper.removeHighlightTags(title2);
            String summary2 = helpCenterArticleSearchResponse.getSummary();
            if (summary2 != null) {
                str = summary2;
            }
            arrayList.add(new HelpCenterArticleSearchResult(articleId, strRemoveHighlightTags, str, helpCenterApiWrapper.removeHighlightTags(summary)));
        }
        return arrayList;
    }
}
