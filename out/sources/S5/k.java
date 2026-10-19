package S5;

import android.graphics.Canvas;
import android.graphics.Matrix;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: ShapePath.java */
/* JADX INFO: loaded from: classes3.dex */
public final class k extends l.f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArrayList f5641c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Matrix f5642d;

    public k(ArrayList arrayList, Matrix matrix) {
        this.f5641c = arrayList;
        this.f5642d = matrix;
    }

    @Override // S5.l.f
    public final void a(Matrix matrix, R5.a aVar, int i10, Canvas canvas) {
        Iterator it = this.f5641c.iterator();
        while (it.hasNext()) {
            ((l.f) it.next()).a(this.f5642d, aVar, i10, canvas);
        }
    }
}
