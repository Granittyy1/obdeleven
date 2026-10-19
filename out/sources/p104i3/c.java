package p104i3;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import com.airbnb.lottie.LottieDrawable;
import java.util.ArrayList;
import java.util.List;
import p079g3.b;
import p116j3.a;
import p116j3.p;
import p164n3.j;
import p214r3.g;

/* JADX INFO: compiled from: ContentGroup.java */
/* JADX INFO: loaded from: classes.dex */
public final class c implements d, k, a.InterfaceC0468a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p092h3.a f36619a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RectF f36620b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Matrix f36621c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Path f36622d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final RectF f36623e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f36624f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f36625g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final LottieDrawable f36626h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ArrayList f36627i;
    public final p j;

    public c(LottieDrawable lottieDrawable, com.airbnb.lottie.model.layer.a aVar, j jVar, b bVar) {
        p154m3.j jVar2;
        String str = jVar.f44859a;
        List<p164n3.b> list = jVar.f44860b;
        ArrayList arrayList = new ArrayList(list.size());
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            b bVarA = list.get(i11).a(lottieDrawable, bVar, aVar);
            if (bVarA != null) {
                arrayList.add(bVarA);
            }
        }
        while (true) {
            if (i10 >= list.size()) {
                jVar2 = null;
                break;
            }
            p164n3.b bVar2 = list.get(i10);
            if (bVar2 instanceof p154m3.j) {
                jVar2 = (p154m3.j) bVar2;
                break;
            }
            i10++;
        }
        this(lottieDrawable, aVar, str, jVar.f44861c, arrayList, jVar2);
    }

    @Override // p116j3.a.InterfaceC0468a
    public final void a() {
        this.f36626h.invalidateSelf();
    }

    @Override // p104i3.b
    public final void b(List<b> list, List<b> list2) {
        int size = list.size();
        ArrayList arrayList = this.f36625g;
        ArrayList arrayList2 = new ArrayList(arrayList.size() + size);
        arrayList2.addAll(list);
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            b bVar = (b) arrayList.get(size2);
            bVar.b(arrayList2, arrayList.subList(0, size2));
            arrayList2.add(bVar);
        }
    }

    @Override // p104i3.d
    public final void c(RectF rectF, Matrix matrix, boolean z10) {
        Matrix matrix2 = this.f36621c;
        matrix2.set(matrix);
        p pVar = this.j;
        if (pVar != null) {
            matrix2.preConcat(pVar.d());
        }
        RectF rectF2 = this.f36623e;
        rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
        ArrayList arrayList = this.f36625g;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            b bVar = (b) arrayList.get(size);
            if (bVar instanceof d) {
                ((d) bVar).c(rectF2, matrix2, z10);
                rectF.union(rectF2);
            }
        }
    }

    public final List<k> d() {
        if (this.f36627i == null) {
            this.f36627i = new ArrayList();
            int i10 = 0;
            while (true) {
                ArrayList arrayList = this.f36625g;
                if (i10 >= arrayList.size()) {
                    break;
                }
                b bVar = (b) arrayList.get(i10);
                if (bVar instanceof k) {
                    this.f36627i.add((k) bVar);
                }
                i10++;
            }
        }
        return this.f36627i;
    }

    @Override // p104i3.d
    public final void f(Canvas canvas, Matrix matrix, int i10) {
        if (this.f36624f) {
            return;
        }
        Matrix matrix2 = this.f36621c;
        matrix2.set(matrix);
        p pVar = this.j;
        if (pVar != null) {
            matrix2.preConcat(pVar.d());
            a<Integer, Integer> aVar = pVar.j;
            i10 = (int) (((((aVar == null ? 100 : aVar.e().intValue()) / 100.0f) * i10) / 255.0f) * 255.0f);
        }
        boolean z10 = this.f36626h.f23325p;
        ArrayList arrayList = this.f36625g;
        boolean z11 = false;
        if (z10) {
            int i11 = 0;
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                if ((arrayList.get(i12) instanceof d) && (i11 = i11 + 1) >= 2) {
                    if (i10 == 255) {
                        break;
                    }
                    z11 = true;
                    break;
                }
            }
        }
        if (z11) {
            RectF rectF = this.f36620b;
            rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
            c(rectF, matrix2, true);
            p092h3.a aVar2 = this.f36619a;
            aVar2.setAlpha(i10);
            g.a aVar3 = g.f46332a;
            canvas.saveLayer(rectF, aVar2);
        }
        if (z11) {
            i10 = 255;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            Object obj = arrayList.get(size);
            if (obj instanceof d) {
                ((d) obj).f(canvas, matrix2, i10);
            }
        }
        if (z11) {
            canvas.restore();
        }
    }

    @Override // p104i3.k
    public final Path getPath() {
        Matrix matrix = this.f36621c;
        matrix.reset();
        p pVar = this.j;
        if (pVar != null) {
            matrix.set(pVar.d());
        }
        Path path = this.f36622d;
        path.reset();
        if (this.f36624f) {
            return path;
        }
        ArrayList arrayList = this.f36625g;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            b bVar = (b) arrayList.get(size);
            if (bVar instanceof k) {
                path.addPath(((k) bVar).getPath(), matrix);
            }
        }
        return path;
    }

    public c(LottieDrawable lottieDrawable, com.airbnb.lottie.model.layer.a aVar, String str, boolean z10, ArrayList arrayList, p154m3.j jVar) {
        this.f36619a = new p092h3.a();
        this.f36620b = new RectF();
        this.f36621c = new Matrix();
        this.f36622d = new Path();
        this.f36623e = new RectF();
        this.f36626h = lottieDrawable;
        this.f36624f = z10;
        this.f36625g = arrayList;
        if (jVar != null) {
            p pVar = new p(jVar);
            this.j = pVar;
            pVar.a(aVar);
            pVar.b(this);
        }
        ArrayList arrayList2 = new ArrayList();
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            b bVar = (b) arrayList.get(size);
            if (bVar instanceof i) {
                arrayList2.add((i) bVar);
            }
        }
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            ((i) arrayList2.get(size2)).d(arrayList.listIterator(arrayList.size()));
        }
    }
}
