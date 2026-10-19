package com.voltasit.obdeleven.domain.models.oca;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 com.voltasit.obdeleven.domain.models.oca.OcaCategory[], still in use, count: 1, list:
  (r0v1 com.voltasit.obdeleven.domain.models.oca.OcaCategory[]) from 0x0024: INVOKE (r0v1 com.voltasit.obdeleven.domain.models.oca.OcaCategory[]) STATIC call: kotlin.enums.a.a(java.lang.Enum[]):Ba.a A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):Ba.a<E extends java.lang.Enum<E>> (m)] (LINE:37)
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
/* JADX INFO: compiled from: OcaCategory.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class OcaCategory {
    ADJUSTMENT("ADJUSTMENT"),
    RETROFIT("RETROFIT"),
    WORKSHOP("WORKSHOP");


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f30564b;
    private final String category;

    /* JADX INFO: compiled from: OcaCategory.kt */
    public static final class a {
    }

    static {
        kotlin.enums.a.a(ocaCategoryArr);
        f30564b = new a();
    }

    public OcaCategory(String str) {
        super(str, i);
        this.category = str;
    }

    public static OcaCategory valueOf(String str) {
        return (OcaCategory) Enum.valueOf(OcaCategory.class, str);
    }

    public static OcaCategory[] values() {
        return (OcaCategory[]) f30568f.clone();
    }

    public final String a() {
        return this.category;
    }
}
