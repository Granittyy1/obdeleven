package kotlinx.datetime.format;

/* JADX INFO: compiled from: LocalDateTimeFormat.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class q implements InterfaceC2720e, C, kotlinx.datetime.internal.format.parser.c<q> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f43832a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f43833b;

    public q() {
        this(0);
    }

    @Override // kotlinx.datetime.format.C
    public final void A(Integer num) {
        this.f43833b.f43838e = num;
    }

    @Override // kotlinx.datetime.format.C
    public final Integer a() {
        return this.f43833b.f43837d;
    }

    @Override // kotlinx.datetime.format.C
    public final Integer b() {
        return this.f43833b.f43834a;
    }

    @Override // kotlinx.datetime.format.C
    public final void c(AmPmMarker amPmMarker) {
        this.f43833b.f43836c = amPmMarker;
    }

    @Override // kotlinx.datetime.internal.format.parser.c
    public final q d() {
        return new q(this.f43832a.d(), this.f43833b.d());
    }

    @Override // kotlinx.datetime.format.C
    public final AmPmMarker e() {
        return this.f43833b.f43836c;
    }

    @Override // kotlinx.datetime.format.C
    public final void g(Va.a aVar) {
        this.f43833b.g(aVar);
    }

    @Override // kotlinx.datetime.format.C
    public final void h(Integer num) {
        this.f43833b.f43835b = num;
    }

    @Override // kotlinx.datetime.format.InterfaceC2720e
    public final void i(Integer num) {
        this.f43832a.f43829b = num;
    }

    @Override // kotlinx.datetime.format.C
    public final void k(Integer num) {
        this.f43833b.f43837d = num;
    }

    @Override // kotlinx.datetime.format.InterfaceC2720e
    public final Integer l() {
        return this.f43832a.f43828a;
    }

    @Override // kotlinx.datetime.format.InterfaceC2720e
    public final void m(Integer num) {
        this.f43832a.f43830c = num;
    }

    @Override // kotlinx.datetime.format.C
    public final Va.a n() {
        return this.f43833b.n();
    }

    @Override // kotlinx.datetime.format.C
    public final Integer o() {
        return this.f43833b.f43835b;
    }

    @Override // kotlinx.datetime.format.InterfaceC2720e
    public final Integer p() {
        return this.f43832a.f43831d;
    }

    @Override // kotlinx.datetime.format.InterfaceC2720e
    public final void q(Integer num) {
        this.f43832a.f43828a = num;
    }

    @Override // kotlinx.datetime.format.InterfaceC2720e
    public final Integer s() {
        return this.f43832a.f43830c;
    }

    @Override // kotlinx.datetime.format.InterfaceC2720e
    public final Integer t() {
        return this.f43832a.f43829b;
    }

    @Override // kotlinx.datetime.format.C
    public final void u(Integer num) {
        this.f43833b.f43834a = num;
    }

    @Override // kotlinx.datetime.format.InterfaceC2720e
    public final void v(Integer num) {
        this.f43832a.f43831d = num;
    }

    @Override // kotlinx.datetime.format.C
    public final Integer y() {
        return this.f43833b.f43838e;
    }

    public q(p date, r time) {
        kotlin.jvm.internal.i.e(date, "date");
        kotlin.jvm.internal.i.e(time, "time");
        this.f43832a = date;
        this.f43833b = time;
    }

    public /* synthetic */ q(int i10) {
        this(new p(null, null, null, null), new r(0));
    }
}
