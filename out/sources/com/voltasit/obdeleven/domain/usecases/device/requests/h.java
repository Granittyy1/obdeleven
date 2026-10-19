package com.voltasit.obdeleven.domain.usecases.device.requests;

/* JADX INFO: compiled from: ValidateVinUC.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class h {
    public static int a(char c10) {
        if (c10 == 'A' || c10 == 'J' || c10 == '1') {
            return 1;
        }
        if (c10 == 'B' || c10 == 'K' || c10 == 'S' || c10 == '2') {
            return 2;
        }
        if (c10 == 'C' || c10 == 'L' || c10 == 'T' || c10 == '3') {
            return 3;
        }
        if (c10 == 'D' || c10 == 'M' || c10 == 'U' || c10 == '4') {
            return 4;
        }
        if (c10 == 'E' || c10 == 'N' || c10 == 'V' || c10 == '5') {
            return 5;
        }
        if (c10 == 'F' || c10 == 'W' || c10 == '6') {
            return 6;
        }
        if (c10 == 'G' || c10 == 'P' || c10 == 'X' || c10 == '7') {
            return 7;
        }
        if (c10 == 'H' || c10 == 'Y' || c10 == '8') {
            return 8;
        }
        return (c10 == 'R' || c10 == 'Z' || c10 == '9') ? 9 : 0;
    }
}
