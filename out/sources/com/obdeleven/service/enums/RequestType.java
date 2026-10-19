package com.obdeleven.service.enums;

import kotlin.enums.a;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 com.obdeleven.service.enums.RequestType[], still in use, count: 1, list:
  (r0v1 com.obdeleven.service.enums.RequestType[]) from 0x0042: INVOKE (r0v1 com.obdeleven.service.enums.RequestType[]) STATIC call: kotlin.enums.a.a(java.lang.Enum[]):Ba.a A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):Ba.a<E extends java.lang.Enum<E>> (m)] (LINE:67)
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
/* JADX INFO: compiled from: RequestType.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class RequestType {
    DiagnosisFilterStatus("539B"),
    Obd2ReadVin("0902"),
    Date("2EF199"),
    WorkshopNumber("2EF198077328F6"),
    LongCoding("2E0600");

    private final String hex;

    static {
        a.a(requestTypeArr);
    }

    public RequestType(String str) {
        super(str, i);
        this.hex = str;
    }

    public static RequestType valueOf(String str) {
        return (RequestType) Enum.valueOf(RequestType.class, str);
    }

    public static RequestType[] values() {
        return (RequestType[]) f29280g.clone();
    }

    public final String a() {
        return this.hex;
    }
}
