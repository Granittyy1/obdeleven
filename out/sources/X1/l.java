package X1;

import com.google.common.collect.ImmutableList;

/* JADX INFO: compiled from: SubtitleParser.java */
/* JADX INFO: loaded from: classes.dex */
public interface l {

    /* JADX INFO: compiled from: SubtitleParser.java */
    public interface a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0099a f7151a = new C0099a();

        /* JADX INFO: renamed from: X1.l$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: SubtitleParser.java */
        public class C0099a implements a {
            @Override // X1.l.a
            public final boolean c(p078g1.n nVar) {
                return false;
            }

            @Override // X1.l.a
            public final l d(p078g1.n nVar) {
                throw new IllegalStateException("This SubtitleParser.Factory doesn't support any formats.");
            }

            @Override // X1.l.a
            public final int e(p078g1.n nVar) {
                return 1;
            }
        }

        boolean c(p078g1.n nVar);

        l d(p078g1.n nVar);

        int e(p078g1.n nVar);
    }

    /* JADX INFO: compiled from: SubtitleParser.java */
    public static class b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f7152c = new b(-9223372036854775807L, false);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f7153a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f7154b;

        public b(long j, boolean z10) {
            this.f7153a = j;
            this.f7154b = z10;
        }
    }

    void a(byte[] bArr, int i10, int i11, b bVar, p114j1.f<c> fVar);

    default h b(byte[] bArr, int i10, int i11) {
        ImmutableList.b bVar = ImmutableList.f27874c;
        ImmutableList.a aVar = new ImmutableList.a();
        a(bArr, 0, i11, b.f7152c, new I4.l(aVar));
        return new d(aVar.h());
    }

    default void reset() {
    }
}
