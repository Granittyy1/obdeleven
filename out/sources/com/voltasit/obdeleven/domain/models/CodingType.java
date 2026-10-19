package com.voltasit.obdeleven.domain.models;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 com.voltasit.obdeleven.domain.models.CodingType[], still in use, count: 1, list:
  (r0v1 com.voltasit.obdeleven.domain.models.CodingType[]) from 0x0046: INVOKE (r0v1 com.voltasit.obdeleven.domain.models.CodingType[]) STATIC call: kotlin.enums.a.a(java.lang.Enum[]):Ba.a A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):Ba.a<E extends java.lang.Enum<E>> (m)] (LINE:71)
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
/* JADX INFO: compiled from: CodingType.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class CodingType {
    UNKNOWN("Unknown"),
    /* JADX INFO: Fake field, exist only in values array */
    NO_CODING(""),
    /* JADX INFO: Fake field, exist only in values array */
    NO_DATA("NoData"),
    /* JADX INFO: Fake field, exist only in values array */
    CODING("CODING"),
    /* JADX INFO: Fake field, exist only in values array */
    LONG_CODING("LONG_CODING"),
    /* JADX INFO: Fake field, exist only in values array */
    SUB_CODING("SUB_CODING"),
    /* JADX INFO: Fake field, exist only in values array */
    SUB_LONG_CODING("SUB_LONG_CODING");


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f30447b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final CodingType[] f30448c;
    private final String typeName;

    /* JADX INFO: compiled from: CodingType.kt */
    public static final class a {
    }

    static {
        kotlin.enums.a.a(codingTypeArr);
        f30447b = new a();
        f30448c = values();
    }

    public CodingType(String str) {
        super(str, i);
        this.typeName = str;
    }

    public static CodingType valueOf(String str) {
        return (CodingType) Enum.valueOf(CodingType.class, str);
    }

    public static CodingType[] values() {
        return (CodingType[]) f30450e.clone();
    }

    public final String a() {
        return this.typeName;
    }
}
