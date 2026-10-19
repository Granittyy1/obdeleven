package com.braze.ui.contentcards.view;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.braze.models.cards.Card;
import com.braze.ui.R;
import com.braze.ui.actions.IAction;
import com.braze.ui.actions.UriAction;
import com.braze.ui.contentcards.listeners.IContentCardsActionListener;
import com.braze.ui.contentcards.managers.BrazeContentCardsManager;
import com.braze.ui.widget.BaseCardView;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: BaseContentCardView.kt */
/* JADX INFO: loaded from: classes.dex */
public abstract class BaseContentCardView<T extends Card> extends BaseCardView<T> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseContentCardView(Context context) {
        super(context);
        i.e(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindViewHolder$lambda$0(BaseContentCardView this$0, Card card, UriAction uriAction, View view) {
        i.e(this$0, "this$0");
        i.e(card, "$card");
        this$0.handleCardClick(this$0.applicationContext, card, uriAction);
    }

    public void bindViewHolder(ContentCardViewHolder viewHolder, Card card) {
        i.e(viewHolder, "viewHolder");
        i.e(card, "card");
        viewHolder.setPinnedIconVisible(card.isPinned());
        viewHolder.setUnreadBarVisible(this.configurationProvider.isContentCardsUnreadVisualIndicatorEnabled() && !card.isIndicatorHighlighted());
        UriAction uriActionForCard = BaseCardView.getUriActionForCard(card);
        viewHolder.itemView.setOnClickListener(new a(this, card, uriActionForCard, 0));
        viewHolder.setActionHintVisible(uriActionForCard != null);
    }

    public abstract ContentCardViewHolder createViewHolder(ViewGroup viewGroup);

    @Override // com.braze.ui.widget.BaseCardView
    public boolean isClickHandled(Context context, Card card, IAction iAction) {
        i.e(context, "context");
        i.e(card, "card");
        IContentCardsActionListener contentCardsActionListener = BrazeContentCardsManager.Companion.getInstance().getContentCardsActionListener();
        return contentCardsActionListener != null && contentCardsActionListener.onContentCardClicked(context, card, iAction);
    }

    public final void safeSetClipToOutline(ImageView imageView) {
        if (imageView == null) {
            return;
        }
        imageView.setClipToOutline(true);
    }

    public final void setOptionalCardImage(ImageView imageView, float f10, String str, Card card) {
        i.e(card, "card");
        if (imageView == null || str == null) {
            return;
        }
        setImageViewToUrl(imageView, str, f10, card);
    }

    public final void setViewBackground(View view) {
        i.e(view, "view");
        view.setBackground(getResources().getDrawable(R.drawable.com_braze_content_card_background));
        view.setForeground(getResources().getDrawable(R.drawable.com_braze_content_card_scrim));
    }
}
