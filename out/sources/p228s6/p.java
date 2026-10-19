package p228s6;

import java.lang.annotation.Annotation;

/* JADX INFO: compiled from: Qualified.java */
/* JADX INFO: loaded from: classes3.dex */
public final class p<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class<? extends Annotation> f46977a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Class<T> f46978b;

    /* JADX INFO: compiled from: Qualified.java */
    public @interface a {
    }

    public p(Class<? extends Annotation> cls, Class<T> cls2) {
        this.f46977a = cls;
        this.f46978b = cls2;
    }

    public static <T> p<T> a(Class<T> cls) {
        return new p<>(a.class, cls);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p.class != obj.getClass()) {
            return false;
        }
        p pVar = (p) obj;
        if (this.f46978b.equals(pVar.f46978b)) {
            return this.f46977a.equals(pVar.f46977a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f46977a.hashCode() + (this.f46978b.hashCode() * 31);
    }

    public final String toString() {
        Class<T> cls = this.f46978b;
        Class<? extends Annotation> cls2 = this.f46977a;
        if (cls2 == a.class) {
            return cls.getName();
        }
        return "@" + cls2.getName() + " " + cls.getName();
    }
}
