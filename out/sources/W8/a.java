package W8;

import android.app.Activity;
import android.util.DisplayMetrics;
import com.voltasit.obdeleven.R;
import java.util.List;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: ActivityExtensions.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class a {
    public static final int a(Activity activity) {
        i.e(activity, "<this>");
        DisplayMetrics displayMetrics = new DisplayMetrics();
        activity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int i10 = displayMetrics.widthPixels;
        int i11 = displayMetrics.heightPixels;
        boolean z10 = activity.getResources().getBoolean(R.bool.is_tablet);
        List<String> list = com.voltasit.obdeleven.a.f29638c;
        if (com.voltasit.obdeleven.a.C0320a.a(activity).b("is_landscape", z10)) {
            return i10 < i11 ? i10 : i11;
        }
        return displayMetrics.heightPixels;
    }
}
