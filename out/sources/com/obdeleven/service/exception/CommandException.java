package com.obdeleven.service.exception;

import H2.a;

/* JADX INFO: loaded from: classes3.dex */
public class CommandException extends Exception {
    private final int mCode;

    public CommandException(int i10) {
        this.mCode = i10;
    }

    public final int a() {
        return this.mCode;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        int i10 = this.mCode;
        if (i10 == 254) {
            return "RESULT_NOT_CONNECTED";
        }
        if (i10 == 255) {
            return "RESULT_ERROR";
        }
        switch (i10) {
            case -4:
                return "EXCEPTION_UNKNOWN_PROTOCOL";
            case -3:
                return "EXCEPTION_ADAPTATION_NOT_OPENED";
            case a.POSITION_NONE /* -2 */:
                return "EXCEPTION_NOT_CONNECTED";
            case -1:
                return "EXCEPTION_TIME_OUT";
            case 0:
                return "RESULT_OK";
            case 1:
                return "RESULT_TIMEOUT";
            case 2:
                return "RESULT_UDS_TIMEOUT_A";
            case 3:
                return "RESULT_UDS_TIMEOUT_Bs";
            case 4:
                return "RESULT_UDS_TIMEOUT_Cr";
            case 5:
                return "RESULT_UDS_WRONG_SN";
            case 6:
                return "RESULT_UDS_INVALID_FS";
            case 7:
                return "RESULT_UDS_BUFFER_OVERFLOW";
            case 8:
                return "RESULT_TP20_BUSY";
            case 9:
                return "RESULT_K_LINE_TIMEOUT_SYNC_1";
            case 10:
                return "RESULT_K_LINE_TIMEOUT_SYNC_2";
            case 11:
                return "RESULT_K_LINE_TIMEOUT_KW1";
            case 12:
                return "RESULT_K_LINE_TIMEOUT_KW2";
            case 13:
                return "RESULT_K_LINE_TIMEOUT_ID";
            case 14:
                return "RESULT_K_LINE_UNDEFINED";
            case 15:
                return "RESULT_KWP1281_TIMEOUT_RECEIVER";
            case 16:
                return "RESULT_KWP1281_TIMEOUT_TRANSMITTER";
            case 17:
                return "RESULT_KWP1281_WRONG_CHECKSUM";
            case 18:
                return "RESULT_KWP2000_TIMEOUT_RECEIVER";
            case 19:
                return "RESULT_OBDII_TIMEOUT_RECEIVER";
            default:
                return "UNKNOWN";
        }
    }
}
