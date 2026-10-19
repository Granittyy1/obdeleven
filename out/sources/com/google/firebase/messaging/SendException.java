package com.google.firebase.messaging;

import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public final class SendException extends Exception {
    private final int errorCode;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Code duplicated, block: B:4:0x000a  */
    public SendException(String str) {
        super(str);
        int i10 = 4;
        if (str != null) {
            String lowerCase = str.toLowerCase(Locale.US);
            lowerCase.getClass();
            switch (lowerCase) {
                case "service_not_available":
                    i10 = 3;
                    break;
                case "toomanymessages":
                    break;
                case "invalid_parameters":
                case "missing_to":
                    i10 = 1;
                    break;
                case "messagetoobig":
                    i10 = 2;
                    break;
                default:
                    i10 = 0;
                    break;
            }
        } else {
            i10 = 0;
        }
        this.errorCode = i10;
    }
}
