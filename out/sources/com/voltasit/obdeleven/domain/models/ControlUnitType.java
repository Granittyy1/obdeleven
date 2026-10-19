package com.voltasit.obdeleven.domain.models;

import kotlin.enums.a;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 com.voltasit.obdeleven.domain.models.ControlUnitType[], still in use, count: 1, list:
  (r0v1 com.voltasit.obdeleven.domain.models.ControlUnitType[]) from 0x005e: INVOKE (r0v1 com.voltasit.obdeleven.domain.models.ControlUnitType[]) STATIC call: kotlin.enums.a.a(java.lang.Enum[]):Ba.a A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):Ba.a<E extends java.lang.Enum<E>> (m)] (LINE:95)
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
/* JADX INFO: compiled from: ControlUnitType.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class ControlUnitType {
    SteeringAngleSensor((short) 0),
    Engine((short) 1),
    Brakes((short) 3),
    SteeringAngleSensorII((short) 4),
    AirBag((short) 21),
    Gateway((short) 25),
    SteeringAssistance((short) 68),
    ObdII((short) 51);

    private final short id;

    static {
        a.a(controlUnitTypeArr);
    }

    public ControlUnitType(short s10) {
        super(str, i);
        this.id = s10;
    }

    public static ControlUnitType valueOf(String str) {
        return (ControlUnitType) Enum.valueOf(ControlUnitType.class, str);
    }

    public static ControlUnitType[] values() {
        return (ControlUnitType[]) j.clone();
    }

    public final short a() {
        return this.id;
    }
}
