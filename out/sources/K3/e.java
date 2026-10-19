package K3;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.core.view.C1293h;

/* JADX INFO: compiled from: BitmapTransformation.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class e implements A3.g<Bitmap> {
    @Override // A3.g
    public final D3.o<Bitmap> b(Context context, D3.o<Bitmap> oVar, int i10, int i11) {
        if (!X3.j.h(i10, i11)) {
            throw new IllegalArgumentException(C1293h.h("Cannot apply transformation on width: ", " or height: ", " less than or equal to zero and not Target.SIZE_ORIGINAL", i10, i11));
        }
        E3.c cVar = com.bumptech.glide.b.b(context).f24470b;
        Bitmap bitmap = oVar.get();
        if (i10 == Integer.MIN_VALUE) {
            i10 = bitmap.getWidth();
        }
        if (i11 == Integer.MIN_VALUE) {
            i11 = bitmap.getHeight();
        }
        Bitmap bitmapC = c(cVar, bitmap, i10, i11);
        return bitmap.equals(bitmapC) ? oVar : d.d(cVar, bitmapC);
    }

    public abstract Bitmap c(E3.c cVar, Bitmap bitmap, int i10, int i11);
}
