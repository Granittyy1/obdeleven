package io.intercom.android.sdk.m5.conversation.states;

/* JADX INFO: compiled from: NetworkState.kt */
/* JADX INFO: loaded from: classes3.dex */
public interface NetworkState {

    /* JADX INFO: compiled from: NetworkState.kt */
    public static final class Connected implements NetworkState {
        public static final int $stable = 0;
        public static final Connected INSTANCE = new Connected();

        private Connected() {
        }
    }

    /* JADX INFO: compiled from: NetworkState.kt */
    public static final class Disconnected implements NetworkState {
        public static final int $stable = 0;
        public static final Disconnected INSTANCE = new Disconnected();

        private Disconnected() {
        }
    }

    /* JADX INFO: compiled from: NetworkState.kt */
    public static final class Reconnected implements NetworkState {
        public static final int $stable = 0;
        public static final Reconnected INSTANCE = new Reconnected();

        private Reconnected() {
        }
    }
}
