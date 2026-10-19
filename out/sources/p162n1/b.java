package p162n1;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import androidx.media3.exoplayer.C1390h;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.source.h;
import java.util.Objects;
import p078g1.F;
import p078g1.m;
import p078g1.v;
import p078g1.x;
import p235t1.k;

/* JADX INFO: compiled from: AnalyticsListener.java */
/* JADX INFO: loaded from: classes.dex */
public interface b {

    /* JADX INFO: compiled from: AnalyticsListener.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f44666a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final x f44667b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f44668c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final h.b f44669d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final long f44670e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final x f44671f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f44672g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final h.b f44673h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final long f44674i;
        public final long j;

        public a(long j, x xVar, int i10, h.b bVar, long j10, x xVar2, int i11, h.b bVar2, long j11, long j12) {
            this.f44666a = j;
            this.f44667b = xVar;
            this.f44668c = i10;
            this.f44669d = bVar;
            this.f44670e = j10;
            this.f44671f = xVar2;
            this.f44672g = i11;
            this.f44673h = bVar2;
            this.f44674i = j11;
            this.j = j12;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f44666a == aVar.f44666a && this.f44668c == aVar.f44668c && this.f44670e == aVar.f44670e && this.f44672g == aVar.f44672g && this.f44674i == aVar.f44674i && this.j == aVar.j && Objects.equals(this.f44667b, aVar.f44667b) && Objects.equals(this.f44669d, aVar.f44669d) && Objects.equals(this.f44671f, aVar.f44671f) && Objects.equals(this.f44673h, aVar.f44673h);
        }

        public final int hashCode() {
            return Objects.hash(Long.valueOf(this.f44666a), this.f44667b, Integer.valueOf(this.f44668c), this.f44669d, Long.valueOf(this.f44670e), this.f44671f, Integer.valueOf(this.f44672g), this.f44673h, Long.valueOf(this.f44674i), Long.valueOf(this.j));
        }
    }

    /* JADX INFO: renamed from: n1.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AnalyticsListener.java */
    public static final class C0508b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final m f44675a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final SparseArray<a> f44676b;

        public C0508b(m mVar, SparseArray<a> sparseArray) {
            this.f44675a = mVar;
            SparseBooleanArray sparseBooleanArray = mVar.f35273a;
            SparseArray<a> sparseArray2 = new SparseArray<>(sparseBooleanArray.size());
            for (int i10 = 0; i10 < sparseBooleanArray.size(); i10++) {
                int iA = mVar.a(i10);
                a aVar = sparseArray.get(iA);
                aVar.getClass();
                sparseArray2.append(iA, aVar);
            }
            this.f44676b = sparseArray2;
        }

        public final boolean a(int i10) {
            return this.f44675a.f35273a.get(i10);
        }
    }

    default void a(int i10) {
    }

    default void b(F f10) {
    }

    default void c(ExoPlaybackException exoPlaybackException) {
    }

    default void d(C1390h c1390h) {
    }

    default void e(k kVar) {
    }

    default void f(a aVar, k kVar) {
    }

    default void g(v vVar, C0508b c0508b) {
    }

    default void h(int i10, long j, a aVar) {
    }
}
