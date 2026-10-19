package io.intercom.android.sdk.m5.conversation.ui.components.row;

/* JADX INFO: compiled from: QuickReplies.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class QuickReply {
    public static final int $stable = 0;
    private final String id;
    private final String text;

    public QuickReply(String id, String text) {
        kotlin.jvm.internal.i.e(id, "id");
        kotlin.jvm.internal.i.e(text, "text");
        this.id = id;
        this.text = text;
    }

    public static /* synthetic */ QuickReply copy$default(QuickReply quickReply, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = quickReply.id;
        }
        if ((i10 & 2) != 0) {
            str2 = quickReply.text;
        }
        return quickReply.copy(str, str2);
    }

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.text;
    }

    public final QuickReply copy(String id, String text) {
        kotlin.jvm.internal.i.e(id, "id");
        kotlin.jvm.internal.i.e(text, "text");
        return new QuickReply(id, text);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QuickReply)) {
            return false;
        }
        QuickReply quickReply = (QuickReply) obj;
        return kotlin.jvm.internal.i.a(this.id, quickReply.id) && kotlin.jvm.internal.i.a(this.text, quickReply.text);
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
        StringBuilder sb2 = new StringBuilder("QuickReply(id=");
        sb2.append(this.id);
        sb2.append(", text=");
        return B7.b.g(sb2, this.text, ')');
    }
}
