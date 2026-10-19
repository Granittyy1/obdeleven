package X5;

import android.os.Bundle;
import android.view.View;
import androidx.appcompat.widget.AppCompatCheckBox;
import com.parse.ParseUser;
import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.interfaces.DialogCallback;
import com.voltasit.obdeleven.ui.dialogs.C2134a0;
import com.voltasit.obdeleven.ui.dialogs.C2161o;
import com.voltasit.obdeleven.ui.dialogs.W;
import java.util.ArrayList;
import java.util.List;
import p121j8.d;
import p121j8.e;
import p134k8.S0;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class n implements View.OnClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f7257b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f7258c;

    public /* synthetic */ n(int i10, Object obj) {
        this.f7257b = i10;
        this.f7258c = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object obj = this.f7258c;
        switch (this.f7257b) {
            case 0:
                ((r) obj).u();
                break;
            case 1:
                C2161o c2161o = (C2161o) obj;
                String string = c2161o.f33997u.getText().toString();
                String string2 = c2161o.f33996t.getText().toString();
                Bundle bundle = new Bundle();
                bundle.putString("key_make", string2);
                bundle.putString("key_model", string);
                bundle.putParcelable("key_bundle", bundle);
                c2161o.w("editCarNameDialog", DialogCallback.CallbackType.f31102c, bundle);
                break;
            case 2:
                p073f9.b bVar = (p073f9.b) obj;
                int i10 = bVar.f35013t;
                if (i10 == 0) {
                    bVar.f35012s.set(true);
                    bVar.O();
                } else if (i10 == 2) {
                    bVar.f35005l.b();
                    bVar.U(0);
                }
                break;
            case 3:
                j9.b.a aVar = (j9.b.a) obj;
                int adapterPosition = aVar.getAdapterPosition();
                p122j9.b bVar2 = aVar.f41179c;
                int iA = bVar2.a(adapterPosition);
                boolean zIsChecked = aVar.f41178b.isChecked();
                S0 s0C = bVar2.f41174b.c(iA);
                if (s0C != null) {
                    s0C.f42671c = zIsChecked;
                    break;
                }
                break;
            default:
                final p170n9.d dVar = (p170n9.d) obj;
                if (dVar.f44999x) {
                    final String strB = dVar.f44995t.getItem(dVar.f44987l.getSelectedItemPosition()).b();
                    int i11 = 0;
                    for (AppCompatCheckBox appCompatCheckBox : dVar.f44991p) {
                        if (appCompatCheckBox.isChecked()) {
                            i11++;
                        }
                    }
                    Task taskForResult = Task.forResult(null);
                    String[] strArr = dVar.f44997v.f33706g;
                    Task taskContinueWithTask = taskForResult;
                    for (int i12 = 0; i12 < strArr.length; i12++) {
                        final long itemId = dVar.f44997v.getItemId(i12);
                        final String str = strArr[i12];
                        if (str != null && !str.isEmpty()) {
                            final int i13 = i11;
                            taskContinueWithTask = taskContinueWithTask.continueWithTask(new Continuation() { // from class: n9.c
                                @Override // com.parse.boltsinternal.Continuation
                                public final Object then(Task task) {
                                    d dVar2 = dVar;
                                    e eVar = dVar2.f44992q;
                                    int i14 = dVar2.f44993r;
                                    int i15 = dVar2.f44994s;
                                    int i16 = (int) itemId;
                                    eVar.getClass();
                                    return Task.callInBackground(new d(eVar, i14, i15, i16, strB, str, i13));
                                }
                            });
                        }
                    }
                    if (!taskContinueWithTask.isCompleted()) {
                        C2134a0.b(dVar.getContext(), R.string.common_saving);
                        taskContinueWithTask.continueWith(new X8.r(6, dVar), Task.UI_THREAD_EXECUTOR);
                    }
                } else {
                    dVar.f44999x = true;
                    int i14 = p255u9.z.f47484b;
                    List list = ((p255u9.z) ParseUser.getCurrentUser()).getList("roles");
                    if (list == null) {
                        list = new ArrayList();
                    }
                    if (list.contains("DEVELOPER")) {
                        dVar.O();
                    } else if (dVar.f44998w == null) {
                        androidx.fragment.app.y fragmentManager = dVar.getParentFragmentManager();
                        kotlin.jvm.internal.i.e(fragmentManager, "fragmentManager");
                        W w3 = new W();
                        w3.f33855s = null;
                        w3.f33856t = null;
                        w3.f32261r = fragmentManager;
                        w3.setTargetFragment(dVar, 0);
                        dVar.f44998w = w3;
                        w3.A();
                    }
                }
                break;
        }
    }
}
