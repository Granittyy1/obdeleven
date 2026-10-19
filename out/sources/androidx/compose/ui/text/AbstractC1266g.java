package androidx.compose.ui.text;

/* JADX INFO: renamed from: androidx.compose.ui.text.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: LinkAnnotation.kt */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1266g implements C1260a.InterfaceC0160a {

    /* JADX INFO: renamed from: androidx.compose.ui.text.g$a */
    /* JADX INFO: compiled from: LinkAnnotation.kt */
    public static final class a extends AbstractC1266g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f15464a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final C f15465b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final InterfaceC1267h f15466c;

        public a(String str, C c10, InterfaceC1267h interfaceC1267h) {
            this.f15464a = str;
            this.f15465b = c10;
            this.f15466c = interfaceC1267h;
        }

        @Override // androidx.compose.ui.text.AbstractC1266g
        public final InterfaceC1267h a() {
            return this.f15466c;
        }

        @Override // androidx.compose.ui.text.AbstractC1266g
        public final C b() {
            return this.f15465b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (!kotlin.jvm.internal.i.a(this.f15464a, aVar.f15464a)) {
                return false;
            }
            if (kotlin.jvm.internal.i.a(this.f15465b, aVar.f15465b)) {
                return kotlin.jvm.internal.i.a(this.f15466c, aVar.f15466c);
            }
            return false;
        }

        public final int hashCode() {
            int iHashCode = this.f15464a.hashCode() * 31;
            C c10 = this.f15465b;
            int iHashCode2 = (iHashCode + (c10 != null ? c10.hashCode() : 0)) * 31;
            InterfaceC1267h interfaceC1267h = this.f15466c;
            return iHashCode2 + (interfaceC1267h != null ? interfaceC1267h.hashCode() : 0);
        }

        public final String toString() {
            return B7.b.g(new StringBuilder("LinkAnnotation.Clickable(tag="), this.f15464a, ')');
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.text.g$b */
    /* JADX INFO: compiled from: LinkAnnotation.kt */
    public static final class b extends AbstractC1266g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f15467a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final C f15468b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final InterfaceC1267h f15469c = null;

        public b(String str, C c10) {
            this.f15467a = str;
            this.f15468b = c10;
        }

        @Override // androidx.compose.ui.text.AbstractC1266g
        public final InterfaceC1267h a() {
            return this.f15469c;
        }

        @Override // androidx.compose.ui.text.AbstractC1266g
        public final C b() {
            return this.f15468b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (!kotlin.jvm.internal.i.a(this.f15467a, bVar.f15467a)) {
                return false;
            }
            if (kotlin.jvm.internal.i.a(this.f15468b, bVar.f15468b)) {
                return kotlin.jvm.internal.i.a(this.f15469c, bVar.f15469c);
            }
            return false;
        }

        public final int hashCode() {
            int iHashCode = this.f15467a.hashCode() * 31;
            C c10 = this.f15468b;
            int iHashCode2 = (iHashCode + (c10 != null ? c10.hashCode() : 0)) * 31;
            InterfaceC1267h interfaceC1267h = this.f15469c;
            return iHashCode2 + (interfaceC1267h != null ? interfaceC1267h.hashCode() : 0);
        }

        public final String toString() {
            return B7.b.g(new StringBuilder("LinkAnnotation.Url(url="), this.f15467a, ')');
        }
    }

    public abstract InterfaceC1267h a();

    public abstract C b();
}
