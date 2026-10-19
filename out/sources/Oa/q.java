package Oa;

import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Arrays;

/* JADX INFO: compiled from: TypesJVM.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class q implements WildcardType, Type {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final q f4873d = new q(null, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Type f4874b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Type f4875c;

    public q(Type type, Type type2) {
        this.f4874b = type;
        this.f4875c = type2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof WildcardType) {
            WildcardType wildcardType = (WildcardType) obj;
            if (Arrays.equals(getUpperBounds(), wildcardType.getUpperBounds()) && Arrays.equals(getLowerBounds(), wildcardType.getLowerBounds())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getLowerBounds() {
        Type type = this.f4875c;
        return type == null ? new Type[0] : new Type[]{type};
    }

    @Override // java.lang.reflect.Type
    public final String getTypeName() {
        Type type = this.f4875c;
        if (type != null) {
            return "? super " + kotlin.reflect.a.a(type);
        }
        Type type2 = this.f4874b;
        if (type2 == null || kotlin.jvm.internal.i.a(type2, Object.class)) {
            return "?";
        }
        return "? extends " + kotlin.reflect.a.a(type2);
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getUpperBounds() {
        Type type = this.f4874b;
        if (type == null) {
            type = Object.class;
        }
        return new Type[]{type};
    }

    public final int hashCode() {
        return Arrays.hashCode(getUpperBounds()) ^ Arrays.hashCode(getLowerBounds());
    }

    public final String toString() {
        return getTypeName();
    }
}
