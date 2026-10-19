package io.intercom.android.sdk.m5.helpcenter.states;

import B7.b;
import io.intercom.android.sdk.helpcenter.articles.ArticleViewState;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: CollectionRowData.kt */
/* JADX INFO: loaded from: classes3.dex */
public abstract class CollectionDetailsRow {
    public static final int $stable = 0;

    /* JADX INFO: compiled from: CollectionRowData.kt */
    public static final class ArticleRow extends CollectionDetailsRow {
        public static final int $stable = 0;
        private final String id;
        private final String title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ArticleRow(String id, String title) {
            super(null);
            i.e(id, "id");
            i.e(title, "title");
            this.id = id;
            this.title = title;
        }

        public static /* synthetic */ ArticleRow copy$default(ArticleRow articleRow, String str, String str2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = articleRow.id;
            }
            if ((i10 & 2) != 0) {
                str2 = articleRow.title;
            }
            return articleRow.copy(str, str2);
        }

        public final String component1() {
            return this.id;
        }

        public final String component2() {
            return this.title;
        }

        public final ArticleRow copy(String id, String title) {
            i.e(id, "id");
            i.e(title, "title");
            return new ArticleRow(id, title);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ArticleRow)) {
                return false;
            }
            ArticleRow articleRow = (ArticleRow) obj;
            return i.a(this.id, articleRow.id) && i.a(this.title, articleRow.title);
        }

        public final String getId() {
            return this.id;
        }

        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            return this.title.hashCode() + (this.id.hashCode() * 31);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("ArticleRow(id=");
            sb2.append(this.id);
            sb2.append(", title=");
            return b.g(sb2, this.title, ')');
        }
    }

    /* JADX INFO: compiled from: CollectionRowData.kt */
    public static final class CollectionRow extends CollectionDetailsRow {
        public static final int $stable = 0;
        private final CollectionRowData rowData;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CollectionRow(CollectionRowData rowData) {
            super(null);
            i.e(rowData, "rowData");
            this.rowData = rowData;
        }

        public static /* synthetic */ CollectionRow copy$default(CollectionRow collectionRow, CollectionRowData collectionRowData, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                collectionRowData = collectionRow.rowData;
            }
            return collectionRow.copy(collectionRowData);
        }

        public final CollectionRowData component1() {
            return this.rowData;
        }

        public final CollectionRow copy(CollectionRowData rowData) {
            i.e(rowData, "rowData");
            return new CollectionRow(rowData);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CollectionRow) && i.a(this.rowData, ((CollectionRow) obj).rowData);
        }

        public final CollectionRowData getRowData() {
            return this.rowData;
        }

        public int hashCode() {
            return this.rowData.hashCode();
        }

        public String toString() {
            return "CollectionRow(rowData=" + this.rowData + ')';
        }
    }

    /* JADX INFO: compiled from: CollectionRowData.kt */
    public static final class FullHelpCenterRow extends CollectionDetailsRow {
        public static final int $stable = 0;
        public static final FullHelpCenterRow INSTANCE = new FullHelpCenterRow();

        private FullHelpCenterRow() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof FullHelpCenterRow);
        }

        public int hashCode() {
            return -1758362845;
        }

        public String toString() {
            return "FullHelpCenterRow";
        }
    }

    /* JADX INFO: compiled from: CollectionRowData.kt */
    public static final class SendMessageRow extends CollectionDetailsRow {
        public static final int $stable = 0;
        private final ArticleViewState.TeamPresenceState teamPresenceState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SendMessageRow(ArticleViewState.TeamPresenceState teamPresenceState) {
            super(null);
            i.e(teamPresenceState, "teamPresenceState");
            this.teamPresenceState = teamPresenceState;
        }

        public static /* synthetic */ SendMessageRow copy$default(SendMessageRow sendMessageRow, ArticleViewState.TeamPresenceState teamPresenceState, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                teamPresenceState = sendMessageRow.teamPresenceState;
            }
            return sendMessageRow.copy(teamPresenceState);
        }

        public final ArticleViewState.TeamPresenceState component1() {
            return this.teamPresenceState;
        }

        public final SendMessageRow copy(ArticleViewState.TeamPresenceState teamPresenceState) {
            i.e(teamPresenceState, "teamPresenceState");
            return new SendMessageRow(teamPresenceState);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SendMessageRow) && i.a(this.teamPresenceState, ((SendMessageRow) obj).teamPresenceState);
        }

        public final ArticleViewState.TeamPresenceState getTeamPresenceState() {
            return this.teamPresenceState;
        }

        public int hashCode() {
            return this.teamPresenceState.hashCode();
        }

        public String toString() {
            return "SendMessageRow(teamPresenceState=" + this.teamPresenceState + ')';
        }
    }

    public /* synthetic */ CollectionDetailsRow(e eVar) {
        this();
    }

    private CollectionDetailsRow() {
    }
}
