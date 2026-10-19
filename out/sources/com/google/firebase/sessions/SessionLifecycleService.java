package com.google.firebase.sessions;

import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import com.google.android.gms.internal.measurement.C1787c0;
import com.google.firebase.sessions.settings.SessionsSettings;
import java.util.ArrayList;
import java.util.Objects;
import kotlin.time.DurationUnit;

/* JADX INFO: compiled from: SessionLifecycleService.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class SessionLifecycleService extends Service {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HandlerThread f28658b = new HandlerThread("FirebaseSessions_HandlerThread");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a f28659c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Messenger f28660d;

    /* JADX INFO: compiled from: SessionLifecycleService.kt */
    public static final class a extends Handler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f28661a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f28662b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ArrayList<Messenger> f28663c;

        public a(Looper looper) {
            super(looper);
            this.f28663c = new ArrayList<>();
        }

        public final void a(Messenger messenger) {
            if (this.f28661a) {
                Object objB = p144l6.e.c().b(s.class);
                kotlin.jvm.internal.i.d(objB, "Firebase.app[SessionGenerator::class.java]");
                c(messenger, ((s) objB).b().f28730a);
            } else {
                Object objB2 = p144l6.e.c().b(n.class);
                kotlin.jvm.internal.i.d(objB2, "Firebase.app[SessionDatastore::class.java]");
                String strA = ((n) objB2).a();
                if (strA != null) {
                    c(messenger, strA);
                }
            }
        }

        public final void b() {
            Object objB = p144l6.e.c().b(s.class);
            kotlin.jvm.internal.i.d(objB, "Firebase.app[SessionGenerator::class.java]");
            s sVar = (s) objB;
            int i10 = sVar.f28741d + 1;
            sVar.f28741d = i10;
            String strA = i10 == 0 ? sVar.f28740c : sVar.a();
            int i11 = sVar.f28741d;
            sVar.f28738a.getClass();
            sVar.f28742e = new o(strA, sVar.f28740c, i11, 1000 * System.currentTimeMillis());
            sVar.b();
            Object objB2 = p144l6.e.c().b(s.class);
            kotlin.jvm.internal.i.d(objB2, "Firebase.app[SessionGenerator::class.java]");
            ((s) objB2).b();
            Object objB3 = p144l6.e.c().b(s.class);
            kotlin.jvm.internal.i.d(objB3, "Firebase.app[SessionGenerator::class.java]");
            ((s) objB3).b().toString();
            Object objB4 = p144l6.e.c().b(r.class);
            kotlin.jvm.internal.i.d(objB4, "Firebase.app[SessionFirelogPublisher::class.java]");
            Object objB5 = p144l6.e.c().b(s.class);
            kotlin.jvm.internal.i.d(objB5, "Firebase.app[SessionGenerator::class.java]");
            ((r) objB4).a(((s) objB5).b());
            for (Messenger it : new ArrayList(this.f28663c)) {
                kotlin.jvm.internal.i.d(it, "it");
                a(it);
            }
            Object objB6 = p144l6.e.c().b(n.class);
            kotlin.jvm.internal.i.d(objB6, "Firebase.app[SessionDatastore::class.java]");
            Object objB7 = p144l6.e.c().b(s.class);
            kotlin.jvm.internal.i.d(objB7, "Firebase.app[SessionGenerator::class.java]");
            ((n) objB6).b(((s) objB7).b().f28730a);
        }

        public final void c(Messenger messenger, String str) {
            try {
                Bundle bundle = new Bundle();
                bundle.putString("SessionUpdateExtra", str);
                Message messageObtain = Message.obtain(null, 3, 0, 0);
                messageObtain.setData(bundle);
                messenger.send(messageObtain);
            } catch (DeadObjectException unused) {
                Objects.toString(messenger);
                this.f28663c.remove(messenger);
            } catch (Exception unused2) {
                Objects.toString(messenger);
            }
        }

        /* JADX WARN: Code duplicated, block: B:29:0x00ad  */
        /* JADX WARN: Code duplicated, block: B:31:0x00b5  */
        /* JADX WARN: Code duplicated, block: B:33:0x00b9  */
        /* JADX WARN: Code duplicated, block: B:35:0x00cd  */
        /* JADX WARN: Code duplicated, block: B:40:0x00dc  */
        /* JADX WARN: Code duplicated, block: B:52:0x0107  */
        @Override // android.os.Handler
        public final void handleMessage(Message msg) {
            com.google.firebase.sessions.settings.c cVar;
            Integer num;
            long jT;
            Pa.b bVar = null;
            kotlin.jvm.internal.i.e(msg, "msg");
            if (this.f28662b > msg.getWhen()) {
                msg.getWhen();
                return;
            }
            int i10 = msg.what;
            if (i10 != 1) {
                if (i10 == 2) {
                    msg.getWhen();
                    this.f28662b = msg.getWhen();
                    return;
                }
                if (i10 != 4) {
                    msg.toString();
                    super.handleMessage(msg);
                    return;
                }
                ArrayList<Messenger> arrayList = this.f28663c;
                arrayList.add(msg.replyTo);
                Messenger messenger = msg.replyTo;
                kotlin.jvm.internal.i.d(messenger, "msg.replyTo");
                a(messenger);
                Objects.toString(msg.replyTo);
                msg.getWhen();
                arrayList.size();
                return;
            }
            msg.getWhen();
            if (this.f28661a) {
                long when = msg.getWhen() - this.f28662b;
                SessionsSettings.f28748c.getClass();
                Object objB = p144l6.e.c().b(SessionsSettings.class);
                kotlin.jvm.internal.i.d(objB, "Firebase.app[SessionsSettings::class.java]");
                SessionsSettings sessionsSettings = (SessionsSettings) objB;
                Bundle bundle = (Bundle) sessionsSettings.f28750a.f28761a;
                Pa.b bVar2 = bundle.containsKey("firebase_sessions_sessions_restart_timeout") ? new Pa.b(C1787c0.t(bundle.getInt("firebase_sessions_sessions_restart_timeout"), DurationUnit.SECONDS)) : null;
                if (bVar2 != null) {
                    int i11 = Pa.b.f4973e;
                    jT = bVar2.f4974b;
                    if (jT <= 0 || Pa.b.e(jT)) {
                        cVar = sessionsSettings.f28751b.f28746d.f28760b;
                        if (cVar != null) {
                            kotlin.jvm.internal.i.m("sessionConfigs");
                            throw null;
                        }
                        num = cVar.f28767c;
                        if (num != null) {
                            int i12 = Pa.b.f4973e;
                            bVar = new Pa.b(C1787c0.t(num.intValue(), DurationUnit.SECONDS));
                        }
                        if (bVar != null) {
                            int i13 = Pa.b.f4973e;
                            jT = bVar.f4974b;
                            if (jT > 0 || Pa.b.e(jT)) {
                                int i14 = Pa.b.f4973e;
                                jT = C1787c0.t(30, DurationUnit.MINUTES);
                            }
                        } else {
                            int i15 = Pa.b.f4973e;
                            jT = C1787c0.t(30, DurationUnit.MINUTES);
                        }
                    }
                } else {
                    cVar = sessionsSettings.f28751b.f28746d.f28760b;
                    if (cVar != null) {
                        kotlin.jvm.internal.i.m("sessionConfigs");
                        throw null;
                    }
                    num = cVar.f28767c;
                    if (num != null) {
                        int i16 = Pa.b.f4973e;
                        bVar = new Pa.b(C1787c0.t(num.intValue(), DurationUnit.SECONDS));
                    }
                    if (bVar != null) {
                        int i17 = Pa.b.f4973e;
                        jT = bVar.f4974b;
                        if (jT > 0) {
                            int i18 = Pa.b.f4973e;
                            jT = C1787c0.t(30, DurationUnit.MINUTES);
                        } else {
                            int i19 = Pa.b.f4973e;
                            jT = C1787c0.t(30, DurationUnit.MINUTES);
                        }
                    } else {
                        int i110 = Pa.b.f4973e;
                        jT = C1787c0.t(30, DurationUnit.MINUTES);
                    }
                }
                if (when > (((((int) jT) & 1) != 1 || Pa.b.e(jT)) ? Pa.b.i(jT, DurationUnit.MILLISECONDS) : jT >> 1)) {
                    b();
                }
            } else {
                this.f28661a = true;
                b();
            }
            this.f28662b = msg.getWhen();
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        if (intent == null) {
            return null;
        }
        intent.getAction();
        Messenger messenger = Build.VERSION.SDK_INT >= 33 ? (Messenger) intent.getParcelableExtra("ClientCallbackMessenger", Messenger.class) : (Messenger) intent.getParcelableExtra("ClientCallbackMessenger");
        if (messenger != null) {
            Message messageObtain = Message.obtain(null, 4, 0, 0);
            messageObtain.replyTo = messenger;
            a aVar = this.f28659c;
            if (aVar != null) {
                aVar.sendMessage(messageObtain);
            }
        }
        Messenger messenger2 = this.f28660d;
        if (messenger2 != null) {
            return messenger2.getBinder();
        }
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        HandlerThread handlerThread = this.f28658b;
        handlerThread.start();
        Looper looper = handlerThread.getLooper();
        kotlin.jvm.internal.i.d(looper, "handlerThread.looper");
        this.f28659c = new a(looper);
        this.f28660d = new Messenger(this.f28659c);
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.f28658b.quit();
    }
}
