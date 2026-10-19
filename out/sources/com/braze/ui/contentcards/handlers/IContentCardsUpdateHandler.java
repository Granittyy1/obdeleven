package com.braze.ui.contentcards.handlers;

import android.os.Parcelable;
import com.braze.events.ContentCardsUpdatedEvent;
import com.braze.models.cards.Card;
import java.util.List;

/* JADX INFO: compiled from: IContentCardsUpdateHandler.kt */
/* JADX INFO: loaded from: classes.dex */
public interface IContentCardsUpdateHandler extends Parcelable {
    List<Card> handleCardUpdate(ContentCardsUpdatedEvent contentCardsUpdatedEvent);
}
