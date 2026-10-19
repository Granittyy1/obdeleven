package com.braze.ui.contentcards.adapters;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.C1437b;
import androidx.recyclerview.widget.C1451p;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.braze.models.cards.Card;
import com.braze.support.BrazeLogger;
import com.braze.ui.contentcards.handlers.IContentCardsViewBindingHandler;
import com.braze.ui.contentcards.listeners.IContentCardsActionListener;
import com.braze.ui.contentcards.managers.BrazeContentCardsManager;
import com.braze.ui.contentcards.recycler.ItemTouchHelperAdapter;
import com.braze.ui.contentcards.view.ContentCardViewHolder;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.q;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: ContentCardAdapter.kt */
/* JADX INFO: loaded from: classes.dex */
public class ContentCardAdapter extends RecyclerView.Adapter<ContentCardViewHolder> implements ItemTouchHelperAdapter {
    private final List<Card> cardData;
    private final IContentCardsViewBindingHandler contentCardsViewBindingHandler;
    private final Context context;
    private final Handler handler;
    private Set<String> impressedCardIdsInternal;
    private final LinearLayoutManager layoutManager;

    /* JADX INFO: compiled from: ContentCardAdapter.kt */
    public static final class CardListDiffCallback extends C1451p.b {
        private final List<Card> newCards;
        private final List<Card> oldCards;

        /* JADX WARN: Multi-variable type inference failed */
        public CardListDiffCallback(List<? extends Card> oldCards, List<? extends Card> newCards) {
            i.e(oldCards, "oldCards");
            i.e(newCards, "newCards");
            this.oldCards = oldCards;
            this.newCards = newCards;
        }

        private final boolean doItemsShareIds(int i10, int i11) {
            return i.a(this.oldCards.get(i10).getId(), this.newCards.get(i11).getId());
        }

        @Override // androidx.recyclerview.widget.C1451p.b
        public boolean areContentsTheSame(int i10, int i11) {
            return doItemsShareIds(i10, i11);
        }

        @Override // androidx.recyclerview.widget.C1451p.b
        public boolean areItemsTheSame(int i10, int i11) {
            return doItemsShareIds(i10, i11);
        }

        @Override // androidx.recyclerview.widget.C1451p.b
        public int getNewListSize() {
            return this.newCards.size();
        }

        @Override // androidx.recyclerview.widget.C1451p.b
        public int getOldListSize() {
            return this.oldCards.size();
        }
    }

    public ContentCardAdapter(Context context, LinearLayoutManager layoutManager, List<Card> cardData, IContentCardsViewBindingHandler contentCardsViewBindingHandler) {
        i.e(context, "context");
        i.e(layoutManager, "layoutManager");
        i.e(cardData, "cardData");
        i.e(contentCardsViewBindingHandler, "contentCardsViewBindingHandler");
        this.context = context;
        this.layoutManager = layoutManager;
        this.cardData = cardData;
        this.contentCardsViewBindingHandler = contentCardsViewBindingHandler;
        this.handler = new Handler(Looper.getMainLooper());
        this.impressedCardIdsInternal = new LinkedHashSet();
        setHasStableIds(true);
    }

