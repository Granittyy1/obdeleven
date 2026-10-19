package io.intercom.android.sdk.helpcenter.sections;

import Ya.b;
import Ya.k;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;
import p037cb.C1521e;
import p037cb.u0;

/* JADX INFO: compiled from: HelpCenterCollectionContent.kt */
/* JADX INFO: loaded from: classes3.dex */
@k
public final class HelpCenterSection {
    private final List<HelpCenterArticle> helpCenterArticles;
    private final String title;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final b<Object>[] $childSerializers = {new C1521e(HelpCenterArticle$$serializer.INSTANCE), null};

    /* JADX INFO: compiled from: HelpCenterCollectionContent.kt */
    public static final class Companion {
        private Companion() {
        }

        public final b<HelpCenterSection> serializer() {
            return HelpCenterSection$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(e eVar) {
            this();
        }
    }

    public HelpCenterSection() {
        this((List) null, (String) null, 3, (e) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HelpCenterSection copy$default(HelpCenterSection helpCenterSection, List list, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = helpCenterSection.helpCenterArticles;
        }
        if ((i10 & 2) != 0) {
            str = helpCenterSection.title;
        }
        return helpCenterSection.copy(list, str);
    }

    public static final void write$Self$intercom_sdk_base_release(HelpCenterSection helpCenterSection, p024bb.b bVar, p011ab.e eVar) {
        b<Object>[] bVarArr = $childSerializers;
        if (bVar.v(eVar) || !i.a(helpCenterSection.helpCenterArticles, EmptyList.f42983b)) {
            bVar.s(eVar, 0, bVarArr[0], helpCenterSection.helpCenterArticles);
        }
        if (!bVar.v(eVar) && i.a(helpCenterSection.title, "")) {
            return;
        }
        bVar.p(eVar, 1, helpCenterSection.title);
    }

    public final List<HelpCenterArticle> component1() {
        return this.helpCenterArticles;
    }

    public final String component2() {
        return this.title;
    }

    public final HelpCenterSection copy(List<HelpCenterArticle> helpCenterArticles, String title) {
        i.e(helpCenterArticles, "helpCenterArticles");
        i.e(title, "title");
        return new HelpCenterSection(helpCenterArticles, title);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HelpCenterSection)) {
            return false;
        }
        HelpCenterSection helpCenterSection = (HelpCenterSection) obj;
        return i.a(this.helpCenterArticles, helpCenterSection.helpCenterArticles) && i.a(this.title, helpCenterSection.title);
    }

    public final List<HelpCenterArticle> getHelpCenterArticles() {
        return this.helpCenterArticles;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.title.hashCode() + (this.helpCenterArticles.hashCode() * 31);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("HelpCenterSection(helpCenterArticles=");
        sb2.append(this.helpCenterArticles);
        sb2.append(", title=");
        return B7.b.g(sb2, this.title, ')');
    }

    public HelpCenterSection(int i10, List list, String str, u0 u0Var) {
        this.helpCenterArticles = (i10 & 1) == 0 ? EmptyList.f42983b : list;
        if ((i10 & 2) == 0) {
            this.title = "";
        } else {
            this.title = str;
        }
    }

    public HelpCenterSection(List<HelpCenterArticle> helpCenterArticles, String title) {
        i.e(helpCenterArticles, "helpCenterArticles");
        i.e(title, "title");
        this.helpCenterArticles = helpCenterArticles;
        this.title = title;
    }

    public HelpCenterSection(List list, String str, int i10, e eVar) {
        this((i10 & 1) != 0 ? EmptyList.f42983b : list, (i10 & 2) != 0 ? "" : str);
    }

    public static /* synthetic */ void getHelpCenterArticles$annotations() {
    }

    public static /* synthetic */ void getTitle$annotations() {
    }
}
