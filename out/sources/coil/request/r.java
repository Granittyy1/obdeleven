package coil.request;

import android.graphics.Bitmap;
import android.os.Looper;
import android.view.View;
import androidx.lifecycle.InterfaceC1375s;
import androidx.lifecycle.Lifecycle;
import kotlinx.coroutines.G;
import kotlinx.coroutines.z0;

/* JADX INFO: compiled from: ViewTargetRequestManager.kt */
/* JADX INFO: loaded from: classes.dex */
public final class r implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f23134b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public F6.c f23135c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public z0 f23136d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public q f23137e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f23138f;

    public r(View view) {
        this.f23134b = view;
    }

    public final synchronized F6.c a(G g10) {
        F6.c cVar = this.f23135c;
        if (cVar != null) {
            Bitmap.Config[] configArr = coil.util.k.f23160a;
            if (kotlin.jvm.internal.i.a(Looper.myLooper(), Looper.getMainLooper()) && this.f23138f) {
                this.f23138f = false;
                return cVar;
            }
        }
        z0 z0Var = this.f23136d;
        if (z0Var != null) {
            z0Var.i(null);
        }
        this.f23136d = null;
        F6.c cVar2 = new F6.c(this.f23134b, g10);
        this.f23135c = cVar2;
        return cVar2;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        q qVar = this.f23137e;
        if (qVar == null) {
            return;
        }
        this.f23138f = true;
        qVar.f23129b.b(qVar.f23130c);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        q qVar = this.f23137e;
        if (qVar != null) {
            qVar.f23133f.i(null);
            p004a3.c<?> cVar = qVar.f23131d;
            boolean z10 = cVar instanceof InterfaceC1375s;
            Lifecycle lifecycle = qVar.f23132e;
            if (z10) {
                lifecycle.c((InterfaceC1375s) cVar);
            }
            lifecycle.c(qVar);
        }
    }
}
