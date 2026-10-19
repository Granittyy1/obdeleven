package p029c3;

import U2.b;
import android.graphics.drawable.Drawable;
import coil.decode.DataSource;
import coil.request.e;
import coil.request.h;
import coil.request.o;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: CrossfadeTransition.kt */
/* JADX INFO: loaded from: classes.dex */
public final class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f22281a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f22282b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f22283c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f22284d;

    /* JADX INFO: renamed from: c3.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: CrossfadeTransition.kt */
    public static final class C0235a implements c.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f22285b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f22286c;

        public C0235a() {
            this(0, 3);
        }

        @Override // c3.c.a
        public final c a(d dVar, h hVar) {
            if (hVar instanceof o) {
                return ((o) hVar).f23122c == DataSource.f22857b ? new b(dVar, hVar) : new a(dVar, hVar, this.f22285b, this.f22286c);
            }
            return new b(dVar, hVar);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C0235a) {
                C0235a c0235a = (C0235a) obj;
                if (this.f22285b == c0235a.f22285b && this.f22286c == c0235a.f22286c) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f22286c) + (this.f22285b * 31);
        }

        public C0235a(int i10, int i11) {
            i10 = (i11 & 1) != 0 ? 100 : i10;
            this.f22285b = i10;
            this.f22286c = false;
            if (i10 <= 0) {
                throw new IllegalArgumentException("durationMillis must be > 0.");
            }
        }
    }

    public a(d dVar, h hVar, int i10, boolean z10) {
        this.f22281a = dVar;
        this.f22282b = hVar;
        this.f22283c = i10;
        this.f22284d = z10;
        if (i10 <= 0) {
            throw new IllegalArgumentException("durationMillis must be > 0.");
        }
    }

    @Override // p029c3.c
    public final void a() {
        d dVar = this.f22281a;
        Drawable drawableD = dVar.d();
        h hVar = this.f22282b;
        boolean z10 = hVar instanceof o;
        b bVar = new b(drawableD, hVar.a(), hVar.b().f23070z, this.f22283c, (z10 && ((o) hVar).f23126g) ? false : true, this.f22284d);
        if (z10) {
            dVar.onSuccess(bVar);
        } else {
            if (!(hVar instanceof e)) {
                throw new NoWhenBranchMatchedException();
            }
            dVar.onError(bVar);
        }
    }
}
