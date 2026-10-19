package coil.util;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: Requests.kt */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final coil.request.b f23159a = new coil.request.b(0);

    public static final boolean a(coil.request.g gVar) {
        int iOrdinal = gVar.f23053h.ordinal();
        if (iOrdinal == 0) {
            return false;
        }
        if (iOrdinal != 1) {
            if (iOrdinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
            Z2.f fVar = gVar.f23044F.f23027a;
            Z2.f fVar2 = gVar.f23069y;
            if (fVar != null || !(fVar2 instanceof Z2.b)) {
                p004a3.b bVar = gVar.f23048c;
                if (!(bVar instanceof p004a3.c) || !(fVar2 instanceof Z2.i)) {
                    return false;
                }
                p004a3.c cVar = (p004a3.c) bVar;
                if (!(cVar.a() instanceof ImageView) || cVar.a() != ((Z2.i) fVar2).a()) {
                    return false;
                }
            }
        }
        return true;
    }

    public static final Drawable b(coil.request.g gVar, Drawable drawable, Integer num, Drawable drawable2) {
        if (drawable != null) {
            return drawable;
        }
        if (num == null) {
            return drawable2;
        }
        if (num.intValue() == 0) {
            return null;
        }
        Context context = gVar.f23046a;
        int iIntValue = num.intValue();
        Drawable drawableE = com.voltasit.obdeleven.domain.usecases.device.v.e(context, iIntValue);
        if (drawableE != null) {
            return drawableE;
        }
        throw new IllegalStateException(J4.i.b(iIntValue, "Invalid resource ID: ").toString());
    }
}
