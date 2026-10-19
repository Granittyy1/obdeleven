package kotlinx.serialization.json.internal;

import java.util.List;
import p037cb.E;
import p050db.AbstractC2184a;

/* JADX INFO: compiled from: TreeJsonDecoder.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class t extends r {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final p050db.z f44008k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final List<String> f44009l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f44010m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f44011n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(AbstractC2184a json, p050db.z value) {
        super(json, value, (String) null, 12);
        kotlin.jvm.internal.i.e(json, "json");
        kotlin.jvm.internal.i.e(value, "value");
        this.f44008k = value;
        List<String> listO0 = kotlin.collections.q.o0(value.f34699b.keySet());
        this.f44009l = listO0;
        this.f44010m = listO0.size() * 2;
        this.f44011n = -1;
    }

    @Override // kotlinx.serialization.json.internal.r, p037cb.Y
    public final String P(p011ab.e descriptor, int i10) {
        kotlin.jvm.internal.i.e(descriptor, "descriptor");
        return this.f44009l.get(i10 / 2);
    }

    @Override // kotlinx.serialization.json.internal.r, kotlinx.serialization.json.internal.AbstractC2728a
    public final p050db.h T(String tag) {
        kotlin.jvm.internal.i.e(tag, "tag");
        if (this.f44011n % 2 != 0) {
            return (p050db.h) kotlin.collections.y.q(tag, this.f44008k);
        }
        E e10 = p050db.i.f34682a;
        return new p050db.t(tag, true);
    }

    @Override // kotlinx.serialization.json.internal.r, kotlinx.serialization.json.internal.AbstractC2728a
    public final p050db.h V() {
        return this.f44008k;
    }

    @Override // kotlinx.serialization.json.internal.r
    /* JADX INFO: renamed from: Y */
    public final p050db.z V() {
        return this.f44008k;
    }

    @Override // kotlinx.serialization.json.internal.r, kotlinx.serialization.json.internal.AbstractC2728a, p024bb.a
    public final void c(p011ab.e descriptor) {
        kotlin.jvm.internal.i.e(descriptor, "descriptor");
    }

    @Override // kotlinx.serialization.json.internal.r, p024bb.a
    public final int o(p011ab.e descriptor) {
        kotlin.jvm.internal.i.e(descriptor, "descriptor");
        int i10 = this.f44011n;
        if (i10 >= this.f44010m - 1) {
            return -1;
        }
        int i11 = i10 + 1;
        this.f44011n = i11;
        return i11;
    }
}
