package io.intercom.android.sdk.helpcenter.articles;

import p037cb.u0;

/* JADX INFO: compiled from: Article.kt */
/* JADX INFO: loaded from: classes3.dex */
@Ya.k
public final class ArticleResponse {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final Article article;

    /* JADX INFO: compiled from: Article.kt */
    public static final class Companion {
        private Companion() {
        }

        public final Ya.b<ArticleResponse> serializer() {
            return ArticleResponse$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.e eVar) {
            this();
        }
    }

    public /* synthetic */ ArticleResponse(int i10, Article article, u0 u0Var) {
        if (1 == (i10 & 1)) {
            this.article = article;
        } else {
            p241t7.b.w(i10, 1, ArticleResponse$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
    }

    public static /* synthetic */ ArticleResponse copy$default(ArticleResponse articleResponse, Article article, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            article = articleResponse.article;
        }
        return articleResponse.copy(article);
    }

    public final Article component1() {
        return this.article;
    }

    public final ArticleResponse copy(Article article) {
        kotlin.jvm.internal.i.e(article, "article");
        return new ArticleResponse(article);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ArticleResponse) && kotlin.jvm.internal.i.a(this.article, ((ArticleResponse) obj).article);
    }

    public final Article getArticle() {
        return this.article;
    }

    public int hashCode() {
        return this.article.hashCode();
    }

    public String toString() {
        return "ArticleResponse(article=" + this.article + ')';
    }

    public ArticleResponse(Article article) {
        kotlin.jvm.internal.i.e(article, "article");
        this.article = article;
    }

    public static /* synthetic */ void getArticle$annotations() {
    }
}
