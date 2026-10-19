package com.voltasit.obdeleven.domain.models.oca;

import com.braze.support.BrazeLogger;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 com.voltasit.obdeleven.domain.models.oca.OcaTestState[], still in use, count: 1, list:
  (r0v1 com.voltasit.obdeleven.domain.models.oca.OcaTestState[]) from 0x002b: INVOKE (r0v1 com.voltasit.obdeleven.domain.models.oca.OcaTestState[]) STATIC call: kotlin.enums.a.a(java.lang.Enum[]):Ba.a A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):Ba.a<E extends java.lang.Enum<E>> (m)] (LINE:44)
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
/* JADX INFO: compiled from: OcaTestState.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class OcaTestState {
    /* JADX INFO: Fake field, exist only in values array */
    NOT_TESTED(0),
    /* JADX INFO: Fake field, exist only in values array */
    TEST_FAILED(1),
    /* JADX INFO: Fake field, exist only in values array */
    TESTED(2),
    UNKNOWN(BrazeLogger.SUPPRESS);


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f30569b;
    private final int id;

    /* JADX INFO: compiled from: OcaTestState.kt */
    public static final class a {
    }

    static {
        kotlin.enums.a.a(ocaTestStateArr);
        f30569b = new a();
    }

    public OcaTestState(int i10) {
        super(str, i);
        this.id = i10;
    }

    public static OcaTestState valueOf(String str) {
        return (OcaTestState) Enum.valueOf(OcaTestState.class, str);
    }

    public static OcaTestState[] values() {
        return (OcaTestState[]) f30571d.clone();
    }

    public final int a() {
        return this.id;
    }
}
