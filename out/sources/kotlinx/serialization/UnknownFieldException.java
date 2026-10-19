package kotlinx.serialization;

import J4.i;

/* JADX INFO: compiled from: SerializationExceptions.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class UnknownFieldException extends SerializationException {
    public UnknownFieldException(int i10) {
        super(i.b(i10, "An unknown field for index "));
    }
}
