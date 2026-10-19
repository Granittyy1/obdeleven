package M3;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import com.voltasit.obdeleven.domain.usecases.device.v;
import p211r0.f;

/* JADX INFO: compiled from: DrawableDecoderCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile boolean f4561a = true;

    public static Drawable a(Context context, Context context2, int i10, Resources.Theme theme) {
        Context context3;
        try {
            if (f4561a) {
                if (theme != null) {
                    p138l.c cVar = new p138l.c(context2);
                    cVar.f44043b = theme;
                    context3 = cVar;
                } else {
                    context3 = context2;
                }
                return v.e(context3, i10);
            }
        } catch (Resources.NotFoundException unused) {
        } catch (IllegalStateException e10) {
            if (context.getPackageName().equals(context2.getPackageName())) {
                throw e10;
            }
            return p186p0.a.C0517a.b(context2, i10);
        } catch (NoClassDefFoundError unused2) {
            f4561a = false;
        }
        if (theme == null) {
            theme = context2.getTheme();
        }
        Resources resources = context2.getResources();
        ThreadLocal<TypedValue> threadLocal = f.f46248a;
        return f.a.a(resources, i10, theme);
    }
}