    private final boolean isInvalidIndex(int i10) {
        return i10 < 0 || i10 >= this.cardData.size();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void markOnScreenCardsAsRead$lambda$1(int i10, int i11, ContentCardAdapter this$0) {
        i.e(this$0, "this$0");
        this$0.notifyItemRangeChanged(i11, (i10 - i11) + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewDetachedFromWindow$lambda$0(ContentCardAdapter this$0, int i10) {
        i.e(this$0, "this$0");
        this$0.notifyItemChanged(i10);
    }

    public final Card getCardAtIndex(final int i10) {
        if (!isInvalidIndex(i10)) {
            return this.cardData.get(i10);
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new Ia.a<String>() { // from class: com.braze.ui.contentcards.adapters.ContentCardAdapter.getCardAtIndex.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // Ia.a
            public final String invoke() {
                return "Cannot return card at index: " + i10 + " in cards list of size: " + this.cardData.size();
            }
        }, 3, (Object) null);
        return null;
    }

    public final List<String> getImpressedCardIds() {
        return q.o0(this.impressedCardIdsInternal);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.cardData.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i10) {
        String id;
        Card cardAtIndex = getCardAtIndex(i10);
        if (cardAtIndex == null || (id = cardAtIndex.getId()) == null) {
            return 0L;
        }
        return id.hashCode();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i10) {
        return this.contentCardsViewBindingHandler.getItemViewType(this.context, this.cardData, i10);
    }

    public final boolean isAdapterPositionOnScreen(int i10) {
        int iQ0 = this.layoutManager.Q0();
        LinearLayoutManager linearLayoutManager = this.layoutManager;
        View viewT0 = linearLayoutManager.T0(0, linearLayoutManager.x(), true, false);
        int iMin = Math.min(iQ0, viewT0 == null ? -1 : RecyclerView.l.L(viewT0));
        int iR0 = this.layoutManager.R0();
        LinearLayoutManager linearLayoutManager2 = this.layoutManager;
        View viewT1 = linearLayoutManager2.T0(linearLayoutManager2.x() - 1, -1, true, false);
        return iMin <= i10 && i10 <= Math.max(iR0, viewT1 != null ? RecyclerView.l.L(viewT1) : -1);
    }

    public final boolean isControlCardAtPosition(int i10) {
        Card cardAtIndex = getCardAtIndex(i10);
        return cardAtIndex != null && cardAtIndex.isControl();
    }

    @Override // com.braze.ui.contentcards.recycler.ItemTouchHelperAdapter
    public boolean isItemDismissable(int i10) {
        if (this.cardData.isEmpty() || isInvalidIndex(i10)) {
            return false;
        }
        return this.cardData.get(i10).isDismissibleByUser();
    }

    public final void logImpression(final Card card) {
        if (card == null) {
            return;
        }
        if (this.impressedCardIdsInternal.contains(card.getId())) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, new Ia.a<String>() { // from class: com.braze.ui.contentcards.adapters.ContentCardAdapter.logImpression.2
                {
                    super(0);
                }

                @Override // Ia.a
                public final String invoke() {
                    return "Already counted impression for card " + card.getId();
                }
            }, 2, (Object) null);
        } else {
            card.logImpression();
            this.impressedCardIdsInternal.add(card.getId());
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, new Ia.a<String>() { // from class: com.braze.ui.contentcards.adapters.ContentCardAdapter.logImpression.1
                {
                    super(0);
                }

                @Override // Ia.a
                public final String invoke() {
                    return "Logged impression for card " + card.getId();
                }
            }, 2, (Object) null);
        }
        if (card.getViewed()) {
            return;
        }
        card.setViewed(true);
    }

