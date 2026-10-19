package io.intercom.android.sdk.helpcenter.articles;

import p037cb.u0;
import p037cb.y0;

/* JADX INFO: compiled from: Article.kt */
/* JADX INFO: loaded from: classes3.dex */
@Ya.k
public final class Article {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final ArticleCard card;
    private final String relatedConversationId;

    /* JADX INFO: compiled from: Article.kt */
    public static final class Companion {
        private Companion() {
        }

        public final Ya.b<Article> serializer() {
            return Article$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.e eVar) {
            this();
        }
    }

    public /* synthetic */ Article(int i10, String str, ArticleCard articleCard, u0 u0Var) {
        if (2 != (i10 & 2)) {
            p241t7.b.w(i10, 2, Article$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        if ((i10 & 1) == 0) {
            this.relatedConversationId = null;
        } else {
            this.relatedConversationId = str;
        }
        this.card = articleCard;
    }

    public static /* synthetic */ Article copy$default(Article article, String str, ArticleCard articleCard, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = article.relatedConversationId;
        }
        if ((i10 & 2) != 0) {
            articleCard = article.card;
        }
        return article.copy(str, articleCard);
    }

    public static final /* synthetic */ void write$Self$intercom_sdk_base_release(Article article, p024bb.b bVar, p011ab.e eVar) {
        if (bVar.v(eVar) || article.relatedConversationId != null) {
            bVar.q(eVar, 0, y0.f22677a, article.relatedConversationId);
        }
        bVar.s(eVar, 1, ArticleCard$$serializer.INSTANCE, article.card);
    }

    public final String component1() {
        return this.relatedConversationId;
    }

    public final ArticleCard component2() {
        return this.card;
    }

    public final Article copy(String str, ArticleCard card) {
        kotlin.jvm.internal.i.e(card, "card");
        return new Article(str, card);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Article)) {
            return false;
        }
        Article article = (Article) obj;
        return kotlin.jvm.internal.i.a(this.relatedConversationId, article.relatedConversationId) && kotlin.jvm.internal.i.a(this.card, article.card);
    }

    public final ArticleCard getCard() {
        return this.card;
    }

    public final String getRelatedConversationId() {
        return this.relatedConversationId;
    }

    public int hashCode() {
        String str = this.relatedConversationId;
        return this.card.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public String toString() {
        return "Article(relatedConversationId=" + this.relatedConversationId + ", card=" + this.card + ')';
    }

    public Article(String str, ArticleCard card) {
        kotlin.jvm.internal.i.e(card, "card");
        this.relatedConversationId = str;
        this.card = card;
    }

    public /* synthetic */ Article(String str, ArticleCard articleCard, int i10, kotlin.jvm.internal.e eVar) {
        this((i10 & 1) != 0 ? null : str, articleCard);
    }

    public static /* synthetic */ void getCard$annotations() {
    }

    public static /* synthetic */ void getRelatedConversationId$annotations() {
    }
}
