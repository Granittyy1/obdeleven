package coil.request;

import java.util.Map;
import kotlin.collections.y;

/* JADX INFO: compiled from: Tags.kt */
/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p f23127b = new p(y.p());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<Class<?>, Object> f23128a;

    public p(Map<Class<?>, ? extends Object> map) {
        this.f23128a = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof p) {
            if (kotlin.jvm.internal.i.a(this.f23128a, ((p) obj).f23128a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f23128a.hashCode();
    }

    public final String toString() {
        return "Tags(tags=" + this.f23128a + ')';
    }
}
