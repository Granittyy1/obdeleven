package androidx.compose.foundation.contextmenu;

import androidx.compose.runtime.C1085f0;
import androidx.compose.runtime.J0;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: ContextMenuState.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1085f0 f9889a;

    /* JADX INFO: compiled from: ContextMenuState.android.kt */
    public static abstract class a {

        /* JADX INFO: renamed from: androidx.compose.foundation.contextmenu.g$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: ContextMenuState.android.kt */
        public static final class C0123a extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0123a f9890a = new C0123a();

            public final String toString() {
                return "Closed";
            }
        }

        /* JADX INFO: compiled from: ContextMenuState.android.kt */
        public static final class b extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final long f9891a;

            public b(long j) {
                this.f9891a = j;
                if ((j & 9223372034707292159L) != 9205357640488583168L) {
                    return;
                }
                p245u.c.c("ContextMenuState.Status should never be open with an unspecified offset. Use ContextMenuState.Status.Closed instead.");
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                return I.d.b(this.f9891a, ((b) obj).f9891a);
            }

            public final int hashCode() {
                return Long.hashCode(this.f9891a);
            }

            public final String toString() {
                return "Open(offset=" + ((Object) I.d.i(this.f9891a)) + ')';
            }
        }
    }

    public g() {
        this(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g) {
            return i.a((a) ((g) obj).f9889a.getValue(), (a) this.f9889a.getValue());
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        return ((a) this.f9889a.getValue()).hashCode();
    }

    public final String toString() {
        return "ContextMenuState(status=" + ((a) this.f9889a.getValue()) + ')';
    }

    public g(int i10) {
        this.f9889a = J0.f(a.C0123a.f9890a);
    }
}
