package p134k8;

import p109i8.b;

/* JADX INFO: compiled from: ControlUnitStatus.java */
/* JADX INFO: loaded from: classes3.dex */
public final class S0 implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Short f42669a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f42670b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f42671c;

    public S0(Short sh) {
        this.f42669a = sh;
    }

    @Override // p109i8.b
    public final S0 a() {
        S0 s10 = new S0(this.f42669a);
        s10.f42670b = this.f42670b;
        s10.f42671c = this.f42671c;
        return s10;
    }
}
