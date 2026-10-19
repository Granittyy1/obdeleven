package com.voltasit.obdeleven.presentation.models;

import com.voltasit.obdeleven.R;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v2 com.voltasit.obdeleven.presentation.models.BatteryVoltageState[], still in use, count: 1, list:
  (r0v2 com.voltasit.obdeleven.presentation.models.BatteryVoltageState[]) from 0x005f: INVOKE (r0v2 com.voltasit.obdeleven.presentation.models.BatteryVoltageState[]) STATIC call: kotlin.enums.a.a(java.lang.Enum[]):Ba.a A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):Ba.a<E extends java.lang.Enum<E>> (m)] (LINE:96)
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
/* JADX INFO: compiled from: BatteryVoltageState.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class BatteryVoltageState {
    /* JADX INFO: Fake field, exist only in values array */
    DRAINED(11.5d, 2131230867, R.color.red_500),
    /* JADX INFO: Fake field, exist only in values array */
    LOW(12.0d, 2131230867, R.color.yellow_700),
    /* JADX INFO: Fake field, exist only in values array */
    FULL(13.0d, 2131230867, R.color.holo_green_dark),
    /* JADX INFO: Fake field, exist only in values array */
    CHARGING(15.5d, 2131230868, R.color.holo_green_dark),
    UNKNOWN(100.0d, 2131230868, R.color.red_500);


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f32633b;
    private final int color;
    private final int icon;
    private final double maxVoltage;

    /* JADX INFO: compiled from: BatteryVoltageState.kt */
    public static final class a {
    }

    static {
        kotlin.enums.a.a(batteryVoltageStateArr);
        f32633b = new a();
    }

    public BatteryVoltageState(double d10, int i10, int i11) {
        super(str, i);
        this.maxVoltage = d10;
        this.icon = i10;
        this.color = i11;
    }

    public static BatteryVoltageState valueOf(String str) {
        return (BatteryVoltageState) Enum.valueOf(BatteryVoltageState.class, str);
    }

    public static BatteryVoltageState[] values() {
        return (BatteryVoltageState[]) f32635d.clone();
    }

    public final int a() {
        return this.color;
    }

    public final int b() {
        return this.icon;
    }

    public final double c() {
        return this.maxVoltage;
    }
}
