package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;

/* JADX INFO: compiled from: TintTypedArray.java */
/* JADX INFO: loaded from: classes.dex */
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f8928a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TypedArray f8929b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TypedValue f8930c;

    public c0(Context context, TypedArray typedArray) {
        this.f8928a = context;
        this.f8929b = typedArray;
    }

    public static c0 e(Context context, AttributeSet attributeSet, int[] iArr) {
        return new c0(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    public static c0 f(Context context, AttributeSet attributeSet, int[] iArr, int i10, int i11) {
        return new c0(context, context.obtainStyledAttributes(attributeSet, iArr, i10, i11));
    }

    public final ColorStateList a(int i10) {
        int resourceId;
        ColorStateList colorStateListB;
        TypedArray typedArray = this.f8929b;
        return (!typedArray.hasValue(i10) || (resourceId = typedArray.getResourceId(i10, 0)) == 0 || (colorStateListB = p186p0.a.b(this.f8928a, resourceId)) == null) ? typedArray.getColorStateList(i10) : colorStateListB;
    }

    public final Drawable b(int i10) {
        int resourceId;
        TypedArray typedArray = this.f8929b;
        return (!typedArray.hasValue(i10) || (resourceId = typedArray.getResourceId(i10, 0)) == 0) ? typedArray.getDrawable(i10) : com.voltasit.obdeleven.domain.usecases.device.v.e(this.f8928a, resourceId);
    }

    public final Drawable c(int i10) {
        int resourceId;
        Drawable drawableD;
        if (!this.f8929b.hasValue(i10) || (resourceId = this.f8929b.getResourceId(i10, 0)) == 0) {
            return null;
        }
        C0856i c0856iA = C0856i.a();
        Context context = this.f8928a;
        synchronized (c0856iA) {
            drawableD = c0856iA.f8982a.d(context, resourceId, true);
        }
        return drawableD;
    }

    public final Typeface d(int i10, int i11, C0869w.a aVar) {
        int resourceId = this.f8929b.getResourceId(i10, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.f8930c == null) {
            this.f8930c = new TypedValue();
        }
        TypedValue typedValue = this.f8930c;
        ThreadLocal<TypedValue> threadLocal = p211r0.f.f46248a;
        Context context = this.f8928a;
        if (context.isRestricted()) {
            return null;
        }
        return p211r0.f.b(context, resourceId, typedValue, i11, aVar, true, false);
    }

    public final void g() {
        this.f8929b.recycle();
    }
}
