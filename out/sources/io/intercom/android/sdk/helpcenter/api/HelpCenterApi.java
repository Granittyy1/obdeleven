package io.intercom.android.sdk.helpcenter.api;

import gc.a;
import gc.o;
import gc.s;
import gc.t;
import io.intercom.android.sdk.helpcenter.articles.ArticleResponse;
import io.intercom.android.sdk.helpcenter.collections.HelpCenterCollection;
import io.intercom.android.sdk.helpcenter.search.HelpCenterArticleSearchResponse;
import io.intercom.android.sdk.helpcenter.sections.HelpCenterCollectionContent;
import io.intercom.android.sdk.helpcenter.utils.ConstantsKt;
import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.c;
import p293xa.r;

/* JADX INFO: compiled from: HelpCenterApi.kt */
/* JADX INFO: loaded from: classes3.dex */
public interface HelpCenterApi {

    /* JADX INFO: compiled from: HelpCenterApi.kt */
    public static final class DefaultImpls {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Object fetchArticle$default(HelpCenterApi helpCenterApi, String str, Map map, c cVar, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetchArticle");
            }
            if ((i10 & 2) != 0) {
                map = HelpCenterApiHelper.INSTANCE.addDefaultOptions();
            }
            return helpCenterApi.fetchArticle(str, map, cVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Object fetchCollectionDetails$default(HelpCenterApi helpCenterApi, String str, Map map, c cVar, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetchCollectionDetails");
            }
            if ((i10 & 2) != 0) {
                map = HelpCenterApiHelper.INSTANCE.addDefaultOptions();
            }
            return helpCenterApi.fetchCollectionDetails(str, map, cVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Object fetchCollections$default(HelpCenterApi helpCenterApi, Map map, c cVar, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetchCollections");
            }
            if ((i10 & 1) != 0) {
                map = HelpCenterApiHelper.INSTANCE.addDefaultOptions();
            }
            return helpCenterApi.fetchCollections(map, cVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Object reactToArticle$default(HelpCenterApi helpCenterApi, String str, int i10, String str2, boolean z10, String str3, Map map, c cVar, int i11, Object obj) {
            if (obj == null) {
                return helpCenterApi.reactToArticle(str, i10, str2, (i11 & 8) != 0 ? false : z10, (i11 & 16) != 0 ? null : str3, (i11 & 32) != 0 ? HelpCenterApiHelper.INSTANCE.addDefaultOptions() : map, cVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: reactToArticle");
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Object searchForArticles$default(HelpCenterApi helpCenterApi, String str, String str2, Map map, c cVar, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: searchForArticles");
            }
            if ((i10 & 2) != 0) {
                str2 = null;
            }
            if ((i10 & 4) != 0) {
                map = HelpCenterApiHelper.INSTANCE.addDefaultOptions();
            }
            return helpCenterApi.searchForArticles(str, str2, map, cVar);
        }
    }

    @o("articles/{articleId}")
    Object fetchArticle(@s("articleId") String str, @a Map<String, String> map, c<? super NetworkResponse<ArticleResponse>> cVar);

    @o("help_center/collections/{id}")
    Object fetchCollectionDetails(@s("id") String str, @a Map<String, String> map, c<? super NetworkResponse<HelpCenterCollectionContent>> cVar);

    @o("help_center/collections")
    Object fetchCollections(@a Map<String, String> map, c<? super NetworkResponse<? extends List<HelpCenterCollection>>> cVar);

    @o("articles/{articleId}/react")
    Object reactToArticle(@s("articleId") String str, @t("reaction_index") int i10, @t("article_content_id") String str2, @t("allow_auto_responses") boolean z10, @t(ConstantsKt.KEY_ARTICLE_SOURCE) String str3, @a Map<String, String> map, c<? super NetworkResponse<r>> cVar);

    @o("help_center/search")
    Object searchForArticles(@t("phrase") String str, @t(ConstantsKt.KEY_ARTICLE_SOURCE) String str2, @a Map<String, String> map, c<? super NetworkResponse<? extends List<HelpCenterArticleSearchResponse>>> cVar);
}
