package p273w2;

import android.os.Bundle;
import androidx.lifecycle.InterfaceC1376t;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.r;
import io.intercom.android.sdk.ui.preview.ui.c;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.i;
import p248u2.e;

/* JADX INFO: compiled from: SavedStateRegistryImpl.kt */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f47737a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f47738b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final I2.e f47739c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f47740d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f47741e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Bundle f47742f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f47743g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f47744h;

    public b(e owner, c cVar) {
        i.e(owner, "owner");
        this.f47737a = owner;
        this.f47738b = cVar;
        this.f47739c = new I2.e();
        this.f47740d = new LinkedHashMap();
        this.f47744h = true;
    }

    public final void a() {
        e eVar = this.f47737a;
        if (eVar.getLifecycle().b() != Lifecycle.State.f17750c) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        if (this.f47741e) {
            throw new IllegalStateException("SavedStateRegistry was already attached.");
        }
        this.f47738b.invoke();
        eVar.getLifecycle().a(new r() { // from class: w2.a
            @Override // androidx.lifecycle.r
            public final void h(InterfaceC1376t interfaceC1376t, Lifecycle.Event event) {
                Lifecycle.Event event2 = Lifecycle.Event.ON_START;
                b bVar = this.f47736b;
                if (event == event2) {
                    bVar.f47744h = true;
                } else if (event == Lifecycle.Event.ON_STOP) {
                    bVar.f47744h = false;
                }
            }
        });
        this.f47741e = true;
    }
}
