package io.intercom.android.sdk.models;

import I7.b;
import androidx.compose.animation.D;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: ComposerSuggestions.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class ComposerSuggestions {
    public static final int $stable = 8;

    @b("composer_disabled")
    private final boolean isComposerDisabled;

    @b("snapshot_id")
    private final Long snapshotId;

    @b("suggestions")
    private final List<Suggestion> suggestions;

    /* JADX INFO: compiled from: ComposerSuggestions.kt */
    public static final class Suggestion {
        public static final int $stable = 0;

        @b(AttributeType.TEXT)
        private final String text;

        @b("uuid")
        private final String uuid;

        /* JADX WARN: Multi-variable type inference failed */
        public Suggestion() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ Suggestion copy$default(Suggestion suggestion, String str, String str2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = suggestion.text;
            }
            if ((i10 & 2) != 0) {
                str2 = suggestion.uuid;
            }
            return suggestion.copy(str, str2);
        }

        public final String component1() {
            return this.text;
        }

        public final String component2() {
            return this.uuid;
        }

        public final Suggestion copy(String text, String uuid) {
            i.e(text, "text");
            i.e(uuid, "uuid");
            return new Suggestion(text, uuid);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Suggestion)) {
                return false;
            }
            Suggestion suggestion = (Suggestion) obj;
            return i.a(this.text, suggestion.text) && i.a(this.uuid, suggestion.uuid);
        }

        public final String getText() {
            return this.text;
        }

        public final String getUuid() {
            return this.uuid;
        }

        public int hashCode() {
            return this.uuid.hashCode() + (this.text.hashCode() * 31);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("Suggestion(text=");
            sb2.append(this.text);
            sb2.append(", uuid=");
            return B7.b.g(sb2, this.uuid, ')');
        }

        public Suggestion(String text, String uuid) {
            i.e(text, "text");
            i.e(uuid, "uuid");
            this.text = text;
            this.uuid = uuid;
        }

        public /* synthetic */ Suggestion(String str, String str2, int i10, e eVar) {
            this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? "" : str2);
        }
    }

    public ComposerSuggestions() {
        this(null, false, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ComposerSuggestions copy$default(ComposerSuggestions composerSuggestions, List list, boolean z10, Long l10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = composerSuggestions.suggestions;
        }
        if ((i10 & 2) != 0) {
            z10 = composerSuggestions.isComposerDisabled;
        }
        if ((i10 & 4) != 0) {
            l10 = composerSuggestions.snapshotId;
        }
        return composerSuggestions.copy(list, z10, l10);
    }

    public final List<Suggestion> component1() {
        return this.suggestions;
    }

    public final boolean component2() {
        return this.isComposerDisabled;
    }

    public final Long component3() {
        return this.snapshotId;
    }

    public final ComposerSuggestions copy(List<Suggestion> suggestions, boolean z10, Long l10) {
        i.e(suggestions, "suggestions");
        return new ComposerSuggestions(suggestions, z10, l10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ComposerSuggestions)) {
            return false;
        }
        ComposerSuggestions composerSuggestions = (ComposerSuggestions) obj;
        return i.a(this.suggestions, composerSuggestions.suggestions) && this.isComposerDisabled == composerSuggestions.isComposerDisabled && i.a(this.snapshotId, composerSuggestions.snapshotId);
    }

    public final Long getSnapshotId() {
        return this.snapshotId;
    }

    public final List<Suggestion> getSuggestions() {
        return this.suggestions;
    }

    public int hashCode() {
        int iB = D.b(this.suggestions.hashCode() * 31, 31, this.isComposerDisabled);
        Long l10 = this.snapshotId;
        return iB + (l10 == null ? 0 : l10.hashCode());
    }

    public final boolean isComposerDisabled() {
        return this.isComposerDisabled;
    }

    public String toString() {
        return "ComposerSuggestions(suggestions=" + this.suggestions + ", isComposerDisabled=" + this.isComposerDisabled + ", snapshotId=" + this.snapshotId + ')';
    }

    public ComposerSuggestions(List<Suggestion> suggestions, boolean z10, Long l10) {
        i.e(suggestions, "suggestions");
        this.suggestions = suggestions;
        this.isComposerDisabled = z10;
        this.snapshotId = l10;
    }

    public ComposerSuggestions(List list, boolean z10, Long l10, int i10, e eVar) {
        this((i10 & 1) != 0 ? EmptyList.f42983b : list, (i10 & 2) != 0 ? false : z10, (i10 & 4) != 0 ? null : l10);
    }
}
