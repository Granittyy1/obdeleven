package p131k5;

import U4.C0804l;
import android.graphics.Bitmap;
import com.google.android.gms.measurement.internal.h;
import com.google.android.gms.tasks.RuntimeExecutionException;
import com.voltas.crop.CropImageActivity;
import com.voltas.crop.CropImageView;
import p191p5.g;
import p191p5.i;
import p191p5.o;
import p191p5.y;
import p278w8.f;

/* JADX INFO: renamed from: k5.o, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC2545o implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f42312b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f42313c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f42314d;

    public /* synthetic */ RunnableC2545o(Object obj, int i10, Object obj2) {
        this.f42312b = i10;
        this.f42313c = obj2;
        this.f42314d = obj;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        switch (this.f42312b) {
            case 0:
                ((E1) this.f42313c).b();
                if (!C2507f0.b()) {
                    boolean z10 = ((AbstractC2549p) this.f42314d).f42359c != 0;
                    ((AbstractC2549p) this.f42314d).f42359c = 0L;
                    if (z10) {
                        ((AbstractC2549p) this.f42314d).c();
                    }
                } else {
                    ((E1) this.f42313c).i().z(this);
                }
                break;
            case 1:
                BinderC2535l1 binderC2535l1 = (BinderC2535l1) this.f42314d;
                binderC2535l1.f42293c.Y();
                C2496d c2496d = (C2496d) this.f42313c;
                Object objA = c2496d.f42125d.a();
                h hVar = binderC2535l1.f42293c;
                if (objA != null) {
                    hVar.getClass();
                    String str = c2496d.f42123b;
                    C0804l.h(str);
                    o3 o3VarL = hVar.L(str);
                    if (o3VarL != null) {
                        hVar.I(c2496d, o3VarL);
                    }
                } else {
                    hVar.getClass();
                    String str2 = c2496d.f42123b;
                    C0804l.h(str2);
                    o3 o3VarL2 = hVar.L(str2);
                    if (o3VarL2 != null) {
                        hVar.t(c2496d, o3VarL2);
                    }
                }
                break;
            case 2:
                o oVar = (o) this.f42314d;
                try {
                    g gVar = (g) oVar.f45829c.i((g) this.f42313c);
                    if (gVar != null) {
                        y yVar = i.f45813b;
                        gVar.f(yVar, oVar);
                        gVar.d(yVar, oVar);
                        gVar.a(yVar, oVar);
                    } else {
                        oVar.d(new NullPointerException("Continuation returned null"));
                    }
                    break;
                } catch (RuntimeExecutionException e10) {
                    if (e10.getCause() instanceof Exception) {
                        oVar.f45830d.s((Exception) e10.getCause());
                        return;
                    } else {
                        oVar.f45830d.s(e10);
                        return;
                    }
                } catch (Exception e11) {
                    oVar.f45830d.s(e11);
                    return;
                }
                break;
            default:
                CropImageView cropImageView = ((CropImageActivity) this.f42314d).f29576o;
                cropImageView.getClass();
                cropImageView.e(new f(null, 0));
                ((Bitmap) this.f42313c).recycle();
                break;
        }
    }
}
