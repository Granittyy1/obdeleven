package p037cb;

import Ya.b;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.i;
import kotlinx.serialization.SerializationException;
import p011ab.e;
import p024bb.c;
import p024bb.d;
import p293xa.r;

/* JADX INFO: renamed from: cb.e0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: ObjectSerializer.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class C1522e0<T> implements b<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f22603a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EmptyList f22604b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f22605c;

    public C1522e0(r objectInstance) {
        i.e(objectInstance, "objectInstance");
        this.f22603a = objectInstance;
        this.f22604b = EmptyList.f42983b;
        this.f22605c = a.b(LazyThreadSafetyMode.f42972c, new C1518c0(0, this));
    }

    @Override // Ya.a
    public final T deserialize(c cVar) {
        e descriptor = getDescriptor();
        p024bb.a aVarA = cVar.a(descriptor);
        int iO = aVarA.o(getDescriptor());
        if (iO != -1) {
            throw new SerializationException(J4.i.b(iO, "Unexpected index "));
        }
        r rVar = r.f47939a;
        aVarA.c(descriptor);
        return (T) this.f22603a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, xa.g] */
    @Override // Ya.l, Ya.a
    public final e getDescriptor() {
        return (e) this.f22605c.getValue();
    }

    @Override // Ya.l
    public final void serialize(d dVar, T value) {
        i.e(value, "value");
        dVar.a(getDescriptor()).c(getDescriptor());
    }
}
