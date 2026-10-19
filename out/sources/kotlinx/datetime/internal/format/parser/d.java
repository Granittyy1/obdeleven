package kotlinx.datetime.internal.format.parser;

/* JADX INFO: compiled from: NumberConsumer.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class d<Receiver> extends e<Receiver> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f43902c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f43903d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final kotlinx.datetime.internal.format.b f43904e;

    /* JADX WARN: Illegal instructions before constructor call */
    public d(Integer num, Integer num2, kotlinx.datetime.internal.format.b setter, String name) {
        kotlin.jvm.internal.i.e(setter, "setter");
        kotlin.jvm.internal.i.e(name, "name");
        Integer num3 = num.equals(num2) ? num : null;
        super(name, num3);
        this.f43902c = num;
        this.f43903d = num2;
        this.f43904e = setter;
        if (new Na.i(1, 9, 1).A(num.intValue())) {
            return;
        }
        throw new IllegalArgumentException(("Invalid length for field " + name + ": " + num3).toString());
    }

    @Override // kotlinx.datetime.internal.format.parser.e
    public final f a(c cVar, String input) {
        kotlin.jvm.internal.i.e(input, "input");
        Integer num = this.f43902c;
        if (num != null && input.length() < num.intValue()) {
            return new f.c(num.intValue());
        }
        Integer num2 = this.f43903d;
        if (num2 != null && input.length() > num2.intValue()) {
            return new f.d(num2.intValue());
        }
        Integer numA = kotlin.text.l.A(input);
        if (numA == null) {
            return new f.d(9);
        }
        Field fieldC = this.f43904e.c(cVar, new Va.a(numA.intValue(), input.length()));
        if (fieldC == 0) {
            return null;
        }
        return new f.a(fieldC);
    }
}
