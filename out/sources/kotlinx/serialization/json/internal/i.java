package kotlinx.serialization.json.internal;

import p050db.AbstractC2184a;

/* JADX INFO: compiled from: Composers.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class i extends f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AbstractC2184a f43987c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f43988d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(q qVar, AbstractC2184a json) {
        super(qVar);
        kotlin.jvm.internal.i.e(json, "json");
        this.f43987c = json;
    }

    @Override // kotlinx.serialization.json.internal.f
    public final void a() {
        this.f43984b = true;
        this.f43988d++;
    }

    @Override // kotlinx.serialization.json.internal.f
    public final void b() {
        this.f43984b = false;
        h("\n");
        int i10 = this.f43988d;
        for (int i11 = 0; i11 < i10; i11++) {
            h(this.f43987c.f34642a.f34673g);
        }
    }

    @Override // kotlinx.serialization.json.internal.f
    public final void c() {
        if (this.f43984b) {
            this.f43984b = false;
        } else {
            b();
        }
    }

    @Override // kotlinx.serialization.json.internal.f
    public final void k() {
        e(' ');
    }

    @Override // kotlinx.serialization.json.internal.f
    public final void l() {
        this.f43988d--;
    }
}
