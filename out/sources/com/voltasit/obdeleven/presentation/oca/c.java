package com.voltasit.obdeleven.presentation.oca;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.parse.boltsinternal.Task;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.ui.activity.MainActivity;
import com.voltasit.obdeleven.ui.dialogs.C2137c;
import p220r9.P;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c implements View.OnClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f32685b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f32686c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f32687d;

    public /* synthetic */ c(Object obj, int i10, Object obj2) {
        this.f32685b = i10;
        this.f32686c = obj;
        this.f32687d = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f32685b) {
            case 0:
                AppFragment this$0 = (AppFragment) this.f32686c;
                kotlin.jvm.internal.i.e(this$0, "this$0");
                String video = (String) this.f32687d;
                kotlin.jvm.internal.i.e(video, "$video");
                try {
                    this$0.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(video)));
                } catch (ActivityNotFoundException unused) {
                    MainActivity mainActivityQ = this$0.q();
                    P.a(mainActivityQ, mainActivityQ.getString(R.string.common_unable_play_video));
                    return;
                }
                break;
            default:
                p097h9.j jVar = (p097h9.j) this.f32686c;
                C2137c.b(jVar.f36794a, R.string.view_manual_editor_confirm_delete, R.string.common_yes, R.string.common_no).continueWith(new com.voltasit.obdeleven.utils.bluetooth.k(jVar, 1, (p255u9.j) this.f32687d), Task.UI_THREAD_EXECUTOR);
                break;
        }
    }
}
