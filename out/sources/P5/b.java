package P5;

import android.content.Context;
import android.util.TypedValue;

/* JADX INFO: compiled from: MaterialAttributes.java */
/* JADX INFO: loaded from: classes3.dex */
public final class b {
    public static TypedValue a(Context context, int i10) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i10, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    public static boolean b(Context context, int i10, boolean z10) {
        TypedValue typedValueA = a(context, i10);
        if (typedValueA == null || typedValueA.type != 18) {
            return z10;
        }
        return typedValueA.data != 0;
    }

    public static TypedValue c(Context context, String str, int i10) {
        TypedValue typedValueA = a(context, i10);
        if (typedValueA != null) {
            return typedValueA;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", str, context.getResources().getResourceName(i10)));
    }
}
