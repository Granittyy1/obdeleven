package com.obdeleven.service.odx;

import kotlin.jvm.internal.i;
import kotlin.text.n;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 com.obdeleven.service.odx.DopBaseType[], still in use, count: 1, list:
  (r0v1 com.obdeleven.service.odx.DopBaseType[]) from 0x0042: INVOKE (r0v1 com.obdeleven.service.odx.DopBaseType[]) STATIC call: kotlin.enums.a.a(java.lang.Enum[]):Ba.a A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):Ba.a<E extends java.lang.Enum<E>> (m)] (LINE:67)
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
/* JADX INFO: compiled from: DopBaseType.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class DopBaseType {
    /* JADX INFO: Fake field, exist only in values array */
    Dop("DOP"),
    /* JADX INFO: Fake field, exist only in values array */
    Struc("STRUC"),
    /* JADX INFO: Fake field, exist only in values array */
    Mux("MUX"),
    /* JADX INFO: Fake field, exist only in values array */
    EndOfPduField("EOPDUF"),
    /* JADX INFO: Fake field, exist only in values array */
    Dynlf("DYNLF"),
    /* JADX INFO: Fake field, exist only in values array */
    Statf("STATF");


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f29451b;
    private final String startsWith;

    /* JADX INFO: compiled from: DopBaseType.kt */
    public static final class a {
        public static DopBaseType a(String idRef) {
            i.e(idRef, "idRef");
            String strSubstring = idRef.substring(0, n.Q(idRef, "_", 0, false, 6));
            i.d(strSubstring, "substring(...)");
            for (DopBaseType dopBaseType : DopBaseType.values()) {
                if (i.a(dopBaseType.startsWith, strSubstring)) {
                    return dopBaseType;
                }
            }
            return null;
        }
    }

    static {
        kotlin.enums.a.a(dopBaseTypeArr);
        f29451b = new a();
    }

    public DopBaseType(String str) {
        super(str, i);
        this.startsWith = str;
    }

    public static DopBaseType valueOf(String str) {
        return (DopBaseType) Enum.valueOf(DopBaseType.class, str);
    }

    public static DopBaseType[] values() {
        return (DopBaseType[]) f29452c.clone();
    }
}
