package io.intercom.android.sdk.models;

import B1.a;
import B7.b;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: InlineSource.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class InlineSource {
    public static final int $stable = 0;
    private final String dataEntityId;
    private final String dataEntityType;
    private final String dataSourceIndex;
    private final String href;
    private final String title;

    public InlineSource(String dataEntityId, String str, String dataSourceIndex, String href, String str2) {
        i.e(dataEntityId, "dataEntityId");
        i.e(dataSourceIndex, "dataSourceIndex");
        i.e(href, "href");
        this.dataEntityId = dataEntityId;
        this.dataEntityType = str;
        this.dataSourceIndex = dataSourceIndex;
        this.href = href;
        this.title = str2;
    }

    public static /* synthetic */ InlineSource copy$default(InlineSource inlineSource, String str, String str2, String str3, String str4, String str5, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = inlineSource.dataEntityId;
        }
        if ((i10 & 2) != 0) {
            str2 = inlineSource.dataEntityType;
        }
        String str6 = str2;
        if ((i10 & 4) != 0) {
            str3 = inlineSource.dataSourceIndex;
        }
        String str7 = str3;
        if ((i10 & 8) != 0) {
            str4 = inlineSource.href;
        }
        String str8 = str4;
        if ((i10 & 16) != 0) {
            str5 = inlineSource.title;
        }
        return inlineSource.copy(str, str6, str7, str8, str5);
    }

    public final String component1() {
        return this.dataEntityId;
    }

    public final String component2() {
        return this.dataEntityType;
    }

    public final String component3() {
        return this.dataSourceIndex;
    }

    public final String component4() {
        return this.href;
    }

    public final String component5() {
        return this.title;
    }

    public final InlineSource copy(String dataEntityId, String str, String dataSourceIndex, String href, String str2) {
        i.e(dataEntityId, "dataEntityId");
        i.e(dataSourceIndex, "dataSourceIndex");
        i.e(href, "href");
        return new InlineSource(dataEntityId, str, dataSourceIndex, href, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InlineSource)) {
            return false;
        }
        InlineSource inlineSource = (InlineSource) obj;
        return i.a(this.dataEntityId, inlineSource.dataEntityId) && i.a(this.dataEntityType, inlineSource.dataEntityType) && i.a(this.dataSourceIndex, inlineSource.dataSourceIndex) && i.a(this.href, inlineSource.href) && i.a(this.title, inlineSource.title);
    }

    public final String getDataEntityId() {
        return this.dataEntityId;
    }

    public final String getDataEntityType() {
        return this.dataEntityType;
    }

    public final String getDataSourceIndex() {
        return this.dataSourceIndex;
    }

    public final String getHref() {
        return this.href;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = this.dataEntityId.hashCode() * 31;
        String str = this.dataEntityType;
        int iB = a.b(this.href, a.b(this.dataSourceIndex, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31), 31);
        String str2 = this.title;
        return iB + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("InlineSource(dataEntityId=");
        sb2.append(this.dataEntityId);
        sb2.append(", dataEntityType=");
        sb2.append(this.dataEntityType);
        sb2.append(", dataSourceIndex=");
        sb2.append(this.dataSourceIndex);
        sb2.append(", href=");
        sb2.append(this.href);
        sb2.append(", title=");
        return b.g(sb2, this.title, ')');
    }
}
