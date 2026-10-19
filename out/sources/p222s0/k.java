package p222s0;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import com.braze.support.BrazeLogger;
import io.intercom.android.sdk.carousel.CarouselScreenFragment;
import java.io.File;
import java.util.concurrent.ConcurrentHashMap;
import p211r0.e;
import p283x0.l;

/* JADX INFO: compiled from: TypefaceCompatBaseImpl.java */
/* JADX INFO: loaded from: classes.dex */
public class k {

    /* JADX INFO: compiled from: TypefaceCompatBaseImpl.java */
    public interface a<T> {
        int a(T t8);

        boolean b(T t8);
    }

    public k() {
        new ConcurrentHashMap();
    }

    public Typeface a(Context context, e.c cVar, Resources resources, int i10) {
        throw null;
    }

    public Typeface b(Context context, l[] lVarArr, int i10) {
        throw null;
    }

    public Typeface c(Context context, Resources resources, int i10, String str, int i11) {
        File fileD = l.d(context);
        if (fileD == null) {
            return null;
        }
        try {
            if (l.b(fileD, resources, i10)) {
                return Typeface.createFromFile(fileD.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileD.delete();
        }
    }

    public l d(int i10, l[] lVarArr) {
        j jVar = new j();
        int i11 = (i10 & 1) == 0 ? CarouselScreenFragment.CAROUSEL_ANIMATION_MS : 700;
        boolean z10 = (i10 & 2) != 0;
        l lVar = null;
        int i12 = BrazeLogger.SUPPRESS;
        for (l lVar2 : lVarArr) {
            int iAbs = (Math.abs(jVar.a(lVar2) - i11) * 2) + (jVar.b(lVar2) == z10 ? 0 : 1);
            if (lVar == null || i12 > iAbs) {
                lVar = lVar2;
                i12 = iAbs;
            }
        }
        return lVar;
    }
}
