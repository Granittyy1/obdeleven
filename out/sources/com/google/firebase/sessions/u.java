package com.google.firebase.sessions;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import kotlinx.coroutines.B;
import kotlinx.coroutines.C2680e;

/* JADX INFO: compiled from: SessionLifecycleClient.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kotlin.coroutines.e f28777a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Messenger f28778b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedBlockingDeque<Message> f28779c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b f28780d;

    /* JADX INFO: compiled from: SessionLifecycleClient.kt */
    public static final class a extends Handler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final kotlin.coroutines.e f28781a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(kotlin.coroutines.e backgroundDispatcher) {
            super(Looper.getMainLooper());
            kotlin.jvm.internal.i.e(backgroundDispatcher, "backgroundDispatcher");
            this.f28781a = backgroundDispatcher;
        }

        @Override // android.os.Handler
        public final void handleMessage(Message msg) {
            String string;
            kotlin.jvm.internal.i.e(msg, "msg");
            if (msg.what != 3) {
                msg.toString();
                super.handleMessage(msg);
                return;
            }
            Bundle data = msg.getData();
            if (data == null || (string = data.getString("SessionUpdateExtra")) == null) {
                string = "";
            }
            C2680e.c(B.a(this.f28781a), null, null, new SessionLifecycleClient$ClientUpdateHandler$handleSessionUpdate$1(string, null), 3);
        }
    }

    /* JADX INFO: compiled from: SessionLifecycleClient.kt */
    public static final class b implements ServiceConnection {
        public b() {
        }

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            u uVar = u.this;
            uVar.f28779c.size();
            uVar.f28778b = new Messenger(iBinder);
            ArrayList arrayList = new ArrayList();
            uVar.f28779c.drainTo(arrayList);
            C2680e.c(B.a(uVar.f28777a), null, null, new SessionLifecycleClient$sendLifecycleEvents$1(uVar, arrayList, null), 3);
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
            u uVar = u.this;
            uVar.f28778b = null;
            uVar.getClass();
        }
    }

    public u(kotlin.coroutines.e backgroundDispatcher) {
        kotlin.jvm.internal.i.e(backgroundDispatcher, "backgroundDispatcher");
        this.f28777a = backgroundDispatcher;
        this.f28779c = new LinkedBlockingDeque<>(20);
        this.f28780d = new b();
    }

    public static final Message a(u uVar, List list, int i10) {
        Object obj;
        uVar.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (((Message) obj2).what == i10) {
                arrayList.add(obj2);
            }
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                long when = ((Message) next).getWhen();
                do {
                    Object next2 = it.next();
                    long when2 = ((Message) next2).getWhen();
                    if (when < when2) {
                        next = next2;
                        when = when2;
                    }
                } while (it.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        return (Message) obj;
    }

    public final void b(int i10) {
        ArrayList arrayList = new ArrayList();
        this.f28779c.drainTo(arrayList);
        Message messageObtain = Message.obtain(null, i10, 0, 0);
        kotlin.jvm.internal.i.d(messageObtain, "obtain(null, messageCode, 0, 0)");
        arrayList.add(messageObtain);
        C2680e.c(B.a(this.f28777a), null, null, new SessionLifecycleClient$sendLifecycleEvents$1(this, arrayList, null), 3);
    }
}
