package com.braze.events;

import com.braze.models.cards.Card;
import com.braze.support.DateTimeUtils;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.collections.EmptyList;
import kotlin.collections.l;
import kotlin.collections.q;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;
import p293xa.d;

/* JADX INFO: loaded from: classes.dex */
public final class ContentCardsUpdatedEvent {
    public static final Companion Companion = new Companion(null);
    private final List<Card> contentCards;
    private final boolean isFromOfflineStorage;
    private final long timestampSeconds;
    private final String userId;

    public static final class Companion {
        public /* synthetic */ Companion(e eVar) {
            this();
        }

        public final ContentCardsUpdatedEvent getEmptyUpdate() {
            return new ContentCardsUpdatedEvent(EmptyList.f42983b, null, DateTimeUtils.nowInSeconds(), true);
        }

        private Companion() {
        }

        public static /* synthetic */ void getEmptyUpdate$annotations() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ContentCardsUpdatedEvent(List<? extends Card> contentCards, String str, long j, boolean z10) {
        i.e(contentCards, "contentCards");
        this.contentCards = contentCards;
        this.userId = str;
        this.timestampSeconds = j;
        this.isFromOfflineStorage = z10;
    }

    public static final ContentCardsUpdatedEvent getEmptyUpdate() {
        return Companion.getEmptyUpdate();
    }

    public final List<Card> getAllCards() {
        return q.p0(this.contentCards);
    }

    public final int getCardCount() {
        return this.contentCards.size();
    }

    @d
    public final long getLastUpdatedInSecondsFromEpoch() {
        return this.timestampSeconds;
    }

    public final long getTimestampSeconds() {
        return this.timestampSeconds;
    }

    public final int getUnviewedCardCount() {
        List<Card> list = this.contentCards;
        int i10 = 0;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (Card card : list) {
                if (!card.getViewed() && !card.isControl() && (i10 = i10 + 1) < 0) {
                    l.w();
                    throw null;
                }
            }
        }
        return i10;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final boolean isEmpty() {
        return this.contentCards.isEmpty();
    }

    public final boolean isFromOfflineStorage() {
        return this.isFromOfflineStorage;
    }

    public final boolean isTimestampOlderThan(long j) {
        return TimeUnit.SECONDS.toMillis(this.timestampSeconds + j) < System.currentTimeMillis();
    }

    public String toString() {
        return "ContentCardsUpdatedEvent{userId='" + this.userId + "', timestampSeconds=" + this.timestampSeconds + ", isFromOfflineStorage=" + this.isFromOfflineStorage + ", card count=" + getCardCount() + '}';
    }
}
