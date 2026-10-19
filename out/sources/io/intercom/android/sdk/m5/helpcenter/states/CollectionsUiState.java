package io.intercom.android.sdk.m5.helpcenter.states;

import Q8.d;
import io.intercom.android.sdk.helpcenter.articles.ArticleViewState;
import io.intercom.android.sdk.m5.components.ErrorState;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.q;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: CollectionsUiState.kt */
/* JADX INFO: loaded from: classes3.dex */
public interface CollectionsUiState {

    /* JADX INFO: compiled from: CollectionsUiState.kt */
    public static final class Content implements CollectionsUiState {
        public static final int $stable = 8;
        private final List<CollectionsRow> collections;

        /* JADX WARN: Multi-variable type inference failed */
        public Content(List<? extends CollectionsRow> collections) {
            i.e(collections, "collections");
            this.collections = collections;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Content copy$default(Content content, List list, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                list = content.collections;
            }
            return content.copy(list);
        }

        public final List<CollectionsRow> component1() {
            return this.collections;
        }

        public final Content copy(List<? extends CollectionsRow> collections) {
            i.e(collections, "collections");
            return new Content(collections);
        }

        public final Content copyWithSingleSendMessageRow(ArticleViewState.TeamPresenceState teamPresenceState) {
            i.e(teamPresenceState, "teamPresenceState");
            if (!hasSendMessageRow()) {
                return copy(q.d0(this.collections, new CollectionsRow.SendMessageRow(teamPresenceState)));
            }
            List<CollectionsRow> list = this.collections;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (!(((CollectionsRow) obj) instanceof CollectionsRow.SendMessageRow)) {
                    arrayList.add(obj);
                }
            }
            return copy(q.d0(arrayList, new CollectionsRow.SendMessageRow(teamPresenceState)));
        }

        public final Content copyWithoutSendMessageRow() {
            List<CollectionsRow> list = this.collections;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (!(((CollectionsRow) obj) instanceof CollectionsRow.SendMessageRow)) {
                    arrayList.add(obj);
                }
            }
            return copy(arrayList);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Content) && i.a(this.collections, ((Content) obj).collections);
        }

        public final List<CollectionsRow> getCollections() {
            return this.collections;
        }

        public final boolean hasSendMessageRow() {
            List<CollectionsRow> list = this.collections;
            if ((list instanceof Collection) && list.isEmpty()) {
                return false;
            }
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((CollectionsRow) it.next()) instanceof CollectionsRow.SendMessageRow) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return this.collections.hashCode();
        }

        public String toString() {
            return d.b(new StringBuilder("Content(collections="), this.collections, ')');
        }
    }

    /* JADX INFO: compiled from: CollectionsUiState.kt */
    public static final class Error implements CollectionsUiState {
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

    /* JADX INFO: compiled from: CollectionsUiState.kt */
    public static final class Initial implements CollectionsUiState {
        public static final int $stable = 0;
        public static final Initial INSTANCE = new Initial();

        private Initial() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Initial);
        }

        public int hashCode() {
            return 1088616516;
        }

        public String toString() {
            return "Initial";
        }
    }

    /* JADX INFO: compiled from: CollectionsUiState.kt */
    public static final class Loading implements CollectionsUiState {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        private Loading() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public int hashCode() {
            return -523075012;
        }

        public String toString() {
            return "Loading";
        }
    }
}
