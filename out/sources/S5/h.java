package S5;

/* JADX INFO: compiled from: RoundedCornerTreatment.java */
/* JADX INFO: loaded from: classes3.dex */
public final class h extends Cb.a {
    @Override // Cb.a
    public final void h(l lVar, float f10, float f11) {
        lVar.d(f11 * f10, 180.0f, 90.0f);
        float f12 = f11 * 2.0f * f10;
        lVar.getClass();
        l.c cVar = new l.c(0.0f, 0.0f, f12, f12);
        cVar.f5659f = 180.0f;
        cVar.f5660g = 90.0f;
        lVar.f5648f.add(cVar);
        l.a aVar = new l.a(cVar);
        float f13 = 180.0f + 90.0f;
        boolean z10 = 90.0f < 0.0f;
        float f14 = z10 ? (180.0f + 180.0f) % 360.0f : 180.0f;
        float f15 = z10 ? (180.0f + f13) % 360.0f : f13;
        lVar.a(f14);
        lVar.f5649g.add(aVar);
        lVar.f5646d = f15;
        double d10 = f13;
        lVar.f5644b = (((f12 - 0.0f) / 2.0f) * ((float) Math.cos(Math.toRadians(d10)))) + ((0.0f + f12) * 0.5f);
        lVar.f5645c = (((f12 - 0.0f) / 2.0f) * ((float) Math.sin(Math.toRadians(d10)))) + ((0.0f + f12) * 0.5f);
    }
}
