package io.intercom.android.sdk.helpcenter.articles;

/* JADX INFO: compiled from: ArticleViewState.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class ArticleMetadata {
    public static final int $stable = 0;
    private final String id;
    private final String title;

    public ArticleMetadata(String id, String str) {
        kotlin.jvm.internal.i.e(id, "id");
        this.id = id;
        this.title = str;
    }

    public static /* synthetic */ ArticleMetadata copy$default(ArticleMetadata articleMetadata, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = articleMetadata.id;
        }
        if ((i10 & 2) != 0) {
            str2 = articleMetadata.title;
        }
        return articleMetadata.copy(str, str2);
    }

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.title;
    }

    public final ArticleMetadata copy(String id, String str) {
        kotlin.jvm.internal.i.e(id, "id");
        return new ArticleMetadata(id, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ArticleMetadata)) {
            return false;
        }
        ArticleMetadata articleMetadata = (ArticleMetadata) obj;
        return kotlin.jvm.internal.i.a(this.id, articleMetadata.id) && kotlin.jvm.internal.i.a(this.title, articleMetadata.title);
    }

    public final String getId() {
        return this.id;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        String str = this.title;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("ArticleMetadata(id=");
        sb2.append(this.id);
        sb2.append(", title=");
        return B7.b.g(sb2, this.title, ')');
    }

    public /* synthetic */ ArticleMetadata(String str, String str2, int i10, kotlin.jvm.internal.e eVar) {
        this(str, (i10 & 2) != 0 ? null : str2);
    }
}
