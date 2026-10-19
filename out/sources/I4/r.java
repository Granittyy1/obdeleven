package I4;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import androidx.compose.foundation.lazy.grid.x;
import androidx.media3.exoplayer.h0;
import com.afollestad.materialdialogs.MaterialDialog;
import com.google.android.play.core.common.PlayCoreDialogWrapperActivity;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.P;
import com.parse.boltsinternal.TaskCompletionSource;
import com.voltasit.obdeleven.Application;
import java.util.Arrays;
import java.util.Iterator;
import p078g1.v;
import p191p5.InterfaceC2755a;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r implements K4.a.InterfaceC0060a, j1.j.a, p191p5.e, p191p5.c, MaterialDialog.e, InterfaceC2755a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3889b;

    public /* synthetic */ r(Object obj) {
        this.f3889b = obj;
    }

    @Override // com.afollestad.materialdialogs.MaterialDialog.e
    public void c(MaterialDialog materialDialog) {
        p279w9.b bVar = Application.f29634b;
        P8.c.a(3, "AlertDialog", "onPositive()", Arrays.copyOf(new Object[0], 0));
        ((TaskCompletionSource) this.f3889b).setResult(Boolean.TRUE);
    }

    @Override // p191p5.c
    public void e(p191p5.g task) {
        com.voltasit.obdeleven.data.providers.j this$0 = (com.voltasit.obdeleven.data.providers.j) this.f3889b;
        kotlin.jvm.internal.i.e(this$0, "this$0");
        kotlin.jvm.internal.i.e(task, "task");
        if (task.o()) {
            p045d6.a aVar = (p045d6.a) task.k();
            Activity activity = (Activity) this$0.f30263a.d();
            this$0.f30264b.e("InAppReviewProviderImpl", "launching review flow...");
            x xVar = this$0.f30265c;
            xVar.getClass();
            if (aVar.b()) {
                p191p5.j.e(null);
                return;
            }
            Intent intent = new Intent(activity, (Class<?>) PlayCoreDialogWrapperActivity.class);
            intent.putExtra("confirmation_intent", aVar.a());
            intent.putExtra("window_flags", activity.getWindow().getDecorView().getWindowSystemUiVisibility());
            intent.putExtra("result_receiver", new p045d6.d((Handler) xVar.f10536b, new p191p5.h()));
            activity.startActivity(intent);
        }
    }

    @Override // p191p5.InterfaceC2755a
    public Object i(p191p5.g gVar) {
        boolean zO = gVar.o();
        p191p5.h hVar = (p191p5.h) this.f3889b;
        if (zO) {
            hVar.d(gVar.k());
            return null;
        }
        if (gVar.j() == null) {
            return null;
        }
        hVar.c(gVar.j());
        return null;
    }

    @Override // j1.j.a
    public void invoke(Object obj) {
        ((v.c) obj).b0(((h0) this.f3889b).f18419i.f47626d);
    }

    @Override // K4.a.InterfaceC0060a
    public Object k() {
        s sVar = (s) this.f3889b;
        Iterator<C4.t> it = sVar.f3891b.J().iterator();
        while (it.hasNext()) {
            sVar.f3892c.a(it.next(), 1);
        }
        return null;
    }

    @Override // p191p5.e
    public void onSuccess(Object obj) {
        ((FirebaseMessaging) this.f3889b).lambda$new$3((P) obj);
    }
}
