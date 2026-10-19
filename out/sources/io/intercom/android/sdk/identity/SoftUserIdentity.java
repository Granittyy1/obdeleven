package io.intercom.android.sdk.identity;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes3.dex */
abstract class SoftUserIdentity {
    static final SoftUserIdentity NONE = create("", "", "", "", "", "", "", "");

    public static SoftUserIdentity create(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        return new AutoValue_SoftUserIdentity(str, str2, str3, str4, str5, str6, str7, str8);
    }

    public abstract String anonymousId();

    public abstract String email();

    public abstract String encryptedUserId();

    public abstract String fingerprint();

    public abstract String hmac();

    public abstract String intercomId();

    public boolean isPresent() {
        return !equals(NONE);
    }

    public boolean isSameUser(Registration registration) {
        String userId = registration.getUserId();
        String email = registration.getEmail();
        boolean z10 = (TextUtils.isEmpty(userId) && TextUtils.isEmpty(email)) ? false : true;
        if (!TextUtils.isEmpty(userId)) {
            z10 = z10 && userId.equals(userId());
        }
        if (TextUtils.isEmpty(email)) {
            return z10;
        }
        return z10 && email.equals(email());
    }

    public abstract String jwt();

    public abstract String userId();
}
