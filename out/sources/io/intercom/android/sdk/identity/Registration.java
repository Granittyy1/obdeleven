package io.intercom.android.sdk.identity;

import B1.a;
import android.text.TextUtils;
import com.intercom.twig.Twig;
import io.intercom.android.sdk.UserAttributes;
import io.intercom.android.sdk.logger.LumberMill;

/* JADX INFO: loaded from: classes3.dex */
public class Registration {
    private UserAttributes attributes;
    private final Twig twig = LumberMill.getLogger();
    private String email = "";
    private String userId = "";
    private Validity validity = Validity.NOT_SET;

    public enum Validity {
        NOT_SET,
        INVALID,
        VALID
    }

    public static Registration create() {
        return new Registration();
    }

    private void updateState(boolean z10) {
        Validity validity = this.validity;
        if (validity == Validity.NOT_SET || validity == Validity.VALID) {
            this.validity = z10 ? Validity.VALID : Validity.INVALID;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Registration registration = (Registration) obj;
        if (!this.email.equals(registration.email) || !this.userId.equals(registration.userId)) {
            return false;
        }
        UserAttributes userAttributes = this.attributes;
        UserAttributes userAttributes2 = registration.attributes;
        if (userAttributes != null) {
            return userAttributes.equals(userAttributes2);
        }
        return userAttributes2 == null;
    }

    public UserAttributes getAttributes() {
        return this.attributes;
    }

    public String getEmail() {
        return this.email;
    }

    public String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        int iB = a.b(this.userId, this.email.hashCode() * 31, 31);
        UserAttributes userAttributes = this.attributes;
        return iB + (userAttributes != null ? userAttributes.hashCode() : 0);
    }

    public boolean isValidRegistration() {
        return Validity.VALID.equals(this.validity);
    }

    public String toString() {
        return "Registration{email='" + this.email + "', userId='" + this.userId + "', attributes=" + this.attributes + '}';
    }

    public Registration withEmail(String str) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        boolean z10 = !zIsEmpty;
        if (zIsEmpty) {
            this.twig.e("Email cannot be null or empty", new Object[0]);
        } else {
            this.email = str;
        }
        updateState(z10);
        return this;
    }

    public Registration withUserAttributes(UserAttributes userAttributes) {
        if (userAttributes == null) {
            this.validity = Validity.INVALID;
            this.twig.e("Registration.withUserAttributes method failed: the attributes Map provided is null", new Object[0]);
        } else if (userAttributes.isEmpty()) {
            this.validity = Validity.INVALID;
            this.twig.e("Registration.withUserAttributes method failed: the attributes Map provided is empty", new Object[0]);
        } else {
            this.attributes = userAttributes;
        }
        return this;
    }

    public Registration withUserId(String str) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        boolean z10 = !zIsEmpty;
        if (zIsEmpty) {
            this.twig.e("UserId cannot be null or empty", new Object[0]);
        } else {
            this.userId = str;
        }
        updateState(z10);
        return this;
    }
}
