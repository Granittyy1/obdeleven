package androidx.compose.material;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: AnchoredDraggable.kt */
/* JADX INFO: loaded from: classes.dex */
public final class F<T> implements InterfaceC1044u<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f11747a;

    public F(Map<T, Float> map) {
        this.f11747a = map;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    @Override // androidx.compose.material.InterfaceC1044u
    public final Object a(boolean z10, float f10) {
        T next;
        Iterator<T> it = this.f11747a.entrySet().iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                float fFloatValue = ((Number) ((Map.Entry) next).getValue()).floatValue();
                float f11 = z10 ? fFloatValue - f10 : f10 - fFloatValue;
                if (f11 < 0.0f) {
                    f11 = Float.POSITIVE_INFINITY;
                }
                do {
                    T next2 = it.next();
                    float fFloatValue2 = ((Number) ((Map.Entry) next2).getValue()).floatValue();
                    float f12 = z10 ? fFloatValue2 - f10 : f10 - fFloatValue2;
                    if (f12 < 0.0f) {
                        f12 = Float.POSITIVE_INFINITY;
                    }
                    if (Float.compare(f11, f12) > 0) {
                        next = next2;
                        f11 = f12;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry != null) {
            return entry.getKey();
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    @Override // androidx.compose.material.InterfaceC1044u
    public final float b() {
        Float fZ = kotlin.collections.q.Z(this.f11747a.values());
        if (fZ != null) {
            return fZ.floatValue();
        }
        return Float.NaN;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    @Override // androidx.compose.material.InterfaceC1044u
    public final T c(float f10) {
        T next;
        Iterator<T> it = this.f11747a.entrySet().iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                float fAbs = Math.abs(f10 - ((Number) ((Map.Entry) next).getValue()).floatValue());
                do {
                    T next2 = it.next();
                    float fAbs2 = Math.abs(f10 - ((Number) ((Map.Entry) next2).getValue()).floatValue());
                    if (Float.compare(fAbs, fAbs2) > 0) {
                        next = next2;
                        fAbs = fAbs2;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry != null) {
            return (T) entry.getKey();
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    @Override // androidx.compose.material.InterfaceC1044u
    public final float d(T t8) {
        Float f10 = (Float) this.f11747a.get(t8);
        if (f10 != null) {
            return f10.floatValue();
        }
        return Float.NaN;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    @Override // androidx.compose.material.InterfaceC1044u
    public final boolean e(T t8) {
        return this.f11747a.containsKey(t8);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof F)) {
            return false;
        }
        return kotlin.jvm.internal.i.a(this.f11747a, ((F) obj).f11747a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    @Override // androidx.compose.material.InterfaceC1044u
    public final float f() {
        Float fY = kotlin.collections.q.Y(this.f11747a.values());
        if (fY != null) {
            return fY.floatValue();
        }
        return Float.NaN;
    }

    public final int hashCode() {
        return this.f11747a.hashCode() * 31;
    }

    public final String toString() {
        return B6.c.e(new StringBuilder("MapDraggableAnchors("), this.f11747a, ')');
    }
}
