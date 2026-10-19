package io.intercom.android.sdk.m5.helpcenter.states;

import A1.C0575j;
import B1.a;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;
import p005a4.q;

/* JADX INFO: compiled from: CollectionRowData.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class CollectionRowData {
    public static final int $stable = 0;
    private final int articlesCount;
    private final int collectionsCount;
    private final String descriptionText;
    private final int descriptionVisibility;
    private final String id;
    private final String titleText;

    public CollectionRowData(String id, String titleText, int i10, String descriptionText, int i11, int i12) {
        i.e(id, "id");
        i.e(titleText, "titleText");
        i.e(descriptionText, "descriptionText");
        this.id = id;
        this.titleText = titleText;
        this.descriptionVisibility = i10;
        this.descriptionText = descriptionText;
        this.articlesCount = i11;
        this.collectionsCount = i12;
    }

    public static /* synthetic */ CollectionRowData copy$default(CollectionRowData collectionRowData, String str, String str2, int i10, String str3, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = collectionRowData.id;
        }
        if ((i13 & 2) != 0) {
            str2 = collectionRowData.titleText;
        }
        String str4 = str2;
        if ((i13 & 4) != 0) {
            i10 = collectionRowData.descriptionVisibility;
        }
        int i14 = i10;
        if ((i13 & 8) != 0) {
            str3 = collectionRowData.descriptionText;
        }
        String str5 = str3;
        if ((i13 & 16) != 0) {
            i11 = collectionRowData.articlesCount;
        }
        int i15 = i11;
        if ((i13 & 32) != 0) {
            i12 = collectionRowData.collectionsCount;
        }
        return collectionRowData.copy(str, str4, i14, str5, i15, i12);
    }

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.titleText;
    }

    public final int component3() {
        return this.descriptionVisibility;
    }

    public final String component4() {
        return this.descriptionText;
    }

    public final int component5() {
        return this.articlesCount;
    }

    public final int component6() {
        return this.collectionsCount;
    }

    public final CollectionRowData copy(String id, String titleText, int i10, String descriptionText, int i11, int i12) {
        i.e(id, "id");
        i.e(titleText, "titleText");
        i.e(descriptionText, "descriptionText");
        return new CollectionRowData(id, titleText, i10, descriptionText, i11, i12);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CollectionRowData)) {
            return false;
        }
        CollectionRowData collectionRowData = (CollectionRowData) obj;
        return i.a(this.id, collectionRowData.id) && i.a(this.titleText, collectionRowData.titleText) && this.descriptionVisibility == collectionRowData.descriptionVisibility && i.a(this.descriptionText, collectionRowData.descriptionText) && this.articlesCount == collectionRowData.articlesCount && this.collectionsCount == collectionRowData.collectionsCount;
    }

    public final int getArticlesCount() {
        return this.articlesCount;
    }

    public final int getCollectionsCount() {
        return this.collectionsCount;
    }

    public final String getDescriptionText() {
        return this.descriptionText;
    }

    public final int getDescriptionVisibility() {
        return this.descriptionVisibility;
    }

    public final String getId() {
        return this.id;
    }

    public final String getTitleText() {
        return this.titleText;
    }

    public int hashCode() {
        return Integer.hashCode(this.collectionsCount) + q.b(this.articlesCount, a.b(this.descriptionText, q.b(this.descriptionVisibility, a.b(this.titleText, this.id.hashCode() * 31, 31), 31), 31), 31);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("CollectionRowData(id=");
        sb2.append(this.id);
        sb2.append(", titleText=");
        sb2.append(this.titleText);
        sb2.append(", descriptionVisibility=");
        sb2.append(this.descriptionVisibility);
        sb2.append(", descriptionText=");
        sb2.append(this.descriptionText);
        sb2.append(", articlesCount=");
        sb2.append(this.articlesCount);
        sb2.append(", collectionsCount=");
        return C0575j.b(sb2, this.collectionsCount, ')');
    }

    public /* synthetic */ CollectionRowData(String str, String str2, int i10, String str3, int i11, int i12, int i13, e eVar) {
        this(str, str2, i10, str3, (i13 & 16) != 0 ? 0 : i11, (i13 & 32) != 0 ? 0 : i12);
    }
}
