package com.voltasit.sharednetwork.integrity;

import kotlin.text.Regex;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 com.voltasit.sharednetwork.integrity.IntegrityEndpoint[], still in use, count: 1, list:
  (r0v1 com.voltasit.sharednetwork.integrity.IntegrityEndpoint[]) from 0x0012: INVOKE (r0v1 com.voltasit.sharednetwork.integrity.IntegrityEndpoint[]) STATIC call: kotlin.enums.a.a(java.lang.Enum[]):Ba.a A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):Ba.a<E extends java.lang.Enum<E>> (m), WRAPPED] (LINE:19)
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
/* JADX INFO: compiled from: IntegrityEndpoint.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class IntegrityEndpoint {
    /* JADX INFO: Fake field, exist only in values array */
    EF9;


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f34458b = new a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ Ba.a f34460d = kotlin.enums.a.a(new IntegrityEndpoint[]{new IntegrityEndpoint()});
    private final Regex pattern;

    /* JADX INFO: compiled from: IntegrityEndpoint.kt */
    public static final class a {
    }

    static {
    }

    public IntegrityEndpoint() {
        super("SfdToken", 0);
        this.pattern = regex;
    }

    public static IntegrityEndpoint valueOf(String str) {
        return (IntegrityEndpoint) Enum.valueOf(IntegrityEndpoint.class, str);
    }

    public static IntegrityEndpoint[] values() {
        return (IntegrityEndpoint[]) f34459c.clone();
    }

    public final boolean a(String str) {
        return this.pattern.a(str);
    }
}
