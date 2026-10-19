package p029c3;

import coil.request.e;
import coil.request.h;
import coil.request.o;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: NoneTransition.kt */
/* JADX INFO: loaded from: classes.dex */
public final class b implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f22287a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f22288b;

    /* JADX INFO: compiled from: NoneTransition.kt */
    public static final class a implements c.a {
        @Override // c3.c.a
        public final c a(d dVar, h hVar) {
            return new b(dVar, hVar);
        }

        public final boolean equals(Object obj) {
            return obj instanceof a;
        }

        public final int hashCode() {
            return a.class.hashCode();
        }
    }

    public b(d dVar, h hVar) {
        this.f22287a = dVar;
        this.f22288b = hVar;
    }

    @Override // p029c3.c
    public final void a() {
        h hVar = this.f22288b;
        boolean z10 = hVar instanceof o;
        d dVar = this.f22287a;
        if (z10) {
            dVar.onSuccess(((o) hVar).f23120a);
        } else {
            if (!(hVar instanceof e)) {
                throw new NoWhenBranchMatchedException();
            }
            dVar.onError(((e) hVar).f23034a);
        }
    }
}
