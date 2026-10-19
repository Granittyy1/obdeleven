package androidx.compose.foundation.text;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 androidx.compose.foundation.text.KeyCommand[], still in use, count: 1, list:
  (r0v1 androidx.compose.foundation.text.KeyCommand[]) from 0x02bd: INVOKE (r0v1 androidx.compose.foundation.text.KeyCommand[]) STATIC call: kotlin.enums.a.a(java.lang.Enum[]):Ba.a A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):Ba.a<E extends java.lang.Enum<E>> (m)] (LINE:702)
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
/* JADX INFO: compiled from: KeyCommand.kt */
/* JADX INFO: loaded from: classes.dex */
public final class KeyCommand {
    f11149b(false),
    f11150c(false),
    f11151d(false),
    f11152e(false),
    f11153f(false),
    f11154g(false),
    f11155h(false),
    f11156i(false),
    j(false),
    f11157k(false),
    f11158l(false),
    f11159m(false),
    f11160n(false),
    f11161o(false),
    f11162p(false),
    f11163q(false),
    f11164r(false),
    f11165s(true),
    f11166t(true),
    f11167u(true),
    f11168v(true),
    f11169w(true),
    f11170x(true),
    f11171y(true),
    f11172z(true),
    f11126A(false),
    f11127B(false),
    f11128C(false),
    f11129D(false),
    f11130E(false),
    f11131F(false),
    f11132G(false),
    f11133H(false),
    f11134I(false),
    f11135J(false),
    f11136K(false),
    f11137L(false),
    f11138M(false),
    f11139N(false),
    f11140O(false),
    f11141P(false),
    f11142Q(false),
    f11143R(false),
    f11144S(true),
    f11145T(true),
    f11146U(true),
    f11147V(true),
    /* JADX INFO: Fake field, exist only in values array */
    EF588(true);

    private final boolean editsText;

    static {
        kotlin.enums.a.a(keyCommandArr);
    }

    public KeyCommand(boolean z10) {
        super(str, i);
        this.editsText = z10;
    }

    public static KeyCommand valueOf(String str) {
        return (KeyCommand) Enum.valueOf(KeyCommand.class, str);
    }

    public static KeyCommand[] values() {
        return (KeyCommand[]) f11148W.clone();
    }

    public final boolean a() {
        return this.editsText;
    }
}
