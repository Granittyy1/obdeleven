package Y8;

import Q8.d;
import kotlin.jvm.internal.i;
import p005a4.q;

/* JADX INFO: compiled from: Text.kt */
/* JADX INFO: loaded from: classes3.dex */
public abstract class a {

    /* JADX INFO: renamed from: Y8.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: Text.kt */
    public static final class C0108a extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f7635a;

        public C0108a(int i10) {
            this.f7635a = i10;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0108a) && this.f7635a == ((C0108a) obj).f7635a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f7635a);
        }

        public final String toString() {
            return q.c(new StringBuilder("Resource(resource="), this.f7635a, ")");
        }
    }

    /* JADX INFO: compiled from: Text.kt */
    public static final class b extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f7636a;

        public b(String str) {
            this.f7636a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && i.a(this.f7636a, ((b) obj).f7636a);
        }

        public final int hashCode() {
            return this.f7636a.hashCode();
        }

        public final String toString() {
            return d.a(new StringBuilder("String(string="), this.f7636a, ")");
        }
    }
}
