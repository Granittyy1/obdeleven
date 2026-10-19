package kotlinx.datetime.internal.format;

/* JADX INFO: compiled from: FieldFormatDirective.kt */
/* JADX INFO: loaded from: classes2.dex */
public abstract class UnsignedIntFieldFormatDirective<Target> implements k<Target> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t<Target> f43876a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f43877b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f43878c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f43879d;

    /* JADX WARN: Multi-variable type inference failed */
    public UnsignedIntFieldFormatDirective(t<? super Target> field, int i10, Integer num) {
        kotlin.jvm.internal.i.e(field, "field");
        this.f43876a = field;
        this.f43877b = i10;
        this.f43878c = num;
        int i11 = field.f43942g;
        this.f43879d = i11;
        if (i10 < 0) {
            throw new IllegalArgumentException(J4.i.c(i10, "The minimum number of digits (", ") is negative").toString());
        }
        if (i11 < i10) {
            throw new IllegalArgumentException(("The maximum number of digits (" + i11 + ") is less than the minimum number of digits (" + i10 + ')').toString());
        }
        if (num == null || num.intValue() > i10) {
            return;
        }
        throw new IllegalArgumentException(("The space padding (" + num + ") should be more than the minimum number of digits (" + i10 + ')').toString());
    }

    @Override // kotlinx.datetime.internal.format.k
    public final Wa.e<Target> a() {
        Wa.k kVar = new Wa.k(new UnsignedIntFieldFormatDirective$formatter$formatter$1(1, this.f43876a.f43936a, b.class, "getterNotNull", "getterNotNull(Ljava/lang/Object;)Ljava/lang/Object;", 0), this.f43877b);
        Integer num = this.f43878c;
        return num != null ? new Wa.i(kVar, num.intValue()) : kVar;
    }

    @Override // kotlinx.datetime.internal.format.k
    public final kotlinx.datetime.internal.format.parser.l<Target> b() {
        Integer numValueOf = Integer.valueOf(this.f43877b);
        Integer numValueOf2 = Integer.valueOf(this.f43879d);
        t<Target> tVar = this.f43876a;
        return kotlin.jvm.internal.n.m(numValueOf, numValueOf2, this.f43878c, tVar.f43936a, tVar.f43939d, false);
    }

    @Override // kotlinx.datetime.internal.format.k
    public final /* bridge */ /* synthetic */ m c() {
        return this.f43876a;
    }
}
