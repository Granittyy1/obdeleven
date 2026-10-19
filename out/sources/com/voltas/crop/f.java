package com.voltas.crop;

import android.app.Activity;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: MonitoredActivity.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class f extends Activity {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList<b> f29633b = new ArrayList<>();

    /* JADX INFO: compiled from: MonitoredActivity.java */
    public static class a implements b {
    }

    /* JADX INFO: compiled from: MonitoredActivity.java */
    public interface b {
        void a();

        void b();

        void c();
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Iterator<b> it = this.f29633b.iterator();
        while (it.hasNext()) {
            it.next().getClass();
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        Iterator<b> it = this.f29633b.iterator();
        while (it.hasNext()) {
            it.next().b();
        }
    }

    @Override // android.app.Activity
    public final void onStart() {
        super.onStart();
        Iterator<b> it = this.f29633b.iterator();
        while (it.hasNext()) {
            it.next().c();
        }
    }

    @Override // android.app.Activity
    public final void onStop() {
        super.onStop();
        Iterator<b> it = this.f29633b.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }
}
