package p198q;

import android.content.ComponentName;
import android.content.Context;
import android.os.RemoteException;
import p012b.b;

/* JADX INFO: compiled from: CustomTabsClient.java */
/* JADX INFO: loaded from: classes.dex */
public final class a extends c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f45959b;

    public a(Context context) {
        this.f45959b = context;
    }

    @Override // p198q.c
    public final void a(ComponentName componentName, c.a aVar) {
        try {
            ((b) aVar.f5028a).X();
        } catch (RemoteException unused) {
        }
        this.f45959b.unbindService(this);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
