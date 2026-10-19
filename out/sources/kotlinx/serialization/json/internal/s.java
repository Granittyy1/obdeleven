package kotlinx.serialization.json.internal;

import p050db.AbstractC2184a;
import p050db.C2185b;

/* JADX INFO: compiled from: TreeJsonDecoder.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class s extends AbstractC2728a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C2185b f44005g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f44006h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f44007i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(AbstractC2184a json, C2185b value) {
        super(json, value, null);
        kotlin.jvm.internal.i.e(json, "json");
        kotlin.jvm.internal.i.e(value, "value");
        this.f44005g = value;
        this.f44006h = value.f34645b.size();
        this.f44007i = -1;
    }

    @Override // p037cb.Y
    public final String P(p011ab.e descriptor, int i10) {
        kotlin.jvm.internal.i.e(descriptor, "descriptor");
        return String.valueOf(i10);
    }

    @Override // kotlinx.serialization.json.internal.AbstractC2728a
    public final p050db.h T(String tag) {
        kotlin.jvm.internal.i.e(tag, "tag");
        return this.f44005g.f34645b.get(Integer.parseInt(tag));
    }

    @Override // kotlinx.serialization.json.internal.AbstractC2728a
    public final p050db.h V() {
        return this.f44005g;
    }

    @Override // p024bb.a
    public final int o(p011ab.e descriptor) {
        kotlin.jvm.internal.i.e(descriptor, "descriptor");
        int i10 = this.f44007i;
        if (i10 >= this.f44006h - 1) {
            return -1;
        }
        int i11 = i10 + 1;
        this.f44007i = i11;
        return i11;
    }
}
