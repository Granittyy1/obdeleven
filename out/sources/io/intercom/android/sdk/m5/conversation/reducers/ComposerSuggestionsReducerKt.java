package io.intercom.android.sdk.m5.conversation.reducers;

import io.intercom.android.sdk.m5.conversation.states.ContentRow;
import io.intercom.android.sdk.m5.conversation.states.ReplySuggestion;
import io.intercom.android.sdk.models.ComposerSuggestions;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.m;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: ComposerSuggestionsReducer.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class ComposerSuggestionsReducerKt {
    private static final List<ReplySuggestion> getReplySuggestions(ComposerSuggestions composerSuggestions) {
        List<ComposerSuggestions.Suggestion> suggestions = composerSuggestions.getSuggestions();
        ArrayList arrayList = new ArrayList(m.y(suggestions, 10));
        for (ComposerSuggestions.Suggestion suggestion : suggestions) {
            arrayList.add(new ReplySuggestion(suggestion.getUuid(), suggestion.getText()));
        }
        return arrayList;
    }

    public static final ContentRow reduceComposerSuggestions(ComposerSuggestions composerSuggestions) {
        i.e(composerSuggestions, "composerSuggestions");
        if (composerSuggestions.getSuggestions().isEmpty()) {
            return null;
        }
        return new ContentRow.ComposerSuggestionRow(getReplySuggestions(composerSuggestions));
    }
}
