package androidx.compose.ui.graphics.vector;

import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.ui.graphics.A;
import androidx.compose.ui.platform.CompositionLocalsKt;
import p293xa.r;

/* JADX INFO: compiled from: VectorPainter.kt */
/* JADX INFO: loaded from: classes.dex */
public final class k {
    public static final void a(GroupComponent groupComponent, h hVar) {
        int size = hVar.f13968k.size();
        for (int i10 = 0; i10 < size; i10++) {
            j jVar = hVar.f13968k.get(i10);
            if (jVar instanceof l) {
                PathComponent pathComponent = new PathComponent();
                l lVar = (l) jVar;
                pathComponent.f13824d = lVar.f13972c;
                pathComponent.f13833n = true;
                pathComponent.c();
                pathComponent.f13838s.g(lVar.f13973d);
                pathComponent.c();
                pathComponent.c();
                pathComponent.f13822b = lVar.f13974e;
                pathComponent.c();
                pathComponent.f13823c = lVar.f13975f;
                pathComponent.c();
                pathComponent.f13827g = lVar.f13976g;
                pathComponent.c();
                pathComponent.f13825e = lVar.f13977h;
                pathComponent.c();
                pathComponent.f13826f = lVar.f13978i;
                pathComponent.f13834o = true;
                pathComponent.c();
                pathComponent.f13828h = lVar.j;
                pathComponent.f13834o = true;
                pathComponent.c();
                pathComponent.f13829i = lVar.f13979k;
                pathComponent.f13834o = true;
                pathComponent.c();
                pathComponent.j = lVar.f13980l;
                pathComponent.f13834o = true;
                pathComponent.c();
                pathComponent.f13830k = lVar.f13981m;
                pathComponent.f13835p = true;
                pathComponent.c();
                pathComponent.f13831l = lVar.f13982n;
                pathComponent.f13835p = true;
                pathComponent.c();
                pathComponent.f13832m = lVar.f13983o;
                pathComponent.f13835p = true;
                pathComponent.c();
                groupComponent.e(i10, pathComponent);
            } else if (jVar instanceof h) {
                GroupComponent groupComponent2 = new GroupComponent();
                h hVar2 = (h) jVar;
                groupComponent2.f13813k = hVar2.f13960b;
                groupComponent2.c();
                groupComponent2.f13814l = hVar2.f13961c;
                groupComponent2.f13821s = true;
                groupComponent2.c();
                groupComponent2.f13817o = hVar2.f13964f;
                groupComponent2.f13821s = true;
                groupComponent2.c();
                groupComponent2.f13818p = hVar2.f13965g;
                groupComponent2.f13821s = true;
                groupComponent2.c();
                groupComponent2.f13819q = hVar2.f13966h;
                groupComponent2.f13821s = true;
                groupComponent2.c();
                groupComponent2.f13820r = hVar2.f13967i;
                groupComponent2.f13821s = true;
                groupComponent2.c();
                groupComponent2.f13815m = hVar2.f13962d;
                groupComponent2.f13821s = true;
                groupComponent2.c();
                groupComponent2.f13816n = hVar2.f13963e;
                groupComponent2.f13821s = true;
                groupComponent2.c();
                groupComponent2.f13809f = hVar2.j;
                groupComponent2.f13810g = true;
                groupComponent2.c();
                a(groupComponent2, hVar2);
                groupComponent.e(i10, groupComponent2);
            }
        }
    }

    public static final VectorPainter b(c cVar, InterfaceC1084f interfaceC1084f) {
        p013b0.c cVar2 = (p013b0.c) interfaceC1084f.x(CompositionLocalsKt.f14847h);
        boolean zI = interfaceC1084f.i((((long) Float.floatToRawIntBits(cVar2.getDensity())) & 4294967295L) | (((long) Float.floatToRawIntBits(cVar.j)) << 32));
        Object objF = interfaceC1084f.f();
        if (zI || objF == InterfaceC1084f.a.f12980a) {
            GroupComponent groupComponent = new GroupComponent();
            a(groupComponent, cVar.f13874f);
            r rVar = r.f47939a;
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(cVar2.T0(cVar.f13870b))) << 32) | (((long) Float.floatToRawIntBits(cVar2.T0(cVar.f13871c))) & 4294967295L);
            float fIntBitsToFloat = cVar.f13872d;
            if (Float.isNaN(fIntBitsToFloat)) {
                fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32));
            }
            float fIntBitsToFloat2 = cVar.f13873e;
            if (Float.isNaN(fIntBitsToFloat2)) {
                fIntBitsToFloat2 = Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L));
            }
            long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(fIntBitsToFloat2)));
            VectorPainter vectorPainter = new VectorPainter(groupComponent);
            long j = cVar.f13875g;
            A a10 = j != 16 ? new A(cVar.f13876h, j) : null;
            vectorPainter.f13853g.setValue(new I.h(jFloatToRawIntBits));
            vectorPainter.f13854h.setValue(Boolean.valueOf(cVar.f13877i));
            VectorComponent vectorComponent = vectorPainter.f13855i;
            vectorComponent.f13846g.setValue(a10);
            vectorComponent.f13848i.setValue(new I.h(jFloatToRawIntBits2));
            vectorComponent.f13842c = cVar.f13869a;
            interfaceC1084f.E(vectorPainter);
            objF = vectorPainter;
        }
        return (VectorPainter) objF;
    }
}
