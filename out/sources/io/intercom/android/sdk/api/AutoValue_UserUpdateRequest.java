package io.intercom.android.sdk.api;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class AutoValue_UserUpdateRequest extends UserUpdateRequest {
    private final Map<String, Object> attributes;
    private final boolean internalUpdate;
    private final boolean newSession;
    private final boolean sentFromBackground;

    public AutoValue_UserUpdateRequest(boolean z10, boolean z11, boolean z12, Map<String, Object> map) {
        this.newSession = z10;
        this.sentFromBackground = z11;
        this.internalUpdate = z12;
        if (map == null) {
            throw new NullPointerException("Null attributes");
        }
        this.attributes = map;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UserUpdateRequest)) {
            return false;
        }
        UserUpdateRequest userUpdateRequest = (UserUpdateRequest) obj;
        return this.newSession == userUpdateRequest.isNewSession() && this.sentFromBackground == userUpdateRequest.isSentFromBackground() && this.internalUpdate == userUpdateRequest.isInternalUpdate() && this.attributes.equals(userUpdateRequest.getAttributes());
    }

    @Override // io.intercom.android.sdk.api.UserUpdateRequest
    public Map<String, Object> getAttributes() {
        return this.attributes;
    }

    public int hashCode() {
        return (((((((this.newSession ? 1231 : 1237) ^ 1000003) * 1000003) ^ (this.sentFromBackground ? 1231 : 1237)) * 1000003) ^ (this.internalUpdate ? 1231 : 1237)) * 1000003) ^ this.attributes.hashCode();
    }

    @Override // io.intercom.android.sdk.api.UserUpdateRequest
    public boolean isInternalUpdate() {
        return this.internalUpdate;
    }

    @Override // io.intercom.android.sdk.api.UserUpdateRequest
    public boolean isNewSession() {
        return this.newSession;
    }

    @Override // io.intercom.android.sdk.api.UserUpdateRequest
    public boolean isSentFromBackground() {
        return this.sentFromBackground;
    }

    public String toString() {
        return "UserUpdateRequest{newSession=" + this.newSession + ", sentFromBackground=" + this.sentFromBackground + ", internalUpdate=" + this.internalUpdate + ", attributes=" + this.attributes + "}";
    }
}
