package U4;

import T4.InterfaceC0773f;
import android.content.Intent;

/* JADX INFO: renamed from: U4.u, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0812u extends AbstractDialogInterfaceOnClickListenerC0813v {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Intent f6490b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f6491c;

    public C0812u(Intent intent, InterfaceC0773f interfaceC0773f) {
        this.f6490b = intent;
        this.f6491c = interfaceC0773f;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [T4.f, java.lang.Object] */
    @Override // U4.AbstractDialogInterfaceOnClickListenerC0813v
    public final void a() {
        Intent intent = this.f6490b;
        if (intent != null) {
            this.f6491c.startActivityForResult(intent, 2);
        }
    }
}
