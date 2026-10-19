package io.intercom.android.sdk.m5.home.data;

import B1.a;
import I7.b;
import java.util.List;
import kotlin.jvm.internal.i;
import p005a4.p;

/* JADX INFO: compiled from: HomeV2Response.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class Card {
    public static final int $stable = 8;

    @b("action")
    private final Action action;

    @b("card_title")
    private final String cardTitle;

    @b("space_items")
    private final List<SpaceItem> spaceItems;

    @b("suggested_articles")
    private final List<SuggestedArticle> suggestedArticles;

    @b("type")
    private final String type;

    public Card(Action action, String cardTitle, List<SpaceItem> spaceItems, List<SuggestedArticle> suggestedArticles, String type) {
        i.e(action, "action");
        i.e(cardTitle, "cardTitle");
        i.e(spaceItems, "spaceItems");
        i.e(suggestedArticles, "suggestedArticles");
        i.e(type, "type");
        this.action = action;
        this.cardTitle = cardTitle;
        this.spaceItems = spaceItems;
        this.suggestedArticles = suggestedArticles;
        this.type = type;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Card copy$default(Card card, Action action, String str, List list, List list2, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            action = card.action;
        }
        if ((i10 & 2) != 0) {
            str = card.cardTitle;
        }
        String str3 = str;
        if ((i10 & 4) != 0) {
            list = card.spaceItems;
        }
        List list3 = list;
        if ((i10 & 8) != 0) {
            list2 = card.suggestedArticles;
        }
        List list4 = list2;
        if ((i10 & 16) != 0) {
            str2 = card.type;
        }
        return card.copy(action, str3, list3, list4, str2);
    }

    public final Action component1() {
        return this.action;
    }

    public final String component2() {
        return this.cardTitle;
    }

    public final List<SpaceItem> component3() {
        return this.spaceItems;
    }

    public final List<SuggestedArticle> component4() {
        return this.suggestedArticles;
    }

    public final String component5() {
        return this.type;
    }

    public final Card copy(Action action, String cardTitle, List<SpaceItem> spaceItems, List<SuggestedArticle> suggestedArticles, String type) {
        i.e(action, "action");
        i.e(cardTitle, "cardTitle");
        i.e(spaceItems, "spaceItems");
        i.e(suggestedArticles, "suggestedArticles");
        i.e(type, "type");
        return new Card(action, cardTitle, spaceItems, suggestedArticles, type);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Card)) {
            return false;
        }
        Card card = (Card) obj;
        return i.a(this.action, card.action) && i.a(this.cardTitle, card.cardTitle) && i.a(this.spaceItems, card.spaceItems) && i.a(this.suggestedArticles, card.suggestedArticles) && i.a(this.type, card.type);
    }

    public final Action getAction() {
        return this.action;
    }

    public final String getCardTitle() {
        return this.cardTitle;
    }

    public final List<SpaceItem> getSpaceItems() {
        return this.spaceItems;
    }

    public final List<SuggestedArticle> getSuggestedArticles() {
        return this.suggestedArticles;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return this.type.hashCode() + p.d(p.d(a.b(this.cardTitle, this.action.hashCode() * 31, 31), 31, this.spaceItems), 31, this.suggestedArticles);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Card(action=");
        sb2.append(this.action);
        sb2.append(", cardTitle=");
        sb2.append(this.cardTitle);
        sb2.append(", spaceItems=");
        sb2.append(this.spaceItems);
        sb2.append(", suggestedArticles=");
        sb2.append(this.suggestedArticles);
        sb2.append(", type=");
        return B7.b.g(sb2, this.type, ')');
    }
}
