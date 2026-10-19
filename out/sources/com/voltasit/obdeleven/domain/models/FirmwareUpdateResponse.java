package com.voltasit.obdeleven.domain.models;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 com.voltasit.obdeleven.domain.models.FirmwareUpdateResponse[], still in use, count: 1, list:
  (r0v1 com.voltasit.obdeleven.domain.models.FirmwareUpdateResponse[]) from 0x009b: INVOKE (r0v1 com.voltasit.obdeleven.domain.models.FirmwareUpdateResponse[]) STATIC call: kotlin.enums.a.a(java.lang.Enum[]):Ba.a A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):Ba.a<E extends java.lang.Enum<E>> (m), WRAPPED] (LINE:156)
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
/* JADX INFO: compiled from: FirmwareUpdateResponse.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class FirmwareUpdateResponse {
    Success("00"),
    /* JADX INFO: Fake field, exist only in values array */
    Failure("01"),
    /* JADX INFO: Fake field, exist only in values array */
    Checksum("02"),
    /* JADX INFO: Fake field, exist only in values array */
    OutOfBounds("03"),
    /* JADX INFO: Fake field, exist only in values array */
    BufferOverflow("04"),
    /* JADX INFO: Fake field, exist only in values array */
    ProtectedArea("05"),
    /* JADX INFO: Fake field, exist only in values array */
    InvalidData("06"),
    Timeout("FA"),
    StartBootloader("FB"),
    StartFirmware("FC"),
    ChecksumNotMatched("FD"),
    BtConnectionLost("FE"),
    UnknownError("FF");


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f30478b = new a();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ Ba.a f30486k;
    private final String value;

    /* JADX INFO: compiled from: FirmwareUpdateResponse.kt */
    public static final class a {
    }

    static {
        f30486k = kotlin.enums.a.a(new FirmwareUpdateResponse[]{r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12});
    }

    public FirmwareUpdateResponse(String str) {
        super(str, i);
        this.value = str;
    }

    public static FirmwareUpdateResponse valueOf(String str) {
        return (FirmwareUpdateResponse) Enum.valueOf(FirmwareUpdateResponse.class, str);
    }

    public static FirmwareUpdateResponse[] values() {
        return (FirmwareUpdateResponse[]) j.clone();
    }

    public final String a() {
        return this.value;
    }
}
