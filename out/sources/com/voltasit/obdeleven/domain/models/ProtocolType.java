package com.voltasit.obdeleven.domain.models;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 com.voltasit.obdeleven.domain.models.ProtocolType[], still in use, count: 1, list:
  (r0v1 com.voltasit.obdeleven.domain.models.ProtocolType[]) from 0x0089: INVOKE (r0v1 com.voltasit.obdeleven.domain.models.ProtocolType[]) STATIC call: kotlin.enums.a.a(java.lang.Enum[]):Ba.a A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):Ba.a<E extends java.lang.Enum<E>> (m)] (LINE:138)
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
/* JADX INFO: compiled from: ProtocolType.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class ProtocolType {
    CAN_UDS("CAN:UDS"),
    CAN_OBDII("CAN:OBDII"),
    TP20_KWP2002("TP2.0:KWP2000"),
    TP16_KWP1281("TP1.6:KWP1281"),
    TP16_KWP2000("TP1.6:KWP2000"),
    KLINE_KWP1281("K-Line:KWP1281"),
    KLINE_KWP2000_PHYSICAL("K-Line:KWP2000"),
    KLINE_KWP2000_FUNCTIONAL("K-Line:KWP2000"),
    KLINE_OBDII("K-Line:OBDII"),
    KLINE_OBDII_MULTI_MESSAGE("K-Line:OBDII"),
    UNKNOWN("");


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f30505b;
    private final String type;

    /* JADX INFO: compiled from: ProtocolType.kt */
    public static final class a {
    }

    static {
        kotlin.enums.a.a(protocolTypeArr);
        f30505b = new a();
    }

    public ProtocolType(String str) {
        super(str, i);
        this.type = str;
    }

    public static ProtocolType valueOf(String str) {
        return (ProtocolType) Enum.valueOf(ProtocolType.class, str);
    }

    public static ProtocolType[] values() {
        return (ProtocolType[]) f30516n.clone();
    }

    public final String a() {
        return this.type;
    }
}
