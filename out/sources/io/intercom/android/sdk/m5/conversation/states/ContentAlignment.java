package io.intercom.android.sdk.m5.conversation.states;

/* JADX INFO: compiled from: ConversationUiState.kt */
/* JADX INFO: loaded from: classes3.dex */
public interface ContentAlignment {

    /* JADX INFO: compiled from: ConversationUiState.kt */
    public static final class Center implements ContentAlignment {
        public static final int $stable = 0;
        public static final Center INSTANCE = new Center();

        private Center() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Center);
        }

        public int hashCode() {
            return 2101579366;
        }

        public String toString() {
            return "Center";
        }
    }

    /* JADX INFO: compiled from: ConversationUiState.kt */
    public static final class Start implements ContentAlignment {
        public static final int $stable = 0;
        public static final Start INSTANCE = new Start();

        private Start() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Start);
        }

        public int hashCode() {
            return 1052834865;
        }

        public String toString() {
            return "Start";
        }
    }
}
