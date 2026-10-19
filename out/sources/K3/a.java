package K3;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import java.io.IOException;

/* JADX INFO: compiled from: BitmapDrawableDecoder.java */
/* JADX INFO: loaded from: classes.dex */
public final class a<DataType> implements A3.e<DataType, BitmapDrawable> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final A3.e<DataType, Bitmap> f4242a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Resources f4243b;

    public a(Resources resources, A3.e<DataType, Bitmap> eVar) {
        this.f4243b = resources;
        this.f4242a = eVar;
    }

    @Override // A3.e
    public final boolean a(DataType datatype, A3.d dVar) throws IOException {
        return this.f4242a.a(datatype, dVar);
    }

    @Override // A3.e
    public final D3.o<BitmapDrawable> b(DataType datatype, int i10, int i11, A3.d dVar) throws IOException {
        D3.o<Bitmap> oVarB = this.f4242a.b(datatype, i10, i11, dVar);
        if (oVarB == null) {
            return null;
        }
        return new n(this.f4243b, oVarB);
    }
}
