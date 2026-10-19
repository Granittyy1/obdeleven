package p270w;

import I.h;
import androidx.compose.ui.graphics.b0;
import androidx.compose.ui.graphics.l0;
import androidx.compose.ui.unit.LayoutDirection;
import p013b0.c;

/* JADX INFO: compiled from: CornerBasedShape.kt */
/* JADX INFO: loaded from: classes.dex */
public abstract class a implements l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f47673a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f47674b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f47675c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b f47676d;

    public a(b bVar, b bVar2, b bVar3, b bVar4) {
        this.f47673a = bVar;
        this.f47674b = bVar2;
        this.f47675c = bVar3;
        this.f47676d = bVar4;
    }

    public static /* synthetic */ a b(a aVar, d dVar, d dVar2, b bVar, b bVar2, int i10) {
        b bVar3 = dVar;
        if ((i10 & 1) != 0) {
            bVar3 = aVar.f47673a;
        }
        b bVar4 = dVar2;
        if ((i10 & 2) != 0) {
            bVar4 = aVar.f47674b;
        }
        if ((i10 & 4) != 0) {
            bVar = aVar.f47675c;
        }
        if ((i10 & 8) != 0) {
            bVar2 = aVar.f47676d;
        }
        return aVar.a(bVar3, bVar4, bVar, bVar2);
    }

    public abstract f a(b bVar, b bVar2, b bVar3, b bVar4);

    public abstract b0 c(long j, float f10, float f11, float f12, float f13, LayoutDirection layoutDirection);

    @Override // androidx.compose.ui.graphics.l0
    /* JADX INFO: renamed from: createOutline-Pq9zytI */
    public final b0 mo0createOutlinePq9zytI(long j, LayoutDirection layoutDirection, c cVar) {
        float fA = this.f47673a.a(j, cVar);
        float fA2 = this.f47674b.a(j, cVar);
        float fA3 = this.f47675c.a(j, cVar);
        float fA4 = this.f47676d.a(j, cVar);
        float fC = h.c(j);
        float f10 = fA + fA4;
        if (f10 > fC) {
            float f11 = fC / f10;
            fA *= f11;
            fA4 *= f11;
        }
        float f12 = fA4;
        float f13 = fA2 + fA3;
        if (f13 > fC) {
            float f14 = fC / f13;
            fA2 *= f14;
            fA3 *= f14;
        }
        if (fA < 0.0f || fA2 < 0.0f || fA3 < 0.0f || f12 < 0.0f) {
            p245u.c.a("Corner size in Px can't be negative(topStart = " + fA + ", topEnd = " + fA2 + ", bottomEnd = " + fA3 + ", bottomStart = " + f12 + ")!");
        }
        return c(j, fA, fA2, fA3, f12, layoutDirection);
    }
}
