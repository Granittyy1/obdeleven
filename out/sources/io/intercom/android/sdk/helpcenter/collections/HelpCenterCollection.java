package io.intercom.android.sdk.helpcenter.collections;

import A1.C0575j;
import B1.a;
import Ya.b;
import Ya.k;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;
import p005a4.q;
import p037cb.u0;

/* JADX INFO: compiled from: HelpCenterCollection.kt */
/* JADX INFO: loaded from: classes3.dex */
@k
public final class HelpCenterCollection {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final int articlesCount;
    private final int collectionsCount;
    private final String id;
    private final String summary;
    private final String title;

    /* JADX INFO: compiled from: HelpCenterCollection.kt */
    public static final class Companion {
        private Companion() {
        }

        public final b<HelpCenterCollection> serializer() {
            return HelpCenterCollection$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(e eVar) {
            this();
        }
    }

    public /* synthetic */ HelpCenterCollection(int i10, String str, String str2, String str3, int i11, int i12, u0 u0Var) {
        if (2 != (i10 & 2)) {
            p241t7.b.w(i10, 2, HelpCenterCollection$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        if ((i10 & 1) == 0) {
            this.summary = "";
        } else {
            this.summary = str;
        }
        this.id = str2;
        if ((i10 & 4) == 0) {
            this.title = "";
        } else {
            this.title = str3;
        }
        if ((i10 & 8) == 0) {
            this.articlesCount = 0;
        } else {
            this.articlesCount = i11;
        }
        if ((i10 & 16) == 0) {
            this.collectionsCount = 0;
        } else {
            this.collectionsCount = i12;
        }
    }

    public static /* synthetic */ HelpCenterCollection copy$default(HelpCenterCollection helpCenterCollection, String str, String str2, String str3, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = helpCenterCollection.summary;
        }
        if ((i12 & 2) != 0) {
            str2 = helpCenterCollection.id;
        }
        String str4 = str2;
        if ((i12 & 4) != 0) {
            str3 = helpCenterCollection.title;
        }
        String str5 = str3;
        if ((i12 & 8) != 0) {
            i10 = helpCenterCollection.articlesCount;
        }
        int i13 = i10;
        if ((i12 & 16) != 0) {
            i11 = helpCenterCollection.collectionsCount;
        }
        return helpCenterCollection.copy(str, str4, str5, i13, i11);
    }

    public static final /* synthetic */ void write$Self$intercom_sdk_base_release(HelpCenterCollection helpCenterCollection, p024bb.b bVar, p011ab.e eVar) {
        if (bVar.v(eVar) || !i.a(helpCenterCollection.summary, "")) {
            bVar.p(eVar, 0, helpCenterCollection.summary);
        }
        bVar.p(eVar, 1, helpCenterCollection.id);
        if (bVar.v(eVar) || !i.a(helpCenterCollection.title, "")) {
            bVar.p(eVar, 2, helpCenterCollection.title);
        }
        if (bVar.v(eVar) || helpCenterCollection.articlesCount != 0) {
            bVar.g(3, helpCenterCollection.articlesCount, eVar);
        }
        if (!bVar.v(eVar) && helpCenterCollection.collectionsCount == 0) {
            return;
        }
        bVar.g(4, helpCenterCollection.collectionsCount, eVar);
    }

    public final String component1() {
        return this.summary;
    }

    public final String component2() {
        return this.id;
    }

    public final String component3() {
        return this.title;
    }

    public final int component4() {
        return this.articlesCount;
    }

    public final int component5() {
        return this.collectionsCount;
    }

    public final HelpCenterCollection copy(String summary, String id, String title, int i10, int i11) {
        i.e(summary, "summary");
        i.e(id, "id");
        i.e(title, "title");
        return new HelpCenterCollection(summary, id, title, i10, i11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HelpCenterCollection)) {
            return false;
        }
        HelpCenterCollection helpCenterCollection = (HelpCenterCollection) obj;
        return i.a(this.summary, helpCenterCollection.summary) && i.a(this.id, helpCenterCollection.id) && i.a(this.title, helpCenterCollection.title) && this.articlesCount == helpCenterCollection.articlesCount && this.collectionsCount == helpCenterCollection.collectionsCount;
    }

    public final int getArticlesCount() {
        return this.articlesCount;
    }

    public final int getCollectionsCount() {
        return this.collectionsCount;
    }

    public final String getId() {
        return this.id;
    }

    public final String getSummary() {
        return this.summary;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return Integer.hashCode(this.collectionsCount) + q.b(this.articlesCount, a.b(this.title, a.b(this.id, this.summary.hashCode() * 31, 31), 31), 31);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("HelpCenterCollection(summary=");
        sb2.append(this.summary);
        sb2.append(", id=");
        sb2.append(this.id);
        sb2.append(", title=");
        sb2.append(this.title);
        sb2.append(", articlesCount=");
        sb2.append(this.articlesCount);
        sb2.append(", collectionsCount=");
        return C0575j.b(sb2, this.collectionsCount, ')');
    }

    public HelpCenterCollection(String summary, String id, String title, int i10, int i11) {
        i.e(summary, "summary");
        i.e(id, "id");
        i.e(title, "title");
        this.summary = summary;
        this.id = id;
        this.title = title;
        this.articlesCount = i10;
        this.collectionsCount = i11;
    }

    public /* synthetic */ HelpCenterCollection(String str, String str2, String str3, int i10, int i11, int i12, e eVar) {
        this((i12 & 1) != 0 ? "" : str, str2, (i12 & 4) != 0 ? "" : str3, (i12 & 8) != 0 ? 0 : i10, (i12 & 16) != 0 ? 0 : i11);
    }

    public static /* synthetic */ void getArticlesCount$annotations() {
    }

    public static /* synthetic */ void getCollectionsCount$annotations() {
    }

    public static /* synthetic */ void getId$annotations() {
    }

    public static /* synthetic */ void getSummary$annotations() {
    }

    public static /* synthetic */ void getTitle$annotations() {
    }
}
