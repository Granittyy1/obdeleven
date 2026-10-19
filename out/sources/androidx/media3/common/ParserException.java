package androidx.media3.common;

import java.io.IOException;
import p005a4.q;

/* JADX INFO: loaded from: classes.dex */
public class ParserException extends IOException {
    public final boolean contentIsMalformed;
    public final int dataType;

    public ParserException(String str, RuntimeException runtimeException, boolean z10, int i10) {
        super(str, runtimeException);
        this.contentIsMalformed = z10;
        this.dataType = i10;
    }

    public static ParserException a(RuntimeException runtimeException, String str) {
        return new ParserException(str, runtimeException, true, 1);
    }

    public static ParserException b(String str) {
        return new ParserException(str, null, false, 1);
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        String message = super.getMessage();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(message != null ? message.concat(" ") : "");
        sb2.append("{contentIsMalformed=");
        sb2.append(this.contentIsMalformed);
        sb2.append(", dataType=");
        return q.c(sb2, this.dataType, "}");
    }
}
