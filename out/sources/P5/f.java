package P5;

import S4.o;
import android.content.res.Configuration;
import android.graphics.Typeface;
import android.os.Build;
import com.braze.Constants;

/* JADX INFO: compiled from: TypefaceUtils.java */
/* JADX INFO: loaded from: classes3.dex */
public final class f {
    public static Typeface a(Configuration configuration, Typeface typeface) {
        if (Build.VERSION.SDK_INT < 31 || configuration.fontWeightAdjustment == Integer.MAX_VALUE || configuration.fontWeightAdjustment == 0 || typeface == null) {
            return null;
        }
        return Typeface.create(typeface, o.d(configuration.fontWeightAdjustment + typeface.getWeight(), 1, Constants.BRAZE_MINIMUM_NOTIFICATION_DURATION_MILLIS), typeface.isItalic());
    }
}
