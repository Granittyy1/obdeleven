package com.braze.ui.contentcards.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.braze.models.cards.Card;
import com.braze.ui.R;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: DefaultContentCardView.kt */
/* JADX INFO: loaded from: classes.dex */
public class DefaultContentCardView extends BaseContentCardView<Card> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultContentCardView(Context context) {
        super(context);
        i.e(context, "context");
    }

    @Override // com.braze.ui.contentcards.view.BaseContentCardView
    public void bindViewHolder(ContentCardViewHolder viewHolder, Card card) {
        i.e(viewHolder, "viewHolder");
        i.e(card, "card");
    }

    @Override // com.braze.ui.contentcards.view.BaseContentCardView
    public ContentCardViewHolder createViewHolder(ViewGroup viewGroup) {
        i.e(viewGroup, "viewGroup");
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.com_braze_default_content_card, viewGroup, false);
        i.d(view, "view");
        return new ContentCardViewHolder(view, false);
    }
}
