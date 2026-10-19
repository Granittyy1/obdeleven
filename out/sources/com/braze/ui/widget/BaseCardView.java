package com.braze.ui.widget;

import android.content.Context;
import android.os.Bundle;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.braze.Braze;
import com.braze.BrazeInternal;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.enums.BrazeViewBounds;
import com.braze.images.IBrazeImageLoader;
import com.braze.models.cards.Card;
import com.braze.support.BrazeLogger;
import com.braze.ui.BrazeDeeplinkHandler;
import com.braze.ui.R;
import com.braze.ui.actions.IAction;
import com.braze.ui.actions.UriAction;
import com.braze.ui.feed.BrazeImageSwitcher;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;
import kotlin.text.n;

/* JADX INFO: compiled from: BaseCardView.kt */
/* JADX INFO: loaded from: classes.dex */
public abstract class BaseCardView<T extends Card> extends RelativeLayout {
    public static final Companion Companion = new Companion(null);
    private static final String ICON_READ_TAG = "icon_read";
    private static final String ICON_UNREAD_TAG = "icon_unread";
    protected final Context applicationContext;
    protected T card;
    private final String classLogTag;
    protected BrazeConfigurationProvider configurationProvider;
    public BrazeImageSwitcher imageSwitcher;
    private final boolean isUnreadCardVisualIndicatorEnabled;

    /* JADX INFO: compiled from: BaseCardView.kt */
    public static final class Companion {
        public /* synthetic */ Companion(e eVar) {
            this();
        }

        public final UriAction getUriActionForCard(Card card) {
            i.e(card, "card");
            Bundle bundle = new Bundle();
            for (String str : card.getExtras().keySet()) {
                bundle.putString(str, card.getExtras().get(str));
            }
            String url = card.getUrl();
            if (url != null) {
                return BrazeDeeplinkHandler.Companion.getInstance().createUriActionFromUrlString(url, bundle, card.getOpenUriInWebView(), card.getChannel());
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, new Ia.a<String>() { // from class: com.braze.ui.widget.BaseCardView$Companion$getUriActionForCard$1
                @Override // Ia.a
                public final String invoke() {
                    return "Card URL is null, returning null for getUriActionForCard";
                }
            }, 2, (Object) null);
            return null;
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseCardView(Context context) {
        super(context);
        i.e(context, "context");
        Context applicationContext = context.getApplicationContext();
        i.d(applicationContext, "context.applicationContext");
        this.applicationContext = applicationContext;
        this.classLogTag = BrazeLogger.getBrazeLogTag(getClass());
        BrazeConfigurationProvider configurationProvider = BrazeInternal.INSTANCE.getConfigurationProvider(context);
        this.configurationProvider = configurationProvider;
        this.isUnreadCardVisualIndicatorEnabled = configurationProvider.isNewsfeedVisualIndicatorOn();
    }

    public static final UriAction getUriActionForCard(Card card) {
        return Companion.getUriActionForCard(card);
    }

    public final String getClassLogTag() {
        return this.classLogTag;
    }

    public final void handleCardClick(Context context, final Card card, IAction iAction) {
        i.e(context, "context");
        i.e(card, "card");
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.Priority priority = BrazeLogger.Priority.V;
        BrazeLogger.brazelog$default(brazeLogger, this, priority, (Throwable) null, new Ia.a<String>() { // from class: com.braze.ui.widget.BaseCardView.handleCardClick.1
            {
                super(0);
            }

            @Override // Ia.a
            public final String invoke() {
                return "Handling card click for card: " + card;
            }
        }, 2, (Object) null);
        card.setIndicatorHighlighted(true);
        if (isClickHandled(context, card, iAction)) {
            BrazeLogger.brazelog$default(brazeLogger, this, (BrazeLogger.Priority) null, (Throwable) null, new Ia.a<String>() { // from class: com.braze.ui.widget.BaseCardView.handleCardClick.5
                {
                    super(0);
                }

                @Override // Ia.a
                public final String invoke() {
                    return "Card click was handled by custom listener on card: " + card.getId();
                }
            }, 3, (Object) null);
            card.logClick();
        } else {
            if (iAction == null) {
                BrazeLogger.brazelog$default(brazeLogger, this, priority, (Throwable) null, new Ia.a<String>() { // from class: com.braze.ui.widget.BaseCardView.handleCardClick.4
                    {
                        super(0);
                    }

                    @Override // Ia.a
                    public final String invoke() {
                        return "Card action is null. Not performing any click action on card: " + card.getId();
                    }
                }, 2, (Object) null);
                return;
            }
            card.logClick();
            BrazeLogger.brazelog$default(brazeLogger, this, priority, (Throwable) null, new Ia.a<String>() { // from class: com.braze.ui.widget.BaseCardView.handleCardClick.2
                {
                    super(0);
                }

                @Override // Ia.a
                public final String invoke() {
                    return "Card action is non-null. Attempting to perform action on card: " + card.getId();
                }
            }, 2, (Object) null);
            if (iAction instanceof UriAction) {
                BrazeDeeplinkHandler.Companion.getInstance().gotoUri(context, (UriAction) iAction);
            } else {
                BrazeLogger.brazelog$default(brazeLogger, this, (BrazeLogger.Priority) null, (Throwable) null, new Ia.a<String>() { // from class: com.braze.ui.widget.BaseCardView.handleCardClick.3
                    {
                        super(0);
                    }

                    @Override // Ia.a
                    public final String invoke() {
                        return "Executing non uri action for click on card: " + card.getId();
                    }
                }, 3, (Object) null);
                iAction.execute(context);
            }
        }
    }

    public abstract boolean isClickHandled(Context context, Card card, IAction iAction);

    public final boolean isUnreadIndicatorEnabled() {
        return this.isUnreadCardVisualIndicatorEnabled;
    }

    public final void setCardViewedIndicator(BrazeImageSwitcher brazeImageSwitcher, Card card) {
        i.e(card, "card");
        if (brazeImageSwitcher == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, new Ia.a<String>() { // from class: com.braze.ui.widget.BaseCardView.setCardViewedIndicator.1
                @Override // Ia.a
                public final String invoke() {
                    return "imageSwitcher is null. Can't set card viewed indicator.";
                }
            }, 2, (Object) null);
            return;
        }
        int i10 = R.string.com_braze_image_is_read_tag_key;
        Object tag = brazeImageSwitcher.getTag(i10);
        if (tag == null) {
            tag = "";
        }
        if (card.isIndicatorHighlighted()) {
            if (tag.equals(ICON_READ_TAG)) {
                return;
            }
            if (brazeImageSwitcher.getReadIcon() != null) {
                brazeImageSwitcher.setImageDrawable(brazeImageSwitcher.getReadIcon());
            } else {
                brazeImageSwitcher.setImageResource(R.drawable.com_braze_content_card_icon_read);
            }
            brazeImageSwitcher.setTag(i10, ICON_READ_TAG);
            return;
        }
        if (tag.equals(ICON_UNREAD_TAG)) {
            return;
        }
        if (brazeImageSwitcher.getUnReadIcon() != null) {
            brazeImageSwitcher.setImageDrawable(brazeImageSwitcher.getUnReadIcon());
        } else {
            brazeImageSwitcher.setImageResource(R.drawable.com_braze_content_card_icon_unread);
        }
        brazeImageSwitcher.setTag(i10, ICON_UNREAD_TAG);
    }

