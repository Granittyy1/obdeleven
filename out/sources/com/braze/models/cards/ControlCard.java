package com.braze.models.cards;

import B7.b;
import bo.app.c2;
import bo.app.e2;
import com.braze.enums.CardKey;
import com.braze.enums.CardType;
import com.braze.storage.ICardStorageProvider;
import kotlin.jvm.internal.i;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class ControlCard extends Card {
    private final CardType cardType;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ControlCard(JSONObject jsonObject, CardKey.Provider cardKeysProvider, c2 c2Var, ICardStorageProvider<?> iCardStorageProvider, e2 e2Var) {
        super(jsonObject, cardKeysProvider, c2Var, iCardStorageProvider, e2Var);
        i.e(jsonObject, "jsonObject");
        i.e(cardKeysProvider, "cardKeysProvider");
        this.cardType = CardType.CONTROL;
    }

    @Override // com.braze.models.cards.Card
    public CardType getCardType() {
        return this.cardType;
    }

    @Override // com.braze.models.cards.Card
    public String toString() {
        return b.g(new StringBuilder("ControlCard{"), super.toString(), '}');
    }
}
