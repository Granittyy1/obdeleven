package Oa;

import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NotImplementedError;

/* JADX INFO: compiled from: TypesJVM.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class p implements TypeVariable<GenericDeclaration>, Type {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f4872b;

    public p(n typeParameter) {
        kotlin.jvm.internal.i.e(typeParameter, "typeParameter");
        this.f4872b = typeParameter;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof TypeVariable) || !kotlin.jvm.internal.i.a(this.f4872b.getName(), ((TypeVariable) obj).getName())) {
            return false;
        }
        getGenericDeclaration();
        throw null;
    }

    @Override // java.lang.reflect.TypeVariable
    public final Type[] getBounds() {
        List<m> upperBounds = this.f4872b.getUpperBounds();
        ArrayList arrayList = new ArrayList(kotlin.collections.m.y(upperBounds, 10));
        Iterator<T> it = upperBounds.iterator();
        while (it.hasNext()) {
            arrayList.add(kotlin.reflect.a.b((m) it.next(), true));
        }
        return (Type[]) arrayList.toArray(new Type[0]);
    }

    @Override // java.lang.reflect.TypeVariable
    public final GenericDeclaration getGenericDeclaration() {
        throw new NotImplementedError(B7.b.c("An operation is not implemented: ", "getGenericDeclaration() is not yet supported for type variables created from KType: " + this.f4872b));
    }

    @Override // java.lang.reflect.TypeVariable
    public final String getName() {
        return this.f4872b.getName();
    }

    @Override // java.lang.reflect.Type
    public final String getTypeName() {
        return this.f4872b.getName();
    }

    public final int hashCode() {
        this.f4872b.getName().hashCode();
        getGenericDeclaration();
        throw null;
    }

    public final String toString() {
        return this.f4872b.getName();
    }
}
