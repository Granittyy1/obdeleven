package io.intercom.android.sdk.models;

import I7.b;
import Q8.d;
import java.util.List;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: AvatarDetails.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class AvatarDetails {
    public static final int $stable = 8;

    @b("avatar_type")
    private final AvatarType avatarType;

    @b("avatars")
    private final List<Avatar.Builder> avatars;

    public AvatarDetails(AvatarType avatarType, List<Avatar.Builder> avatars) {
        i.e(avatarType, "avatarType");
        i.e(avatars, "avatars");
        this.avatarType = avatarType;
        this.avatars = avatars;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AvatarDetails copy$default(AvatarDetails avatarDetails, AvatarType avatarType, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            avatarType = avatarDetails.avatarType;
        }
        if ((i10 & 2) != 0) {
            list = avatarDetails.avatars;
        }
        return avatarDetails.copy(avatarType, list);
    }

    public final AvatarType component1() {
        return this.avatarType;
    }

    public final List<Avatar.Builder> component2() {
        return this.avatars;
    }

    public final AvatarDetails copy(AvatarType avatarType, List<Avatar.Builder> avatars) {
        i.e(avatarType, "avatarType");
        i.e(avatars, "avatars");
        return new AvatarDetails(avatarType, avatars);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AvatarDetails)) {
            return false;
        }
        AvatarDetails avatarDetails = (AvatarDetails) obj;
        return this.avatarType == avatarDetails.avatarType && i.a(this.avatars, avatarDetails.avatars);
    }

    public final AvatarType getAvatarType() {
        return this.avatarType;
    }

    public final List<Avatar.Builder> getAvatars() {
        return this.avatars;
    }

    public int hashCode() {
        return this.avatars.hashCode() + (this.avatarType.hashCode() * 31);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("AvatarDetails(avatarType=");
        sb2.append(this.avatarType);
        sb2.append(", avatars=");
        return d.b(sb2, this.avatars, ')');
    }
}
