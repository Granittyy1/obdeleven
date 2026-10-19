package io.intercom.android.sdk.models;

/* JADX INFO: loaded from: classes3.dex */
public abstract class BaseResponse {
    private final Config config;
    private final boolean hasConversations;
    private final User user;

    public static abstract class Builder {
        Config config;
        boolean has_conversations;
        User.Builder user;

        public abstract BaseResponse build();
    }

    public BaseResponse(Builder builder) {
        Config config = builder.config;
        this.config = config == null ? new Config() : config;
        this.hasConversations = builder.has_conversations;
        User.Builder builder2 = builder.user;
        this.user = builder2 == null ? User.NULL : builder2.build();
    }

    public Config getConfig() {
        return this.config;
    }

    public User getUser() {
        return this.user;
    }

    public boolean hasConversations() {
        return this.hasConversations;
    }
}
