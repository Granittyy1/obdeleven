package kotlinx.datetime.internal.format.parser;

import p293xa.r;

/* JADX INFO: compiled from: ParserOperation.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class o<Output> implements k<Output> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Ia.p<Output, Boolean, r> f43927a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f43928b;

    public o(String whatThisExpects, Ia.p pVar) {
        kotlin.jvm.internal.i.e(whatThisExpects, "whatThisExpects");
        this.f43927a = pVar;
        this.f43928b = whatThisExpects;
    }

    @Override // kotlinx.datetime.internal.format.parser.k
    public final Object a(c cVar, String input, int i10) {
        kotlin.jvm.internal.i.e(input, "input");
        if (i10 >= input.length()) {
            return Integer.valueOf(i10);
        }
        final char cCharAt = input.charAt(i10);
        Ia.p<Output, Boolean, r> pVar = this.f43927a;
        if (cCharAt == '-') {
            pVar.invoke(cVar, Boolean.TRUE);
            return Integer.valueOf(i10 + 1);
        }
        if (cCharAt != '+') {
            return new h(i10, new Ia.a<String>(this) { // from class: kotlinx.datetime.internal.format.parser.SignParser$consume$1
                final /* synthetic */ o<Object> this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                    this.this$0 = this;
                }

                @Override // Ia.a
                public final String invoke() {
                    return "Expected " + this.this$0.f43928b + " but got " + cCharAt;
                }
            });
        }
        pVar.invoke(cVar, Boolean.FALSE);
        return Integer.valueOf(i10 + 1);
    }

    public final String toString() {
        return this.f43928b;
    }
}
