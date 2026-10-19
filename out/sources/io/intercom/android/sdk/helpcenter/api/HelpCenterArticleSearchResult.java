package io.intercom.android.sdk.helpcenter.api;

import B1.a;
import B7.b;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: HelpCenterArticleSearchResult.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class HelpCenterArticleSearchResult {
    public static final int $stable = 0;
    private final String articleId;
    private final String matchingSnippet;
    private final String summary;
    private final String title;

    public HelpCenterArticleSearchResult(String articleId, String title, String summary, String matchingSnippet) {
        i.e(articleId, "articleId");
        i.e(title, "title");
        i.e(summary, "summary");
        i.e(matchingSnippet, "matchingSnippet");
        this.articleId = articleId;
        this.title = title;
        this.summary = summary;
        this.matchingSnippet = matchingSnippet;
    }

    public static /* synthetic */ HelpCenterArticleSearchResult copy$default(HelpCenterArticleSearchResult helpCenterArticleSearchResult, String str, String str2, String str3, String str4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = helpCenterArticleSearchResult.articleId;
        }
        if ((i10 & 2) != 0) {
            str2 = helpCenterArticleSearchResult.title;
        }
        if ((i10 & 4) != 0) {
            str3 = helpCenterArticleSearchResult.summary;
        }
        if ((i10 & 8) != 0) {
            str4 = helpCenterArticleSearchResult.matchingSnippet;
        }
        return helpCenterArticleSearchResult.copy(str, str2, str3, str4);
    }

    public final String component1() {
        return this.articleId;
    }

    public final String component2() {
        return this.title;
    }

    public final String component3() {
        return this.summary;
    }

    public final String component4() {
        return this.matchingSnippet;
    }

    public final HelpCenterArticleSearchResult copy(String articleId, String title, String summary, String matchingSnippet) {
        i.e(articleId, "articleId");
        i.e(title, "title");
        i.e(summary, "summary");
        i.e(matchingSnippet, "matchingSnippet");
        return new HelpCenterArticleSearchResult(articleId, title, summary, matchingSnippet);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HelpCenterArticleSearchResult)) {
            return false;
        }
        HelpCenterArticleSearchResult helpCenterArticleSearchResult = (HelpCenterArticleSearchResult) obj;
        return i.a(this.articleId, helpCenterArticleSearchResult.articleId) && i.a(this.title, helpCenterArticleSearchResult.title) && i.a(this.summary, helpCenterArticleSearchResult.summary) && i.a(this.matchingSnippet, helpCenterArticleSearchResult.matchingSnippet);
    }

    public final String getArticleId() {
        return this.articleId;
    }

    public final String getMatchingSnippet() {
        return this.matchingSnippet;
    }

    public final String getSummary() {
        return this.summary;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.matchingSnippet.hashCode() + a.b(this.summary, a.b(this.title, this.articleId.hashCode() * 31, 31), 31);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("HelpCenterArticleSearchResult(articleId=");
        sb2.append(this.articleId);
        sb2.append(", title=");
        sb2.append(this.title);
        sb2.append(", summary=");
        sb2.append(this.summary);
        sb2.append(", matchingSnippet=");
        return b.g(sb2, this.matchingSnippet, ')');
    }

    public /* synthetic */ HelpCenterArticleSearchResult(String str, String str2, String str3, String str4, int i10, e eVar) {
        this(str, (i10 & 2) != 0 ? "" : str2, (i10 & 4) != 0 ? "" : str3, (i10 & 8) != 0 ? "" : str4);
    }
}
