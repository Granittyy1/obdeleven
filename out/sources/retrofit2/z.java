package retrofit2;

import java.lang.annotation.Annotation;

/* JADX INFO: compiled from: SkipCallbackExecutorImpl.java */
/* JADX INFO: loaded from: classes2.dex */
public final class z implements y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final z f46837a = new z();

    @Override // java.lang.annotation.Annotation
    public final Class<? extends Annotation> annotationType() {
        return y.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        return obj instanceof y;
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return 0;
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@" + y.class.getName() + "()";
    }
}
