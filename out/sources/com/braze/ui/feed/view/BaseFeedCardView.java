package com.braze.ui.feed.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.ViewSwitcher;
import com.braze.models.cards.Card;
import com.braze.support.BrazeLogger;
import com.braze.ui.R;
import com.braze.ui.actions.IAction;
import com.braze.ui.feed.BrazeFeedManager;
import com.braze.ui.feed.BrazeImageSwitcher;
import com.braze.ui.widget.BaseCardView;
import com.google.gson.internal.a;

/* JADX INFO: loaded from: classes.dex */
public abstract class BaseFeedCardView<T extends Card> extends BaseCardView<T> {
    private static final String TAG = BrazeLogger.getBrazeLogTag((Class<?>) BaseCardView.class);

    public BaseFeedCardView(Context context) {
        BrazeImageSwitcher brazeImageSwitcher;
        super(context);
        ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(getLayoutResource(), this);
        BrazeImageSwitcher brazeImageSwitcher2 = (BrazeImageSwitcher) findViewById(R.id.com_braze_newsfeed_item_read_indicator_image_switcher);
        this.imageSwitcher = brazeImageSwitcher2;
        if (brazeImageSwitcher2 != null) {
            brazeImageSwitcher2.setFactory(new ViewSwitcher.ViewFactory() { // from class: x3.a
                @Override // android.widget.ViewSwitcher.ViewFactory
                public final View makeView() {
                    return this.f47890a.lambda$new$0();
                }
            });
        }
        if (isUnreadIndicatorEnabled() || (brazeImageSwitcher = this.imageSwitcher) == null) {
            return;
        }
        brazeImageSwitcher.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ View lambda$new$0() {
        return new ImageView(this.applicationContext);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setCard$1() {
        setCardViewedIndicator(this.imageSwitcher, getCard());
    }

    public Card getCard() {
        return this.card;
    }

    public abstract int getLayoutResource();

    public View getProperViewFromInflatedStub(int i10) {
        ((ViewStub) findViewById(i10)).inflate();
        return findViewById(R.id.com_braze_stubbed_feed_image_view);
    }

    @Override // com.braze.ui.widget.BaseCardView
    public boolean isClickHandled(Context context, Card card, IAction iAction) {
        return BrazeFeedManager.getInstance().getFeedCardClickActionListener().onFeedCardClicked(context, card, iAction);
    }

    public abstract void onSetCard(T t8);

    public void setCard(T t8) {
        this.card = t8;
        onSetCard(t8);
        this.card.setListener(new a(this));
        setCardViewedIndicator(this.imageSwitcher, getCard());
    }
}
