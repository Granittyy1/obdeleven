package com.braze.ui.contentcards.listeners;

import android.content.Context;
import com.braze.models.cards.Card;
import com.braze.ui.actions.IAction;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: IContentCardsActionListener.kt */
/* JADX INFO: loaded from: classes.dex */
public interface IContentCardsActionListener {
    default boolean onContentCardClicked(Context context, Card card, IAction iAction) {
        i.e(context, "context");
        i.e(card, "card");
        return false;
    }

    default void onContentCardDismissed(Context context, Card card) {
        i.e(context, "context");
        i.e(card, "card");
    }
}
