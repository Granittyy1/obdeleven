package io.intercom.android.sdk.m5.conversation.states;

import B7.b;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: ConversationUiState.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class ReplySuggestion {
    public static final int $stable = 0;
    private final String id;
    private final String text;

    public ReplySuggestion(String id, String text) {
        i.e(id, "id");
        i.e(text, "text");
        this.id = id;
        this.text = text;
    }

    public static /* synthetic */ ReplySuggestion copy$default(ReplySuggestion replySuggestion, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = replySuggestion.id;
        }
        if ((i10 & 2) != 0) {
            str2 = replySuggestion.text;
        }
        return replySuggestion.copy(str, str2);
    }

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.text;
    }

    public final ReplySuggestion copy(String id, String text) {
        i.e(id, "id");
        i.e(text, "text");
        return new ReplySuggestion(id, text);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReplySuggestion)) {
            return false;
        }
        ReplySuggestion replySuggestion = (ReplySuggestion) obj;
        return i.a(this.id, replySuggestion.id) && i.a(this.text, replySuggestion.text);
    }

    public final String getId() {
        return this.id;
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        return this.text.hashCode() + (this.id.hashCode() * 31);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("ReplySuggestion(id=");
        sb2.append(this.id);
        sb2.append(", text=");
        return b.g(sb2, this.text, ')');
    }
}
