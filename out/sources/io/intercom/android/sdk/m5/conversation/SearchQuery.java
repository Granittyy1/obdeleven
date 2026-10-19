package io.intercom.android.sdk.m5.conversation;

import B7.b;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: ConversationViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
interface SearchQuery {

    /* JADX INFO: compiled from: ConversationViewModel.kt */
    public static final class None implements SearchQuery {
        public static final int $stable = 0;
        public static final None INSTANCE = new None();

        private None() {
        }
    }

    /* JADX INFO: compiled from: ConversationViewModel.kt */
    public static final class Query implements SearchQuery {
        public static final int $stable = 0;
        private final String value;

        public Query(String value) {
            i.e(value, "value");
            this.value = value;
        }

        public static /* synthetic */ Query copy$default(Query query, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = query.value;
            }
            return query.copy(str);
        }

        public final String component1() {
            return this.value;
        }

        public final Query copy(String value) {
            i.e(value, "value");
            return new Query(value);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Query) && i.a(this.value, ((Query) obj).value);
        }

        public final String getValue() {
            return this.value;
        }

        public int hashCode() {
            return this.value.hashCode();
        }

        public String toString() {
            return b.g(new StringBuilder("Query(value="), this.value, ')');
        }
    }
}
