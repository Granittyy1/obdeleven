package com.google.android.gms.internal.play_billing;

import java.io.IOException;
import java.util.Locale;

/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzen extends IOException {
    public zzen() {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public zzen(long j, long j10, int i10, IndexOutOfBoundsException indexOutOfBoundsException) {
        Locale locale = Locale.US;
        StringBuilder sbF = J4.n.f("Pos: ", ", limit: ", j);
        sbF.append(j10);
        sbF.append(", len: ");
        sbF.append(i10);
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(sbF.toString()), indexOutOfBoundsException);
    }

    public zzen(IndexOutOfBoundsException indexOutOfBoundsException) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", indexOutOfBoundsException);
    }
}
