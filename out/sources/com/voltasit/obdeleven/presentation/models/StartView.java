package com.voltasit.obdeleven.presentation.models;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 com.voltasit.obdeleven.presentation.models.StartView[], still in use, count: 1, list:
  (r0v1 com.voltasit.obdeleven.presentation.models.StartView[]) from 0x0025: INVOKE (r0v1 com.voltasit.obdeleven.presentation.models.StartView[]) STATIC call: kotlin.enums.a.a(java.lang.Enum[]):Ba.a A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):Ba.a<E extends java.lang.Enum<E>> (m)] (LINE:38)
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
/* JADX INFO: compiled from: StartView.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class StartView {
    AUTO(1),
    GARAGE(2),
    CAR(3);


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f32644b;
    private final int type;

    /* JADX INFO: compiled from: StartView.kt */
    public static final class a {
    }

    static {
        kotlin.enums.a.a(startViewArr);
        f32644b = new a();
    }

    public StartView(int i10) {
        super(str, i);
        this.type = i10;
    }

    public static StartView valueOf(String str) {
        return (StartView) Enum.valueOf(StartView.class, str);
    }

    public static StartView[] values() {
        return (StartView[]) f32648f.clone();
    }

    public final int a() {
        return this.type;
    }
}
