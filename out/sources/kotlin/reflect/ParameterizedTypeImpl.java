package kotlin.reflect;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.collections.k;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: TypesJVM.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class ParameterizedTypeImpl implements ParameterizedType, Type {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Class<?> f43073b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Type f43074c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Type[] f43075d;

    public ParameterizedTypeImpl(Class cls, Type type, ArrayList arrayList) {
        this.f43073b = cls;
        this.f43074c = type;
        this.f43075d = (Type[]) arrayList.toArray(new Type[0]);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) obj;
            if (i.a(this.f43073b, parameterizedType.getRawType()) && i.a(this.f43074c, parameterizedType.getOwnerType())) {
                if (Arrays.equals(this.f43075d, parameterizedType.getActualTypeArguments())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type[] getActualTypeArguments() {
        return this.f43075d;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getOwnerType() {
        return this.f43074c;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getRawType() {
        return this.f43073b;
    }

    @Override // java.lang.reflect.Type
    public final String getTypeName() {
        StringBuilder sb2 = new StringBuilder();
        Class<?> cls = this.f43073b;
        Type type = this.f43074c;
        if (type != null) {
            sb2.append(a.a(type));
            sb2.append("$");
            sb2.append(cls.getSimpleName());
        } else {
            sb2.append(a.a(cls));
        }
        Type[] typeArr = this.f43075d;
        if (typeArr.length != 0) {
            k.U(typeArr, sb2, ", ", "<", ">", -1, "...", ParameterizedTypeImpl$getTypeName$1$1.f43076b);
        }
        String string = sb2.toString();
        i.d(string, "toString(...)");
        return string;
    }

    public final int hashCode() {
        int iHashCode = this.f43073b.hashCode();
        Type type = this.f43074c;
        return (iHashCode ^ (type != null ? type.hashCode() : 0)) ^ Arrays.hashCode(this.f43075d);
    }

    public final String toString() {
        return getTypeName();
    }
}
