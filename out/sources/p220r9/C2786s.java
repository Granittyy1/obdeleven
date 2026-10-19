package p220r9;

import android.app.Activity;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.a;
import java.util.List;

/* JADX INFO: renamed from: r9.s, reason: case insensitive filesystem */
/* JADX INFO: compiled from: DeviceUtils.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C2786s {
    public static int a(Resources resources, float f10) {
        return (int) (f10 * (resources.getDisplayMetrics().densityDpi / 160));
    }

    public static int b(Activity activity) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        activity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int i10 = displayMetrics.widthPixels;
        int i11 = displayMetrics.heightPixels;
        boolean z10 = activity.getResources().getBoolean(R.bool.is_tablet);
        List<String> list = a.f29638c;
        if (a.C0320a.a(activity).b("is_landscape", z10)) {
            return i10 > i11 ? i10 : i11;
        }
        return displayMetrics.widthPixels;
    }
}
