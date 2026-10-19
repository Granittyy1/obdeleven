package io.intercom.android.sdk.helpcenter.sections;

import Ya.b;
import Ya.k;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;
import p037cb.u0;

/* JADX INFO: compiled from: HelpCenterCollectionContent.kt */
/* JADX INFO: loaded from: classes3.dex */
@k
public final class HelpCenterArticle {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String articleId;
    private final String title;

    /* JADX INFO: compiled from: HelpCenterCollectionContent.kt */
    public static final class Companion {
        private Companion() {
        }

        public final b<HelpCenterArticle> serializer() {
            return HelpCenterArticle$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(e eVar) {
            this();
        }
    }

    public /* synthetic */ HelpCenterArticle(int i10, String str, String str2, u0 u0Var) {
        if (1 != (i10 & 1)) {
            p241t7.b.w(i10, 1, HelpCenterArticle$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.articleId = str;
        if ((i10 & 2) == 0) {
            this.title = "";
        } else {
            this.title = str2;
        }
    }

    public static /* synthetic */ HelpCenterArticle copy$default(HelpCenterArticle helpCenterArticle, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = helpCenterArticle.articleId;
        }
        if ((i10 & 2) != 0) {
            str2 = helpCenterArticle.title;
        }
        return helpCenterArticle.copy(str, str2);
    }

    public static final /* synthetic */ void write$Self$intercom_sdk_base_release(HelpCenterArticle helpCenterArticle, p024bb.b bVar, p011ab.e eVar) {
        bVar.p(eVar, 0, helpCenterArticle.articleId);
        if (!bVar.v(eVar) && i.a(helpCenterArticle.title, "")) {
            return;
        }
        bVar.p(eVar, 1, helpCenterArticle.title);
    }

    public final String component1() {
        return this.articleId;
    }

    public final String component2() {
        return this.title;
    }

    public final HelpCenterArticle copy(String articleId, String title) {
        i.e(articleId, "articleId");
        i.e(title, "title");
        return new HelpCenterArticle(articleId, title);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HelpCenterArticle)) {
            return false;
        }
        HelpCenterArticle helpCenterArticle = (HelpCenterArticle) obj;
        return i.a(this.articleId, helpCenterArticle.articleId) && i.a(this.title, helpCenterArticle.title);
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
        StringBuilder sb2 = new StringBuilder("HelpCenterArticle(articleId=");
        sb2.append(this.articleId);
        sb2.append(", title=");
        return B7.b.g(sb2, this.title, ')');
    }

    public HelpCenterArticle(String articleId, String title) {
        i.e(articleId, "articleId");
        i.e(title, "title");
        this.articleId = articleId;
        this.title = title;
    }

    public /* synthetic */ HelpCenterArticle(String str, String str2, int i10, e eVar) {
        this(str, (i10 & 2) != 0 ? "" : str2);
    }

    public static /* synthetic */ void getArticleId$annotations() {
    }

    public static /* synthetic */ void getTitle$annotations() {
    }
}
