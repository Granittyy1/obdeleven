package io.intercom.android.sdk.tickets.list.data;

import androidx.compose.animation.D;
import androidx.paging.compose.b;
import io.intercom.android.sdk.m5.components.ErrorState;
import io.intercom.android.sdk.models.EmptyState;
import io.intercom.android.sdk.tickets.list.ui.TicketRowData;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: TicketsScreenUiState.kt */
/* JADX INFO: loaded from: classes3.dex */
public abstract class TicketsScreenUiState {
    public static final int $stable = 0;

    /* JADX INFO: compiled from: TicketsScreenUiState.kt */
    public static final class Content extends TicketsScreenUiState {
        public static final int $stable = 8;
        private final ErrorState errorState;
        private final boolean isLoadingMore;
        private final b<TicketRowData> lazyPagingTickets;
        private final String screenLabel;

        public /* synthetic */ Content(b bVar, boolean z10, ErrorState errorState, String str, int i10, e eVar) {
            this(bVar, (i10 & 2) != 0 ? false : z10, (i10 & 4) != 0 ? null : errorState, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Content copy$default(Content content, b bVar, boolean z10, ErrorState errorState, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                bVar = content.lazyPagingTickets;
            }
            if ((i10 & 2) != 0) {
                z10 = content.isLoadingMore;
            }
            if ((i10 & 4) != 0) {
                errorState = content.errorState;
            }
            if ((i10 & 8) != 0) {
                str = content.screenLabel;
            }
            return content.copy(bVar, z10, errorState, str);
        }

        public final b<TicketRowData> component1() {
            return this.lazyPagingTickets;
        }

        public final boolean component2() {
            return this.isLoadingMore;
        }

        public final ErrorState component3() {
            return this.errorState;
        }

        public final String component4() {
            return this.screenLabel;
        }

        public final Content copy(b<TicketRowData> lazyPagingTickets, boolean z10, ErrorState errorState, String screenLabel) {
            i.e(lazyPagingTickets, "lazyPagingTickets");
            i.e(screenLabel, "screenLabel");
            return new Content(lazyPagingTickets, z10, errorState, screenLabel);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Content)) {
                return false;
            }
            Content content = (Content) obj;
            return i.a(this.lazyPagingTickets, content.lazyPagingTickets) && this.isLoadingMore == content.isLoadingMore && i.a(this.errorState, content.errorState) && i.a(this.screenLabel, content.screenLabel);
        }

        public final ErrorState getErrorState() {
            return this.errorState;
        }

        public final b<TicketRowData> getLazyPagingTickets() {
            return this.lazyPagingTickets;
        }

        @Override // io.intercom.android.sdk.tickets.list.data.TicketsScreenUiState
        public String getScreenLabel() {
            return this.screenLabel;
        }

        public int hashCode() {
            int iB = D.b(this.lazyPagingTickets.hashCode() * 31, 31, this.isLoadingMore);
            ErrorState errorState = this.errorState;
            return this.screenLabel.hashCode() + ((iB + (errorState == null ? 0 : errorState.hashCode())) * 31);
        }

        public final boolean isLoadingMore() {
            return this.isLoadingMore;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("Content(lazyPagingTickets=");
            sb2.append(this.lazyPagingTickets);
            sb2.append(", isLoadingMore=");
            sb2.append(this.isLoadingMore);
            sb2.append(", errorState=");
            sb2.append(this.errorState);
            sb2.append(", screenLabel=");
            return B7.b.g(sb2, this.screenLabel, ')');
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Content(b<TicketRowData> lazyPagingTickets, boolean z10, ErrorState errorState, String screenLabel) {
            super(null);
            i.e(lazyPagingTickets, "lazyPagingTickets");
            i.e(screenLabel, "screenLabel");
            this.lazyPagingTickets = lazyPagingTickets;
            this.isLoadingMore = z10;
            this.errorState = errorState;
            this.screenLabel = screenLabel;
        }
    }

    /* JADX INFO: compiled from: TicketsScreenUiState.kt */
    public static final class Empty extends TicketsScreenUiState {
        public static final int $stable = 0;
        private final EmptyState emptyState;
        private final String screenLabel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Empty(EmptyState emptyState, String screenLabel) {
            super(null);
            i.e(emptyState, "emptyState");
            i.e(screenLabel, "screenLabel");
            this.emptyState = emptyState;
            this.screenLabel = screenLabel;
        }

        public static /* synthetic */ Empty copy$default(Empty empty, EmptyState emptyState, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                emptyState = empty.emptyState;
            }
            if ((i10 & 2) != 0) {
                str = empty.screenLabel;
            }
            return empty.copy(emptyState, str);
        }

        public final EmptyState component1() {
            return this.emptyState;
        }

        public final String component2() {
            return this.screenLabel;
        }

