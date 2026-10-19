package io.intercom.android.sdk.helpcenter.search;

import p037cb.u0;

/* JADX INFO: compiled from: HelpCenterArticleSearchResponse.kt */
/* JADX INFO: loaded from: classes3.dex */
@Ya.k
public final class HelpCenterArticleSearchResponse {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String articleId;
    private final Highlight highlight;
    private final String summary;
    private final String title;
    private final String url;

    /* JADX INFO: compiled from: HelpCenterArticleSearchResponse.kt */
    public static final class Companion {
        private Companion() {
        }

        public final Ya.b<HelpCenterArticleSearchResponse> serializer() {
            return HelpCenterArticleSearchResponse$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.e eVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: HelpCenterArticleSearchResponse.kt */
    @Ya.k
    public static final class Highlight {
        public static final int $stable = 0;
        public static final Companion Companion = new Companion(null);
        private final String summary;
        private final String title;

        /* JADX INFO: compiled from: HelpCenterArticleSearchResponse.kt */
        public static final class Companion {
            private Companion() {
            }

            public final Ya.b<Highlight> serializer() {
                return HelpCenterArticleSearchResponse$Highlight$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.e eVar) {
                this();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Highlight() {
            this((String) null, (String) (0 == true ? 1 : 0), 3, (kotlin.jvm.internal.e) (0 == true ? 1 : 0));
        }

        public static /* synthetic */ Highlight copy$default(Highlight highlight, String str, String str2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = highlight.title;
            }
            if ((i10 & 2) != 0) {
                str2 = highlight.summary;
            }
            return highlight.copy(str, str2);
        }

        public static final /* synthetic */ void write$Self$intercom_sdk_base_release(Highlight highlight, p024bb.b bVar, p011ab.e eVar) {
            if (bVar.v(eVar) || !kotlin.jvm.internal.i.a(highlight.title, "")) {
                bVar.p(eVar, 0, highlight.title);
            }
            if (!bVar.v(eVar) && kotlin.jvm.internal.i.a(highlight.summary, "")) {
                return;
            }
            bVar.p(eVar, 1, highlight.summary);
        }

        public final String component1() {
            return this.title;
        }

        public final String component2() {
            return this.summary;
        }

        public final Highlight copy(String title, String summary) {
            kotlin.jvm.internal.i.e(title, "title");
            kotlin.jvm.internal.i.e(summary, "summary");
            return new Highlight(title, summary);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Highlight)) {
                return false;
            }
            Highlight highlight = (Highlight) obj;
            return kotlin.jvm.internal.i.a(this.title, highlight.title) && kotlin.jvm.internal.i.a(this.summary, highlight.summary);
        }

        public final String getSummary() {
            return this.summary;
        }

        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            return this.summary.hashCode() + (this.title.hashCode() * 31);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("Highlight(title=");
            sb2.append(this.title);
            sb2.append(", summary=");
            return B7.b.g(sb2, this.summary, ')');
        }

        public /* synthetic */ Highlight(int i10, String str, String str2, u0 u0Var) {
            if ((i10 & 1) == 0) {
                this.title = "";
            } else {
                this.title = str;
            }
            if ((i10 & 2) == 0) {
                this.summary = "";
            } else {
                this.summary = str2;
            }
        }

        public Highlight(String title, String summary) {
            kotlin.jvm.internal.i.e(title, "title");
            kotlin.jvm.internal.i.e(summary, "summary");
            this.title = title;
            this.summary = summary;
        }

        public /* synthetic */ Highlight(String str, String str2, int i10, kotlin.jvm.internal.e eVar) {
            this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? "" : str2);
        }

        public static /* synthetic */ void getSummary$annotations() {
        }

