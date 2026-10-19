package io.intercom.android.sdk.helpcenter.articles;

import p037cb.u0;

/* JADX INFO: compiled from: Article.kt */
/* JADX INFO: loaded from: classes3.dex */
@Ya.k
public final class ArticleCard {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String articleId;
    private final String title;

    /* JADX INFO: compiled from: Article.kt */
    public static final class Companion {
        private Companion() {
        }

        public final Ya.b<ArticleCard> serializer() {
            return ArticleCard$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.e eVar) {
            this();
        }
    }

    public /* synthetic */ ArticleCard(int i10, String str, String str2, u0 u0Var) {
        if (3 != (i10 & 3)) {
            p241t7.b.w(i10, 3, ArticleCard$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.articleId = str;
        this.title = str2;
    }

    public static /* synthetic */ ArticleCard copy$default(ArticleCard articleCard, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = articleCard.articleId;
        }
        if ((i10 & 2) != 0) {
            str2 = articleCard.title;
        }
        return articleCard.copy(str, str2);
    }

    public static final /* synthetic */ void write$Self$intercom_sdk_base_release(ArticleCard articleCard, p024bb.b bVar, p011ab.e eVar) {
        bVar.p(eVar, 0, articleCard.articleId);
        bVar.p(eVar, 1, articleCard.title);
    }

    public final String component1() {
        return this.articleId;
    }

    public final String component2() {
        return this.title;
    }

    public final ArticleCard copy(String articleId, String title) {
        kotlin.jvm.internal.i.e(articleId, "articleId");
        kotlin.jvm.internal.i.e(title, "title");
        return new ArticleCard(articleId, title);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ArticleCard)) {
            return false;
        }
        ArticleCard articleCard = (ArticleCard) obj;
        return kotlin.jvm.internal.i.a(this.articleId, articleCard.articleId) && kotlin.jvm.internal.i.a(this.title, articleCard.title);
    }

    public final String getArticleId() {
        return this.articleId;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.title.hashCode() + (this.articleId.hashCode() * 31);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("ArticleCard(articleId=");
        sb2.append(this.articleId);
        sb2.append(", title=");
        return B7.b.g(sb2, this.title, ')');
    }

    public ArticleCard(String articleId, String title) {
        kotlin.jvm.internal.i.e(articleId, "articleId");
        kotlin.jvm.internal.i.e(title, "title");
        this.articleId = articleId;
        this.title = title;
    }

    public static /* synthetic */ void getArticleId$annotations() {
    }

    public static /* synthetic */ void getTitle$annotations() {
    }
}
