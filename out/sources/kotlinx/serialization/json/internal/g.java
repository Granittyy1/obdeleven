package kotlinx.serialization.json.internal;

/* JADX INFO: compiled from: Composers.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class g extends f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f43985c;

    public g(q qVar, boolean z10) {
        super(qVar);
        this.f43985c = z10;
    }

    @Override // kotlinx.serialization.json.internal.f
    public final void j(String value) {
        kotlin.jvm.internal.i.e(value, "value");
        if (this.f43985c) {
            super.j(value);
        } else {
            h(value);
        }
    }
}
