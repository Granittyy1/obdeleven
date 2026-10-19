package p131k5;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class B2 extends AbstractC2549p {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C2587y2 f41722e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B2(C2587y2 c2587y2, C2523i1 c2523i1) {
        super(c2523i1);
        this.f41722e = c2587y2;
    }

    @Override // p131k5.AbstractC2549p
    public final void c() {
        C2587y2 c2587y2 = this.f41722e;
        c2587y2.p();
        if (c2587y2.E()) {
            c2587y2.d().f41719n.c("Inactivity, disconnecting from the service");
            c2587y2.D();
        }
    }
}
