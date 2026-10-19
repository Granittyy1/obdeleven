package com.voltasit.obdeleven.domain.models;

import kotlin.jvm.internal.i;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v2 com.voltasit.obdeleven.domain.models.SubscriptionType[], still in use, count: 1, list:
  (r0v2 com.voltasit.obdeleven.domain.models.SubscriptionType[]) from 0x0044: INVOKE (r0v2 com.voltasit.obdeleven.domain.models.SubscriptionType[]) STATIC call: kotlin.enums.a.a(java.lang.Enum[]):Ba.a A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):Ba.a<E extends java.lang.Enum<E>> (m)] (LINE:69)
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
/* JADX INFO: compiled from: SubscriptionType.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class SubscriptionType {
    None("NONE", false, "FREE"),
    Pro("PRO", true, "PRO"),
    /* JADX INFO: Fake field, exist only in values array */
    LifetimePro("LIFETIME_PRO", true, "PRO VAG"),
    Ultimate("ULTIMATE", true, "ULTIMATE");


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f30540b;
    private final String displayValue;
    private final boolean isPaid;
    private final String value;

    /* JADX INFO: compiled from: SubscriptionType.kt */
    public static final class a {
        public static SubscriptionType a(String value) {
            i.e(value, "value");
            for (SubscriptionType subscriptionType : SubscriptionType.values()) {
                if (i.a(subscriptionType.b(), value)) {
                    return subscriptionType;
                }
            }
            return SubscriptionType.None;
        }
    }

    static {
        kotlin.enums.a.a(subscriptionTypeArr);
        f30540b = new a();
    }

    public SubscriptionType(String str, boolean z10, String str2) {
        super(str, i);
        this.value = str;
        this.isPaid = z10;
        this.displayValue = str2;
    }

    public static SubscriptionType valueOf(String str) {
        return (SubscriptionType) Enum.valueOf(SubscriptionType.class, str);
    }

    public static SubscriptionType[] values() {
        return (SubscriptionType[]) f30544f.clone();
    }

    public final String a() {
        return this.displayValue;
    }

    public final String b() {
        return this.value;
    }

    public final boolean c() {
        return this.isPaid;
    }
}
