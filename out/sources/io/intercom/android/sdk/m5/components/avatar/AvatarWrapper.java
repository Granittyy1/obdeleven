package io.intercom.android.sdk.m5.components.avatar;

import Z3.o;
import androidx.compose.runtime.InterfaceC1084f;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.utilities.ThemeUtils;

/* JADX INFO: compiled from: AvatarIcon.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class AvatarWrapper {
    public static final int $stable = 8;
    public static final Companion Companion;
    private static final AvatarWrapper NULL;
    private final Avatar avatar;
    private final String initials;
    private final boolean isBot;
    private final String label;

    /* JADX INFO: compiled from: AvatarIcon.kt */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.e eVar) {
            this();
        }

        public final AvatarWrapper getNULL() {
            return AvatarWrapper.NULL;
        }

        private Companion() {
        }
    }

    static {
        kotlin.jvm.internal.e eVar = null;
        Companion = new Companion(eVar);
        Avatar NULL2 = Avatar.NULL;
        kotlin.jvm.internal.i.d(NULL2, "NULL");
        NULL = new AvatarWrapper(NULL2, false, 2, eVar);
    }

    public AvatarWrapper(Avatar avatar, boolean z10) {
        kotlin.jvm.internal.i.e(avatar, "avatar");
        this.avatar = avatar;
        this.isBot = z10;
        String initials = avatar.getInitials();
        kotlin.jvm.internal.i.d(initials, "getInitials(...)");
        this.initials = initials;
        String label = avatar.getLabel();
        kotlin.jvm.internal.i.d(label, "getLabel(...)");
        this.label = label;
    }

    public static /* synthetic */ AvatarWrapper copy$default(AvatarWrapper avatarWrapper, Avatar avatar, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            avatar = avatarWrapper.avatar;
        }
        if ((i10 & 2) != 0) {
            z10 = avatarWrapper.isBot;
        }
        return avatarWrapper.copy(avatar, z10);
    }

    public final Avatar component1() {
        return this.avatar;
    }

    public final boolean component2() {
        return this.isBot;
    }

    public final AvatarWrapper copy(Avatar avatar, boolean z10) {
        kotlin.jvm.internal.i.e(avatar, "avatar");
        return new AvatarWrapper(avatar, z10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AvatarWrapper)) {
            return false;
        }
        AvatarWrapper avatarWrapper = (AvatarWrapper) obj;
        return kotlin.jvm.internal.i.a(this.avatar, avatarWrapper.avatar) && this.isBot == avatarWrapper.isBot;
    }

    public final Avatar getAvatar() {
        return this.avatar;
    }

    public final String getImageUrl(InterfaceC1084f interfaceC1084f, int i10) {
        interfaceC1084f.L(1575443384);
        String strSelectUrlForThemeCompose$intercom_sdk_base_release = ThemeUtils.INSTANCE.selectUrlForThemeCompose$intercom_sdk_base_release(this.avatar.getImageUrl(), this.avatar.getImageDarkUrl(), interfaceC1084f, 384);
        if (strSelectUrlForThemeCompose$intercom_sdk_base_release == null) {
            strSelectUrlForThemeCompose$intercom_sdk_base_release = "";
        }
        interfaceC1084f.D();
        return strSelectUrlForThemeCompose$intercom_sdk_base_release;
    }

    public final String getInitials() {
        return this.initials;
    }

    public final String getLabel() {
        return this.label;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isBot) + (this.avatar.hashCode() * 31);
    }

    public final boolean isBot() {
        return this.isBot;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("AvatarWrapper(avatar=");
        sb2.append(this.avatar);
        sb2.append(", isBot=");
        return o.d(sb2, this.isBot, ')');
    }

    public /* synthetic */ AvatarWrapper(Avatar avatar, boolean z10, int i10, kotlin.jvm.internal.e eVar) {
        this(avatar, (i10 & 2) != 0 ? false : z10);
    }
}
