package io.intercom.android.sdk.m5.home.states;

import A1.C0575j;

/* JADX INFO: compiled from: HomeItemBadge.kt */
/* JADX INFO: loaded from: classes3.dex */
public interface HomeItemBadge {

    /* JADX INFO: compiled from: HomeItemBadge.kt */
    public static final class IconWithIndicator implements HomeItemBadge {
        public static final int $stable = 0;
        public static final IconWithIndicator INSTANCE = new IconWithIndicator();

        private IconWithIndicator() {
        }
    }

    /* JADX INFO: compiled from: HomeItemBadge.kt */
    public static final class IndicatorWithCount implements HomeItemBadge {
        public static final int $stable = 0;
        private final int count;

        public IndicatorWithCount(int i10) {
            this.count = i10;
        }

        public static /* synthetic */ IndicatorWithCount copy$default(IndicatorWithCount indicatorWithCount, int i10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i10 = indicatorWithCount.count;
            }
            return indicatorWithCount.copy(i10);
        }

        public final int component1() {
            return this.count;
        }

        public final IndicatorWithCount copy(int i10) {
            return new IndicatorWithCount(i10);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof IndicatorWithCount) && this.count == ((IndicatorWithCount) obj).count;
        }

        public final int getCount() {
            return this.count;
        }

        public int hashCode() {
            return Integer.hashCode(this.count);
        }

        public String toString() {
            return C0575j.b(new StringBuilder("IndicatorWithCount(count="), this.count, ')');
        }
    }

    /* JADX INFO: compiled from: HomeItemBadge.kt */
    public static final class None implements HomeItemBadge {
        public static final int $stable = 0;
        public static final None INSTANCE = new None();

        private None() {
        }
    }
}
