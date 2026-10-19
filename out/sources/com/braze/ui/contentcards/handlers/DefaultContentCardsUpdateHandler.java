package com.braze.ui.contentcards.handlers;

import android.os.Parcel;
import android.os.Parcelable;
import bo.app.H0;
import com.braze.events.ContentCardsUpdatedEvent;
import com.braze.models.cards.Card;
import com.braze.ui.actions.brazeactions.BrazeActionUtils;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.q;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: DefaultContentCardsUpdateHandler.kt */
/* JADX INFO: loaded from: classes.dex */
public class DefaultContentCardsUpdateHandler implements IContentCardsUpdateHandler {
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<DefaultContentCardsUpdateHandler> CREATOR = new Parcelable.Creator<DefaultContentCardsUpdateHandler>() { // from class: com.braze.ui.contentcards.handlers.DefaultContentCardsUpdateHandler$Companion$CREATOR$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public DefaultContentCardsUpdateHandler createFromParcel(Parcel source) {
            i.e(source, "source");
            return new DefaultContentCardsUpdateHandler();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public DefaultContentCardsUpdateHandler[] newArray(int i10) {
            return new DefaultContentCardsUpdateHandler[i10];
        }
    };

    /* JADX INFO: compiled from: DefaultContentCardsUpdateHandler.kt */
    public static final class Companion {
        public /* synthetic */ Companion(e eVar) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int handleCardUpdate$lambda$0(Card cardA, Card cardB) {
        i.e(cardA, "cardA");
        i.e(cardB, "cardB");
        if (cardA.isPinned() && !cardB.isPinned()) {
            return -1;
        }
        if (cardA.isPinned() || !cardB.isPinned()) {
            if (cardA.getCreated() > cardB.getCreated()) {
                return -1;
            }
            if (cardA.getCreated() >= cardB.getCreated()) {
                if (cardA.getId().compareTo(cardB.getId()) > 0) {
                    return -1;
                }
                if (cardA.getId().compareTo(cardB.getId()) >= 0) {
                    return 0;
                }
            }
        }
        return 1;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.braze.ui.contentcards.handlers.IContentCardsUpdateHandler
    public List<Card> handleCardUpdate(ContentCardsUpdatedEvent event) {
        i.e(event, "event");
        H0 h8 = new H0(1);
        List<Card> allCards = event.getAllCards();
        ArrayList arrayList = new ArrayList();
        for (Object obj : allCards) {
            if (!BrazeActionUtils.containsInvalidBrazeAction((Card) obj)) {
                arrayList.add(obj);
            }
        }
        return q.h0(arrayList, h8);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int i10) {
        i.e(dest, "dest");
    }
}
