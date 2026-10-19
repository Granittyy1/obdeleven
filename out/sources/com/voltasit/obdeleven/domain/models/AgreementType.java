package com.voltasit.obdeleven.domain.models;

import com.braze.support.BrazeLogger;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 com.voltasit.obdeleven.domain.models.AgreementType[], still in use, count: 1, list:
  (r0v1 com.voltasit.obdeleven.domain.models.AgreementType[]) from 0x0025: INVOKE (r0v1 com.voltasit.obdeleven.domain.models.AgreementType[]) STATIC call: kotlin.enums.a.a(java.lang.Enum[]):Ba.a A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):Ba.a<E extends java.lang.Enum<E>> (m)] (LINE:38)
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
/* JADX INFO: compiled from: AgreementType.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class AgreementType {
    OCA_AGREEMENT(0),
    /* JADX INFO: Fake field, exist only in values array */
    TERMS_AND_CONDITIONS(1),
    UNKNOWN_AGREEMENT_TYPE(BrazeLogger.SUPPRESS);


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f30442b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AgreementType[] f30443c;
    private final int id;

    /* JADX INFO: compiled from: AgreementType.kt */
    public static final class a {
    }

    static {
        kotlin.enums.a.a(agreementTypeArr);
        f30442b = new a();
        f30443c = values();
    }

    public AgreementType(int i10) {
        super(str, i);
        this.id = i10;
    }

    public static AgreementType valueOf(String str) {
        return (AgreementType) Enum.valueOf(AgreementType.class, str);
    }

    public static AgreementType[] values() {
        return (AgreementType[]) f30446f.clone();
    }

    public final int a() {
        return this.id;
    }
}
