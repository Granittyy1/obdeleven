package p067f3;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import com.afollestad.materialdialogs.GravityEnum;

/* JADX INFO: compiled from: DialogUtils.java */
/* JADX INFO: loaded from: classes.dex */
public final class b {
    public static int a(float f10, int i10) {
        return Color.argb(Math.round(Color.alpha(i10) * f10), Color.red(i10), Color.green(i10), Color.blue(i10));
    }

    public static ColorStateList b(Context context, int i10) {
        int iF = f(context, R.attr.textColorPrimary, 0);
        if (i10 == 0) {
            i10 = iF;
        }
        return new ColorStateList(new int[][]{new int[]{-16842910}, new int[0]}, new int[]{a(0.4f, i10), i10});
    }

    public static boolean c(int i10) {
        return 1.0d - (((((double) Color.blue(i10)) * 0.114d) + ((((double) Color.green(i10)) * 0.587d) + (((double) Color.red(i10)) * 0.299d))) / 255.0d) >= 0.5d;
    }

    public static ColorStateList d(Context context, int i10, ColorStateList colorStateList) {
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{i10});
        try {
            TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(0);
            if (typedValuePeekValue == null) {
                typedArrayObtainStyledAttributes.recycle();
                return colorStateList;
            }
            int i11 = typedValuePeekValue.type;
            if (i11 >= 28 && i11 <= 31) {
                ColorStateList colorStateListB = b(context, typedValuePeekValue.data);
                typedArrayObtainStyledAttributes.recycle();
                return colorStateListB;
            }
            ColorStateList colorStateList2 = typedArrayObtainStyledAttributes.getColorStateList(0);
            if (colorStateList2 != null) {
                typedArrayObtainStyledAttributes.recycle();
                return colorStateList2;
            }
            typedArrayObtainStyledAttributes.recycle();
            return colorStateList;
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public static boolean e(Context context, int i10, boolean z10) {
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{i10});
        try {
            return typedArrayObtainStyledAttributes.getBoolean(0, z10);
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static int f(Context context, int i10, int i11) {
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{i10});
        try {
            return typedArrayObtainStyledAttributes.getColor(0, i11);
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static Drawable g(Context context, int i10) {
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{i10});
        try {
            return typedArrayObtainStyledAttributes.getDrawable(0);
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static GravityEnum h(Context context, int i10, GravityEnum gravityEnum) {
        int i11;
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{i10});
        try {
            int iOrdinal = gravityEnum.ordinal();
            if (iOrdinal != 1) {
                i11 = iOrdinal != 2 ? 0 : 2;
            } else {
                i11 = 1;
            }
            int i12 = typedArrayObtainStyledAttributes.getInt(0, i11);
            if (i12 != 1) {
                return i12 != 2 ? GravityEnum.f23188b : GravityEnum.f23190d;
            }
            return GravityEnum.f23189c;
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }
}
