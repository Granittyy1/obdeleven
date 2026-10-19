package com.voltasit.obdeleven.presentation.history.child;

import O.e;
import X8.q;
import X8.r;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.view.MenuItem;
import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.ui.activity.MainActivity;
import com.voltasit.obdeleven.ui.activity.v;
import com.voltasit.obdeleven.ui.dialogs.C2134a0;
import com.voltasit.obdeleven.ui.module.BaseFragment;
import com.voltasit.obdeleven.utils.UserTrackingUtils;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.i;
import p220r9.B;
import p220r9.J;
import p220r9.P;
import p255u9.C2800c;
import p255u9.CallableC2799b;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements MenuItem.OnMenuItemClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32429a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BaseFragment f32430b;

    public /* synthetic */ a(BaseFragment baseFragment, int i10) {
        this.f32429a = i10;
        this.f32430b = baseFragment;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        BaseFragment baseFragment = this.f32430b;
        switch (this.f32429a) {
            case 0:
                final VehicleHistoryChildrenFragment this$0 = (VehicleHistoryChildrenFragment) baseFragment;
                i.e(this$0, "this$0");
                this$0.J();
                final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                final Handler handler = new Handler(Looper.getMainLooper());
                final b bVar = new b(this$0, 0, atomicBoolean);
                handler.postDelayed(bVar, 120000L);
                Task.callInBackground(new q(2, this$0)).continueWith(new Continuation() { // from class: com.voltasit.obdeleven.presentation.history.child.c
                    @Override // com.parse.boltsinternal.Continuation
                    public final Object then(Task task) {
                        Handler handler2 = handler;
                        b bVar2 = bVar;
                        VehicleHistoryChildrenFragment this$1 = this$0;
                        i.e(this$1, "this$0");
                        AtomicBoolean atomicBoolean2 = atomicBoolean;
                        i.e(task, "task");
                        handler2.removeCallbacks(bVar2);
                        if (this$1.y() || !atomicBoolean2.compareAndSet(false, true)) {
                            return null;
                        }
                        this$1.w();
                        if (!task.isFaulted()) {
                            this$1.startActivity((Intent) task.getResult());
                            UserTrackingUtils.c(UserTrackingUtils.Key.f34247H, 1);
                            return null;
                        }
                        e.m(task.getError());
                        int i10 = J.i(task.getError());
                        MainActivity mainActivityQ = this$1.q();
                        P.a(mainActivityQ, mainActivityQ.getString(i10));
                        return null;
                    }
                }, Task.UI_THREAD_EXECUTOR);
                break;
            default:
                p073f9.b bVar2 = (p073f9.b) baseFragment;
                C2134a0.b(bVar2.getContext(), R.string.view_chart_generating_csv);
                Context context = bVar2.getContext();
                C2800c c2800c = bVar2.f35017x;
                Object obj = B.f46402a;
                c2800c.getClass();
                Task.callInBackground(new CallableC2799b(c2800c)).onSuccess(new v(context, 3, c2800c)).continueWith(new r(5, bVar2), Task.UI_THREAD_EXECUTOR);
                break;
        }
        return true;
    }
}
