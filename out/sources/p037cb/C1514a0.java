package p037cb;

import Ya.b;
import kotlin.jvm.internal.i;
import kotlinx.serialization.SerializationException;
import p011ab.e;
import p024bb.c;
import p024bb.d;

/* JADX INFO: renamed from: cb.a0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: BuiltInSerializers.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class C1514a0 implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1514a0 f22595a = new C1514a0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Z f22596b = Z.f22592a;

    @Override // Ya.a
    public final Object deserialize(c cVar) {
        throw new SerializationException("'kotlin.Nothing' does not have instances");
    }

    @Override // Ya.l, Ya.a
    public final e getDescriptor() {
        return f22596b;
    }

    @Override // Ya.l
    public final void serialize(d dVar, Object obj) {
        Void value = (Void) obj;
        i.e(value, "value");
        throw new SerializationException("'kotlin.Nothing' cannot be serialized");
    }
}
