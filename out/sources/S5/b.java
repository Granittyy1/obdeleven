package S5;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: compiled from: AdjustedCornerSize.java */
/* JADX INFO: loaded from: classes3.dex */
public final class b implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f5563a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f5564b;

    public b(float f10, c cVar) {
        while (cVar instanceof b) {
            cVar = ((b) cVar).f5563a;
            f10 += ((b) cVar).f5564b;
        }
        this.f5563a = cVar;
        this.f5564b = f10;
    }

    @Override // S5.c
    public final float a(RectF rectF) {
        return Math.max(0.0f, this.f5563a.a(rectF) + this.f5564b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f5563a.equals(bVar.f5563a) && this.f5564b == bVar.f5564b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f5563a, Float.valueOf(this.f5564b)});
    }
}