        public static /* synthetic */ void getTitle$annotations() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ HelpCenterArticleSearchResponse(int i10, String str, String str2, String str3, String str4, Highlight highlight, u0 u0Var) {
        String str5 = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        if (1 != (i10 & 1)) {
            p241t7.b.w(i10, 1, HelpCenterArticleSearchResponse$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.articleId = str;
        if ((i10 & 2) == 0) {
            this.summary = "";
        } else {
            this.summary = str2;
        }
        if ((i10 & 4) == 0) {
            this.title = "";
        } else {
            this.title = str3;
        }
        if ((i10 & 8) == 0) {
            this.url = "";
        } else {
            this.url = str4;
        }
        if ((i10 & 16) != 0) {
            this.highlight = highlight;
        } else {
            this.highlight = new Highlight(str5, (String) (objArr2 == true ? 1 : 0), 3, (kotlin.jvm.internal.e) (objArr == true ? 1 : 0));
        }
    }

    public static /* synthetic */ HelpCenterArticleSearchResponse copy$default(HelpCenterArticleSearchResponse helpCenterArticleSearchResponse, String str, String str2, String str3, String str4, Highlight highlight, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = helpCenterArticleSearchResponse.articleId;
        }
        if ((i10 & 2) != 0) {
            str2 = helpCenterArticleSearchResponse.summary;
        }
        String str5 = str2;
        if ((i10 & 4) != 0) {
            str3 = helpCenterArticleSearchResponse.title;
        }
        String str6 = str3;
        if ((i10 & 8) != 0) {
            str4 = helpCenterArticleSearchResponse.url;
        }
        String str7 = str4;
        if ((i10 & 16) != 0) {
            highlight = helpCenterArticleSearchResponse.highlight;
        }
        return helpCenterArticleSearchResponse.copy(str, str5, str6, str7, highlight);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ void write$Self$intercom_sdk_base_release(HelpCenterArticleSearchResponse helpCenterArticleSearchResponse, p024bb.b bVar, p011ab.e eVar) {
        bVar.p(eVar, 0, helpCenterArticleSearchResponse.articleId);
        if (bVar.v(eVar) || !kotlin.jvm.internal.i.a(helpCenterArticleSearchResponse.summary, "")) {
            bVar.p(eVar, 1, helpCenterArticleSearchResponse.summary);
        }
        if (bVar.v(eVar) || !kotlin.jvm.internal.i.a(helpCenterArticleSearchResponse.title, "")) {
            bVar.p(eVar, 2, helpCenterArticleSearchResponse.title);
        }
        int i10 = 3;
        if (bVar.v(eVar) || !kotlin.jvm.internal.i.a(helpCenterArticleSearchResponse.url, "")) {
            bVar.p(eVar, 3, helpCenterArticleSearchResponse.url);
        }
        if (!bVar.v(eVar) && kotlin.jvm.internal.i.a(helpCenterArticleSearchResponse.highlight, new Highlight((String) null, (String) (0 == true ? 1 : 0), i10, (kotlin.jvm.internal.e) (0 == true ? 1 : 0)))) {
            return;
        }
        bVar.s(eVar, 4, HelpCenterArticleSearchResponse$Highlight$$serializer.INSTANCE, helpCenterArticleSearchResponse.highlight);
    }

    public final String component1() {
        return this.articleId;
    }

    public final String component2() {
        return this.summary;
    }

    public final String component3() {
        return this.title;
    }

    public final String component4() {
        return this.url;
    }

    public final Highlight component5() {
        return this.highlight;
    }

    public final HelpCenterArticleSearchResponse copy(String articleId, String summary, String title, String url, Highlight highlight) {
        kotlin.jvm.internal.i.e(articleId, "articleId");
        kotlin.jvm.internal.i.e(summary, "summary");
        kotlin.jvm.internal.i.e(title, "title");
        kotlin.jvm.internal.i.e(url, "url");
        kotlin.jvm.internal.i.e(highlight, "highlight");
        return new HelpCenterArticleSearchResponse(articleId, summary, title, url, highlight);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HelpCenterArticleSearchResponse)) {
            return false;
        }
        HelpCenterArticleSearchResponse helpCenterArticleSearchResponse = (HelpCenterArticleSearchResponse) obj;
        return kotlin.jvm.internal.i.a(this.articleId, helpCenterArticleSearchResponse.articleId) && kotlin.jvm.internal.i.a(this.summary, helpCenterArticleSearchResponse.summary) && kotlin.jvm.internal.i.a(this.title, helpCenterArticleSearchResponse.title) && kotlin.jvm.internal.i.a(this.url, helpCenterArticleSearchResponse.url) && kotlin.jvm.internal.i.a(this.highlight, helpCenterArticleSearchResponse.highlight);
    }

    public final String getArticleId() {
        return this.articleId;
    }

    public final Highlight getHighlight() {
        return this.highlight;
    }

    public final String getSummary() {
        return this.summary;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return this.highlight.hashCode() + B1.a.b(this.url, B1.a.b(this.title, B1.a.b(this.summary, this.articleId.hashCode() * 31, 31), 31), 31);
    }

    public String toString() {
        return "HelpCenterArticleSearchResponse(articleId=" + this.articleId + ", summary=" + this.summary + ", title=" + this.title + ", url=" + this.url + ", highlight=" + this.highlight + ')';
    }

    public HelpCenterArticleSearchResponse(String articleId, String summary, String title, String url, Highlight highlight) {
        kotlin.jvm.internal.i.e(articleId, "articleId");
        kotlin.jvm.internal.i.e(summary, "summary");
        kotlin.jvm.internal.i.e(title, "title");
        kotlin.jvm.internal.i.e(url, "url");
        kotlin.jvm.internal.i.e(highlight, "highlight");
        this.articleId = articleId;
        this.summary = summary;
        this.title = title;
        this.url = url;
        this.highlight = highlight;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ HelpCenterArticleSearchResponse(String str, String str2, String str3, String str4, Highlight highlight, int i10, kotlin.jvm.internal.e eVar) {
        this(str, (i10 & 2) != 0 ? "" : str2, (i10 & 4) != 0 ? "" : str3, (i10 & 8) != 0 ? "" : str4, (i10 & 16) != 0 ? new Highlight((String) null, (String) (0 == true ? 1 : 0), 3, (kotlin.jvm.internal.e) (0 == true ? 1 : 0)) : highlight);
    }

    public static /* synthetic */ void getArticleId$annotations() {
    }

    public static /* synthetic */ void getHighlight$annotations() {
    }

    public static /* synthetic */ void getSummary$annotations() {
    }

    public static /* synthetic */ void getTitle$annotations() {
    }

    public static /* synthetic */ void getUrl$annotations() {
    }
}