    public final void setImageViewToUrl(final ImageView imageView, String imageUrl, final float f10, Card card) {
        i.e(imageView, "imageView");
        i.e(imageUrl, "imageUrl");
        i.e(card, "card");
        int i10 = R.string.com_braze_image_resize_tag_key;
        if (imageUrl.equals(imageView.getTag(i10))) {
            return;
        }
        if (f10 != 0.0f) {
            ViewTreeObserver viewTreeObserver = imageView.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() { // from class: com.braze.ui.widget.BaseCardView.setImageViewToUrl.1
                    @Override // android.view.ViewTreeObserver.OnPreDrawListener
                    public boolean onPreDraw() {
                        imageView.getViewTreeObserver().removeOnPreDrawListener(this);
                        int width = imageView.getWidth();
                        imageView.setLayoutParams(new RelativeLayout.LayoutParams(width, (int) (width / f10)));
                        return true;
                    }
                });
            }
        }
        imageView.setImageResource(android.R.color.transparent);
        Braze.Companion companion = Braze.Companion;
        Context context = getContext();
        i.d(context, "context");
        IBrazeImageLoader imageLoader = companion.getInstance(context).getImageLoader();
        Context context2 = getContext();
        i.d(context2, "context");
        imageLoader.renderUrlIntoCardView(context2, card, imageUrl, imageView, BrazeViewBounds.BASE_CARD_VIEW);
        imageView.setTag(i10, imageUrl);
    }

    public final void setOptionalTextView(TextView view, String str) {
        i.e(view, "view");
        if (str == null || n.S(str)) {
            view.setText("");
            view.setVisibility(8);
        } else {
            view.setText(str);
            view.setVisibility(0);
        }
    }
}
