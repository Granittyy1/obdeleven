package androidx.compose.animation.core;

/* JADX INFO: compiled from: VectorConverters.kt */
/* JADX INFO: loaded from: classes.dex */
public final class VectorConvertersKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e0 f9477a = new e0(new Ia.l<Float, C0909i>() { // from class: androidx.compose.animation.core.VectorConvertersKt$FloatToVector$1
        @Override // Ia.l
        public final C0909i invoke(Float f10) {
            return new C0909i(f10.floatValue());
        }
    }, new Ia.l<C0909i, Float>() { // from class: androidx.compose.animation.core.VectorConvertersKt$FloatToVector$2
        @Override // Ia.l
        public final Float invoke(C0909i c0909i) {
            return Float.valueOf(c0909i.f9552a);
        }
    });

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final e0 f9478b = new e0(new Ia.l<Integer, C0909i>() { // from class: androidx.compose.animation.core.VectorConvertersKt$IntToVector$1
        @Override // Ia.l
        public final C0909i invoke(Integer num) {
            return new C0909i(num.intValue());
        }
    }, new Ia.l<C0909i, Integer>() { // from class: androidx.compose.animation.core.VectorConvertersKt$IntToVector$2
        @Override // Ia.l
        public final Integer invoke(C0909i c0909i) {
            return Integer.valueOf((int) c0909i.f9552a);
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e0 f9479c = new e0(new Ia.l<p013b0.f, C0909i>() { // from class: androidx.compose.animation.core.VectorConvertersKt$DpToVector$1
        @Override // Ia.l
        public final C0909i invoke(p013b0.f fVar) {
            return new C0909i(fVar.f20481b);
        }
    }, new Ia.l<C0909i, p013b0.f>() { // from class: androidx.compose.animation.core.VectorConvertersKt$DpToVector$2
        @Override // Ia.l
        public final p013b0.f invoke(C0909i c0909i) {
            return new p013b0.f(c0909i.f9552a);
        }
    });

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final e0 f9480d = new e0(new Ia.l<p013b0.g, C0910j>() { // from class: androidx.compose.animation.core.VectorConvertersKt$DpOffsetToVector$1
        @Override // Ia.l
        public final C0910j invoke(p013b0.g gVar) {
            long j = gVar.f20482a;
            return new C0910j(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
        }
    }, new Ia.l<C0910j, p013b0.g>() { // from class: androidx.compose.animation.core.VectorConvertersKt$DpOffsetToVector$2
        @Override // Ia.l
        public final p013b0.g invoke(C0910j c0910j) {
            C0910j c0910j2 = c0910j;
            float f10 = c0910j2.f9554a;
            float f11 = c0910j2.f9555b;
            return new p013b0.g((((long) Float.floatToRawIntBits(f10)) << 32) | (((long) Float.floatToRawIntBits(f11)) & 4294967295L));
        }
    });

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final e0 f9481e = new e0(new Ia.l<I.h, C0910j>() { // from class: androidx.compose.animation.core.VectorConvertersKt$SizeToVector$1
        @Override // Ia.l
        public final C0910j invoke(I.h hVar) {
            long j = hVar.f3769a;
            return new C0910j(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
        }
    }, new Ia.l<C0910j, I.h>() { // from class: androidx.compose.animation.core.VectorConvertersKt$SizeToVector$2
        @Override // Ia.l
        public final I.h invoke(C0910j c0910j) {
            C0910j c0910j2 = c0910j;
            float f10 = c0910j2.f9554a;
            float f11 = c0910j2.f9555b;
            return new I.h((((long) Float.floatToRawIntBits(f10)) << 32) | (((long) Float.floatToRawIntBits(f11)) & 4294967295L));
        }
    });

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final e0 f9482f = new e0(new Ia.l<I.d, C0910j>() { // from class: androidx.compose.animation.core.VectorConvertersKt$OffsetToVector$1
        @Override // Ia.l
        public final C0910j invoke(I.d dVar) {
            long j = dVar.f3754a;
            return new C0910j(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
        }
    }, new Ia.l<C0910j, I.d>() { // from class: androidx.compose.animation.core.VectorConvertersKt$OffsetToVector$2
        @Override // Ia.l
        public final I.d invoke(C0910j c0910j) {
            C0910j c0910j2 = c0910j;
            float f10 = c0910j2.f9554a;
            float f11 = c0910j2.f9555b;
            return new I.d((((long) Float.floatToRawIntBits(f10)) << 32) | (((long) Float.floatToRawIntBits(f11)) & 4294967295L));
        }
    });

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final e0 f9483g = new e0(new Ia.l<p013b0.j, C0910j>() { // from class: androidx.compose.animation.core.VectorConvertersKt$IntOffsetToVector$1
        @Override // Ia.l
        public final C0910j invoke(p013b0.j jVar) {
            long j = jVar.f20484a;
            return new C0910j((int) (j >> 32), (int) (j & 4294967295L));
        }
    }, new Ia.l<C0910j, p013b0.j>() { // from class: androidx.compose.animation.core.VectorConvertersKt$IntOffsetToVector$2
        @Override // Ia.l
        public final p013b0.j invoke(C0910j c0910j) {
            C0910j c0910j2 = c0910j;
            return new p013b0.j((((long) Math.round(c0910j2.f9554a)) << 32) | (((long) Math.round(c0910j2.f9555b)) & 4294967295L));
        }
    });

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final e0 f9484h = new e0(new Ia.l<p013b0.l, C0910j>() { // from class: androidx.compose.animation.core.VectorConvertersKt$IntSizeToVector$1
        @Override // Ia.l
        public final C0910j invoke(p013b0.l lVar) {
            long j = lVar.f20490a;
            return new C0910j((int) (j >> 32), (int) (j & 4294967295L));
        }
    }, new Ia.l<C0910j, p013b0.l>() { // from class: androidx.compose.animation.core.VectorConvertersKt$IntSizeToVector$2
        @Override // Ia.l
        public final p013b0.l invoke(C0910j c0910j) {
            C0910j c0910j2 = c0910j;
            int iRound = Math.round(c0910j2.f9554a);
            if (iRound < 0) {
                iRound = 0;
            }
            int iRound2 = Math.round(c0910j2.f9555b);
            return new p013b0.l((((long) (iRound2 >= 0 ? iRound2 : 0)) & 4294967295L) | (((long) iRound) << 32));
        }
    });

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final e0 f9485i = new e0(new Ia.l<I.f, C0912l>() { // from class: androidx.compose.animation.core.VectorConvertersKt$RectToVector$1
        @Override // Ia.l
        public final C0912l invoke(I.f fVar) {
            I.f fVar2 = fVar;
            return new C0912l(fVar2.f3757a, fVar2.f3758b, fVar2.f3759c, fVar2.f3760d);
        }
    }, new Ia.l<C0912l, I.f>() { // from class: androidx.compose.animation.core.VectorConvertersKt$RectToVector$2
        @Override // Ia.l
        public final I.f invoke(C0912l c0912l) {
            C0912l c0912l2 = c0912l;
            return new I.f(c0912l2.f9566a, c0912l2.f9567b, c0912l2.f9568c, c0912l2.f9569d);
        }
    });
}
