package kotlinx.datetime.internal.format.parser;

/* JADX INFO: compiled from: Parser.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class ParseException extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r3v1, types: [Ia.a, kotlin.jvm.internal.Lambda] */
    public ParseException(h error) {
        super("Position " + error.f43915a + ": " + ((String) error.f43916b.invoke()));
        kotlin.jvm.internal.i.e(error, "error");
    }
}
