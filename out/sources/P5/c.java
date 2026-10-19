package P5;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.c0;
import com.voltasit.obdeleven.domain.usecases.device.v;

/* JADX INFO: compiled from: MaterialResources.java */
/* JADX INFO: loaded from: classes3.dex */
public final class c {
    public static ColorStateList a(Context context, TypedArray typedArray, int i10) {
        int resourceId;
        ColorStateList colorStateListB;
        return (!typedArray.hasValue(i10) || (resourceId = typedArray.getResourceId(i10, 0)) == 0 || (colorStateListB = p186p0.a.b(context, resourceId)) == null) ? typedArray.getColorStateList(i10) : colorStateListB;
    }

    public static ColorStateList b(Context context, c0 c0Var, int i10) {
        int resourceId;
        ColorStateList colorStateListB;
        TypedArray typedArray = c0Var.f8929b;
        return (!typedArray.hasValue(i10) || (resourceId = typedArray.getResourceId(i10, 0)) == 0 || (colorStateListB = p186p0.a.b(context, resourceId)) == null) ? c0Var.a(i10) : colorStateListB;
    }

    public static Drawable c(Context context, TypedArray typedArray, int i10) {
        int resourceId;
        Drawable drawableE;
        return (!typedArray.hasValue(i10) || (resourceId = typedArray.getResourceId(i10, 0)) == 0 || (drawableE = v.e(context, resourceId)) == null) ? typedArray.getDrawable(i10) : drawableE;
    }

    public static boolean d(Context context) {
        return context.getResources().getConfiguration().fontScale >= 1.3f;
    }
}
