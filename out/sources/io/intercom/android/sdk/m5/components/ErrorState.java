package io.intercom.android.sdk.m5.components;

import io.intercom.android.sdk.R;

/* JADX INFO: compiled from: IntercomErrorScreen.kt */
/* JADX INFO: loaded from: classes3.dex */
public abstract class ErrorState {
    public static final int $stable = 0;

    /* JADX INFO: compiled from: IntercomErrorScreen.kt */
    public static final class WithoutCTA extends ErrorState {
        public static final int $stable = 0;
        private final Integer additionalMessageResId;
        private final int iconId;
        private final int messageResId;

        public WithoutCTA() {
            this(0, 0, null, 7, null);
        }

        public static /* synthetic */ WithoutCTA copy$default(WithoutCTA withoutCTA, int i10, int i11, Integer num, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i10 = withoutCTA.iconId;
            }
            if ((i12 & 2) != 0) {
                i11 = withoutCTA.messageResId;
            }
            if ((i12 & 4) != 0) {
                num = withoutCTA.additionalMessageResId;
            }
            return withoutCTA.copy(i10, i11, num);
        }

        public final int component1() {
            return this.iconId;
        }

        public final int component2() {
            return this.messageResId;
        }

        public final Integer component3() {
            return this.additionalMessageResId;
        }

        public final WithoutCTA copy(int i10, int i11, Integer num) {
            return new WithoutCTA(i10, i11, num);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof WithoutCTA)) {
                return false;
            }
            WithoutCTA withoutCTA = (WithoutCTA) obj;
            return this.iconId == withoutCTA.iconId && this.messageResId == withoutCTA.messageResId && kotlin.jvm.internal.i.a(this.additionalMessageResId, withoutCTA.additionalMessageResId);
        }

        @Override // io.intercom.android.sdk.m5.components.ErrorState
        public Integer getAdditionalMessageResId() {
            return this.additionalMessageResId;
        }

        @Override // io.intercom.android.sdk.m5.components.ErrorState
        public int getIconId() {
            return this.iconId;
        }

        @Override // io.intercom.android.sdk.m5.components.ErrorState
        public int getMessageResId() {
            return this.messageResId;
        }

        public int hashCode() {
            int iB = p005a4.q.b(this.messageResId, Integer.hashCode(this.iconId) * 31, 31);
            Integer num = this.additionalMessageResId;
            return iB + (num == null ? 0 : num.hashCode());
        }

        public String toString() {
            return "WithoutCTA(iconId=" + this.iconId + ", messageResId=" + this.messageResId + ", additionalMessageResId=" + this.additionalMessageResId + ')';
        }

        public /* synthetic */ WithoutCTA(int i10, int i11, Integer num, int i12, kotlin.jvm.internal.e eVar) {
            this((i12 & 1) != 0 ? R.drawable.intercom_ic_warning : i10, (i12 & 2) != 0 ? R.string.intercom_spaces_error_title : i11, (i12 & 4) != 0 ? Integer.valueOf(R.string.intercom_spaces_error_description) : num);
        }

        public WithoutCTA(int i10, int i11, Integer num) {
            super(null);
            this.iconId = i10;
            this.messageResId = i11;
            this.additionalMessageResId = num;
        }
    }

    public /* synthetic */ ErrorState(kotlin.jvm.internal.e eVar) {
        this();
    }

    public abstract Integer getAdditionalMessageResId();

    public abstract int getIconId();

    public abstract int getMessageResId();

    private ErrorState() {
    }

    /* JADX INFO: compiled from: IntercomErrorScreen.kt */
    public static final class WithCTA extends ErrorState {
        public static final int $stable = 0;
        private final Integer additionalMessageResId;
        private final int ctaResId;
        private final int iconId;
        private final int messageResId;
        private final Ia.a<p293xa.r> onCtaClick;

        public /* synthetic */ WithCTA(int i10, int i11, Integer num, int i12, Ia.a aVar, int i13, kotlin.jvm.internal.e eVar) {
            this((i13 & 1) != 0 ? R.drawable.intercom_ic_warning : i10, (i13 & 2) != 0 ? R.string.intercom_spaces_error_title : i11, (i13 & 4) != 0 ? Integer.valueOf(R.string.intercom_spaces_error_description) : num, (i13 & 8) != 0 ? R.string.intercom_reload : i12, aVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ WithCTA copy$default(WithCTA withCTA, int i10, int i11, Integer num, int i12, Ia.a aVar, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                i10 = withCTA.iconId;
            }
            if ((i13 & 2) != 0) {
                i11 = withCTA.messageResId;
            }
            int i14 = i11;
            if ((i13 & 4) != 0) {
                num = withCTA.additionalMessageResId;
            }
            Integer num2 = num;
            if ((i13 & 8) != 0) {
                i12 = withCTA.ctaResId;
            }
            int i15 = i12;
            if ((i13 & 16) != 0) {
                aVar = withCTA.onCtaClick;
            }
            return withCTA.copy(i10, i14, num2, i15, aVar);
        }

        public final int component1() {
            return this.iconId;
        }

        public final int component2() {
            return this.messageResId;
        }

        public final Integer component3() {
            return this.additionalMessageResId;
        }

        public final int component4() {
            return this.ctaResId;
        }

        public final Ia.a<p293xa.r> component5() {
            return this.onCtaClick;
        }

        public final WithCTA copy(int i10, int i11, Integer num, int i12, Ia.a<p293xa.r> onCtaClick) {
            kotlin.jvm.internal.i.e(onCtaClick, "onCtaClick");
            return new WithCTA(i10, i11, num, i12, onCtaClick);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof WithCTA)) {
                return false;
            }
            WithCTA withCTA = (WithCTA) obj;
            return this.iconId == withCTA.iconId && this.messageResId == withCTA.messageResId && kotlin.jvm.internal.i.a(this.additionalMessageResId, withCTA.additionalMessageResId) && this.ctaResId == withCTA.ctaResId && kotlin.jvm.internal.i.a(this.onCtaClick, withCTA.onCtaClick);
        }

        @Override // io.intercom.android.sdk.m5.components.ErrorState
        public Integer getAdditionalMessageResId() {
            return this.additionalMessageResId;
        }

        public final int getCtaResId() {
            return this.ctaResId;
        }

        @Override // io.intercom.android.sdk.m5.components.ErrorState
        public int getIconId() {
            return this.iconId;
        }

        @Override // io.intercom.android.sdk.m5.components.ErrorState
        public int getMessageResId() {
            return this.messageResId;
        }

        public final Ia.a<p293xa.r> getOnCtaClick() {
            return this.onCtaClick;
        }

        public int hashCode() {
            int iB = p005a4.q.b(this.messageResId, Integer.hashCode(this.iconId) * 31, 31);
            Integer num = this.additionalMessageResId;
            return this.onCtaClick.hashCode() + p005a4.q.b(this.ctaResId, (iB + (num == null ? 0 : num.hashCode())) * 31, 31);
        }

        public String toString() {
            return "WithCTA(iconId=" + this.iconId + ", messageResId=" + this.messageResId + ", additionalMessageResId=" + this.additionalMessageResId + ", ctaResId=" + this.ctaResId + ", onCtaClick=" + this.onCtaClick + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public WithCTA(int i10, int i11, Integer num, int i12, Ia.a<p293xa.r> onCtaClick) {
            super(null);
            kotlin.jvm.internal.i.e(onCtaClick, "onCtaClick");
            this.iconId = i10;
            this.messageResId = i11;
            this.additionalMessageResId = num;
            this.ctaResId = i12;
            this.onCtaClick = onCtaClick;
        }
    }
}
