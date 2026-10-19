package io.intercom.android.sdk.helpcenter.search;

import io.intercom.android.sdk.helpcenter.articles.ArticleViewState;
import java.util.List;

/* JADX INFO: compiled from: ArticleSearchState.kt */
/* JADX INFO: loaded from: classes3.dex */
public abstract class ArticleSearchState {
    public static final int $stable = 0;

    /* JADX INFO: compiled from: ArticleSearchState.kt */
    public static final class Content extends ArticleSearchState {
        public static final int $stable = 8;
        private final List<ArticleSearchResultRow> searchResults;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Content(List<? extends ArticleSearchResultRow> searchResults) {
            super(null);
            kotlin.jvm.internal.i.e(searchResults, "searchResults");
            this.searchResults = searchResults;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Content copy$default(Content content, List list, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                list = content.searchResults;
            }
            return content.copy(list);
        }

        public final List<ArticleSearchResultRow> component1() {
            return this.searchResults;
        }

        public final Content copy(List<? extends ArticleSearchResultRow> searchResults) {
            kotlin.jvm.internal.i.e(searchResults, "searchResults");
            return new Content(searchResults);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Content) && kotlin.jvm.internal.i.a(this.searchResults, ((Content) obj).searchResults);
        }

        public final List<ArticleSearchResultRow> getSearchResults() {
            return this.searchResults;
        }

        public int hashCode() {
            return this.searchResults.hashCode();
        }

        public String toString() {
            return Q8.d.b(new StringBuilder("Content(searchResults="), this.searchResults, ')');
        }
    }

    /* JADX INFO: compiled from: ArticleSearchState.kt */
    public static final class Error extends ArticleSearchState {
        public static final int $stable = 0;
        public static final Error INSTANCE = new Error();

        private Error() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: ArticleSearchState.kt */
    public static final class Initial extends ArticleSearchState {
        public static final int $stable = 0;
        public static final Initial INSTANCE = new Initial();

        private Initial() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Initial);
        }

        public int hashCode() {
            return -498820373;
        }

        public String toString() {
            return "Initial";
        }
    }

    /* JADX INFO: compiled from: ArticleSearchState.kt */
    public static final class Loading extends ArticleSearchState {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        private Loading() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public int hashCode() {
            return -2110511901;
        }

        public String toString() {
            return "Loading";
        }
    }

    /* JADX INFO: compiled from: ArticleSearchState.kt */
    public static final class NoResults extends ArticleSearchState {
        public static final int $stable = 0;
        private final String searchTerm;
        private final ArticleViewState.TeamPresenceState teamPresenceState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NoResults(ArticleViewState.TeamPresenceState teamPresenceState, String searchTerm) {
            super(null);
            kotlin.jvm.internal.i.e(teamPresenceState, "teamPresenceState");
            kotlin.jvm.internal.i.e(searchTerm, "searchTerm");
            this.teamPresenceState = teamPresenceState;
            this.searchTerm = searchTerm;
        }

        public static /* synthetic */ NoResults copy$default(NoResults noResults, ArticleViewState.TeamPresenceState teamPresenceState, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                teamPresenceState = noResults.teamPresenceState;
            }
            if ((i10 & 2) != 0) {
                str = noResults.searchTerm;
            }
            return noResults.copy(teamPresenceState, str);
        }

        public final ArticleViewState.TeamPresenceState component1() {
            return this.teamPresenceState;
        }

        public final String component2() {
            return this.searchTerm;
        }

        public final NoResults copy(ArticleViewState.TeamPresenceState teamPresenceState, String searchTerm) {
            kotlin.jvm.internal.i.e(teamPresenceState, "teamPresenceState");
            kotlin.jvm.internal.i.e(searchTerm, "searchTerm");
            return new NoResults(teamPresenceState, searchTerm);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NoResults)) {
                return false;
            }
            NoResults noResults = (NoResults) obj;
            return kotlin.jvm.internal.i.a(this.teamPresenceState, noResults.teamPresenceState) && kotlin.jvm.internal.i.a(this.searchTerm, noResults.searchTerm);
        }

        public final String getSearchTerm() {
            return this.searchTerm;
        }

        public final ArticleViewState.TeamPresenceState getTeamPresenceState() {
            return this.teamPresenceState;
        }

        public int hashCode() {
            return this.searchTerm.hashCode() + (this.teamPresenceState.hashCode() * 31);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("NoResults(teamPresenceState=");
            sb2.append(this.teamPresenceState);
            sb2.append(", searchTerm=");
            return B7.b.g(sb2, this.searchTerm, ')');
        }
    }

    /* JADX INFO: compiled from: ArticleSearchState.kt */
    public static final class NoResultsNoTeamHelp extends ArticleSearchState {
        public static final int $stable = 0;
        private final String searchTerm;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NoResultsNoTeamHelp(String searchTerm) {
            super(null);
            kotlin.jvm.internal.i.e(searchTerm, "searchTerm");
            this.searchTerm = searchTerm;
        }

        public static /* synthetic */ NoResultsNoTeamHelp copy$default(NoResultsNoTeamHelp noResultsNoTeamHelp, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = noResultsNoTeamHelp.searchTerm;
            }
            return noResultsNoTeamHelp.copy(str);
        }

        public final String component1() {
            return this.searchTerm;
        }

        public final NoResultsNoTeamHelp copy(String searchTerm) {
            kotlin.jvm.internal.i.e(searchTerm, "searchTerm");
            return new NoResultsNoTeamHelp(searchTerm);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof NoResultsNoTeamHelp) && kotlin.jvm.internal.i.a(this.searchTerm, ((NoResultsNoTeamHelp) obj).searchTerm);
        }

        public final String getSearchTerm() {
            return this.searchTerm;
        }

        public int hashCode() {
            return this.searchTerm.hashCode();
        }

        public String toString() {
            return B7.b.g(new StringBuilder("NoResultsNoTeamHelp(searchTerm="), this.searchTerm, ')');
        }
    }

    public /* synthetic */ ArticleSearchState(kotlin.jvm.internal.e eVar) {
        this();
    }

    private ArticleSearchState() {
    }
}
