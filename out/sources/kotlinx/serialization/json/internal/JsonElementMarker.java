package kotlinx.serialization.json.internal;

import p037cb.C1549v;

/* JADX INFO: compiled from: JsonElementMarker.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class JsonElementMarker {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1549v f43966a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f43967b;

    public JsonElementMarker(p011ab.e descriptor) {
        kotlin.jvm.internal.i.e(descriptor, "descriptor");
        this.f43966a = new C1549v(descriptor, new JsonElementMarker$origin$1(2, this, JsonElementMarker.class, "readIfAbsent", "readIfAbsent(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z", 0));
    }
}
