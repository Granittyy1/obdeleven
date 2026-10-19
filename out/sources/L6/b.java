package L6;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: FieldDescriptor.java */
/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4467a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map<Class<?>, Object> f4468b;

    public b(String str, Map<Class<?>, Object> map) {
        this.f4467a = str;
        this.f4468b = map;
    }

    public static b a(String str) {
        return new b(str, Collections.emptyMap());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f4467a.equals(bVar.f4467a) && this.f4468b.equals(bVar.f4468b);
    }

    public final int hashCode() {
        return this.f4468b.hashCode() + (this.f4467a.hashCode() * 31);
    }

    public final String toString() {
        return "FieldDescriptor{name=" + this.f4467a + ", properties=" + this.f4468b.values() + "}";
    }
}
