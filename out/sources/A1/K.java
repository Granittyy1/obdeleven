package A1;

import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: compiled from: TrackOutput.java */
/* JADX INFO: loaded from: classes.dex */
public interface K {

    /* JADX INFO: compiled from: TrackOutput.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f429a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final byte[] f430b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f431c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f432d;

        public a(int i10, int i11, int i12, byte[] bArr) {
            this.f429a = i10;
            this.f430b = bArr;
            this.f431c = i11;
            this.f432d = i12;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f429a == aVar.f429a && this.f431c == aVar.f431c && this.f432d == aVar.f432d && Arrays.equals(this.f430b, aVar.f430b);
        }

        public final int hashCode() {
            return ((((Arrays.hashCode(this.f430b) + (this.f429a * 31)) * 31) + this.f431c) * 31) + this.f432d;
        }
    }

    default void a(int i10, p114j1.r rVar) {
        c(rVar, i10, 0);
    }

    void b(long j, int i10, int i11, int i12, a aVar);

    void c(p114j1.r rVar, int i10, int i11);

    void d(p078g1.n nVar);

    int e(p078g1.i iVar, int i10, boolean z10) throws IOException;

    default int f(p078g1.i iVar, int i10, boolean z10) throws IOException {
        return e(iVar, i10, z10);
    }
}
