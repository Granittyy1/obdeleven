package p235t1;

import androidx.media3.exoplayer.T;
import androidx.media3.exoplayer.source.m;
import com.google.common.collect.ImmutableList;
import java.util.List;
import p241t7.b;

/* JADX INFO: compiled from: CompositeSequenceableLoader.java */
/* JADX INFO: loaded from: classes.dex */
public final class c implements m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ImmutableList<a> f47005b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f47006c;

    /* JADX INFO: compiled from: CompositeSequenceableLoader.java */
    public static final class a implements m {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final m f47007b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ImmutableList<Integer> f47008c;

        public a(m mVar, List<Integer> list) {
            this.f47007b = mVar;
            this.f47008c = ImmutableList.G(list);
        }

        @Override // androidx.media3.exoplayer.source.m
        public final boolean a(T t8) {
            return this.f47007b.a(t8);
        }

        public final ImmutableList<Integer> b() {
            return this.f47008c;
        }

        @Override // androidx.media3.exoplayer.source.m
        public final long c() {
            return this.f47007b.c();
        }

        @Override // androidx.media3.exoplayer.source.m
        public final boolean i() {
            return this.f47007b.i();
        }

        @Override // androidx.media3.exoplayer.source.m
        public final long q() {
            return this.f47007b.q();
        }

        @Override // androidx.media3.exoplayer.source.m
        public final void s(long j) {
            this.f47007b.s(j);
        }
    }

    public c(List<? extends m> list, List<List<Integer>> list2) {
        ImmutableList.b bVar = ImmutableList.f27874c;
        ImmutableList.a aVar = new ImmutableList.a();
        b.e(list.size() == list2.size());
        for (int i10 = 0; i10 < list.size(); i10++) {
            aVar.c(new a(list.get(i10), list2.get(i10)));
        }
        this.f47005b = aVar.h();
        this.f47006c = -9223372036854775807L;
    }

    @Override // androidx.media3.exoplayer.source.m
    public final boolean a(T t8) {
        boolean zA;
        boolean z10 = false;
        do {
            long jC = c();
            if (jC == Long.MIN_VALUE) {
                break;
            }
            int i10 = 0;
            zA = false;
            while (true) {
                ImmutableList<a> immutableList = this.f47005b;
                if (i10 >= immutableList.size()) {
                    break;
                }
                long jC2 = immutableList.get(i10).c();
                boolean z11 = jC2 != Long.MIN_VALUE && jC2 <= t8.f18142a;
                if (jC2 == jC || z11) {
                    zA |= immutableList.get(i10).a(t8);
                }
                i10++;
            }
            z10 |= zA;
        } while (zA);
        return z10;
    }

    @Override // androidx.media3.exoplayer.source.m
    public final long c() {
        int i10 = 0;
        long jMin = Long.MAX_VALUE;
        while (true) {
            ImmutableList<a> immutableList = this.f47005b;
            if (i10 >= immutableList.size()) {
                break;
            }
            long jC = immutableList.get(i10).c();
            if (jC != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jC);
            }
            i10++;
        }
        if (jMin == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }

    @Override // androidx.media3.exoplayer.source.m
    public final boolean i() {
        int i10 = 0;
        while (true) {
            ImmutableList<a> immutableList = this.f47005b;
            if (i10 >= immutableList.size()) {
                return false;
            }
            if (immutableList.get(i10).i()) {
                return true;
            }
            i10++;
        }
    }

    @Override // androidx.media3.exoplayer.source.m
    public final long q() {
        int i10 = 0;
        long jMin = Long.MAX_VALUE;
        long jMin2 = Long.MAX_VALUE;
        while (true) {
            ImmutableList<a> immutableList = this.f47005b;
            if (i10 >= immutableList.size()) {
                break;
            }
            a aVar = immutableList.get(i10);
            long jQ = aVar.q();
            if ((aVar.b().contains(1) || aVar.b().contains(2) || aVar.b().contains(4)) && jQ != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jQ);
            }
            if (jQ != Long.MIN_VALUE) {
                jMin2 = Math.min(jMin2, jQ);
            }
            i10++;
        }
        if (jMin != Long.MAX_VALUE) {
            this.f47006c = jMin;
            return jMin;
        }
        if (jMin2 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        long j = this.f47006c;
        return j != -9223372036854775807L ? j : jMin2;
    }

    @Override // androidx.media3.exoplayer.source.m
    public final void s(long j) {
        int i10 = 0;
        while (true) {
            ImmutableList<a> immutableList = this.f47005b;
            if (i10 >= immutableList.size()) {
                return;
            }
            immutableList.get(i10).s(j);
            i10++;
        }
    }
}
