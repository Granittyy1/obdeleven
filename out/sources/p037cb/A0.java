package p037cb;

import J4.i;
import Ya.b;
import kotlin.Triple;
import kotlinx.serialization.SerializationException;
import p011ab.e;
import p011ab.h;
import p011ab.l;
import p024bb.a;
import p024bb.c;
import p024bb.d;

/* JADX INFO: compiled from: Tuples.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class A0<A, B, C> implements b<Triple<? extends A, ? extends B, ? extends C>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b<A> f22532a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b<B> f22533b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b<C> f22534c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final h f22535d = l.b("kotlin.Triple", new e[0], new z0(0, this));

    public A0(b<A> bVar, b<B> bVar2, b<C> bVar3) {
        this.f22532a = bVar;
        this.f22533b = bVar2;
        this.f22534c = bVar3;
    }

    @Override // Ya.a
    public final Object deserialize(c cVar) {
        h hVar = this.f22535d;
        a aVarA = cVar.a(hVar);
        Object obj = B0.f22537a;
        Object objE = obj;
        Object objE2 = objE;
        Object objE3 = objE2;
        while (true) {
            int iO = aVarA.o(hVar);
            if (iO == -1) {
                aVarA.c(hVar);
                if (objE == obj) {
                    throw new SerializationException("Element 'first' is missing");
                }
                if (objE2 == obj) {
                    throw new SerializationException("Element 'second' is missing");
                }
                if (objE3 != obj) {
                    return new Triple(objE, objE2, objE3);
                }
                throw new SerializationException("Element 'third' is missing");
            }
            if (iO == 0) {
                objE = aVarA.e(hVar, 0, this.f22532a, null);
            } else if (iO == 1) {
                objE2 = aVarA.e(hVar, 1, this.f22533b, null);
            } else {
                if (iO != 2) {
                    throw new SerializationException(i.b(iO, "Unexpected index "));
                }
                objE3 = aVarA.e(hVar, 2, this.f22534c, null);
            }
        }
    }

    @Override // Ya.l, Ya.a
    public final e getDescriptor() {
        return this.f22535d;
    }

    @Override // Ya.l
    public final void serialize(d dVar, Object obj) {
        Triple value = (Triple) obj;
        kotlin.jvm.internal.i.e(value, "value");
        h hVar = this.f22535d;
        p024bb.b bVarA = dVar.a(hVar);
        bVarA.s(hVar, 0, this.f22532a, value.d());
        bVarA.s(hVar, 1, this.f22533b, value.e());
        bVarA.s(hVar, 2, this.f22534c, value.f());
        bVarA.c(hVar);
    }
}
