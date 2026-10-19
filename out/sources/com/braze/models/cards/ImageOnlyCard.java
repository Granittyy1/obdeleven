package com.braze.models.cards;

import bo.app.c2;
import bo.app.e2;
import com.braze.enums.CardKey;
import com.braze.enums.CardType;
import com.braze.storage.ICardStorageProvider;
import com.braze.support.JsonUtils;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class ImageOnlyCard extends Card {
    private final float aspectRatio;
    private final CardType cardType;
    private final String domain;
    private final String imageUrl;
    private final String url;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ImageOnlyCard(JSONObject jsonObject, CardKey.Provider cardKeyProvider) {
        this(jsonObject, cardKeyProvider, null, null, null, 28, null);
        i.e(jsonObject, "jsonObject");
        i.e(cardKeyProvider, "cardKeyProvider");
    }

    public final float getAspectRatio() {
        return this.aspectRatio;
    }

    @Override // com.braze.models.cards.Card
    public CardType getCardType() {
        return this.cardType;
    }

    public final String getDomain() {
        return this.domain;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    @Override // com.braze.models.cards.Card
    public String getUrl() {
        return this.url;
    }

    @Override // com.braze.models.cards.Card
    public String toString() {
        return kotlin.text.i.v("\n            ImageOnlyCard{imageUrl='" + this.imageUrl + "'\n            url='" + getUrl() + "'\n            domain='" + this.domain + "'\n            aspectRatio=" + this.aspectRatio + "\n            " + super.toString() + "}\n            \n        ");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ImageOnlyCard(JSONObject jsonObject, CardKey.Provider cardKeyProvider, c2 c2Var) {
        this(jsonObject, cardKeyProvider, c2Var, null, null, 24, null);
        i.e(jsonObject, "jsonObject");
        i.e(cardKeyProvider, "cardKeyProvider");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ImageOnlyCard(JSONObject jsonObject, CardKey.Provider cardKeyProvider, c2 c2Var, ICardStorageProvider<?> iCardStorageProvider) {
        this(jsonObject, cardKeyProvider, c2Var, iCardStorageProvider, null, 16, null);
        i.e(jsonObject, "jsonObject");
        i.e(cardKeyProvider, "cardKeyProvider");
    }

    public /* synthetic */ ImageOnlyCard(JSONObject jSONObject, CardKey.Provider provider, c2 c2Var, ICardStorageProvider iCardStorageProvider, e2 e2Var, int i10, e eVar) {
        this(jSONObject, provider, (i10 & 4) != 0 ? null : c2Var, (i10 & 8) != 0 ? null : iCardStorageProvider, (i10 & 16) != 0 ? null : e2Var);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageOnlyCard(JSONObject jsonObject, CardKey.Provider cardKeyProvider, c2 c2Var, ICardStorageProvider<?> iCardStorageProvider, e2 e2Var) throws JSONException {
        super(jsonObject, cardKeyProvider, c2Var, iCardStorageProvider, e2Var);
        i.e(jsonObject, "jsonObject");
        i.e(cardKeyProvider, "cardKeyProvider");
        String string = jsonObject.getString(cardKeyProvider.getKey(CardKey.IMAGE_ONLY_IMAGE));
        i.d(string, "jsonObject.getString(car…ardKey.IMAGE_ONLY_IMAGE))");
        this.imageUrl = string;
        this.url = JsonUtils.getOptionalString(jsonObject, cardKeyProvider.getKey(CardKey.IMAGE_ONLY_URL));
        this.domain = JsonUtils.getOptionalString(jsonObject, cardKeyProvider.getKey(CardKey.IMAGE_ONLY_DOMAIN));
        this.aspectRatio = (float) jsonObject.optDouble(cardKeyProvider.getKey(CardKey.IMAGE_ONLY_ASPECT_RATIO), 0.0d);
        this.cardType = CardType.IMAGE;
    }
}
