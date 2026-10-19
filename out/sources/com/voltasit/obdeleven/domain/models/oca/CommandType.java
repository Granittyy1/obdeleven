package com.voltasit.obdeleven.domain.models.oca;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 com.voltasit.obdeleven.domain.models.oca.CommandType[], still in use, count: 1, list:
  (r0v1 com.voltasit.obdeleven.domain.models.oca.CommandType[]) from 0x0144: INVOKE (r0v1 com.voltasit.obdeleven.domain.models.oca.CommandType[]) STATIC call: kotlin.enums.a.a(java.lang.Enum[]):Ba.a A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):Ba.a<E extends java.lang.Enum<E>> (m)] (LINE:325)
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
/* JADX INFO: compiled from: CommandType.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class CommandType {
    /* JADX INFO: Fake field, exist only in values array */
    Connect("CONNECT"),
    /* JADX INFO: Fake field, exist only in values array */
    SecurityAccess("SECURITY_ACCESS"),
    /* JADX INFO: Fake field, exist only in values array */
    Coding("CODING"),
    /* JADX INFO: Fake field, exist only in values array */
    SubCoding("SUB_CODING"),
    /* JADX INFO: Fake field, exist only in values array */
    LongCoding("LONG_CODING"),
    /* JADX INFO: Fake field, exist only in values array */
    SubLongCoding("SUB_LONG_CODING"),
    /* JADX INFO: Fake field, exist only in values array */
    Adaptation("ADAPTATION"),
    /* JADX INFO: Fake field, exist only in values array */
    LongAdaptation("LONG_ADAPTATION"),
    /* JADX INFO: Fake field, exist only in values array */
    BasicSettings("BASIC_SETTINGS"),
    /* JADX INFO: Fake field, exist only in values array */
    DataById("DATA_BY_ID"),
    /* JADX INFO: Fake field, exist only in values array */
    RoutineControl("ROUTINE_CONTROL"),
    /* JADX INFO: Fake field, exist only in values array */
    SimpleEeprom("SIMPLE_EEPROM"),
    /* JADX INFO: Fake field, exist only in values array */
    Eeprom("EEPROM"),
    /* JADX INFO: Fake field, exist only in values array */
    Zdc("ZDC"),
    /* JADX INFO: Fake field, exist only in values array */
    SfdLock("RAW"),
    /* JADX INFO: Fake field, exist only in values array */
    Supported("DTC_CLEAR"),
    /* JADX INFO: Fake field, exist only in values array */
    SfdLock("SERVICE_CHANGE"),
    /* JADX INFO: Fake field, exist only in values array */
    Supported("RESET"),
    /* JADX INFO: Fake field, exist only in values array */
    SfdLock("DISCONNECT"),
    /* JADX INFO: Fake field, exist only in values array */
    Supported("SUPPORTED"),
    /* JADX INFO: Fake field, exist only in values array */
    SfdLock("DELAY"),
    SfdUnlock("SFD_UNLOCK"),
    /* JADX INFO: Fake field, exist only in values array */
    SfdLock("SFD_LOCK"),
    Unknown("UNKNOWN");


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f30560b;
    private final String value;

    /* JADX INFO: compiled from: CommandType.kt */
    public static final class a {
    }

    static {
        kotlin.enums.a.a(commandTypeArr);
        f30560b = new a();
    }

    public CommandType(String str) {
        super(str, i);
        this.value = str;
    }

    public static CommandType valueOf(String str) {
        return (CommandType) Enum.valueOf(CommandType.class, str);
    }

    public static CommandType[] values() {
        return (CommandType[]) f30563e.clone();
    }

    public final String a() {
        return this.value;
    }
}
