package p055e3;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.widget.C0857j;
import com.voltasit.obdeleven.R;
import java.lang.reflect.Field;
import p067f3.b;
import p186p0.a;

/* JADX INFO: compiled from: MDTintHelper.java */
/* JADX INFO: loaded from: classes.dex */
public final class e {
    public static void a(EditText editText, int i10) {
        Context context = editText.getContext();
        ColorStateList colorStateList = new ColorStateList(new int[][]{new int[]{-16842910}, new int[]{-16842919, -16842908}, new int[0]}, new int[]{b.f(context, R.attr.colorControlNormal, 0), b.f(context, R.attr.colorControlNormal, 0), i10});
        if (editText instanceof C0857j) {
            ((C0857j) editText).setSupportBackgroundTintList(colorStateList);
        } else {
            editText.setBackgroundTintList(colorStateList);
        }
        try {
            Field declaredField = TextView.class.getDeclaredField("mCursorDrawableRes");
            declaredField.setAccessible(true);
            int i11 = declaredField.getInt(editText);
            Field declaredField2 = TextView.class.getDeclaredField("mEditor");
            declaredField2.setAccessible(true);
            Object obj = declaredField2.get(editText);
            Field declaredField3 = obj.getClass().getDeclaredField("mCursorDrawable");
            declaredField3.setAccessible(true);
            Drawable[] drawableArr = {a.C0517a.b(editText.getContext(), i11), a.C0517a.b(editText.getContext(), i11)};
            Drawable drawable = drawableArr[0];
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            drawable.setColorFilter(i10, mode);
            drawableArr[1].setColorFilter(i10, mode);
            declaredField3.set(obj, drawableArr);
        } catch (NoSuchFieldException e10) {
            e10.getMessage();
            e10.printStackTrace();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }
}
