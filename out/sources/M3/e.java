package M3;

import D3.o;
import android.graphics.drawable.Drawable;
import java.io.IOException;

/* JADX INFO: compiled from: UnitDrawableDecoder.java */
/* JADX INFO: loaded from: classes.dex */
public final class e implements A3.e<Drawable, Drawable> {
    @Override // A3.e
    public final /* bridge */ /* synthetic */ boolean a(Drawable drawable, A3.d dVar) throws IOException {
        return true;
    }

    @Override // A3.e
    public final o<Drawable> b(Drawable drawable, int i10, int i11, A3.d dVar) throws IOException {
        Drawable drawable2 = drawable;
        if (drawable2 != null) {
            return new c(drawable2);
        }
        return null;
    }
}
