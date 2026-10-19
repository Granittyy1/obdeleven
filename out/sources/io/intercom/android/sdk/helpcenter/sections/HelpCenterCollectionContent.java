package io.intercom.android.sdk.helpcenter.sections;

import B1.a;
import Q8.d;
import Ya.b;
import Ya.k;
import io.intercom.android.sdk.helpcenter.collections.HelpCenterCollection;
import io.intercom.android.sdk.helpcenter.collections.HelpCenterCollection$$serializer;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;
import p005a4.p;
import p005a4.q;
import p037cb.C1521e;
import p037cb.u0;

/* JADX INFO: compiled from: HelpCenterCollectionContent.kt */
/* JADX INFO: loaded from: classes3.dex */
@k
public final class HelpCenterCollectionContent {
    private final int articlesCount;
    private final List<Author> authors;
    private final String collectionId;
    private final List<HelpCenterArticle> helpCenterArticles;
    private final List<HelpCenterSection> helpCenterSections;
    private final List<HelpCenterCollection> subCollections;
    private final String summary;
    private final String title;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final b<Object>[] $childSerializers = {null, null, null, new C1521e(HelpCenterArticle$$serializer.INSTANCE), new C1521e(HelpCenterSection$$serializer.INSTANCE), new C1521e(HelpCenterCollection$$serializer.INSTANCE), null, new C1521e(Author$$serializer.INSTANCE)};

    /* JADX INFO: compiled from: HelpCenterCollectionContent.kt */
    public static final class Companion {
        private Companion() {
        }

        public final b<HelpCenterCollectionContent> serializer() {
            return HelpCenterCollectionContent$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(e eVar) {
            this();
        }
    }

    public HelpCenterCollectionContent(int i10, String str, String str2, String str3, List list, List list2, List list3, int i11, List list4, u0 u0Var) {
        if (65 != (i10 & 65)) {
            p241t7.b.w(i10, 65, HelpCenterCollectionContent$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.collectionId = str;
        if ((i10 & 2) == 0) {
            this.title = "";
        } else {
            this.title = str2;
        }
        if ((i10 & 4) == 0) {
            this.summary = "";
        } else {
            this.summary = str3;
        }
        if ((i10 & 8) == 0) {
            this.helpCenterArticles = EmptyList.f42983b;
        } else {
            this.helpCenterArticles = list;
        }
        if ((i10 & 16) == 0) {
            this.helpCenterSections = EmptyList.f42983b;
        } else {
            this.helpCenterSections = list2;
        }
        if ((i10 & 32) == 0) {
            this.subCollections = EmptyList.f42983b;
        } else {
            this.subCollections = list3;
        }
        this.articlesCount = i11;
        if ((i10 & 128) == 0) {
            this.authors = EmptyList.f42983b;
        } else {
            this.authors = list4;
        }
    }

    public static final void write$Self$intercom_sdk_base_release(HelpCenterCollectionContent helpCenterCollectionContent, p024bb.b bVar, p011ab.e eVar) {
        b<Object>[] bVarArr = $childSerializers;
        bVar.p(eVar, 0, helpCenterCollectionContent.collectionId);
        if (bVar.v(eVar) || !i.a(helpCenterCollectionContent.title, "")) {
            bVar.p(eVar, 1, helpCenterCollectionContent.title);
        }
        if (bVar.v(eVar) || !i.a(helpCenterCollectionContent.summary, "")) {
            bVar.p(eVar, 2, helpCenterCollectionContent.summary);
        }
        if (bVar.v(eVar) || !i.a(helpCenterCollectionContent.helpCenterArticles, EmptyList.f42983b)) {
            bVar.s(eVar, 3, bVarArr[3], helpCenterCollectionContent.helpCenterArticles);
        }
        if (bVar.v(eVar) || !i.a(helpCenterCollectionContent.helpCenterSections, EmptyList.f42983b)) {
            bVar.s(eVar, 4, bVarArr[4], helpCenterCollectionContent.helpCenterSections);
        }
        if (bVar.v(eVar) || !i.a(helpCenterCollectionContent.subCollections, EmptyList.f42983b)) {
            bVar.s(eVar, 5, bVarArr[5], helpCenterCollectionContent.subCollections);
        }
        bVar.g(6, helpCenterCollectionContent.articlesCount, eVar);
        if (!bVar.v(eVar) && i.a(helpCenterCollectionContent.authors, EmptyList.f42983b)) {
            return;
        }
        bVar.s(eVar, 7, bVarArr[7], helpCenterCollectionContent.authors);
    }

    public final String component1() {
        return this.collectionId;
    }

    public final String component2() {
        return this.title;
    }

    public final String component3() {
        return this.summary;
    }

    public final List<HelpCenterArticle> component4() {
        return this.helpCenterArticles;
    }

    public final List<HelpCenterSection> component5() {
        return this.helpCenterSections;
    }

    public final List<HelpCenterCollection> component6() {
        return this.subCollections;
    }

    public final int component7() {
        return this.articlesCount;
    }

    public final List<Author> component8() {
        return this.authors;
    }

    public final HelpCenterCollectionContent copy(String collectionId, String title, String summary, List<HelpCenterArticle> helpCenterArticles, List<HelpCenterSection> helpCenterSections, List<HelpCenterCollection> subCollections, int i10, List<Author> authors) {
        i.e(collectionId, "collectionId");
        i.e(title, "title");
        i.e(summary, "summary");
        i.e(helpCenterArticles, "helpCenterArticles");
        i.e(helpCenterSections, "helpCenterSections");
        i.e(subCollections, "subCollections");
        i.e(authors, "authors");
        return new HelpCenterCollectionContent(collectionId, title, summary, helpCenterArticles, helpCenterSections, subCollections, i10, authors);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HelpCenterCollectionContent)) {
            return false;
        }
        HelpCenterCollectionContent helpCenterCollectionContent = (HelpCenterCollectionContent) obj;
        return i.a(this.collectionId, helpCenterCollectionContent.collectionId) && i.a(this.title, helpCenterCollectionContent.title) && i.a(this.summary, helpCenterCollectionContent.summary) && i.a(this.helpCenterArticles, helpCenterCollectionContent.helpCenterArticles) && i.a(this.helpCenterSections, helpCenterCollectionContent.helpCenterSections) && i.a(this.subCollections, helpCenterCollectionContent.subCollections) && this.articlesCount == helpCenterCollectionContent.articlesCount && i.a(this.authors, helpCenterCollectionContent.authors);
    }

