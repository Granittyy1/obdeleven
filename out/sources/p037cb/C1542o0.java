package p037cb;

import kotlin.jvm.internal.i;
import p011ab.e;

/* JADX INFO: renamed from: cb.o0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: CollectionDescriptors.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class C1542o0 extends O {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f22642b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1542o0(e primitive) {
        super(primitive);
        i.e(primitive, "primitive");
        this.f22642b = primitive.a() + "Array";
    }

    @Override // p011ab.e
    public final String a() {
        return this.f22642b;
    }
}
