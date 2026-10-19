package U4;

import S4.C0760b;
import android.app.PendingIntent;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class N extends com.google.android.gms.internal.common.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractC0794b f6362a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N(AbstractC0794b abstractC0794b, Looper looper) {
        super(looper);
        Objects.requireNonNull(abstractC0794b);
        this.f6362a = abstractC0794b;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Boolean bool;
        O o10;
        AbstractC0794b abstractC0794b = this.f6362a;
        if (abstractC0794b.f6392C.get() != message.arg1) {
            int i10 = message.what;
            if ((i10 == 2 || i10 == 1 || i10 == 7) && (o10 = (O) message.obj) != null) {
                synchronized (o10) {
                    o10.f6363a = null;
                }
                AbstractC0794b abstractC0794b2 = o10.f6365c;
                synchronized (abstractC0794b2.f6408r) {
                    abstractC0794b2.f6408r.remove(o10);
                }
                return;
            }
            return;
        }
        int i11 = message.what;
        if ((i11 == 1 || i11 == 7 || i11 == 4 || i11 == 5) && !abstractC0794b.f()) {
            O o11 = (O) message.obj;
            if (o11 != null) {
                synchronized (o11) {
                    o11.f6363a = null;
                }
                AbstractC0794b abstractC0794b3 = o11.f6365c;
                synchronized (abstractC0794b3.f6408r) {
                    abstractC0794b3.f6408r.remove(o11);
                }
                return;
            }
            return;
        }
        int i12 = message.what;
        if (i12 == 4) {
            abstractC0794b.f6416z = new C0760b(message.arg2, null, null);
            if (!abstractC0794b.f6390A && !TextUtils.isEmpty(abstractC0794b.B()) && !TextUtils.isEmpty(null)) {
                try {
                    Class.forName(abstractC0794b.B());
                    if (!abstractC0794b.f6390A) {
                        abstractC0794b.H(3, null);
                        return;
                    }
                } catch (ClassNotFoundException unused) {
                }
            }
            C0760b c0760b = abstractC0794b.f6416z;
            if (c0760b == null) {
                c0760b = new C0760b(8, null, null);
            }
            abstractC0794b.f6406p.a(c0760b);
            abstractC0794b.f6396e = c0760b.f5527c;
            abstractC0794b.f6397f = System.currentTimeMillis();
            return;
        }
        if (i12 == 5) {
            C0760b c0760b2 = abstractC0794b.f6416z;
            if (c0760b2 == null) {
                c0760b2 = new C0760b(8, null, null);
            }
            abstractC0794b.f6406p.a(c0760b2);
            abstractC0794b.f6396e = c0760b2.f5527c;
            abstractC0794b.f6397f = System.currentTimeMillis();
            return;
        }
        if (i12 == 3) {
            Object obj = message.obj;
            C0760b c0760b3 = new C0760b(message.arg2, obj instanceof PendingIntent ? (PendingIntent) obj : null, null);
            abstractC0794b.f6406p.a(c0760b3);
            abstractC0794b.f6396e = c0760b3.f5527c;
            abstractC0794b.f6397f = System.currentTimeMillis();
            return;
        }
        if (i12 == 6) {
            abstractC0794b.H(5, null);
            AbstractC0794b.a aVar = abstractC0794b.f6411u;
            if (aVar != null) {
                aVar.e(message.arg2);
            }
            abstractC0794b.E(message.arg2);
            abstractC0794b.G(5, 1, null);
            return;
        }
        if (i12 == 2 && !abstractC0794b.b()) {
            O o12 = (O) message.obj;
            if (o12 != null) {
                synchronized (o12) {
                    o12.f6363a = null;
                }
                AbstractC0794b abstractC0794b4 = o12.f6365c;
                synchronized (abstractC0794b4.f6408r) {
                    abstractC0794b4.f6408r.remove(o12);
                }
                return;
            }
            return;
        }
        int i13 = message.what;
        if (i13 != 2 && i13 != 1 && i13 != 7) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(i13).length() + 34);
            sb2.append("Don't know how to handle message: ");
            sb2.append(i13);
            Log.wtf("GmsClient", sb2.toString(), new Exception());
            return;
        }
        O o13 = (O) message.obj;
        synchronized (o13) {
            try {
                bool = o13.f6363a;
                if (o13.f6364b) {
                    new StringBuilder(o13.toString().length() + 47);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (bool != null) {
            o13.a(bool);
        }
        synchronized (o13) {
            o13.f6364b = true;
        }
        synchronized (o13) {
            o13.f6363a = null;
        }
        AbstractC0794b abstractC0794b5 = o13.f6365c;
        synchronized (abstractC0794b5.f6408r) {
            abstractC0794b5.f6408r.remove(o13);
        }
    }
}
