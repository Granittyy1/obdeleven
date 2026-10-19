package coil;

import android.content.Context;
import android.graphics.Bitmap;
import coil.util.k;
import coil.util.u;
import io.intercom.android.sdk.m5.conversation.ui.components.HeaderMenuItemRowKt;
import io.intercom.android.sdk.post.PostActivityV2;
import java.io.File;
import p318zb.z;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements Ia.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f22841b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f22842c;

    public /* synthetic */ d(int i10, Object obj) {
        this.f22841b = i10;
        this.f22842c = obj;
    }

    @Override // Ia.a
    public final Object invoke() {
        coil.disk.d dVarA;
        switch (this.f22841b) {
            case 0:
                f.a aVar = (f.a) this.f22842c;
                u uVar = u.f23177a;
                Context context = aVar.f22959a;
                synchronized (uVar) {
                    try {
                        dVarA = u.f23178b;
                        if (dVarA == null) {
                            coil.disk.a.C0240a c0240a = new coil.disk.a.C0240a();
                            Bitmap.Config[] configArr = k.f23160a;
                            File cacheDir = context.getCacheDir();
                            if (cacheDir == null) {
                                throw new IllegalStateException("cacheDir == null");
                            }
                            cacheDir.mkdirs();
                            File fileQ = Fa.c.q(cacheDir);
                            String str = z.f49122c;
                            c0240a.f22945a = z.a.b(fileQ);
                            dVarA = c0240a.a();
                            u.f23178b = dVarA;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return dVarA;
            case 1:
                return HeaderMenuItemRowKt.ExpandedHeaderMenuItemRow$lambda$4$lambda$3((Ia.a) this.f22842c);
            default:
                return PostActivityV2.appConfigProvider_delegate$lambda$1((PostActivityV2) this.f22842c);
        }
    }
}
