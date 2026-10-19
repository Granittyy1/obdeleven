package p023ba;

import java.lang.reflect.Type;
import kotlin.jvm.internal.TypeReference;
import kotlin.jvm.internal.c;

/* JADX INFO: compiled from: Type.kt */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f20638a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Type f20639b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TypeReference f20640c;

    public a(c cVar, Type type, TypeReference typeReference) {
        this.f20638a = cVar;
        this.f20639b = type;
        this.f20640c = typeReference;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f20638a.equals(aVar.f20638a) && this.f20639b.equals(aVar.f20639b) && this.f20640c.equals(aVar.f20640c);
    }

    public final int hashCode() {
        return this.f20640c.hashCode() + ((this.f20639b.hashCode() + (this.f20638a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "TypeInfo(type=" + this.f20638a + ", reifiedType=" + this.f20639b + ", kotlinType=" + this.f20640c + ')';
    }
}
