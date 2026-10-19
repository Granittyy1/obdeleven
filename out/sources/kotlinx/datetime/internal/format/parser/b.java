package kotlinx.datetime.internal.format.parser;

/* JADX INFO: compiled from: NumberConsumer.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class b<Receiver> extends e<Receiver> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f43901c;

    public b(String str) {
        super("the predefined string ".concat(str), Integer.valueOf(str.length()));
        this.f43901c = str;
    }

    @Override // kotlinx.datetime.internal.format.parser.e
    public final f a(c cVar, String input) {
        kotlin.jvm.internal.i.e(input, "input");
        String str = this.f43901c;
        if (input.equals(str)) {
            return null;
        }
        return new f.e(str);
    }
}
