package com.braze.ui.contentcards.handlers;

import android.content.Context;
import android.os.Parcelable;
import android.view.ViewGroup;
import com.braze.models.cards.Card;
import com.braze.ui.contentcards.view.ContentCardViewHolder;
import java.util.List;

/* JADX INFO: compiled from: IContentCardsViewBindingHandler.kt */
/* JADX INFO: loaded from: classes.dex */
public interface IContentCardsViewBindingHandler extends Parcelable {
    int getItemViewType(Context context, List<? extends Card> list, int i10);

    void onBindViewHolder(Context context, List<? extends Card> list, ContentCardViewHolder contentCardViewHolder, int i10);

    ContentCardViewHolder onCreateViewHolder(Context context, List<? extends Card> list, ViewGroup viewGroup, int i10);
}