    public final void markOnScreenCardsAsRead() {
        if (this.cardData.isEmpty()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new Ia.a<String>() { // from class: com.braze.ui.contentcards.adapters.ContentCardAdapter.markOnScreenCardsAsRead.1
                @Override // Ia.a
                public final String invoke() {
                    return "Card list is empty. Not marking on-screen cards as read.";
                }
            }, 3, (Object) null);
            return;
        }
        final int iQ0 = this.layoutManager.Q0();
        final int iR0 = this.layoutManager.R0();
        if (iQ0 < 0 || iR0 < 0) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new Ia.a<String>() { // from class: com.braze.ui.contentcards.adapters.ContentCardAdapter.markOnScreenCardsAsRead.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // Ia.a
                public final String invoke() {
                    return "Not marking all on-screen cards as read. Either the first or last index is negative. First visible: " + iQ0 + " . Last visible: " + iR0;
                }
            }, 3, (Object) null);
            return;
        }
        if (iQ0 <= iR0) {
            int i10 = iQ0;
            while (true) {
                Card cardAtIndex = getCardAtIndex(i10);
                if (cardAtIndex != null) {
                    cardAtIndex.setIndicatorHighlighted(true);
                }
                if (i10 == iR0) {
                    break;
                } else {
                    i10++;
                }
            }
        }
        this.handler.post(new Runnable() { // from class: com.braze.ui.contentcards.adapters.a
            @Override // java.lang.Runnable
            public final void run() {
                ContentCardAdapter.markOnScreenCardsAsRead$lambda$1(iR0, iQ0, this);
            }
        });
    }

    @Override // com.braze.ui.contentcards.recycler.ItemTouchHelperAdapter
    public void onItemDismiss(final int i10) {
        if (isInvalidIndex(i10)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new Ia.a<String>() { // from class: com.braze.ui.contentcards.adapters.ContentCardAdapter.onItemDismiss.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // Ia.a
                public final String invoke() {
                    return "Cannot dismiss card at index: " + i10 + " in cards list of size: " + this.cardData.size();
                }
            }, 3, (Object) null);
            return;
        }
        Card cardRemove = this.cardData.remove(i10);
        cardRemove.setDismissed(true);
        notifyItemRemoved(i10);
        IContentCardsActionListener contentCardsActionListener = BrazeContentCardsManager.Companion.getInstance().getContentCardsActionListener();
        if (contentCardsActionListener != null) {
            contentCardsActionListener.onContentCardDismissed(this.context, cardRemove);
        }
    }

    public final synchronized void replaceCards(List<? extends Card> newCardData) {
        i.e(newCardData, "newCardData");
        C1451p.d dVarA = C1451p.a(new CardListDiffCallback(this.cardData, newCardData));
        this.cardData.clear();
        this.cardData.addAll(newCardData);
        dVarA.a(new C1437b(this));
    }

    public final void setImpressedCardIds(List<String> impressedCardIds) {
        i.e(impressedCardIds, "impressedCardIds");
        this.impressedCardIdsInternal = q.r0(impressedCardIds);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(ContentCardViewHolder viewHolder, int i10) {
        i.e(viewHolder, "viewHolder");
        this.contentCardsViewBindingHandler.onBindViewHolder(this.context, this.cardData, viewHolder, i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public ContentCardViewHolder onCreateViewHolder(ViewGroup viewGroup, int i10) {
        i.e(viewGroup, "viewGroup");
        return this.contentCardsViewBindingHandler.onCreateViewHolder(this.context, this.cardData, viewGroup, i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewAttachedToWindow(ContentCardViewHolder holder) {
        i.e(holder, "holder");
        super.onViewAttachedToWindow(holder);
        if (this.cardData.isEmpty()) {
            return;
        }
        final int bindingAdapterPosition = holder.getBindingAdapterPosition();
        if (bindingAdapterPosition == -1 || !isAdapterPositionOnScreen(bindingAdapterPosition)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, new Ia.a<String>() { // from class: com.braze.ui.contentcards.adapters.ContentCardAdapter.onViewAttachedToWindow.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // Ia.a
                public final String invoke() {
                    return p005a4.q.c(new StringBuilder("The card at position "), bindingAdapterPosition, " isn't on screen or does not have a valid adapter position. Not logging impression.");
                }
            }, 2, (Object) null);
        } else {
            logImpression(getCardAtIndex(bindingAdapterPosition));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewDetachedFromWindow(ContentCardViewHolder holder) {
        i.e(holder, "holder");
        super.onViewDetachedFromWindow(holder);
        if (this.cardData.isEmpty()) {
            return;
        }
        final int bindingAdapterPosition = holder.getBindingAdapterPosition();
        if (bindingAdapterPosition == -1 || !isAdapterPositionOnScreen(bindingAdapterPosition)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, new Ia.a<String>() { // from class: com.braze.ui.contentcards.adapters.ContentCardAdapter.onViewDetachedFromWindow.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // Ia.a
                public final String invoke() {
                    return p005a4.q.c(new StringBuilder("The card at position "), bindingAdapterPosition, " isn't on screen or does not have a valid adapter position. Not marking as read.");
                }
            }, 2, (Object) null);
            return;
        }
        Card cardAtIndex = getCardAtIndex(bindingAdapterPosition);
        if (cardAtIndex == null || cardAtIndex.isIndicatorHighlighted()) {
            return;
        }
        cardAtIndex.setIndicatorHighlighted(true);
        this.handler.post(new Runnable() { // from class: com.braze.ui.contentcards.adapters.b
            @Override // java.lang.Runnable
            public final void run() {
                ContentCardAdapter.onViewDetachedFromWindow$lambda$0(this.f24407b, bindingAdapterPosition);
            }
        });
    }
}
