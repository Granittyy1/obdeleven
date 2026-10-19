package io.intercom.android.sdk.models;

import Q8.d;
import io.intercom.android.sdk.m5.components.avatar.AvatarShape;

/* JADX INFO: loaded from: classes3.dex */
final class AutoValue_Avatar extends Avatar {
    private final String imageDarkUrl;
    private final String imageUrl;
    private final String initials;
    private final String label;
    private final AvatarShape shape;

    public AutoValue_Avatar(String str, String str2, AvatarShape avatarShape, String str3, String str4) {
        if (str == null) {
            throw new NullPointerException("Null imageUrl");
        }
        this.imageUrl = str;
        if (str2 == null) {
            throw new NullPointerException("Null initials");
        }
        this.initials = str2;
        if (avatarShape == null) {
            throw new NullPointerException("Null shape");
        }
        this.shape = avatarShape;
        if (str3 == null) {
            throw new NullPointerException("Null label");
        }
        this.label = str3;
        if (str4 == null) {
            throw new NullPointerException("Null imageDarkUrl");
        }
        this.imageDarkUrl = str4;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Avatar)) {
            return false;
        }
        Avatar avatar = (Avatar) obj;
        return this.imageUrl.equals(avatar.getImageUrl()) && this.initials.equals(avatar.getInitials()) && this.shape.equals(avatar.getShape()) && this.label.equals(avatar.getLabel()) && this.imageDarkUrl.equals(avatar.getImageDarkUrl());
    }

    @Override // io.intercom.android.sdk.models.Avatar
    public String getImageDarkUrl() {
        return this.imageDarkUrl;
    }

    @Override // io.intercom.android.sdk.models.Avatar
    public String getImageUrl() {
        return this.imageUrl;
    }

    @Override // io.intercom.android.sdk.models.Avatar
    public String getInitials() {
        return this.initials;
    }

    @Override // io.intercom.android.sdk.models.Avatar
    public String getLabel() {
        return this.label;
    }

    @Override // io.intercom.android.sdk.models.Avatar
    public AvatarShape getShape() {
        return this.shape;
    }

    public int hashCode() {
        return ((((((((this.imageUrl.hashCode() ^ 1000003) * 1000003) ^ this.initials.hashCode()) * 1000003) ^ this.shape.hashCode()) * 1000003) ^ this.label.hashCode()) * 1000003) ^ this.imageDarkUrl.hashCode();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Avatar{imageUrl=");
        sb2.append(this.imageUrl);
        sb2.append(", initials=");
        sb2.append(this.initials);
        sb2.append(", shape=");
        sb2.append(this.shape);
        sb2.append(", label=");
        sb2.append(this.label);
        sb2.append(", imageDarkUrl=");
        return d.a(sb2, this.imageDarkUrl, "}");
    }
}
