package p033c7;

import S6.a;
import com.afollestad.materialdialogs.DialogAction;
import com.afollestad.materialdialogs.MaterialDialog;
import com.afollestad.materialdialogs.internal.MDButton;
import com.google.firebase.inappmessaging.FirebaseInAppMessagingDisplayCallbacks;
import com.google.firebase.inappmessaging.RenderErrorReason;
import com.voltasit.obdeleven.models.HistoryTypeFilter;
import com.voltasit.obdeleven.presentation.history.HistoryAdapter;
import java.util.Iterator;
import p083g7.h;
import p147l9.b;
import p191p5.e;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class L implements e, MaterialDialog.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f22383b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f22384c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f22385d;

    public /* synthetic */ L(Object obj, Object obj2, Object obj3) {
        this.f22383b = obj;
        this.f22384c = obj2;
        this.f22385d = obj3;
    }

    @Override // com.afollestad.materialdialogs.MaterialDialog.e
    public void c(MaterialDialog materialDialog) {
        HistoryAdapter historyAdapter = (HistoryAdapter) this.f22383b;
        historyAdapter.getClass();
        MDButton mDButtonC = materialDialog.c(DialogAction.f23185c);
        String string = mDButtonC.getText().toString();
        String str = (String) this.f22384c;
        boolean zEquals = string.equals(str);
        b bVar = historyAdapter.f32394h;
        if (zEquals) {
            Iterator it = bVar.f44469b.iterator();
            while (it.hasNext()) {
                ((HistoryTypeFilter) it.next()).i(true);
            }
            bVar.notifyDataSetChanged();
            mDButtonC.setText((String) this.f22385d);
            return;
        }
        Iterator it2 = bVar.f44469b.iterator();
        while (it2.hasNext()) {
            ((HistoryTypeFilter) it2.next()).i(false);
        }
        bVar.notifyDataSetChanged();
        mDButtonC.setText(str);
    }

    @Override // p191p5.e
    public void onSuccess(Object obj) {
        O o10 = (O) this.f22383b;
        o10.getClass();
        RenderErrorReason renderErrorReason = (RenderErrorReason) O.f22391h.get((FirebaseInAppMessagingDisplayCallbacks.InAppMessagingErrorReason) this.f22385d);
        a.C0079a c0079aA = o10.a((h) this.f22384c, (String) obj);
        c0079aA.r();
        a.K((a) c0079aA.f29047c, renderErrorReason);
        o10.f22393a.a(c0079aA.p().n());
    }
}
