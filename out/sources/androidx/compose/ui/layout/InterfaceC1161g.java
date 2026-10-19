package androidx.compose.ui.layout;

/* JADX INFO: renamed from: androidx.compose.ui.layout.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: ContentScale.kt */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC1161g {

    /* JADX INFO: renamed from: androidx.compose.ui.layout.g$a */
    /* JADX INFO: compiled from: ContentScale.kt */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0159a f14243a = new C0159a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final d f14244b = new d();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f14245c = new b();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final c f14246d = new c();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final e f14247e = new e();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final C1163i f14248f = new C1163i();

        /* JADX INFO: renamed from: androidx.compose.ui.layout.g$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: ContentScale.kt */
        public static final class C0159a implements InterfaceC1161g {
            @Override // androidx.compose.ui.layout.InterfaceC1161g
            public final long a(long j, long j10) {
                float fMax = Math.max(Float.intBitsToFloat((int) (j10 >> 32)) / Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j10 & 4294967295L)) / Float.intBitsToFloat((int) (j & 4294967295L)));
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fMax)) << 32) | (((long) Float.floatToRawIntBits(fMax)) & 4294967295L);
                int i10 = c0.f14231a;
                return jFloatToRawIntBits;
            }
        }

        /* JADX INFO: renamed from: androidx.compose.ui.layout.g$a$b */
        /* JADX INFO: compiled from: ContentScale.kt */
        public static final class b implements InterfaceC1161g {
            @Override // androidx.compose.ui.layout.InterfaceC1161g
            public final long a(long j, long j10) {
                float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 & 4294967295L)) / Float.intBitsToFloat((int) (j & 4294967295L));
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L);
                int i10 = c0.f14231a;
                return jFloatToRawIntBits;
            }
        }

        /* JADX INFO: renamed from: androidx.compose.ui.layout.g$a$c */
        /* JADX INFO: compiled from: ContentScale.kt */
        public static final class c implements InterfaceC1161g {
            @Override // androidx.compose.ui.layout.InterfaceC1161g
            public final long a(long j, long j10) {
                float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32)) / Float.intBitsToFloat((int) (j >> 32));
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L);
                int i10 = c0.f14231a;
                return jFloatToRawIntBits;
            }
        }

        /* JADX INFO: renamed from: androidx.compose.ui.layout.g$a$d */
        /* JADX INFO: compiled from: ContentScale.kt */
        public static final class d implements InterfaceC1161g {
            @Override // androidx.compose.ui.layout.InterfaceC1161g
            public final long a(long j, long j10) {
                float fB = I2.e.b(j, j10);
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fB)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(fB)));
                int i10 = c0.f14231a;
                return jFloatToRawIntBits;
            }
        }

        /* JADX INFO: renamed from: androidx.compose.ui.layout.g$a$e */
        /* JADX INFO: compiled from: ContentScale.kt */
        public static final class e implements InterfaceC1161g {
            @Override // androidx.compose.ui.layout.InterfaceC1161g
            public final long a(long j, long j10) {
                if (Float.intBitsToFloat((int) (j >> 32)) <= Float.intBitsToFloat((int) (j10 >> 32)) && Float.intBitsToFloat((int) (j & 4294967295L)) <= Float.intBitsToFloat((int) (j10 & 4294967295L))) {
                    long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(1.0f)) << 32) | (((long) Float.floatToRawIntBits(1.0f)) & 4294967295L);
                    int i10 = c0.f14231a;
                    return jFloatToRawIntBits;
                }
                float fB = I2.e.b(j, j10);
                long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fB)) << 32) | (((long) Float.floatToRawIntBits(fB)) & 4294967295L);
                int i11 = c0.f14231a;
                return jFloatToRawIntBits2;
            }
        }
    }

    long a(long j, long j10);
}
