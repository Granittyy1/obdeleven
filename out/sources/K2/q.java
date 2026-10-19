package K2;

import Q2.C0738o;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.DefaultSpecialEffectsController;
import java.util.Iterator;
import java.util.concurrent.ExecutionException;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4207b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f4208c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f4209d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f4210e;

    public /* synthetic */ q(Object obj, Object obj2, Object obj3, int i10) {
        this.f4207b = i10;
        this.f4208c = obj;
        this.f4209d = obj2;
        this.f4210e = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        boolean zBooleanValue;
        switch (this.f4207b) {
            case 0:
                r rVar = (r) this.f4208c;
                androidx.work.impl.utils.futures.a aVar = (androidx.work.impl.utils.futures.a) this.f4209d;
                P p10 = (P) this.f4210e;
                rVar.getClass();
                try {
                    zBooleanValue = ((Boolean) aVar.get()).booleanValue();
                    break;
                } catch (InterruptedException | ExecutionException unused) {
                    zBooleanValue = true;
                }
                synchronized (rVar.f4221k) {
                    try {
                        C0738o c0738oG = Lb.a.g(p10.f4166e);
                        String str = c0738oG.f5025a;
                        if (rVar.c(str) == p10) {
                            rVar.b(str);
                        }
                        androidx.work.k.c().getClass();
                        Iterator it = rVar.j.iterator();
                        while (it.hasNext()) {
                            ((InterfaceC0711d) it.next()).b(c0738oG, zBooleanValue);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return;
            default:
                ViewGroup container = (ViewGroup) this.f4208c;
                kotlin.jvm.internal.i.e(container, "$container");
                DefaultSpecialEffectsController.a this$0 = (DefaultSpecialEffectsController.a) this.f4210e;
                kotlin.jvm.internal.i.e(this$0, "this$0");
                container.endViewTransition((View) this.f4209d);
                this$0.f17400c.f17417a.c(this$0);
                return;
        }
    }
}
