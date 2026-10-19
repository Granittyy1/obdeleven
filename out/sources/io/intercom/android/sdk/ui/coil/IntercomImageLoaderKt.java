package io.intercom.android.sdk.ui.coil;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import coil.RealImageLoader;
import coil.a;
import coil.c;
import coil.d;
import coil.decode.B;
import coil.decode.ImageDecoderDecoder;
import coil.decode.m;
import coil.e;
import coil.f;
import coil.request.b;
import coil.util.s;
import java.util.ArrayList;
import kotlin.jvm.internal.i;
import p293xa.g;

/* JADX INFO: compiled from: IntercomImageLoader.kt */
/* JADX INFO: loaded from: classes.dex */
public final class IntercomImageLoaderKt {
    private static f imageLoader;

    public static final f getImageLoader(Context context) {
        i.e(context, "context");
        if (imageLoader == null) {
            f.a aVar = new f.a(context);
            Bitmap.Config config = Bitmap.Config.ARGB_8888;
            b bVar = aVar.f22960b;
            aVar.f22960b = new b(bVar.f23013a, bVar.f23014b, bVar.f23015c, bVar.f23016d, bVar.f23017e, bVar.f23018f, config, bVar.f23020h, bVar.f23021i, bVar.j, bVar.f23022k, bVar.f23023l, bVar.f23024m, bVar.f23025n, bVar.f23026o);
            a.C0238a c0238a = new a.C0238a();
            int i10 = Build.VERSION.SDK_INT;
            ArrayList arrayList = c0238a.f22707e;
            if (i10 >= 28) {
                arrayList.add(new ImageDecoderDecoder.a());
            } else {
                arrayList.add(new m.a());
            }
            arrayList.add(new B.a());
            arrayList.add(new PdfDecoder.Factory());
            aVar.f22961c = c0238a.c();
            b bVar2 = aVar.f22960b;
            g gVarA = kotlin.a.a(new c(0, aVar));
            g gVarA2 = kotlin.a.a(new d(0, aVar));
            g gVarA3 = kotlin.a.a(new e(0));
            a aVar2 = aVar.f22961c;
            if (aVar2 == null) {
                aVar2 = new a();
            }
            s sVar = aVar.f22962d;
            imageLoader = new RealImageLoader(aVar.f22959a, bVar2, gVarA, gVarA2, gVarA3, aVar2, sVar);
        }
        f fVar = imageLoader;
        i.b(fVar);
        return fVar;
    }
}
