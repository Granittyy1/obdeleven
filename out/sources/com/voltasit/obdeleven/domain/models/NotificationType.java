package com.voltasit.obdeleven.domain.models;

import kotlin.jvm.internal.i;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 com.voltasit.obdeleven.domain.models.NotificationType[], still in use, count: 1, list:
  (r0v1 com.voltasit.obdeleven.domain.models.NotificationType[]) from 0x0034: INVOKE (r0v1 com.voltasit.obdeleven.domain.models.NotificationType[]) STATIC call: kotlin.enums.a.a(java.lang.Enum[]):Ba.a A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):Ba.a<E extends java.lang.Enum<E>> (m)] (LINE:53)
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: compiled from: NotificationType.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class NotificationType {
    APP_UPDATE("app_update"),
    MEGA_OFFER("megaOffer"),
    /* JADX INFO: Fake field, exist only in values array */
    REDEEM("redeem"),
    UNKNOWN("unknown");


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f30491b;
    private final String type;

    /* JADX INFO: compiled from: NotificationType.kt */
    public static final class a {
        public static NotificationType a(String value) {
            i.e(value, "value");
            for (NotificationType notificationType : NotificationType.values()) {
                if (i.a(notificationType.a(), value)) {
                    return notificationType;
                }
            }
            return NotificationType.UNKNOWN;
        }
    }

    static {
        kotlin.enums.a.a(notificationTypeArr);
        f30491b = new a();
    }

    public NotificationType(String str) {
        super(str, i);
        this.type = str;
    }

    public static NotificationType valueOf(String str) {
        return (NotificationType) Enum.valueOf(NotificationType.class, str);
    }

    public static NotificationType[] values() {
        return (NotificationType[]) f30495f.clone();
    }

    public final String a() {
        return this.type;
    }
}
