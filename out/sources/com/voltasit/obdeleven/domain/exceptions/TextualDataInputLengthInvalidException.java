package com.voltasit.obdeleven.domain.exceptions;

import J4.n;
import p005a4.o;

/* JADX INFO: compiled from: TextualDataInputLengthInvalidException.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class TextualDataInputLengthInvalidException extends Exception {
    private final long maxLength;
    private final long minLength;

    public TextualDataInputLengthInvalidException(long j, long j10) {
        super("Input length invalid");
        this.minLength = j;
        this.maxLength = j10;
    }

    public final String a() {
        return this.minLength + " - " + this.maxLength;
    }

    public final long b() {
        return this.maxLength;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextualDataInputLengthInvalidException)) {
            return false;
        }
        TextualDataInputLengthInvalidException textualDataInputLengthInvalidException = (TextualDataInputLengthInvalidException) obj;
        return this.minLength == textualDataInputLengthInvalidException.minLength && this.maxLength == textualDataInputLengthInvalidException.maxLength;
    }

    public final int hashCode() {
        return Long.hashCode(this.maxLength) + (Long.hashCode(this.minLength) * 31);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return o.d(this.maxLength, ")", n.f("TextualDataInputLengthInvalidException(minLength=", ", maxLength=", this.minLength));
    }
}
