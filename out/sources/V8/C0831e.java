package V8;

import android.os.Bundle;
import com.obdeleven.service.model.UDSResult;
import com.obdeleven.service.odx.model.COMPUSCALE;
import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;
import com.voltasit.obdeleven.interfaces.DialogCallback;
import com.voltasit.obdeleven.ui.dialogs.B0;
import com.voltasit.obdeleven.utils.UserTrackingUtils;
import java.util.HashMap;

/* JADX INFO: renamed from: V8.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C0831e implements Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6778a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6779b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f6780c;

    public /* synthetic */ C0831e(Object obj, int i10, Object obj2) {
        this.f6778a = i10;
        this.f6780c = obj;
        this.f6779b = obj2;
    }

    @Override // com.parse.boltsinternal.Continuation
    public final Object then(Task task) {
        Object obj = this.f6779b;
        Object obj2 = this.f6780c;
        switch (this.f6778a) {
            case 0:
                h hVar = (h) obj2;
                hVar.getClass();
                return ((Boolean) task.getResult()).booleanValue() ? hVar.f6791r.f((String) obj) : Task.forResult(-1);
            case 1:
                B0 b10 = (B0) obj2;
                b10.getClass();
                int iIntValue = ((Integer) task.getResult()).intValue();
                if (iIntValue != 0) {
                    if (iIntValue != 36) {
                        b10.B(iIntValue);
                    } else {
                        b10.f33753w.a().continueWith(new S8.a(5, b10), Task.UI_THREAD_EXECUTOR);
                    }
                    return null;
                }
                String str = (String) obj;
                if (!b10.f33755y.contains(str)) {
                    UserTrackingUtils.c(UserTrackingUtils.Key.f34262f, 1);
                }
                Bundle bundleD = C4.v.d("last_used_login", str);
                bundleD.putBundle("key_bundle", b10.f33747A);
                b10.y();
                b10.w("SecurityAccessDialogFragment", DialogCallback.CallbackType.f31102c, bundleD);
                b10.f33751u.f1695w.setVisibility(8);
                b10.F(true);
                return null;
            default:
                ((HashMap) obj2).put((COMPUSCALE) obj, (UDSResult) task.getResult());
                return null;
        }
    }
}
