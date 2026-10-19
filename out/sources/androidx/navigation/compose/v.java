package androidx.navigation.compose;

import android.content.Context;
import android.graphics.Bitmap;
import java.io.File;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class v implements Ia.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f19203b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f19204c;

    public /* synthetic */ v(Context context, int i10) {
        this.f19203b = i10;
        this.f19204c = context;
    }

    @Override // Ia.a
    public final Object invoke() {
        Context context = this.f19204c;
        switch (this.f19203b) {
            case 0:
                return D9.o.h(context);
            default:
                Bitmap.Config[] configArr = coil.util.k.f23160a;
                File cacheDir = context.getCacheDir();
                if (cacheDir == null) {
                    throw new IllegalStateException("cacheDir == null");
                }
                cacheDir.mkdirs();
                return cacheDir;
        }
    }
}
