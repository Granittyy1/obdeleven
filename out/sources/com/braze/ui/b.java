package com.braze.ui;

import com.braze.models.cards.Card;
import java.util.Comparator;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return BrazeFeedFragment.lambda$sortFeedCards$4((Card) obj, (Card) obj2);
    }
}
