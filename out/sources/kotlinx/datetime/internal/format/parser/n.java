package kotlinx.datetime.internal.format.parser;

/* JADX INFO: compiled from: NumberConsumer.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class n<Receiver> extends e<Receiver> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final kotlinx.datetime.internal.format.b f43923c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f43924d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f43925e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f43926f;

    public n(kotlinx.datetime.internal.format.b bVar, String str) {
        super(str, 2);
        this.f43923c = bVar;
        int i10 = Va.b.f6876a[2];
        this.f43924d = i10;
        int i11 = 2000 % i10;
        this.f43925e = i11;
        this.f43926f = 2000 - i11;
    }

    @Override // kotlinx.datetime.internal.format.parser.e
    public final f a(c cVar, String input) {
        int iIntValue;
        kotlin.jvm.internal.i.e(input, "input");
        Integer numA = kotlin.text.l.A(input);
        if (numA == null) {
            return f.b.f43908a;
        }
        int iIntValue2 = numA.intValue();
        int i10 = this.f43925e;
        int i11 = this.f43926f;
        if (iIntValue2 >= i10) {
            iIntValue = numA.intValue();
        } else {
            i11 += this.f43924d;
            iIntValue = numA.intValue();
        }
        Field fieldC = this.f43923c.c(cVar, Integer.valueOf(iIntValue + i11));
        if (fieldC == 0) {
            return null;
        }
        return new f.a(fieldC);
    }

    @Override // kotlinx.datetime.internal.format.parser.e
    public final Integer b() {
        return 2;
    }
}
