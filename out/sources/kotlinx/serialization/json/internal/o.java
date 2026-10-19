package kotlinx.serialization.json.internal;

import p050db.AbstractC2184a;

/* JADX INFO: compiled from: TreeJsonDecoder.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class o extends AbstractC2728a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final p050db.h f43999g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(AbstractC2184a json, p050db.h value, String str) {
        super(json, value, str);
        kotlin.jvm.internal.i.e(json, "json");
        kotlin.jvm.internal.i.e(value, "value");
        this.f43999g = value;
        this.f22590b.add("primitive");
    }

    @Override // kotlinx.serialization.json.internal.AbstractC2728a
    public final p050db.h T(String tag) {
        kotlin.jvm.internal.i.e(tag, "tag");
        if (tag == "primitive") {
            return this.f43999g;
        }
        throw new IllegalArgumentException("This input can only handle primitives with 'primitive' tag");
    }

    @Override // kotlinx.serialization.json.internal.AbstractC2728a
    public final p050db.h V() {
        return this.f43999g;
    }

    @Override // p024bb.a
    public final int o(p011ab.e descriptor) {
        kotlin.jvm.internal.i.e(descriptor, "descriptor");
        return 0;
    }
}
