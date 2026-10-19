package io.intercom.android.sdk.m5.helpcenter.states;

import io.intercom.android.sdk.helpcenter.articles.ArticleViewState;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: CollectionRowData.kt */
/* JADX INFO: loaded from: classes3.dex */
public abstract class CollectionsRow {
    public static final int $stable = 0;

    /* JADX INFO: compiled from: CollectionRowData.kt */
    public static final class BrowseAllHelpTopicsAsListRow extends CollectionsRow {
        public static final int $stable = 0;
        public static final BrowseAllHelpTopicsAsListRow INSTANCE = new BrowseAllHelpTopicsAsListRow();

        private BrowseAllHelpTopicsAsListRow() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof BrowseAllHelpTopicsAsListRow);
        }

        public int hashCode() {
            return 164025713;
        }

        public String toString() {
            return "BrowseAllHelpTopicsAsListRow";
        }
    }

    /* JADX INFO: compiled from: CollectionRowData.kt */
    public static final class CollectionRow extends CollectionsRow {
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
    public static final class FullHelpCenterRow extends CollectionsRow {
        public static final int $stable = 0;
        public static final FullHelpCenterRow INSTANCE = new FullHelpCenterRow();

        private FullHelpCenterRow() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof FullHelpCenterRow);
        }

        public int hashCode() {
            return 788964466;
        }

        public String toString() {
            return "FullHelpCenterRow";
        }
    }

    /* JADX INFO: compiled from: CollectionRowData.kt */
    public static final class SendMessageRow extends CollectionsRow {
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

    public /* synthetic */ CollectionsRow(e eVar) {
        this();
    }

    private CollectionsRow() {
    }
}
