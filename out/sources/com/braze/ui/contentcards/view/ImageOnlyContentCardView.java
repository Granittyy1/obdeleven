package com.braze.ui.contentcards.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.braze.models.cards.Card;
import com.braze.models.cards.ImageOnlyCard;
import com.braze.ui.R;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: ImageOnlyContentCardView.kt */
/* JADX INFO: loaded from: classes.dex */
public class ImageOnlyContentCardView extends BaseContentCardView<ImageOnlyCard> {

    /* JADX INFO: compiled from: ImageOnlyContentCardView.kt */
    public final class ViewHolder extends ContentCardViewHolder {
        private final ImageView imageView;
        final /* synthetic */ ImageOnlyContentCardView this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolder(ImageOnlyContentCardView imageOnlyContentCardView, View view) {
            super(view, imageOnlyContentCardView.isUnreadIndicatorEnabled());
            i.e(view, "view");
            this.this$0 = imageOnlyContentCardView;
            this.imageView = (ImageView) view.findViewById(R.id.com_braze_content_cards_image_only_card_image);
        }

        public final ImageView getImageView() {
            return this.imageView;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageOnlyContentCardView(Context context) {
        super(context);
        i.e(context, "context");
    }

    @Override // com.braze.ui.contentcards.view.BaseContentCardView
    public void bindViewHolder(ContentCardViewHolder viewHolder, Card card) {
        i.e(viewHolder, "viewHolder");
        i.e(card, "card");
        if (card instanceof ImageOnlyCard) {
            super.bindViewHolder(viewHolder, card);
            ImageOnlyCard imageOnlyCard = (ImageOnlyCard) card;
            setOptionalCardImage(((ViewHolder) viewHolder).getImageView(), imageOnlyCard.getAspectRatio(), imageOnlyCard.getImageUrl(), card);
        }
    }

    @Override // com.braze.ui.contentcards.view.BaseContentCardView
    public ContentCardViewHolder createViewHolder(ViewGroup viewGroup) {
        i.e(viewGroup, "viewGroup");
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.com_braze_image_only_content_card, viewGroup, false);
        i.d(view, "view");
        setViewBackground(view);
        return new ViewHolder(this, view);
    }
}
