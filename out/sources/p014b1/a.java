package p014b1;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: CreationExtras.kt */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f20497a = new LinkedHashMap();

    /* JADX INFO: renamed from: b1.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: CreationExtras.kt */
    public static final class C0207a extends a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final C0207a f20498b = new C0207a();

        @Override // p014b1.a
        public final <T> T a(b<T> bVar) {
            return null;
        }
    }

    /* JADX INFO: compiled from: CreationExtras.kt */
    public interface b<T> {
    }

    public abstract <T> T a(b<T> bVar);

    public final boolean equals(Object obj) {
        return (obj instanceof a) && i.a(this.f20497a, ((a) obj).f20497a);
    }

    public final int hashCode() {
        return this.f20497a.hashCode();
    }

    public final String toString() {
        return "CreationExtras(extras=" + this.f20497a + ')';
    }
}
