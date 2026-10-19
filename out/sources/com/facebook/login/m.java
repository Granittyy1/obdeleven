package com.facebook.login;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;

/* JADX INFO: compiled from: GetTokenClient.kt */
/* JADX INFO: loaded from: classes.dex */
public final class m implements ServiceConnection {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f25151b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p165n4.n f25152c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public n f25153d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f25154e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Messenger f25155f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f25156g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f25157h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f25158i;
    public final int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f25159k;

    public m(Context context, String applicationId, String str) {
        kotlin.jvm.internal.i.e(applicationId, "applicationId");
        Context applicationContext = context.getApplicationContext();
        this.f25151b = applicationContext != null ? applicationContext : context;
        this.f25156g = 65536;
        this.f25157h = 65537;
        this.f25158i = applicationId;
        this.j = 20121101;
        this.f25159k = str;
        this.f25152c = new p165n4.n(this);
    }

    public final void a(Bundle bundle) {
        if (this.f25154e) {
            this.f25154e = false;
            n nVar = this.f25153d;
            if (nVar == null) {
                return;
            }
            o this$0 = nVar.f25160a;
            kotlin.jvm.internal.i.e(this$0, "this$0");
            LoginClient.b request = nVar.f25161b;
            kotlin.jvm.internal.i.e(request, "$request");
            m mVar = this$0.f25162d;
            if (mVar != null) {
                mVar.f25153d = null;
            }
            this$0.f25162d = null;
            s.a aVar = this$0.d().f25059f;
            if (aVar != null) {
                View view = s.this.f25172f;
                if (view == null) {
                    kotlin.jvm.internal.i.m("progressBar");
                    throw null;
                }
                view.setVisibility(8);
            }
            if (bundle != null) {
                List stringArrayList = bundle.getStringArrayList("com.facebook.platform.extra.PERMISSIONS");
                if (stringArrayList == null) {
                    stringArrayList = EmptyList.f42983b;
                }
                Set<String> set = request.f25079c;
                if (set == null) {
                    set = EmptySet.f42985b;
                }
                String string = bundle.getString("com.facebook.platform.extra.ID_TOKEN");
                if (set.contains("openid") && (string == null || string.length() == 0)) {
                    this$0.d().k();
                    return;
                }
                if (stringArrayList.containsAll(set)) {
                    String string2 = bundle.getString("com.facebook.platform.extra.USER_ID");
                    if (string2 != null && string2.length() != 0) {
                        this$0.m(request, bundle);
                        return;
                    }
                    s.a aVar2 = this$0.d().f25059f;
                    if (aVar2 != null) {
                        View view2 = s.this.f25172f;
                        if (view2 == null) {
                            kotlin.jvm.internal.i.m("progressBar");
                            throw null;
                        }
                        view2.setVisibility(0);
                    }
                    String string3 = bundle.getString("com.facebook.platform.extra.ACCESS_TOKEN");
                    if (string3 == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    p165n4.s.o(string3, new V7.c(bundle, this$0, request));
                    return;
                }
                HashSet hashSet = new HashSet();
                for (String str : set) {
                    if (!stringArrayList.contains(str)) {
                        hashSet.add(str);
                    }
                }
                if (!hashSet.isEmpty()) {
                    this$0.a("new_permissions", TextUtils.join(",", hashSet));
                }
                request.f25079c = hashSet;
            }
            this$0.d().k();
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName name, IBinder service) {
        kotlin.jvm.internal.i.e(name, "name");
        kotlin.jvm.internal.i.e(service, "service");
        this.f25155f = new Messenger(service);
        Bundle bundle = new Bundle();
        bundle.putString("com.facebook.platform.extra.APPLICATION_ID", this.f25158i);
        String str = this.f25159k;
        if (str != null) {
            bundle.putString("com.facebook.platform.extra.NONCE", str);
        }
        Message messageObtain = Message.obtain((Handler) null, this.f25156g);
        messageObtain.arg1 = this.j;
        messageObtain.setData(bundle);
        messageObtain.replyTo = new Messenger(this.f25152c);
        try {
            Messenger messenger = this.f25155f;
            if (messenger == null) {
                return;
            }
            messenger.send(messageObtain);
        } catch (RemoteException unused) {
            a(null);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName name) {
        kotlin.jvm.internal.i.e(name, "name");
        this.f25155f = null;
        try {
            this.f25151b.unbindService(this);
        } catch (IllegalArgumentException unused) {
        }
        a(null);
    }
}
