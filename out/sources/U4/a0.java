package U4;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class a0 implements Handler.Callback {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b0 f6388b;

    public /* synthetic */ a0(b0 b0Var) {
        Objects.requireNonNull(b0Var);
        this.f6388b = b0Var;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i10 = message.what;
        if (i10 == 0) {
            b0 b0Var = this.f6388b;
            synchronized (b0Var.f6418d) {
                try {
                    Y y10 = (Y) message.obj;
                    Z z10 = (Z) b0Var.f6418d.get(y10);
                    if (z10 != null && z10.f6380b.isEmpty()) {
                        if (z10.f6382d) {
                            Y y11 = z10.f6384f;
                            b0 b0Var2 = z10.f6386h;
                            b0Var2.f6420f.removeMessages(1, y11);
                            b0Var2.f6421g.c(b0Var2.f6419e, z10);
                            z10.f6382d = false;
                            z10.f6381c = 2;
                        }
                        b0Var.f6418d.remove(y10);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return true;
        }
        if (i10 != 1) {
            return false;
        }
        b0 b0Var3 = this.f6388b;
        synchronized (b0Var3.f6418d) {
            try {
                Y y12 = (Y) message.obj;
                Z z11 = (Z) b0Var3.f6418d.get(y12);
                if (z11 != null && z11.f6381c == 3) {
                    String strValueOf = String.valueOf(y12);
                    StringBuilder sb2 = new StringBuilder(strValueOf.length() + 47);
                    sb2.append("Timeout waiting for ServiceConnection callback ");
                    sb2.append(strValueOf);
                    Log.e("GmsClientSupervisor", sb2.toString(), new Exception());
                    ComponentName componentName = z11.f6385g;
                    if (componentName == null) {
                        y12.getClass();
                        componentName = null;
                    }
                    if (componentName == null) {
                        String str = y12.f6378b;
                        C0804l.h(str);
                        componentName = new ComponentName(str, "unknown");
                    }
                    z11.onServiceDisconnected(componentName);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return true;
    }
}
