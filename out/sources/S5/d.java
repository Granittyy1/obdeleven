package S5;

/* JADX INFO: compiled from: CutCornerTreatment.java */
/* JADX INFO: loaded from: classes3.dex */
public final class d extends Cb.a {
    @Override // Cb.a
    public final void h(l lVar, float f10, float f11) {
        lVar.d(f11 * f10, 180.0f, 90.0f);
        double d10 = f11;
        double d11 = f10;
        lVar.c((float) (Math.sin(Math.toRadians(90.0f)) * d10 * d11), (float) (Math.sin(Math.toRadians(0.0f)) * d10 * d11));
    }
}
