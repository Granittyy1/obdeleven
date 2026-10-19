package androidx.compose.ui.graphics;

/* JADX INFO: compiled from: Outline.kt */
/* JADX INFO: loaded from: classes.dex */
public abstract class b0 {

    /* JADX INFO: compiled from: Outline.kt */
    public static final class a extends b0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final C1144u f13539a;

        public a(C1144u c1144u) {
            this.f13539a = c1144u;
        }

        @Override // androidx.compose.ui.graphics.b0
        public final I.f a() {
            return this.f13539a.u();
        }
    }

    /* JADX INFO: compiled from: Outline.kt */
    public static final class b extends b0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final I.f f13540a;

        public b(I.f fVar) {
            this.f13540a = fVar;
        }

        @Override // androidx.compose.ui.graphics.b0
        public final I.f a() {
            return this.f13540a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                return kotlin.jvm.internal.i.a(this.f13540a, ((b) obj).f13540a);
            }
            return false;
        }

        public final int hashCode() {
            return this.f13540a.hashCode();
        }
    }

    /* JADX INFO: compiled from: Outline.kt */
    public static final class c extends b0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final I.g f13541a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final C1144u f13542b;

        public c(I.g gVar) {
            C1144u c1144uA;
            this.f13541a = gVar;
            if (kotlinx.coroutines.C.r(gVar)) {
                c1144uA = null;
            } else {
                c1144uA = C1146w.a();
                c1144uA.q(gVar, Path.Direction.f13511b);
            }
            this.f13542b = c1144uA;
        }

        @Override // androidx.compose.ui.graphics.b0
        public final I.f a() {
            I.g gVar = this.f13541a;
            return new I.f(gVar.f3761a, gVar.f3762b, gVar.f3763c, gVar.f3764d);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                return kotlin.jvm.internal.i.a(this.f13541a, ((c) obj).f13541a);
            }
            return false;
        }

        public final int hashCode() {
            return this.f13541a.hashCode();
        }
    }

    public abstract I.f a();
}
