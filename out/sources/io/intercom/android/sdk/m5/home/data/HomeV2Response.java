package io.intercom.android.sdk.m5.home.data;

import I7.b;
import Q8.d;
import java.util.List;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: HomeV2Response.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class HomeV2Response {
    public static final int $stable = 8;

    @b("cards")
    private final List<HomeCards> cards;

    /* JADX WARN: Multi-variable type inference failed */
    public HomeV2Response(List<? extends HomeCards> cards) {
        i.e(cards, "cards");
        this.cards = cards;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HomeV2Response copy$default(HomeV2Response homeV2Response, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = homeV2Response.cards;
        }
        return homeV2Response.copy(list);
    }

    public final List<HomeCards> component1() {
        return this.cards;
    }

    public final HomeV2Response copy(List<? extends HomeCards> cards) {
        i.e(cards, "cards");
        return new HomeV2Response(cards);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof HomeV2Response) && i.a(this.cards, ((HomeV2Response) obj).cards);
    }

    public final List<HomeCards> getCards() {
        return this.cards;
    }

    public int hashCode() {
        return this.cards.hashCode();
    }

    public String toString() {
        return d.b(new StringBuilder("HomeV2Response(cards="), this.cards, ')');
    }
}
