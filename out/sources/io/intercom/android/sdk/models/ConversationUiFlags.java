package io.intercom.android.sdk.models;

import I7.b;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: ConversationUiFlags.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class ConversationUiFlags {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final ConversationUiFlags DEFAULT = new ConversationUiFlags(0 == true ? 1 : 0, 1, 0 == true ? 1 : 0);

    @b("show_last_part_meta")
    private final Boolean showLastPartMeta;

    /* JADX INFO: compiled from: ConversationUiFlags.kt */
    public static final class Companion {
        public /* synthetic */ Companion(e eVar) {
            this();
        }

        public final ConversationUiFlags getDEFAULT() {
            return ConversationUiFlags.DEFAULT;
        }

        private Companion() {
        }

        public static /* synthetic */ void getDEFAULT$annotations() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ConversationUiFlags() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ ConversationUiFlags copy$default(ConversationUiFlags conversationUiFlags, Boolean bool, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            bool = conversationUiFlags.showLastPartMeta;
        }
        return conversationUiFlags.copy(bool);
    }

    public static final ConversationUiFlags getDEFAULT() {
        return Companion.getDEFAULT();
    }

    public final Boolean component1() {
        return this.showLastPartMeta;
    }

    public final ConversationUiFlags copy(Boolean bool) {
        return new ConversationUiFlags(bool);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ConversationUiFlags) && i.a(this.showLastPartMeta, ((ConversationUiFlags) obj).showLastPartMeta);
    }

    public final Boolean getShowLastPartMeta() {
        return this.showLastPartMeta;
    }

    public int hashCode() {
        Boolean bool = this.showLastPartMeta;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }

    public String toString() {
        return "ConversationUiFlags(showLastPartMeta=" + this.showLastPartMeta + ')';
    }

    public ConversationUiFlags(Boolean bool) {
        this.showLastPartMeta = bool;
    }

    public /* synthetic */ ConversationUiFlags(Boolean bool, int i10, e eVar) {
        this((i10 & 1) != 0 ? Boolean.TRUE : bool);
    }
}
