package com.voltasit.obdeleven.domain.models;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 com.voltasit.obdeleven.domain.models.Nrc[], still in use, count: 1, list:
  (r0v1 com.voltasit.obdeleven.domain.models.Nrc[]) from 0x02be: INVOKE (r0v1 com.voltasit.obdeleven.domain.models.Nrc[]) STATIC call: kotlin.enums.a.a(java.lang.Enum[]):Ba.a A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):Ba.a<E extends java.lang.Enum<E>> (m)] (LINE:703)
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
/* JADX INFO: compiled from: Nrc.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class Nrc {
    /* JADX INFO: Fake field, exist only in values array */
    EF0("Nrc10", "Function cancelled, disruption in control module"),
    /* JADX INFO: Fake field, exist only in values array */
    EF1("Nrc11", "Function not available"),
    /* JADX INFO: Fake field, exist only in values array */
    EF2("Nrc12", "Function not available"),
    /* JADX INFO: Fake field, exist only in values array */
    EF4("Nrc13", "Function cannot be performed, mess. length or format incorrect"),
    /* JADX INFO: Fake field, exist only in values array */
    EF7("BusyRepeatRequest", "Server is temporarily too busy to perform the requested operation"),
    /* JADX INFO: Fake field, exist only in values array */
    EF9("Nrc22", "Function cancelled, marginal conditions have not been met"),
    /* JADX INFO: Fake field, exist only in values array */
    EF11("IsoSaeReserved", "This range of values is reserved for future definition."),
    /* JADX INFO: Fake field, exist only in values array */
    EF12("Nrc24", "Procedure cannot be performed, incorrect sequence"),
    /* JADX INFO: Fake field, exist only in values array */
    EF10("Nrc25", "Function cancelled, subsystem does not respond"),
    /* JADX INFO: Fake field, exist only in values array */
    EF13("Nrc26", "Function cancelled, entry in DTC memory"),
    /* JADX INFO: Fake field, exist only in values array */
    EF15("Nrc31", "Function not available"),
    f30498d("Nrc33", "Access authorization required, perform Login"),
    /* JADX INFO: Fake field, exist only in values array */
    EF8("Nrc35", "Access authorization failed, incorrect Login code"),
    /* JADX INFO: Fake field, exist only in values array */
    EF14("Nrc36", "Login not possible, number of access attempts exceeded"),
    /* JADX INFO: Fake field, exist only in values array */
    EF8("Nrc37", "Login not possible, lock time not yet elapsed"),
    /* JADX INFO: Fake field, exist only in values array */
    EF14("Nrc70", "Function cancelled, upload/download not possible"),
    /* JADX INFO: Fake field, exist only in values array */
    EF8("Nrc71", "Function cancelled, data transfer error"),
    /* JADX INFO: Fake field, exist only in values array */
    EF14("Nrc72", "Function canceled, delete/programming unsuccessful"),
    /* JADX INFO: Fake field, exist only in values array */
    EF8("Nrc73", "Function cancelled, incorrect data block sequence"),
    f30499e("Nrc78", "Function started, control module busy"),
    /* JADX INFO: Fake field, exist only in values array */
    EF8("Nrc7E", "Function cannot be performed, incorrect diagnostic mode"),
    /* JADX INFO: Fake field, exist only in values array */
    EF14("ServiceNotSupportedInActiveSession", "Requested action will not be taken because the server does not support the requested service in the session currently active"),
    /* JADX INFO: Fake field, exist only in values array */
    EF8("Nrc81", "Function cancelled, engine RPM too high"),
    /* JADX INFO: Fake field, exist only in values array */
    EF14("Nrc82", "Function cancelled, engine RPM too low"),
    /* JADX INFO: Fake field, exist only in values array */
    EF8("Nrc83", "Function cancelled, engine running"),
    /* JADX INFO: Fake field, exist only in values array */
    EF14("Nrc84", "Function cancelled, engine not running"),
    /* JADX INFO: Fake field, exist only in values array */
    EF8("Nrc85", "Function cancelled, engine not running long enough"),
    /* JADX INFO: Fake field, exist only in values array */
    EF14("Nrc86", "Function cancelled, temperature too high"),
    /* JADX INFO: Fake field, exist only in values array */
    EF8("Nrc87", "Function cancelled, temperature too low"),
    /* JADX INFO: Fake field, exist only in values array */
    EF14("Nrc88", "Function cancelled, vehicle speed too high"),
    /* JADX INFO: Fake field, exist only in values array */
    EF8("Nrc89", "Function cancelled, vehicle speed too low"),
    /* JADX INFO: Fake field, exist only in values array */
    EF14("Nrc8A", "Function cancelled, accelerator pedal position exceeded"),
    /* JADX INFO: Fake field, exist only in values array */
    EF8("Nrc8B", "Function cancelled, accelerator pedal position not reached"),
    /* JADX INFO: Fake field, exist only in values array */
    EF14("Nrc8C", "Function cancelled, selector lever not in position 'N'"),
    /* JADX INFO: Fake field, exist only in values array */
    EF8("Nrc8D", "Function cancelled, driving mode/gear not selected"),
    /* JADX INFO: Fake field, exist only in values array */
    EF14("Nrc8F", "Function cancelled, brake pedal not depressed"),
    /* JADX INFO: Fake field, exist only in values array */
    EF8("Nrc90", "Function cancelled, selector lever not in position 'P'"),
    /* JADX INFO: Fake field, exist only in values array */
    EF14("Nrc91", "Function cancelled, converter clutch locked"),
    /* JADX INFO: Fake field, exist only in values array */
    EF8("Nrc92", "Function cancelled, supply voltage too high"),
    /* JADX INFO: Fake field, exist only in values array */
    EF14("Nrc93", "Function cancelled, supply voltage too low"),
    f30500f("Unknown", "Unknown nrc");


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f30496b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Nrc[] f30497c;
    private final int code;
    private final String description;

    /* JADX INFO: compiled from: Nrc.kt */
    public static final class a {
        /* JADX WARN: Code duplicated, block: B:10:0x0015  */
        /* JADX WARN: Code duplicated, block: B:14:? A[RETURN, SYNTHETIC] */
        public static Nrc a(int i10) {
            for (Nrc nrc : Nrc.f30497c) {
                if (nrc.a() == i10) {
                    if (nrc == null) {
                        return Nrc.f30500f;
                    }
                    return nrc;
                }
            }
            nrc = null;
            if (nrc == null) {
                return Nrc.f30500f;
            }
            return nrc;
        }
    }

    static {
        kotlin.enums.a.a(nrcArr);
        f30496b = new a();
        f30497c = values();
    }

    public Nrc(String str, String str2) {
        super(str, i);
        this.code = i;
        this.description = str2;
    }

    public static Nrc valueOf(String str) {
        return (Nrc) Enum.valueOf(Nrc.class, str);
    }

    public static Nrc[] values() {
        return (Nrc[]) f30501g.clone();
    }

    public final int a() {
        return this.code;
    }

    public final String b() {
        return this.description;
    }
}
