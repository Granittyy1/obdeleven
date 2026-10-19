package U4;

import android.content.Intent;
import com.google.android.gms.common.api.GoogleApiActivity;

/* JADX INFO: renamed from: U4.t, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0811t extends AbstractDialogInterfaceOnClickListenerC0813v {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Intent f6488b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ GoogleApiActivity f6489c;

    public C0811t(Intent intent, GoogleApiActivity googleApiActivity) {
        this.f6488b = intent;
        this.f6489c = googleApiActivity;
    }

    @Override // U4.AbstractDialogInterfaceOnClickListenerC0813v
    public final void a() {
        Intent intent = this.f6488b;
        if (intent != null) {
            this.f6489c.startActivityForResult(intent, 2);
        }
    }
}
