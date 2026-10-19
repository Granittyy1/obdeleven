package kotlinx.datetime.internal.format.parser;

/* JADX INFO: compiled from: ParserOperation.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class m<Output> implements k<Output> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f43922a;

    public m(String string) {
        kotlin.jvm.internal.i.e(string, "string");
        this.f43922a = string;
        if (string.length() <= 0) {
            throw new IllegalArgumentException("Empty string is not allowed");
        }
        if (Character.isDigit(string.charAt(0))) {
            throw new IllegalArgumentException(androidx.compose.foundation.gestures.d.b("String '", string, "' starts with a digit").toString());
        }
        if (Character.isDigit(string.charAt(string.length() - 1))) {
            throw new IllegalArgumentException(androidx.compose.foundation.gestures.d.b("String '", string, "' ends with a digit").toString());
        }
    }

    @Override // kotlinx.datetime.internal.format.parser.k
    public final Object a(c cVar, final String input, final int i10) {
        kotlin.jvm.internal.i.e(input, "input");
        String str = this.f43922a;
        if (str.length() + i10 > input.length()) {
            return new h(i10, new Ia.a<String>(this) { // from class: kotlinx.datetime.internal.format.parser.PlainStringParserOperation$consume$1
                final /* synthetic */ m<Object> this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                    this.this$0 = this;
                }

                @Override // Ia.a
                public final String invoke() {
                    return B7.b.g(new StringBuilder("Unexpected end of input: yet to parse '"), this.this$0.f43922a, '\'');
                }
            });
        }
        int length = str.length();
        for (final int i11 = 0; i11 < length; i11++) {
            if (input.charAt(i10 + i11) != str.charAt(i11)) {
                return new h(i10, new Ia.a<String>() { // from class: kotlinx.datetime.internal.format.parser.PlainStringParserOperation$consume$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // Ia.a
                    public final String invoke() {
                        StringBuilder sb2 = new StringBuilder("Expected ");
                        sb2.append(this.this$0.f43922a);
                        sb2.append(" but got ");
                        CharSequence charSequence = input;
                        int i12 = i10;
                        sb2.append(charSequence.subSequence(i12, i11 + i12 + 1).toString());
                        return sb2.toString();
                    }
                });
            }
        }
        return Integer.valueOf(str.length() + i10);
    }

    public final String toString() {
        return B7.b.g(new StringBuilder("'"), this.f43922a, '\'');
    }
}