        public final Empty copy(EmptyState emptyState, String screenLabel) {
            i.e(emptyState, "emptyState");
            i.e(screenLabel, "screenLabel");
            return new Empty(emptyState, screenLabel);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Empty)) {
                return false;
            }
            Empty empty = (Empty) obj;
            return i.a(this.emptyState, empty.emptyState) && i.a(this.screenLabel, empty.screenLabel);
        }

        public final EmptyState getEmptyState() {
            return this.emptyState;
        }

        @Override // io.intercom.android.sdk.tickets.list.data.TicketsScreenUiState
        public String getScreenLabel() {
            return this.screenLabel;
        }

        public int hashCode() {
            return this.screenLabel.hashCode() + (this.emptyState.hashCode() * 31);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("Empty(emptyState=");
            sb2.append(this.emptyState);
            sb2.append(", screenLabel=");
            return B7.b.g(sb2, this.screenLabel, ')');
        }
    }

    /* JADX INFO: compiled from: TicketsScreenUiState.kt */
    public static final class Error extends TicketsScreenUiState {
        public static final int $stable = 0;
        private final ErrorState errorState;
        private final String screenLabel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(ErrorState errorState, String screenLabel) {
            super(null);
            i.e(errorState, "errorState");
            i.e(screenLabel, "screenLabel");
            this.errorState = errorState;
            this.screenLabel = screenLabel;
        }

        public static /* synthetic */ Error copy$default(Error error, ErrorState errorState, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                errorState = error.errorState;
            }
            if ((i10 & 2) != 0) {
                str = error.screenLabel;
            }
            return error.copy(errorState, str);
        }

        public final ErrorState component1() {
            return this.errorState;
        }

        public final String component2() {
            return this.screenLabel;
        }

        public final Error copy(ErrorState errorState, String screenLabel) {
            i.e(errorState, "errorState");
            i.e(screenLabel, "screenLabel");
            return new Error(errorState, screenLabel);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Error)) {
                return false;
            }
            Error error = (Error) obj;
            return i.a(this.errorState, error.errorState) && i.a(this.screenLabel, error.screenLabel);
        }

        public final ErrorState getErrorState() {
            return this.errorState;
        }

        @Override // io.intercom.android.sdk.tickets.list.data.TicketsScreenUiState
        public String getScreenLabel() {
            return this.screenLabel;
        }

        public int hashCode() {
            return this.screenLabel.hashCode() + (this.errorState.hashCode() * 31);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("Error(errorState=");
            sb2.append(this.errorState);
            sb2.append(", screenLabel=");
            return B7.b.g(sb2, this.screenLabel, ')');
        }
    }

    /* JADX INFO: compiled from: TicketsScreenUiState.kt */
    public static final class Initial extends TicketsScreenUiState {
        public static final int $stable = 0;
        private final String screenLabel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Initial(String screenLabel) {
            super(null);
            i.e(screenLabel, "screenLabel");
            this.screenLabel = screenLabel;
        }

        public static /* synthetic */ Initial copy$default(Initial initial, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = initial.screenLabel;
            }
            return initial.copy(str);
        }

        public final String component1() {
            return this.screenLabel;
        }

        public final Initial copy(String screenLabel) {
            i.e(screenLabel, "screenLabel");
            return new Initial(screenLabel);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Initial) && i.a(this.screenLabel, ((Initial) obj).screenLabel);
        }

        @Override // io.intercom.android.sdk.tickets.list.data.TicketsScreenUiState
        public String getScreenLabel() {
            return this.screenLabel;
        }

        public int hashCode() {
            return this.screenLabel.hashCode();
        }

        public String toString() {
            return B7.b.g(new StringBuilder("Initial(screenLabel="), this.screenLabel, ')');
        }
    }

    /* JADX INFO: compiled from: TicketsScreenUiState.kt */
    public static final class Loading extends TicketsScreenUiState {
        public static final int $stable = 0;
        private final String screenLabel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Loading(String screenLabel) {
            super(null);
            i.e(screenLabel, "screenLabel");
            this.screenLabel = screenLabel;
        }

        public static /* synthetic */ Loading copy$default(Loading loading, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = loading.screenLabel;
            }
            return loading.copy(str);
        }

        public final String component1() {
            return this.screenLabel;
        }

        public final Loading copy(String screenLabel) {
            i.e(screenLabel, "screenLabel");
            return new Loading(screenLabel);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Loading) && i.a(this.screenLabel, ((Loading) obj).screenLabel);
        }

        @Override // io.intercom.android.sdk.tickets.list.data.TicketsScreenUiState
        public String getScreenLabel() {
            return this.screenLabel;
        }

        public int hashCode() {
            return this.screenLabel.hashCode();
        }

        public String toString() {
            return B7.b.g(new StringBuilder("Loading(screenLabel="), this.screenLabel, ')');
        }
    }

    public /* synthetic */ TicketsScreenUiState(e eVar) {
        this();
    }

    public abstract String getScreenLabel();

    private TicketsScreenUiState() {
    }
}
