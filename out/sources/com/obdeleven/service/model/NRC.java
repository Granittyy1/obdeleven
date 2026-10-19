package com.obdeleven.service.model;

/* JADX INFO: loaded from: classes3.dex */
public enum NRC {
    /* JADX INFO: Fake field, exist only in values array */
    EF0("NRC_10", "Function cancelled, disruption in control module"),
    /* JADX INFO: Fake field, exist only in values array */
    EF1("NRC_11", "Function not available"),
    /* JADX INFO: Fake field, exist only in values array */
    EF2("NRC_12", "Function not available"),
    /* JADX INFO: Fake field, exist only in values array */
    EF4("NRC_13", "Function cannot be performed, mess. length or format incorrect"),
    f29377b("BUSY_REPEAT_REQUEST", "Server is temporarily too busy to perform the requested operation"),
    f29378c("NRC_22", "Function cancelled, marginal conditions have not been met"),
    f29379d("ISOSAE_RESERVED", "This range of values is reserved for future definition."),
    /* JADX INFO: Fake field, exist only in values array */
    EF12("NRC_24", "Procedure cannot be performed, incorrect sequence"),
    /* JADX INFO: Fake field, exist only in values array */
    EF10("NRC_25", "Function cancelled, subsystem does not respond"),
    /* JADX INFO: Fake field, exist only in values array */
    EF13("NRC_26", "Function cancelled, entry in DTC memory"),
    /* JADX INFO: Fake field, exist only in values array */
    EF15("NRC_31", "Function not available"),
    /* JADX INFO: Fake field, exist only in values array */
    EF14("NRC_33", "Access authorization required, perform Login"),
    /* JADX INFO: Fake field, exist only in values array */
    EF8("NRC_35", "Access authorization failed, incorrect Login code"),
    /* JADX INFO: Fake field, exist only in values array */
    EF14("NRC_36", "Login not possible, number of access attempts exceeded"),
    /* JADX INFO: Fake field, exist only in values array */
    EF8("NRC_37", "Login not possible, lock time not yet elapsed"),
    /* JADX INFO: Fake field, exist only in values array */
    EF14("NRC_70", "Function cancelled, upload/download not possible"),
    /* JADX INFO: Fake field, exist only in values array */
    EF8("NRC_71", "Function cancelled, data transfer error"),
    /* JADX INFO: Fake field, exist only in values array */
    EF14("NRC_72", "Function canceled, delete/programming unsuccessful"),
    /* JADX INFO: Fake field, exist only in values array */
    EF8("NRC_73", "Function cancelled, incorrect data block sequence"),
    /* JADX INFO: Fake field, exist only in values array */
    EF14("NRC_78", "Function started, control module busy"),
    /* JADX INFO: Fake field, exist only in values array */
    EF8("NRC_7E", "Function cannot be performed, incorrect diagnostic mode"),
    f29380e("SERVICE_NOT_SUPPORTED_IN_ACTIVE_SESSION", "Requested action will not be taken because the server does not support the requested service in the session currently active"),
    /* JADX INFO: Fake field, exist only in values array */
    EF8("NRC_81", "Function cancelled, engine RPM too high"),
    /* JADX INFO: Fake field, exist only in values array */
    EF14("NRC_82", "Function cancelled, engine RPM too low"),
    /* JADX INFO: Fake field, exist only in values array */
    EF8("NRC_83", "Function cancelled, engine running"),
    /* JADX INFO: Fake field, exist only in values array */
    EF14("NRC_84", "Function cancelled, engine not running"),
    /* JADX INFO: Fake field, exist only in values array */
    EF8("NRC_85", "Function cancelled, engine not running long enough"),
    /* JADX INFO: Fake field, exist only in values array */
    EF14("NRC_86", "Function cancelled, temperature too high"),
    /* JADX INFO: Fake field, exist only in values array */
    EF8("NRC_87", "Function cancelled, temperature too low"),
    /* JADX INFO: Fake field, exist only in values array */
    EF14("NRC_88", "Function cancelled, vehicle speed too high"),
    /* JADX INFO: Fake field, exist only in values array */
    EF8("NRC_89", "Function cancelled, vehicle speed too low"),
    /* JADX INFO: Fake field, exist only in values array */
    EF14("NRC_8A", "Function cancelled, accelerator pedal position exceeded"),
    /* JADX INFO: Fake field, exist only in values array */
    EF8("NRC_8B", "Function cancelled, accelerator pedal position not reached"),
    /* JADX INFO: Fake field, exist only in values array */
    EF14("NRC_8C", "Function cancelled, selector lever not in position 'N'"),
    /* JADX INFO: Fake field, exist only in values array */
    EF8("NRC_8D", "Function cancelled, driving mode/gear not selected"),
    /* JADX INFO: Fake field, exist only in values array */
    EF14("NRC_8F", "Function cancelled, brake pedal not depressed"),
    /* JADX INFO: Fake field, exist only in values array */
    EF8("NRC_90", "Function cancelled, selector lever not in position 'P'"),
    /* JADX INFO: Fake field, exist only in values array */
    EF14("NRC_91", "Function cancelled, converter clutch locked"),
    /* JADX INFO: Fake field, exist only in values array */
    EF8("NRC_92", "Function cancelled, supply voltage too high"),
    /* JADX INFO: Fake field, exist only in values array */
    EF14("NRC_93", "Function cancelled, supply voltage too low"),
    f29381f("UNKNOWN", "");

    private final int code;
    private final String description;

    NRC(String str, String str2) {
        this.code = i;
        this.description = str2;
    }

    public static NRC a(int i10) {
        for (NRC nrc : values()) {
            if (nrc.code == i10) {
                return nrc;
            }
        }
        return f29381f;
    }

    public final int b() {
        return this.code;
    }

    public final String c() {
        return this.description;
    }
}
