package io.intercom.android.sdk.helpcenter.articles;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: ArticleStatsArguments.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class ArticleStatsArguments implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<ArticleStatsArguments> CREATOR = new Creator();
    private final String articleId;
    private final boolean isFromSearchBrowse;

    /* JADX INFO: compiled from: ArticleStatsArguments.kt */
    public static final class Creator implements Parcelable.Creator<ArticleStatsArguments> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ArticleStatsArguments createFromParcel(Parcel parcel) {
            kotlin.jvm.internal.i.e(parcel, "parcel");
            return new ArticleStatsArguments(parcel.readString(), parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ArticleStatsArguments[] newArray(int i10) {
            return new ArticleStatsArguments[i10];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ArticleStatsArguments() {
        this(null, false, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ ArticleStatsArguments copy$default(ArticleStatsArguments articleStatsArguments, String str, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = articleStatsArguments.articleId;
        }
        if ((i10 & 2) != 0) {
            z10 = articleStatsArguments.isFromSearchBrowse;
        }
        return articleStatsArguments.copy(str, z10);
    }

    public final String component1() {
        return this.articleId;
    }

    public final boolean component2() {
        return this.isFromSearchBrowse;
    }

    public final ArticleStatsArguments copy(String articleId, boolean z10) {
        kotlin.jvm.internal.i.e(articleId, "articleId");
        return new ArticleStatsArguments(articleId, z10);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ArticleStatsArguments)) {
            return false;
        }
        ArticleStatsArguments articleStatsArguments = (ArticleStatsArguments) obj;
        return kotlin.jvm.internal.i.a(this.articleId, articleStatsArguments.articleId) && this.isFromSearchBrowse == articleStatsArguments.isFromSearchBrowse;
    }

    public final String getArticleId() {
        return this.articleId;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isFromSearchBrowse) + (this.articleId.hashCode() * 31);
    }

    public final boolean isFromSearchBrowse() {
        return this.isFromSearchBrowse;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("ArticleStatsArguments(articleId=");
        sb2.append(this.articleId);
        sb2.append(", isFromSearchBrowse=");
        return Z3.o.d(sb2, this.isFromSearchBrowse, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i10) {
        kotlin.jvm.internal.i.e(dest, "dest");
        dest.writeString(this.articleId);
        dest.writeInt(this.isFromSearchBrowse ? 1 : 0);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ArticleStatsArguments(String articleId) {
        this(articleId, false, 2, null);
        kotlin.jvm.internal.i.e(articleId, "articleId");
    }

    public ArticleStatsArguments(String articleId, boolean z10) {
        kotlin.jvm.internal.i.e(articleId, "articleId");
        this.articleId = articleId;
        this.isFromSearchBrowse = z10;
    }

    public /* synthetic */ ArticleStatsArguments(String str, boolean z10, int i10, kotlin.jvm.internal.e eVar) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? false : z10);
    }
}
