package U;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.O0;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import p211r0.f;

/* JADX INFO: compiled from: ColorResources.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class a {
    public static final long a(InterfaceC1084f interfaceC1084f, int i10) {
        O0 o10 = AndroidCompositionLocals_androidKt.f14793b;
        Context context = (Context) interfaceC1084f.x(o10);
        interfaceC1084f.x(AndroidCompositionLocals_androidKt.f14792a);
        Resources resources = ((Context) interfaceC1084f.x(o10)).getResources();
        Resources.Theme theme = context.getTheme();
        ThreadLocal<TypedValue> threadLocal = f.f46248a;
        return Q3.d.d(f.b.a(resources, i10, theme));
    }
}
