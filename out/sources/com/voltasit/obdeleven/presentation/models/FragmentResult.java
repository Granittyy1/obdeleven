package com.voltasit.obdeleven.presentation.models;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 com.voltasit.obdeleven.presentation.models.FragmentResult[], still in use, count: 1, list:
  (r0v1 com.voltasit.obdeleven.presentation.models.FragmentResult[]) from 0x0034: INVOKE (r0v1 com.voltasit.obdeleven.presentation.models.FragmentResult[]) STATIC call: kotlin.enums.a.a(java.lang.Enum[]):Ba.a A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):Ba.a<E extends java.lang.Enum<E>> (m)] (LINE:53)
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
/* JADX INFO: compiled from: FragmentResult.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class FragmentResult {
    OnNegative("OnNegative"),
    OnPositive("OnPositive"),
    /* JADX INFO: Fake field, exist only in values array */
    OnNeutral("OnNeutral"),
    /* JADX INFO: Fake field, exist only in values array */
    OnError("OnError"),
    Unknown("Unknown");


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f32636b;
    private final String value;

    /* JADX INFO: compiled from: FragmentResult.kt */
    public static final class a {
    }

    static {
        kotlin.enums.a.a(fragmentResultArr);
        f32636b = new a();
    }

    public FragmentResult(String str) {
        super(str, i);
        this.value = str;
    }

    public static FragmentResult valueOf(String str) {
        return (FragmentResult) Enum.valueOf(FragmentResult.class, str);
    }

    public static FragmentResult[] values() {
        return (FragmentResult[]) f32640f.clone();
    }

    public final String a() {
        return this.value;
    }
}
