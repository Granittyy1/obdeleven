package p116j3;

import android.graphics.Path;
import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;
import p104i3.q;
import p164n3.h;
import p214r3.c;
import p214r3.f;
import p225s3.a;

/* JADX INFO: compiled from: ShapeKeyframeAnimation.java */
/* JADX INFO: loaded from: classes.dex */
public final class m extends a<h, Path> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final h f41113h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Path f41114i;
    public ArrayList j;

    public m(List<a<h>> list) {
        super(list);
        this.f41113h = new h();
        this.f41114i = new Path();
    }

    @Override // p116j3.a
    public final Path f(a<h> aVar, float f10) {
        h hVar = aVar.f46886b;
        h hVar2 = aVar.f46887c;
        h hVarE = this.f41113h;
        if (hVarE.f44851b == null) {
            hVarE.f44851b = new PointF();
        }
        int i10 = 0;
        hVarE.f44852c = hVar.f44852c || hVar2.f44852c;
        ArrayList arrayList = hVar.f44850a;
        int size = arrayList.size();
        int size2 = hVar2.f44850a.size();
        ArrayList arrayList2 = hVar2.f44850a;
        if (size != size2) {
            c.b("Curves must have the same number of control points. Shape 1: " + arrayList.size() + "\tShape 2: " + arrayList2.size());
        }
        int iMin = Math.min(arrayList.size(), arrayList2.size());
        ArrayList arrayList3 = hVarE.f44850a;
        if (arrayList3.size() < iMin) {
            for (int size3 = arrayList3.size(); size3 < iMin; size3++) {
                arrayList3.add(new p142l3.a());
            }
        } else if (arrayList3.size() > iMin) {
            for (int size4 = arrayList3.size() - 1; size4 >= iMin; size4--) {
                arrayList3.remove(arrayList3.size() - 1);
            }
        }
        PointF pointF = hVar.f44851b;
        PointF pointF2 = hVar2.f44851b;
        hVarE.a(f.d(pointF.x, pointF2.x, f10), f.d(pointF.y, pointF2.y, f10));
        for (int size5 = arrayList3.size() - 1; size5 >= 0; size5--) {
            p142l3.a aVar2 = (p142l3.a) arrayList.get(size5);
            p142l3.a aVar3 = (p142l3.a) arrayList2.get(size5);
            PointF pointF3 = aVar2.f44340a;
            PointF pointF4 = aVar3.f44340a;
            ((p142l3.a) arrayList3.get(size5)).f44340a.set(f.d(pointF3.x, pointF4.x, f10), f.d(pointF3.y, pointF4.y, f10));
            p142l3.a aVar4 = (p142l3.a) arrayList3.get(size5);
            PointF pointF5 = aVar2.f44341b;
            float f11 = pointF5.x;
            PointF pointF6 = aVar3.f44341b;
            aVar4.f44341b.set(f.d(f11, pointF6.x, f10), f.d(pointF5.y, pointF6.y, f10));
            p142l3.a aVar5 = (p142l3.a) arrayList3.get(size5);
            PointF pointF7 = aVar2.f44342c;
            float f12 = pointF7.x;
            PointF pointF8 = aVar3.f44342c;
            aVar5.f44342c.set(f.d(f12, pointF8.x, f10), f.d(pointF7.y, pointF8.y, f10));
        }
        ArrayList arrayList4 = this.j;
        if (arrayList4 != null) {
            for (int size6 = arrayList4.size() - 1; size6 >= 0; size6--) {
                hVarE = ((q) this.j.get(size6)).e(hVarE);
            }
        }
        Path path = this.f41114i;
        path.reset();
        PointF pointF9 = hVarE.f44851b;
        path.moveTo(pointF9.x, pointF9.y);
        PointF pointF10 = f.f46331a;
        pointF10.set(pointF9.x, pointF9.y);
        while (true) {
            ArrayList arrayList5 = hVarE.f44850a;
            if (i10 >= arrayList5.size()) {
                break;
            }
            p142l3.a aVar6 = (p142l3.a) arrayList5.get(i10);
            PointF pointF11 = aVar6.f44340a;
            boolean zEquals = pointF11.equals(pointF10);
            PointF pointF12 = aVar6.f44341b;
            PointF pointF13 = aVar6.f44342c;
            if (zEquals && pointF12.equals(pointF13)) {
                path.lineTo(pointF13.x, pointF13.y);
            } else {
                path.cubicTo(pointF11.x, pointF11.y, pointF12.x, pointF12.y, pointF13.x, pointF13.y);
            }
            pointF10.set(pointF13.x, pointF13.y);
            i10++;
        }
        if (hVarE.f44852c) {
            path.close();
        }
        return path;
    }
}
