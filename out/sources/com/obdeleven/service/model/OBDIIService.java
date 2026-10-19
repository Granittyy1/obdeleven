package com.obdeleven.service.model;

/* JADX INFO: loaded from: classes3.dex */
public enum OBDIIService {
    /* JADX INFO: Fake field, exist only in values array */
    EF6("01", "41", "Show current data"),
    /* JADX INFO: Fake field, exist only in values array */
    EF1("02", "42", "Show freeze frame data"),
    f29395b("03", "43", "Show stored Diagnostic Trouble Codes"),
    f29396c("04", "44", "Clear Diagnostic Trouble Codes and stored values"),
    /* JADX INFO: Fake field, exist only in values array */
    EF4("05", "45", "Test results, oxygen sensor monitoring (non CAN only)"),
    /* JADX INFO: Fake field, exist only in values array */
    EF5("06", "46", "Test results, other component/system monitoring (Test results, oxygen sensor monitoring for CAN only)"),
    f29397d("07", "47", "Show pending Diagnostic Trouble Codes (detected during current or last driving cycle)"),
    /* JADX INFO: Fake field, exist only in values array */
    EF14("08", "48", "Control operation of on-board component/system"),
    f29398e("09", "49", "Request vehicle information"),
    f29399f("0A", "4A", "Permanent Diagnostic Trouble Codes (DTCs) (Cleared DTCs)");

    private final String description;
    private final String requestHex;
    private final String responseHex;

    OBDIIService(String str, String str2, String str3) {
        this.requestHex = str;
        this.responseHex = str2;
        this.description = str3;
    }

    public final String a() {
        return this.requestHex;
    }

    public final String b() {
        return this.responseHex;
    }
}