    public final int getArticlesCount() {
        return this.articlesCount;
    }

    public final List<Author> getAuthors() {
        return this.authors;
    }

    public final String getCollectionId() {
        return this.collectionId;
    }

    public final List<HelpCenterArticle> getHelpCenterArticles() {
        return this.helpCenterArticles;
    }

    public final List<HelpCenterSection> getHelpCenterSections() {
        return this.helpCenterSections;
    }

    public final List<HelpCenterCollection> getSubCollections() {
        return this.subCollections;
    }

    public final String getSummary() {
        return this.summary;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.authors.hashCode() + q.b(this.articlesCount, p.d(p.d(p.d(a.b(this.summary, a.b(this.title, this.collectionId.hashCode() * 31, 31), 31), 31, this.helpCenterArticles), 31, this.helpCenterSections), 31, this.subCollections), 31);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("HelpCenterCollectionContent(collectionId=");
        sb2.append(this.collectionId);
        sb2.append(", title=");
        sb2.append(this.title);
        sb2.append(", summary=");
        sb2.append(this.summary);
        sb2.append(", helpCenterArticles=");
        sb2.append(this.helpCenterArticles);
        sb2.append(", helpCenterSections=");
        sb2.append(this.helpCenterSections);
        sb2.append(", subCollections=");
        sb2.append(this.subCollections);
        sb2.append(", articlesCount=");
        sb2.append(this.articlesCount);
        sb2.append(", authors=");
        return d.b(sb2, this.authors, ')');
    }

    public HelpCenterCollectionContent(String collectionId, String title, String summary, List<HelpCenterArticle> helpCenterArticles, List<HelpCenterSection> helpCenterSections, List<HelpCenterCollection> subCollections, int i10, List<Author> authors) {
        i.e(collectionId, "collectionId");
        i.e(title, "title");
        i.e(summary, "summary");
        i.e(helpCenterArticles, "helpCenterArticles");
        i.e(helpCenterSections, "helpCenterSections");
        i.e(subCollections, "subCollections");
        i.e(authors, "authors");
        this.collectionId = collectionId;
        this.title = title;
        this.summary = summary;
        this.helpCenterArticles = helpCenterArticles;
        this.helpCenterSections = helpCenterSections;
        this.subCollections = subCollections;
        this.articlesCount = i10;
        this.authors = authors;
    }

    public static /* synthetic */ void getArticlesCount$annotations() {
    }

    public static /* synthetic */ void getAuthors$annotations() {
    }

    public static /* synthetic */ void getCollectionId$annotations() {
    }

    public static /* synthetic */ void getHelpCenterArticles$annotations() {
    }

    @p293xa.d
    public static /* synthetic */ void getHelpCenterSections$annotations() {
    }

    public static /* synthetic */ void getSubCollections$annotations() {
    }

    public static /* synthetic */ void getSummary$annotations() {
    }

    public static /* synthetic */ void getTitle$annotations() {
    }

    public HelpCenterCollectionContent(String str, String str2, String str3, List list, List list2, List list3, int i10, List list4, int i11, e eVar) {
        this(str, (i11 & 2) != 0 ? "" : str2, (i11 & 4) != 0 ? "" : str3, (i11 & 8) != 0 ? EmptyList.f42983b : list, (i11 & 16) != 0 ? EmptyList.f42983b : list2, (i11 & 32) != 0 ? EmptyList.f42983b : list3, i10, (i11 & 128) != 0 ? EmptyList.f42983b : list4);
    }
}
