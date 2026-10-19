package androidx.compose.foundation.layout;

import androidx.compose.ui.platform.InspectableValueKt;

/* JADX INFO: compiled from: Size.kt */
/* JADX INFO: loaded from: classes.dex */
public final class W {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final FillElement f10224a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final FillElement f10225b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final FillElement f10226c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final WrapContentElement f10227d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final WrapContentElement f10228e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final WrapContentElement f10229f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final WrapContentElement f10230g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final WrapContentElement f10231h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final WrapContentElement f10232i;

    static {
        Direction direction = Direction.f10110c;
        f10224a = new FillElement(direction, 1.0f);
        Direction direction2 = Direction.f10109b;
        f10225b = new FillElement(direction2, 1.0f);
        Direction direction3 = Direction.f10111d;
        f10226c = new FillElement(direction3, 1.0f);
        androidx.compose.ui.f.a aVar = androidx.compose.ui.d.a.f13347n;
        f10227d = new WrapContentElement(direction, false, new WrapContentElement$Companion$width$1(aVar), aVar);
        androidx.compose.ui.f.a aVar2 = androidx.compose.ui.d.a.f13346m;
        f10228e = new WrapContentElement(direction, false, new WrapContentElement$Companion$width$1(aVar2), aVar2);
        androidx.compose.ui.f.b bVar = androidx.compose.ui.d.a.f13344k;
        f10229f = new WrapContentElement(direction2, false, new WrapContentElement$Companion$height$1(bVar), bVar);
        androidx.compose.ui.f.b bVar2 = androidx.compose.ui.d.a.j;
        f10230g = new WrapContentElement(direction2, false, new WrapContentElement$Companion$height$1(bVar2), bVar2);
        androidx.compose.ui.f fVar = androidx.compose.ui.d.a.f13339e;
        f10231h = new WrapContentElement(direction3, false, new WrapContentElement$Companion$size$1(fVar), fVar);
        androidx.compose.ui.f fVar2 = androidx.compose.ui.d.a.f13335a;
        f10232i = new WrapContentElement(direction3, false, new WrapContentElement$Companion$size$1(fVar2), fVar2);
    }

    public static final androidx.compose.ui.h a(float f10, float f11, androidx.compose.ui.h hVar) {
        return hVar.i(new UnspecifiedConstraintsElement(f10, f11));
    }

    public static /* synthetic */ androidx.compose.ui.h b(androidx.compose.ui.h hVar, float f10, float f11, int i10) {
        if ((i10 & 1) != 0) {
            f10 = Float.NaN;
        }
        if ((i10 & 2) != 0) {
            f11 = Float.NaN;
        }
        return a(f10, f11, hVar);
    }

    public static final androidx.compose.ui.h c(androidx.compose.ui.h hVar, float f10) {
        return hVar.i(f10 == 1.0f ? f10225b : new FillElement(Direction.f10109b, f10));
    }

    public static final androidx.compose.ui.h d(androidx.compose.ui.h hVar, float f10) {
        return hVar.i(f10 == 1.0f ? f10224a : new FillElement(Direction.f10110c, f10));
    }

    public static final androidx.compose.ui.h e(androidx.compose.ui.h hVar, float f10) {
        return hVar.i(new SizeElement(0.0f, f10, 0.0f, f10, true, InspectableValueKt.f14929a, 5));
    }

    public static final androidx.compose.ui.h f(float f10, float f11, androidx.compose.ui.h hVar) {
        return hVar.i(new SizeElement(0.0f, f10, 0.0f, f11, true, InspectableValueKt.f14929a, 5));
    }

    public static /* synthetic */ androidx.compose.ui.h g(androidx.compose.ui.h hVar, float f10, float f11, int i10) {
        if ((i10 & 1) != 0) {
            f10 = Float.NaN;
        }
        if ((i10 & 2) != 0) {
            f11 = Float.NaN;
        }
        return f(f10, f11, hVar);
    }

    public static final androidx.compose.ui.h h(androidx.compose.ui.h hVar, float f10) {
        return hVar.i(new SizeElement(0.0f, f10, 0.0f, f10, false, InspectableValueKt.f14929a, 5));
    }

    public static final androidx.compose.ui.h i(androidx.compose.ui.h hVar, float f10) {
        return hVar.i(new SizeElement(f10, f10, f10, f10, false, InspectableValueKt.f14929a));
    }

    public static final androidx.compose.ui.h j(float f10, float f11, androidx.compose.ui.h hVar) {
        return hVar.i(new SizeElement(f10, f11, f10, f11, false, InspectableValueKt.f14929a));
    }

