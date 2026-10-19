package io.intercom.android.sdk.m5.components.avatar;

import java.util.Iterator;
import kotlin.text.m;

/* JADX INFO: compiled from: AvatarIcon.kt */
/* JADX INFO: loaded from: classes3.dex */
public enum AvatarShape {
    CIRCLE,
    SQUIRCLE;

    private static final /* synthetic */ Ba.a $ENTRIES = kotlin.enums.a.a(values());
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: compiled from: AvatarIcon.kt */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.e eVar) {
            this();
        }

        public final AvatarShape fromName(String shape) {
            AvatarShape next;
            kotlin.jvm.internal.i.e(shape, "shape");
            Iterator<AvatarShape> it = AvatarShape.getEntries().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!m.D(next.name(), shape, true));
            AvatarShape avatarShape = next;
            return avatarShape == null ? AvatarShape.CIRCLE : avatarShape;
        }

        private Companion() {
        }
    }

    public static Ba.a<AvatarShape> getEntries() {
        return $ENTRIES;
    }
}
