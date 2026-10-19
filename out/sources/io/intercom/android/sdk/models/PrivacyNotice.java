package io.intercom.android.sdk.models;

import I7.b;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: OpenMessengerResponse.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class PrivacyNotice {
    public static final int $stable = 0;

    @b("is_dismissed")
    private final boolean isDismissed;

    @b("paragraph")
    private final String text;

    public PrivacyNotice(boolean z10, String text) {
        i.e(text, "text");
        this.isDismissed = z10;
        this.text = text;
    }

    public static /* synthetic */ PrivacyNotice copy$default(PrivacyNotice privacyNotice, boolean z10, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = privacyNotice.isDismissed;
        }
        if ((i10 & 2) != 0) {
            str = privacyNotice.text;
        }
        return privacyNotice.copy(z10, str);
    }

    public final boolean component1() {
        return this.isDismissed;
    }

    public final String component2() {
        return this.text;
    }

    public final PrivacyNotice copy(boolean z10, String text) {
        i.e(text, "text");
        return new PrivacyNotice(z10, text);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PrivacyNotice)) {
            return false;
        }
        PrivacyNotice privacyNotice = (PrivacyNotice) obj;
        return this.isDismissed == privacyNotice.isDismissed && i.a(this.text, privacyNotice.text);
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        return this.text.hashCode() + (Boolean.hashCode(this.isDismissed) * 31);
    }

    public final boolean isDismissed() {
        return this.isDismissed;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("PrivacyNotice(isDismissed=");
        sb2.append(this.isDismissed);
        sb2.append(", text=");
        return B7.b.g(sb2, this.text, ')');
    }
}
