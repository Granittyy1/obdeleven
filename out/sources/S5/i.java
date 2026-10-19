package S5;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;

/* JADX INFO: compiled from: ShapeAppearanceModel.java */
/* JADX INFO: loaded from: classes3.dex */
public final class i {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final g f5606m = new g(0.5f);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Cb.a f5607a = new h();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Cb.a f5608b = new h();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Cb.a f5609c = new h();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Cb.a f5610d = new h();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public c f5611e = new S5.a(0.0f);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public c f5612f = new S5.a(0.0f);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public c f5613g = new S5.a(0.0f);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public c f5614h = new S5.a(0.0f);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public e f5615i = new e();
    public e j = new e();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public e f5616k = new e();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public e f5617l = new e();

    /* JADX INFO: compiled from: ShapeAppearanceModel.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Cb.a f5618a = new h();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Cb.a f5619b = new h();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Cb.a f5620c = new h();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Cb.a f5621d = new h();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public c f5622e = new S5.a(0.0f);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public c f5623f = new S5.a(0.0f);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public c f5624g = new S5.a(0.0f);

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public c f5625h = new S5.a(0.0f);

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public e f5626i = new e();
        public e j = new e();

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public e f5627k = new e();

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public e f5628l = new e();

        public static float b(Cb.a aVar) {
            if (aVar instanceof h) {
                ((h) aVar).getClass();
                return -1.0f;
            }
            if (aVar instanceof d) {
                ((d) aVar).getClass();
            }
            return -1.0f;
        }

        public final i a() {
            i iVar = new i();
            iVar.f5607a = this.f5618a;
            iVar.f5608b = this.f5619b;
            iVar.f5609c = this.f5620c;
            iVar.f5610d = this.f5621d;
            iVar.f5611e = this.f5622e;
            iVar.f5612f = this.f5623f;
            iVar.f5613g = this.f5624g;
            iVar.f5614h = this.f5625h;
            iVar.f5615i = this.f5626i;
            iVar.j = this.j;
            iVar.f5616k = this.f5627k;
            iVar.f5617l = this.f5628l;
            return iVar;
        }

        public final void c(float f10) {
            this.f5625h = new S5.a(f10);
        }

        public final void d(float f10) {
            this.f5624g = new S5.a(f10);
        }

        public final void e(float f10) {
            this.f5622e = new S5.a(f10);
        }

        public final void f(float f10) {
            this.f5623f = new S5.a(f10);
        }
    }

    public static a a(Context context, int i10, int i11, c cVar) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i10);
        if (i11 != 0) {
            contextThemeWrapper = new ContextThemeWrapper(contextThemeWrapper, i11);
        }
        TypedArray typedArrayObtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(p204q5.a.f46099C);
        try {
            int i12 = typedArrayObtainStyledAttributes.getInt(0, 0);
            int i13 = typedArrayObtainStyledAttributes.getInt(3, i12);
            int i14 = typedArrayObtainStyledAttributes.getInt(4, i12);
            int i15 = typedArrayObtainStyledAttributes.getInt(2, i12);
            int i16 = typedArrayObtainStyledAttributes.getInt(1, i12);
            c cVarC = c(typedArrayObtainStyledAttributes, 5, cVar);
            c cVarC2 = c(typedArrayObtainStyledAttributes, 8, cVarC);
            c cVarC3 = c(typedArrayObtainStyledAttributes, 9, cVarC);
            c cVarC4 = c(typedArrayObtainStyledAttributes, 7, cVarC);
            c cVarC5 = c(typedArrayObtainStyledAttributes, 6, cVarC);
            a aVar = new a();
            Cb.a aVarT = A8.p.t(i13);
            aVar.f5618a = aVarT;
            a.b(aVarT);
            aVar.f5622e = cVarC2;
            Cb.a aVarT2 = A8.p.t(i14);
            aVar.f5619b = aVarT2;
            a.b(aVarT2);
            aVar.f5623f = cVarC3;
            Cb.a aVarT3 = A8.p.t(i15);
            aVar.f5620c = aVarT3;
            a.b(aVarT3);
            aVar.f5624g = cVarC4;
            Cb.a aVarT4 = A8.p.t(i16);
            aVar.f5621d = aVarT4;
            a.b(aVarT4);
            aVar.f5625h = cVarC5;
            return aVar;
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static a b(Context context, AttributeSet attributeSet, int i10, int i11) {
        S5.a aVar = new S5.a(0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p204q5.a.f46127u, i10, i11);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        return a(context, resourceId, resourceId2, aVar);
    }

    public static c c(TypedArray typedArray, int i10, c cVar) {
        TypedValue typedValuePeekValue = typedArray.peekValue(i10);
        if (typedValuePeekValue == null) {
            return cVar;
        }
        int i11 = typedValuePeekValue.type;
        if (i11 == 5) {
            return new S5.a(TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, typedArray.getResources().getDisplayMetrics()));
        }
        return i11 == 6 ? new g(typedValuePeekValue.getFraction(1.0f, 1.0f)) : cVar;
    }

    public final boolean d(RectF rectF) {
        boolean z10 = this.f5617l.getClass().equals(e.class) && this.j.getClass().equals(e.class) && this.f5615i.getClass().equals(e.class) && this.f5616k.getClass().equals(e.class);
        float fA = this.f5611e.a(rectF);
        return z10 && ((this.f5612f.a(rectF) > fA ? 1 : (this.f5612f.a(rectF) == fA ? 0 : -1)) == 0 && (this.f5614h.a(rectF) > fA ? 1 : (this.f5614h.a(rectF) == fA ? 0 : -1)) == 0 && (this.f5613g.a(rectF) > fA ? 1 : (this.f5613g.a(rectF) == fA ? 0 : -1)) == 0) && ((this.f5608b instanceof h) && (this.f5607a instanceof h) && (this.f5609c instanceof h) && (this.f5610d instanceof h));
    }

    public final a e() {
        a aVar = new a();
        aVar.f5618a = new h();
        aVar.f5619b = new h();
        aVar.f5620c = new h();
        aVar.f5621d = new h();
        aVar.f5622e = new S5.a(0.0f);
        aVar.f5623f = new S5.a(0.0f);
        aVar.f5624g = new S5.a(0.0f);
        aVar.f5625h = new S5.a(0.0f);
        aVar.f5626i = new e();
        aVar.j = new e();
        aVar.f5627k = new e();
        new e();
        aVar.f5618a = this.f5607a;
        aVar.f5619b = this.f5608b;
        aVar.f5620c = this.f5609c;
        aVar.f5621d = this.f5610d;
        aVar.f5622e = this.f5611e;
        aVar.f5623f = this.f5612f;
        aVar.f5624g = this.f5613g;
        aVar.f5625h = this.f5614h;
        aVar.f5626i = this.f5615i;
        aVar.j = this.j;
        aVar.f5627k = this.f5616k;
        aVar.f5628l = this.f5617l;
        return aVar;
    }
}
