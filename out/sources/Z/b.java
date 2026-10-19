package Z;

import java.util.Locale;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: Locale.kt */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Locale f7670a;

    public b(Locale locale) {
        this.f7670a = locale;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof b)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return i.a(this.f7670a.toLanguageTag(), ((b) obj).f7670a.toLanguageTag());
    }

    public final int hashCode() {
        return this.f7670a.toLanguageTag().hashCode();
    }

    public final String toString() {
        return this.f7670a.toLanguageTag();
    }
}
