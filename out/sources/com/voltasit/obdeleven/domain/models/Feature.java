package com.voltasit.obdeleven.domain.models;

import kotlin.enums.a;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 com.voltasit.obdeleven.domain.models.Feature[], still in use, count: 1, list:
  (r0v1 com.voltasit.obdeleven.domain.models.Feature[]) from 0x0080: INVOKE (r0v1 com.voltasit.obdeleven.domain.models.Feature[]) STATIC call: kotlin.enums.a.a(java.lang.Enum[]):Ba.a A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):Ba.a<E extends java.lang.Enum<E>> (m)] (LINE:129)
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
/* JADX INFO: compiled from: Feature.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class Feature {
    LiveData("live_data"),
    AdvancedIdentification("advanced_info"),
    LongCoding("long_coding"),
    Adaptations("adaptations"),
    BasicSettings("basic_settings"),
    OutputTests("output_tests"),
    Eeprom("eeprom"),
    Oca("oca"),
    GatewayCoding("gateway_coding"),
    ControlUnit("from_cu");

    private final String stringName;

    static {
        a.a(featureArr);
    }

    public Feature(String str) {
        super(str, i);
        this.stringName = str;
    }

    public static Feature valueOf(String str) {
        return (Feature) Enum.valueOf(Feature.class, str);
    }

    public static Feature[] values() {
        return (Feature[]) f30477l.clone();
    }

    public final String a() {
        return this.stringName;
    }
}
