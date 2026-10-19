package kotlinx.datetime.format;

/* JADX INFO: renamed from: kotlinx.datetime.format.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: DateTimeComponents.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class C2721f implements InterfaceC2720e, C, G, kotlinx.datetime.internal.format.parser.c<C2721f> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f43813a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f43814b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s f43815c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f43816d;

    public C2721f() {
        this(0);
    }

    @Override // kotlinx.datetime.format.C
    public final void A(Integer num) {
        this.f43814b.f43838e = num;
    }

    @Override // kotlinx.datetime.format.G
    public final void B(Integer num) {
        this.f43815c.f43841b = num;
    }

    @Override // kotlinx.datetime.format.G
    public final void C(Integer num) {
        this.f43815c.f43843d = num;
    }

    @Override // kotlinx.datetime.format.C
    public final Integer a() {
        return this.f43814b.f43837d;
    }

    @Override // kotlinx.datetime.format.C
    public final Integer b() {
        return this.f43814b.f43834a;
    }

    @Override // kotlinx.datetime.format.C
    public final void c(AmPmMarker amPmMarker) {
        this.f43814b.f43836c = amPmMarker;
    }

    @Override // kotlinx.datetime.internal.format.parser.c
    public final C2721f d() {
        p pVarD = this.f43813a.d();
        r rVarD = this.f43814b.d();
        s sVar = this.f43815c;
        return new C2721f(pVarD, rVarD, new s(sVar.f43840a, sVar.f43841b, sVar.f43842c, sVar.f43843d), this.f43816d);
    }

    @Override // kotlinx.datetime.format.C
    public final AmPmMarker e() {
        return this.f43814b.f43836c;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C2721f) {
            C2721f c2721f = (C2721f) obj;
            if (kotlin.jvm.internal.i.a(c2721f.f43813a, this.f43813a) && kotlin.jvm.internal.i.a(c2721f.f43814b, this.f43814b) && kotlin.jvm.internal.i.a(c2721f.f43815c, this.f43815c) && kotlin.jvm.internal.i.a(c2721f.f43816d, this.f43816d)) {
                return true;
            }
        }
        return false;
    }

    @Override // kotlinx.datetime.format.G
    public final Integer f() {
        return this.f43815c.f43841b;
    }

    @Override // kotlinx.datetime.format.C
    public final void g(Va.a aVar) {
        this.f43814b.g(aVar);
    }

    @Override // kotlinx.datetime.format.C
    public final void h(Integer num) {
        this.f43814b.f43835b = num;
    }

    public final int hashCode() {
        int iHashCode = (this.f43813a.hashCode() ^ this.f43814b.hashCode()) ^ this.f43815c.hashCode();
        String str = this.f43816d;
        return iHashCode ^ (str != null ? str.hashCode() : 0);
    }

    @Override // kotlinx.datetime.format.InterfaceC2720e
    public final void i(Integer num) {
        this.f43813a.f43829b = num;
    }

    @Override // kotlinx.datetime.format.G
    public final Integer j() {
        return this.f43815c.f43843d;
    }

    @Override // kotlinx.datetime.format.C
    public final void k(Integer num) {
        this.f43814b.f43837d = num;
    }

    @Override // kotlinx.datetime.format.InterfaceC2720e
    public final Integer l() {
        return this.f43813a.f43828a;
    }

    @Override // kotlinx.datetime.format.InterfaceC2720e
    public final void m(Integer num) {
        this.f43813a.f43830c = num;
    }

    @Override // kotlinx.datetime.format.C
    public final Va.a n() {
        return this.f43814b.n();
    }

    @Override // kotlinx.datetime.format.C
    public final Integer o() {
        return this.f43814b.f43835b;
    }

    @Override // kotlinx.datetime.format.InterfaceC2720e
    public final Integer p() {
        return this.f43813a.f43831d;
    }

    @Override // kotlinx.datetime.format.InterfaceC2720e
    public final void q(Integer num) {
        this.f43813a.f43828a = num;
    }

    @Override // kotlinx.datetime.format.G
    public final Integer r() {
        return this.f43815c.f43842c;
    }

    @Override // kotlinx.datetime.format.InterfaceC2720e
    public final Integer s() {
        return this.f43813a.f43830c;
    }

    @Override // kotlinx.datetime.format.InterfaceC2720e
    public final Integer t() {
        return this.f43813a.f43829b;
    }

    @Override // kotlinx.datetime.format.C
    public final void u(Integer num) {
        this.f43814b.f43834a = num;
    }

    @Override // kotlinx.datetime.format.InterfaceC2720e
    public final void v(Integer num) {
        this.f43813a.f43831d = num;
    }

    @Override // kotlinx.datetime.format.G
    public final Boolean w() {
        return this.f43815c.f43840a;
    }

    @Override // kotlinx.datetime.format.G
    public final void x(Boolean bool) {
        this.f43815c.f43840a = bool;
    }

    @Override // kotlinx.datetime.format.C
    public final Integer y() {
        return this.f43814b.f43838e;
    }

    @Override // kotlinx.datetime.format.G
    public final void z(Integer num) {
        this.f43815c.f43842c = num;
    }

    public C2721f(p date, r time, s offset, String str) {
        kotlin.jvm.internal.i.e(date, "date");
        kotlin.jvm.internal.i.e(time, "time");
        kotlin.jvm.internal.i.e(offset, "offset");
        this.f43813a = date;
        this.f43814b = time;
        this.f43815c = offset;
        this.f43816d = str;
    }

    public /* synthetic */ C2721f(int i10) {
        this(new p(null, null, null, null), new r(0), new s(null, null, null, null), null);
    }
}
