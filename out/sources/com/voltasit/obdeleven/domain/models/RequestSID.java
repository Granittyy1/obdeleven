package com.voltasit.obdeleven.domain.models;

import kotlin.enums.a;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 com.voltasit.obdeleven.domain.models.RequestSID[], still in use, count: 1, list:
  (r0v1 com.voltasit.obdeleven.domain.models.RequestSID[]) from 0x002a: INVOKE (r0v1 com.voltasit.obdeleven.domain.models.RequestSID[]) STATIC call: kotlin.enums.a.a(java.lang.Enum[]):Ba.a A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):Ba.a<E extends java.lang.Enum<E>> (m)] (LINE:43)
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
/* JADX INFO: compiled from: RequestSID.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class RequestSID {
    RoutineControl((byte) 49),
    ReadDataByIdentifier((byte) 34),
    WriteDataByIdentifier((byte) 46);

    private final byte sid;

    static {
        a.a(requestSIDArr);
    }

    public RequestSID(byte b10) {
        super(str, i);
        this.sid = b10;
    }

    public static RequestSID valueOf(String str) {
        return (RequestSID) Enum.valueOf(RequestSID.class, str);
    }

    public static RequestSID[] values() {
        return (RequestSID[]) f30520e.clone();
    }

    public final byte a() {
        return this.sid;
    }
}