    public static androidx.compose.ui.h k(androidx.compose.ui.h hVar, float f10, float f11, float f12, float f13, int i10) {
        return hVar.i(new SizeElement(f10, (i10 & 2) != 0 ? Float.NaN : f11, (i10 & 4) != 0 ? Float.NaN : f12, (i10 & 8) != 0 ? Float.NaN : f13, false, InspectableValueKt.f14929a));
    }

    public static final androidx.compose.ui.h l(float f10) {
        return new SizeElement(f10, 0.0f, f10, 0.0f, false, InspectableValueKt.f14929a, 10);
    }

    public static final androidx.compose.ui.h m(androidx.compose.ui.h hVar, float f10) {
        return hVar.i(new SizeElement(f10, f10, f10, f10, true, InspectableValueKt.f14929a));
    }

    public static final androidx.compose.ui.h n(float f10, float f11, androidx.compose.ui.h hVar) {
        return hVar.i(new SizeElement(f10, f11, f10, f11, true, InspectableValueKt.f14929a));
    }

    public static final androidx.compose.ui.h o(androidx.compose.ui.h hVar, float f10, float f11, float f12, float f13) {
        return hVar.i(new SizeElement(f10, f11, f12, f13, true, InspectableValueKt.f14929a));
    }

    public static /* synthetic */ androidx.compose.ui.h p(androidx.compose.ui.h hVar, float f10, float f11, float f12, float f13, int i10) {
        if ((i10 & 1) != 0) {
            f10 = Float.NaN;
        }
        if ((i10 & 2) != 0) {
            f11 = Float.NaN;
        }
        if ((i10 & 4) != 0) {
            f12 = Float.NaN;
        }
        if ((i10 & 8) != 0) {
            f13 = Float.NaN;
        }
        return o(hVar, f10, f11, f12, f13);
    }

    public static final androidx.compose.ui.h q(androidx.compose.ui.h hVar, float f10) {
        return hVar.i(new SizeElement(f10, 0.0f, f10, 0.0f, true, InspectableValueKt.f14929a, 10));
    }

    public static androidx.compose.ui.h r(androidx.compose.ui.h hVar, float f10) {
        return hVar.i(new SizeElement(Float.NaN, 0.0f, f10, 0.0f, true, InspectableValueKt.f14929a, 10));
    }

    public static androidx.compose.ui.h s(androidx.compose.ui.h hVar) {
        WrapContentElement wrapContentElement;
        androidx.compose.ui.f.b bVar = androidx.compose.ui.d.a.f13344k;
        if (kotlin.jvm.internal.i.a(bVar, bVar)) {
            wrapContentElement = f10229f;
        } else {
            wrapContentElement = kotlin.jvm.internal.i.a(bVar, androidx.compose.ui.d.a.j) ? f10230g : new WrapContentElement(Direction.f10109b, false, new WrapContentElement$Companion$height$1(bVar), bVar);
        }
        return hVar.i(wrapContentElement);
    }

    public static androidx.compose.ui.h t(androidx.compose.ui.h hVar, androidx.compose.ui.f fVar, int i10) {
        WrapContentElement wrapContentElement;
        int i11 = i10 & 1;
        androidx.compose.ui.f fVar2 = androidx.compose.ui.d.a.f13339e;
        if (i11 != 0) {
            fVar = fVar2;
        }
        if (kotlin.jvm.internal.i.a(fVar, fVar2)) {
            wrapContentElement = f10231h;
        } else {
            wrapContentElement = kotlin.jvm.internal.i.a(fVar, androidx.compose.ui.d.a.f13335a) ? f10232i : new WrapContentElement(Direction.f10111d, false, new WrapContentElement$Companion$size$1(fVar), fVar);
        }
        return hVar.i(wrapContentElement);
    }

    public static androidx.compose.ui.h u(androidx.compose.ui.h hVar) {
        WrapContentElement wrapContentElement;
        androidx.compose.ui.f.a aVar = androidx.compose.ui.d.a.f13347n;
        if (kotlin.jvm.internal.i.a(aVar, aVar)) {
            wrapContentElement = f10227d;
        } else {
            wrapContentElement = kotlin.jvm.internal.i.a(aVar, androidx.compose.ui.d.a.f13346m) ? f10228e : new WrapContentElement(Direction.f10110c, false, new WrapContentElement$Companion$width$1(aVar), aVar);
        }
        return hVar.i(wrapContentElement);
    }
}
