package io.intercom.android.sdk.helpcenter.sections;

import Ya.b;
import Ya.k;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;
import p037cb.u0;

/* JADX INFO: compiled from: HelpCenterCollectionContent.kt */
/* JADX INFO: loaded from: classes3.dex */
@k
public final class Avatar {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String imageUrl;
    private final String initials;

    /* JADX INFO: compiled from: HelpCenterCollectionContent.kt */
    public static final class Companion {
        private Companion() {
        }

        public final b<Avatar> serializer() {
            return Avatar$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(e eVar) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Avatar() {
        this((String) null, (String) (0 == true ? 1 : 0), 3, (e) (0 == true ? 1 : 0));
    }

    public static /* synthetic */ Avatar copy$default(Avatar avatar, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = avatar.initials;
        }
        if ((i10 & 2) != 0) {
            str2 = avatar.imageUrl;
        }
        return avatar.copy(str, str2);
    }

    public static final /* synthetic */ void write$Self$intercom_sdk_base_release(Avatar avatar, p024bb.b bVar, p011ab.e eVar) {
        if (bVar.v(eVar) || !i.a(avatar.initials, "")) {
            bVar.p(eVar, 0, avatar.initials);
        }
        if (!bVar.v(eVar) && i.a(avatar.imageUrl, "")) {
            return;
        }
        bVar.p(eVar, 1, avatar.imageUrl);
    }

    public final String component1() {
        return this.initials;
    }

    public final String component2() {
        return this.imageUrl;
    }

    public final Avatar copy(String initials, String imageUrl) {
        i.e(initials, "initials");
        i.e(imageUrl, "imageUrl");
        return new Avatar(initials, imageUrl);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Avatar)) {
            return false;
        }
        Avatar avatar = (Avatar) obj;
        return i.a(this.initials, avatar.initials) && i.a(this.imageUrl, avatar.imageUrl);
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final String getInitials() {
        return this.initials;
    }

    public int hashCode() {
        return this.imageUrl.hashCode() + (this.initials.hashCode() * 31);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Avatar(initials=");
        sb2.append(this.initials);
        sb2.append(", imageUrl=");
        return B7.b.g(sb2, this.imageUrl, ')');
    }

    public /* synthetic */ Avatar(int i10, String str, String str2, u0 u0Var) {
        if ((i10 & 1) == 0) {
            this.initials = "";
        } else {
            this.initials = str;
        }
        if ((i10 & 2) == 0) {
            this.imageUrl = "";
        } else {
            this.imageUrl = str2;
        }
    }

    public Avatar(String initials, String imageUrl) {
        i.e(initials, "initials");
        i.e(imageUrl, "imageUrl");
        this.initials = initials;
        this.imageUrl = imageUrl;
    }

    public /* synthetic */ Avatar(String str, String str2, int i10, e eVar) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? "" : str2);
    }

    public static /* synthetic */ void getImageUrl$annotations() {
    }

    public static /* synthetic */ void getInitials$annotations() {
    }
}
