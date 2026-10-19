package io.intercom.android.sdk.ui.component;

/* JADX INFO: compiled from: MediaPickerButton.kt */
/* JADX INFO: loaded from: classes.dex */
public interface MediaPickerButtonCTAStyle {

    /* JADX INFO: compiled from: MediaPickerButton.kt */
    public static final class None implements MediaPickerButtonCTAStyle {
        public static final int $stable = 0;
        public static final None INSTANCE = new None();

        private None() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof None);
        }

        public int hashCode() {
            return 1542232760;
        }

        public String toString() {
            return "None";
        }
    }

    /* JADX INFO: compiled from: MediaPickerButton.kt */
    public static final class TextButton implements MediaPickerButtonCTAStyle {
        public static final int $stable = 0;
        private final String ctaText;

        public TextButton(String ctaText) {
            kotlin.jvm.internal.i.e(ctaText, "ctaText");
            this.ctaText = ctaText;
        }

        public static /* synthetic */ TextButton copy$default(TextButton textButton, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = textButton.ctaText;
            }
            return textButton.copy(str);
        }

        public final String component1() {
            return this.ctaText;
        }

        public final TextButton copy(String ctaText) {
            kotlin.jvm.internal.i.e(ctaText, "ctaText");
            return new TextButton(ctaText);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TextButton) && kotlin.jvm.internal.i.a(this.ctaText, ((TextButton) obj).ctaText);
        }

        public final String getCtaText() {
            return this.ctaText;
        }

        public int hashCode() {
            return this.ctaText.hashCode();
        }

        public String toString() {
            return B7.b.g(new StringBuilder("TextButton(ctaText="), this.ctaText, ')');
        }
    }

    /* JADX INFO: compiled from: MediaPickerButton.kt */
    public static final class TopBarButton implements MediaPickerButtonCTAStyle {
        public static final int $stable = 0;
        public static final TopBarButton INSTANCE = new TopBarButton();

        private TopBarButton() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof TopBarButton);
        }

        public int hashCode() {
            return -1620873520;
        }

        public String toString() {
            return "TopBarButton";
        }
    }
}
