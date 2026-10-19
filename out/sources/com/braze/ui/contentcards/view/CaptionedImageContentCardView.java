package com.braze.ui.contentcards.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.braze.models.cards.CaptionedImageCard;
import com.braze.models.cards.Card;
import com.braze.ui.R;
import kotlin.jvm.internal.i;
import kotlin.text.n;

/* JADX INFO: compiled from: CaptionedImageContentCardView.kt */
/* JADX INFO: loaded from: classes.dex */
public class CaptionedImageContentCardView extends BaseContentCardView<CaptionedImageCard> {

    /* JADX INFO: compiled from: CaptionedImageContentCardView.kt */
    public final class ViewHolder extends ContentCardViewHolder {
        private final TextView description;
        private final ImageView imageView;
        final /* synthetic */ CaptionedImageContentCardView this$0;
        private final TextView title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolder(CaptionedImageContentCardView captionedImageContentCardView, View view) {
            super(view, captionedImageContentCardView.isUnreadIndicatorEnabled());
            i.e(view, "view");
            this.this$0 = captionedImageContentCardView;
            this.title = (TextView) view.findViewById(R.id.com_braze_content_cards_captioned_image_title);
            this.description = (TextView) view.findViewById(R.id.com_braze_content_cards_captioned_image_description);
            this.imageView = (ImageView) view.findViewById(R.id.com_braze_content_cards_captioned_image_card_image);
        }

        public final TextView getDescription() {
            return this.description;
        }

        public final ImageView getImageView() {
            return this.imageView;
        }

        public final TextView getTitle() {
            return this.title;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CaptionedImageContentCardView(Context context) {
        super(context);
        i.e(context, "context");
    }

    @Override // com.braze.ui.contentcards.view.BaseContentCardView
    public void bindViewHolder(ContentCardViewHolder viewHolder, Card card) {
        i.e(viewHolder, "viewHolder");
        i.e(card, "card");
        if (card instanceof CaptionedImageCard) {
            super.bindViewHolder(viewHolder, card);
            ViewHolder viewHolder2 = (ViewHolder) viewHolder;
            TextView title = viewHolder2.getTitle();
            if (title != null) {
                setOptionalTextView(title, ((CaptionedImageCard) card).getTitle());
            }
            TextView description = viewHolder2.getDescription();
            if (description != null) {
                setOptionalTextView(description, ((CaptionedImageCard) card).getDescription());
            }
            CaptionedImageCard captionedImageCard = (CaptionedImageCard) card;
            String domain = captionedImageCard.getDomain();
            String url = (domain == null || n.S(domain)) ? card.getUrl() : captionedImageCard.getDomain();
            if (url != null) {
                viewHolder2.setActionHintText(url);
            }
            setOptionalCardImage(viewHolder2.getImageView(), captionedImageCard.getAspectRatio(), captionedImageCard.getImageUrl(), card);
            viewHolder.itemView.setContentDescription(captionedImageCard.getTitle() + " .  " + captionedImageCard.getDescription());
        }
    }

    @Override // com.braze.ui.contentcards.view.BaseContentCardView
    public ContentCardViewHolder createViewHolder(ViewGroup viewGroup) {
        i.e(viewGroup, "viewGroup");
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.com_braze_captioned_image_content_card, viewGroup, false);
        i.d(view, "view");
        setViewBackground(view);
        return new ViewHolder(this, view);
    }
}
