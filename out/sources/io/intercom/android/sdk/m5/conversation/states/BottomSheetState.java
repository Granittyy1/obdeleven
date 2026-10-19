package io.intercom.android.sdk.m5.conversation.states;

import Q8.d;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.models.InlineSource;
import io.intercom.android.sdk.models.Source;
import java.util.List;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: ConversationUiState.kt */
/* JADX INFO: loaded from: classes3.dex */
public interface BottomSheetState {

    /* JADX INFO: compiled from: ConversationUiState.kt */
    public static final class Empty implements BottomSheetState {
        public static final int $stable = 0;
        public static final Empty INSTANCE = new Empty();

        private Empty() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Empty);
        }

        public int hashCode() {
            return -1704299409;
        }

        public String toString() {
            return "Empty";
        }
    }

    /* JADX INFO: compiled from: ConversationUiState.kt */
    public static final class GifSearch implements BottomSheetState {
        public static final int $stable = 8;
        private final List<Block> gifs;

        /* JADX WARN: Multi-variable type inference failed */
        public GifSearch(List<? extends Block> gifs) {
            i.e(gifs, "gifs");
            this.gifs = gifs;
        }

        public final List<Block> getGifs() {
            return this.gifs;
        }
    }

    /* JADX INFO: compiled from: ConversationUiState.kt */
    public static final class InlineSources implements BottomSheetState {
        public static final int $stable = 8;
        private final List<InlineSource> selectedSources;
        private final List<Source> sources;

        public InlineSources(List<InlineSource> selectedSources, List<Source> sources) {
            i.e(selectedSources, "selectedSources");
            i.e(sources, "sources");
            this.selectedSources = selectedSources;
            this.sources = sources;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ InlineSources copy$default(InlineSources inlineSources, List list, List list2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                list = inlineSources.selectedSources;
            }
            if ((i10 & 2) != 0) {
                list2 = inlineSources.sources;
            }
            return inlineSources.copy(list, list2);
        }

        public final List<InlineSource> component1() {
            return this.selectedSources;
        }

        public final List<Source> component2() {
            return this.sources;
        }

        public final InlineSources copy(List<InlineSource> selectedSources, List<Source> sources) {
            i.e(selectedSources, "selectedSources");
            i.e(sources, "sources");
            return new InlineSources(selectedSources, sources);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InlineSources)) {
                return false;
            }
            InlineSources inlineSources = (InlineSources) obj;
            return i.a(this.selectedSources, inlineSources.selectedSources) && i.a(this.sources, inlineSources.sources);
        }

        public final List<InlineSource> getSelectedSources() {
            return this.selectedSources;
        }

        public final List<Source> getSources() {
            return this.sources;
        }

        public int hashCode() {
            return this.sources.hashCode() + (this.selectedSources.hashCode() * 31);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("InlineSources(selectedSources=");
            sb2.append(this.selectedSources);
            sb2.append(", sources=");
            return d.b(sb2, this.sources, ')');
        }
    }

    /* JADX INFO: compiled from: ConversationUiState.kt */
    public static final class MediaInput implements BottomSheetState {
        public static final int $stable = 0;
        public static final MediaInput INSTANCE = new MediaInput();

        private MediaInput() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof MediaInput);
        }

        public int hashCode() {
            return -1100907420;
        }

        public String toString() {
            return "MediaInput";
        }
    }

    /* JADX INFO: compiled from: ConversationUiState.kt */
    public static final class TeammatePresence implements BottomSheetState {
        public static final int $stable = 0;
        public static final TeammatePresence INSTANCE = new TeammatePresence();

        private TeammatePresence() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof TeammatePresence);
        }

        public int hashCode() {
            return 298154395;
        }

        public String toString() {
            return "TeammatePresence";
        }
    }
}
