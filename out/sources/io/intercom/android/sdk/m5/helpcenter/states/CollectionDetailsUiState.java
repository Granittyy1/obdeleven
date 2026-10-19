package io.intercom.android.sdk.m5.helpcenter.states;

import B1.a;
import Q8.d;
import io.intercom.android.sdk.helpcenter.articles.ArticleViewState;
import io.intercom.android.sdk.helpcenter.sections.Author;
import io.intercom.android.sdk.m5.components.ErrorState;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.q;
import kotlin.jvm.internal.i;
import p005a4.p;

/* JADX INFO: compiled from: CollectionDetailsUiState.kt */
/* JADX INFO: loaded from: classes3.dex */
public interface CollectionDetailsUiState {

    /* JADX INFO: compiled from: CollectionDetailsUiState.kt */
    public static final class Content implements CollectionDetailsUiState {
        public static final int $stable = 8;
        private final int articlesCount;
        private final List<Author> authors;
        private final List<CollectionDetailsRow> collectionDetailsRows;
        private final String id;
        private final String summary;
        private final String title;

        /* JADX WARN: Multi-variable type inference failed */
        public Content(String id, String title, String summary, int i10, List<Author> authors, List<? extends CollectionDetailsRow> collectionDetailsRows) {
            i.e(id, "id");
            i.e(title, "title");
            i.e(summary, "summary");
            i.e(authors, "authors");
            i.e(collectionDetailsRows, "collectionDetailsRows");
            this.id = id;
            this.title = title;
            this.summary = summary;
            this.articlesCount = i10;
            this.authors = authors;
            this.collectionDetailsRows = collectionDetailsRows;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Content copy$default(Content content, String str, String str2, String str3, int i10, List list, List list2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = content.id;
            }
            if ((i11 & 2) != 0) {
                str2 = content.title;
            }
            String str4 = str2;
            if ((i11 & 4) != 0) {
                str3 = content.summary;
            }
            String str5 = str3;
            if ((i11 & 8) != 0) {
                i10 = content.articlesCount;
            }
            int i12 = i10;
            if ((i11 & 16) != 0) {
                list = content.authors;
            }
            List list3 = list;
            if ((i11 & 32) != 0) {
                list2 = content.collectionDetailsRows;
            }
            return content.copy(str, str4, str5, i12, list3, list2);
        }

        public final String component1() {
            return this.id;
        }

        public final String component2() {
            return this.title;
        }

        public final String component3() {
            return this.summary;
        }

        public final int component4() {
            return this.articlesCount;
        }

        public final List<Author> component5() {
            return this.authors;
        }

        public final List<CollectionDetailsRow> component6() {
            return this.collectionDetailsRows;
        }

        public final Content copy(String id, String title, String summary, int i10, List<Author> authors, List<? extends CollectionDetailsRow> collectionDetailsRows) {
            i.e(id, "id");
            i.e(title, "title");
            i.e(summary, "summary");
            i.e(authors, "authors");
            i.e(collectionDetailsRows, "collectionDetailsRows");
            return new Content(id, title, summary, i10, authors, collectionDetailsRows);
        }

        public final Content copyWithSingleSendMessageRow(ArticleViewState.TeamPresenceState teamPresenceState) {
            i.e(teamPresenceState, "teamPresenceState");
            if (!hasSendMessageRow()) {
                return copy$default(this, null, null, null, 0, null, q.d0(this.collectionDetailsRows, new CollectionDetailsRow.SendMessageRow(teamPresenceState)), 31, null);
            }
            List<CollectionDetailsRow> list = this.collectionDetailsRows;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (!(((CollectionDetailsRow) obj) instanceof CollectionDetailsRow.SendMessageRow)) {
                    arrayList.add(obj);
                }
            }
            return copy$default(this, null, null, null, 0, null, q.d0(arrayList, new CollectionDetailsRow.SendMessageRow(teamPresenceState)), 31, null);
        }

        public final Content copyWithoutSendMessageRow() {
            List<CollectionDetailsRow> list = this.collectionDetailsRows;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (!(((CollectionDetailsRow) obj) instanceof CollectionDetailsRow.SendMessageRow)) {
                    arrayList.add(obj);
                }
            }
            return copy$default(this, null, null, null, 0, null, arrayList, 31, null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Content)) {
                return false;
            }
            Content content = (Content) obj;
            return i.a(this.id, content.id) && i.a(this.title, content.title) && i.a(this.summary, content.summary) && this.articlesCount == content.articlesCount && i.a(this.authors, content.authors) && i.a(this.collectionDetailsRows, content.collectionDetailsRows);
        }

        public final int getArticlesCount() {
            return this.articlesCount;
        }

        public final List<Author> getAuthors() {
            return this.authors;
        }

        public final List<CollectionDetailsRow> getCollectionDetailsRows() {
            return this.collectionDetailsRows;
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

        public final boolean hasSendMessageRow() {
            List<CollectionDetailsRow> list = this.collectionDetailsRows;
            if ((list instanceof Collection) && list.isEmpty()) {
                return false;
            }
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((CollectionDetailsRow) it.next()) instanceof CollectionDetailsRow.SendMessageRow) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return this.collectionDetailsRows.hashCode() + p.d(p005a4.q.b(this.articlesCount, a.b(this.summary, a.b(this.title, this.id.hashCode() * 31, 31), 31), 31), 31, this.authors);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("Content(id=");
            sb2.append(this.id);
            sb2.append(", title=");
            sb2.append(this.title);
            sb2.append(", summary=");
            sb2.append(this.summary);
            sb2.append(", articlesCount=");
            sb2.append(this.articlesCount);
            sb2.append(", authors=");
            sb2.append(this.authors);
            sb2.append(", collectionDetailsRows=");
            return d.b(sb2, this.collectionDetailsRows, ')');
        }
    }

    /* JADX INFO: compiled from: CollectionDetailsUiState.kt */
    public static final class Error implements CollectionDetailsUiState {
        public static final int $stable = 0;
        private final ErrorState errorState;

        public Error(ErrorState errorState) {
            i.e(errorState, "errorState");
            this.errorState = errorState;
        }

        public static /* synthetic */ Error copy$default(Error error, ErrorState errorState, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                errorState = error.errorState;
            }
            return error.copy(errorState);
        }

        public final ErrorState component1() {
            return this.errorState;
        }

        public final Error copy(ErrorState errorState) {
            i.e(errorState, "errorState");
            return new Error(errorState);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Error) && i.a(this.errorState, ((Error) obj).errorState);
        }

        public final ErrorState getErrorState() {
            return this.errorState;
        }

        public int hashCode() {
            return this.errorState.hashCode();
        }

        public String toString() {
            return "Error(errorState=" + this.errorState + ')';
        }
    }

    /* JADX INFO: compiled from: CollectionDetailsUiState.kt */
    public static final class Initial implements CollectionDetailsUiState {
        public static final int $stable = 0;
        public static final Initial INSTANCE = new Initial();

        private Initial() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Initial);
        }

        public int hashCode() {
            return -545067083;
        }

        public String toString() {
            return "Initial";
        }
    }

    /* JADX INFO: compiled from: CollectionDetailsUiState.kt */
    public static final class Loading implements CollectionDetailsUiState {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        private Loading() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public int hashCode() {
            return 2138208685;
        }

        public String toString() {
            return "Loading";
        }
    }
}
