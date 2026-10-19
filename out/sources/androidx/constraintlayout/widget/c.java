package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* JADX INFO: compiled from: Constraints.java */
/* JADX INFO: loaded from: classes.dex */
public final class c extends ViewGroup {

    /* JADX INFO: compiled from: Constraints.java */
    public static class a extends ConstraintLayout.a {

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public float f16612r0 = 1.0f;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public boolean f16613s0 = false;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public float f16614t0 = 0.0f;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public float f16615u0 = 0.0f;
        public float v0 = 0.0f;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public float f16616w0 = 0.0f;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public float f16617x0 = 1.0f;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public float f16618y0 = 1.0f;

        /* JADX INFO: renamed from: z0, reason: collision with root package name */
        public float f16619z0 = 0.0f;

        /* JADX INFO: renamed from: A0, reason: collision with root package name */
        public float f16608A0 = 0.0f;

        /* JADX INFO: renamed from: B0, reason: collision with root package name */
        public float f16609B0 = 0.0f;

        /* JADX INFO: renamed from: C0, reason: collision with root package name */
        public float f16610C0 = 0.0f;

        /* JADX INFO: renamed from: D0, reason: collision with root package name */
        public float f16611D0 = 0.0f;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new a();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        a aVar = new a(context, attributeSet);
        aVar.f16612r0 = 1.0f;
        aVar.f16613s0 = false;
        aVar.f16614t0 = 0.0f;
        aVar.f16615u0 = 0.0f;
        aVar.v0 = 0.0f;
        aVar.f16616w0 = 0.0f;
        aVar.f16617x0 = 1.0f;
        aVar.f16618y0 = 1.0f;
        aVar.f16619z0 = 0.0f;
        aVar.f16608A0 = 0.0f;
        aVar.f16609B0 = 0.0f;
        aVar.f16610C0 = 0.0f;
        aVar.f16611D0 = 0.0f;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p139l0.d.f44126d);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i10);
            if (index == 15) {
                aVar.f16612r0 = typedArrayObtainStyledAttributes.getFloat(index, aVar.f16612r0);
            } else if (index == 28) {
                aVar.f16614t0 = typedArrayObtainStyledAttributes.getFloat(index, aVar.f16614t0);
                aVar.f16613s0 = true;
            } else if (index == 23) {
                aVar.v0 = typedArrayObtainStyledAttributes.getFloat(index, aVar.v0);
            } else if (index == 24) {
                aVar.f16616w0 = typedArrayObtainStyledAttributes.getFloat(index, aVar.f16616w0);
            } else if (index == 22) {
                aVar.f16615u0 = typedArrayObtainStyledAttributes.getFloat(index, aVar.f16615u0);
            } else if (index == 20) {
                aVar.f16617x0 = typedArrayObtainStyledAttributes.getFloat(index, aVar.f16617x0);
            } else if (index == 21) {
                aVar.f16618y0 = typedArrayObtainStyledAttributes.getFloat(index, aVar.f16618y0);
            } else if (index == 16) {
                aVar.f16619z0 = typedArrayObtainStyledAttributes.getFloat(index, aVar.f16619z0);
            } else if (index == 17) {
                aVar.f16608A0 = typedArrayObtainStyledAttributes.getFloat(index, aVar.f16608A0);
            } else if (index == 18) {
                aVar.f16609B0 = typedArrayObtainStyledAttributes.getFloat(index, aVar.f16609B0);
            } else if (index == 19) {
                aVar.f16610C0 = typedArrayObtainStyledAttributes.getFloat(index, aVar.f16610C0);
            } else if (index == 27) {
                aVar.f16611D0 = typedArrayObtainStyledAttributes.getFloat(index, aVar.f16611D0);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        return aVar;
    }

    public b getConstraintSet() {
        getChildCount();
        throw null;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ConstraintLayout.a(layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
    }
}
