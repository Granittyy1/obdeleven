package androidx.datastore.preferences.core;

import java.util.Map;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: Preferences.kt */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: compiled from: Preferences.kt */
    public static final class a<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f17087a;

        public a(String str) {
            this.f17087a = str;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            return i.a(this.f17087a, ((a) obj).f17087a);
        }

        public final int hashCode() {
            return this.f17087a.hashCode();
        }

        public final String toString() {
            return this.f17087a;
        }
    }

    /* JADX INFO: compiled from: Preferences.kt */
    public static final class b<T> {
    }

    public abstract Map<a<?>, Object> a();

    public abstract <T> T b(a<T> aVar);
}
