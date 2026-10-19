package io.intercom.android.sdk.helpcenter.search;

import A1.C0575j;
import io.intercom.android.sdk.helpcenter.articles.ArticleViewState;

/* JADX INFO: compiled from: ArticleSearchState.kt */
/* JADX INFO: loaded from: classes3.dex */
public abstract class ArticleSearchResultRow {
    public static final int $stable = 0;

    /* JADX INFO: compiled from: ArticleSearchState.kt */
    public static final class TeammateHelpRow extends ArticleSearchResultRow {
        public static final int $stable = 0;
        private final ArticleViewState.TeamPresenceState teamPresenceState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TeammateHelpRow(ArticleViewState.TeamPresenceState teamPresenceState) {
            super(null);
            kotlin.jvm.internal.i.e(teamPresenceState, "teamPresenceState");
            this.teamPresenceState = teamPresenceState;
        }

        public static /* synthetic */ TeammateHelpRow copy$default(TeammateHelpRow teammateHelpRow, ArticleViewState.TeamPresenceState teamPresenceState, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                teamPresenceState = teammateHelpRow.teamPresenceState;
            }
            return teammateHelpRow.copy(teamPresenceState);
        }

        public final ArticleViewState.TeamPresenceState component1() {
            return this.teamPresenceState;
        }

        public final TeammateHelpRow copy(ArticleViewState.TeamPresenceState teamPresenceState) {
            kotlin.jvm.internal.i.e(teamPresenceState, "teamPresenceState");
            return new TeammateHelpRow(teamPresenceState);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TeammateHelpRow) && kotlin.jvm.internal.i.a(this.teamPresenceState, ((TeammateHelpRow) obj).teamPresenceState);
        }

        public final ArticleViewState.TeamPresenceState getTeamPresenceState() {
            return this.teamPresenceState;
        }

        public int hashCode() {
            return this.teamPresenceState.hashCode();
        }

        public String toString() {
            return "TeammateHelpRow(teamPresenceState=" + this.teamPresenceState + ')';
        }
    }

    public /* synthetic */ ArticleSearchResultRow(kotlin.jvm.internal.e eVar) {
        this();
    }

    /* JADX INFO: compiled from: ArticleSearchState.kt */
    public static final class ArticleResultRow extends ArticleSearchResultRow {
        public static final int $stable = 0;
        private final String id;
        private final String summaryText;
        private final int summaryVisibility;
        private final String titleText;

        public /* synthetic */ ArticleResultRow(String str, String str2, String str3, int i10, int i11, kotlin.jvm.internal.e eVar) {
            this(str, str2, (i11 & 4) != 0 ? "" : str3, (i11 & 8) != 0 ? 8 : i10);
        }

        public static /* synthetic */ ArticleResultRow copy$default(ArticleResultRow articleResultRow, String str, String str2, String str3, int i10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = articleResultRow.id;
            }
            if ((i11 & 2) != 0) {
                str2 = articleResultRow.titleText;
            }
            if ((i11 & 4) != 0) {
                str3 = articleResultRow.summaryText;
            }
            if ((i11 & 8) != 0) {
                i10 = articleResultRow.summaryVisibility;
            }
            return articleResultRow.copy(str, str2, str3, i10);
        }

        public final String component1() {
            return this.id;
        }

        public final String component2() {
            return this.titleText;
        }

        public final String component3() {
            return this.summaryText;
        }

        public final int component4() {
            return this.summaryVisibility;
        }

        public final ArticleResultRow copy(String id, String titleText, String summaryText, int i10) {
            kotlin.jvm.internal.i.e(id, "id");
            kotlin.jvm.internal.i.e(titleText, "titleText");
            kotlin.jvm.internal.i.e(summaryText, "summaryText");
            return new ArticleResultRow(id, titleText, summaryText, i10);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ArticleResultRow)) {
                return false;
            }
            ArticleResultRow articleResultRow = (ArticleResultRow) obj;
            return kotlin.jvm.internal.i.a(this.id, articleResultRow.id) && kotlin.jvm.internal.i.a(this.titleText, articleResultRow.titleText) && kotlin.jvm.internal.i.a(this.summaryText, articleResultRow.summaryText) && this.summaryVisibility == articleResultRow.summaryVisibility;
        }

        public final String getId() {
            return this.id;
        }

        public final String getSummaryText() {
            return this.summaryText;
        }

        public final int getSummaryVisibility() {
            return this.summaryVisibility;
        }

        public final String getTitleText() {
            return this.titleText;
        }

        public int hashCode() {
            return Integer.hashCode(this.summaryVisibility) + B1.a.b(this.summaryText, B1.a.b(this.titleText, this.id.hashCode() * 31, 31), 31);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("ArticleResultRow(id=");
            sb2.append(this.id);
            sb2.append(", titleText=");
            sb2.append(this.titleText);
            sb2.append(", summaryText=");
            sb2.append(this.summaryText);
            sb2.append(", summaryVisibility=");
            return C0575j.b(sb2, this.summaryVisibility, ')');
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ArticleResultRow(String id, String titleText, String summaryText, int i10) {
            super(null);
            kotlin.jvm.internal.i.e(id, "id");
            kotlin.jvm.internal.i.e(titleText, "titleText");
            kotlin.jvm.internal.i.e(summaryText, "summaryText");
            this.id = id;
            this.titleText = titleText;
            this.summaryText = summaryText;
            this.summaryVisibility = i10;
        }
    }

    private ArticleSearchResultRow() {
    }
}
