package p308z1;

/* JADX INFO: compiled from: Projection.java */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f48717a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f48718b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f48719c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f48720d;

    /* JADX INFO: compiled from: Projection.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b[] f48721a;

        public a(b... bVarArr) {
            this.f48721a = bVarArr;
        }
    }

    /* JADX INFO: compiled from: Projection.java */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f48722a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f48723b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final float[] f48724c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final float[] f48725d;

        public b(int i10, int i11, float[] fArr, float[] fArr2) {
            this.f48722a = i10;
            p241t7.b.e(((long) fArr.length) * 2 == ((long) fArr2.length) * 3);
            this.f48724c = fArr;
            this.f48725d = fArr2;
            this.f48723b = i11;
        }
    }

    public e(a aVar, a aVar2, int i10) {
        this.f48717a = aVar;
        this.f48718b = aVar2;
        this.f48719c = i10;
        this.f48720d = aVar == aVar2;
    }
}
